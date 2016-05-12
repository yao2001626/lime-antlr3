// $ANTLR 3.4 lime\\antlr3\\TTree.g 2016-05-02 00:23:11


    package lime.antlr3;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Action", "Add", "And", "Assert", "Assign", "Attr", "Begin", "Bool", "Booltype", "CBrace", "CBracket", "COMMENT", "CParen", "Class", "Colon", "Comma", "Divide", "Do", "Dot", "Else", "End", "Equals", "Excl", "GT", "GTEquals", "ID", "INT", "If", "Inherit", "Initialization", "Inttype", "LETTER", "LINE_COMMENT", "LT", "LTEquals", "Method", "Modulus", "Multiply", "NEquals", "New", "Null", "OBrace", "OBracket", "OParen", "Or", "Pow", "QMark", "Return", "SColon", "STRING", "Subtract", "Super", "Then", "This", "Var", "Voidtype", "WS", "When", "While", "ACTION", "ARG", "ARGS", "ASSIGN", "ATTR", "BLOCK", "CALL", "CLASS", "DOT", "ELIST", "EXPR", "FILE", "IF", "INHERIT", "INIT", "MEMBERS", "METHOD", "RETURN", "VAR", "VAR_DECL", "WHILE", "ADD", "KEYSER", "SCRIPT", "SOZE"
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
    public static final int ADD=84;
    public static final int KEYSER=85;
    public static final int SCRIPT=86;
    public static final int SOZE=87;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TTree.tokenNames; }
    public String getGrammarFileName() { return "lime\\antlr3\\TTree.g"; }



    // $ANTLR start "a"
    // lime\\antlr3\\TTree.g:29:1: a : ( ^( SCRIPT ( stuff )+ ) | SCRIPT );
    public final void a() throws RecognitionException {
        try {
            // lime\\antlr3\\TTree.g:29:3: ( ^( SCRIPT ( stuff )+ ) | SCRIPT )
            int alt2=2;
            switch ( input.LA(1) ) {
            case SCRIPT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    alt2=1;
                    }
                    break;
                case EOF:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // lime\\antlr3\\TTree.g:29:5: ^( SCRIPT ( stuff )+ )
                    {
                    match(input,SCRIPT,FOLLOW_SCRIPT_in_a114); 

                    match(input, Token.DOWN, null); 
                    // lime\\antlr3\\TTree.g:29:14: ( stuff )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        switch ( input.LA(1) ) {
                        case ID:
                        case INT:
                        case STRING:
                        case ADD:
                        case KEYSER:
                            {
                            alt1=1;
                            }
                            break;

                        }

                        switch (alt1) {
                    	case 1 :
                    	    // lime\\antlr3\\TTree.g:29:14: stuff
                    	    {
                    	    pushFollow(FOLLOW_stuff_in_a116);
                    	    stuff();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // lime\\antlr3\\TTree.g:30:5: SCRIPT
                    {
                    match(input,SCRIPT,FOLLOW_SCRIPT_in_a124); 

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
    // $ANTLR end "a"



    // $ANTLR start "stuff"
    // lime\\antlr3\\TTree.g:33:1: stuff : ( keyser | expression );
    public final void stuff() throws RecognitionException {
        try {
            // lime\\antlr3\\TTree.g:34:3: ( keyser | expression )
            int alt3=2;
            switch ( input.LA(1) ) {
            case KEYSER:
                {
                alt3=1;
                }
                break;
            case ID:
            case INT:
            case STRING:
            case ADD:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // lime\\antlr3\\TTree.g:34:5: keyser
                    {
                    pushFollow(FOLLOW_keyser_in_stuff137);
                    keyser();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // lime\\antlr3\\TTree.g:35:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_stuff143);
                    expression();

                    state._fsp--;


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
    // $ANTLR end "stuff"



    // $ANTLR start "keyser"
    // lime\\antlr3\\TTree.g:38:1: keyser : ^( KEYSER SOZE ) ;
    public final void keyser() throws RecognitionException {
        try {
            // lime\\antlr3\\TTree.g:39:3: ( ^( KEYSER SOZE ) )
            // lime\\antlr3\\TTree.g:39:5: ^( KEYSER SOZE )
            {
            match(input,KEYSER,FOLLOW_KEYSER_in_keyser157); 

            match(input, Token.DOWN, null); 
            match(input,SOZE,FOLLOW_SOZE_in_keyser159); 

            match(input, Token.UP, null); 


             System.out.println("Found Keyser Soze!!"); 

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
    // $ANTLR end "keyser"



    // $ANTLR start "expression"
    // lime\\antlr3\\TTree.g:43:1: expression : ( ^( ADD expression expression ) | ID | INT | STRING );
    public final void expression() throws RecognitionException {
        try {
            // lime\\antlr3\\TTree.g:44:3: ( ^( ADD expression expression ) | ID | INT | STRING )
            int alt4=4;
            switch ( input.LA(1) ) {
            case ADD:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case INT:
                {
                alt4=3;
                }
                break;
            case STRING:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // lime\\antlr3\\TTree.g:44:5: ^( ADD expression expression )
                    {
                    match(input,ADD,FOLLOW_ADD_in_expression180); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression182);
                    expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression184);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // lime\\antlr3\\TTree.g:45:5: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expression191); 

                    }
                    break;
                case 3 :
                    // lime\\antlr3\\TTree.g:46:5: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expression197); 

                    }
                    break;
                case 4 :
                    // lime\\antlr3\\TTree.g:47:5: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_expression203); 

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
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_SCRIPT_in_a114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stuff_in_a116 = new BitSet(new long[]{0x0020000060000008L,0x0000000000300000L});
    public static final BitSet FOLLOW_SCRIPT_in_a124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyser_in_stuff137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_stuff143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYSER_in_keyser157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SOZE_in_keyser159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_expression180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression182 = new BitSet(new long[]{0x0020000060000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_expression_in_expression184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expression191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expression197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expression203 = new BitSet(new long[]{0x0000000000000002L});

}