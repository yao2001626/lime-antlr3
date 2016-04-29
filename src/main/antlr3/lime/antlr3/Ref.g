tree grammar Ref;
options {
  tokenVocab = LimeParser;
  ASTLabelType = LimeAST;
  filter = true;
}
@members {
    SymbolTable symtab;
    public Ref(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
    }  
}

@header {
    package lime.antlr3;
}
// END: header

/** topdown because we want to reference symbols in order. Don't need
 *  bottomup pattern matching; we're not computing current scope.
 */
topdown
    :   enterMethod
    |   enterClass
    |   varDeclaration
    |   assignment
    |   resolveExpr
    ;
	
// S C O P E S


// START: class
enterClass
	:   ^('class' name=ID (^(EXTENDS sup=ID))? ^(MEMBERS .*))
		{
		if ( $sup!=null ) {
			// look up superclass (if any)
			$sup.symbol = $sup.scope.resolve($sup.text);
			((ClassSymbol)$name.symbol).superClass =
				(ClassSymbol)$sup.symbol;                // set superclass
			System.out.println("line "+$name.getLine()+": set "+$name.text+
				" super to "+((ClassSymbol)$name.symbol).superClass.name);
		}
		else {
			System.out.println("line "+$name.getLine()+": set "+$name.text);
		}
		}
	;
// END: class

enterMethod
	:   ^(METHOD_DECL type ID .*) // match method subtree with 0-or-more args
		{
		$ID.symbol.type = $type.tsym; // set return type of method
		System.out.println("line "+$ID.getLine()+": set method type "+$ID.symbol);
		}
	;
	
	
varDeclaration // global, parameter, or local variable
	:   ^((ATTR_DECL|VAR_DECL|ARG_DECL) type ID )
		{
		$ID.symbol.type = $type.tsym; // set return type of variable
		System.out.println("line "+$ID.getLine()+": set var type "+$ID.symbol);
		}
	;
	
type returns [Type tsym]
@init {
	// get scope from AST; use to resolve type name and save it in AST
	$start.symbol = $start.scope.resolve($start.getText());
	$tsym = (Type)$start.symbol; // return Type from this rule
}
	:  Inttype
	|  Voidtype
	|	ID
	;
	
assignment  : ^( '=' expr expr ) ;
resolveExpr : ^( EXPR expr ) ;

expr returns [Type type]
    :   member {$type = $member.type;} // E.g., "a.b"
    |   ^(CALL expr)
    |   ^(Add expr expr)
    |   id     {$type = $id.type;}     // E.g., "a", "this"
    |   INT
    ;
	
id returns [Type type]
	:   ID
	{
		// do usual resolve(ID) then check for illegal forward references
		$ID.symbol = SymbolTable.resolveID($ID);
		if ( $ID.symbol!=null ) $type = $ID.symbol.type;
	}
	|   t='this'  {$type = SymbolTable.getEnclosingClass($t.scope);}
	;
member returns [Type type]
	:   ^(Dot m=expr ID) // E.g., "a", "a.b", "a.b.c", ...
		{
			ClassSymbol scope = (ClassSymbol)$m.type;
			Symbol s = scope.resolveMember($ID.text);
			$ID.symbol = s;
			System.out.println("line "+$ID.getLine()+ ": resolve "+$m.text+"."+$ID.text+" to "+s);
			if ( s!=null ) $type = s.type;
		}
	;
// END: field