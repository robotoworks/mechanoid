package com.robotoworks.mechanoid.db.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.robotoworks.mechanoid.db.services.SqliteModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSqliteModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'init'", "';'", "'action'", "'function'", "'('", "','", "')'", "'/'", "':'", "'#'", "'*'", "'migration'", "'||'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'not'", "'exists'", "'case'", "'else'", "'end'", "'cast'", "'as'", "'$'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'from'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'temp'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'unique'", "'index'", "'primary key'", "'autoincrement'", "'default'", "'constraint'", "'check'", "'collate'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__15=15;
    public static final int T__90=90;
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
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
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
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
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
    public static final int RULE_NUMBER=6;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=7;
    public static final int T__113=113;
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


        public InternalSqliteModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqliteModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqliteModelParser.tokenNames; }
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g"; }



     	private SqliteModelGrammarAccess grammarAccess;
     	
        public InternalSqliteModelParser(TokenStream input, SqliteModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SqliteModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_database_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:85:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:87:3: lv_packageName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"packageName",
                      		lv_packageName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:103:2: ( (lv_database_2_0= ruleDatabaseBlock ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:104:1: (lv_database_2_0= ruleDatabaseBlock )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:104:1: (lv_database_2_0= ruleDatabaseBlock )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:105:3: lv_database_2_0= ruleDatabaseBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getDatabaseDatabaseBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDatabaseBlock_in_ruleModel164);
            lv_database_2_0=ruleDatabaseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"database",
                      		lv_database_2_0, 
                      		"DatabaseBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDatabaseBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:129:1: entryRuleDatabaseBlock returns [EObject current=null] : iv_ruleDatabaseBlock= ruleDatabaseBlock EOF ;
    public final EObject entryRuleDatabaseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseBlock = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:130:2: (iv_ruleDatabaseBlock= ruleDatabaseBlock EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:131:2: iv_ruleDatabaseBlock= ruleDatabaseBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatabaseBlockRule()); 
            }
            pushFollow(FOLLOW_ruleDatabaseBlock_in_entryRuleDatabaseBlock200);
            iv_ruleDatabaseBlock=ruleDatabaseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatabaseBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseBlock210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabaseBlock"


    // $ANTLR start "ruleDatabaseBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:138:1: ruleDatabaseBlock returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* ( (lv_init_5_0= ruleInitBlock ) )? otherlv_6= '}' ) ;
    public final EObject ruleDatabaseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_config_3_0 = null;

        EObject lv_migrations_4_0 = null;

        EObject lv_init_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:141:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* ( (lv_init_5_0= ruleInitBlock ) )? otherlv_6= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* ( (lv_init_5_0= ruleInitBlock ) )? otherlv_6= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* ( (lv_init_5_0= ruleInitBlock ) )? otherlv_6= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* ( (lv_init_5_0= ruleInitBlock ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDatabaseBlock247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDatabaseBlockAccess().getDatabaseKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:146:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:147:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:147:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:148:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabaseBlock264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDatabaseBlockAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDatabaseBlockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDatabaseBlock281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDatabaseBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:168:1: ( (lv_config_3_0= ruleConfigBlock ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:169:1: (lv_config_3_0= ruleConfigBlock )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:169:1: (lv_config_3_0= ruleConfigBlock )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:170:3: lv_config_3_0= ruleConfigBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getConfigConfigBlockParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConfigBlock_in_ruleDatabaseBlock302);
                    lv_config_3_0=ruleConfigBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDatabaseBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"config",
                              		lv_config_3_0, 
                              		"ConfigBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:186:3: ( (lv_migrations_4_0= ruleMigrationBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:187:1: (lv_migrations_4_0= ruleMigrationBlock )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:187:1: (lv_migrations_4_0= ruleMigrationBlock )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:188:3: lv_migrations_4_0= ruleMigrationBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getMigrationsMigrationBlockParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock324);
            	    lv_migrations_4_0=ruleMigrationBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDatabaseBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"migrations",
            	              		lv_migrations_4_0, 
            	              		"MigrationBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:204:3: ( (lv_init_5_0= ruleInitBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:205:1: (lv_init_5_0= ruleInitBlock )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:205:1: (lv_init_5_0= ruleInitBlock )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:206:3: lv_init_5_0= ruleInitBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getInitInitBlockParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInitBlock_in_ruleDatabaseBlock346);
                    lv_init_5_0=ruleInitBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDatabaseBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_5_0, 
                              		"InitBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleDatabaseBlock359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDatabaseBlockAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabaseBlock"


    // $ANTLR start "entryRuleConfigBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:234:1: entryRuleConfigBlock returns [EObject current=null] : iv_ruleConfigBlock= ruleConfigBlock EOF ;
    public final EObject entryRuleConfigBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigBlock = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:235:2: (iv_ruleConfigBlock= ruleConfigBlock EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:236:2: iv_ruleConfigBlock= ruleConfigBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigBlockRule()); 
            }
            pushFollow(FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock395);
            iv_ruleConfigBlock=ruleConfigBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigBlock405); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigBlock"


    // $ANTLR start "ruleConfigBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:243:1: ruleConfigBlock returns [EObject current=null] : ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleConfigBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:246:28: ( ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:247:1: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:247:1: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:247:2: () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:247:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigBlockAccess().getConfigBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleConfigBlock451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigBlockAccess().getConfigKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleConfigBlock463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConfigBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:261:1: ( (lv_statements_3_0= ruleConfigurationStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:262:1: (lv_statements_3_0= ruleConfigurationStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:262:1: (lv_statements_3_0= ruleConfigurationStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:263:3: lv_statements_3_0= ruleConfigurationStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConfigBlockAccess().getStatementsConfigurationStatementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfigurationStatement_in_ruleConfigBlock484);
            	    lv_statements_3_0=ruleConfigurationStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConfigBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"ConfigurationStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConfigBlock497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConfigBlockAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigBlock"


    // $ANTLR start "entryRuleInitBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:291:1: entryRuleInitBlock returns [EObject current=null] : iv_ruleInitBlock= ruleInitBlock EOF ;
    public final EObject entryRuleInitBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitBlock = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:292:2: (iv_ruleInitBlock= ruleInitBlock EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:293:2: iv_ruleInitBlock= ruleInitBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitBlockRule()); 
            }
            pushFollow(FOLLOW_ruleInitBlock_in_entryRuleInitBlock533);
            iv_ruleInitBlock=ruleInitBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitBlock543); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitBlock"


    // $ANTLR start "ruleInitBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:300:1: ruleInitBlock returns [EObject current=null] : ( () otherlv_1= 'init' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleInitBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:303:28: ( ( () otherlv_1= 'init' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:304:1: ( () otherlv_1= 'init' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:304:1: ( () otherlv_1= 'init' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:304:2: () otherlv_1= 'init' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:304:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:305:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInitBlockAccess().getInitBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleInitBlock589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInitBlockAccess().getInitKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleInitBlock601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInitBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:318:1: ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==94||LA5_0==108||LA5_0==111) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:318:2: ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';'
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:318:2: ( (lv_statements_3_0= ruleDDLStatement ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:319:1: (lv_statements_3_0= ruleDDLStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:319:1: (lv_statements_3_0= ruleDDLStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:320:3: lv_statements_3_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInitBlockAccess().getStatementsDDLStatementParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleInitBlock623);
            	    lv_statements_3_0=ruleDDLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInitBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"DDLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleInitBlock635); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getInitBlockAccess().getSemicolonKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleInitBlock649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInitBlockAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitBlock"


    // $ANTLR start "entryRuleConfigurationStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:352:1: entryRuleConfigurationStatement returns [EObject current=null] : iv_ruleConfigurationStatement= ruleConfigurationStatement EOF ;
    public final EObject entryRuleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:353:2: (iv_ruleConfigurationStatement= ruleConfigurationStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:354:2: iv_ruleConfigurationStatement= ruleConfigurationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleConfigurationStatement_in_entryRuleConfigurationStatement685);
            iv_ruleConfigurationStatement=ruleConfigurationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationStatement695); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurationStatement"


    // $ANTLR start "ruleConfigurationStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:361:1: ruleConfigurationStatement returns [EObject current=null] : ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_body_13_0= ruleSelectStatement ) ) otherlv_14= '}' ) ) ;
    public final EObject ruleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_uri_3_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:364:28: ( ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_body_13_0= ruleSelectStatement ) ) otherlv_14= '}' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:1: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_body_13_0= ruleSelectStatement ) ) otherlv_14= '}' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:1: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_body_13_0= ruleSelectStatement ) ) otherlv_14= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:2: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:2: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:3: () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:366:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getConfigurationStatementAccess().getActionStatementAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleConfigurationStatement742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getConfigurationStatementAccess().getActionKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:375:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:376:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:376:1: (lv_name_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:377:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationStatement759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConfigurationStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:393:2: ( (lv_uri_3_0= ruleContentUri ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:394:1: (lv_uri_3_0= ruleContentUri )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:394:1: (lv_uri_3_0= ruleContentUri )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:395:3: lv_uri_3_0= ruleContentUri
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConfigurationStatementAccess().getUriContentUriParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContentUri_in_ruleConfigurationStatement785);
                    lv_uri_3_0=ruleContentUri();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConfigurationStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"uri",
                              		lv_uri_3_0, 
                              		"ContentUri");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:412:6: ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_body_13_0= ruleSelectStatement ) ) otherlv_14= '}' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:412:6: ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_body_13_0= ruleSelectStatement ) ) otherlv_14= '}' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:412:7: () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( (lv_body_13_0= ruleSelectStatement ) ) otherlv_14= '}'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:412:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:413:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getConfigurationStatementAccess().getFunctionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleConfigurationStatement814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getConfigurationStatementAccess().getFunctionKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:422:1: ( (lv_name_6_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:423:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:423:1: (lv_name_6_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:424:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationStatement831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_6_0, grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConfigurationStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleConfigurationStatement848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getConfigurationStatementAccess().getLeftParenthesisKeyword_1_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:444:1: ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=130 && LA7_0<=133)||LA7_0==136) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:444:2: ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:444:2: ( (lv_args_8_0= ruleFunctionArg ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:445:1: (lv_args_8_0= ruleFunctionArg )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:445:1: (lv_args_8_0= ruleFunctionArg )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:446:3: lv_args_8_0= ruleFunctionArg
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConfigurationStatementAccess().getArgsFunctionArgParserRuleCall_1_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFunctionArg_in_ruleConfigurationStatement870);
                            lv_args_8_0=ruleFunctionArg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getConfigurationStatementRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"args",
                                      		lv_args_8_0, 
                                      		"FunctionArg");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:462:2: (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==22) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:462:4: otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) )
                            	    {
                            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleConfigurationStatement883); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getConfigurationStatementAccess().getCommaKeyword_1_4_1_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:466:1: ( (lv_args_10_0= ruleFunctionArg ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:467:1: (lv_args_10_0= ruleFunctionArg )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:467:1: (lv_args_10_0= ruleFunctionArg )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:468:3: lv_args_10_0= ruleFunctionArg
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getConfigurationStatementAccess().getArgsFunctionArgParserRuleCall_1_4_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleFunctionArg_in_ruleConfigurationStatement904);
                            	    lv_args_10_0=ruleFunctionArg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getConfigurationStatementRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"args",
                            	              		lv_args_10_0, 
                            	              		"FunctionArg");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleConfigurationStatement920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getConfigurationStatementAccess().getRightParenthesisKeyword_1_5());
                          
                    }
                    otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleConfigurationStatement932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getConfigurationStatementAccess().getLeftCurlyBracketKeyword_1_6());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:492:1: ( (lv_body_13_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:493:1: (lv_body_13_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:493:1: (lv_body_13_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:494:3: lv_body_13_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConfigurationStatementAccess().getBodySelectStatementParserRuleCall_1_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleConfigurationStatement953);
                    lv_body_13_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConfigurationStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_13_0, 
                              		"SelectStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleConfigurationStatement965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getConfigurationStatementAccess().getRightCurlyBracketKeyword_1_8());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationStatement"


    // $ANTLR start "entryRuleFunctionArg"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:522:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:523:2: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:524:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1002);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArg1012); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionArg"


    // $ANTLR start "ruleFunctionArg"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:531:1: ruleFunctionArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:534:28: ( ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:535:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:535:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:535:2: ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:535:2: ( (lv_type_0_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:536:1: (lv_type_0_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:536:1: (lv_type_0_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:537:3: lv_type_0_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleFunctionArg1058);
            lv_type_0_0=ruleColumnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionArgRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ColumnType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:553:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:554:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:554:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:555:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionArg1075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionArgAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionArgRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionArg"


    // $ANTLR start "entryRuleContentUri"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:579:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:580:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:581:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri1116);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri1126); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentUri"


    // $ANTLR start "ruleContentUri"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:588:1: ruleContentUri returns [EObject current=null] : (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:591:28: ( (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:592:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:592:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:592:3: otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleContentUri1163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriAccess().getSolidusKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:596:1: ( (lv_type_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:597:1: (lv_type_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:597:1: (lv_type_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:598:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUri1180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_1_0, grammarAccess.getContentUriAccess().getTypeIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getContentUriRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:614:2: (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:614:4: otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleContentUri1198); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:618:1: ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:619:1: (lv_segments_3_0= ruleContentUriSegment )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:619:1: (lv_segments_3_0= ruleContentUriSegment )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:620:3: lv_segments_3_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1219);
            	    lv_segments_3_0=ruleContentUriSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContentUriRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_3_0, 
            	              		"ContentUriSegment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentUri"


    // $ANTLR start "entryRuleContentUriSegment"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:644:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:645:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:646:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1257);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment1267); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContentUriSegment"


    // $ANTLR start "ruleContentUriSegment"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:653:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) ;
    public final EObject ruleContentUriSegment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_num_5_0=null;
        Token lv_text_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:656:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:657:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:657:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:657:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:657:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:658:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:658:1: (lv_name_0_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:659:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getContentUriSegmentAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:676:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:676:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:676:7: () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:676:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:677:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContentUriSegment1342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:686:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:687:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:687:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:688:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getContentUriSegmentAccess().getNameIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleContentUriSegment1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentUriSegmentAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:708:1: ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==26) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==27) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:708:2: ( (lv_num_5_0= '#' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:708:2: ( (lv_num_5_0= '#' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:709:1: (lv_num_5_0= '#' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:709:1: (lv_num_5_0= '#' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:710:3: lv_num_5_0= '#'
                            {
                            lv_num_5_0=(Token)match(input,26,FOLLOW_26_in_ruleContentUriSegment1395); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_num_5_0, grammarAccess.getContentUriSegmentAccess().getNumNumberSignKeyword_1_4_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                              	        }
                                     		setWithLastConsumed(current, "num", true, "#");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:724:6: ( (lv_text_6_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:724:6: ( (lv_text_6_0= '*' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:725:1: (lv_text_6_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:725:1: (lv_text_6_0= '*' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:726:3: lv_text_6_0= '*'
                            {
                            lv_text_6_0=(Token)match(input,27,FOLLOW_27_in_ruleContentUriSegment1432); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_text_6_0, grammarAccess.getContentUriSegmentAccess().getTextAsteriskKeyword_1_4_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                              	        }
                                     		setWithLastConsumed(current, "text", true, "*");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContentUriSegment1458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getContentUriSegmentAccess().getRightCurlyBracketKeyword_1_5());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContentUriSegment"


    // $ANTLR start "entryRuleMigrationBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:751:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:752:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:753:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1495);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1505); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMigrationBlock"


    // $ANTLR start "ruleMigrationBlock"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:760:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:763:28: ( ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:764:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:764:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:764:2: () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:764:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:765:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMigrationBlock1551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMigrationBlock1563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:778:1: ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==94||LA12_0==108||LA12_0==111) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:778:2: ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';'
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:778:2: ( (lv_statements_3_0= ruleDDLStatement ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:779:1: (lv_statements_3_0= ruleDDLStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:779:1: (lv_statements_3_0= ruleDDLStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:780:3: lv_statements_3_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1585);
            	    lv_statements_3_0=ruleDDLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMigrationBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_3_0, 
            	              		"DDLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleMigrationBlock1597); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMigrationBlock1611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMigrationBlockAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMigrationBlock"


    // $ANTLR start "entryRuleSqlExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:812:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:813:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:814:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1647);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression1657); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqlExpression"


    // $ANTLR start "ruleSqlExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:821:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:824:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:826:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression1703);
            this_ExprConcat_0=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprConcat_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqlExpression"


    // $ANTLR start "entryRuleExprConcat"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:842:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:843:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:844:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat1737);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat1747); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprConcat"


    // $ANTLR start "ruleExprConcat"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:851:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:854:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:855:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:855:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:856:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1794);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:864:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:864:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:864:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:865:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:870:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:871:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:871:1: (lv_op_2_0= '||' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:872:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,29,FOLLOW_29_in_ruleExprConcat1821); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprConcatRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:885:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:886:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:886:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:887:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1855);
            	    lv_right_3_0=ruleExprMult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprConcatRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprMult");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprConcat"


    // $ANTLR start "entryRuleExprMult"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:911:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:912:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:913:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1893);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1903); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprMult"


    // $ANTLR start "ruleExprMult"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:920:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:923:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:924:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:924:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:925:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1950);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:933:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24||LA15_0==27||LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:933:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:933:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:934:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:939:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:940:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:940:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:941:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:941:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt14=3;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:942:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,27,FOLLOW_27_in_ruleExprMult1979); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprMultAccess().getOpAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:954:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleExprMult2008); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprMultAccess().getOpSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:966:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,30,FOLLOW_30_in_ruleExprMult2037); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprMultAccess().getOpPercentSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:981:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:982:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:982:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:983:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult2074);
            	    lv_right_3_0=ruleExprAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprMultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprAdd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprMult"


    // $ANTLR start "entryRuleExprAdd"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1007:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1008:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1009:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd2112);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd2122); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAdd"


    // $ANTLR start "ruleExprAdd"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1016:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1019:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1020:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1020:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1021:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2169);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1029:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=31 && LA17_0<=32)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1029:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1029:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1030:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1035:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1036:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1036:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1037:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1037:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==31) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==32) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1038:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleExprAdd2198); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprAddAccess().getOpPlusSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprAddRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1050:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleExprAdd2227); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprAddAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprAddRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1065:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1066:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1066:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1067:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2264);
            	    lv_right_3_0=ruleExprBit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAddRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprBit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAdd"


    // $ANTLR start "entryRuleExprBit"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1091:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1092:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1093:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit2302);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit2312); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBit"


    // $ANTLR start "ruleExprBit"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1100:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
    public final EObject ruleExprBit() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ExprRelate_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1103:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1104:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1104:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1105:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2359);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1113:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=33 && LA19_0<=36)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1113:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1113:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1114:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1119:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1120:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1120:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1121:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1121:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1122:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleExprBit2388); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprBitAccess().getOpLessThanSignLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1134:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_34_in_ruleExprBit2417); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprBitAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1146:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,35,FOLLOW_35_in_ruleExprBit2446); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprBitAccess().getOpAmpersandKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1158:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,36,FOLLOW_36_in_ruleExprBit2475); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprBitAccess().getOpVerticalLineKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1173:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1174:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1174:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1175:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2512);
            	    lv_right_3_0=ruleExprRelate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprBitRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprRelate");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1199:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1200:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1201:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate2550);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate2560); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprRelate"


    // $ANTLR start "ruleExprRelate"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1208:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
    public final EObject ruleExprRelate() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ExprEqual_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1211:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1212:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1212:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1213:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2607);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1221:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=37 && LA21_0<=40)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1221:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1221:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1222:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1227:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1228:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1228:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1229:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1229:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1230:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_37_in_ruleExprRelate2636); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprRelateAccess().getOpLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1242:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_38_in_ruleExprRelate2665); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprRelateAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1254:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,39,FOLLOW_39_in_ruleExprRelate2694); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprRelateAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1266:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,40,FOLLOW_40_in_ruleExprRelate2723); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprRelateAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1281:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1282:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1282:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1283:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2760);
            	    lv_right_3_0=ruleExprEqual();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprRelateRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprEqual");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprRelate"


    // $ANTLR start "entryRuleExprEqual"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1307:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1308:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1309:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual2798);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual2808); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprEqual"


    // $ANTLR start "ruleExprEqual"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1316:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
    public final EObject ruleExprEqual() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        Token lv_op_2_10=null;
        Token lv_op_2_11=null;
        Token lv_op_2_12=null;
        EObject this_ExprAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1319:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1320:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1320:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1321:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2855);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1329:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=41 && LA23_0<=52)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1329:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1329:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1330:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1335:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1336:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1336:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1337:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1337:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt22=12;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt22=5;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt22=6;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt22=7;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt22=8;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt22=9;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt22=10;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt22=11;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt22=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1338:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2884); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprEqualAccess().getOpEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1350:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2913); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1362:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2942); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1374:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2971); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprEqualAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1386:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual3000); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_5, grammarAccess.getExprEqualAccess().getOpIsKeyword_1_1_0_4());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1398:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual3029); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_6, grammarAccess.getExprEqualAccess().getOpIsNotKeyword_1_1_0_5());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1410:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual3058); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_7, grammarAccess.getExprEqualAccess().getOpInKeyword_1_1_0_6());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_7, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1422:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,48,FOLLOW_48_in_ruleExprEqual3087); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_8, grammarAccess.getExprEqualAccess().getOpNotInKeyword_1_1_0_7());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_8, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1434:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,49,FOLLOW_49_in_ruleExprEqual3116); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_9, grammarAccess.getExprEqualAccess().getOpLikeKeyword_1_1_0_8());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_9, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1446:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,50,FOLLOW_50_in_ruleExprEqual3145); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_10, grammarAccess.getExprEqualAccess().getOpGlobKeyword_1_1_0_9());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_10, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1458:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,51,FOLLOW_51_in_ruleExprEqual3174); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_11, grammarAccess.getExprEqualAccess().getOpMatchKeyword_1_1_0_10());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_11, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1470:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,52,FOLLOW_52_in_ruleExprEqual3203); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_12, grammarAccess.getExprEqualAccess().getOpRegexpKeyword_1_1_0_11());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_12, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1485:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1486:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1486:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1487:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3240);
            	    lv_right_3_0=ruleExprAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprEqualRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprEqual"


    // $ANTLR start "entryRuleExprAnd"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1511:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1513:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3278);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1520:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1523:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1525:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3335);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1533:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1533:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1533:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1534:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1539:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1540:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1540:1: (lv_op_2_0= 'and' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1541:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,53,FOLLOW_53_in_ruleExprAnd3362); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprAndRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1554:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1555:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1555:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1556:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3396);
            	    lv_right_3_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1580:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1581:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1582:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3434);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3444); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1589:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1592:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1593:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1593:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1594:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3491);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1602:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1602:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1602:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1603:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1608:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1609:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1609:1: (lv_op_2_0= 'or' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1610:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_54_in_ruleExprOr3518); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprOrRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1623:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1624:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1624:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1625:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3552);
            	    lv_right_3_0=ruleNullCheckExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"NullCheckExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleNullCheckExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1649:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1650:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1651:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3590);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression3600); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullCheckExpression"


    // $ANTLR start "ruleNullCheckExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1658:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1661:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1662:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1662:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1663:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3647);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1671:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=55 && LA26_0<=57)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1671:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1671:2: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1672:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1677:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1678:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1678:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1679:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3677);
                    lv_right_2_0=ruleNullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNullCheckExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"NullExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullCheckExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1703:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1704:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1705:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression3715);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression3725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1712:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1715:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==55) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=56 && LA28_0<=57)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:2: ( () otherlv_1= 'is null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:3: () otherlv_1= 'is null'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1717:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleNullExpression3772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1727:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1727:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1727:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1727:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1728:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1733:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==56) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==57) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1733:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleNullExpression3802); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1738:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleNullExpression3820); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNullExpressionAccess().getNotnullKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1750:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1751:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1752:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3858);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3868); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1759:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_all_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_not_21_0=null;
        Token lv_exists_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token lv_name_34_0=null;
        Token otherlv_35=null;
        Token lv_all_36_0=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        EObject lv_literalValue_15_0 = null;

        EObject lv_expression_18_0 = null;

        EObject lv_select_24_0 = null;

        EObject lv_caseExpression_28_0 = null;

        EObject lv_cases_29_0 = null;

        EObject lv_elseExpression_31_0 = null;

        EObject lv_arguments_37_0 = null;

        EObject lv_arguments_39_0 = null;

        EObject lv_expression_44_0 = null;

        Enumerator lv_type_46_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1762:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1763:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1763:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            int alt38=10;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1763:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1763:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1763:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1763:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1764:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1773:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1774:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1774:1: (otherlv_2= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1775:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1787:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1787:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1787:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1787:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1788:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1797:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1798:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1798:1: (otherlv_5= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1799:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1811:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1811:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1811:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1811:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1812:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt30=3;
                    alt30 = dfa30.predict(input);
                    switch (alt30) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1823:1: (otherlv_7= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1824:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4035); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4047); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1840:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1840:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1840:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1840:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1841:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1841:1: (otherlv_9= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1842:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4075); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4087); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1857:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==27) ) {
                                alt29=1;
                            }
                            else if ( (LA29_0==RULE_ID) ) {
                                alt29=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1857:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1857:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1858:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1858:1: (lv_all_11_0= '*' )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1859:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression4106); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_all_11_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_2_1_1_2_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                             		setWithLastConsumed(current, "all", true, "*");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1873:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1873:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1874:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1874:1: (otherlv_12= RULE_ID )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1875:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4145); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_2_1_1_2_1_0()); 
                                      	
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1887:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1887:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1888:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1888:1: (otherlv_13= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1889:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4173); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_2_1_2_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1901:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1901:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1901:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1901:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1902:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1907:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1908:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1908:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1909:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4212);
                    lv_literalValue_15_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literalValue",
                              		lv_literalValue_15_0, 
                              		"LiteralValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1926:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1926:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1926:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1926:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1927:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1936:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1937:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1937:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1938:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4262);
                    lv_expression_18_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_18_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1959:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1959:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1959:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1959:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1960:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1965:2: ( (lv_not_21_0= 'not' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==61) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1966:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1966:1: (lv_not_21_0= 'not' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1967:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4309); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_not_21_0, grammarAccess.getPrimaryExpressionAccess().getNotNotKeyword_5_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "not", true, "not");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1980:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==62) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1981:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1981:1: (lv_exists_22_0= 'exists' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1982:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4341); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_exists_22_0, grammarAccess.getPrimaryExpressionAccess().getExistsExistsKeyword_5_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "exists", true, "exists");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1999:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2000:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2000:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2001:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4388);
                    lv_select_24_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"select",
                              		lv_select_24_0, 
                              		"SelectStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2022:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2022:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2022:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2022:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2023:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2032:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_NUMBER)||LA33_0==21||LA33_0==32||(LA33_0>=58 && LA33_0<=59)||(LA33_0>=61 && LA33_0<=63)||LA33_0==66||LA33_0==68||(LA33_0>=90 && LA33_0<=93)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2033:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2033:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2034:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4450);
                            lv_caseExpression_28_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"caseExpression",
                                      		lv_caseExpression_28_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2050:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==69) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2051:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2051:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2052:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4472);
                    	    lv_cases_29_0=ruleCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"cases",
                    	              		lv_cases_29_0, 
                    	              		"Case");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2068:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==64) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2068:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4486); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2072:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2073:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2073:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2074:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4507);
                            lv_elseExpression_31_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"elseExpression",
                                      		lv_elseExpression_31_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2095:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2095:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2095:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2095:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2096:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2101:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2102:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2102:1: (lv_name_34_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2103:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_34_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_34_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2123:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==27) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_NUMBER)||LA37_0==21||LA37_0==32||(LA37_0>=58 && LA37_0<=59)||(LA37_0>=61 && LA37_0<=63)||LA37_0==66||LA37_0==68||(LA37_0>=90 && LA37_0<=93)) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2123:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2123:2: ( (lv_all_36_0= '*' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2124:1: (lv_all_36_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2124:1: (lv_all_36_0= '*' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2125:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression4591); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_all_36_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_7_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "all", true, "*");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2139:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2139:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2139:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2139:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2140:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2140:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2141:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4632);
                            lv_arguments_37_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_37_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2157:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==22) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2157:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression4645); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2161:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2162:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2162:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2163:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4666);
                            	    lv_arguments_39_0=ruleSqlExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_39_0, 
                            	              		"SqlExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2184:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2184:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2184:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2184:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2185:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,66,FOLLOW_66_in_rulePrimaryExpression4711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2198:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2200:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4744);
                    lv_expression_44_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_44_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,67,FOLLOW_67_in_rulePrimaryExpression4756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2220:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2221:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2221:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2222:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4777);
                    lv_type_46_0=ruleSqliteDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_46_0, 
                              		"SqliteDataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_47=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2243:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2243:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2243:7: () otherlv_49= '$' ( (otherlv_50= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2243:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2244:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionArgumentAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_49=(Token)match(input,68,FOLLOW_68_in_rulePrimaryExpression4818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getDollarSignKeyword_9_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2253:1: ( (otherlv_50= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2254:1: (otherlv_50= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2254:1: (otherlv_50= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2255:3: otherlv_50= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_50=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_50, grammarAccess.getPrimaryExpressionAccess().getArgFunctionArgCrossReference_9_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleCase"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2274:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2275:2: (iv_ruleCase= ruleCase EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2276:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4875);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4885); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2283:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2286:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2287:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2287:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2287:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleCase4922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2291:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2292:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2292:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2293:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4943);
            lv_whenExpression_1_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"whenExpression",
                      		lv_whenExpression_1_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleCase4955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2313:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2314:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2314:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2315:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4976);
            lv_thenExpression_3_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_3_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleSelectStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2339:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2340:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2341:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5012);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement5022); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2348:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_core_0_0 = null;

        EObject lv_orderby_2_0 = null;

        EObject lv_limit_4_0 = null;

        EObject lv_limitOffset_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2351:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2352:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2352:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2352:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2352:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2353:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2353:1: (lv_core_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2354:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement5068);
            lv_core_0_0=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
              	        }
                     		set(
                     			current, 
                     			"core",
                      		lv_core_0_0, 
                      		"SelectCore");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2370:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==71) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2370:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSelectStatement5081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2374:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2375:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2375:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2376:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5102);
                    lv_orderby_2_0=ruleOrderingTermList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"orderby",
                              		lv_orderby_2_0, 
                              		"OrderingTermList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2392:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==72) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2392:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_72_in_ruleSelectStatement5117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2396:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2397:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2397:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2398:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5138);
                    lv_limit_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"limit",
                              		lv_limit_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2414:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==22||LA41_0==73) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2414:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2414:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==73) ) {
                                alt40=1;
                            }
                            else if ( (LA40_0==22) ) {
                                alt40=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 0, input);

                                throw nvae;
                            }
                            switch (alt40) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2414:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleSelectStatement5152); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2419:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleSelectStatement5170); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2423:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2424:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2424:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2425:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5192);
                            lv_limitOffset_7_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"limitOffset",
                                      		lv_limitOffset_7_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleOrderingTermList"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2449:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2450:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2451:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5232);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList5242); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderingTermList"


    // $ANTLR start "ruleOrderingTermList"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2458:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2461:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2462:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2462:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2462:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2462:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2463:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2463:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2464:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5288);
            lv_orderingTerms_0_0=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderingTermListRule());
              	        }
                     		add(
                     			current, 
                     			"orderingTerms",
                      		lv_orderingTerms_0_0, 
                      		"OrderingTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2480:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==22) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2480:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOrderingTermList5301); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2484:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2485:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2485:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2486:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5322);
            	    lv_orderingTerms_2_0=ruleOrderingTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrderingTermListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"orderingTerms",
            	              		lv_orderingTerms_2_0, 
            	              		"OrderingTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderingTermList"


    // $ANTLR start "entryRuleSelectCore"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2510:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2511:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2512:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore5360);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore5370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectCore"


    // $ANTLR start "ruleSelectCore"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2519:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2522:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2523:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2523:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2524:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5417);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2532:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=126 && LA44_0<=129)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2532:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2532:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2533:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2538:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2539:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2539:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2540:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore5447);
            	    lv_op_2_0=ruleCompoundOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"CompoundOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2556:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2557:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2557:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2558:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5468);
            	    lv_right_3_0=ruleSelectExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SelectExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectCore"


    // $ANTLR start "entryRuleSelectExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2582:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2583:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2584:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5506);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression5516); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2591:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_distinct_2_0=null;
        Token lv_all_3_0=null;
        Token lv_allColumns_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_selectList_5_0 = null;

        EObject lv_source_7_0 = null;

        EObject lv_where_9_0 = null;

        EObject lv_groupBy_11_0 = null;

        EObject lv_having_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2594:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2595:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2595:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2595:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2595:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2596:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2605:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==75) ) {
                alt45=1;
            }
            else if ( (LA45_0==76) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2605:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2605:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2606:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2606:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2607:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_distinct_2_0, grammarAccess.getSelectExpressionAccess().getDistinctDistinctKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "distinct", true, "distinct");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2621:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2621:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2622:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2622:1: (lv_all_3_0= 'all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2623:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression5618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_all_3_0, grammarAccess.getSelectExpressionAccess().getAllAllKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "all", true, "all");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2636:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==27) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_NUMBER)||LA46_0==21||LA46_0==32||(LA46_0>=58 && LA46_0<=59)||(LA46_0>=61 && LA46_0<=63)||LA46_0==66||LA46_0==68||(LA46_0>=90 && LA46_0<=93)) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2636:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2636:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2637:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2637:1: (lv_allColumns_4_0= '*' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2638:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,27,FOLLOW_27_in_ruleSelectExpression5652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_allColumns_4_0, grammarAccess.getSelectExpressionAccess().getAllColumnsAsteriskKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "allColumns", true, "*");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2652:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2652:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2653:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2653:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2654:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5692);
                    lv_selectList_5_0=ruleSelectList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"selectList",
                              		lv_selectList_5_0, 
                              		"SelectList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2670:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==77) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2670:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression5706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2674:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2675:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2675:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2676:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5727);
                    lv_source_7_0=ruleJoinSource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_7_0, 
                              		"JoinSource");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2692:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2692:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleSelectExpression5742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2696:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2697:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2697:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2698:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5763);
                    lv_where_9_0=ruleWhereExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"where",
                              		lv_where_9_0, 
                              		"WhereExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2714:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==79) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2714:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,79,FOLLOW_79_in_ruleSelectExpression5778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2718:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2719:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2719:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2720:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5799);
                    lv_groupBy_11_0=ruleGroupByExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"groupBy",
                              		lv_groupBy_11_0, 
                              		"GroupByExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2736:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==80) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2736:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,80,FOLLOW_80_in_ruleSelectExpression5814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2740:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2741:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2741:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2742:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5835);
                    lv_having_13_0=ruleHavingExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"having",
                              		lv_having_13_0, 
                              		"HavingExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRuleSelectList"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2766:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2767:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2768:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5873);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5883); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectList"


    // $ANTLR start "ruleSelectList"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2775:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2778:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2779:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2779:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2779:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2779:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2780:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2780:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2781:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5929);
            lv_resultColumns_0_0=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectListRule());
              	        }
                     		add(
                     			current, 
                     			"resultColumns",
                      		lv_resultColumns_0_0, 
                      		"ResultColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2797:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==22) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2797:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleSelectList5942); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2801:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2802:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2802:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2803:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5963);
            	    lv_resultColumns_2_0=ruleResultColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resultColumns",
            	              		lv_resultColumns_2_0, 
            	              		"ResultColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRuleWhereExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2827:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2828:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2829:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6001);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions6011); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereExpressions"


    // $ANTLR start "ruleWhereExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2836:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2839:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2840:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2840:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2841:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2841:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2842:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6056);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereExpressionsRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereExpressions"


    // $ANTLR start "entryRuleGroupByExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2866:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2867:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2868:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6091);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions6101); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupByExpressions"


    // $ANTLR start "ruleGroupByExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2875:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2878:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2879:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2879:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2879:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2879:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2880:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2880:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2881:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6147);
            lv_groupByExpressions_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupByExpressionsRule());
              	        }
                     		add(
                     			current, 
                     			"groupByExpressions",
                      		lv_groupByExpressions_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2897:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==22) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2897:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleGroupByExpressions6160); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2901:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2902:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2902:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2903:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6181);
            	    lv_groupByExpressions_2_0=ruleSqlExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroupByExpressionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"groupByExpressions",
            	              		lv_groupByExpressions_2_0, 
            	              		"SqlExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupByExpressions"


    // $ANTLR start "entryRuleHavingExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2927:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2928:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2929:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6219);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions6229); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHavingExpressions"


    // $ANTLR start "ruleHavingExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2936:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2939:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2940:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2940:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2941:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2941:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2942:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6274);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHavingExpressionsRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHavingExpressions"


    // $ANTLR start "entryRuleOrderingTerm"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2966:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2967:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2968:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6309);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm6319); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderingTerm"


    // $ANTLR start "ruleOrderingTerm"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2975:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2978:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2979:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2979:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2979:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2979:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2980:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2980:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2981:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6365);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderingTermRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2997:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==81) ) {
                alt53=1;
            }
            else if ( (LA53_0==82) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2997:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2997:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2998:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2998:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2999:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,81,FOLLOW_81_in_ruleOrderingTerm6384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asc_1_0, grammarAccess.getOrderingTermAccess().getAscAscKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderingTermRule());
                      	        }
                             		setWithLastConsumed(current, "asc", true, "asc");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3013:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3013:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3014:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3014:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3015:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,82,FOLLOW_82_in_ruleOrderingTerm6421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_desc_2_0, grammarAccess.getOrderingTermAccess().getDescDescKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderingTermRule());
                      	        }
                             		setWithLastConsumed(current, "desc", true, "desc");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderingTerm"


    // $ANTLR start "entryRuleJoinSource"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3036:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3037:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3038:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource6472);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource6482); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinSource"


    // $ANTLR start "ruleJoinSource"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3045:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3048:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3050:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3050:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3051:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6528);
            lv_source_0_0=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinSourceRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_0_0, 
                      		"SingleSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3067:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=83 && LA54_0<=84)||(LA54_0>=86 && LA54_0<=88)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3068:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3068:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3069:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource6549);
            	    lv_joinStatements_1_0=ruleJoinStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getJoinSourceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"joinStatements",
            	              		lv_joinStatements_1_0, 
            	              		"JoinStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinSource"


    // $ANTLR start "entryRuleSingleSource"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3093:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3094:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3095:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource6586);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource6596); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleSource"


    // $ANTLR start "ruleSingleSource"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3102:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3105:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3106:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3106:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==21) ) {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==RULE_ID||LA55_2==21) ) {
                    alt55=3;
                }
                else if ( (LA55_2==74) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3107:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6643);
                    this_SingleSourceTable_0=ruleSingleSourceTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceTable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3117:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6670);
                    this_SingleSourceSelectStatement_1=ruleSingleSourceSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceSelectStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3127:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6697);
                    this_SingleSourceJoin_2=ruleSingleSourceJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceJoin_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleSource"


    // $ANTLR start "entryRuleSingleSourceTable"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3143:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3144:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3145:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6732);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6742); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleSourceTable"


    // $ANTLR start "ruleSingleSourceTable"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3152:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3155:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3156:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3156:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3156:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3156:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3157:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3162:2: ( (otherlv_1= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3163:1: (otherlv_1= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3163:1: (otherlv_1= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3164:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3175:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==67) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3175:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleSingleSourceTable6809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3179:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3180:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3180:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3181:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getSingleSourceTableAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleSourceTable"


    // $ANTLR start "entryRuleSingleSourceSelectStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3205:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3206:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3207:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6869);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleSourceSelectStatement"


    // $ANTLR start "ruleSingleSourceSelectStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3214:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3217:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3218:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3218:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3218:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3218:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3219:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSingleSourceSelectStatement6925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3228:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3229:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3229:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3230:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6946);
            lv_selectStatement_2_0=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleSourceSelectStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectStatement",
                      		lv_selectStatement_2_0, 
                      		"SelectStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSingleSourceSelectStatement6958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3250:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==67) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3250:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleSingleSourceSelectStatement6971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3254:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3255:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3255:1: (lv_name_5_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3256:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getSingleSourceSelectStatementAccess().getNameIDTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSingleSourceSelectStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleSourceSelectStatement"


    // $ANTLR start "entryRuleSingleSourceJoin"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3280:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3281:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3282:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7031);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin7041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleSourceJoin"


    // $ANTLR start "ruleSingleSourceJoin"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3289:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3292:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSingleSourceJoin7078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3297:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3298:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3298:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3299:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7099);
            lv_joinSource_1_0=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleSourceJoinRule());
              	        }
                     		set(
                     			current, 
                     			"joinSource",
                      		lv_joinSource_1_0, 
                      		"JoinSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSingleSourceJoin7111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSingleSourceJoinAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleSourceJoin"


    // $ANTLR start "entryRuleJoinStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3327:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3328:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3329:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7147);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement7157); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinStatement"


    // $ANTLR start "ruleJoinStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3336:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleJoinStatement() throws RecognitionException {
        EObject current = null;

        Token lv_natural_1_0=null;
        Token lv_left_2_0=null;
        Token lv_outer_3_0=null;
        Token lv_inner_4_0=null;
        Token lv_cross_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_singleSource_7_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3339:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3340:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3340:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3340:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3340:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3341:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3346:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==83) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3347:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3347:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3348:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement7209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_natural_1_0, grammarAccess.getJoinStatementAccess().getNaturalNaturalKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "natural", true, "natural");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3361:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt60=4;
            switch ( input.LA(1) ) {
                case 84:
                    {
                    alt60=1;
                    }
                    break;
                case 86:
                    {
                    alt60=2;
                    }
                    break;
                case 87:
                    {
                    alt60=3;
                    }
                    break;
            }

            switch (alt60) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3361:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3361:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3361:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3361:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3362:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3362:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3363:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement7243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_left_2_0, grammarAccess.getJoinStatementAccess().getLeftLeftKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "left", true, "left");
                      	    
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3376:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==85) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3377:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3377:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3378:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement7274); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_outer_3_0, grammarAccess.getJoinStatementAccess().getOuterOuterKeyword_2_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getJoinStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "outer", true, "outer");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3392:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3392:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3393:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3393:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3394:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement7313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_inner_4_0, grammarAccess.getJoinStatementAccess().getInnerInnerKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "inner", true, "inner");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3408:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3408:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3409:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3409:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3410:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,87,FOLLOW_87_in_ruleJoinStatement7350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cross_5_0, grammarAccess.getJoinStatementAccess().getCrossCrossKeyword_2_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "cross", true, "cross");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,88,FOLLOW_88_in_ruleJoinStatement7377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3427:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3428:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3428:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3429:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement7398);
            lv_singleSource_7_0=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
              	        }
                     		set(
                     			current, 
                     			"singleSource",
                      		lv_singleSource_7_0, 
                      		"SingleSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,89,FOLLOW_89_in_ruleJoinStatement7410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3449:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3450:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3450:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3451:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement7431);
            lv_expression_9_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_9_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinStatement"


    // $ANTLR start "entryRuleResultColumn"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3475:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3476:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3477:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn7467);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn7477); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultColumn"


    // $ANTLR start "ruleResultColumn"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3484:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3487:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3488:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3488:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3488:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3488:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3489:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3494:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3495:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3495:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3496:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn7532);
            lv_expression_1_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResultColumnRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3512:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==67) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3512:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleResultColumn7545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3516:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3517:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3517:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3518:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn7562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getResultColumnAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResultColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResultColumn"


    // $ANTLR start "entryRuleLiteralValue"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3542:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3543:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3544:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7605);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue7615); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3551:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token lv_literal_3_0=null;
        Token lv_literal_5_0=null;
        Token lv_literal_7_0=null;
        Token lv_literal_9_0=null;
        Token lv_literal_11_0=null;
        AntlrDatatypeRuleToken lv_number_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3554:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 32:
                {
                alt62=1;
                }
                break;
            case RULE_STRING:
                {
                alt62=2;
                }
                break;
            case 90:
                {
                alt62=3;
                }
                break;
            case 91:
                {
                alt62=4;
                }
                break;
            case 92:
                {
                alt62=5;
                }
                break;
            case 93:
                {
                alt62=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3556:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3561:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3562:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3562:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3563:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7671);
                    lv_number_1_0=ruleSignedNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralValueRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_1_0, 
                              		"SignedNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3580:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3580:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3580:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3580:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3581:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3586:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3587:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3587:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3588:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_literal_3_0, grammarAccess.getLiteralValueAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"literal",
                              		lv_literal_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3605:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3605:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3605:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3605:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3606:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3611:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3612:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3612:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3613:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue7745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_5_0, grammarAccess.getLiteralValueAccess().getLiteralNullKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_5_0, "null");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3627:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3627:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3627:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3627:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3628:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3633:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3634:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3634:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3635:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,91,FOLLOW_91_in_ruleLiteralValue7793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_7_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_timeKeyword_3_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_7_0, "current_time");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3649:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3649:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3649:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3649:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3650:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3655:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3656:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3656:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3657:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,92,FOLLOW_92_in_ruleLiteralValue7841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_9_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_dateKeyword_4_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_9_0, "current_date");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3671:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3671:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3671:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3671:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3672:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3677:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3678:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3678:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3679:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,93,FOLLOW_93_in_ruleLiteralValue7889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_11_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_timestampKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_11_0, "current_timestamp");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleDDLStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3700:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3701:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3702:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7939);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7949); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDDLStatement"


    // $ANTLR start "ruleDDLStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3709:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) ;
    public final EObject ruleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTableStatement_0 = null;

        EObject this_CreateViewStatement_1 = null;

        EObject this_CreateTriggerStatement_2 = null;

        EObject this_CreateIndexStatement_3 = null;

        EObject this_AlterTableRenameStatement_4 = null;

        EObject this_AlterTableAddColumnStatement_5 = null;

        EObject this_DropTableStatement_6 = null;

        EObject this_DropTriggerStatement_7 = null;

        EObject this_DropViewStatement_8 = null;

        EObject this_DropIndexStatement_9 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3712:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3713:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3713:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            int alt63=10;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3714:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7996);
                    this_CreateTableStatement_0=ruleCreateTableStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateTableStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3724:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8023);
                    this_CreateViewStatement_1=ruleCreateViewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateViewStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3734:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8050);
                    this_CreateTriggerStatement_2=ruleCreateTriggerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateTriggerStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3744:5: this_CreateIndexStatement_3= ruleCreateIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateIndexStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8077);
                    this_CreateIndexStatement_3=ruleCreateIndexStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateIndexStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3754:5: this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8104);
                    this_AlterTableRenameStatement_4=ruleAlterTableRenameStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableRenameStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3764:5: this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8131);
                    this_AlterTableAddColumnStatement_5=ruleAlterTableAddColumnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableAddColumnStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3774:5: this_DropTableStatement_6= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8158);
                    this_DropTableStatement_6=ruleDropTableStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTableStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3784:5: this_DropTriggerStatement_7= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8185);
                    this_DropTriggerStatement_7=ruleDropTriggerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTriggerStatement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3794:5: this_DropViewStatement_8= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8212);
                    this_DropViewStatement_8=ruleDropViewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropViewStatement_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3804:5: this_DropIndexStatement_9= ruleDropIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropIndexStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8239);
                    this_DropIndexStatement_9=ruleDropIndexStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropIndexStatement_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDDLStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3820:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3821:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3822:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8274);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement8284); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3829:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_temporary_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_columnDefs_6_0 = null;

        EObject lv_columnDefs_8_0 = null;

        EObject lv_constraints_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3832:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3833:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3833:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3833:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3833:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleCreateTableStatement8330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3843:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==95) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3844:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3844:1: (lv_temporary_2_0= 'temp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3845:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTableStatement8348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_2_0, grammarAccess.getCreateTableStatementAccess().getTemporaryTempKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTableStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,96,FOLLOW_96_in_ruleCreateTableStatement8374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3862:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3863:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3863:1: (lv_name_4_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3864:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement8391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCreateTableStatementAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTableStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCreateTableStatement8408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3884:1: ( (lv_columnDefs_6_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3885:1: (lv_columnDefs_6_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3885:1: (lv_columnDefs_6_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3886:3: lv_columnDefs_6_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8429);
            lv_columnDefs_6_0=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
              	        }
                     		add(
                     			current, 
                     			"columnDefs",
                      		lv_columnDefs_6_0, 
                      		"ColumnDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3902:2: (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==22) ) {
                    int LA65_1 = input.LA(2);

                    if ( (LA65_1==RULE_ID) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3902:4: otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleCreateTableStatement8442); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3906:1: ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3907:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3907:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3908:3: lv_columnDefs_8_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8463);
            	    lv_columnDefs_8_0=ruleColumnDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columnDefs",
            	              		lv_columnDefs_8_0, 
            	              		"ColumnDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3924:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==22) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3924:6: otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    {
            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleCreateTableStatement8478); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3928:1: ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3929:1: (lv_constraints_10_0= ruleTableConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3929:1: (lv_constraints_10_0= ruleTableConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3930:3: lv_constraints_10_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8499);
            	    lv_constraints_10_0=ruleTableConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_10_0, 
            	              		"TableConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleCreateTableStatement8513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleCreateViewStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3958:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3959:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3960:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8549);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement8559); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateViewStatement"


    // $ANTLR start "ruleCreateViewStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3967:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_temporary_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_selectStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3970:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3971:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3971:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3971:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3971:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3972:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleCreateViewStatement8605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3981:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==95) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3982:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3982:1: (lv_temporary_2_0= 'temp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3983:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateViewStatement8623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_2_0, grammarAccess.getCreateViewStatementAccess().getTemporaryTempKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,97,FOLLOW_97_in_ruleCreateViewStatement8649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getViewKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4000:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4001:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4001:1: (lv_name_4_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4002:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement8666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCreateViewStatementAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,67,FOLLOW_67_in_ruleCreateViewStatement8683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewStatementAccess().getAsKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4022:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4023:1: (lv_selectStatement_6_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4023:1: (lv_selectStatement_6_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4024:3: lv_selectStatement_6_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8704);
            lv_selectStatement_6_0=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateViewStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectStatement",
                      		lv_selectStatement_6_0, 
                      		"SelectStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateViewStatement"


    // $ANTLR start "entryRuleCreateTriggerStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4048:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4049:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4050:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8740);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement8750); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateTriggerStatement"


    // $ANTLR start "ruleCreateTriggerStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4057:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) ;
    public final EObject ruleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_temporary_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_when_4_1=null;
        Token lv_when_4_2=null;
        Token lv_when_4_3=null;
        Token lv_eventType_5_0=null;
        Token lv_eventType_6_0=null;
        Token lv_eventType_7_0=null;
        Token otherlv_8=null;
        Token lv_updateColumnNames_9_0=null;
        Token otherlv_10=null;
        Token lv_updateColumnNames_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_forEachRow_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_whenExpression_16_0 = null;

        EObject lv_statements_18_0 = null;

        EObject lv_statements_20_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4060:28: ( (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4061:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4061:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4061:3: otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement8787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4065:1: ( (lv_temporary_1_0= 'temp' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==95) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4066:1: (lv_temporary_1_0= 'temp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4066:1: (lv_temporary_1_0= 'temp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4067:3: lv_temporary_1_0= 'temp'
                    {
                    lv_temporary_1_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement8805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_1_0, grammarAccess.getCreateTriggerStatementAccess().getTemporaryTempKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4084:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4085:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4085:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4086:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateTriggerStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4102:2: ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=99 && LA70_0<=101)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4103:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4103:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4104:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4104:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    int alt69=3;
                    switch ( input.LA(1) ) {
                    case 99:
                        {
                        alt69=1;
                        }
                        break;
                    case 100:
                        {
                        alt69=2;
                        }
                        break;
                    case 101:
                        {
                        alt69=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }

                    switch (alt69) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4105:3: lv_when_4_1= 'before'
                            {
                            lv_when_4_1=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8873); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_1, grammarAccess.getCreateTriggerStatementAccess().getWhenBeforeKeyword_4_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4117:8: lv_when_4_2= 'after'
                            {
                            lv_when_4_2=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8902); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_2, grammarAccess.getCreateTriggerStatementAccess().getWhenAfterKeyword_4_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4129:8: lv_when_4_3= 'instead of'
                            {
                            lv_when_4_3=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement8931); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_3, grammarAccess.getCreateTriggerStatementAccess().getWhenInsteadOfKeyword_4_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4144:3: ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt73=1;
                }
                break;
            case 103:
                {
                alt73=2;
                }
                break;
            case 104:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4144:4: ( (lv_eventType_5_0= 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4144:4: ( (lv_eventType_5_0= 'delete' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4145:1: (lv_eventType_5_0= 'delete' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4145:1: (lv_eventType_5_0= 'delete' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4146:3: lv_eventType_5_0= 'delete'
                    {
                    lv_eventType_5_0=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement8967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_5_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeDeleteKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_5_0, "delete");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4160:6: ( (lv_eventType_6_0= 'insert' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4160:6: ( (lv_eventType_6_0= 'insert' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4161:1: (lv_eventType_6_0= 'insert' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4161:1: (lv_eventType_6_0= 'insert' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4162:3: lv_eventType_6_0= 'insert'
                    {
                    lv_eventType_6_0=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement9004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_6_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeInsertKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_6_0, "insert");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:7: ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:7: ( (lv_eventType_7_0= 'update' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4177:1: (lv_eventType_7_0= 'update' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4177:1: (lv_eventType_7_0= 'update' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4178:3: lv_eventType_7_0= 'update'
                    {
                    lv_eventType_7_0=(Token)match(input,104,FOLLOW_104_in_ruleCreateTriggerStatement9042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_7_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeUpdateKeyword_5_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_7_0, "update");
                      	    
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4191:2: (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==105) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4191:4: otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            {
                            otherlv_8=(Token)match(input,105,FOLLOW_105_in_ruleCreateTriggerStatement9068); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_5_2_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4195:1: ( (lv_updateColumnNames_9_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4196:1: (lv_updateColumnNames_9_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4196:1: (lv_updateColumnNames_9_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4197:3: lv_updateColumnNames_9_0= RULE_ID
                            {
                            lv_updateColumnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9085); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_updateColumnNames_9_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_5_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		addWithLastConsumed(
                                     			current, 
                                     			"updateColumnNames",
                                      		lv_updateColumnNames_9_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4213:2: (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==22) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4213:4: otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleCreateTriggerStatement9103); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_5_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4217:1: ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4218:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4218:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4219:3: lv_updateColumnNames_11_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9120); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      			newLeafNode(lv_updateColumnNames_11_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_5_2_1_2_1_0()); 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                            	      	        }
                            	             		addWithLastConsumed(
                            	             			current, 
                            	             			"updateColumnNames",
                            	              		lv_updateColumnNames_11_0, 
                            	              		"ID");
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,89,FOLLOW_89_in_ruleCreateTriggerStatement9143); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_6());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4239:1: ( (otherlv_13= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4240:1: (otherlv_13= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4240:1: (otherlv_13= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4241:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_7_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4252:2: ( (lv_forEachRow_14_0= 'for each row' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==106) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4253:1: (lv_forEachRow_14_0= 'for each row' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4253:1: (lv_forEachRow_14_0= 'for each row' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4254:3: lv_forEachRow_14_0= 'for each row'
                    {
                    lv_forEachRow_14_0=(Token)match(input,106,FOLLOW_106_in_ruleCreateTriggerStatement9181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_forEachRow_14_0, grammarAccess.getCreateTriggerStatementAccess().getForEachRowForEachRowKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "forEachRow", lv_forEachRow_14_0, "for each row");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4267:3: (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==69) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4267:5: otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,69,FOLLOW_69_in_ruleCreateTriggerStatement9208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_9_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4271:1: ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4272:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4272:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4273:3: lv_whenExpression_16_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9229);
                    lv_whenExpression_16_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whenExpression",
                              		lv_whenExpression_16_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,107,FOLLOW_107_in_ruleCreateTriggerStatement9243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_10());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4293:1: ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==74||(LA77_0>=102 && LA77_0<=104)||LA77_0==122) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4293:2: ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4293:2: ( (lv_statements_18_0= ruleDMLStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4294:1: (lv_statements_18_0= ruleDMLStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4294:1: (lv_statements_18_0= ruleDMLStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4295:3: lv_statements_18_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9265);
                    lv_statements_18_0=ruleDMLStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_18_0, 
                              		"DMLStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleCreateTriggerStatement9277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4315:1: ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==74||(LA76_0>=102 && LA76_0<=104)||LA76_0==122) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4315:2: ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4315:2: ( (lv_statements_20_0= ruleDMLStatement ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4316:1: (lv_statements_20_0= ruleDMLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4316:1: (lv_statements_20_0= ruleDMLStatement )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4317:3: lv_statements_20_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9299);
                    	    lv_statements_20_0=ruleDMLStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_20_0, 
                    	              		"DMLStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleCreateTriggerStatement9311); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,65,FOLLOW_65_in_ruleCreateTriggerStatement9327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getCreateTriggerStatementAccess().getEndKeyword_12());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateTriggerStatement"


    // $ANTLR start "entryRuleAlterTableRenameStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4349:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4350:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4351:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9363);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9373); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterTableRenameStatement"


    // $ANTLR start "ruleAlterTableRenameStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4358:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4361:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4362:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4362:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4362:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4362:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4363:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableRenameStatement9419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,96,FOLLOW_96_in_ruleAlterTableRenameStatement9431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4376:1: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4377:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4377:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4378:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleAlterTableRenameStatement9463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4393:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4394:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4394:1: (lv_name_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4395:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getAlterTableRenameStatementAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlterTableRenameStatement"


    // $ANTLR start "entryRuleAlterTableAddColumnStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4419:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4420:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4421:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9521);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9531); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterTableAddColumnStatement"


    // $ANTLR start "ruleAlterTableAddColumnStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4428:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4431:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4432:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4432:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4432:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableAddColumnStatement9568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleAlterTableAddColumnStatement9580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4440:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4441:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4441:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4442:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,110,FOLLOW_110_in_ruleAlterTableAddColumnStatement9612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4457:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4458:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4458:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4459:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9633);
            lv_columnDef_4_0=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"columnDef",
                      		lv_columnDef_4_0, 
                      		"ColumnDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlterTableAddColumnStatement"


    // $ANTLR start "entryRuleDropTableStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4483:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4484:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4485:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9669);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement9679); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropTableStatement"


    // $ANTLR start "ruleDropTableStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4492:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4495:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4496:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4496:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4496:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTableStatement9716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleDropTableStatement9728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4504:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==112) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4505:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4505:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4506:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropTableStatement9746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTableStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropTableStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4519:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4520:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4520:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4521:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement9780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropTableStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropTableStatement"


    // $ANTLR start "entryRuleDropTriggerStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4540:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4541:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4542:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9816);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9826); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropTriggerStatement"


    // $ANTLR start "ruleDropTriggerStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4549:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4552:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4553:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4553:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4553:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTriggerStatement9863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,98,FOLLOW_98_in_ruleDropTriggerStatement9875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4561:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==112) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4562:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4562:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4563:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropTriggerStatement9893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTriggerStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4576:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4577:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4577:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4578:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropTriggerStatementAccess().getTriggerCreateTriggerStatementCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropTriggerStatement"


    // $ANTLR start "entryRuleDropViewStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4597:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4598:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4599:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9963);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9973); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropViewStatement"


    // $ANTLR start "ruleDropViewStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4606:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4609:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4610:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4610:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4610:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropViewStatement10010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleDropViewStatement10022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4618:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==112) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4619:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4619:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4620:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropViewStatement10040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropViewStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropViewStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4633:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4634:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4634:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4635:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement10074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropViewStatementAccess().getViewCreateViewStatementCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropViewStatement"


    // $ANTLR start "entryRuleCreateIndexStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4654:1: entryRuleCreateIndexStatement returns [EObject current=null] : iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF ;
    public final EObject entryRuleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateIndexStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4655:2: (iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4656:2: iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10110);
            iv_ruleCreateIndexStatement=ruleCreateIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateIndexStatement10120); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateIndexStatement"


    // $ANTLR start "ruleCreateIndexStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4663:1: ruleCreateIndexStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) ;
    public final EObject ruleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unique_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_columns_7_0 = null;

        EObject lv_columns_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4666:28: ( (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4667:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4667:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4667:3: otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateIndexStatement10157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateIndexStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4671:1: ( (lv_unique_1_0= 'unique' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==113) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4672:1: (lv_unique_1_0= 'unique' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4672:1: (lv_unique_1_0= 'unique' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4673:3: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,113,FOLLOW_113_in_ruleCreateIndexStatement10175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unique_1_0, grammarAccess.getCreateIndexStatementAccess().getUniqueUniqueKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
                      	        }
                             		setWithLastConsumed(current, "unique", true, "unique");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,114,FOLLOW_114_in_ruleCreateIndexStatement10201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateIndexStatementAccess().getIndexKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4690:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4691:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4691:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4692:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateIndexStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,89,FOLLOW_89_in_ruleCreateIndexStatement10235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateIndexStatementAccess().getOnKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4712:1: ( (otherlv_5= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4713:1: (otherlv_5= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4713:1: (otherlv_5= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4714:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getCreateIndexStatementAccess().getTableTableDefinitionCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleCreateIndexStatement10267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCreateIndexStatementAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4729:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4730:1: (lv_columns_7_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4730:1: (lv_columns_7_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4731:3: lv_columns_7_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10288);
            lv_columns_7_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateIndexStatementRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_7_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4747:2: (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==22) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4747:4: otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleCreateIndexStatement10301); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateIndexStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4751:1: ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4752:1: (lv_columns_9_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4752:1: (lv_columns_9_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4753:3: lv_columns_9_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10322);
            	    lv_columns_9_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateIndexStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_9_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleCreateIndexStatement10336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCreateIndexStatementAccess().getRightParenthesisKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateIndexStatement"


    // $ANTLR start "entryRuleDropIndexStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4781:1: entryRuleDropIndexStatement returns [EObject current=null] : iv_ruleDropIndexStatement= ruleDropIndexStatement EOF ;
    public final EObject entryRuleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4782:2: (iv_ruleDropIndexStatement= ruleDropIndexStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4783:2: iv_ruleDropIndexStatement= ruleDropIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10372);
            iv_ruleDropIndexStatement=ruleDropIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropIndexStatement10382); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDropIndexStatement"


    // $ANTLR start "ruleDropIndexStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4790:1: ruleDropIndexStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4793:28: ( (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4794:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4794:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4794:3: otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropIndexStatement10419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropIndexStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleDropIndexStatement10431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropIndexStatementAccess().getIndexKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4802:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==112) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4803:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4803:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4804:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropIndexStatement10449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropIndexStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4817:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4818:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4818:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4819:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropIndexStatement10483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropIndexStatementAccess().getIndexCreateIndexStatementCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDropIndexStatement"


    // $ANTLR start "entryRuleColumnDef"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4838:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4839:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4840:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef10519);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef10529); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnDef"


    // $ANTLR start "ruleColumnDef"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4847:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4850:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4851:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4851:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4851:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4851:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4852:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4857:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4858:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4858:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4859:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef10580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getColumnDefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4875:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4876:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4876:1: (lv_type_2_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4877:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef10606);
            lv_type_2_0=ruleColumnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ColumnType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4893:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==56||LA84_0==113||LA84_0==115||LA84_0==117) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4894:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4894:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4895:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef10627);
            	    lv_constraints_3_0=ruleColumnConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_3_0, 
            	              		"ColumnConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnDef"


    // $ANTLR start "entryRuleColumnConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4919:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4921:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10664);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint10674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnConstraint"


    // $ANTLR start "ruleColumnConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4928:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) ) ;
    public final EObject ruleColumnConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asc_2_0=null;
        Token lv_desc_3_0=null;
        Token lv_autoincrement_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_conflictClause_7_0 = null;

        EObject lv_conflictClause_10_0 = null;

        EObject lv_defaultValue_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4931:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) )
            int alt89=4;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt89=1;
                }
                break;
            case 56:
                {
                alt89=2;
                }
                break;
            case 113:
                {
                alt89=3;
                }
                break;
            case 117:
                {
                alt89=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleColumnConstraint10721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4942:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt85=3;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==81) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==82) ) {
                        alt85=2;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4942:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4942:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4943:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4943:1: (lv_asc_2_0= 'asc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4944:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,81,FOLLOW_81_in_ruleColumnConstraint10740); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_asc_2_0, grammarAccess.getColumnConstraintAccess().getAscAscKeyword_0_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "asc", true, "asc");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4958:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4958:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4959:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4959:1: (lv_desc_3_0= 'desc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4960:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,82,FOLLOW_82_in_ruleColumnConstraint10777); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_desc_3_0, grammarAccess.getColumnConstraintAccess().getDescDescKeyword_0_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "desc", true, "desc");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4973:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==116) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4974:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4974:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4975:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,116,FOLLOW_116_in_ruleColumnConstraint10810); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_autoincrement_4_0, grammarAccess.getColumnConstraintAccess().getAutoincrementAutoincrementKeyword_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "autoincrement", true, "autoincrement");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4989:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4989:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4989:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4989:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4990:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleColumnConstraint10853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4999:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==89) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5000:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5000:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5001:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10874);
                            lv_conflictClause_7_0=ruleConflictClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictClause",
                                      		lv_conflictClause_7_0, 
                                      		"ConflictClause");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5018:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5018:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5018:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5018:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5019:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,113,FOLLOW_113_in_ruleColumnConstraint10904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5028:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==89) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5029:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5029:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5030:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10925);
                            lv_conflictClause_10_0=ruleConflictClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictClause",
                                      		lv_conflictClause_10_0, 
                                      		"ConflictClause");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5047:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5047:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5047:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5047:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5048:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,117,FOLLOW_117_in_ruleColumnConstraint10955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5057:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5058:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5058:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5059:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10976);
                    lv_defaultValue_13_0=ruleDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_13_0, 
                              		"DefaultValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnConstraint"


    // $ANTLR start "entryRuleTableConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5083:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5084:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5085:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11013);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint11023); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableConstraint"


    // $ANTLR start "ruleTableConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5092:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5095:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5096:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5096:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 118:
                {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 113:
                        {
                        alt90=1;
                        }
                        break;
                    case 119:
                        {
                        alt90=3;
                        }
                        break;
                    case 115:
                        {
                        alt90=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;
                }
                }
                break;
            case 113:
                {
                alt90=1;
                }
                break;
            case 115:
                {
                alt90=2;
                }
                break;
            case 119:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5097:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11070);
                    this_UniqueTableConstraint_0=ruleUniqueTableConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UniqueTableConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5107:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11097);
                    this_PrimaryConstraint_1=rulePrimaryConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5117:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11124);
                    this_CheckTableConstraint_2=ruleCheckTableConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CheckTableConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableConstraint"


    // $ANTLR start "entryRuleUniqueTableConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5133:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5134:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5135:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11159);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint11169); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniqueTableConstraint"


    // $ANTLR start "ruleUniqueTableConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5142:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
    public final EObject ruleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_conflictClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5145:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5146:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5146:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5146:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5146:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==118) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5146:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,118,FOLLOW_118_in_ruleUniqueTableConstraint11207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5150:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5151:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5151:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5152:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getUniqueTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUniqueTableConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,113,FOLLOW_113_in_ruleUniqueTableConstraint11243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleUniqueTableConstraint11255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5176:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5177:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5177:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5178:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11276);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_4_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5194:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==22) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5194:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleUniqueTableConstraint11289); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5198:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5199:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5199:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5200:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11310);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_6_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleUniqueTableConstraint11324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5220:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5221:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5221:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5222:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11345);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"conflictClause",
                      		lv_conflictClause_8_0, 
                      		"ConflictClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniqueTableConstraint"


    // $ANTLR start "entryRulePrimaryConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5246:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5248:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11381);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint11391); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryConstraint"


    // $ANTLR start "rulePrimaryConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
    public final EObject rulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_conflictClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5258:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5259:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5259:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5259:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5259:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==118) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5259:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,118,FOLLOW_118_in_rulePrimaryConstraint11429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5263:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5264:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5264:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5265:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint11446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getPrimaryConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_rulePrimaryConstraint11465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePrimaryConstraint11477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5289:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5290:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5290:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5291:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11498);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_4_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5307:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==22) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5307:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulePrimaryConstraint11511); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5311:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5312:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5312:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5313:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11532);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_6_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_rulePrimaryConstraint11546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5333:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5334:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5334:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5335:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11567);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"conflictClause",
                      		lv_conflictClause_8_0, 
                      		"ConflictClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryConstraint"


    // $ANTLR start "entryRuleCheckTableConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5359:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5360:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5361:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11603);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint11613); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckTableConstraint"


    // $ANTLR start "ruleCheckTableConstraint"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5368:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5371:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5372:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5372:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5372:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5372:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==118) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5372:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,118,FOLLOW_118_in_ruleCheckTableConstraint11651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5376:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5377:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5377:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5378:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint11668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getCheckTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCheckTableConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,119,FOLLOW_119_in_ruleCheckTableConstraint11687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCheckTableConstraint11699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5402:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5403:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5403:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5404:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11720);
            lv_expression_4_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCheckTableConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleCheckTableConstraint11732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCheckTableConstraintAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckTableConstraint"


    // $ANTLR start "entryRuleIndexedColumn"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5432:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5433:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5434:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11768);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn11778); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexedColumn"


    // $ANTLR start "ruleIndexedColumn"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5441:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collationName_2_0=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5444:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5445:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5445:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5445:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5445:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5446:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5446:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5447:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5458:2: (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==120) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5458:4: otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,120,FOLLOW_120_in_ruleIndexedColumn11836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIndexedColumnAccess().getCollateKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5462:1: ( (lv_collationName_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5463:1: (lv_collationName_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5463:1: (lv_collationName_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5464:3: lv_collationName_2_0= RULE_ID
                    {
                    lv_collationName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_collationName_2_0, grammarAccess.getIndexedColumnAccess().getCollationNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"collationName",
                              		lv_collationName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5480:4: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==81) ) {
                alt97=1;
            }
            else if ( (LA97_0==82) ) {
                alt97=2;
            }
            switch (alt97) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5480:5: ( (lv_asc_3_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5480:5: ( (lv_asc_3_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5481:1: (lv_asc_3_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5481:1: (lv_asc_3_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5482:3: lv_asc_3_0= 'asc'
                    {
                    lv_asc_3_0=(Token)match(input,81,FOLLOW_81_in_ruleIndexedColumn11879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asc_3_0, grammarAccess.getIndexedColumnAccess().getAscAscKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(current, "asc", true, "asc");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5496:6: ( (lv_desc_4_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5496:6: ( (lv_desc_4_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5497:1: (lv_desc_4_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5497:1: (lv_desc_4_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5498:3: lv_desc_4_0= 'desc'
                    {
                    lv_desc_4_0=(Token)match(input,82,FOLLOW_82_in_ruleIndexedColumn11916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_desc_4_0, grammarAccess.getIndexedColumnAccess().getDescDescKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(current, "desc", true, "desc");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexedColumn"


    // $ANTLR start "entryRuleDefaultValue"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5519:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5520:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5521:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue11967);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue11977); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultValue"


    // $ANTLR start "ruleDefaultValue"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5528:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5531:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5532:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5532:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=RULE_STRING && LA98_0<=RULE_NUMBER)||LA98_0==32||(LA98_0>=90 && LA98_0<=93)) ) {
                alt98=1;
            }
            else if ( (LA98_0==21) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5532:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5532:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5532:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5532:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5533:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5538:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5539:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5539:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5540:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue12033);
                    lv_literal_1_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_1_0, 
                              		"LiteralValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5557:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5557:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5557:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5557:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5558:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDefaultValue12062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5567:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5568:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5568:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5569:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue12083);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleDefaultValue12095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefaultValueAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultValue"


    // $ANTLR start "entryRuleConflictClause"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5597:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5598:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5599:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause12132);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause12142); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConflictClause"


    // $ANTLR start "ruleConflictClause"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5606:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5609:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5610:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5610:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5610:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleConflictClause12179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,121,FOLLOW_121_in_ruleConflictClause12191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5618:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5619:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5619:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5620:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause12212);
            lv_resolution_2_0=ruleConflictResolution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConflictClauseRule());
              	        }
                     		set(
                     			current, 
                     			"resolution",
                      		lv_resolution_2_0, 
                      		"ConflictResolution");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConflictClause"


    // $ANTLR start "entryRuleDMLStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5644:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5645:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5646:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12248);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement12258); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDMLStatement"


    // $ANTLR start "ruleDMLStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5653:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5656:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5657:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5657:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt99=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt99=1;
                }
                break;
            case 103:
            case 122:
                {
                alt99=2;
                }
                break;
            case 104:
                {
                alt99=3;
                }
                break;
            case 102:
                {
                alt99=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5658:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement12305);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelectStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5668:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement12332);
                    this_InsertStatement_1=ruleInsertStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InsertStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5678:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12359);
                    this_UpdateStatement_2=ruleUpdateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UpdateStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5688:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12386);
                    this_DeleteStatement_3=ruleDeleteStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeleteStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDMLStatement"


    // $ANTLR start "entryRuleDeleteStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5704:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5705:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5706:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12421);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement12431); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5713:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5716:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleDeleteStatement12468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleDeleteStatement12480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5725:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5726:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5726:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5727:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement12500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5738:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==78) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5738:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_78_in_ruleDeleteStatement12513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5742:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5743:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5743:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5744:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12534);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleInsertStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5768:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5769:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5770:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12572);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement12582); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsertStatement"


    // $ANTLR start "ruleInsertStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5777:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_conflictResolution_2_0 = null;

        EObject lv_expressions_13_0 = null;

        EObject lv_expressions_15_0 = null;

        EObject lv_selectStatement_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5780:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5781:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5781:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5781:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5781:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==103) ) {
                alt102=1;
            }
            else if ( (LA102_0==122) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5781:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5781:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5781:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleInsertStatement12621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5785:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==54) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5785:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInsertStatement12634); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5789:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5790:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5790:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5791:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement12655);
                            lv_conflictResolution_2_0=ruleConflictResolution();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictResolution",
                                      		lv_conflictResolution_2_0, 
                                      		"ConflictResolution");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5808:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,122,FOLLOW_122_in_ruleInsertStatement12676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,123,FOLLOW_123_in_ruleInsertStatement12689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5816:1: ( (otherlv_5= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5817:1: (otherlv_5= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5817:1: (otherlv_5= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5818:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5829:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==21) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5829:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleInsertStatement12722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5833:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5834:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5834:1: (otherlv_7= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5835:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5846:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==22) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5846:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleInsertStatement12755); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5850:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5851:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5851:1: (otherlv_9= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5852:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12775); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleInsertStatement12789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5867:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==74||LA107_0==124) ) {
                alt107=1;
            }
            else if ( (LA107_0==117) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5867:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5867:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==124) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==74) ) {
                        alt106=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5867:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5867:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5867:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,124,FOLLOW_124_in_ruleInsertStatement12806); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleInsertStatement12818); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5875:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5876:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5876:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5877:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12839);
                            lv_expressions_13_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"expressions",
                                      		lv_expressions_13_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5893:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop105:
                            do {
                                int alt105=2;
                                int LA105_0 = input.LA(1);

                                if ( (LA105_0==22) ) {
                                    alt105=1;
                                }


                                switch (alt105) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5893:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleInsertStatement12852); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5897:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5898:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5898:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5899:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12873);
                            	    lv_expressions_15_0=ruleSqlExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"expressions",
                            	              		lv_expressions_15_0, 
                            	              		"SqlExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop105;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleInsertStatement12887); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5920:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5920:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5921:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5921:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5922:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement12915);
                            lv_selectStatement_17_0=ruleSelectStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"selectStatement",
                                      		lv_selectStatement_17_0, 
                                      		"SelectStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5939:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5939:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5939:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,117,FOLLOW_117_in_ruleInsertStatement12935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,124,FOLLOW_124_in_ruleInsertStatement12947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsertStatement"


    // $ANTLR start "entryRuleUpdateStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5955:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5956:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5957:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement12985);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement12995); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5964:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_conflictResolution_2_0 = null;

        EObject lv_updateColumnExpressions_5_0 = null;

        EObject lv_updateColumnExpressions_7_0 = null;

        EObject lv_whereExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5967:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5968:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5968:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5968:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleUpdateStatement13032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5972:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==54) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5972:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleUpdateStatement13045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5976:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5977:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5977:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5978:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13066);
                    lv_conflictResolution_2_0=ruleConflictResolution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"conflictResolution",
                              		lv_conflictResolution_2_0, 
                              		"ConflictResolution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5994:4: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5995:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5995:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5996:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement13088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,125,FOLLOW_125_in_ruleUpdateStatement13100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6011:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6012:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6012:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6013:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13121);
            lv_updateColumnExpressions_5_0=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
              	        }
                     		add(
                     			current, 
                     			"updateColumnExpressions",
                      		lv_updateColumnExpressions_5_0, 
                      		"UpdateColumnExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6029:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==22) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6029:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleUpdateStatement13134); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6033:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6034:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6034:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6035:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13155);
            	    lv_updateColumnExpressions_7_0=ruleUpdateColumnExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"updateColumnExpressions",
            	              		lv_updateColumnExpressions_7_0, 
            	              		"UpdateColumnExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6051:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==78) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6051:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleUpdateStatement13170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6055:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6056:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6056:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6057:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13191);
                    lv_whereExpression_9_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whereExpression",
                              		lv_whereExpression_9_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleUpdateColumnExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6081:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6082:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6083:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13229);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression13239); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateColumnExpression"


    // $ANTLR start "ruleUpdateColumnExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6090:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6093:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6094:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6094:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6094:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6094:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6095:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6095:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6096:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleUpdateColumnExpression13296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6111:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6112:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6112:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6113:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13317);
            lv_expression_2_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateColumnExpression"


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6137:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6138:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6139:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13354);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber13365); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedNumber"


    // $ANTLR start "ruleSignedNumber"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6146:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6149:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6150:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6150:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6150:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6150:2: (kw= '-' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==32) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6151:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleSignedNumber13404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber13421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NUMBER_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NUMBER_1, grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedNumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6171:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6172:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6173:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13467);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6180:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6183:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6184:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6191:1: (kw= '.' this_ID_2= RULE_ID )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==60) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6192:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleQualifiedName13537); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13552); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCompoundOperator"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6212:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6214:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6215:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6215:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt113=1;
                }
                break;
            case 127:
                {
                alt113=2;
                }
                break;
            case 128:
                {
                alt113=3;
                }
                break;
            case 129:
                {
                alt113=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6215:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6215:2: (enumLiteral_0= 'union all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6215:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_126_in_ruleCompoundOperator13613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6221:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6221:6: (enumLiteral_1= 'union' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6221:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_127_in_ruleCompoundOperator13630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6227:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6227:6: (enumLiteral_2= 'intersect' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6227:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,128,FOLLOW_128_in_ruleCompoundOperator13647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6233:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6233:6: (enumLiteral_3= 'except' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6233:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,129,FOLLOW_129_in_ruleCompoundOperator13664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundOperator"


    // $ANTLR start "ruleSqliteDataType"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6243:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
    public final Enumerator ruleSqliteDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6245:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6246:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6246:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt114=6;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt114=1;
                }
                break;
            case 131:
                {
                alt114=2;
                }
                break;
            case 132:
                {
                alt114=3;
                }
                break;
            case 133:
                {
                alt114=4;
                }
                break;
            case 134:
                {
                alt114=5;
                }
                break;
            case 135:
                {
                alt114=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6246:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6246:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6246:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_130_in_ruleSqliteDataType13709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6252:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6252:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6252:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_131_in_ruleSqliteDataType13726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6258:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6258:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6258:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_132_in_ruleSqliteDataType13743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6264:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6264:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6264:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,133,FOLLOW_133_in_ruleSqliteDataType13760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6270:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6270:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6270:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,134,FOLLOW_134_in_ruleSqliteDataType13777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6276:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6276:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6276:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,135,FOLLOW_135_in_ruleSqliteDataType13794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqliteDataType"


    // $ANTLR start "ruleColumnType"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6286:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6288:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6289:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6289:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt115=5;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt115=1;
                }
                break;
            case 131:
                {
                alt115=2;
                }
                break;
            case 132:
                {
                alt115=3;
                }
                break;
            case 133:
                {
                alt115=4;
                }
                break;
            case 136:
                {
                alt115=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6289:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6289:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6289:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_130_in_ruleColumnType13839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6295:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6295:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6295:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_131_in_ruleColumnType13856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6301:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6301:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6301:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_132_in_ruleColumnType13873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6307:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6307:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6307:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,133,FOLLOW_133_in_ruleColumnType13890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6313:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6313:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6313:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,136,FOLLOW_136_in_ruleColumnType13907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "ruleConflictResolution"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6323:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6325:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6326:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6326:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt116=5;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt116=1;
                }
                break;
            case 138:
                {
                alt116=2;
                }
                break;
            case 139:
                {
                alt116=3;
                }
                break;
            case 140:
                {
                alt116=4;
                }
                break;
            case 122:
                {
                alt116=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6326:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6326:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6326:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,137,FOLLOW_137_in_ruleConflictResolution13952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6332:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6332:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6332:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,138,FOLLOW_138_in_ruleConflictResolution13969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6338:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6338:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6338:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,139,FOLLOW_139_in_ruleConflictResolution13986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6344:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6344:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6344:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,140,FOLLOW_140_in_ruleConflictResolution14003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6350:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6350:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6350:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,122,FOLLOW_122_in_ruleConflictResolution14020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConflictResolution"

    // $ANTLR start synpred1_InternalSqliteModel
    public final void synpred1_InternalSqliteModel_fragment() throws RecognitionException {   
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:5: ( ( RULE_ID ) )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1818:1: ( RULE_ID )
        {
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1818:1: ( RULE_ID )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1819:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel4018); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalSqliteModel

    // Delegated rules

    public final boolean synpred1_InternalSqliteModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSqliteModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA38 dfa38 = new DFA38(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA38_eotS =
        "\15\uffff";
    static final String DFA38_eofS =
        "\3\uffff\1\12\11\uffff";
    static final String DFA38_minS =
        "\1\4\2\uffff\1\17\1\uffff\1\4\7\uffff";
    static final String DFA38_maxS =
        "\1\135\2\uffff\1\u0081\1\uffff\1\135\7\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\12\1\3\1\10"+
        "\1\5";
    static final String DFA38_specialS =
        "\15\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\3\2\4\16\uffff\1\5\12\uffff\1\4\31\uffff\1\1\1\2\1\uffff"+
            "\2\6\1\7\2\uffff\1\10\1\uffff\1\11\25\uffff\4\4",
            "",
            "",
            "\1\12\2\uffff\1\12\2\uffff\1\13\3\12\2\uffff\1\12\1\uffff\35"+
            "\12\2\uffff\1\12\3\uffff\2\12\1\uffff\1\12\1\uffff\5\12\3\uffff"+
            "\10\12\1\uffff\3\12\22\uffff\1\12\22\uffff\4\12",
            "",
            "\3\14\16\uffff\1\14\12\uffff\1\14\31\uffff\2\14\1\uffff\3\14"+
            "\2\uffff\1\14\1\uffff\1\14\5\uffff\1\6\17\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1763:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )";
        }
    }
    static final String DFA30_eotS =
        "\122\uffff";
    static final String DFA30_eofS =
        "\1\uffff\1\2\1\uffff\1\44\1\5\115\uffff";
    static final String DFA30_minS =
        "\1\4\1\17\1\uffff\2\4\74\uffff\1\4\17\uffff\1\0";
    static final String DFA30_maxS =
        "\1\4\1\u0081\1\uffff\2\u0081\74\uffff\1\135\17\uffff\1\0";
    static final String DFA30_acceptS =
        "\2\uffff\1\3\2\uffff\1\2\73\1\1\uffff\17\1\1\uffff";
    static final String DFA30_specialS =
        "\3\uffff\1\0\1\1\114\uffff\1\2}>";
    static final String[] DFA30_transitionS = {
            "\1\1",
            "\1\2\2\uffff\1\2\3\uffff\3\2\2\uffff\1\2\1\uffff\35\2\2\uffff"+
            "\1\3\3\uffff\2\2\1\uffff\1\2\1\uffff\5\2\3\uffff\10\2\1\uffff"+
            "\3\2\22\uffff\1\2\22\uffff\4\2",
            "",
            "\1\5\12\uffff\1\55\2\uffff\1\56\3\uffff\1\50\1\45\1\41\2\uffff"+
            "\1\4\1\uffff\1\43\1\42\1\37\1\40\1\33\1\34\1\35\1\36\1\27\1"+
            "\30\1\31\1\32\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1"+
            "\24\1\25\1\26\1\12\1\11\1\6\1\7\1\10\6\uffff\1\53\1\47\1\uffff"+
            "\1\51\1\uffff\1\46\1\52\1\65\1\66\1\54\3\uffff\1\77\1\71\1\57"+
            "\1\60\1\67\1\70\1\72\1\73\1\uffff\1\74\1\75\1\76\22\uffff\1"+
            "\100\22\uffff\1\61\1\62\1\63\1\64",
            "\1\104\1\106\1\105\10\uffff\1\5\2\uffff\1\5\2\uffff\1\113\3"+
            "\5\2\uffff\1\5\1\uffff\3\5\1\101\31\5\1\102\1\103\1\uffff\1"+
            "\114\1\115\1\116\2\5\1\117\1\5\1\120\5\5\3\uffff\10\5\1\uffff"+
            "\3\5\1\uffff\1\107\1\110\1\111\1\112\15\uffff\1\5\22\uffff\4"+
            "\5",
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
            "\2\5\1\121\16\uffff\1\5\12\uffff\1\5\31\uffff\2\5\1\uffff\3"+
            "\5\2\uffff\1\5\1\uffff\1\5\25\uffff\4\5",
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
            "\1\uffff"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1817:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_3==27) ) {s = 4;}

                        else if ( (LA30_3==RULE_ID) ) {s = 5;}

                        else if ( (LA30_3==55) && (synpred1_InternalSqliteModel())) {s = 6;}

                        else if ( (LA30_3==56) && (synpred1_InternalSqliteModel())) {s = 7;}

                        else if ( (LA30_3==57) && (synpred1_InternalSqliteModel())) {s = 8;}

                        else if ( (LA30_3==54) && (synpred1_InternalSqliteModel())) {s = 9;}

                        else if ( (LA30_3==53) && (synpred1_InternalSqliteModel())) {s = 10;}

                        else if ( (LA30_3==41) && (synpred1_InternalSqliteModel())) {s = 11;}

                        else if ( (LA30_3==42) && (synpred1_InternalSqliteModel())) {s = 12;}

                        else if ( (LA30_3==43) && (synpred1_InternalSqliteModel())) {s = 13;}

                        else if ( (LA30_3==44) && (synpred1_InternalSqliteModel())) {s = 14;}

                        else if ( (LA30_3==45) && (synpred1_InternalSqliteModel())) {s = 15;}

                        else if ( (LA30_3==46) && (synpred1_InternalSqliteModel())) {s = 16;}

                        else if ( (LA30_3==47) && (synpred1_InternalSqliteModel())) {s = 17;}

                        else if ( (LA30_3==48) && (synpred1_InternalSqliteModel())) {s = 18;}

                        else if ( (LA30_3==49) && (synpred1_InternalSqliteModel())) {s = 19;}

                        else if ( (LA30_3==50) && (synpred1_InternalSqliteModel())) {s = 20;}

                        else if ( (LA30_3==51) && (synpred1_InternalSqliteModel())) {s = 21;}

                        else if ( (LA30_3==52) && (synpred1_InternalSqliteModel())) {s = 22;}

                        else if ( (LA30_3==37) && (synpred1_InternalSqliteModel())) {s = 23;}

                        else if ( (LA30_3==38) && (synpred1_InternalSqliteModel())) {s = 24;}

                        else if ( (LA30_3==39) && (synpred1_InternalSqliteModel())) {s = 25;}

                        else if ( (LA30_3==40) && (synpred1_InternalSqliteModel())) {s = 26;}

                        else if ( (LA30_3==33) && (synpred1_InternalSqliteModel())) {s = 27;}

                        else if ( (LA30_3==34) && (synpred1_InternalSqliteModel())) {s = 28;}

                        else if ( (LA30_3==35) && (synpred1_InternalSqliteModel())) {s = 29;}

                        else if ( (LA30_3==36) && (synpred1_InternalSqliteModel())) {s = 30;}

                        else if ( (LA30_3==31) && (synpred1_InternalSqliteModel())) {s = 31;}

                        else if ( (LA30_3==32) && (synpred1_InternalSqliteModel())) {s = 32;}

                        else if ( (LA30_3==24) && (synpred1_InternalSqliteModel())) {s = 33;}

                        else if ( (LA30_3==30) && (synpred1_InternalSqliteModel())) {s = 34;}

                        else if ( (LA30_3==29) && (synpred1_InternalSqliteModel())) {s = 35;}

                        else if ( (LA30_3==EOF) && (synpred1_InternalSqliteModel())) {s = 36;}

                        else if ( (LA30_3==23) && (synpred1_InternalSqliteModel())) {s = 37;}

                        else if ( (LA30_3==69) && (synpred1_InternalSqliteModel())) {s = 38;}

                        else if ( (LA30_3==65) && (synpred1_InternalSqliteModel())) {s = 39;}

                        else if ( (LA30_3==22) && (synpred1_InternalSqliteModel())) {s = 40;}

                        else if ( (LA30_3==67) && (synpred1_InternalSqliteModel())) {s = 41;}

                        else if ( (LA30_3==70) && (synpred1_InternalSqliteModel())) {s = 42;}

                        else if ( (LA30_3==64) && (synpred1_InternalSqliteModel())) {s = 43;}

                        else if ( (LA30_3==73) && (synpred1_InternalSqliteModel())) {s = 44;}

                        else if ( (LA30_3==15) && (synpred1_InternalSqliteModel())) {s = 45;}

                        else if ( (LA30_3==18) && (synpred1_InternalSqliteModel())) {s = 46;}

                        else if ( (LA30_3==79) && (synpred1_InternalSqliteModel())) {s = 47;}

                        else if ( (LA30_3==80) && (synpred1_InternalSqliteModel())) {s = 48;}

                        else if ( (LA30_3==126) && (synpred1_InternalSqliteModel())) {s = 49;}

                        else if ( (LA30_3==127) && (synpred1_InternalSqliteModel())) {s = 50;}

                        else if ( (LA30_3==128) && (synpred1_InternalSqliteModel())) {s = 51;}

                        else if ( (LA30_3==129) && (synpred1_InternalSqliteModel())) {s = 52;}

                        else if ( (LA30_3==71) && (synpred1_InternalSqliteModel())) {s = 53;}

                        else if ( (LA30_3==72) && (synpred1_InternalSqliteModel())) {s = 54;}

                        else if ( (LA30_3==81) && (synpred1_InternalSqliteModel())) {s = 55;}

                        else if ( (LA30_3==82) && (synpred1_InternalSqliteModel())) {s = 56;}

                        else if ( (LA30_3==78) && (synpred1_InternalSqliteModel())) {s = 57;}

                        else if ( (LA30_3==83) && (synpred1_InternalSqliteModel())) {s = 58;}

                        else if ( (LA30_3==84) && (synpred1_InternalSqliteModel())) {s = 59;}

                        else if ( (LA30_3==86) && (synpred1_InternalSqliteModel())) {s = 60;}

                        else if ( (LA30_3==87) && (synpred1_InternalSqliteModel())) {s = 61;}

                        else if ( (LA30_3==88) && (synpred1_InternalSqliteModel())) {s = 62;}

                        else if ( (LA30_3==77) && (synpred1_InternalSqliteModel())) {s = 63;}

                        else if ( (LA30_3==107) && (synpred1_InternalSqliteModel())) {s = 64;}

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_4==EOF||LA30_4==15||LA30_4==18||(LA30_4>=22 && LA30_4<=24)||LA30_4==27||(LA30_4>=29 && LA30_4<=31)||(LA30_4>=33 && LA30_4<=57)||(LA30_4>=64 && LA30_4<=65)||LA30_4==67||(LA30_4>=69 && LA30_4<=73)||(LA30_4>=77 && LA30_4<=84)||(LA30_4>=86 && LA30_4<=88)||LA30_4==107||(LA30_4>=126 && LA30_4<=129)) ) {s = 5;}

                        else if ( (LA30_4==32) ) {s = 65;}

                        else if ( (LA30_4==58) && (synpred1_InternalSqliteModel())) {s = 66;}

                        else if ( (LA30_4==59) && (synpred1_InternalSqliteModel())) {s = 67;}

                        else if ( (LA30_4==RULE_ID) && (synpred1_InternalSqliteModel())) {s = 68;}

                        else if ( (LA30_4==RULE_NUMBER) && (synpred1_InternalSqliteModel())) {s = 69;}

                        else if ( (LA30_4==RULE_STRING) && (synpred1_InternalSqliteModel())) {s = 70;}

                        else if ( (LA30_4==90) && (synpred1_InternalSqliteModel())) {s = 71;}

                        else if ( (LA30_4==91) && (synpred1_InternalSqliteModel())) {s = 72;}

                        else if ( (LA30_4==92) && (synpred1_InternalSqliteModel())) {s = 73;}

                        else if ( (LA30_4==93) && (synpred1_InternalSqliteModel())) {s = 74;}

                        else if ( (LA30_4==21) && (synpred1_InternalSqliteModel())) {s = 75;}

                        else if ( (LA30_4==61) && (synpred1_InternalSqliteModel())) {s = 76;}

                        else if ( (LA30_4==62) && (synpred1_InternalSqliteModel())) {s = 77;}

                        else if ( (LA30_4==63) && (synpred1_InternalSqliteModel())) {s = 78;}

                        else if ( (LA30_4==66) && (synpred1_InternalSqliteModel())) {s = 79;}

                        else if ( (LA30_4==68) && (synpred1_InternalSqliteModel())) {s = 80;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_81 = input.LA(1);

                         
                        int index30_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqliteModel()) ) {s = 80;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_81);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\21\uffff";
    static final String DFA63_eofS =
        "\21\uffff";
    static final String DFA63_minS =
        "\1\136\1\137\2\140\1\uffff\1\140\3\uffff\1\4\4\uffff\1\155\2\uffff";
    static final String DFA63_maxS =
        "\1\157\1\162\1\140\1\162\1\uffff\1\142\3\uffff\1\4\4\uffff\1\156"+
        "\2\uffff";
    static final String DFA63_acceptS =
        "\4\uffff\1\4\1\uffff\1\3\1\2\1\1\1\uffff\1\10\1\12\1\11\1\7\1\uffff"+
        "\1\6\1\5";
    static final String DFA63_specialS =
        "\21\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\1\15\uffff\1\2\2\uffff\1\3",
            "\1\5\1\10\1\7\1\6\16\uffff\2\4",
            "\1\11",
            "\1\15\1\14\1\12\17\uffff\1\13",
            "",
            "\1\10\1\7\1\6",
            "",
            "",
            "",
            "\1\16",
            "",
            "",
            "",
            "",
            "\1\20\1\17",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3713:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleDatabaseBlock_in_ruleModel164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabaseBlock_in_entryRuleDatabaseBlock200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseBlock210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDatabaseBlock247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabaseBlock264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDatabaseBlock281 = new BitSet(new long[]{0x0000000010038000L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_ruleDatabaseBlock302 = new BitSet(new long[]{0x0000000010028000L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock324 = new BitSet(new long[]{0x0000000010028000L});
    public static final BitSet FOLLOW_ruleInitBlock_in_ruleDatabaseBlock346 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDatabaseBlock359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigBlock405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConfigBlock451 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfigBlock463 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_ruleConfigurationStatement_in_ruleConfigBlock484 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_15_in_ruleConfigBlock497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitBlock_in_entryRuleInitBlock533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitBlock543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInitBlock589 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInitBlock601 = new BitSet(new long[]{0x0000000000008000L,0x0000900040000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleInitBlock623 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInitBlock635 = new BitSet(new long[]{0x0000000000008000L,0x0000900040000000L});
    public static final BitSet FOLLOW_15_in_ruleInitBlock649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationStatement_in_entryRuleConfigurationStatement685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationStatement695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleConfigurationStatement742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationStatement759 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleContentUri_in_ruleConfigurationStatement785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConfigurationStatement814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationStatement831 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConfigurationStatement848 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x000000000000013CL});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleConfigurationStatement870 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleConfigurationStatement883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000013CL});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleConfigurationStatement904 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleConfigurationStatement920 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfigurationStatement932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleConfigurationStatement953 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConfigurationStatement965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArg1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleFunctionArg1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionArg1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri1116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleContentUri1163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUri1180 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleContentUri1198 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1219 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContentUriSegment1342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1359 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContentUriSegment1376 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleContentUriSegment1395 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_27_in_ruleContentUriSegment1432 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContentUriSegment1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMigrationBlock1551 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock1563 = new BitSet(new long[]{0x0000000000008000L,0x0000900040000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1585 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationBlock1597 = new BitSet(new long[]{0x0000000000008000L,0x0000900040000000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1794 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleExprConcat1821 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1855 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1950 = new BitSet(new long[]{0x0000000049000002L});
    public static final BitSet FOLLOW_27_in_ruleExprMult1979 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_24_in_ruleExprMult2008 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_30_in_ruleExprMult2037 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult2074 = new BitSet(new long[]{0x0000000049000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2169 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleExprAdd2198 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_32_in_ruleExprAdd2227 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2264 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2359 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_33_in_ruleExprBit2388 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_34_in_ruleExprBit2417 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_35_in_ruleExprBit2446 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_36_in_ruleExprBit2475 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2512 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2607 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_37_in_ruleExprRelate2636 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_38_in_ruleExprRelate2665 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_39_in_ruleExprRelate2694 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_40_in_ruleExprRelate2723 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2760 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2855 = new BitSet(new long[]{0x001FFE0000000002L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2884 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2913 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2942 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2971 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual3000 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual3029 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual3058 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_48_in_ruleExprEqual3087 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_49_in_ruleExprEqual3116 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_50_in_ruleExprEqual3145 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_51_in_ruleExprEqual3174 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_52_in_ruleExprEqual3203 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3240 = new BitSet(new long[]{0x001FFE0000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3335 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExprAnd3362 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3396 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3491 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExprOr3518 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3552 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3647 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression3715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNullExpression3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNullExpression3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNullExpression3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4035 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4075 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4087 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4241 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4262 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4309 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4341 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4388 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4429 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000034L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4450 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000034L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4472 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000037L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4486 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4555 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4572 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression4591 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4632 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression4645 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4666 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimaryExpression4711 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4723 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_rulePrimaryExpression4756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4777 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePrimaryExpression4818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCase4922 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleCase4955 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement5068 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleSelectStatement5081 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSelectStatement5117 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5138 = new BitSet(new long[]{0x0000000000400002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleSelectStatement5152 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_22_in_ruleSelectStatement5170 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5288 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleOrderingTermList5301 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5322 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore5360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5417 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore5447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5468 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5562 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5581 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression5618 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_27_in_ruleSelectExpression5652 = new BitSet(new long[]{0x0000000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5692 = new BitSet(new long[]{0x0000000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression5706 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5727 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_78_in_ruleSelectExpression5742 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleSelectExpression5778 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSelectExpression5814 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5929 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleSelectList5942 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5963 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6147 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleGroupByExpressions6160 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6181 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleOrderingTerm6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOrderingTerm6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource6472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6528 = new BitSet(new long[]{0x0000000000000002L,0x0000000001D80000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource6549 = new BitSet(new long[]{0x0000000000000002L,0x0000000001D80000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource6586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSingleSourceTable6809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSingleSourceSelectStatement6925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6946 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSingleSourceSelectStatement6958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSingleSourceSelectStatement6971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSingleSourceJoin7078 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7099 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSingleSourceJoin7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement7209 = new BitSet(new long[]{0x0000000000000000L,0x0000000001D00000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement7243 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement7274 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement7313 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_87_in_ruleJoinStatement7350 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleJoinStatement7377 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement7398 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleJoinStatement7410 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn7467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn7532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleResultColumn7545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleLiteralValue7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleLiteralValue7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleLiteralValue7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateTableStatement8330 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTableStatement8348 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTableStatement8374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement8391 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCreateTableStatement8408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8429 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCreateTableStatement8442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8463 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCreateTableStatement8478 = new BitSet(new long[]{0x0000000000000000L,0x00CA000000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8499 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTableStatement8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateViewStatement8605 = new BitSet(new long[]{0x0000000000000000L,0x0000000280000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateViewStatement8623 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateViewStatement8649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement8666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCreateViewStatement8683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement8787 = new BitSet(new long[]{0x0000000000000000L,0x0000000480000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement8805 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8848 = new BitSet(new long[]{0x0000000000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8873 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8902 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement8931 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement8967 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement9004 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_104_in_ruleCreateTriggerStatement9042 = new BitSet(new long[]{0x0000000000000000L,0x0000020002000000L});
    public static final BitSet FOLLOW_105_in_ruleCreateTriggerStatement9068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9085 = new BitSet(new long[]{0x0000000000400000L,0x0000000002000000L});
    public static final BitSet FOLLOW_22_in_ruleCreateTriggerStatement9103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9120 = new BitSet(new long[]{0x0000000000400000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleCreateTriggerStatement9143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9163 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000020L});
    public static final BitSet FOLLOW_106_in_ruleCreateTriggerStatement9181 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000020L});
    public static final BitSet FOLLOW_69_in_ruleCreateTriggerStatement9208 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9229 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleCreateTriggerStatement9243 = new BitSet(new long[]{0x0000000000000000L,0x040001C000000402L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9265 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCreateTriggerStatement9277 = new BitSet(new long[]{0x0000000000000000L,0x040001C000000402L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9299 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCreateTriggerStatement9311 = new BitSet(new long[]{0x0000000000000000L,0x040001C000000402L});
    public static final BitSet FOLLOW_65_in_ruleCreateTriggerStatement9327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableRenameStatement9419 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleAlterTableRenameStatement9431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9451 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleAlterTableRenameStatement9463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableAddColumnStatement9568 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleAlterTableAddColumnStatement9580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9600 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleAlterTableAddColumnStatement9612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropTableStatement9716 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleDropTableStatement9728 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropTableStatement9746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement9780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropTriggerStatement9863 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleDropTriggerStatement9875 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropTriggerStatement9893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropViewStatement10010 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDropViewStatement10022 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropViewStatement10040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateIndexStatement10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateIndexStatement10157 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_113_in_ruleCreateIndexStatement10175 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleCreateIndexStatement10201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10218 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleCreateIndexStatement10235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10255 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCreateIndexStatement10267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10288 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCreateIndexStatement10301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10322 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCreateIndexStatement10336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropIndexStatement10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropIndexStatement10419 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleDropIndexStatement10431 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropIndexStatement10449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropIndexStatement10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef10519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef10529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef10580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000013CL});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef10606 = new BitSet(new long[]{0x0100000000000002L,0x002A000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef10627 = new BitSet(new long[]{0x0100000000000002L,0x002A000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleColumnConstraint10721 = new BitSet(new long[]{0x0000000000000002L,0x0010000000060000L});
    public static final BitSet FOLLOW_81_in_ruleColumnConstraint10740 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_82_in_ruleColumnConstraint10777 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleColumnConstraint10810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleColumnConstraint10853 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleColumnConstraint10904 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleColumnConstraint10955 = new BitSet(new long[]{0x0000000100200060L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleUniqueTableConstraint11207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11224 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleUniqueTableConstraint11243 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUniqueTableConstraint11255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11276 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleUniqueTableConstraint11289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11310 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleUniqueTableConstraint11324 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rulePrimaryConstraint11429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint11446 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_rulePrimaryConstraint11465 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryConstraint11477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11498 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryConstraint11511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11532 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryConstraint11546 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint11613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleCheckTableConstraint11651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint11668 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleCheckTableConstraint11687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCheckTableConstraint11699 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11720 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCheckTableConstraint11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11823 = new BitSet(new long[]{0x0000000000000002L,0x0100000000060000L});
    public static final BitSet FOLLOW_120_in_ruleIndexedColumn11836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11853 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleIndexedColumn11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleIndexedColumn11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue11967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDefaultValue12062 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue12083 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDefaultValue12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause12132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleConflictClause12179 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleConflictClause12191 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement12258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleDeleteStatement12468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleDeleteStatement12480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement12500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleDeleteStatement12513 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleInsertStatement12621 = new BitSet(new long[]{0x0040000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_54_in_ruleInsertStatement12634 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement12655 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_122_in_ruleInsertStatement12676 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleInsertStatement12689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12709 = new BitSet(new long[]{0x0000000000200000L,0x1020000000000400L});
    public static final BitSet FOLLOW_21_in_ruleInsertStatement12722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12742 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleInsertStatement12755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12775 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleInsertStatement12789 = new BitSet(new long[]{0x0000000000000000L,0x1020000000000400L});
    public static final BitSet FOLLOW_124_in_ruleInsertStatement12806 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInsertStatement12818 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12839 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleInsertStatement12852 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12873 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleInsertStatement12887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement12915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleInsertStatement12935 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleInsertStatement12947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement12985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleUpdateStatement13032 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_54_in_ruleUpdateStatement13045 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement13088 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleUpdateStatement13100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13121 = new BitSet(new long[]{0x0000000000400002L,0x0000000000004000L});
    public static final BitSet FOLLOW_22_in_ruleUpdateStatement13134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13155 = new BitSet(new long[]{0x0000000000400002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleUpdateStatement13170 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13284 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleUpdateColumnExpression13296 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber13365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignedNumber13404 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13518 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualifiedName13537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13552 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleCompoundOperator13613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleCompoundOperator13630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleCompoundOperator13647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleCompoundOperator13664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSqliteDataType13709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSqliteDataType13726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSqliteDataType13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSqliteDataType13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleSqliteDataType13777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleSqliteDataType13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType13839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleColumnType13856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleColumnType13873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleColumnType13890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleColumnType13907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleConflictResolution13952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleConflictResolution13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleConflictResolution13986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleConflictResolution14003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleConflictResolution14020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel4018 = new BitSet(new long[]{0x0000000000000002L});

}