// $ANTLR 3.4 lime\\antlr3\\Ref.g 2016-04-28 15:04:44

    package lime.antlr3;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Ref extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Action", "Add", "And", "Assert", "Assign", "Attr", "Begin", "Bool", "Booltype", "CBrace", "CBracket", "COMMENT", "CParen", "Class", "Colon", "Comma", "Divide", "Do", "Dot", "Else", "End", "Equals", "Excl", "GT", "GTEquals", "ID", "INT", "If", "Inherit", "Initialization", "Inttype", "LETTER", "LINE_COMMENT", "LT", "LTEquals", "Method", "Modulus", "Multiply", "NEquals", "New", "Null", "OBrace", "OBracket", "OParen", "Or", "Pow", "QMark", "Return", "SColon", "STRING", "Subtract", "Super", "Then", "This", "Var", "Voidtype", "WS", "When", "While", "ACTION", "ARGS_DECL", "ARG_DECL", "ASSIGN", "ATTR_DECL", "BLOCK", "CALL", "CLASS", "DOT", "ELIST", "EXPR", "FILE", "IF", "INHERIT", "INIT", "MEMBERS", "METHOD", "RETURN", "VAR_DECL", "WHILE", "EXTENDS", "METHOD_DECL", "'='", "'class'", "'this'"
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
    public static final int ARGS_DECL=64;
    public static final int ARG_DECL=65;
    public static final int ASSIGN=66;
    public static final int ATTR_DECL=67;
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
    public static final int VAR_DECL=81;
    public static final int WHILE=82;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int EXTENDS=83;
    public static final int METHOD_DECL=84;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public Ref(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Ref(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Ref.tokenNames; }
    public String getGrammarFileName() { return "lime\\antlr3\\Ref.g"; }


        SymbolTable symtab;
        public Ref(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
        }  



    // $ANTLR start "topdown"
    // lime\\antlr3\\Ref.g:23:1: topdown : ( enterMethod | enterClass | varDeclaration | assignment | resolveExpr );
    public final void topdown() throws RecognitionException {
        try {
            // lime\\antlr3\\Ref.g:24:5: ( enterMethod | enterClass | varDeclaration | assignment | resolveExpr )
            int alt1=5;
            switch ( input.LA(1) ) {
            case METHOD_DECL:
                {
                alt1=1;
                }
                break;
            case 86:
                {
                alt1=2;
                }
                break;
            case ARG_DECL:
            case ATTR_DECL:
            case VAR_DECL:
                {
                alt1=3;
                }
                break;
            case 85:
                {
                alt1=4;
                }
                break;
            case EXPR:
                {
                alt1=5;
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
                    // lime\\antlr3\\Ref.g:24:9: enterMethod
                    {
                    pushFollow(FOLLOW_enterMethod_in_topdown63);
                    enterMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Ref.g:25:9: enterClass
                    {
                    pushFollow(FOLLOW_enterClass_in_topdown73);
                    enterClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // lime\\antlr3\\Ref.g:26:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_topdown83);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // lime\\antlr3\\Ref.g:27:9: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_topdown93);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // lime\\antlr3\\Ref.g:28:9: resolveExpr
                    {
                    pushFollow(FOLLOW_resolveExpr_in_topdown103);
                    resolveExpr();

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



    // $ANTLR start "enterClass"
    // lime\\antlr3\\Ref.g:35:1: enterClass : ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) ) ;
    public final void enterClass() throws RecognitionException {
        LimeAST name=null;
        LimeAST sup=null;

        try {
            // lime\\antlr3\\Ref.g:36:2: ( ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) ) )
            // lime\\antlr3\\Ref.g:36:6: ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) )
            {
            match(input,86,FOLLOW_86_in_enterClass125); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            name=(LimeAST)match(input,ID,FOLLOW_ID_in_enterClass129); if (state.failed) return ;

            // lime\\antlr3\\Ref.g:36:24: ( ^( EXTENDS sup= ID ) )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case EXTENDS:
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // lime\\antlr3\\Ref.g:36:25: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_enterClass133); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(LimeAST)match(input,ID,FOLLOW_ID_in_enterClass137); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            match(input,MEMBERS,FOLLOW_MEMBERS_in_enterClass143); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // lime\\antlr3\\Ref.g:36:55: ( . )*
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
                    case ARGS_DECL:
                    case ARG_DECL:
                    case ASSIGN:
                    case ATTR_DECL:
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
                    case VAR_DECL:
                    case WHILE:
                    case EXTENDS:
                    case METHOD_DECL:
                    case 85:
                    case 86:
                    case 87:
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
                	    // lime\\antlr3\\Ref.g:36:55: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		if ( sup!=null ) {
            			// look up superclass (if any)
            			sup.symbol = sup.scope.resolve((sup!=null?sup.getText():null));
            			((ClassSymbol)name.symbol).superClass =
            				(ClassSymbol)sup.symbol;                // set superclass
            			System.out.println("line "+name.getLine()+": set "+(name!=null?name.getText():null)+
            				" super to "+((ClassSymbol)name.symbol).superClass.name);
            		}
            		else {
            			System.out.println("line "+name.getLine()+": set "+(name!=null?name.getText():null));
            		}
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
    // $ANTLR end "enterClass"



    // $ANTLR start "enterMethod"
    // lime\\antlr3\\Ref.g:53:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
    public final void enterMethod() throws RecognitionException {
        LimeAST ID1=null;
        Ref.type_return type2 =null;


        try {
            // lime\\antlr3\\Ref.g:54:2: ( ^( METHOD_DECL type ID ( . )* ) )
            // lime\\antlr3\\Ref.g:54:6: ^( METHOD_DECL type ID ( . )* )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod167); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_enterMethod169);
            type2=type();

            state._fsp--;
            if (state.failed) return ;

            ID1=(LimeAST)match(input,ID,FOLLOW_ID_in_enterMethod171); if (state.failed) return ;

            // lime\\antlr3\\Ref.g:54:28: ( . )*
            loop4:
            do {
                int alt4=2;
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
                case ARGS_DECL:
                case ARG_DECL:
                case ASSIGN:
                case ATTR_DECL:
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
                case VAR_DECL:
                case WHILE:
                case EXTENDS:
                case METHOD_DECL:
                case 85:
                case 86:
                case 87:
                    {
                    alt4=1;
                    }
                    break;
                case UP:
                    {
                    alt4=2;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // lime\\antlr3\\Ref.g:54:28: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		ID1.symbol.type = (type2!=null?type2.tsym:null); // set return type of method
            		System.out.println("line "+ID1.getLine()+": set method type "+ID1.symbol);
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
    // $ANTLR end "enterMethod"



    // $ANTLR start "varDeclaration"
    // lime\\antlr3\\Ref.g:62:1: varDeclaration : ^( ( ATTR_DECL | VAR_DECL | ARG_DECL ) type ID ) ;
    public final void varDeclaration() throws RecognitionException {
        LimeAST ID3=null;
        Ref.type_return type4 =null;


        try {
            // lime\\antlr3\\Ref.g:63:2: ( ^( ( ATTR_DECL | VAR_DECL | ARG_DECL ) type ID ) )
            // lime\\antlr3\\Ref.g:63:6: ^( ( ATTR_DECL | VAR_DECL | ARG_DECL ) type ID )
            {
            if ( input.LA(1)==ARG_DECL||input.LA(1)==ATTR_DECL||input.LA(1)==VAR_DECL ) {
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
            pushFollow(FOLLOW_type_in_varDeclaration206);
            type4=type();

            state._fsp--;
            if (state.failed) return ;

            ID3=(LimeAST)match(input,ID,FOLLOW_ID_in_varDeclaration208); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            		ID3.symbol.type = (type4!=null?type4.tsym:null); // set return type of variable
            		System.out.println("line "+ID3.getLine()+": set var type "+ID3.symbol);
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


    public static class type_return extends TreeRuleReturnScope {
        public Type tsym;
    };


    // $ANTLR start "type"
    // lime\\antlr3\\Ref.g:70:1: type returns [Type tsym] : ( Inttype | Voidtype | ID );
    public final Ref.type_return type() throws RecognitionException {
        Ref.type_return retval = new Ref.type_return();
        retval.start = input.LT(1);



        	// get scope from AST; use to resolve type name and save it in AST
        	((LimeAST)retval.start).symbol = ((LimeAST)retval.start).scope.resolve(((LimeAST)retval.start).getText());
        	retval.tsym = (Type)((LimeAST)retval.start).symbol; // return Type from this rule

        try {
            // lime\\antlr3\\Ref.g:76:2: ( Inttype | Voidtype | ID )
            // lime\\antlr3\\Ref.g:
            {
            if ( input.LA(1)==ID||input.LA(1)==Inttype||input.LA(1)==Voidtype ) {
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
    // $ANTLR end "type"



    // $ANTLR start "assignment"
    // lime\\antlr3\\Ref.g:81:1: assignment : ^( '=' expr expr ) ;
    public final void assignment() throws RecognitionException {
        try {
            // lime\\antlr3\\Ref.g:81:13: ( ^( '=' expr expr ) )
            // lime\\antlr3\\Ref.g:81:15: ^( '=' expr expr )
            {
            match(input,85,FOLLOW_85_in_assignment261); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_assignment263);
            expr();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expr_in_assignment265);
            expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


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
    // $ANTLR end "assignment"



    // $ANTLR start "resolveExpr"
    // lime\\antlr3\\Ref.g:82:1: resolveExpr : ^( EXPR expr ) ;
    public final void resolveExpr() throws RecognitionException {
        try {
            // lime\\antlr3\\Ref.g:82:13: ( ^( EXPR expr ) )
            // lime\\antlr3\\Ref.g:82:15: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_resolveExpr277); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_resolveExpr279);
            expr();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


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
    // $ANTLR end "resolveExpr"


    public static class expr_return extends TreeRuleReturnScope {
        public Type type;
    };


    // $ANTLR start "expr"
    // lime\\antlr3\\Ref.g:84:1: expr returns [Type type] : ( member | ^( CALL expr ) | ^( Add expr expr ) | id | INT );
    public final Ref.expr_return expr() throws RecognitionException {
        Ref.expr_return retval = new Ref.expr_return();
        retval.start = input.LT(1);


        Type member5 =null;

        Type id6 =null;


        try {
            // lime\\antlr3\\Ref.g:85:5: ( member | ^( CALL expr ) | ^( Add expr expr ) | id | INT )
            int alt5=5;
            switch ( input.LA(1) ) {
            case Dot:
                {
                alt5=1;
                }
                break;
            case CALL:
                {
                alt5=2;
                }
                break;
            case Add:
                {
                alt5=3;
                }
                break;
            case ID:
            case 87:
                {
                alt5=4;
                }
                break;
            case INT:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // lime\\antlr3\\Ref.g:85:9: member
                    {
                    pushFollow(FOLLOW_member_in_expr300);
                    member5=member();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==1 ) {retval.type = member5;}

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Ref.g:86:9: ^( CALL expr )
                    {
                    match(input,CALL,FOLLOW_CALL_in_expr314); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr316);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 3 :
                    // lime\\antlr3\\Ref.g:87:9: ^( Add expr expr )
                    {
                    match(input,Add,FOLLOW_Add_in_expr328); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr330);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr332);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 4 :
                    // lime\\antlr3\\Ref.g:88:9: id
                    {
                    pushFollow(FOLLOW_id_in_expr343);
                    id6=id();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==1 ) {retval.type = id6;}

                    }
                    break;
                case 5 :
                    // lime\\antlr3\\Ref.g:89:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr364); if (state.failed) return retval;

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
        return retval;
    }
    // $ANTLR end "expr"



    // $ANTLR start "id"
    // lime\\antlr3\\Ref.g:92:1: id returns [Type type] : ( ID |t= 'this' );
    public final Type id() throws RecognitionException {
        Type type = null;


        LimeAST t=null;
        LimeAST ID7=null;

        try {
            // lime\\antlr3\\Ref.g:93:2: ( ID |t= 'this' )
            int alt6=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case 87:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // lime\\antlr3\\Ref.g:93:6: ID
                    {
                    ID7=(LimeAST)match(input,ID,FOLLOW_ID_in_id385); if (state.failed) return type;

                    if ( state.backtracking==1 ) {
                    		// do usual resolve(ID) then check for illegal forward references
                    		ID7.symbol = SymbolTable.resolveID(ID7);
                    		if ( ID7.symbol!=null ) type = ID7.symbol.type;
                    	}

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Ref.g:99:6: t= 'this'
                    {
                    t=(LimeAST)match(input,87,FOLLOW_87_in_id397); if (state.failed) return type;

                    if ( state.backtracking==1 ) {type = SymbolTable.getEnclosingClass(t.scope);}

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
        return type;
    }
    // $ANTLR end "id"



    // $ANTLR start "member"
    // lime\\antlr3\\Ref.g:101:1: member returns [Type type] : ^( Dot m= expr ID ) ;
    public final Type member() throws RecognitionException {
        Type type = null;


        LimeAST ID8=null;
        Ref.expr_return m =null;


        try {
            // lime\\antlr3\\Ref.g:102:2: ( ^( Dot m= expr ID ) )
            // lime\\antlr3\\Ref.g:102:6: ^( Dot m= expr ID )
            {
            match(input,Dot,FOLLOW_Dot_in_member417); if (state.failed) return type;

            match(input, Token.DOWN, null); if (state.failed) return type;
            pushFollow(FOLLOW_expr_in_member421);
            m=expr();

            state._fsp--;
            if (state.failed) return type;

            ID8=(LimeAST)match(input,ID,FOLLOW_ID_in_member423); if (state.failed) return type;

            match(input, Token.UP, null); if (state.failed) return type;


            if ( state.backtracking==1 ) {
            			ClassSymbol scope = (ClassSymbol)(m!=null?m.type:null);
            			Symbol s = scope.resolveMember((ID8!=null?ID8.getText():null));
            			ID8.symbol = s;
            			System.out.println("line "+ID8.getLine()+ ": resolve "+(m!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(m.start),input.getTreeAdaptor().getTokenStopIndex(m.start))):null)+"."+(ID8!=null?ID8.getText():null)+" to "+s);
            			if ( s!=null ) type = s.type;
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
        return type;
    }
    // $ANTLR end "member"

    // Delegated rules


 

    public static final BitSet FOLLOW_enterMethod_in_topdown63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterClass_in_topdown73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_topdown83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_topdown93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resolveExpr_in_topdown103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_enterClass125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_EXTENDS_in_enterClass133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEMBERS_in_enterClass143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_enterMethod169 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_enterMethod171 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x0000000000FFFFFFL});
    public static final BitSet FOLLOW_set_in_varDeclaration198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_varDeclaration206 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_varDeclaration208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_85_in_assignment261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignment263 = new BitSet(new long[]{0x0000000060400020L,0x0000000000800020L});
    public static final BitSet FOLLOW_expr_in_assignment265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_resolveExpr277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_resolveExpr279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_member_in_expr300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_expr314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Add_in_expr328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr330 = new BitSet(new long[]{0x0000000060400020L,0x0000000000800020L});
    public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_expr343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_id397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_member417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_member421 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_member423 = new BitSet(new long[]{0x0000000000000008L});

}