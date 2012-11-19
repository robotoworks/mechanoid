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
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
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
    public static final int RULE_NUMBER=4;
    public static final int T__59=59;
    public static final int RULE_INT=7;
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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11:7: ( 'is null' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11:9: 'is null'
            {
            match("is null"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:12:7: ( 'not null' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:12:9: 'not null'
            {
            match("not null"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:13:7: ( 'notnull' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:13:9: 'notnull'
            {
            match("notnull"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:14:7: ( '=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:14:9: '='
            {
            match('='); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:15:7: ( '==' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:15:9: '=='
            {
            match("=="); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:16:7: ( '!=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:16:9: '!='
            {
            match("!="); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17:7: ( '<>' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:17:9: '<>'
            {
            match("<>"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:18:7: ( 'is' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:18:9: 'is'
            {
            match("is"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:19:7: ( 'is not' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:19:9: 'is not'
            {
            match("is not"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:20:7: ( 'in' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:20:9: 'in'
            {
            match("in"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:21:7: ( 'like' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:21:9: 'like'
            {
            match("like"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:22:7: ( 'glob' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:22:9: 'glob'
            {
            match("glob"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:23:7: ( 'match' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:23:9: 'match'
            {
            match("match"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:24:7: ( 'regexp' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:24:9: 'regexp'
            {
            match("regexp"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:25:7: ( '<' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:25:9: '<'
            {
            match('<'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:26:7: ( '<=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:26:9: '<='
            {
            match("<="); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:27:7: ( '>' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:27:9: '>'
            {
            match('>'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:28:7: ( '>=' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:28:9: '>='
            {
            match(">="); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:29:7: ( 'union all' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:29:9: 'union all'
            {
            match("union all"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:30:7: ( 'union' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:30:9: 'union'
            {
            match("union"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:31:7: ( 'intersect' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:31:9: 'intersect'
            {
            match("intersect"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:32:7: ( 'except' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:32:9: 'except'
            {
            match("except"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:33:7: ( 'text' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:33:9: 'text'
            {
            match("text"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:34:7: ( 'integer' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:34:9: 'integer'
            {
            match("integer"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:35:7: ( 'real' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:35:9: 'real'
            {
            match("real"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:36:7: ( 'blob' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:36:9: 'blob'
            {
            match("blob"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:37:7: ( 'rollback' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:37:9: 'rollback'
            {
            match("rollback"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:38:7: ( 'abort' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:38:9: 'abort'
            {
            match("abort"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:39:7: ( 'fail' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:39:9: 'fail'
            {
            match("fail"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:40:7: ( 'ignore' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:40:9: 'ignore'
            {
            match("ignore"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:41:7: ( 'replace' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:41:9: 'replace'
            {
            match("replace"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:42:7: ( 'package' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:42:9: 'package'
            {
            match("package"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:43:7: ( 'database' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:43:9: 'database'
            {
            match("database"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:44:7: ( '{' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:44:9: '{'
            {
            match('{'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:45:7: ( '}' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:45:9: '}'
            {
            match('}'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:46:7: ( 'actions' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:46:9: 'actions'
            {
            match("actions"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:47:7: ( 'migration' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:47:9: 'migration'
            {
            match("migration"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:48:7: ( ';' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:48:9: ';'
            {
            match(';'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:49:7: ( 'or' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:49:9: 'or'
            {
            match("or"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:50:7: ( 'and' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:50:9: 'and'
            {
            match("and"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:51:7: ( '/' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:51:9: '/'
            {
            match('/'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:52:7: ( '*' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:52:9: '*'
            {
            match('*'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:53:7: ( '+' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:53:9: '+'
            {
            match('+'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:54:7: ( '-' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:54:9: '-'
            {
            match('-'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:55:7: ( '(' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:55:9: '('
            {
            match('('); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:56:7: ( ')' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:56:9: ')'
            {
            match(')'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:57:7: ( 'case' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:57:9: 'case'
            {
            match("case"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:58:7: ( 'end' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:58:9: 'end'
            {
            match("end"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:59:7: ( 'else' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:59:9: 'else'
            {
            match("else"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:60:7: ( ',' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:60:9: ','
            {
            match(','); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:61:7: ( 'when' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:61:9: 'when'
            {
            match("when"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:62:7: ( 'then' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:62:9: 'then'
            {
            match("then"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:63:7: ( 'create' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:63:9: 'create'
            {
            match("create"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:64:7: ( 'table' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:64:9: 'table'
            {
            match("table"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:65:7: ( 'alter' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:65:9: 'alter'
            {
            match("alter"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:66:7: ( 'view' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:66:9: 'view'
            {
            match("view"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:67:7: ( 'as' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:67:9: 'as'
            {
            match("as"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:68:7: ( 'rename to' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:68:9: 'rename to'
            {
            match("rename to"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:69:7: ( 'add column' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:69:9: 'add column'
            {
            match("add column"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:70:7: ( 'primary' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:70:9: 'primary'
            {
            match("primary"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:71:7: ( 'key' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:71:9: 'key'
            {
            match("key"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:72:7: ( 'not' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:72:9: 'not'
            {
            match("not"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:73:7: ( 'null' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:73:9: 'null'
            {
            match("null"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:74:7: ( 'default' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:74:9: 'default'
            {
            match("default"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:75:7: ( 'unique' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:75:9: 'unique'
            {
            match("unique"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:76:7: ( 'order' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:76:9: 'order'
            {
            match("order"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:77:7: ( 'by' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:77:9: 'by'
            {
            match("by"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:78:7: ( 'select' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:78:9: 'select'
            {
            match("select"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:79:7: ( 'from' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:79:9: 'from'
            {
            match("from"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:80:7: ( 'where' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:80:9: 'where'
            {
            match("where"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:81:7: ( 'group' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:81:9: 'group'
            {
            match("group"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:82:7: ( 'join' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:82:9: 'join'
            {
            match("join"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:83:7: ( 'on' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:83:9: 'on'
            {
            match("on"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:84:7: ( '.' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:84:9: '.'
            {
            match('.'); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:85:7: ( 'conflict' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:85:9: 'conflict'
            {
            match("conflict"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:86:7: ( 'exists' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:86:9: 'exists'
            {
            match("exists"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:87:7: ( 'asc' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:87:9: 'asc'
            {
            match("asc"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:88:7: ( 'desc' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:88:9: 'desc'
            {
            match("desc"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:89:7: ( 'autoincrement' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:89:9: 'autoincrement'
            {
            match("autoincrement"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:90:7: ( 'distinct' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:90:9: 'distinct'
            {
            match("distinct"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:91:7: ( 'all' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:91:9: 'all'
            {
            match("all"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:92:7: ( 'natural' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:92:9: 'natural'
            {
            match("natural"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:93:7: ( 'left' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:93:9: 'left'
            {
            match("left"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:94:7: ( 'outer' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:94:9: 'outer'
            {
            match("outer"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:95:7: ( 'inner' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:95:9: 'inner'
            {
            match("inner"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:96:7: ( 'cross' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:96:9: 'cross'
            {
            match("cross"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:97:7: ( 'current_time' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:97:9: 'current_time'
            {
            match("current_time"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:98:7: ( 'current_date' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:98:9: 'current_date'
            {
            match("current_date"); 


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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:99:8: ( 'current_time_stamp' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:99:10: 'current_time_stamp'
            {
            match("current_time_stamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:32: ( '0' .. '9' )+
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
                    	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11512:33: '0' .. '9'
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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11514:10: ( '$$$don\\'t use this anymore$$$' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11514:12: '$$$don\\'t use this anymore$$$'
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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11516:13: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11516:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11516:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11516:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11516:66: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop4;
                }
            } while (true);

            match('\''); 

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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11518:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11518:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11518:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11518:11: '^'
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

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11518:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11520:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11520:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11520:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11520:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:41: ( '\\r' )? '\\n'
                    {
                    // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11522:41: '\\r'
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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11524:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11524:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11524:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11526:16: ( . )
            // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:11526:18: .
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
        // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=97;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:545: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 91 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:557: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 92 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:566: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 93 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:578: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 94 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:586: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 95 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:602: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:618: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 97 :
                // ../com.robotoworks.mechanoid.sqlite.ui/src-gen/com/robotoworks/mechanoid/sqlite/ui/contentassist/antlr/internal/InternalSqliteModel.g:1:626: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\46\2\60\1\65\1\54\1\71\4\60\1\103\10\60\3\uffff\1\60\1\143\5"+
        "\uffff\1\60\1\uffff\5\60\1\163\2\uffff\3\54\3\uffff\1\170\1\173"+
        "\1\60\1\uffff\3\60\6\uffff\10\60\2\uffff\10\60\1\u0094\4\60\1\u009b"+
        "\11\60\3\uffff\1\u00a7\1\u00a8\1\60\10\uffff\4\60\1\uffff\5\60\6"+
        "\uffff\2\60\1\uffff\1\60\1\u00ba\20\60\1\u00cc\5\60\1\uffff\2\60"+
        "\1\u00d4\1\60\1\u00d6\1\u00d7\1\uffff\13\60\2\uffff\10\60\1\u00ec"+
        "\2\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\u00f6\1\60\1\u00f8\1\u00f9"+
        "\1\u00fa\4\60\1\u00ff\7\60\1\uffff\1\u0107\1\u0108\1\u0109\1\60"+
        "\1\u010b\2\60\1\uffff\1\60\3\uffff\1\60\1\u0110\1\u0111\4\60\1\u0116"+
        "\3\60\1\u011a\4\60\1\u011f\1\60\1\u0121\1\uffff\1\60\1\u0123\2\uffff"+
        "\2\60\1\u0126\2\60\1\uffff\1\60\3\uffff\1\u012a\1\u012b\2\60\1\uffff"+
        "\3\60\1\u0132\3\60\3\uffff\1\u0136\1\uffff\1\u0137\1\60\1\u0139"+
        "\1\60\2\uffff\4\60\1\uffff\1\60\1\u0140\1\u0141\1\uffff\1\60\1\u0143"+
        "\2\60\1\uffff\1\u0146\1\uffff\1\60\1\uffff\2\60\1\uffff\1\u014a"+
        "\2\60\2\uffff\1\60\1\u014e\3\60\2\uffff\1\u0152\1\u0153\1\u0154"+
        "\2\uffff\1\60\1\uffff\6\60\2\uffff\1\u015c\1\uffff\2\60\1\uffff"+
        "\1\u015f\1\60\1\u0161\1\uffff\1\u0162\1\u0163\1\60\1\uffff\1\u0165"+
        "\1\uffff\1\60\3\uffff\1\u0167\1\60\1\u0169\1\u016a\1\60\1\u016c"+
        "\1\60\1\uffff\2\60\1\uffff\1\60\3\uffff\1\60\1\uffff\1\u0172\1\uffff"+
        "\1\60\2\uffff\1\u0174\1\uffff\1\u0175\1\u0176\1\60\1\u0179\1\u017a"+
        "\1\uffff\1\60\3\uffff\2\60\2\uffff\7\60\1\u0186\1\u0187\1\u0188"+
        "\1\60\3\uffff\4\60\1\u018e\1\uffff";
    static final String DFA12_eofS =
        "\u018f\uffff";
    static final String DFA12_minS =
        "\1\0\1\147\1\141\3\75\1\145\1\154\1\141\1\145\1\75\1\156\1\154\1"+
        "\141\1\154\1\142\3\141\3\uffff\1\156\1\52\5\uffff\1\141\1\uffff"+
        "\1\150\1\151\2\145\1\157\1\60\2\uffff\1\44\1\0\1\101\3\uffff\1\40"+
        "\1\60\1\156\1\uffff\1\164\1\154\1\164\6\uffff\1\153\1\146\2\157"+
        "\1\164\1\147\1\141\1\154\2\uffff\1\151\1\143\1\144\1\163\1\170\1"+
        "\145\1\142\1\157\1\60\1\157\1\164\1\144\1\154\1\60\1\144\1\164\1"+
        "\151\1\157\1\143\1\151\1\164\1\146\1\163\3\uffff\2\60\1\164\10\uffff"+
        "\1\163\1\145\1\156\1\162\1\uffff\2\145\1\171\1\154\1\151\4\uffff"+
        "\1\156\1\uffff\2\145\1\uffff\1\157\1\40\1\154\1\165\1\145\1\164"+
        "\1\142\1\165\1\143\1\162\1\145\2\154\1\141\1\154\1\157\1\145\1\163"+
        "\1\60\1\145\1\164\1\156\1\154\1\142\1\uffff\1\162\1\151\1\60\1\145"+
        "\2\60\1\uffff\1\40\1\157\1\154\1\155\1\153\1\155\2\141\1\143\1\164"+
        "\1\145\2\uffff\2\145\1\141\1\163\1\146\1\162\1\156\1\167\1\60\1"+
        "\145\1\156\1\157\1\147\2\162\1\uffff\1\165\1\uffff\1\60\1\162\3"+
        "\60\1\160\1\150\1\141\1\170\1\60\1\141\1\155\1\142\1\156\1\165\1"+
        "\160\1\164\1\uffff\3\60\1\145\1\60\1\164\1\157\1\uffff\1\162\3\uffff"+
        "\1\151\2\60\2\141\1\142\1\165\1\60\1\151\2\162\1\60\1\164\1\163"+
        "\1\154\1\145\1\60\1\145\1\60\1\uffff\1\143\1\60\2\uffff\1\163\1"+
        "\145\1\60\1\145\1\154\1\uffff\1\141\3\uffff\2\60\1\164\1\160\1\uffff"+
        "\1\143\1\145\1\141\1\40\1\145\1\164\1\163\3\uffff\1\60\1\uffff\1"+
        "\60\1\156\1\60\1\156\2\uffff\1\147\1\162\1\141\1\154\1\uffff\1\156"+
        "\2\60\1\uffff\1\145\1\60\1\151\1\156\1\uffff\1\60\1\uffff\1\164"+
        "\1\uffff\1\145\1\162\1\uffff\1\60\2\154\2\uffff\1\151\1\60\1\145"+
        "\1\40\1\143\2\uffff\3\60\2\uffff\1\163\1\uffff\1\143\1\145\1\171"+
        "\1\163\1\164\1\143\2\uffff\1\60\1\uffff\1\143\1\164\1\uffff\1\60"+
        "\1\143\1\60\1\uffff\2\60\1\157\1\uffff\1\60\1\uffff\1\153\3\uffff"+
        "\1\60\1\162\2\60\1\145\1\60\1\164\1\uffff\1\164\1\137\1\uffff\1"+
        "\164\3\uffff\1\156\1\uffff\1\60\1\uffff\1\145\2\uffff\1\60\1\uffff"+
        "\2\60\1\144\2\60\1\uffff\1\155\3\uffff\1\151\1\141\2\uffff\1\145"+
        "\1\155\1\164\1\156\2\145\1\164\3\60\1\163\3\uffff\1\164\1\141\1"+
        "\155\1\160\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\165\2\75\1\76\1\151\1\162\1\151\1\157\1\75\1\156"+
        "\1\170\1\150\1\171\1\165\2\162\1\151\3\uffff\1\165\1\57\5\uffff"+
        "\1\165\1\uffff\1\150\1\151\2\145\1\157\1\71\2\uffff\1\44\1\uffff"+
        "\1\172\3\uffff\2\172\1\156\1\uffff\1\164\1\154\1\164\6\uffff\1\153"+
        "\1\146\2\157\1\164\1\147\1\160\1\154\2\uffff\2\151\1\144\1\163\1"+
        "\170\1\145\1\142\1\157\1\172\1\157\1\164\1\144\1\164\1\172\1\144"+
        "\1\164\1\151\1\157\1\143\1\151\1\164\2\163\3\uffff\2\172\1\164\10"+
        "\uffff\1\163\1\157\1\156\1\162\1\uffff\2\145\1\171\1\154\1\151\4"+
        "\uffff\1\156\1\uffff\2\145\1\uffff\1\157\1\172\1\154\1\165\1\145"+
        "\1\164\1\142\1\165\1\143\1\162\1\145\2\154\1\141\1\154\1\161\1\145"+
        "\1\163\1\172\1\145\1\164\1\156\1\154\1\142\1\uffff\1\162\1\151\1"+
        "\172\1\145\2\172\1\uffff\1\40\1\157\1\154\1\155\1\153\1\155\2\141"+
        "\1\143\1\164\1\145\2\uffff\2\145\1\141\1\163\1\146\2\162\1\167\1"+
        "\172\1\145\1\156\1\165\3\162\1\uffff\1\165\1\uffff\1\172\1\162\3"+
        "\172\1\160\1\150\1\141\1\170\1\172\1\141\1\155\1\142\1\156\1\165"+
        "\1\160\1\164\1\uffff\3\172\1\145\1\172\1\164\1\157\1\uffff\1\162"+
        "\3\uffff\1\151\2\172\2\141\1\142\1\165\1\172\1\151\2\162\1\172\1"+
        "\164\1\163\1\154\1\145\1\172\1\145\1\172\1\uffff\1\143\1\172\2\uffff"+
        "\1\163\1\145\1\172\1\145\1\154\1\uffff\1\141\3\uffff\2\172\1\164"+
        "\1\160\1\uffff\1\143\1\145\1\141\1\172\1\145\1\164\1\163\3\uffff"+
        "\1\172\1\uffff\1\172\1\156\1\172\1\156\2\uffff\1\147\1\162\1\141"+
        "\1\154\1\uffff\1\156\2\172\1\uffff\1\145\1\172\1\151\1\156\1\uffff"+
        "\1\172\1\uffff\1\164\1\uffff\1\145\1\162\1\uffff\1\172\2\154\2\uffff"+
        "\1\151\1\172\1\145\1\40\1\143\2\uffff\3\172\2\uffff\1\163\1\uffff"+
        "\1\143\1\145\1\171\1\163\1\164\1\143\2\uffff\1\172\1\uffff\1\143"+
        "\1\164\1\uffff\1\172\1\143\1\172\1\uffff\2\172\1\157\1\uffff\1\172"+
        "\1\uffff\1\153\3\uffff\1\172\1\162\2\172\1\145\1\172\1\164\1\uffff"+
        "\1\164\1\137\1\uffff\1\164\3\uffff\1\156\1\uffff\1\172\1\uffff\1"+
        "\145\2\uffff\1\172\1\uffff\2\172\1\164\2\172\1\uffff\1\155\3\uffff"+
        "\1\151\1\141\2\uffff\1\145\1\155\1\164\1\156\2\145\1\164\3\172\1"+
        "\163\3\uffff\1\164\1\141\1\155\1\160\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\23\uffff\1\42\1\43\1\46\2\uffff\1\52\1\53\1\54\1\55\1\56\1\uffff"+
        "\1\62\6\uffff\2\132\3\uffff\1\135\1\140\1\141\3\uffff\1\135\3\uffff"+
        "\1\5\1\4\1\6\1\7\1\20\1\17\10\uffff\1\22\1\21\27\uffff\1\42\1\43"+
        "\1\46\3\uffff\1\136\1\137\1\51\1\52\1\53\1\54\1\55\1\56\4\uffff"+
        "\1\62\5\uffff\1\112\1\133\1\134\1\140\1\uffff\1\10\2\uffff\1\12"+
        "\30\uffff\1\103\6\uffff\1\71\13\uffff\1\47\1\111\17\uffff\1\2\1"+
        "\uffff\1\76\21\uffff\1\60\7\uffff\1\50\1\uffff\1\121\1\115\1\73"+
        "\23\uffff\1\75\2\uffff\1\1\1\11\5\uffff\1\77\1\uffff\1\13\1\123"+
        "\1\14\4\uffff\1\31\7\uffff\1\61\1\27\1\64\1\uffff\1\32\4\uffff\1"+
        "\35\1\105\4\uffff\1\116\3\uffff\1\57\4\uffff\1\63\1\uffff\1\70\1"+
        "\uffff\1\110\2\uffff\1\125\3\uffff\1\107\1\15\5\uffff\1\23\1\24"+
        "\3\uffff\1\66\1\34\1\uffff\1\67\6\uffff\1\102\1\124\1\uffff\1\126"+
        "\2\uffff\1\106\3\uffff\1\36\3\uffff\1\16\1\uffff\1\72\1\uffff\1"+
        "\101\1\26\1\114\7\uffff\1\65\2\uffff\1\104\1\uffff\1\30\1\3\1\122"+
        "\1\uffff\1\37\1\uffff\1\44\1\uffff\1\40\1\74\1\uffff\1\100\5\uffff"+
        "\1\33\1\uffff\1\41\1\120\1\113\2\uffff\1\25\1\45\13\uffff\1\127"+
        "\1\130\1\117\5\uffff\1\131";
    static final String DFA12_specialS =
        "\1\0\47\uffff\1\1\u0166\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\4\2\54\1\47\2\54\1\50\1\33"+
            "\1\34\1\30\1\31\1\36\1\32\1\44\1\27\12\45\1\54\1\25\1\5\1\3"+
            "\1\12\2\54\32\52\3\54\1\51\1\52\1\54\1\17\1\16\1\35\1\22\1\14"+
            "\1\20\1\7\1\52\1\1\1\43\1\41\1\6\1\10\1\2\1\26\1\21\1\52\1\11"+
            "\1\42\1\15\1\13\1\40\1\37\3\52\1\23\1\54\1\24\uff82\54",
            "\1\57\6\uffff\1\56\4\uffff\1\55",
            "\1\63\15\uffff\1\61\5\uffff\1\62",
            "\1\64",
            "\1\66",
            "\1\70\1\67",
            "\1\73\3\uffff\1\72",
            "\1\74\5\uffff\1\75",
            "\1\76\7\uffff\1\77",
            "\1\100\11\uffff\1\101",
            "\1\102",
            "\1\104",
            "\1\107\1\uffff\1\106\11\uffff\1\105",
            "\1\112\3\uffff\1\110\2\uffff\1\111",
            "\1\113\14\uffff\1\114",
            "\1\115\1\116\1\122\7\uffff\1\120\1\uffff\1\117\4\uffff\1\121"+
            "\1\uffff\1\123",
            "\1\124\20\uffff\1\125",
            "\1\126\20\uffff\1\127",
            "\1\130\3\uffff\1\131\3\uffff\1\132",
            "",
            "",
            "",
            "\1\137\3\uffff\1\136\2\uffff\1\140",
            "\1\141\4\uffff\1\142",
            "",
            "",
            "",
            "",
            "",
            "\1\151\15\uffff\1\153\2\uffff\1\152\2\uffff\1\154",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\46",
            "",
            "",
            "\1\164",
            "\0\165",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\167\17\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\172\5\60"+
            "\1\171\6\60",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0087\5\uffff\1\u0086\6\uffff\1\u0089\1\uffff\1\u0088",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\1\u008c\5\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0099\7\uffff\1\u0098",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u009a\27\60",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3\14\uffff\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00a6\26\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab\11\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "",
            "",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8\17\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u00b9\14\60",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8\1\uffff\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00d5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\3\uffff\1\u00ea",
            "\1\u00eb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00f0\5\uffff\1\u00ef",
            "\1\u00f2\12\uffff\1\u00f1",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "",
            "",
            "",
            "\1\u010f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0120",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0122",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131\17\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0138",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u013a",
            "",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0142",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0144",
            "\1\u0145",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "\1\u014d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0160",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0164",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0166",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0168",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u016b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0170",
            "",
            "",
            "",
            "\1\u0171",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0173",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0178\17\uffff\1\u0177",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u017b",
            "",
            "",
            "",
            "\1\u017c",
            "\1\u017d",
            "",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\12\60\7\uffff\32\60\4\uffff\1\u0185\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0189",
            "",
            "",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_NUMBER | RULE_INT | RULE_STRING | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='n') ) {s = 2;}

                        else if ( (LA12_0=='=') ) {s = 3;}

                        else if ( (LA12_0=='!') ) {s = 4;}

                        else if ( (LA12_0=='<') ) {s = 5;}

                        else if ( (LA12_0=='l') ) {s = 6;}

                        else if ( (LA12_0=='g') ) {s = 7;}

                        else if ( (LA12_0=='m') ) {s = 8;}

                        else if ( (LA12_0=='r') ) {s = 9;}

                        else if ( (LA12_0=='>') ) {s = 10;}

                        else if ( (LA12_0=='u') ) {s = 11;}

                        else if ( (LA12_0=='e') ) {s = 12;}

                        else if ( (LA12_0=='t') ) {s = 13;}

                        else if ( (LA12_0=='b') ) {s = 14;}

                        else if ( (LA12_0=='a') ) {s = 15;}

                        else if ( (LA12_0=='f') ) {s = 16;}

                        else if ( (LA12_0=='p') ) {s = 17;}

                        else if ( (LA12_0=='d') ) {s = 18;}

                        else if ( (LA12_0=='{') ) {s = 19;}

                        else if ( (LA12_0=='}') ) {s = 20;}

                        else if ( (LA12_0==';') ) {s = 21;}

                        else if ( (LA12_0=='o') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( (LA12_0=='*') ) {s = 24;}

                        else if ( (LA12_0=='+') ) {s = 25;}

                        else if ( (LA12_0=='-') ) {s = 26;}

                        else if ( (LA12_0=='(') ) {s = 27;}

                        else if ( (LA12_0==')') ) {s = 28;}

                        else if ( (LA12_0=='c') ) {s = 29;}

                        else if ( (LA12_0==',') ) {s = 30;}

                        else if ( (LA12_0=='w') ) {s = 31;}

                        else if ( (LA12_0=='v') ) {s = 32;}

                        else if ( (LA12_0=='k') ) {s = 33;}

                        else if ( (LA12_0=='s') ) {s = 34;}

                        else if ( (LA12_0=='j') ) {s = 35;}

                        else if ( (LA12_0=='.') ) {s = 36;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 37;}

                        else if ( (LA12_0=='$') ) {s = 39;}

                        else if ( (LA12_0=='\'') ) {s = 40;}

                        else if ( (LA12_0=='^') ) {s = 41;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||LA12_0=='q'||(LA12_0>='x' && LA12_0<='z')) ) {s = 42;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 43;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='\"' && LA12_0<='#')||(LA12_0>='%' && LA12_0<='&')||LA12_0==':'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 44;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( ((LA12_40>='\u0000' && LA12_40<='\uFFFF')) ) {s = 117;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}