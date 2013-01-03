package com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqliteModelLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=6;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int RULE_NUMBER=4;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=7;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalSqliteModelLexer() {;} 
    public InternalSqliteModelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSqliteModelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11:7: ( '*' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:12:7: ( '/' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:12:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:13:7: ( '%' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:13:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:14:7: ( '+' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:14:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:15:7: ( '-' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:16:7: ( '<<' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:16:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17:7: ( '>>' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:18:7: ( '&' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:18:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:19:7: ( '|' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:19:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:20:7: ( '<' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:21:7: ( '<=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:21:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:22:7: ( '>' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:22:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:23:7: ( '>=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:23:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:24:7: ( '=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:25:7: ( '==' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:25:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:26:7: ( '!=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:26:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:27:7: ( '<>' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:27:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:28:7: ( 'is' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:28:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:29:7: ( 'is not' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:29:9: 'is not'
            {
            match("is not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:30:7: ( 'in' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:30:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:31:7: ( 'like' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:31:9: 'like'
            {
            match("like"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:32:7: ( 'glob' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:32:9: 'glob'
            {
            match("glob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:33:7: ( 'match' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:33:9: 'match'
            {
            match("match"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:34:7: ( 'regexp' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:34:9: 'regexp'
            {
            match("regexp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:35:7: ( 'is null' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:35:9: 'is null'
            {
            match("is null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:36:7: ( 'not null' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:36:9: 'not null'
            {
            match("not null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:37:7: ( 'notnull' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:37:9: 'notnull'
            {
            match("notnull"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:38:7: ( 'before' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:38:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:39:7: ( 'after' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:39:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:40:7: ( 'delete' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:40:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:41:7: ( 'insert' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:41:9: 'insert'
            {
            match("insert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:42:7: ( 'replace' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:42:9: 'replace'
            {
            match("replace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:43:7: ( 'union all' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:43:9: 'union all'
            {
            match("union all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:44:7: ( 'union' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:44:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:45:7: ( 'intersect' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:45:9: 'intersect'
            {
            match("intersect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:46:7: ( 'except' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:46:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:47:7: ( 'text' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:47:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:48:7: ( 'integer' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:48:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:49:7: ( 'real' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:49:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:50:7: ( 'blob' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:50:9: 'blob'
            {
            match("blob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:51:7: ( 'boolean' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:51:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:52:7: ( 'none' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:52:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:53:7: ( 'numeric' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:53:9: 'numeric'
            {
            match("numeric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:54:7: ( 'rollback' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:54:9: 'rollback'
            {
            match("rollback"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:55:7: ( 'abort' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:55:9: 'abort'
            {
            match("abort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:56:7: ( 'fail' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:56:9: 'fail'
            {
            match("fail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:57:7: ( 'ignore' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:57:9: 'ignore'
            {
            match("ignore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:58:7: ( 'package' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:58:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:59:7: ( 'database' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:59:9: 'database'
            {
            match("database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:60:7: ( '{' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:60:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:61:7: ( '}' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:61:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:62:7: ( 'config' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:62:9: 'config'
            {
            match("config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:63:7: ( 'action' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:63:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:64:7: ( 'active' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:64:9: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:65:7: ( 'migration' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:65:9: 'migration'
            {
            match("migration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:66:7: ( ';' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:66:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:67:7: ( '(' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:67:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:68:7: ( ')' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:68:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:69:7: ( 'case' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:69:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:70:7: ( 'end' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:70:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:71:7: ( 'else' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:71:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:72:7: ( ',' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:72:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:73:7: ( 'cast' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:73:9: 'cast'
            {
            match("cast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:74:7: ( 'as' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:74:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:75:7: ( 'when' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:75:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:76:7: ( 'then' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:76:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:77:7: ( 'create' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:77:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:78:7: ( 'table' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:78:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:79:7: ( 'view' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:79:9: 'view'
            {
            match("view"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:80:7: ( 'trigger' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:80:9: 'trigger'
            {
            match("trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:81:7: ( 'on' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:81:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:82:7: ( 'begin' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:82:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:83:7: ( 'instead' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:83:9: 'instead'
            {
            match("instead"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:84:7: ( 'of' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:84:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:85:7: ( 'update' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:85:9: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:86:7: ( 'for' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:86:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:87:7: ( 'each' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:87:9: 'each'
            {
            match("each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:88:7: ( 'row' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:88:9: 'row'
            {
            match("row"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:89:7: ( 'alter' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:89:9: 'alter'
            {
            match("alter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:90:7: ( 'drop' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:90:9: 'drop'
            {
            match("drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:91:7: ( 'if' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:91:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:92:7: ( 'exists' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:92:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:93:7: ( 'from' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:93:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:94:7: ( 'where' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:94:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:95:7: ( 'into' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:95:9: 'into'
            {
            match("into"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:96:7: ( 'or' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:96:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:97:7: ( 'values' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:97:9: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:98:7: ( 'default' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:98:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:99:8: ( 'set' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:99:10: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:100:8: ( 'order' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:100:10: 'order'
            {
            match("order"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:101:8: ( 'by' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:101:10: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:102:8: ( 'rename to' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:102:10: 'rename to'
            {
            match("rename to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:103:8: ( 'add column' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:103:10: 'add column'
            {
            match("add column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:104:8: ( 'primary' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:104:10: 'primary'
            {
            match("primary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:105:8: ( 'key' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:105:10: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:106:8: ( 'not' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:106:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:107:8: ( 'null' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:107:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:108:8: ( 'unique' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:108:10: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:109:8: ( 'constraint' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:109:10: 'constraint'
            {
            match("constraint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:110:8: ( 'check' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:110:10: 'check'
            {
            match("check"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:111:8: ( 'select' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:111:10: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:112:8: ( 'group' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:112:10: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:113:8: ( 'having' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:113:10: 'having'
            {
            match("having"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:114:8: ( 'join' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:114:10: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:115:8: ( 'conflict' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:115:10: 'conflict'
            {
            match("conflict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:116:8: ( '.' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:116:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:117:8: ( '||' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:117:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:118:8: ( 'and' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:118:10: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:119:8: ( 'asc' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:119:10: 'asc'
            {
            match("asc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:120:8: ( 'desc' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:120:10: 'desc'
            {
            match("desc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:121:8: ( 'autoincrement' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:121:10: 'autoincrement'
            {
            match("autoincrement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:122:8: ( 'distinct' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:122:10: 'distinct'
            {
            match("distinct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:123:8: ( 'all' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:123:10: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:124:8: ( 'natural' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:124:10: 'natural'
            {
            match("natural"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:125:8: ( 'left' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:125:10: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:126:8: ( 'outer' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:126:10: 'outer'
            {
            match("outer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:127:8: ( 'inner' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:127:10: 'inner'
            {
            match("inner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:128:8: ( 'cross' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:128:10: 'cross'
            {
            match("cross"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:129:8: ( 'current_time' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:129:10: 'current_time'
            {
            match("current_time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:130:8: ( 'current_date' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:130:10: 'current_date'
            {
            match("current_date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:131:8: ( 'current_time_stamp' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:131:10: 'current_time_stamp'
            {
            match("current_time_stamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17076:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17078:10: ( '$$$don\\'t use this anymore$$$' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17078:12: '$$$don\\'t use this anymore$$$'
            {
            match("$$$don't use this anymore$$$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17080:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17082:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17082:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17082:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17082:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17082:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17084:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17084:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17084:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17084:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:41: ( '\\r' )? '\\n'
                    {
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17086:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17088:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17088:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17088:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17090:16: ( . )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17090:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=129;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:442: T__84
                {
                mT__84(); 

                }
                break;
            case 74 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:448: T__85
                {
                mT__85(); 

                }
                break;
            case 75 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:454: T__86
                {
                mT__86(); 

                }
                break;
            case 76 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:460: T__87
                {
                mT__87(); 

                }
                break;
            case 77 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:466: T__88
                {
                mT__88(); 

                }
                break;
            case 78 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:472: T__89
                {
                mT__89(); 

                }
                break;
            case 79 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:478: T__90
                {
                mT__90(); 

                }
                break;
            case 80 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:484: T__91
                {
                mT__91(); 

                }
                break;
            case 81 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:490: T__92
                {
                mT__92(); 

                }
                break;
            case 82 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:496: T__93
                {
                mT__93(); 

                }
                break;
            case 83 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:502: T__94
                {
                mT__94(); 

                }
                break;
            case 84 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:508: T__95
                {
                mT__95(); 

                }
                break;
            case 85 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:514: T__96
                {
                mT__96(); 

                }
                break;
            case 86 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:520: T__97
                {
                mT__97(); 

                }
                break;
            case 87 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:526: T__98
                {
                mT__98(); 

                }
                break;
            case 88 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:532: T__99
                {
                mT__99(); 

                }
                break;
            case 89 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:538: T__100
                {
                mT__100(); 

                }
                break;
            case 90 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:545: T__101
                {
                mT__101(); 

                }
                break;
            case 91 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:552: T__102
                {
                mT__102(); 

                }
                break;
            case 92 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:559: T__103
                {
                mT__103(); 

                }
                break;
            case 93 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:566: T__104
                {
                mT__104(); 

                }
                break;
            case 94 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:573: T__105
                {
                mT__105(); 

                }
                break;
            case 95 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:580: T__106
                {
                mT__106(); 

                }
                break;
            case 96 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:587: T__107
                {
                mT__107(); 

                }
                break;
            case 97 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:594: T__108
                {
                mT__108(); 

                }
                break;
            case 98 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:601: T__109
                {
                mT__109(); 

                }
                break;
            case 99 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:608: T__110
                {
                mT__110(); 

                }
                break;
            case 100 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:615: T__111
                {
                mT__111(); 

                }
                break;
            case 101 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:622: T__112
                {
                mT__112(); 

                }
                break;
            case 102 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:629: T__113
                {
                mT__113(); 

                }
                break;
            case 103 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:636: T__114
                {
                mT__114(); 

                }
                break;
            case 104 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:643: T__115
                {
                mT__115(); 

                }
                break;
            case 105 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:650: T__116
                {
                mT__116(); 

                }
                break;
            case 106 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:657: T__117
                {
                mT__117(); 

                }
                break;
            case 107 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:664: T__118
                {
                mT__118(); 

                }
                break;
            case 108 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:671: T__119
                {
                mT__119(); 

                }
                break;
            case 109 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:678: T__120
                {
                mT__120(); 

                }
                break;
            case 110 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:685: T__121
                {
                mT__121(); 

                }
                break;
            case 111 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:692: T__122
                {
                mT__122(); 

                }
                break;
            case 112 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:699: T__123
                {
                mT__123(); 

                }
                break;
            case 113 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:706: T__124
                {
                mT__124(); 

                }
                break;
            case 114 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:713: T__125
                {
                mT__125(); 

                }
                break;
            case 115 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:720: T__126
                {
                mT__126(); 

                }
                break;
            case 116 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:727: T__127
                {
                mT__127(); 

                }
                break;
            case 117 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:734: T__128
                {
                mT__128(); 

                }
                break;
            case 118 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:741: T__129
                {
                mT__129(); 

                }
                break;
            case 119 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:748: T__130
                {
                mT__130(); 

                }
                break;
            case 120 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:755: T__131
                {
                mT__131(); 

                }
                break;
            case 121 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:762: T__132
                {
                mT__132(); 

                }
                break;
            case 122 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:769: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 123 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:781: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 124 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:790: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 125 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:802: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 126 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:810: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 127 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:826: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 128 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:842: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 129 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:850: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\52\1\uffff\1\65\3\uffff\1\74\1\77\1\uffff\1\102\1\104\1\61\16"+
        "\112\2\uffff\1\112\4\uffff\7\112\1\u008b\2\uffff\4\61\27\uffff\1"+
        "\u0090\1\u0094\1\112\1\u0096\1\uffff\16\112\1\u00ac\3\112\1\u00b1"+
        "\27\112\2\uffff\5\112\4\uffff\3\112\1\u00d6\1\u00d7\1\u00d9\5\112"+
        "\6\uffff\3\112\1\uffff\1\112\1\uffff\13\112\1\u00f2\1\u00f5\10\112"+
        "\1\uffff\3\112\1\u0101\1\uffff\1\112\1\u0103\1\112\1\u0105\13\112"+
        "\1\u0112\7\112\1\u011a\14\112\2\uffff\1\112\1\uffff\1\112\1\u012c"+
        "\1\112\1\u012e\2\112\1\uffff\3\112\1\u0137\2\112\1\u013a\1\u013b"+
        "\1\u013c\5\112\1\u0142\2\112\2\uffff\1\112\1\uffff\1\u0146\1\112"+
        "\1\u0148\3\112\1\u014c\4\112\1\uffff\1\112\3\uffff\3\112\1\u0156"+
        "\1\112\1\u0158\6\112\1\uffff\1\u015f\1\u0160\1\u0161\1\u0162\2\112"+
        "\1\u0165\1\uffff\1\u0166\4\112\1\u016c\1\u016d\4\112\1\u0172\1\112"+
        "\1\u0174\3\112\1\uffff\1\112\1\uffff\1\112\1\u017a\2\uffff\4\112"+
        "\1\uffff\1\u017f\1\112\3\uffff\1\u0181\1\u0182\3\112\1\uffff\3\112"+
        "\1\uffff\1\112\1\uffff\2\112\1\u018c\1\uffff\1\112\1\u018e\1\u018f"+
        "\2\112\1\u0192\3\112\1\uffff\1\112\1\uffff\1\112\1\u0199\4\112\4"+
        "\uffff\1\u019e\1\112\2\uffff\5\112\2\uffff\1\112\1\u01a6\1\u01a7"+
        "\1\112\1\uffff\1\u01a9\1\uffff\1\112\1\u01ab\1\u01ac\2\112\1\uffff"+
        "\1\u01af\3\112\1\uffff\1\u01b3\2\uffff\1\112\1\u01b5\6\112\1\u01bc"+
        "\1\uffff\1\112\2\uffff\1\u01be\1\u01bf\1\uffff\1\112\1\u01c1\3\112"+
        "\2\uffff\1\u01c5\1\u01c6\1\u01c7\1\u01c8\1\uffff\3\112\1\u01cc\2"+
        "\112\1\u01cf\2\uffff\1\112\1\uffff\1\u01d1\2\uffff\1\u01d2\1\u01d3"+
        "\1\uffff\1\u01d4\1\112\1\u01d6\1\uffff\1\112\1\uffff\1\u01d8\1\uffff"+
        "\1\112\1\u01da\1\u01db\1\u01dc\1\uffff\1\u01dd\2\uffff\1\112\1\uffff"+
        "\1\u01df\2\112\4\uffff\1\u01e2\1\u01e3\1\u01e4\1\uffff\2\112\1\uffff"+
        "\1\112\4\uffff\1\112\1\uffff\1\112\1\uffff\1\u01ea\4\uffff\1\112"+
        "\1\uffff\1\u01ec\1\u01ed\3\uffff\1\u01ee\2\112\1\u01f2\1\u01f3\1"+
        "\uffff\1\112\3\uffff\3\112\2\uffff\1\112\1\u01f9\3\112\1\uffff\3"+
        "\112\1\u0201\1\u0202\1\u0203\1\112\3\uffff\4\112\1\u0209\1\uffff";
    static final String DFA14_eofS =
        "\u020a\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\52\3\uffff\1\74\1\75\1\uffff\1\174\2\75\1\146\1\145"+
        "\1\154\1\141\1\145\1\141\1\145\1\142\1\141\1\156\4\141\2\uffff\1"+
        "\141\4\uffff\1\150\1\141\1\146\2\145\1\141\1\157\1\60\2\uffff\1"+
        "\44\2\0\1\101\27\uffff\1\40\1\60\1\156\1\60\1\uffff\1\153\1\146"+
        "\2\157\1\164\1\147\1\141\1\154\1\156\1\154\1\164\1\146\2\157\1\60"+
        "\1\164\1\157\1\164\1\60\1\154\2\144\1\164\1\146\1\164\1\157\1\163"+
        "\1\151\1\144\1\143\1\144\1\163\1\143\1\170\1\145\1\142\2\151\1\162"+
        "\1\157\1\143\1\151\2\uffff\1\156\1\163\2\145\1\162\4\uffff\2\145"+
        "\1\154\3\60\1\164\1\154\1\171\1\166\1\151\4\uffff\1\156\1\uffff"+
        "\3\145\1\uffff\1\157\1\uffff\1\145\1\164\1\142\1\165\1\143\1\162"+
        "\1\145\2\154\1\141\1\154\1\60\1\40\2\145\1\154\1\165\1\157\1\151"+
        "\1\142\1\154\1\uffff\1\145\1\162\1\151\1\60\1\uffff\1\145\1\60\1"+
        "\40\1\60\1\157\1\145\1\141\1\143\1\141\1\160\1\164\1\157\1\141\1"+
        "\145\1\163\1\60\1\145\1\150\1\164\1\156\1\154\1\147\1\154\1\60\1"+
        "\155\1\153\1\155\1\146\1\145\1\141\1\163\1\143\1\162\1\156\1\167"+
        "\1\165\2\uffff\1\145\1\uffff\1\145\1\60\1\145\1\60\1\151\1\156\1"+
        "\157\1\162\1\145\1\147\1\60\2\162\3\60\1\160\1\150\1\141\1\170\1"+
        "\141\1\60\1\155\1\142\2\uffff\1\165\1\uffff\1\60\1\162\1\60\2\162"+
        "\1\156\1\60\1\145\1\162\1\164\1\157\1\uffff\1\162\3\uffff\1\151"+
        "\1\164\1\165\1\60\1\142\1\60\1\151\1\156\1\165\1\164\1\160\1\164"+
        "\1\uffff\4\60\1\145\1\147\1\60\1\uffff\1\60\2\141\1\151\1\164\2"+
        "\60\1\164\1\163\1\153\1\145\1\60\1\145\1\60\1\145\2\162\1\uffff"+
        "\1\143\1\uffff\1\156\1\60\2\uffff\1\164\1\141\1\163\1\145\1\uffff"+
        "\1\60\1\145\3\uffff\2\60\1\164\1\160\1\143\1\uffff\1\145\1\141\1"+
        "\154\1\uffff\1\151\1\uffff\1\141\1\145\1\60\1\uffff\1\141\2\60\1"+
        "\156\1\145\1\60\1\156\1\145\1\154\1\uffff\1\141\1\uffff\1\156\1"+
        "\40\2\145\1\164\1\163\4\uffff\1\60\1\145\2\uffff\1\147\1\162\1\147"+
        "\1\151\1\162\2\uffff\1\145\2\60\1\156\1\uffff\1\60\1\uffff\1\163"+
        "\2\60\1\164\1\147\1\uffff\1\60\1\144\1\145\1\162\1\uffff\1\60\2"+
        "\uffff\1\151\1\60\1\145\1\40\1\143\1\154\1\143\1\154\1\60\1\uffff"+
        "\1\156\2\uffff\2\60\1\uffff\1\143\1\60\1\164\1\163\1\143\2\uffff"+
        "\4\60\1\uffff\1\162\1\145\1\171\1\60\1\143\1\141\1\60\2\uffff\1"+
        "\164\1\uffff\1\60\2\uffff\2\60\1\uffff\1\60\1\143\1\60\1\uffff\1"+
        "\157\1\uffff\1\60\1\uffff\1\153\3\60\1\uffff\1\60\2\uffff\1\162"+
        "\1\uffff\1\60\1\145\1\164\4\uffff\3\60\1\uffff\1\164\1\151\1\uffff"+
        "\1\137\4\uffff\1\164\1\uffff\1\156\1\uffff\1\60\4\uffff\1\145\1"+
        "\uffff\2\60\3\uffff\1\60\1\156\1\144\2\60\1\uffff\1\155\3\uffff"+
        "\1\164\1\151\1\141\2\uffff\1\145\1\60\1\155\1\164\1\156\1\uffff"+
        "\2\145\1\164\3\60\1\163\3\uffff\1\164\1\141\1\155\1\160\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\57\3\uffff\2\76\1\uffff\1\174\2\75\1\163\1\151"+
        "\1\162\1\151\1\157\1\165\1\171\1\165\1\162\1\160\1\170\3\162\2\uffff"+
        "\1\165\4\uffff\1\150\1\151\1\165\2\145\1\141\1\157\1\71\2\uffff"+
        "\1\44\2\uffff\1\172\27\uffff\2\172\1\156\1\172\1\uffff\1\153\1\146"+
        "\2\157\1\164\1\147\1\160\1\167\1\164\1\155\1\164\1\147\2\157\1\172"+
        "\1\164\1\157\1\164\1\172\1\164\2\144\1\164\1\163\1\164\1\157\1\163"+
        "\1\151\1\144\1\151\1\144\1\163\1\143\1\170\1\145\1\142\2\151\1\162"+
        "\1\157\1\143\1\151\2\uffff\1\156\1\163\1\157\1\145\1\162\4\uffff"+
        "\2\145\1\154\3\172\2\164\1\171\1\166\1\151\4\uffff\1\156\1\uffff"+
        "\1\164\1\157\1\145\1\uffff\1\157\1\uffff\1\145\1\164\1\142\1\165"+
        "\1\143\1\162\1\145\2\154\1\141\1\154\2\172\2\145\1\154\1\165\1\157"+
        "\1\151\1\142\1\154\1\uffff\1\145\1\162\1\151\1\172\1\uffff\1\145"+
        "\1\172\1\40\1\172\1\157\1\145\1\141\1\143\1\141\1\160\1\164\1\161"+
        "\1\141\1\145\1\163\1\172\1\145\1\150\1\164\1\156\1\154\1\147\1\154"+
        "\1\172\1\155\1\153\1\155\1\163\1\164\1\141\1\163\1\143\2\162\1\167"+
        "\1\165\2\uffff\1\145\1\uffff\1\145\1\172\1\145\1\172\1\151\1\156"+
        "\1\165\1\162\1\145\1\162\1\172\2\162\3\172\1\160\1\150\1\141\1\170"+
        "\1\141\1\172\1\155\1\142\2\uffff\1\165\1\uffff\1\172\1\162\1\172"+
        "\2\162\1\156\1\172\1\145\1\162\1\164\1\166\1\uffff\1\162\3\uffff"+
        "\1\151\1\164\1\165\1\172\1\142\1\172\1\151\1\156\1\165\1\164\1\160"+
        "\1\164\1\uffff\4\172\1\145\1\147\1\172\1\uffff\1\172\2\141\1\154"+
        "\1\164\2\172\1\164\1\163\1\153\1\145\1\172\1\145\1\172\1\145\2\162"+
        "\1\uffff\1\143\1\uffff\1\156\1\172\2\uffff\1\164\1\141\1\163\1\145"+
        "\1\uffff\1\172\1\145\3\uffff\2\172\1\164\1\160\1\143\1\uffff\1\145"+
        "\1\141\1\154\1\uffff\1\151\1\uffff\1\141\1\145\1\172\1\uffff\1\141"+
        "\2\172\1\156\1\145\1\172\1\156\1\145\1\154\1\uffff\1\141\1\uffff"+
        "\1\156\1\172\2\145\1\164\1\163\4\uffff\1\172\1\145\2\uffff\1\147"+
        "\1\162\1\147\1\151\1\162\2\uffff\1\145\2\172\1\156\1\uffff\1\172"+
        "\1\uffff\1\163\2\172\1\164\1\147\1\uffff\1\172\1\144\1\145\1\162"+
        "\1\uffff\1\172\2\uffff\1\151\1\172\1\145\1\40\1\143\1\154\1\143"+
        "\1\154\1\172\1\uffff\1\156\2\uffff\2\172\1\uffff\1\143\1\172\1\164"+
        "\1\163\1\143\2\uffff\4\172\1\uffff\1\162\1\145\1\171\1\172\1\143"+
        "\1\141\1\172\2\uffff\1\164\1\uffff\1\172\2\uffff\2\172\1\uffff\1"+
        "\172\1\143\1\172\1\uffff\1\157\1\uffff\1\172\1\uffff\1\153\3\172"+
        "\1\uffff\1\172\2\uffff\1\162\1\uffff\1\172\1\145\1\164\4\uffff\3"+
        "\172\1\uffff\1\164\1\151\1\uffff\1\137\4\uffff\1\164\1\uffff\1\156"+
        "\1\uffff\1\172\4\uffff\1\145\1\uffff\2\172\3\uffff\1\172\1\156\1"+
        "\164\2\172\1\uffff\1\155\3\uffff\1\164\1\151\1\141\2\uffff\1\145"+
        "\1\172\1\155\1\164\1\156\1\uffff\2\145\1\164\3\172\1\163\3\uffff"+
        "\1\164\1\141\1\155\1\160\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\2\uffff\1\10\21\uffff\1\62\1\63"+
        "\1\uffff\1\70\1\71\1\72\1\76\10\uffff\2\172\4\uffff\1\175\1\u0080"+
        "\1\u0081\1\1\1\176\1\177\1\2\1\3\1\4\1\5\1\6\1\13\1\21\1\12\1\7"+
        "\1\15\1\14\1\10\1\153\1\11\1\17\1\16\1\20\4\uffff\1\175\52\uffff"+
        "\1\62\1\63\5\uffff\1\70\1\71\1\72\1\76\13\uffff\1\152\1\173\1\174"+
        "\1\u0080\1\uffff\1\22\3\uffff\1\24\1\uffff\1\121\25\uffff\1\133"+
        "\4\uffff\1\100\44\uffff\1\107\1\112\1\uffff\1\126\30\uffff\1\116"+
        "\1\32\1\uffff\1\140\13\uffff\1\155\1\uffff\1\161\1\135\1\154\14"+
        "\uffff\1\74\7\uffff\1\114\21\uffff\1\131\1\uffff\1\137\2\uffff\1"+
        "\23\1\31\4\uffff\1\125\2\uffff\1\25\1\163\1\26\5\uffff\1\47\3\uffff"+
        "\1\52\1\uffff\1\141\3\uffff\1\50\11\uffff\1\156\1\uffff\1\120\6"+
        "\uffff\1\75\1\115\1\45\1\102\2\uffff\1\56\1\123\5\uffff\1\73\1\77"+
        "\4\uffff\1\101\1\uffff\1\105\5\uffff\1\150\4\uffff\1\165\1\uffff"+
        "\1\146\1\27\11\uffff\1\110\1\uffff\1\35\1\55\2\uffff\1\117\5\uffff"+
        "\1\41\1\42\4\uffff\1\104\7\uffff\1\166\1\144\1\uffff\1\124\1\uffff"+
        "\1\132\1\164\2\uffff\1\37\3\uffff\1\57\1\uffff\1\30\1\uffff\1\134"+
        "\4\uffff\1\34\1\uffff\1\65\1\66\1\uffff\1\36\3\uffff\1\142\1\113"+
        "\1\44\1\122\3\uffff\1\64\2\uffff\1\103\1\uffff\1\127\1\145\1\147"+
        "\1\111\1\uffff\1\46\1\uffff\1\40\1\uffff\1\33\1\53\1\162\1\51\1"+
        "\uffff\1\130\2\uffff\1\106\1\60\1\136\5\uffff\1\54\1\uffff\1\61"+
        "\1\160\1\151\3\uffff\1\43\1\67\5\uffff\1\143\7\uffff\1\167\1\170"+
        "\1\157\5\uffff\1\171";
    static final String DFA14_specialS =
        "\1\2\53\uffff\1\0\1\1\u01dc\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\13\1\54\1\61\1\53\1\3\1\10"+
            "\1\55\1\36\1\37\1\1\1\4\1\40\1\5\1\50\1\2\12\51\1\61\1\35\1"+
            "\6\1\12\1\7\2\61\32\57\3\61\1\56\1\57\1\61\1\23\1\22\1\34\1"+
            "\24\1\26\1\30\1\16\1\46\1\14\1\47\1\45\1\15\1\17\1\21\1\43\1"+
            "\31\1\57\1\20\1\44\1\27\1\25\1\42\1\41\3\57\1\32\1\11\1\33\uff82"+
            "\61",
            "",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "",
            "\1\71\1\72\1\73",
            "\1\76\1\75",
            "",
            "\1\101",
            "\1\103",
            "\1\105",
            "\1\111\1\110\6\uffff\1\107\4\uffff\1\106",
            "\1\114\3\uffff\1\113",
            "\1\115\5\uffff\1\116",
            "\1\117\7\uffff\1\120",
            "\1\121\11\uffff\1\122",
            "\1\125\15\uffff\1\123\5\uffff\1\124",
            "\1\126\6\uffff\1\127\2\uffff\1\130\11\uffff\1\131",
            "\1\133\1\134\1\137\1\uffff\1\132\5\uffff\1\136\1\uffff\1\140"+
            "\4\uffff\1\135\1\uffff\1\141",
            "\1\143\3\uffff\1\142\3\uffff\1\145\10\uffff\1\144",
            "\1\146\1\uffff\1\147",
            "\1\153\12\uffff\1\152\1\uffff\1\151\11\uffff\1\150",
            "\1\156\3\uffff\1\154\2\uffff\1\155\11\uffff\1\157",
            "\1\160\15\uffff\1\161\2\uffff\1\162",
            "\1\163\20\uffff\1\164",
            "",
            "",
            "\1\170\6\uffff\1\172\6\uffff\1\167\2\uffff\1\171\2\uffff\1"+
            "\173",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0082\7\uffff\1\u0081",
            "\1\u0084\7\uffff\1\u0083\3\uffff\1\u0085\2\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\52",
            "",
            "",
            "\1\u008c",
            "\0\u008d",
            "\0\u008d",
            "\32\112\4\uffff\1\112\1\uffff\32\112",
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
            "\1\u008f\17\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\15\112\1\u0093"+
            "\4\112\1\u0091\1\u0092\6\112",
            "\1\u0095",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009f\5\uffff\1\u009d\6\uffff\1\u00a0\1\uffff\1\u009e",
            "\1\u00a1\12\uffff\1\u00a2",
            "\1\u00a4\5\uffff\1\u00a3",
            "\1\u00a6\1\u00a5",
            "\1\u00a7",
            "\1\u00a8\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\2\112\1\u00b0"+
            "\27\112",
            "\1\u00b3\7\uffff\1\u00b2",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b8\5\uffff\1\u00b7\6\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf\5\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\11\uffff\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\3\112\1\u00d8"+
            "\26\112",
            "\1\u00da",
            "\1\u00dc\7\uffff\1\u00db",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "",
            "",
            "\1\u00e0",
            "",
            "\1\u00e1\16\uffff\1\u00e2",
            "\1\u00e3\11\uffff\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u00f3\17\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\15\112\1\u00f4\14\112",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u0102",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0104",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d\1\uffff\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e\14\uffff\1\u011f",
            "\1\u0120\16\uffff\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126\3\uffff\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "",
            "\1\u012a",
            "",
            "\1\u012b",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u012d",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131\5\uffff\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0136\12\uffff\1\u0135",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0138",
            "\1\u0139",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0143",
            "\1\u0144",
            "",
            "",
            "\1\u0145",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0147",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150\6\uffff\1\u0151",
            "",
            "\1\u0152",
            "",
            "",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0157",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0163",
            "\1\u0164",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169\2\uffff\1\u016a",
            "\1\u016b",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0173",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "",
            "\1\u0178",
            "",
            "\1\u0179",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0180",
            "",
            "",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\u018b",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u018d",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0190",
            "\1\u0191",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "",
            "\1\u0196",
            "",
            "\1\u0197",
            "\1\u0198\17\uffff\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff"+
            "\32\112",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "",
            "",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u019f",
            "",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "",
            "\1\u01a5",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01a8",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01aa",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01ad",
            "\1\u01ae",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "\1\u01b4",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01bd",
            "",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01c0",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01cd",
            "\1\u01ce",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "\1\u01d0",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01d5",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01d7",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01d9",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "\1\u01de",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "",
            "",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "",
            "\1\u01e7",
            "",
            "",
            "",
            "",
            "\1\u01e8",
            "",
            "\1\u01e9",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "",
            "",
            "\1\u01eb",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "",
            "",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01ef",
            "\1\u01f1\17\uffff\1\u01f0",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "",
            "\1\u01f4",
            "",
            "",
            "",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "",
            "",
            "\1\u01f8",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\12\112\7\uffff\32\112\4\uffff\1\u0200\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            "\1\u0204",
            "",
            "",
            "",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\12\112\7\uffff\32\112\4\uffff\1\112\1\uffff\32\112",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( ((LA14_44>='\u0000' && LA14_44<='\uFFFF')) ) {s = 141;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( ((LA14_45>='\u0000' && LA14_45<='\uFFFF')) ) {s = 141;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='*') ) {s = 1;}

                        else if ( (LA14_0=='/') ) {s = 2;}

                        else if ( (LA14_0=='%') ) {s = 3;}

                        else if ( (LA14_0=='+') ) {s = 4;}

                        else if ( (LA14_0=='-') ) {s = 5;}

                        else if ( (LA14_0=='<') ) {s = 6;}

                        else if ( (LA14_0=='>') ) {s = 7;}

                        else if ( (LA14_0=='&') ) {s = 8;}

                        else if ( (LA14_0=='|') ) {s = 9;}

                        else if ( (LA14_0=='=') ) {s = 10;}

                        else if ( (LA14_0=='!') ) {s = 11;}

                        else if ( (LA14_0=='i') ) {s = 12;}

                        else if ( (LA14_0=='l') ) {s = 13;}

                        else if ( (LA14_0=='g') ) {s = 14;}

                        else if ( (LA14_0=='m') ) {s = 15;}

                        else if ( (LA14_0=='r') ) {s = 16;}

                        else if ( (LA14_0=='n') ) {s = 17;}

                        else if ( (LA14_0=='b') ) {s = 18;}

                        else if ( (LA14_0=='a') ) {s = 19;}

                        else if ( (LA14_0=='d') ) {s = 20;}

                        else if ( (LA14_0=='u') ) {s = 21;}

                        else if ( (LA14_0=='e') ) {s = 22;}

                        else if ( (LA14_0=='t') ) {s = 23;}

                        else if ( (LA14_0=='f') ) {s = 24;}

                        else if ( (LA14_0=='p') ) {s = 25;}

                        else if ( (LA14_0=='{') ) {s = 26;}

                        else if ( (LA14_0=='}') ) {s = 27;}

                        else if ( (LA14_0=='c') ) {s = 28;}

                        else if ( (LA14_0==';') ) {s = 29;}

                        else if ( (LA14_0=='(') ) {s = 30;}

                        else if ( (LA14_0==')') ) {s = 31;}

                        else if ( (LA14_0==',') ) {s = 32;}

                        else if ( (LA14_0=='w') ) {s = 33;}

                        else if ( (LA14_0=='v') ) {s = 34;}

                        else if ( (LA14_0=='o') ) {s = 35;}

                        else if ( (LA14_0=='s') ) {s = 36;}

                        else if ( (LA14_0=='k') ) {s = 37;}

                        else if ( (LA14_0=='h') ) {s = 38;}

                        else if ( (LA14_0=='j') ) {s = 39;}

                        else if ( (LA14_0=='.') ) {s = 40;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 41;}

                        else if ( (LA14_0=='$') ) {s = 43;}

                        else if ( (LA14_0=='\"') ) {s = 44;}

                        else if ( (LA14_0=='\'') ) {s = 45;}

                        else if ( (LA14_0=='^') ) {s = 46;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='q'||(LA14_0>='x' && LA14_0<='z')) ) {s = 47;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 48;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='#'||LA14_0==':'||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 49;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}