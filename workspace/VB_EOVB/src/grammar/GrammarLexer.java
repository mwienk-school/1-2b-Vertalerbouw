// $ANTLR 3.4 /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g 2012-07-09 11:48:54

	package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int AND=5;
    public static final int ARG=6;
    public static final int ARGUMENTUSE=7;
    public static final int ARITHMETIC=8;
    public static final int ASSIGN=9;
    public static final int BOOLEAN=10;
    public static final int CALLABLE=11;
    public static final int CHAR=12;
    public static final int CHARACTER=13;
    public static final int CHARAND=14;
    public static final int CHARFALSE=15;
    public static final int CHARNOT=16;
    public static final int CHAROR=17;
    public static final int CHARTRUE=18;
    public static final int CLOSEDCOMPOUND=19;
    public static final int COLON=20;
    public static final int COMMA=21;
    public static final int COMMENT=22;
    public static final int COMPOUND=23;
    public static final int CONDITIONAL=24;
    public static final int DECLARATION=25;
    public static final int DECLARGUMENTS=26;
    public static final int DIGIT=27;
    public static final int DIVIDE=28;
    public static final int DO=29;
    public static final int ELSE=30;
    public static final int EQUAL=31;
    public static final int EXPRESSION=32;
    public static final int EXPRESSIONS=33;
    public static final int FI=34;
    public static final int FUNCTIONDECLARATION=35;
    public static final int GREATER=36;
    public static final int GREATEREQ=37;
    public static final int IDENTIFIER=38;
    public static final int IF=39;
    public static final int INTEGER=40;
    public static final int LCURLY=41;
    public static final int LETTER=42;
    public static final int LOWER=43;
    public static final int LPAREN=44;
    public static final int MINUS=45;
    public static final int MULTI=46;
    public static final int NOT=47;
    public static final int NOTEQUAL=48;
    public static final int NUMBER=49;
    public static final int OD=50;
    public static final int OR=51;
    public static final int PLUS=52;
    public static final int PRINT=53;
    public static final int PROCEDUREDECLARATION=54;
    public static final int PROGRAM=55;
    public static final int QUOTE=56;
    public static final int RCURLY=57;
    public static final int READ=58;
    public static final int RETURN=59;
    public static final int ROUTINECALL=60;
    public static final int RPAREN=61;
    public static final int SEMICOLON=62;
    public static final int SINGLEQUOTE=63;
    public static final int SMALLER=64;
    public static final int SMALLEREQ=65;
    public static final int STRING=66;
    public static final int SUBEXPRESSION=67;
    public static final int TEXT=68;
    public static final int THEN=69;
    public static final int UPPER=70;
    public static final int VOID=71;
    public static final int WHILE=72;
    public static final int WS=73;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GrammarLexer() {} 
    public GrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g"; }

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:11:11: ( '&' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:11:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:12:5: ( '&&' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:12:7: '&&'
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
    // $ANTLR end "AND"

    // $ANTLR start "ARG"
    public final void mARG() throws RecognitionException {
        try {
            int _type = ARG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:13:5: ( 'arg' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:13:7: 'arg'
            {
            match("arg"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARG"

    // $ANTLR start "ARGUMENTUSE"
    public final void mARGUMENTUSE() throws RecognitionException {
        try {
            int _type = ARGUMENTUSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:14:13: ( 'argumentuse' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:14:15: 'argumentuse'
            {
            match("argumentuse"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARGUMENTUSE"

    // $ANTLR start "ARITHMETIC"
    public final void mARITHMETIC() throws RecognitionException {
        try {
            int _type = ARITHMETIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:15:12: ( 'arithmetic' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:15:14: 'arithmetic'
            {
            match("arithmetic"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARITHMETIC"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:16:8: ( '=' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:16:10: '='
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
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:17:9: ( 'boolean' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:17:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "CALLABLE"
    public final void mCALLABLE() throws RecognitionException {
        try {
            int _type = CALLABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:18:10: ( 'callable' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:18:12: 'callable'
            {
            match("callable"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CALLABLE"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:19:6: ( 'char' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:19:8: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CHARAND"
    public final void mCHARAND() throws RecognitionException {
        try {
            int _type = CHARAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:20:9: ( 'and' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:20:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARAND"

    // $ANTLR start "CHARFALSE"
    public final void mCHARFALSE() throws RecognitionException {
        try {
            int _type = CHARFALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:21:11: ( 'false' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:21:13: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARFALSE"

    // $ANTLR start "CHARNOT"
    public final void mCHARNOT() throws RecognitionException {
        try {
            int _type = CHARNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:22:9: ( 'not' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:22:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARNOT"

    // $ANTLR start "CHAROR"
    public final void mCHAROR() throws RecognitionException {
        try {
            int _type = CHAROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:23:8: ( 'or' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:23:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAROR"

    // $ANTLR start "CHARTRUE"
    public final void mCHARTRUE() throws RecognitionException {
        try {
            int _type = CHARTRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:24:10: ( 'true' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:24:12: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARTRUE"

    // $ANTLR start "CLOSEDCOMPOUND"
    public final void mCLOSEDCOMPOUND() throws RecognitionException {
        try {
            int _type = CLOSEDCOMPOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:25:16: ( 'closedCompound' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:25:18: 'closedCompound'
            {
            match("closedCompound"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEDCOMPOUND"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:26:7: ( ':' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:26:9: ':'
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
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:27:7: ( ',' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:27:9: ','
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
    // $ANTLR end "COMMA"

    // $ANTLR start "COMPOUND"
    public final void mCOMPOUND() throws RecognitionException {
        try {
            int _type = COMPOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:28:10: ( 'compound' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:28:12: 'compound'
            {
            match("compound"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPOUND"

    // $ANTLR start "CONDITIONAL"
    public final void mCONDITIONAL() throws RecognitionException {
        try {
            int _type = CONDITIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:29:13: ( 'conditional' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:29:15: 'conditional'
            {
            match("conditional"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONDITIONAL"

    // $ANTLR start "DECLARATION"
    public final void mDECLARATION() throws RecognitionException {
        try {
            int _type = DECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:30:13: ( 'declaration' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:30:15: 'declaration'
            {
            match("declaration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECLARATION"

    // $ANTLR start "DECLARGUMENTS"
    public final void mDECLARGUMENTS() throws RecognitionException {
        try {
            int _type = DECLARGUMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:31:15: ( 'declarguments' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:31:17: 'declarguments'
            {
            match("declarguments"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECLARGUMENTS"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:32:8: ( '/' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:32:10: '/'
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
    // $ANTLR end "DIVIDE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:33:4: ( 'do' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:33:6: 'do'
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
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:34:6: ( 'else' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:34:8: 'else'
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
    // $ANTLR end "ELSE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:35:7: ( '==' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:35:9: '=='
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
    // $ANTLR end "EQUAL"

    // $ANTLR start "EXPRESSION"
    public final void mEXPRESSION() throws RecognitionException {
        try {
            int _type = EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:36:12: ( 'expression' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:36:14: 'expression'
            {
            match("expression"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPRESSION"

    // $ANTLR start "EXPRESSIONS"
    public final void mEXPRESSIONS() throws RecognitionException {
        try {
            int _type = EXPRESSIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:37:13: ( 'expressions' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:37:15: 'expressions'
            {
            match("expressions"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPRESSIONS"

    // $ANTLR start "FI"
    public final void mFI() throws RecognitionException {
        try {
            int _type = FI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:38:4: ( 'fi' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:38:6: 'fi'
            {
            match("fi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FI"

    // $ANTLR start "FUNCTIONDECLARATION"
    public final void mFUNCTIONDECLARATION() throws RecognitionException {
        try {
            int _type = FUNCTIONDECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:39:21: ( 'functiondeclaration' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:39:23: 'functiondeclaration'
            {
            match("functiondeclaration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTIONDECLARATION"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:40:9: ( '>' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:40:11: '>'
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
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATEREQ"
    public final void mGREATEREQ() throws RecognitionException {
        try {
            int _type = GREATEREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:41:11: ( '>=' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:41:13: '>='
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
    // $ANTLR end "GREATEREQ"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:42:4: ( 'if' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:42:6: 'if'
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
    // $ANTLR end "IF"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:43:9: ( 'int' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:43:11: 'int'
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
    // $ANTLR end "INTEGER"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:44:8: ( '{' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:44:10: '{'
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
    // $ANTLR end "LCURLY"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:45:8: ( '(' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:45:10: '('
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
    // $ANTLR end "LPAREN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:46:7: ( '-' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:46:9: '-'
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
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTI"
    public final void mMULTI() throws RecognitionException {
        try {
            int _type = MULTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:47:7: ( '*' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:47:9: '*'
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
    // $ANTLR end "MULTI"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:48:5: ( '!' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:48:7: '!'
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
    // $ANTLR end "NOT"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:49:10: ( '!=' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:49:12: '!='
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
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "OD"
    public final void mOD() throws RecognitionException {
        try {
            int _type = OD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:50:4: ( 'od' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:50:6: 'od'
            {
            match("od"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OD"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:51:4: ( '||' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:51:6: '||'
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
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:52:6: ( '+' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:52:8: '+'
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
    // $ANTLR end "PLUS"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:53:7: ( 'print' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:53:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "PROCEDUREDECLARATION"
    public final void mPROCEDUREDECLARATION() throws RecognitionException {
        try {
            int _type = PROCEDUREDECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:54:22: ( 'proceduredeclaration' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:54:24: 'proceduredeclaration'
            {
            match("proceduredeclaration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROCEDUREDECLARATION"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:55:9: ( 'program' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:55:11: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:56:7: ( '\"' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:56:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:57:8: ( '}' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:57:10: '}'
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
    // $ANTLR end "RCURLY"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:58:6: ( 'read' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:58:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:59:8: ( 'return' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:59:10: 'return'
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
    // $ANTLR end "RETURN"

    // $ANTLR start "ROUTINECALL"
    public final void mROUTINECALL() throws RecognitionException {
        try {
            int _type = ROUTINECALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:60:13: ( 'routinecall' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:60:15: 'routinecall'
            {
            match("routinecall"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROUTINECALL"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:61:8: ( ')' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:61:10: ')'
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
    // $ANTLR end "RPAREN"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:62:11: ( ';' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:62:13: ';'
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
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "SINGLEQUOTE"
    public final void mSINGLEQUOTE() throws RecognitionException {
        try {
            int _type = SINGLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:63:13: ( '\\'' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:63:15: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLEQUOTE"

    // $ANTLR start "SMALLER"
    public final void mSMALLER() throws RecognitionException {
        try {
            int _type = SMALLER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:64:9: ( '<' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:64:11: '<'
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
    // $ANTLR end "SMALLER"

    // $ANTLR start "SMALLEREQ"
    public final void mSMALLEREQ() throws RecognitionException {
        try {
            int _type = SMALLEREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:65:11: ( '<=' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:65:13: '<='
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
    // $ANTLR end "SMALLEREQ"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:66:8: ( 'string' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:66:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "SUBEXPRESSION"
    public final void mSUBEXPRESSION() throws RecognitionException {
        try {
            int _type = SUBEXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:67:15: ( 'subexpression' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:67:17: 'subexpression'
            {
            match("subexpression"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBEXPRESSION"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:68:6: ( 'then' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:68:8: 'then'
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
    // $ANTLR end "THEN"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:69:6: ( 'void' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:69:8: 'void'
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
    // $ANTLR end "VOID"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:70:7: ( 'while' )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:70:9: 'while'
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
    // $ANTLR end "WHILE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:393:2: ( QUOTE (~ ( '\"' | '\\n' | '\\r' ) )* QUOTE )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:393:4: QUOTE (~ ( '\"' | '\\n' | '\\r' ) )* QUOTE
            {
            mQUOTE(); 


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:393:10: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop1;
                }
            } while (true);


            mQUOTE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:397:2: ( SINGLEQUOTE ~ '\\'' SINGLEQUOTE )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:397:4: SINGLEQUOTE ~ '\\'' SINGLEQUOTE
            {
            mSINGLEQUOTE(); 


            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            mSINGLEQUOTE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:401:6: ( LETTER ( LETTER | DIGIT )* )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:401:11: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:401:18: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:405:6: ( ( MINUS )? ( DIGIT )+ )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:405:11: ( MINUS )? ( DIGIT )+
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:405:11: ( MINUS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
                    {
                    if ( input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:405:18: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:409:6: ( ( '//' ( . )* '\\n' | '/*' ( . )* '*/' ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:409:11: ( '//' ( . )* '\\n' | '/*' ( . )* '*/' )
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:409:11: ( '//' ( . )* '\\n' | '/*' ( . )* '*/' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='/') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='*') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:409:12: '//' ( . )* '\\n'
                    {
                    match("//"); 



                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:409:17: ( . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\n') ) {
                            alt5=2;
                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:409:17: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match('\n'); 

                    }
                    break;
                case 2 :
                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:410:8: '/*' ( . )* '*/'
                    {
                    match("/*"); 



                    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:410:13: ( . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*') ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1=='/') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:410:13: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    match("*/"); 



                    }
                    break;

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
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:415:6: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:415:11: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:415:11: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||(LA8_0 >= '\f' && LA8_0 <= '\r')||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:419:17: ( ( '0' .. '9' ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:420:17: ( ( 'a' .. 'z' ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:421:17: ( ( 'A' .. 'Z' ) )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
    // $ANTLR end "UPPER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:422:17: ( LOWER | UPPER )
            // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

    public void mTokens() throws RecognitionException {
        // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:8: ( AMPERSAND | AND | ARG | ARGUMENTUSE | ARITHMETIC | ASSIGN | BOOLEAN | CALLABLE | CHAR | CHARAND | CHARFALSE | CHARNOT | CHAROR | CHARTRUE | CLOSEDCOMPOUND | COLON | COMMA | COMPOUND | CONDITIONAL | DECLARATION | DECLARGUMENTS | DIVIDE | DO | ELSE | EQUAL | EXPRESSION | EXPRESSIONS | FI | FUNCTIONDECLARATION | GREATER | GREATEREQ | IF | INTEGER | LCURLY | LPAREN | MINUS | MULTI | NOT | NOTEQUAL | OD | OR | PLUS | PRINT | PROCEDUREDECLARATION | PROGRAM | QUOTE | RCURLY | READ | RETURN | ROUTINECALL | RPAREN | SEMICOLON | SINGLEQUOTE | SMALLER | SMALLEREQ | STRING | SUBEXPRESSION | THEN | VOID | WHILE | TEXT | CHARACTER | IDENTIFIER | NUMBER | COMMENT | WS )
        int alt9=66;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:10: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 2 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:20: AND
                {
                mAND(); 


                }
                break;
            case 3 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:24: ARG
                {
                mARG(); 


                }
                break;
            case 4 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:28: ARGUMENTUSE
                {
                mARGUMENTUSE(); 


                }
                break;
            case 5 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:40: ARITHMETIC
                {
                mARITHMETIC(); 


                }
                break;
            case 6 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:51: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 7 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:58: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 8 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:66: CALLABLE
                {
                mCALLABLE(); 


                }
                break;
            case 9 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:75: CHAR
                {
                mCHAR(); 


                }
                break;
            case 10 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:80: CHARAND
                {
                mCHARAND(); 


                }
                break;
            case 11 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:88: CHARFALSE
                {
                mCHARFALSE(); 


                }
                break;
            case 12 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:98: CHARNOT
                {
                mCHARNOT(); 


                }
                break;
            case 13 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:106: CHAROR
                {
                mCHAROR(); 


                }
                break;
            case 14 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:113: CHARTRUE
                {
                mCHARTRUE(); 


                }
                break;
            case 15 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:122: CLOSEDCOMPOUND
                {
                mCLOSEDCOMPOUND(); 


                }
                break;
            case 16 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:137: COLON
                {
                mCOLON(); 


                }
                break;
            case 17 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:143: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 18 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:149: COMPOUND
                {
                mCOMPOUND(); 


                }
                break;
            case 19 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:158: CONDITIONAL
                {
                mCONDITIONAL(); 


                }
                break;
            case 20 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:170: DECLARATION
                {
                mDECLARATION(); 


                }
                break;
            case 21 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:182: DECLARGUMENTS
                {
                mDECLARGUMENTS(); 


                }
                break;
            case 22 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:196: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 23 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:203: DO
                {
                mDO(); 


                }
                break;
            case 24 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:206: ELSE
                {
                mELSE(); 


                }
                break;
            case 25 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:211: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 26 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:217: EXPRESSION
                {
                mEXPRESSION(); 


                }
                break;
            case 27 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:228: EXPRESSIONS
                {
                mEXPRESSIONS(); 


                }
                break;
            case 28 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:240: FI
                {
                mFI(); 


                }
                break;
            case 29 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:243: FUNCTIONDECLARATION
                {
                mFUNCTIONDECLARATION(); 


                }
                break;
            case 30 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:263: GREATER
                {
                mGREATER(); 


                }
                break;
            case 31 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:271: GREATEREQ
                {
                mGREATEREQ(); 


                }
                break;
            case 32 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:281: IF
                {
                mIF(); 


                }
                break;
            case 33 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:284: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 34 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:292: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 35 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:299: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 36 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:306: MINUS
                {
                mMINUS(); 


                }
                break;
            case 37 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:312: MULTI
                {
                mMULTI(); 


                }
                break;
            case 38 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:318: NOT
                {
                mNOT(); 


                }
                break;
            case 39 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:322: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 40 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:331: OD
                {
                mOD(); 


                }
                break;
            case 41 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:334: OR
                {
                mOR(); 


                }
                break;
            case 42 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:337: PLUS
                {
                mPLUS(); 


                }
                break;
            case 43 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:342: PRINT
                {
                mPRINT(); 


                }
                break;
            case 44 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:348: PROCEDUREDECLARATION
                {
                mPROCEDUREDECLARATION(); 


                }
                break;
            case 45 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:369: PROGRAM
                {
                mPROGRAM(); 


                }
                break;
            case 46 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:377: QUOTE
                {
                mQUOTE(); 


                }
                break;
            case 47 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:383: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 48 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:390: READ
                {
                mREAD(); 


                }
                break;
            case 49 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:395: RETURN
                {
                mRETURN(); 


                }
                break;
            case 50 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:402: ROUTINECALL
                {
                mROUTINECALL(); 


                }
                break;
            case 51 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:414: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 52 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:421: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 53 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:431: SINGLEQUOTE
                {
                mSINGLEQUOTE(); 


                }
                break;
            case 54 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:443: SMALLER
                {
                mSMALLER(); 


                }
                break;
            case 55 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:451: SMALLEREQ
                {
                mSMALLEREQ(); 


                }
                break;
            case 56 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:461: STRING
                {
                mSTRING(); 


                }
                break;
            case 57 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:468: SUBEXPRESSION
                {
                mSUBEXPRESSION(); 


                }
                break;
            case 58 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:482: THEN
                {
                mTHEN(); 


                }
                break;
            case 59 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:487: VOID
                {
                mVOID(); 


                }
                break;
            case 60 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:492: WHILE
                {
                mWHILE(); 


                }
                break;
            case 61 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:498: TEXT
                {
                mTEXT(); 


                }
                break;
            case 62 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:503: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 63 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:513: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 64 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:524: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 65 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:531: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 66 :
                // /home/mark/Documenten/School/1-2b-Vertalerbouw/workspace/VB_EOVB/src/grammar/Grammar.g:1:539: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\47\1\43\1\53\6\43\2\uffff\1\43\1\74\1\43\1\100\1\43\2"+
        "\uffff\1\103\1\uffff\1\105\2\uffff\1\43\1\107\1\uffff\1\43\2\uffff"+
        "\1\113\1\116\3\43\5\uffff\2\43\2\uffff\6\43\1\135\2\43\1\140\1\141"+
        "\3\43\1\145\2\uffff\2\43\2\uffff\1\150\1\43\3\uffff\1\43\2\uffff"+
        "\2\43\4\uffff\4\43\1\164\1\43\1\166\7\43\1\uffff\1\43\1\177\2\uffff"+
        "\3\43\1\uffff\2\43\1\uffff\1\u0085\12\43\1\uffff\1\43\1\uffff\2"+
        "\43\1\u0094\5\43\1\uffff\1\u009a\1\u009b\1\43\1\u009d\1\43\1\uffff"+
        "\3\43\1\u00a2\4\43\1\u00a7\5\43\1\uffff\3\43\1\u00b0\1\43\2\uffff"+
        "\1\43\1\uffff\1\43\1\u00b4\2\43\1\uffff\4\43\1\uffff\1\u00bb\7\43"+
        "\1\uffff\3\43\1\uffff\2\43\1\u00c9\1\43\1\u00cb\1\43\1\uffff\2\43"+
        "\1\u00cf\11\43\1\u00d9\1\uffff\1\43\1\uffff\3\43\1\uffff\1\u00de"+
        "\1\43\1\u00e0\6\43\1\uffff\4\43\1\uffff\1\43\1\uffff\11\43\1\u00f5"+
        "\5\43\1\u00fc\3\43\1\u0100\1\uffff\1\43\1\u0102\1\43\1\u0104\1\43"+
        "\1\u0106\1\uffff\1\43\1\u0108\1\43\1\uffff\1\43\1\uffff\1\43\1\uffff"+
        "\1\43\1\uffff\1\43\1\uffff\3\43\1\u0111\1\43\1\u0113\1\u0114\1\43"+
        "\1\uffff\1\43\2\uffff\10\43\1\u011f\1\43\1\uffff\1\u0121\1\uffff";
    static final String DFA9_eofS =
        "\u0122\uffff";
    static final String DFA9_minS =
        "\1\11\1\46\1\156\1\75\1\157\2\141\1\157\1\144\1\150\2\uffff\1\145"+
        "\1\52\1\154\1\75\1\146\2\uffff\1\60\1\uffff\1\75\2\uffff\1\162\1"+
        "\0\1\uffff\1\145\2\uffff\1\0\1\75\1\164\1\157\1\150\5\uffff\1\147"+
        "\1\144\2\uffff\1\157\1\154\1\141\1\157\1\155\1\154\1\60\1\156\1"+
        "\164\2\60\1\165\1\145\1\143\1\60\2\uffff\1\163\1\160\2\uffff\1\60"+
        "\1\164\3\uffff\1\151\2\uffff\1\141\1\165\4\uffff\1\162\1\142\2\151"+
        "\1\60\1\164\1\60\2\154\1\162\1\163\1\160\1\144\1\163\1\uffff\1\143"+
        "\1\60\2\uffff\1\145\1\156\1\154\1\uffff\1\145\1\162\1\uffff\1\60"+
        "\1\156\1\143\1\144\1\165\1\164\1\151\1\145\1\144\1\154\1\155\1\uffff"+
        "\1\150\1\uffff\1\145\1\141\1\60\1\145\1\157\1\151\1\145\1\164\1"+
        "\uffff\2\60\1\141\1\60\1\145\1\uffff\1\164\1\145\1\162\1\60\1\162"+
        "\1\151\1\156\1\170\1\60\2\145\1\155\1\141\1\142\1\uffff\1\144\1"+
        "\165\1\164\1\60\1\151\2\uffff\1\162\1\uffff\1\163\1\60\1\144\1\141"+
        "\1\uffff\2\156\1\147\1\160\1\uffff\1\60\1\156\1\145\1\156\1\154"+
        "\1\103\1\156\1\151\1\uffff\1\157\1\141\1\163\1\uffff\1\165\1\155"+
        "\1\60\1\145\1\60\1\162\1\uffff\2\164\1\60\1\145\1\157\1\144\1\157"+
        "\1\156\1\164\1\165\1\151\1\162\1\60\1\uffff\1\143\1\uffff\1\145"+
        "\1\165\1\151\1\uffff\1\60\1\155\1\60\1\156\1\144\1\151\1\155\1\157"+
        "\1\145\1\uffff\1\141\2\163\1\143\1\uffff\1\160\1\uffff\1\141\1\145"+
        "\1\157\1\145\1\156\1\144\1\154\1\163\1\145\1\60\1\157\1\154\1\143"+
        "\2\156\1\60\1\145\1\154\1\151\1\60\1\uffff\1\165\1\60\1\154\1\60"+
        "\1\164\1\60\1\uffff\1\143\1\60\1\157\1\uffff\1\156\1\uffff\1\141"+
        "\1\uffff\1\163\1\uffff\1\154\1\uffff\1\156\1\144\1\162\1\60\1\141"+
        "\2\60\1\141\1\uffff\1\162\2\uffff\1\164\1\141\1\151\1\164\1\157"+
        "\1\151\1\156\1\157\1\60\1\156\1\uffff\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\175\1\46\1\162\1\75\2\157\1\165\1\157\2\162\2\uffff\1\157\1\57"+
        "\1\170\1\75\1\156\2\uffff\1\71\1\uffff\1\75\2\uffff\1\162\1\uffff"+
        "\1\uffff\1\157\2\uffff\1\uffff\1\75\1\165\1\157\1\150\5\uffff\1"+
        "\151\1\144\2\uffff\1\157\1\154\1\141\1\157\1\156\1\154\1\172\1\156"+
        "\1\164\2\172\1\165\1\145\1\143\1\172\2\uffff\1\163\1\160\2\uffff"+
        "\1\172\1\164\3\uffff\1\157\2\uffff\1\164\1\165\4\uffff\1\162\1\142"+
        "\2\151\1\172\1\164\1\172\2\154\1\162\1\163\1\160\1\144\1\163\1\uffff"+
        "\1\143\1\172\2\uffff\1\145\1\156\1\154\1\uffff\1\145\1\162\1\uffff"+
        "\1\172\1\156\1\147\1\144\1\165\1\164\1\151\1\145\1\144\1\154\1\155"+
        "\1\uffff\1\150\1\uffff\1\145\1\141\1\172\1\145\1\157\1\151\1\145"+
        "\1\164\1\uffff\2\172\1\141\1\172\1\145\1\uffff\1\164\1\145\1\162"+
        "\1\172\1\162\1\151\1\156\1\170\1\172\2\145\1\155\1\141\1\142\1\uffff"+
        "\1\144\1\165\1\164\1\172\1\151\2\uffff\1\162\1\uffff\1\163\1\172"+
        "\1\144\1\141\1\uffff\2\156\1\147\1\160\1\uffff\1\172\1\156\1\145"+
        "\1\156\1\154\1\103\1\156\1\151\1\uffff\1\157\1\147\1\163\1\uffff"+
        "\1\165\1\155\1\172\1\145\1\172\1\162\1\uffff\2\164\1\172\1\145\1"+
        "\157\1\144\1\157\1\156\1\164\1\165\1\151\1\162\1\172\1\uffff\1\143"+
        "\1\uffff\1\145\1\165\1\151\1\uffff\1\172\1\155\1\172\1\156\1\144"+
        "\1\151\1\155\1\157\1\145\1\uffff\1\141\2\163\1\143\1\uffff\1\160"+
        "\1\uffff\1\141\1\145\1\157\1\145\1\156\1\144\1\154\1\163\1\145\1"+
        "\172\1\157\1\154\1\143\2\156\1\172\1\145\1\154\1\151\1\172\1\uffff"+
        "\1\165\1\172\1\154\1\172\1\164\1\172\1\uffff\1\143\1\172\1\157\1"+
        "\uffff\1\156\1\uffff\1\141\1\uffff\1\163\1\uffff\1\154\1\uffff\1"+
        "\156\1\144\1\162\1\172\1\141\2\172\1\141\1\uffff\1\162\2\uffff\1"+
        "\164\1\141\1\151\1\164\1\157\1\151\1\156\1\157\1\172\1\156\1\uffff"+
        "\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\12\uffff\1\20\1\21\5\uffff\1\42\1\43\1\uffff\1\45\1\uffff\1\51"+
        "\1\52\2\uffff\1\57\1\uffff\1\63\1\64\5\uffff\1\77\1\100\1\102\1"+
        "\2\1\1\2\uffff\1\31\1\6\17\uffff\1\101\1\26\2\uffff\1\37\1\36\2"+
        "\uffff\1\44\1\47\1\46\1\uffff\1\56\1\75\2\uffff\1\65\1\76\1\67\1"+
        "\66\16\uffff\1\34\2\uffff\1\15\1\50\3\uffff\1\27\2\uffff\1\40\13"+
        "\uffff\1\3\1\uffff\1\12\10\uffff\1\14\5\uffff\1\41\16\uffff\1\11"+
        "\5\uffff\1\16\1\72\1\uffff\1\30\4\uffff\1\60\4\uffff\1\73\10\uffff"+
        "\1\13\3\uffff\1\53\6\uffff\1\74\15\uffff\1\61\1\uffff\1\70\3\uffff"+
        "\1\7\11\uffff\1\55\4\uffff\1\10\1\uffff\1\22\24\uffff\1\5\6\uffff"+
        "\1\32\3\uffff\1\4\1\uffff\1\23\1\uffff\1\24\1\uffff\1\33\1\uffff"+
        "\1\62\10\uffff\1\25\1\uffff\1\71\1\17\12\uffff\1\35\1\uffff\1\54";
    static final String DFA9_specialS =
        "\31\uffff\1\0\4\uffff\1\1\u0103\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\45\1\uffff\2\45\22\uffff\1\45\1\25\1\31\3\uffff\1\1\1\36"+
            "\1\22\1\34\1\24\1\27\1\13\1\23\1\uffff\1\15\12\44\1\12\1\35"+
            "\1\37\1\3\1\17\2\uffff\32\43\6\uffff\1\2\1\4\1\5\1\14\1\16\1"+
            "\6\2\43\1\20\4\43\1\7\1\10\1\30\1\43\1\33\1\40\1\11\1\43\1\41"+
            "\1\42\3\43\1\21\1\26\1\32",
            "\1\46",
            "\1\51\3\uffff\1\50",
            "\1\52",
            "\1\54",
            "\1\55\6\uffff\1\56\3\uffff\1\57\2\uffff\1\60",
            "\1\61\7\uffff\1\62\13\uffff\1\63",
            "\1\64",
            "\1\66\15\uffff\1\65",
            "\1\70\11\uffff\1\67",
            "",
            "",
            "\1\71\11\uffff\1\72",
            "\1\73\4\uffff\1\73",
            "\1\75\13\uffff\1\76",
            "\1\77",
            "\1\101\7\uffff\1\102",
            "",
            "",
            "\12\44",
            "",
            "\1\104",
            "",
            "",
            "\1\106",
            "\12\110\1\uffff\2\110\1\uffff\ufff2\110",
            "",
            "\1\111\11\uffff\1\112",
            "",
            "",
            "\47\114\1\uffff\uffd8\114",
            "\1\115",
            "\1\117\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123\1\uffff\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132\1\133",
            "\1\134",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\136",
            "\1\137",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "",
            "\1\146",
            "\1\147",
            "",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\151",
            "",
            "",
            "",
            "\1\152\5\uffff\1\153",
            "",
            "",
            "\1\154\22\uffff\1\155",
            "\1\156",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\43\7\uffff\32\43\6\uffff\24\43\1\163\5\43",
            "\1\165",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0086",
            "\1\u0087\3\uffff\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u009c",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4\5\uffff\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00ca",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00df",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\43\7\uffff\32\43\6\uffff\22\43\1\u00fb\7\43",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "\1\u0101",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0103",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0105",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "",
            "\1\u0107",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0109",
            "",
            "\1\u010a",
            "",
            "\1\u010b",
            "",
            "\1\u010c",
            "",
            "\1\u010d",
            "",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0112",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0115",
            "",
            "\1\u0116",
            "",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            "\1\u0120",
            "",
            "\12\43\7\uffff\32\43\6\uffff\32\43",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AMPERSAND | AND | ARG | ARGUMENTUSE | ARITHMETIC | ASSIGN | BOOLEAN | CALLABLE | CHAR | CHARAND | CHARFALSE | CHARNOT | CHAROR | CHARTRUE | CLOSEDCOMPOUND | COLON | COMMA | COMPOUND | CONDITIONAL | DECLARATION | DECLARGUMENTS | DIVIDE | DO | ELSE | EQUAL | EXPRESSION | EXPRESSIONS | FI | FUNCTIONDECLARATION | GREATER | GREATEREQ | IF | INTEGER | LCURLY | LPAREN | MINUS | MULTI | NOT | NOTEQUAL | OD | OR | PLUS | PRINT | PROCEDUREDECLARATION | PROGRAM | QUOTE | RCURLY | READ | RETURN | ROUTINECALL | RPAREN | SEMICOLON | SINGLEQUOTE | SMALLER | SMALLEREQ | STRING | SUBEXPRESSION | THEN | VOID | WHILE | TEXT | CHARACTER | IDENTIFIER | NUMBER | COMMENT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_25 = input.LA(1);

                        s = -1;
                        if ( ((LA9_25 >= '\u0000' && LA9_25 <= '\t')||(LA9_25 >= '\u000B' && LA9_25 <= '\f')||(LA9_25 >= '\u000E' && LA9_25 <= '\uFFFF')) ) {s = 72;}

                        else s = 71;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA9_30 = input.LA(1);

                        s = -1;
                        if ( ((LA9_30 >= '\u0000' && LA9_30 <= '&')||(LA9_30 >= '(' && LA9_30 <= '\uFFFF')) ) {s = 76;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}