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
		-> file(decls={$d})
	;
	
classdeclaration
	: ^(CLASS c=ID (^(INHERIT ID))? ^( MEMBERS m+=classMember+ ))
		-> classdeclaration(sym={$c.symbol}, member={$m} )
	;
classMember
	:	attrDeclaration->{$attrDeclaration.st}
	|	methodDeclaration->{$methodDeclaration.st}
	;
attrDeclaration
	: ^(ATTR  ID  t=type)
		->attrdecl(id={$ID.text}, type= {$t.text})
	;

methodDeclaration
	:	^(METHOD ID (^(ARGS_DECL p+=parameterdecl+))? type expr? block)
		->method(sym={$ID.symbol}, args={$p}, block={$block.st})
	;
	
parameterdecl
	//@after { System.out.println("arg: "+$st); }
	:^(ARG_DECL  type ID)
		-> defarg(id={$ID.text}, type={$type.text})
	;
	
type
	:	Inttype
    |	Voidtype
    ;
	
block
    :  ^(BLOCK s+=statement*)
		-> block(stats={$s})
	;
	
statement
//@after {$st.setAttribute("descr", $text.replaceAll("\\n"," "));}
	:	block
	|	^(ASSIGN ID expr) -> assign(id={$ID.text}, rhs={$expr.st})
	|	call -> {$call.st}
	|	^(RETURN expr) -> return(v={$expr.st})
	|	^(IF expr s1=statement s2=statement?)
		-> if(cond={$expr.st}, stat1={$s1.st}, stat2={$s2.st}, tmp={getreg()})
	|	^(WHILE expr s=statement)
		-> while(cond={$expr.st}, stat={$s.st}, tmp={getreg()})
	;
	
expr returns [Type typ]
@after {
//System.out.println("expr: "+$st);
}
	:	^( (Equals|Add|Subtract|LT) a=expr b=expr)
		-> bop(reg={getreg()}, op={$start.token}, a={$a.st}, b={$b.st})
	|	call -> {$call.st}
	|	primary {$typ=$primary.typ;}
						   -> {$primary.st}
	;

call
	:	^(CALL ID ( ^(ELIST e+=expr+) )?)
		-> call(reg={getreg()}, sym={$ID.symbol}, args={$e})
	;
	
primary returns [Type typ]
@init {
System.out.println("primary\n");
}
	: ID {
			$typ = (Type)symtab.globals.resolve("int");
			//$typ = (Type)symtab.resolveID($ID.symbol.def);
			System.out.println("ID.symbol.type: "+$typ);
	}
				-> loadvar(reg={getreg()}, id={$ID})
	| INT {
			$typ = (Type)symtab.globals.resolve("int");
			System.out.println("ID.symbol.type: "+$typ);
			}
				-> int(reg={getreg()}, v={$INT.text})
	;

