// $ANTLR 3.4 lime\\antlr3\\DefRef.g 2016-05-02 00:28:10


    package lime.antlr3;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DefRef extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Action", "Add", "And", "Assert", "Assign", "Attr", "Begin", "Bool", "Booltype", "CBrace", "CBracket", "COMMENT", "CParen", "Class", "Colon", "Comma", "Divide", "Do", "Dot", "Else", "End", "Equals", "Excl", "GT", "GTEquals", "ID", "INT", "If", "Inherit", "Initialization", "Inttype", "LETTER", "LINE_COMMENT", "LT", "LTEquals", "Method", "Modulus", "Multiply", "NEquals", "New", "Null", "OBrace", "OBracket", "OParen", "Or", "Pow", "QMark", "Return", "SColon", "STRING", "Subtract", "Super", "Then", "This", "Var", "Voidtype", "WS", "When", "While", "ACTION", "ARG", "ARGS", "ASSIGN", "ATTR", "BLOCK", "CALL", "CLASS", "DOT", "ELIST", "EXPR", "FILE", "IF", "INHERIT", "INIT", "MEMBERS", "METHOD", "RETURN", "VAR", "VAR_DECL", "WHILE"
    };

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
    public static final int ACTION=63;
    public static final int ARG=64;
    public static final int ARGS=65;
    public static final int ASSIGN=66;
    public static final int ATTR=67;
    public static final int BLOCK=68;
    public static final int CALL=69;
    public static final int CLASS=70;
    public static final int DOT=71;
    public static final int ELIST=72;
    public static final int EXPR=73;
    public static final int FILE=74;
    public static final int IF=75;
    public static final int INHERIT=76;
    public static final int INIT=77;
    public static final int MEMBERS=78;
    public static final int METHOD=79;
    public static final int RETURN=80;
    public static final int VAR=81;
    public static final int VAR_DECL=82;
    public static final int WHILE=83;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public DefRef(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public DefRef(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DefRef.tokenNames; }
    public String getGrammarFileName() { return "lime\\antlr3\\DefRef.g"; }


        SymbolTable symtab;
        Scope currentScope;
        public DefRef(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentScope = symtab.globals;
        }



    // $ANTLR start "topdown"
    // lime\\antlr3\\DefRef.g:23:1: topdown : ( enterBlock | enterFunction | varDeclaration );
    public final void topdown() throws RecognitionException {
        try {
            // lime\\antlr3\\DefRef.g:24:5: ( enterBlock | enterFunction | varDeclaration )
            int alt1=3;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt1=1;
                }
                break;
            case METHOD:
                {
                alt1=2;
                }
                break;
            case ARG:
            case ATTR:
            case VAR:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // lime\\antlr3\\DefRef.g:24:9: enterBlock
                    {
                    pushFollow(FOLLOW_enterBlock_in_topdown61);
                    enterBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\DefRef.g:25:9: enterFunction
                    {
                    pushFollow(FOLLOW_enterFunction_in_topdown71);
                    enterFunction();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // lime\\antlr3\\DefRef.g:26:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_topdown81);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "topdown"



    // $ANTLR start "bottomup"
    // lime\\antlr3\\DefRef.g:29:1: bottomup : ( exitBlock | exitFunction | idref | call );
    public final void bottomup() throws RecognitionException {
        try {
            // lime\\antlr3\\DefRef.g:30:5: ( exitBlock | exitFunction | idref | call )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt2=1;
                }
                break;
            case METHOD:
                {
                alt2=2;
                }
                break;
            case ID:
                {
                alt2=3;
                }
                break;
            case CALL:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // lime\\antlr3\\DefRef.g:30:9: exitBlock
                    {
                    pushFollow(FOLLOW_exitBlock_in_bottomup100);
                    exitBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\DefRef.g:31:9: exitFunction
                    {
                    pushFollow(FOLLOW_exitFunction_in_bottomup110);
                    exitFunction();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // lime\\antlr3\\DefRef.g:32:9: idref
                    {
                    pushFollow(FOLLOW_idref_in_bottomup120);
                    idref();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // lime\\antlr3\\DefRef.g:33:7: call
                    {
                    pushFollow(FOLLOW_call_in_bottomup128);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bottomup"



    // $ANTLR start "enterBlock"
    // lime\\antlr3\\DefRef.g:38:1: enterBlock : BLOCK ;
    public final void enterBlock() throws RecognitionException {
        try {
            // lime\\antlr3\\DefRef.g:39:5: ( BLOCK )
            // lime\\antlr3\\DefRef.g:39:9: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock149); if (state.failed) return ;

            if ( state.backtracking==1 ) {currentScope = new LocalScope(currentScope);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterBlock"



    // $ANTLR start "exitBlock"
    // lime\\antlr3\\DefRef.g:41:1: exitBlock : BLOCK ;
    public final void exitBlock() throws RecognitionException {
        try {
            // lime\\antlr3\\DefRef.g:42:5: ( BLOCK )
            // lime\\antlr3\\DefRef.g:42:9: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock169); if (state.failed) return ;

            if ( state.backtracking==1 ) {
                     System.out.println("locals: "+currentScope);
                    currentScope = currentScope.getEnclosingScope();    // pop scope
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitBlock"



    // $ANTLR start "enterFunction"
    // lime\\antlr3\\DefRef.g:49:1: enterFunction : ^( METHOD ID type_tree ( . )* ) ;
    public final void enterFunction() throws RecognitionException {
        LimeAST ID1=null;
        Type type_tree2 =null;


        try {
            // lime\\antlr3\\DefRef.g:50:5: ( ^( METHOD ID type_tree ( . )* ) )
            // lime\\antlr3\\DefRef.g:50:9: ^( METHOD ID type_tree ( . )* )
            {
            match(input,METHOD,FOLLOW_METHOD_in_enterFunction200); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID1=(LimeAST)match(input,ID,FOLLOW_ID_in_enterFunction202); if (state.failed) return ;

            pushFollow(FOLLOW_type_tree_in_enterFunction204);
            type_tree2=type_tree();

            state._fsp--;
            if (state.failed) return ;

            // lime\\antlr3\\DefRef.g:50:31: ( . )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case Action:
                case Add:
                case And:
                case Assert:
                case Assign:
                case Attr:
                case Begin:
                case Bool:
                case Booltype:
                case CBrace:
                case CBracket:
                case COMMENT:
                case CParen:
                case Class:
                case Colon:
                case Comma:
                case Divide:
                case Do:
                case Dot:
                case Else:
                case End:
                case Equals:
                case Excl:
                case GT:
                case GTEquals:
                case ID:
                case INT:
                case If:
                case Inherit:
                case Initialization:
                case Inttype:
                case LETTER:
                case LINE_COMMENT:
                case LT:
                case LTEquals:
                case Method:
                case Modulus:
                case Multiply:
                case NEquals:
                case New:
                case Null:
                case OBrace:
                case OBracket:
                case OParen:
                case Or:
                case Pow:
                case QMark:
                case Return:
                case SColon:
                case STRING:
                case Subtract:
                case Super:
                case Then:
                case This:
                case Var:
                case Voidtype:
                case WS:
                case When:
                case While:
                case ACTION:
                case ARG:
                case ARGS:
                case ASSIGN:
                case ATTR:
                case BLOCK:
                case CALL:
                case CLASS:
                case DOT:
                case ELIST:
                case EXPR:
                case FILE:
                case IF:
                case INHERIT:
                case INIT:
                case MEMBERS:
                case METHOD:
                case RETURN:
                case VAR:
                case VAR_DECL:
                case WHILE:
                    {
                    alt3=1;
                    }
                    break;
                case UP:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // lime\\antlr3\\DefRef.g:50:31: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    System.out.println("line "+ID1.getLine()+": def method "+(ID1!=null?ID1.getText():null));
                    Type retType = type_tree2; // rule type returns a Type symbol
            		MethodSymbol fs = new MethodSymbol((ID1!=null?ID1.getText():null),type_tree2,currentScope);
            		ID1.symbol = fs;
                    currentScope.define(fs); // def method in globals
                    currentScope = fs;       // set current scope to method scope
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enterFunction"



    // $ANTLR start "exitFunction"
    // lime\\antlr3\\DefRef.g:60:1: exitFunction : METHOD ;
    public final void exitFunction() throws RecognitionException {
        try {
            // lime\\antlr3\\DefRef.g:61:5: ( METHOD )
            // lime\\antlr3\\DefRef.g:61:9: METHOD
            {
            match(input,METHOD,FOLLOW_METHOD_in_exitFunction237); if (state.failed) return ;

            if ( state.backtracking==1 ) {
                     System.out.println("args: "+currentScope);
                    currentScope = currentScope.getEnclosingScope();// pop arg scope
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "exitFunction"



    // $ANTLR start "type_tree"
    // lime\\antlr3\\DefRef.g:68:1: type_tree returns [Type type] : type_specifier ;
    public final Type type_tree() throws RecognitionException {
        Type type = null;


        DefRef.type_specifier_return type_specifier3 =null;


        try {
            // lime\\antlr3\\DefRef.g:69:2: ( type_specifier )
            // lime\\antlr3\\DefRef.g:69:4: type_specifier
            {
            pushFollow(FOLLOW_type_specifier_in_type_tree265);
            type_specifier3=type_specifier();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==1 ) {type = (type_specifier3!=null?type_specifier3.type:null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "type_tree"


    public static class type_specifier_return extends TreeRuleReturnScope {
        public Type type;
    };


    // $ANTLR start "type_specifier"
    // lime\\antlr3\\DefRef.g:72:1: type_specifier returns [Type type] : ( Voidtype | Inttype );
    public final DefRef.type_specifier_return type_specifier() throws RecognitionException {
        DefRef.type_specifier_return retval = new DefRef.type_specifier_return();
        retval.start = input.LT(1);


         retval.type = (Type)currentScope.resolve(((LimeAST)retval.start).getText()); 
        try {
            // lime\\antlr3\\DefRef.g:74:2: ( Voidtype | Inttype )
            // lime\\antlr3\\DefRef.g:
            {
            if ( input.LA(1)==Inttype||input.LA(1)==Voidtype ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_specifier"



    // $ANTLR start "varDeclaration"
    // lime\\antlr3\\DefRef.g:80:1: varDeclaration : ^( ( VAR | ATTR | ARG ) ID type_tree ) ;
    public final void varDeclaration() throws RecognitionException {
        LimeAST ID4=null;
        Type type_tree5 =null;


        try {
            // lime\\antlr3\\DefRef.g:81:5: ( ^( ( VAR | ATTR | ARG ) ID type_tree ) )
            // lime\\antlr3\\DefRef.g:81:9: ^( ( VAR | ATTR | ARG ) ID type_tree )
            {
            if ( input.LA(1)==ARG||input.LA(1)==ATTR||input.LA(1)==VAR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            ID4=(LimeAST)match(input,ID,FOLLOW_ID_in_varDeclaration327); if (state.failed) return ;

            pushFollow(FOLLOW_type_tree_in_varDeclaration329);
            type_tree5=type_tree();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    System.out.println("line "+ID4.getLine()+": def "+(ID4!=null?ID4.getText():null)+" type "+type_tree5);
                    VariableSymbol vs = new VariableSymbol((ID4!=null?ID4.getText():null),type_tree5);
                    currentScope.define(vs);
                    ID4.symbol = vs;
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "varDeclaration"



    // $ANTLR start "call"
    // lime\\antlr3\\DefRef.g:92:1: call : ^( CALL ID . ) ;
    public final void call() throws RecognitionException {
        LimeAST ID6=null;

        try {
            // lime\\antlr3\\DefRef.g:92:5: ( ^( CALL ID . ) )
            // lime\\antlr3\\DefRef.g:92:9: ^( CALL ID . )
            {
            match(input,CALL,FOLLOW_CALL_in_call359); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID6=(LimeAST)match(input,ID,FOLLOW_ID_in_call361); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    Symbol s = currentScope.resolve((ID6!=null?ID6.getText():null));
                    ID6.symbol = s;
                    // System.out.println("line "+ID6.getLine()+": call "+s);
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "call"


    public static class idref_return extends TreeRuleReturnScope {
    };


    // $ANTLR start "idref"
    // lime\\antlr3\\DefRef.g:100:1: idref :{...}? ID ;
    public final DefRef.idref_return idref() throws RecognitionException {
        DefRef.idref_return retval = new DefRef.idref_return();
        retval.start = input.LT(1);


        LimeAST ID7=null;

        try {
            // lime\\antlr3\\DefRef.g:101:5: ({...}? ID )
            // lime\\antlr3\\DefRef.g:101:9: {...}? ID
            {
            if ( !((((LimeAST)retval.start).hasAncestor(EXPR) || ((LimeAST)retval.start).hasAncestor(ASSIGN) ||
                	 ((LimeAST)retval.start).hasAncestor(ELIST))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "idref", "$start.hasAncestor(EXPR) || $start.hasAncestor(ASSIGN) ||\r\n    \t $start.hasAncestor(ELIST)");
            }

            ID7=(LimeAST)match(input,ID,FOLLOW_ID_in_idref393); if (state.failed) return retval;

            if ( state.backtracking==1 ) {
                    Symbol s = currentScope.resolve((ID7!=null?ID7.getText():null));
                    ID7.symbol = s;
                    // System.out.println("line "+ID7.getLine()+": ref "+s);
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "idref"

    // Delegated rules


 

    public static final BitSet FOLLOW_enterBlock_in_topdown61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterFunction_in_topdown71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_topdown81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitBlock_in_bottomup100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitFunction_in_bottomup110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idref_in_bottomup120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_bottomup128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_enterBlock149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_exitBlock169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_enterFunction200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterFunction202 = new BitSet(new long[]{0x0800000400000000L});
    public static final BitSet FOLLOW_type_tree_in_enterFunction204 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_METHOD_in_exitFunction237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_type_tree265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_varDeclaration317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_varDeclaration327 = new BitSet(new long[]{0x0800000400000000L});
    public static final BitSet FOLLOW_type_tree_in_varDeclaration329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_call359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call361 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_ID_in_idref393 = new BitSet(new long[]{0x0000000000000002L});

}