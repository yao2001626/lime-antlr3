// $ANTLR 3.4 lime\\antlr3\\LimeLexer.g 2016-04-24 23:52:39

    package lime.antlr3;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LimeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int Action=4;
    public static final int Add=5;
    public static final int And=6;
    public static final int Assert=7;
    public static final int Assign=8;
    public static final int Attr=9;
    public static final int Begin=10;
    public static final int Bool=11;
    public static final int Booltype=12;
    public static final int CBrace=13;
    public static final int CBracket=14;
    public static final int COMMENT=15;
    public static final int CParen=16;
    public static final int Class=17;
    public static final int Colon=18;
    public static final int Comma=19;
    public static final int Divide=20;
    public static final int Do=21;
    public static final int Dot=22;
    public static final int Else=23;
    public static final int End=24;
    public static final int Equals=25;
    public static final int Excl=26;
    public static final int GT=27;
    public static final int GTEquals=28;
    public static final int ID=29;
    public static final int INT=30;
    public static final int If=31;
    public static final int Inherit=32;
    public static final int Initialization=33;
    public static final int Inttype=34;
    public static final int LETTER=35;
    public static final int LINE_COMMENT=36;
    public static final int LT=37;
    public static final int LTEquals=38;
    public static final int Method=39;
    public static final int Modulus=40;
    public static final int Multiply=41;
    public static final int NEquals=42;
    public static final int New=43;
    public static final int Null=44;
    public static final int OBrace=45;
    public static final int OBracket=46;
    public static final int OParen=47;
    public static final int Or=48;
    public static final int Pow=49;
    public static final int QMark=50;
    public static final int Return=51;
    public static final int SColon=52;
    public static final int STRING=53;
    public static final int Subtract=54;
    public static final int Super=55;
    public static final int Then=56;
    public static final int This=57;
    public static final int Var=58;
    public static final int Voidtype=59;
    public static final int WS=60;
    public static final int When=61;
    public static final int While=62;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LimeLexer() {} 
    public LimeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LimeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "lime\\antlr3\\LimeLexer.g"; }

    // $ANTLR start "Assert"
    public final void mAssert() throws RecognitionException {
        try {
            int _type = Assert;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:18:12: ( 'assert' )
            // lime\\antlr3\\LimeLexer.g:18:14: 'assert'
            {
            match("assert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Assert"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:19:12: ( 'class' )
            // lime\\antlr3\\LimeLexer.g:19:14: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:21:12: ( 'action' )
            // lime\\antlr3\\LimeLexer.g:21:14: 'action'
            {
            match("action"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Inherit"
    public final void mInherit() throws RecognitionException {
        try {
            int _type = Inherit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:22:12: ( 'inherit' )
            // lime\\antlr3\\LimeLexer.g:22:14: 'inherit'
            {
            match("inherit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Inherit"

    // $ANTLR start "End"
    public final void mEnd() throws RecognitionException {
        try {
            int _type = End;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:23:12: ( 'end' )
            // lime\\antlr3\\LimeLexer.g:23:14: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "End"

    // $ANTLR start "Attr"
    public final void mAttr() throws RecognitionException {
        try {
            int _type = Attr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:24:8: ( 'attr ' )
            // lime\\antlr3\\LimeLexer.g:24:10: 'attr '
            {
            match("attr "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Attr"

    // $ANTLR start "Initialization"
    public final void mInitialization() throws RecognitionException {
        try {
            int _type = Initialization;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:25:16: ( 'init' )
            // lime\\antlr3\\LimeLexer.g:25:18: 'init'
            {
            match("init"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Initialization"

    // $ANTLR start "Method"
    public final void mMethod() throws RecognitionException {
        try {
            int _type = Method;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:26:12: ( 'method' )
            // lime\\antlr3\\LimeLexer.g:26:14: 'method'
            {
            match("method"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Method"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:27:12: ( 'new' )
            // lime\\antlr3\\LimeLexer.g:27:14: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:28:12: ( 'when' )
            // lime\\antlr3\\LimeLexer.g:28:14: 'when'
            {
            match("when"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:29:17: ( 'do' )
            // lime\\antlr3\\LimeLexer.g:29:19: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "Begin"
    public final void mBegin() throws RecognitionException {
        try {
            int _type = Begin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:30:12: ( 'begin' )
            // lime\\antlr3\\LimeLexer.g:30:14: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Begin"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:31:12: ( 'if' )
            // lime\\antlr3\\LimeLexer.g:31:14: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:32:12: ( 'else' )
            // lime\\antlr3\\LimeLexer.g:32:14: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:33:12: ( 'then' )
            // lime\\antlr3\\LimeLexer.g:33:14: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:34:12: ( 'while' )
            // lime\\antlr3\\LimeLexer.g:34:14: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:35:12: ( 'return' )
            // lime\\antlr3\\LimeLexer.g:35:14: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:36:12: ( 'var ' )
            // lime\\antlr3\\LimeLexer.g:36:14: 'var '
            {
            match("var "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:37:11: ( 'nil' )
            // lime\\antlr3\\LimeLexer.g:37:13: 'nil'
            {
            match("nil"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "Booltype"
    public final void mBooltype() throws RecognitionException {
        try {
            int _type = Booltype;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:38:11: ( 'bool' )
            // lime\\antlr3\\LimeLexer.g:38:13: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Booltype"

    // $ANTLR start "Inttype"
    public final void mInttype() throws RecognitionException {
        try {
            int _type = Inttype;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:39:11: ( 'int' )
            // lime\\antlr3\\LimeLexer.g:39:13: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Inttype"

    // $ANTLR start "Voidtype"
    public final void mVoidtype() throws RecognitionException {
        try {
            int _type = Voidtype;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:40:11: ( 'void' )
            // lime\\antlr3\\LimeLexer.g:40:13: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Voidtype"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:42:10: ( '||' )
            // lime\\antlr3\\LimeLexer.g:42:12: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:43:10: ( '&&' )
            // lime\\antlr3\\LimeLexer.g:43:12: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:44:10: ( '==' )
            // lime\\antlr3\\LimeLexer.g:44:12: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "NEquals"
    public final void mNEquals() throws RecognitionException {
        try {
            int _type = NEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:45:10: ( '!=' )
            // lime\\antlr3\\LimeLexer.g:45:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEquals"

    // $ANTLR start "GTEquals"
    public final void mGTEquals() throws RecognitionException {
        try {
            int _type = GTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:46:10: ( '>=' )
            // lime\\antlr3\\LimeLexer.g:46:12: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTEquals"

    // $ANTLR start "LTEquals"
    public final void mLTEquals() throws RecognitionException {
        try {
            int _type = LTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:47:10: ( '<=' )
            // lime\\antlr3\\LimeLexer.g:47:12: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTEquals"

    // $ANTLR start "Pow"
    public final void mPow() throws RecognitionException {
        try {
            int _type = Pow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:48:10: ( '^' )
            // lime\\antlr3\\LimeLexer.g:48:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pow"

    // $ANTLR start "Excl"
    public final void mExcl() throws RecognitionException {
        try {
            int _type = Excl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:49:10: ( '!' )
            // lime\\antlr3\\LimeLexer.g:49:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Excl"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:50:10: ( '>' )
            // lime\\antlr3\\LimeLexer.g:50:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:51:10: ( '<' )
            // lime\\antlr3\\LimeLexer.g:51:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "Add"
    public final void mAdd() throws RecognitionException {
        try {
            int _type = Add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:52:10: ( '+' )
            // lime\\antlr3\\LimeLexer.g:52:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Add"

    // $ANTLR start "Subtract"
    public final void mSubtract() throws RecognitionException {
        try {
            int _type = Subtract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:53:10: ( '-' )
            // lime\\antlr3\\LimeLexer.g:53:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Subtract"

    // $ANTLR start "Multiply"
    public final void mMultiply() throws RecognitionException {
        try {
            int _type = Multiply;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:54:10: ( '*' )
            // lime\\antlr3\\LimeLexer.g:54:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Multiply"

    // $ANTLR start "Divide"
    public final void mDivide() throws RecognitionException {
        try {
            int _type = Divide;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:55:10: ( '/' )
            // lime\\antlr3\\LimeLexer.g:55:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Divide"

    // $ANTLR start "Modulus"
    public final void mModulus() throws RecognitionException {
        try {
            int _type = Modulus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:56:10: ( '%' )
            // lime\\antlr3\\LimeLexer.g:56:12: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Modulus"

    // $ANTLR start "OBrace"
    public final void mOBrace() throws RecognitionException {
        try {
            int _type = OBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:57:10: ( '{' )
            // lime\\antlr3\\LimeLexer.g:57:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OBrace"

    // $ANTLR start "CBrace"
    public final void mCBrace() throws RecognitionException {
        try {
            int _type = CBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:58:10: ( '}' )
            // lime\\antlr3\\LimeLexer.g:58:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CBrace"

    // $ANTLR start "OBracket"
    public final void mOBracket() throws RecognitionException {
        try {
            int _type = OBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:59:10: ( '[' )
            // lime\\antlr3\\LimeLexer.g:59:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OBracket"

    // $ANTLR start "CBracket"
    public final void mCBracket() throws RecognitionException {
        try {
            int _type = CBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:60:10: ( ']' )
            // lime\\antlr3\\LimeLexer.g:60:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CBracket"

    // $ANTLR start "OParen"
    public final void mOParen() throws RecognitionException {
        try {
            int _type = OParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:61:10: ( '(' )
            // lime\\antlr3\\LimeLexer.g:61:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OParen"

    // $ANTLR start "CParen"
    public final void mCParen() throws RecognitionException {
        try {
            int _type = CParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:62:10: ( ')' )
            // lime\\antlr3\\LimeLexer.g:62:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CParen"

    // $ANTLR start "SColon"
    public final void mSColon() throws RecognitionException {
        try {
            int _type = SColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:63:10: ( ';' )
            // lime\\antlr3\\LimeLexer.g:63:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SColon"

    // $ANTLR start "Assign"
    public final void mAssign() throws RecognitionException {
        try {
            int _type = Assign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:64:10: ( '=' )
            // lime\\antlr3\\LimeLexer.g:64:12: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Assign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:65:10: ( ',' )
            // lime\\antlr3\\LimeLexer.g:65:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "QMark"
    public final void mQMark() throws RecognitionException {
        try {
            int _type = QMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:66:10: ( '?' )
            // lime\\antlr3\\LimeLexer.g:66:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QMark"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:67:10: ( ':' )
            // lime\\antlr3\\LimeLexer.g:67:12: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:68:7: ( '.' )
            // lime\\antlr3\\LimeLexer.g:68:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "This"
    public final void mThis() throws RecognitionException {
        try {
            int _type = This;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:69:8: ( 'this' )
            // lime\\antlr3\\LimeLexer.g:69:10: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "This"

    // $ANTLR start "Super"
    public final void mSuper() throws RecognitionException {
        try {
            int _type = Super;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:70:8: ( 'super' )
            // lime\\antlr3\\LimeLexer.g:70:10: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Super"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:74:2: ( 'true' | 'false' )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // lime\\antlr3\\LimeLexer.g:74:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // lime\\antlr3\\LimeLexer.g:75:4: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:79:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // lime\\antlr3\\LimeLexer.g:79:3: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 


            // lime\\antlr3\\LimeLexer.g:79:10: ( LETTER | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // lime\\antlr3\\LimeLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // lime\\antlr3\\LimeLexer.g:84:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // lime\\antlr3\\LimeLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:89:5: ( ( '0' .. '9' )+ )
            // lime\\antlr3\\LimeLexer.g:89:7: ( '0' .. '9' )+
            {
            // lime\\antlr3\\LimeLexer.g:89:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // lime\\antlr3\\LimeLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:91:7: ( '\"' ( . )* '\"' )
            // lime\\antlr3\\LimeLexer.g:91:9: '\"' ( . )* '\"'
            {
            match('\"'); 

            // lime\\antlr3\\LimeLexer.g:91:13: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\"') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // lime\\antlr3\\LimeLexer.g:91:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            setText(getText().substring(1, getText().length()-1));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:93:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // lime\\antlr3\\LimeLexer.g:93:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:97:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // lime\\antlr3\\LimeLexer.g:97:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // lime\\antlr3\\LimeLexer.g:97:14: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // lime\\antlr3\\LimeLexer.g:97:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // lime\\antlr3\\LimeLexer.g:101:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // lime\\antlr3\\LimeLexer.g:101:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // lime\\antlr3\\LimeLexer.g:101:12: (~ ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // lime\\antlr3\\LimeLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // lime\\antlr3\\LimeLexer.g:101:26: ( '\\r' )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case '\r':
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // lime\\antlr3\\LimeLexer.g:101:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // lime\\antlr3\\LimeLexer.g:1:8: ( Assert | Class | Action | Inherit | End | Attr | Initialization | Method | New | When | Do | Begin | If | Else | Then | While | Return | Var | Null | Booltype | Inttype | Voidtype | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Dot | This | Super | Bool | ID | INT | STRING | WS | COMMENT | LINE_COMMENT )
        int alt8=58;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // lime\\antlr3\\LimeLexer.g:1:10: Assert
                {
                mAssert(); 


                }
                break;
            case 2 :
                // lime\\antlr3\\LimeLexer.g:1:17: Class
                {
                mClass(); 


                }
                break;
            case 3 :
                // lime\\antlr3\\LimeLexer.g:1:23: Action
                {
                mAction(); 


                }
                break;
            case 4 :
                // lime\\antlr3\\LimeLexer.g:1:30: Inherit
                {
                mInherit(); 


                }
                break;
            case 5 :
                // lime\\antlr3\\LimeLexer.g:1:38: End
                {
                mEnd(); 


                }
                break;
            case 6 :
                // lime\\antlr3\\LimeLexer.g:1:42: Attr
                {
                mAttr(); 


                }
                break;
            case 7 :
                // lime\\antlr3\\LimeLexer.g:1:47: Initialization
                {
                mInitialization(); 


                }
                break;
            case 8 :
                // lime\\antlr3\\LimeLexer.g:1:62: Method
                {
                mMethod(); 


                }
                break;
            case 9 :
                // lime\\antlr3\\LimeLexer.g:1:69: New
                {
                mNew(); 


                }
                break;
            case 10 :
                // lime\\antlr3\\LimeLexer.g:1:73: When
                {
                mWhen(); 


                }
                break;
            case 11 :
                // lime\\antlr3\\LimeLexer.g:1:78: Do
                {
                mDo(); 


                }
                break;
            case 12 :
                // lime\\antlr3\\LimeLexer.g:1:81: Begin
                {
                mBegin(); 


                }
                break;
            case 13 :
                // lime\\antlr3\\LimeLexer.g:1:87: If
                {
                mIf(); 


                }
                break;
            case 14 :
                // lime\\antlr3\\LimeLexer.g:1:90: Else
                {
                mElse(); 


                }
                break;
            case 15 :
                // lime\\antlr3\\LimeLexer.g:1:95: Then
                {
                mThen(); 


                }
                break;
            case 16 :
                // lime\\antlr3\\LimeLexer.g:1:100: While
                {
                mWhile(); 


                }
                break;
            case 17 :
                // lime\\antlr3\\LimeLexer.g:1:106: Return
                {
                mReturn(); 


                }
                break;
            case 18 :
                // lime\\antlr3\\LimeLexer.g:1:113: Var
                {
                mVar(); 


                }
                break;
            case 19 :
                // lime\\antlr3\\LimeLexer.g:1:117: Null
                {
                mNull(); 


                }
                break;
            case 20 :
                // lime\\antlr3\\LimeLexer.g:1:122: Booltype
                {
                mBooltype(); 


                }
                break;
            case 21 :
                // lime\\antlr3\\LimeLexer.g:1:131: Inttype
                {
                mInttype(); 


                }
                break;
            case 22 :
                // lime\\antlr3\\LimeLexer.g:1:139: Voidtype
                {
                mVoidtype(); 


                }
                break;
            case 23 :
                // lime\\antlr3\\LimeLexer.g:1:148: Or
                {
                mOr(); 


                }
                break;
            case 24 :
                // lime\\antlr3\\LimeLexer.g:1:151: And
                {
                mAnd(); 


                }
                break;
            case 25 :
                // lime\\antlr3\\LimeLexer.g:1:155: Equals
                {
                mEquals(); 


                }
                break;
            case 26 :
                // lime\\antlr3\\LimeLexer.g:1:162: NEquals
                {
                mNEquals(); 


                }
                break;
            case 27 :
                // lime\\antlr3\\LimeLexer.g:1:170: GTEquals
                {
                mGTEquals(); 


                }
                break;
            case 28 :
                // lime\\antlr3\\LimeLexer.g:1:179: LTEquals
                {
                mLTEquals(); 


                }
                break;
            case 29 :
                // lime\\antlr3\\LimeLexer.g:1:188: Pow
                {
                mPow(); 


                }
                break;
            case 30 :
                // lime\\antlr3\\LimeLexer.g:1:192: Excl
                {
                mExcl(); 


                }
                break;
            case 31 :
                // lime\\antlr3\\LimeLexer.g:1:197: GT
                {
                mGT(); 


                }
                break;
            case 32 :
                // lime\\antlr3\\LimeLexer.g:1:200: LT
                {
                mLT(); 


                }
                break;
            case 33 :
                // lime\\antlr3\\LimeLexer.g:1:203: Add
                {
                mAdd(); 


                }
                break;
            case 34 :
                // lime\\antlr3\\LimeLexer.g:1:207: Subtract
                {
                mSubtract(); 


                }
                break;
            case 35 :
                // lime\\antlr3\\LimeLexer.g:1:216: Multiply
                {
                mMultiply(); 


                }
                break;
            case 36 :
                // lime\\antlr3\\LimeLexer.g:1:225: Divide
                {
                mDivide(); 


                }
                break;
            case 37 :
                // lime\\antlr3\\LimeLexer.g:1:232: Modulus
                {
                mModulus(); 


                }
                break;
            case 38 :
                // lime\\antlr3\\LimeLexer.g:1:240: OBrace
                {
                mOBrace(); 


                }
                break;
            case 39 :
                // lime\\antlr3\\LimeLexer.g:1:247: CBrace
                {
                mCBrace(); 


                }
                break;
            case 40 :
                // lime\\antlr3\\LimeLexer.g:1:254: OBracket
                {
                mOBracket(); 


                }
                break;
            case 41 :
                // lime\\antlr3\\LimeLexer.g:1:263: CBracket
                {
                mCBracket(); 


                }
                break;
            case 42 :
                // lime\\antlr3\\LimeLexer.g:1:272: OParen
                {
                mOParen(); 


                }
                break;
            case 43 :
                // lime\\antlr3\\LimeLexer.g:1:279: CParen
                {
                mCParen(); 


                }
                break;
            case 44 :
                // lime\\antlr3\\LimeLexer.g:1:286: SColon
                {
                mSColon(); 


                }
                break;
            case 45 :
                // lime\\antlr3\\LimeLexer.g:1:293: Assign
                {
                mAssign(); 


                }
                break;
            case 46 :
                // lime\\antlr3\\LimeLexer.g:1:300: Comma
                {
                mComma(); 


                }
                break;
            case 47 :
                // lime\\antlr3\\LimeLexer.g:1:306: QMark
                {
                mQMark(); 


                }
                break;
            case 48 :
                // lime\\antlr3\\LimeLexer.g:1:312: Colon
                {
                mColon(); 


                }
                break;
            case 49 :
                // lime\\antlr3\\LimeLexer.g:1:318: Dot
                {
                mDot(); 


                }
                break;
            case 50 :
                // lime\\antlr3\\LimeLexer.g:1:322: This
                {
                mThis(); 


                }
                break;
            case 51 :
                // lime\\antlr3\\LimeLexer.g:1:327: Super
                {
                mSuper(); 


                }
                break;
            case 52 :
                // lime\\antlr3\\LimeLexer.g:1:333: Bool
                {
                mBool(); 


                }
                break;
            case 53 :
                // lime\\antlr3\\LimeLexer.g:1:338: ID
                {
                mID(); 


                }
                break;
            case 54 :
                // lime\\antlr3\\LimeLexer.g:1:341: INT
                {
                mINT(); 


                }
                break;
            case 55 :
                // lime\\antlr3\\LimeLexer.g:1:345: STRING
                {
                mSTRING(); 


                }
                break;
            case 56 :
                // lime\\antlr3\\LimeLexer.g:1:352: WS
                {
                mWS(); 


                }
                break;
            case 57 :
                // lime\\antlr3\\LimeLexer.g:1:355: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 58 :
                // lime\\antlr3\\LimeLexer.g:1:363: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\14\46\2\uffff\1\77\1\101\1\103\1\105\4\uffff\1\110\14\uffff"+
        "\2\46\4\uffff\5\46\1\122\6\46\1\132\7\46\13\uffff\10\46\1\153\1"+
        "\uffff\1\154\2\46\1\157\1\160\2\46\1\uffff\17\46\1\u0082\2\uffff"+
        "\1\u0083\1\46\2\uffff\1\u0085\2\46\1\u0088\1\u0089\1\u008a\1\u008b"+
        "\1\46\1\uffff\1\u008d\4\46\1\uffff\1\u0092\1\46\2\uffff\1\46\1\uffff"+
        "\1\u0095\1\u0096\4\uffff\1\46\1\uffff\1\u0098\1\u008b\1\u0099\1"+
        "\u009a\1\uffff\1\46\1\u009c\2\uffff\1\u009d\3\uffff\1\u009e\3\uffff";
    static final String DFA8_eofS =
        "\u009f\uffff";
    static final String DFA8_minS =
        "\1\11\1\143\1\154\1\146\1\154\2\145\1\150\1\157\1\145\1\150\1\145"+
        "\1\141\2\uffff\4\75\4\uffff\1\52\14\uffff\1\165\1\141\4\uffff\1"+
        "\163\2\164\1\141\1\150\1\60\1\144\1\163\1\164\1\167\1\154\1\145"+
        "\1\60\1\147\1\157\1\145\1\165\1\164\1\162\1\151\13\uffff\1\160\1"+
        "\154\1\145\1\151\1\162\1\163\1\145\1\164\1\60\1\uffff\1\60\1\145"+
        "\1\150\2\60\1\156\1\154\1\uffff\1\151\1\154\1\156\1\163\1\145\1"+
        "\165\1\40\1\144\1\145\1\163\1\162\1\157\1\40\1\163\1\162\1\60\2"+
        "\uffff\1\60\1\157\2\uffff\1\60\1\145\1\156\4\60\1\162\1\uffff\1"+
        "\60\1\162\1\145\1\164\1\156\1\uffff\1\60\1\151\2\uffff\1\144\1\uffff"+
        "\2\60\4\uffff\1\156\1\uffff\4\60\1\uffff\1\164\1\60\2\uffff\1\60"+
        "\3\uffff\1\60\3\uffff";
    static final String DFA8_maxS =
        "\1\175\1\164\1\154\2\156\1\145\1\151\1\150\2\157\1\162\1\145\1\157"+
        "\2\uffff\4\75\4\uffff\1\57\14\uffff\1\165\1\141\4\uffff\1\163\2"+
        "\164\1\141\1\164\1\172\1\144\1\163\1\164\1\167\1\154\1\151\1\172"+
        "\1\147\1\157\1\151\1\165\1\164\1\162\1\151\13\uffff\1\160\1\154"+
        "\1\145\1\151\1\162\1\163\1\145\1\164\1\172\1\uffff\1\172\1\145\1"+
        "\150\2\172\1\156\1\154\1\uffff\1\151\1\154\1\156\1\163\1\145\1\165"+
        "\1\40\1\144\1\145\1\163\1\162\1\157\1\40\1\163\1\162\1\172\2\uffff"+
        "\1\172\1\157\2\uffff\1\172\1\145\1\156\4\172\1\162\1\uffff\1\172"+
        "\1\162\1\145\1\164\1\156\1\uffff\1\172\1\151\2\uffff\1\144\1\uffff"+
        "\2\172\4\uffff\1\156\1\uffff\4\172\1\uffff\1\164\1\172\2\uffff\1"+
        "\172\3\uffff\1\172\3\uffff";
    static final String DFA8_acceptS =
        "\15\uffff\1\27\1\30\4\uffff\1\35\1\41\1\42\1\43\1\uffff\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\54\1\56\1\57\1\60\1\61\2\uffff\1\65"+
        "\1\66\1\67\1\70\24\uffff\1\31\1\55\1\32\1\36\1\33\1\37\1\34\1\40"+
        "\1\71\1\72\1\44\11\uffff\1\15\7\uffff\1\13\20\uffff\1\25\1\5\2\uffff"+
        "\1\11\1\23\10\uffff\1\22\5\uffff\1\6\2\uffff\1\7\1\16\1\uffff\1"+
        "\12\2\uffff\1\24\1\17\1\62\1\64\1\uffff\1\26\4\uffff\1\2\2\uffff"+
        "\1\20\1\14\1\uffff\1\63\1\1\1\3\1\uffff\1\10\1\21\1\4";
    static final String DFA8_specialS =
        "\u009f\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\51\1\uffff\2\51\22\uffff\1\51\1\20\1\50\2\uffff\1\30\1\16"+
            "\1\uffff\1\35\1\36\1\26\1\24\1\40\1\25\1\43\1\27\12\47\1\42"+
            "\1\37\1\22\1\17\1\21\1\41\1\uffff\32\46\1\33\1\uffff\1\34\1"+
            "\23\1\46\1\uffff\1\1\1\11\1\2\1\10\1\4\1\45\2\46\1\3\3\46\1"+
            "\5\1\6\3\46\1\13\1\44\1\12\1\46\1\14\1\7\3\46\1\31\1\15\1\32",
            "\1\53\17\uffff\1\52\1\54",
            "\1\55",
            "\1\57\7\uffff\1\56",
            "\1\61\1\uffff\1\60",
            "\1\62",
            "\1\63\3\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67\11\uffff\1\70",
            "\1\71\11\uffff\1\72",
            "\1\73",
            "\1\74\15\uffff\1\75",
            "",
            "",
            "\1\76",
            "\1\100",
            "\1\102",
            "\1\104",
            "",
            "",
            "",
            "",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117\1\120\12\uffff\1\121",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130\3\uffff\1\131",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\133",
            "\1\134",
            "\1\135\3\uffff\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\155",
            "\1\156",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0084",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0086",
            "\1\u0087",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008c",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u009b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Assert | Class | Action | Inherit | End | Attr | Initialization | Method | New | When | Do | Begin | If | Else | Then | While | Return | Var | Null | Booltype | Inttype | Voidtype | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Dot | This | Super | Bool | ID | INT | STRING | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}