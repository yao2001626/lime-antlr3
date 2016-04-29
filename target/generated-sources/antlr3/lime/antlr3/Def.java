// $ANTLR 3.4 lime\\antlr3\\Def.g 2016-04-28 15:04:44

    package lime.antlr3;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Def extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Action", "Add", "And", "Assert", "Assign", "Attr", "Begin", "Bool", "Booltype", "CBrace", "CBracket", "COMMENT", "CParen", "Class", "Colon", "Comma", "Divide", "Do", "Dot", "Else", "End", "Equals", "Excl", "GT", "GTEquals", "ID", "INT", "If", "Inherit", "Initialization", "Inttype", "LETTER", "LINE_COMMENT", "LT", "LTEquals", "Method", "Modulus", "Multiply", "NEquals", "New", "Null", "OBrace", "OBracket", "OParen", "Or", "Pow", "QMark", "Return", "SColon", "STRING", "Subtract", "Super", "Then", "This", "Var", "Voidtype", "WS", "When", "While", "ACTION", "ARGS_DECL", "ARG_DECL", "ASSIGN", "ATTR_DECL", "BLOCK", "CALL", "CLASS", "DOT", "ELIST", "EXPR", "FILE", "IF", "INHERIT", "INIT", "MEMBERS", "METHOD", "RETURN", "VAR_DECL", "WHILE", "'this'"
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
    public static final int T__83=83;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public Def(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Def(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Def.tokenNames; }
    public String getGrammarFileName() { return "lime\\antlr3\\Def.g"; }


        SymbolTable symtab;
        Scope currentScope;
        public Def(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentScope = symtab.globals;
        }



    // $ANTLR start "topdown"
    // lime\\antlr3\\Def.g:22:1: topdown : ( enterBlock | enterMethod | enterAction | enterClass | varDeclaration | atoms );
    public final void topdown() throws RecognitionException {
        try {
            // lime\\antlr3\\Def.g:23:5: ( enterBlock | enterMethod | enterAction | enterClass | varDeclaration | atoms )
            int alt1=6;
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
            case ACTION:
                {
                alt1=3;
                }
                break;
            case CLASS:
                {
                alt1=4;
                }
                break;
            case ARG_DECL:
            case ATTR_DECL:
            case VAR_DECL:
                {
                alt1=5;
                }
                break;
            case ID:
            case 83:
                {
                alt1=6;
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
                    // lime\\antlr3\\Def.g:23:9: enterBlock
                    {
                    pushFollow(FOLLOW_enterBlock_in_topdown61);
                    enterBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Def.g:24:9: enterMethod
                    {
                    pushFollow(FOLLOW_enterMethod_in_topdown71);
                    enterMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // lime\\antlr3\\Def.g:25:4: enterAction
                    {
                    pushFollow(FOLLOW_enterAction_in_topdown76);
                    enterAction();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // lime\\antlr3\\Def.g:26:9: enterClass
                    {
                    pushFollow(FOLLOW_enterClass_in_topdown86);
                    enterClass();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // lime\\antlr3\\Def.g:27:9: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_topdown96);
                    varDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // lime\\antlr3\\Def.g:28:9: atoms
                    {
                    pushFollow(FOLLOW_atoms_in_topdown106);
                    atoms();

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
    // lime\\antlr3\\Def.g:31:1: bottomup : ( exitBlock | exitMethod | exitAction | exitClass );
    public final void bottomup() throws RecognitionException {
        try {
            // lime\\antlr3\\Def.g:32:5: ( exitBlock | exitMethod | exitAction | exitClass )
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
            case ACTION:
                {
                alt2=3;
                }
                break;
            case CLASS:
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
                    // lime\\antlr3\\Def.g:32:9: exitBlock
                    {
                    pushFollow(FOLLOW_exitBlock_in_bottomup125);
                    exitBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Def.g:33:9: exitMethod
                    {
                    pushFollow(FOLLOW_exitMethod_in_bottomup135);
                    exitMethod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // lime\\antlr3\\Def.g:34:4: exitAction
                    {
                    pushFollow(FOLLOW_exitAction_in_bottomup140);
                    exitAction();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // lime\\antlr3\\Def.g:35:9: exitClass
                    {
                    pushFollow(FOLLOW_exitClass_in_bottomup150);
                    exitClass();

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
    // lime\\antlr3\\Def.g:40:1: enterBlock : BLOCK ;
    public final void enterBlock() throws RecognitionException {
        try {
            // lime\\antlr3\\Def.g:41:5: ( BLOCK )
            // lime\\antlr3\\Def.g:41:9: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock172); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			currentScope = new LocalScope(currentScope);
            			System.out.println("enterBlock-----locals: "+currentScope);
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
    // $ANTLR end "enterBlock"



    // $ANTLR start "exitBlock"
    // lime\\antlr3\\Def.g:46:1: exitBlock : BLOCK ;
    public final void exitBlock() throws RecognitionException {
        try {
            // lime\\antlr3\\Def.g:47:5: ( BLOCK )
            // lime\\antlr3\\Def.g:47:9: BLOCK
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock193); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			System.out.println("exitBlock-----locals: "+currentScope);
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



    // $ANTLR start "enterMethod"
    // lime\\antlr3\\Def.g:53:1: enterMethod : ^( METHOD ID type= . ( . )* ) ;
    public final void enterMethod() throws RecognitionException {
        LimeAST ID1=null;
        LimeAST type=null;

        try {
            // lime\\antlr3\\Def.g:54:2: ( ^( METHOD ID type= . ( . )* ) )
            // lime\\antlr3\\Def.g:54:4: ^( METHOD ID type= . ( . )* )
            {
            match(input,METHOD,FOLLOW_METHOD_in_enterMethod217); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID1=(LimeAST)match(input,ID,FOLLOW_ID_in_enterMethod219); if (state.failed) return ;

            type=(LimeAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            // lime\\antlr3\\Def.g:54:23: ( . )*
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
                case 83:
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
            	    // lime\\antlr3\\Def.g:54:23: .
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
            		type.scope = currentScope;
            		MethodSymbol ms = new MethodSymbol((ID1!=null?ID1.getText():null),null,currentScope);
            		ms.def = ID1;            // track AST location of def's ID
            		ID1.symbol = ms;         // track in AST
            		currentScope.define(ms); // def method in class' scope
            		currentScope = ms;       // set current scope to method scope
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



    // $ANTLR start "exitMethod"
    // lime\\antlr3\\Def.g:66:1: exitMethod : METHOD ;
    public final void exitMethod() throws RecognitionException {
        try {
            // lime\\antlr3\\Def.g:67:2: ( METHOD )
            // lime\\antlr3\\Def.g:67:4: METHOD
            {
            match(input,METHOD,FOLLOW_METHOD_in_exitMethod242); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			System.out.println("exitMethod-----args: "+currentScope);
            			currentScope = currentScope.getEnclosingScope();    // pop method scope
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
    // $ANTLR end "exitMethod"



    // $ANTLR start "enterAction"
    // lime\\antlr3\\Def.g:72:1: enterAction : ^( ACTION ID ( . )* ) ;
    public final void enterAction() throws RecognitionException {
        LimeAST ID2=null;

        try {
            // lime\\antlr3\\Def.g:73:2: ( ^( ACTION ID ( . )* ) )
            // lime\\antlr3\\Def.g:73:4: ^( ACTION ID ( . )* )
            {
            match(input,ACTION,FOLLOW_ACTION_in_enterAction262); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID2=(LimeAST)match(input,ID,FOLLOW_ID_in_enterAction264); if (state.failed) return ;

            // lime\\antlr3\\Def.g:73:16: ( . )*
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
                case 83:
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
            	    // lime\\antlr3\\Def.g:73:16: .
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
            			System.out.println("line "+ID2.getLine()+": def action "+(ID2!=null?ID2.getText():null));
            			MethodSymbol ms = new MethodSymbol((ID2!=null?ID2.getText():null),null,currentScope);
            			ms.def = ID2;            // track AST location of def's ID
            			ID2.symbol = ms;         // track in AST
            			currentScope.define(ms); // def method in class' scope
            			currentScope = ms;       // set current scope to action scope
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
    // $ANTLR end "enterAction"



    // $ANTLR start "exitAction"
    // lime\\antlr3\\Def.g:83:1: exitAction : ACTION ;
    public final void exitAction() throws RecognitionException {
        try {
            // lime\\antlr3\\Def.g:84:2: ( ACTION )
            // lime\\antlr3\\Def.g:84:4: ACTION
            {
            match(input,ACTION,FOLLOW_ACTION_in_exitAction282); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			System.out.println("exitAction-----args: "+currentScope);
            			currentScope = currentScope.getEnclosingScope();    // pop method scope
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
    // $ANTLR end "exitAction"



    // $ANTLR start "enterClass"
    // lime\\antlr3\\Def.g:90:1: enterClass : ^( CLASS name= ID ( ^( INHERIT sup= ID ) )? . ) ;
    public final void enterClass() throws RecognitionException {
        LimeAST name=null;
        LimeAST sup=null;

        try {
            // lime\\antlr3\\Def.g:91:5: ( ^( CLASS name= ID ( ^( INHERIT sup= ID ) )? . ) )
            // lime\\antlr3\\Def.g:91:9: ^( CLASS name= ID ( ^( INHERIT sup= ID ) )? . )
            {
            match(input,CLASS,FOLLOW_CLASS_in_enterClass302); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            name=(LimeAST)match(input,ID,FOLLOW_ID_in_enterClass306); if (state.failed) return ;

            // lime\\antlr3\\Def.g:91:25: ( ^( INHERIT sup= ID ) )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case INHERIT:
                    {
                    switch ( input.LA(2) ) {
                        case DOWN:
                            {
                            switch ( input.LA(3) ) {
                                case ID:
                                    {
                                    switch ( input.LA(4) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(5) ) {
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
                                                case 83:
                                                    {
                                                    alt5=1;
                                                    }
                                                    break;
                                            }

                                            }
                                            break;
                                    }

                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // lime\\antlr3\\Def.g:91:26: ^( INHERIT sup= ID )
                    {
                    match(input,INHERIT,FOLLOW_INHERIT_in_enterClass310); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(LimeAST)match(input,ID,FOLLOW_ID_in_enterClass314); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) { // def class but leave superclass blank until ref phase
            		System.out.println("line "+name.getLine()+ ": def class "+(name!=null?name.getText():null));
            		// record scope in AST for next pass
            		if ( sup!=null ) sup.scope = currentScope; 
            		ClassSymbol cs = new ClassSymbol((name!=null?name.getText():null),currentScope,null);
            		cs.def = name;           // point from symbol table into AST
            		name.symbol = cs;        // point from AST into symbol table
            		currentScope.define(cs);  // def class in current scope
            		currentScope = cs;        // set current scope to class scope
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



    // $ANTLR start "exitClass"
    // lime\\antlr3\\Def.g:104:1: exitClass : CLASS ;
    public final void exitClass() throws RecognitionException {
        try {
            // lime\\antlr3\\Def.g:105:5: ( CLASS )
            // lime\\antlr3\\Def.g:105:9: CLASS
            {
            match(input,CLASS,FOLLOW_CLASS_in_exitClass340); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            			System.out.println("exitClass-----members: "+currentScope);
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
    // $ANTLR end "exitClass"



    // $ANTLR start "atoms"
    // lime\\antlr3\\Def.g:113:1: atoms :{...}? ( 'this' |name= ID ) ;
    public final void atoms() throws RecognitionException {
        LimeAST name=null;

        LimeAST t = (LimeAST)input.LT(1);
        try {
            // lime\\antlr3\\Def.g:115:5: ({...}? ( 'this' |name= ID ) )
            // lime\\antlr3\\Def.g:115:8: {...}? ( 'this' |name= ID )
            {
            if ( !((t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "atoms", "t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)");
            }

            // lime\\antlr3\\Def.g:115:54: ( 'this' |name= ID )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // lime\\antlr3\\Def.g:115:55: 'this'
                    {
                    match(input,83,FOLLOW_83_in_atoms378); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // lime\\antlr3\\Def.g:115:63: name= ID
                    {
                    name=(LimeAST)match(input,ID,FOLLOW_ID_in_atoms383); if (state.failed) return ;

                    }
                    break;

            }


            if ( state.backtracking==1 ) {
            			System.out.println("atoms "+name.getLine()+" " +(name!=null?name.getText():null));
            			t.scope = currentScope;
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
    // $ANTLR end "atoms"



    // $ANTLR start "varDeclaration"
    // lime\\antlr3\\Def.g:124:1: varDeclaration : ^( ( ATTR_DECL | VAR_DECL | ARG_DECL ) type= . ID ( . )? ) ;
    public final void varDeclaration() throws RecognitionException {
        LimeAST ID3=null;
        LimeAST type=null;

        try {
            // lime\\antlr3\\Def.g:125:5: ( ^( ( ATTR_DECL | VAR_DECL | ARG_DECL ) type= . ID ( . )? ) )
            // lime\\antlr3\\Def.g:125:9: ^( ( ATTR_DECL | VAR_DECL | ARG_DECL ) type= . ID ( . )? )
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
            type=(LimeAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            ID3=(LimeAST)match(input,ID,FOLLOW_ID_in_varDeclaration434); if (state.failed) return ;

            // lime\\antlr3\\Def.g:125:57: ( . )?
            int alt7=2;
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
                case 83:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // lime\\antlr3\\Def.g:125:57: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            			System.out.println("var declaration: line "+ID3.getLine()+": def "+(ID3!=null?ID3.getText():null));
            			type.scope = currentScope;
            			VariableSymbol vs = new VariableSymbol((ID3!=null?ID3.getText():null),null);
            			vs.def = ID3;            // track AST location of def's ID
            			ID3.symbol = vs;         // track in AST
            			currentScope.define(vs);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_enterBlock_in_topdown61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterMethod_in_topdown71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterAction_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enterClass_in_topdown86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_topdown96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atoms_in_topdown106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitBlock_in_bottomup125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitMethod_in_bottomup135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitAction_in_bottomup140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitClass_in_bottomup150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_enterBlock172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_exitBlock193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_in_enterMethod217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterMethod219 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_METHOD_in_exitMethod242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_enterAction262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterAction264 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_ACTION_in_exitAction282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_enterClass302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass306 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_INHERIT_in_enterClass310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_enterClass314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_exitClass340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_atoms378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atoms383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_varDeclaration416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_varDeclaration434 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0x00000000000FFFFFL});

}