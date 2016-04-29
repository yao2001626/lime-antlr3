parser grammar LimeParser;

options {
    output    = AST;
	ASTLabelType = LimeAST;
	tokenVocab = LimeLexer;
}

tokens {
  FILE; CLASS; MEMBERS; INHERIT; ATTR_DECL; INIT; METHOD; ACTION; ARG_DECL; ARGS_DECL;
  BLOCK; VAR_DECL; ASSIGN; EXPR; RETURN; IF; WHILE; CALL; DOT; ELIST; 
}

@header {

    package lime.antlr3;
}

// This is just a simple parser for demo purpose
//
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
	:	Attr type ID-> ^(ATTR_DECL type ID )
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
    :	parameterdecl (Comma parameterdecl)* -> ^(ARGS_DECL parameterdecl+)
    ;
	
parameterdecl
	:	type ID -> ^(ARG_DECL type ID)
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
    :   type ID (Assign expression)? SColon -> ^(VAR_DECL type ID expression?)
    ;

statement
options {backtrack=true;}
    :   block
    |	varDeclaration
    |   postfixExpression // handles function calls like f(i);
        (   Assign expression -> ^(ASSIGN postfixExpression expression)
        |   -> ^(EXPR postfixExpression)
        )
        SColon 
    |	Return expression? SColon -> ^(RETURN expression?) 
	|	If OParen expressionRoot CParen s1=statement (Else s2=statement)? -> ^(IF expressionRoot $s1 $s2?)
	|	While OParen expressionRoot CParen statement -> ^(WHILE expressionRoot statement)
    ;
	
assignment_expression
	: postfixExpression (Assign^ expressionRoot)?
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
    :   (primary->primary)
    	(	options {backtrack=true;}
		:	Dot ID OParen expressionList CParen -> ^(CALL ^(DOT $postfixExpression ID) expressionList)
		|	Dot ID						  -> ^(DOT $postfixExpression ID)
		|	OParen expressionList CParen        -> ^(CALL $postfixExpression expressionList)
		)*
    ;
// END: call

suffix[CommonTree expr]
options {backtrack=true;}
	:	Dot ID OParen expressionList CParen -> ^(CALL ^(DOT {$expr} ID))
	|	Dot ID						  -> ^(DOT {$expr} ID)
	|	OParen expressionList CParen        -> ^(CALL {$expr})
	;
	
expressionList
	:   expression (Comma expression)* -> ^(ELIST expression+)
	;
	
primary
    :   This
    |	Super
    |	ID
    |   INT
    |   OParen expression CParen -> expression
    ;
