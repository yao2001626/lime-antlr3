parser grammar LimeParser;

options {
    	output    = AST;
	ASTLabelType = LimeAST;
	tokenVocab = LimeLexer;
}

tokens {
  	FILE; CLASS; MEMBERS; INHERIT; ATTR; INIT; METHOD; ACTION; ARG; ARGS;
  	BLOCK; VAR; ASSIGN; EXPR; RETURN; IF; WHILE; CALL; DOT; ELIST; 
}

@header {
    	package lime.antlr3;
}


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
	:	Attr type ID-> ^(ATTR type ID )
	;
	
init
	:	Initialization OParen parameterlist? CParen block ->^(INIT parameterlist? block)
	;
	
methodDeclaration
	:	Method ID OParen parameterlist? CParen type (When expression Do)? block 
	-> ^(METHOD ID parameterlist? type expression? block )
	;
	
actionDeclaration
	:	Action ID (When expression Do)? block -> ^(ACTION ID expression? block)
	;
	
parameterlist
    	:	parameterdecl (Comma parameterdecl)* -> ^(ARGS parameterdecl+)
    	;
	
parameterdecl
	:	type ID -> ^(ARG type ID)
	;
	
type
	:	Inttype
    	|	Voidtype
    	|	ID // class type name
    	;
	
block
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
	
primary
    	:  	This
    	|  	Super
    	|  	ID
    	|  	INT
    	|  	OParen expression CParen -> expression
    	;
