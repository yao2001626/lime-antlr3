tree grammar Gen;

options {
    tokenVocab=LimeParser;
    ASTLabelType=LimeAST;
    output=template;
}

@header {
    package lime.antlr3;
}

@members {
    SymbolTable symtab;
    Scope currentScope;
    public Gen(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
        currentScope = symtab.globals;
    }

    int reg = 1;
    public int getreg() { return reg++; }

    List<LimeString> strings = new ArrayList<LimeString>();
    public int getstr(String s) {
    	strings.add(new LimeString(s));
    	return strings.size();
    }
}

translationunit
	:	^(FILE d+=classdeclaration+) 
		-> file(decls={$d}, strings={strings})
	;
	
classdeclaration
	: ^(CLASS c=ID (^(INHERIT ID))? ^( MEMBERS m+=classMember+ ))
		-> classdeclaration(sym={$c.symbol}, member={$m} )
	;
classMember
	:	attrDeclaration->{$attrDeclaration.st}
	|	init->{$init.st}
	|	methodDeclaration->{$methodDeclaration.st}
	|	actionDeclaration->{$actionDeclaration.st}
	;
attrDeclaration
	: ^(ATTR_DECL type=. ID )
		->attrdecl(sym={$ID.symbol})
	;
init
	:	^(INIT .*)
		->init()
	;
methodDeclaration
	:	^(METHOD ID .* )
		->method(sym={$ID.symbol})
	;
actionDeclaration
	: 	^(ACTION ID .*)
		->action(sym={$ID.symbol})
	;
	
