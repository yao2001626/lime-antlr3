tree grammar DefRef;
options {
  tokenVocab = LimeParser;
  ASTLabelType = LimeAST;
  filter = true;
}
@members {
    SymbolTable symtab;
    Scope currentScope;
    public DefRef(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
        currentScope = symtab.globals;
    }
}

@header {

    package lime.antlr3;
}


topdown
    :   enterBlock
    |   enterFunction
    |   varDeclaration
    ;

bottomup
    :   exitBlock
    |   exitFunction
    |   idref
    |	call
    ;

// S C O P E S

enterBlock
    :   BLOCK {currentScope = new LocalScope(currentScope);}// push scope
    ;
exitBlock
    :   BLOCK
        {
         System.out.println("locals: "+currentScope);
        currentScope = currentScope.getEnclosingScope();    // pop scope
        }
    ;

enterFunction // match method subtree with 0-or-more args
    :   ^(METHOD ID type_tree .*) 
        {
        System.out.println("line "+$ID.getLine()+": def method "+$ID.text);
        Type retType = $type_tree.type; // rule type returns a Type symbol
		MethodSymbol fs = new MethodSymbol($ID.text,$type_tree.type,currentScope);
		$ID.symbol = fs;
        currentScope.define(fs); // def method in globals
        currentScope = fs;       // set current scope to method scope
        }
    ;
exitFunction
    :   METHOD
        {
         System.out.println("args: "+currentScope);
        currentScope = currentScope.getEnclosingScope();// pop arg scope
        }
    ;

type_tree returns [Type type]
	:	type_specifier 				{$type = $type_specifier.type;}
	;
	
type_specifier returns [Type type]
@init { $type = (Type)currentScope.resolve($start.getText()); }
	: Voidtype
	| Inttype
	;

// D e f i n e  s y m b o l s

varDeclaration // global, parameter, or local variable
    :   ^((VAR|ATTR|ARG)   ID type_tree ) 
        {
        System.out.println("line "+$ID.getLine()+": def "+$ID.text+" type "+$type_tree.type);
        VariableSymbol vs = new VariableSymbol($ID.text,$type_tree.type);
        currentScope.define(vs);
        $ID.symbol = vs;
        }
    ;

// R e s o l v e  I D s

call:   ^(CALL ID .)
        {
        Symbol s = currentScope.resolve($ID.text);
        $ID.symbol = s;
        // System.out.println("line "+$ID.getLine()+": call "+s);
        }
	;
	
idref
    :   {$start.hasAncestor(EXPR) || $start.hasAncestor(ASSIGN) ||
    	 $start.hasAncestor(ELIST)}? ID // only match IDs in expressions
        {
        Symbol s = currentScope.resolve($ID.text);
        $ID.symbol = s;
        // System.out.println("line "+$ID.getLine()+": ref "+s);
        }
    ;
