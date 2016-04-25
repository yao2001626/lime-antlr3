// This is a sample lexer generated by the ANTLR3 Maven Archetype
// generator. It shows how to use a superclass to implement
// support methods and variables you may use in the lexer actions
// rather than create a messy lexer that has the Java code embedded
// in it.
//

lexer grammar LimeLexer;

options {
   language=Java;  // Default
}

@header {
    package lime.antlr3;
}

Assert   		: 'assert';
Class    		: 'class';

Action   		: 'action';
Inherit  		: 'inherit';
End      		: 'end';
Attr			: 'attr ';
Initialization	: 'init';
Method   		: 'method';
New      		: 'new';
When     		: 'when';
Do             	: 'do';
Begin    		: 'begin';
If       		: 'if';
Else     		: 'else';
Then     		: 'then';
While    		: 'while';
Return   		: 'return';
Var      		: 'var ';
Null    		: 'nil';
Booltype		: 'bool';
Inttype			: 'int';
Voidtype		: 'void';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';
Dot		 : '.';
This 	 : 'this';
Super	 : 'super';

	
Bool
	: 'true' 
	| 'false'
	;

ID
	:LETTER (LETTER|'0'..'9')*
	;
	
fragment
LETTER
	:	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

INT : '0'..'9'+ ;

STRING: '"' .* '"' {setText(getText().substring(1, getText().length()-1));} ;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
