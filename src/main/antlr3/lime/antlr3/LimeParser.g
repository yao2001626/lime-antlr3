parser grammar LimeParser;

options {
<<<<<<< HEAD
    output= AST;
=======
    	output    = AST;
>>>>>>> origin/master
	ASTLabelType = LimeAST;
	tokenVocab = LimeLexer;
}

tokens {
<<<<<<< HEAD
  FILE; CLASS; MEMBERS; INHERIT; ATTR; VAR; INIT; METHOD; ACTION; ARG; ARGS;
  BLOCK; VAR_DECL; ASSIGN; EXPR; RETURN; IF; WHILE; CALL; DOT; ELIST; 
=======
  	FILE; CLASS; MEMBERS; INHERIT; ATTR; INIT; METHOD; ACTION; ARG; ARGS;
  	BLOCK; VAR; ASSIGN; EXPR; RETURN; IF; WHILE; CALL; DOT; ELIST; 
>>>>>>> origin/master
}

@header {
    	package lime.antlr3;
}

<<<<<<< HEAD
=======

>>>>>>> origin/master
compilationUnit
    	:	( classDefinition )+ EOF -> ^(FILE classDefinition+ )
	;
	
classDefinition
	:	Class ID superClass? OBrace classMember+ CBrace  
		-> ^(CLASS ID superClass? ^( MEMBERS classMember+ ) )
	;
	
superClass
	:	Inherit ID -> ^(INHERIT ID)
	;

classMember
	:	attrDeclaration
	|	init
	|	methodDeclaration
	|	actionDeclaration
	;
	
attrDeclaration
<<<<<<< HEAD
	:	Attr type declarator[$type.tree]-> ^(ATTR {$declarator.id} declarator )
=======
	:	Attr type ID-> ^(ATTR type ID )
>>>>>>> origin/master
	;
	
init
	:	Initialization OParen parameter_list? CParen block ->^(INIT parameter_list? block)
	;
	
methodDeclaration
	:	Method ID OParen parameter_list? CParen type (When expression Do)? block 
	-> ^(METHOD ID parameter_list? type expression? block )
	;
	
actionDeclaration
	:	Action ID (When expression Do)? block -> ^(ACTION ID expression? block)
	;
	
<<<<<<< HEAD
=======
parameterlist
    	:	parameterdecl (Comma parameterdecl)* -> ^(ARGS parameterdecl+)
    	;
	
parameterdecl
	:	type ID -> ^(ARG type ID)
	;
	
>>>>>>> origin/master
type
	:	Inttype
    	|	Voidtype
    	|	ID // class type name
    	;
	
block
<<<<<<< HEAD
    :   OBrace statement* CBrace -> ^(BLOCK statement*)
    ;
declaration
	:	type declarator[$type.tree]
		-> ^(VAR {$declarator.id} declarator)
	;

declarator[LimeAST typeAST] returns [CommonTree id]
	:	ID {$id=new LimeAST($ID);}
			-> {$typeAST}
	;

parameter_list
	:	parameter_declaration (Comma parameter_declaration)*
		-> ^(ARGS parameter_declaration+)
	;

parameter_declaration
	:	type declarator[$type.tree]
			-> ^(ARG {$declarator.id} declarator)
	;

statement
options {backtrack=true;}
    :   block
    |	declaration
    |   postfixExpression // handles function calls like f(i);
        (   Assign expression -> ^(ASSIGN postfixExpression expression)
        |   -> ^(EXPR postfixExpression)
        )
        SColon 
    |	Return expression? SColon -> ^(RETURN expression?) 
=======
    	:   OBrace statement* CBrace -> ^(BLOCK statement*)
    	;
	
varDeclaration
    	:   type ID (Assign expression)? SColon -> ^(VAR type ID expression?)
    	;

statement
	options {backtrack=true;}
    	:   	block
    	|	varDeclaration
    	|   	postfixExpression // handles function calls like f(i);
        	(   Assign expression -> ^(ASSIGN postfixExpression expression)
        		|   -> ^(EXPR postfixExpression)
        	)
        	SColon 
    	|	Return expression? SColon -> ^(RETURN expression?) 
>>>>>>> origin/master
	|	If OParen expressionRoot CParen s1=statement (Else s2=statement)? -> ^(IF expressionRoot $s1 $s2?)
	|	While OParen expressionRoot CParen statement -> ^(WHILE expressionRoot statement)
    ;
	
assignment_expression
	: 	postfixExpression (Assign^ expressionRoot)?
	;

expressionRoot
	:	expression -> ^(EXPR expression)
	;
	
expression
	:	conditional_expression 
	;

conditional_expression
	:	relational_expression (( Equals | NEquals )^ relational_expression)?
	;

relational_expression
    	:	additive_expression (( LT | GT | GTEquals | LTEquals )^ additive_expression)*
    	;

additive_expression
	:	multiplicative_expression (( Add | Subtract )^ multiplicative_expression)*
	;

multiplicative_expression
	:	postfixExpression (( Multiply | Divide )^ postfixExpression)*
	;

postfixExpression
    :   (primary -> primary)
    	(	options {backtrack=true;}
		:	Dot ID OParen expressionList CParen 	-> ^(CALL ^(DOT $postfixExpression ID) expressionList)
		|	Dot ID					-> ^(DOT $postfixExpression ID)
		|	OParen expressionList CParen        	-> ^(CALL $postfixExpression expressionList)
		)*
    ;
// END: call
	
expressionList
	:   	expression (Comma expression)* -> ^(ELIST expression+)
	;
	
<<<<<<< HEAD
primary 
    :   This
    |	Super
    |	ID 
    |   INT
    |   OParen expression CParen -> expression
    ;
=======
primary
    	:  	This
    	|  	Super
    	|  	ID
    	|  	INT
    	|  	OParen expression CParen -> expression
    	;
>>>>>>> origin/master
