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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'init'", "';'", "'action'", "'function'", "'('", "','", "')'", "'/'", "':'", "'#'", "'*'", "'migration'", "'||'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'not'", "'exists'", "'case'", "'else'", "'end'", "'cast'", "'as'", "'$'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'from'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'temp'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'unique'", "'index'", "'primary key'", "'autoincrement'", "'default'", "'check'", "'constraint'", "'collate'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
    };
    public static final int T__50=50;
    public static final int T__140=140;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=6;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:138:1: ruleDatabaseBlock returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_init_4_0= ruleInitBlock ) )? ( (lv_migrations_5_0= ruleMigrationBlock ) )* otherlv_6= '}' ) ;
    public final EObject ruleDatabaseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_config_3_0 = null;

        EObject lv_init_4_0 = null;

        EObject lv_migrations_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:141:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_init_4_0= ruleInitBlock ) )? ( (lv_migrations_5_0= ruleMigrationBlock ) )* otherlv_6= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_init_4_0= ruleInitBlock ) )? ( (lv_migrations_5_0= ruleMigrationBlock ) )* otherlv_6= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_init_4_0= ruleInitBlock ) )? ( (lv_migrations_5_0= ruleMigrationBlock ) )* otherlv_6= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_init_4_0= ruleInitBlock ) )? ( (lv_migrations_5_0= ruleMigrationBlock ) )* otherlv_6= '}'
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:186:3: ( (lv_init_4_0= ruleInitBlock ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:187:1: (lv_init_4_0= ruleInitBlock )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:187:1: (lv_init_4_0= ruleInitBlock )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:188:3: lv_init_4_0= ruleInitBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getInitInitBlockParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInitBlock_in_ruleDatabaseBlock324);
                    lv_init_4_0=ruleInitBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDatabaseBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_4_0, 
                              		"InitBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:204:3: ( (lv_migrations_5_0= ruleMigrationBlock ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:205:1: (lv_migrations_5_0= ruleMigrationBlock )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:205:1: (lv_migrations_5_0= ruleMigrationBlock )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:206:3: lv_migrations_5_0= ruleMigrationBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getMigrationsMigrationBlockParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock346);
            	    lv_migrations_5_0=ruleMigrationBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDatabaseBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"migrations",
            	              		lv_migrations_5_0, 
            	              		"MigrationBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:361:1: ruleConfigurationStatement returns [EObject current=null] : ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )* otherlv_15= '}' ) ) ;
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
        Token otherlv_15=null;
        EObject lv_uri_3_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_statements_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:364:28: ( ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )* otherlv_15= '}' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:1: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )* otherlv_15= '}' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:365:1: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) | ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )* otherlv_15= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:412:6: ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )* otherlv_15= '}' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:412:6: ( () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )* otherlv_15= '}' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:412:7: () otherlv_5= 'function' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_args_8_0= ruleFunctionArg ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArg ) ) )* )? otherlv_11= ')' otherlv_12= '{' ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )* otherlv_15= '}'
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:492:1: ( ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==74||(LA8_0>=102 && LA8_0<=104)||LA8_0==122) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:492:2: ( (lv_statements_13_0= ruleDMLStatement ) ) otherlv_14= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:492:2: ( (lv_statements_13_0= ruleDMLStatement ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:493:1: (lv_statements_13_0= ruleDMLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:493:1: (lv_statements_13_0= ruleDMLStatement )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:494:3: lv_statements_13_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConfigurationStatementAccess().getStatementsDMLStatementParserRuleCall_1_7_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleConfigurationStatement954);
                    	    lv_statements_13_0=ruleDMLStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConfigurationStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_13_0, 
                    	              		"DMLStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleConfigurationStatement966); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getConfigurationStatementAccess().getSemicolonKeyword_1_7_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleConfigurationStatement980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getConfigurationStatementAccess().getRightCurlyBracketKeyword_1_8());
                          
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:526:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:527:2: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:528:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1017);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArg1027); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:535:1: ruleFunctionArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:538:28: ( ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:539:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:539:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:539:2: ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:539:2: ( (lv_type_0_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:540:1: (lv_type_0_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:540:1: (lv_type_0_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:541:3: lv_type_0_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleFunctionArg1073);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:557:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:558:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:558:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:559:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionArg1090); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:583:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:584:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:585:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri1131);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri1141); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:592:1: ruleContentUri returns [EObject current=null] : (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:595:28: ( (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:596:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:596:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:596:3: otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleContentUri1178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriAccess().getSolidusKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:600:1: ( (lv_type_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:601:1: (lv_type_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:601:1: (lv_type_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:602:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUri1195); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:618:2: (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:618:4: otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleContentUri1213); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:622:1: ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:623:1: (lv_segments_3_0= ruleContentUriSegment )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:623:1: (lv_segments_3_0= ruleContentUriSegment )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:624:3: lv_segments_3_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1234);
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
            	    break loop10;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:648:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:649:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:650:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1272);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment1282); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:657:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:660:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:661:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:661:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:661:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:662:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:662:1: (lv_name_0_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:663:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1324); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:680:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:680:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:680:7: () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:680:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:681:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContentUriSegment1357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:690:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:691:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:691:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:692:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1374); if (state.failed) return current;
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

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleContentUriSegment1391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentUriSegmentAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:712:1: ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==26) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==27) ) {
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:712:2: ( (lv_num_5_0= '#' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:712:2: ( (lv_num_5_0= '#' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:713:1: (lv_num_5_0= '#' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:713:1: (lv_num_5_0= '#' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:714:3: lv_num_5_0= '#'
                            {
                            lv_num_5_0=(Token)match(input,26,FOLLOW_26_in_ruleContentUriSegment1410); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:728:6: ( (lv_text_6_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:728:6: ( (lv_text_6_0= '*' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:729:1: (lv_text_6_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:729:1: (lv_text_6_0= '*' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:730:3: lv_text_6_0= '*'
                            {
                            lv_text_6_0=(Token)match(input,27,FOLLOW_27_in_ruleContentUriSegment1447); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContentUriSegment1473); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:755:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:756:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:757:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1510);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1520); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:764:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:767:28: ( ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:768:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:768:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:768:2: () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:768:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:769:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMigrationBlock1566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMigrationBlock1578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:782:1: ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==94||LA13_0==108||LA13_0==111) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:782:2: ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';'
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:782:2: ( (lv_statements_3_0= ruleDDLStatement ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:783:1: (lv_statements_3_0= ruleDDLStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:783:1: (lv_statements_3_0= ruleDDLStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:784:3: lv_statements_3_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1600);
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

            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleMigrationBlock1612); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMigrationBlock1626); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:816:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:817:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:818:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1662);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression1672); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:825:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:828:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:830:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression1718);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:846:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:847:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:848:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat1752);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat1762); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:855:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:858:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:859:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:859:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:860:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1809);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:868:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:868:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:868:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:869:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:874:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:875:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:875:1: (lv_op_2_0= '||' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:876:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,29,FOLLOW_29_in_ruleExprConcat1836); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:889:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:890:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:890:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:891:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1870);
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
            	    break loop14;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:915:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:916:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:917:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1908);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1918); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:924:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:927:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:928:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:928:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:929:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1965);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:937:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24||LA16_0==27||LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:937:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:937:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:938:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:943:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:944:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:944:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:945:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:945:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:946:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,27,FOLLOW_27_in_ruleExprMult1994); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:958:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleExprMult2023); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:970:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,30,FOLLOW_30_in_ruleExprMult2052); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:985:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:986:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:986:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:987:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult2089);
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
            	    break loop16;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1011:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1012:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1013:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd2127);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd2137); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1020:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1023:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1024:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1024:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1025:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2184);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1033:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1033:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1033:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1034:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1039:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1040:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1040:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1041:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1041:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==31) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==32) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1042:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleExprAdd2213); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1054:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleExprAdd2242); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1069:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1070:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1070:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1071:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2279);
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
            	    break loop18;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1095:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1096:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1097:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit2317);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit2327); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1104:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1107:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1108:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1108:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1109:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2374);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1117:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=33 && LA20_0<=36)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1117:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1117:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1118:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1123:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1124:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1124:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1125:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1125:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1126:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_33_in_ruleExprBit2403); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1138:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_34_in_ruleExprBit2432); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1150:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,35,FOLLOW_35_in_ruleExprBit2461); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1162:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,36,FOLLOW_36_in_ruleExprBit2490); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1177:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1178:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1178:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1179:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2527);
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
            	    break loop20;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1203:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1204:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1205:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate2565);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate2575); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1212:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1215:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1216:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1216:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1217:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2622);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1225:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=37 && LA22_0<=40)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1225:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1225:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1226:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1231:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1232:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1232:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1233:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1233:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1234:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_37_in_ruleExprRelate2651); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1246:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_38_in_ruleExprRelate2680); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1258:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,39,FOLLOW_39_in_ruleExprRelate2709); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1270:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,40,FOLLOW_40_in_ruleExprRelate2738); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1285:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1286:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1286:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1287:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2775);
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
            	    break loop22;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1311:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1312:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1313:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual2813);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual2823); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1320:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1323:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1324:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1324:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1325:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2870);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1333:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=41 && LA24_0<=52)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1333:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1333:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1334:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1339:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1340:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1340:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1341:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1341:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt23=12;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt23=5;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt23=6;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt23=7;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt23=8;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt23=9;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt23=10;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt23=11;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt23=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1342:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2899); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1354:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2928); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1366:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2957); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1378:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2986); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1390:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual3015); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1402:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual3044); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1414:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual3073); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1426:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,48,FOLLOW_48_in_ruleExprEqual3102); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1438:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,49,FOLLOW_49_in_ruleExprEqual3131); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1450:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,50,FOLLOW_50_in_ruleExprEqual3160); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1462:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,51,FOLLOW_51_in_ruleExprEqual3189); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1474:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,52,FOLLOW_52_in_ruleExprEqual3218); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1489:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1490:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1490:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1491:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3255);
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
    // $ANTLR end "ruleExprEqual"


    // $ANTLR start "entryRuleExprAnd"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1515:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1516:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1517:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3293);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3303); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1527:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1528:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1528:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1529:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3350);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1537:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1537:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1537:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1538:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1543:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1544:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1544:1: (lv_op_2_0= 'and' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1545:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,53,FOLLOW_53_in_ruleExprAnd3377); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1558:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1559:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1559:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1560:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3411);
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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1584:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1585:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1586:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3449);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3459); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1593:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1596:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1597:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1597:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1598:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3506);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1606:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1606:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1606:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1607:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1612:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1613:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1613:1: (lv_op_2_0= 'or' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1614:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_54_in_ruleExprOr3533); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1627:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1628:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1628:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1629:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3567);
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
            	    break loop26;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1653:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1654:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1655:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3605);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression3615); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1662:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1665:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1666:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1666:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1667:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3662);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1675:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=55 && LA27_0<=57)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1675:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1675:2: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1676:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1681:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1682:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1682:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1683:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3692);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1707:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1708:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1709:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression3730);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression3740); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1719:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=56 && LA29_0<=57)) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:2: ( () otherlv_1= 'is null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:3: () otherlv_1= 'is null'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1721:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleNullExpression3787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1731:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1731:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1731:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1731:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1732:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1737:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==56) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==57) ) {
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1737:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleNullExpression3817); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1742:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleNullExpression3835); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1754:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1755:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1756:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3873);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3883); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1763:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1766:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1767:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1767:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            int alt39=10;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1767:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1767:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1767:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1767:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1768:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1777:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1778:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1778:1: (otherlv_2= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1779:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1791:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1791:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1791:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1791:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1792:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1801:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1802:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1802:1: (otherlv_5= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1803:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1815:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1815:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1815:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1815:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1816:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt31=3;
                    alt31 = dfa31.predict(input);
                    switch (alt31) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1827:1: (otherlv_7= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1828:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4050); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4062); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1845:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1845:1: (otherlv_9= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1846:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4090); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4102); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1861:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==27) ) {
                                alt30=1;
                            }
                            else if ( (LA30_0==RULE_ID) ) {
                                alt30=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 0, input);

                                throw nvae;
                            }
                            switch (alt30) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1861:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1861:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1862:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1862:1: (lv_all_11_0= '*' )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1863:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression4121); if (state.failed) return current;
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
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1877:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1877:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1878:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1878:1: (otherlv_12= RULE_ID )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1879:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4160); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1891:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1891:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1892:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1892:1: (otherlv_13= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1893:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4188); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1905:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1905:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1905:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1905:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1906:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1911:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1912:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1912:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1913:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4227);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1930:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1930:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1930:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1930:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1931:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1940:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1941:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1941:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1942:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4277);
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

                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1963:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1963:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1963:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1963:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1964:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1969:2: ( (lv_not_21_0= 'not' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==61) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1970:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1970:1: (lv_not_21_0= 'not' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1971:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4324); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1984:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==62) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1985:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1985:1: (lv_exists_22_0= 'exists' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1986:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4356); if (state.failed) return current;
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

                    otherlv_23=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2003:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2004:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2004:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2005:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4403);
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

                    otherlv_25=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2026:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2026:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2026:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2026:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2027:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2036:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_NUMBER)||LA34_0==21||LA34_0==32||(LA34_0>=58 && LA34_0<=59)||(LA34_0>=61 && LA34_0<=63)||LA34_0==66||LA34_0==68||(LA34_0>=90 && LA34_0<=93)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2037:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2037:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2038:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4465);
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2054:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==69) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2055:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2055:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2056:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4487);
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
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2072:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==64) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2072:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2076:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2077:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2077:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2078:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4522);
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

                    otherlv_32=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2099:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2099:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2099:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2099:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2100:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2105:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2106:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2106:1: (lv_name_34_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2107:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4570); if (state.failed) return current;
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

                    otherlv_35=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2127:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==27) ) {
                        alt38=1;
                    }
                    else if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_NUMBER)||LA38_0==21||LA38_0==32||(LA38_0>=58 && LA38_0<=59)||(LA38_0>=61 && LA38_0<=63)||LA38_0==66||LA38_0==68||(LA38_0>=90 && LA38_0<=93)) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2127:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2127:2: ( (lv_all_36_0= '*' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2128:1: (lv_all_36_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2128:1: (lv_all_36_0= '*' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2129:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,27,FOLLOW_27_in_rulePrimaryExpression4606); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2143:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2143:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2143:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2143:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2144:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2144:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2145:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4647);
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2161:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==22) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2161:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression4660); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2165:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2166:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2166:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2167:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4681);
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
                            	    break loop37;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2188:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2188:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2188:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2188:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2189:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,66,FOLLOW_66_in_rulePrimaryExpression4726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2202:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2203:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2203:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2204:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4759);
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

                    otherlv_45=(Token)match(input,67,FOLLOW_67_in_rulePrimaryExpression4771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2224:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2225:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2225:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2226:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4792);
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

                    otherlv_47=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression4804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2247:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2247:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2247:7: () otherlv_49= '$' ( (otherlv_50= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2247:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2248:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionArgumentAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_49=(Token)match(input,68,FOLLOW_68_in_rulePrimaryExpression4833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getDollarSignKeyword_9_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2257:1: ( (otherlv_50= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2258:1: (otherlv_50= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2258:1: (otherlv_50= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2259:3: otherlv_50= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_50=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4853); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2278:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2279:2: (iv_ruleCase= ruleCase EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2280:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4890);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4900); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2287:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2290:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2291:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2291:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2291:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleCase4937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2295:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2296:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2296:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2297:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4958);
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

            otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleCase4970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2317:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2318:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2318:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2319:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4991);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2343:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2344:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2345:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5027);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement5037); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2352:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2355:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2356:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2356:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2356:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2356:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2357:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2357:1: (lv_core_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2358:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement5083);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2374:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==71) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2374:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSelectStatement5096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2378:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2379:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2379:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2380:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5117);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2396:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2396:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_72_in_ruleSelectStatement5132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2400:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2401:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2401:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2402:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5153);
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2418:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==22||LA42_0==73) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2418:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2418:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==73) ) {
                                alt41=1;
                            }
                            else if ( (LA41_0==22) ) {
                                alt41=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 0, input);

                                throw nvae;
                            }
                            switch (alt41) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2418:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleSelectStatement5167); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2423:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleSelectStatement5185); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2427:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2428:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2428:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2429:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5207);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2453:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2454:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2455:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5247);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList5257); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2462:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2465:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2466:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2466:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2466:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2466:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2467:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2467:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2468:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5303);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2484:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==22) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2484:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleOrderingTermList5316); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2488:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2489:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2489:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2490:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5337);
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
    // $ANTLR end "ruleOrderingTermList"


    // $ANTLR start "entryRuleSelectCore"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2514:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2515:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore5375);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore5385); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2523:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2526:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2527:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2527:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2528:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5432);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2536:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=126 && LA45_0<=129)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2536:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2536:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2537:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2542:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2543:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2543:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2544:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore5462);
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2560:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2561:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2561:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2562:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5483);
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
            	    break loop45;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2586:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2587:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2588:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5521);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression5531); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2595:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2598:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2599:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2599:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2599:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2599:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2600:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2609:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==75) ) {
                alt46=1;
            }
            else if ( (LA46_0==76) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2609:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2609:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2610:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2610:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2611:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5596); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2625:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2625:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2626:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2626:1: (lv_all_3_0= 'all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2627:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression5633); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2640:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_NUMBER)||LA47_0==21||LA47_0==32||(LA47_0>=58 && LA47_0<=59)||(LA47_0>=61 && LA47_0<=63)||LA47_0==66||LA47_0==68||(LA47_0>=90 && LA47_0<=93)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2640:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2640:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2641:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2641:1: (lv_allColumns_4_0= '*' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2642:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,27,FOLLOW_27_in_ruleSelectExpression5667); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2656:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2656:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2657:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2657:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2658:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5707);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2674:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==77) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2674:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression5721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2678:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2679:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2679:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2680:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5742);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2696:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==78) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2696:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleSelectExpression5757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2700:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2701:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2701:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2702:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5778);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2718:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==79) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2718:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,79,FOLLOW_79_in_ruleSelectExpression5793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2722:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2723:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2723:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2724:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5814);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2740:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==80) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2740:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,80,FOLLOW_80_in_ruleSelectExpression5829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2744:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2745:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2745:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2746:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5850);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2770:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2771:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2772:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5888);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5898); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2779:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2782:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2783:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2783:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2783:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2783:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2784:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2784:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2785:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5944);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2801:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==22) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2801:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleSelectList5957); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2805:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2806:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2806:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2807:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5978);
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
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRuleWhereExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2831:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2832:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2833:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6016);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions6026); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2840:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2843:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2844:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2844:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2845:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2845:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2846:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6071);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2870:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2871:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2872:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6106);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions6116); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2879:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2882:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2883:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2883:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2883:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2883:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2884:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2884:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2885:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6162);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2901:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==22) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2901:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleGroupByExpressions6175); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2905:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2906:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2906:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2907:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6196);
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
            	    break loop53;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2931:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2932:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2933:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6234);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions6244); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2940:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2943:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2944:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2944:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2945:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2945:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2946:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6289);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2970:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2971:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2972:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6324);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm6334); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2979:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2982:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2983:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2983:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2983:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2983:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2984:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2984:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2985:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6380);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3001:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==81) ) {
                alt54=1;
            }
            else if ( (LA54_0==82) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3001:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3001:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3002:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3002:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3003:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,81,FOLLOW_81_in_ruleOrderingTerm6399); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3017:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3017:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3018:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3018:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3019:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,82,FOLLOW_82_in_ruleOrderingTerm6436); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3040:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3041:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3042:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource6487);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource6497); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3052:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3053:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3053:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3053:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3053:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3054:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3054:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3055:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6543);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3071:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=83 && LA55_0<=84)||(LA55_0>=86 && LA55_0<=88)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3072:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3072:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3073:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource6564);
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
            	    break loop55;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3097:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3098:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3099:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource6601);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource6611); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3106:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3109:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3110:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3110:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==21) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==74) ) {
                    alt56=2;
                }
                else if ( (LA56_2==RULE_ID||LA56_2==21) ) {
                    alt56=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3111:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6658);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3121:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6685);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3131:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6712);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3147:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3148:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3149:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6747);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6757); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3156:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3159:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3160:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3160:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3160:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3160:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3166:2: ( (otherlv_1= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3167:1: (otherlv_1= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3167:1: (otherlv_1= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3168:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3179:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==67) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3179:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleSingleSourceTable6824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3183:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3184:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3184:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3185:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6841); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3209:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3210:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3211:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6884);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6894); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3218:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3221:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3222:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3222:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3222:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3222:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3223:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSingleSourceSelectStatement6940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3232:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3233:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3233:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3234:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6961);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSingleSourceSelectStatement6973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3254:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==67) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3254:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleSingleSourceSelectStatement6986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3258:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3259:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3259:1: (lv_name_5_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3260:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement7003); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3284:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3285:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3286:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7046);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin7056); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3296:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3297:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3297:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3297:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSingleSourceJoin7093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3301:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3302:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3302:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3303:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7114);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSingleSourceJoin7126); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3331:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3332:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3333:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7162);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement7172); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3340:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3343:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3344:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3344:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3344:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3344:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3345:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3350:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==83) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3351:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3351:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3352:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement7224); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3365:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt61=4;
            switch ( input.LA(1) ) {
                case 84:
                    {
                    alt61=1;
                    }
                    break;
                case 86:
                    {
                    alt61=2;
                    }
                    break;
                case 87:
                    {
                    alt61=3;
                    }
                    break;
            }

            switch (alt61) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3365:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3365:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3365:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3365:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3366:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3366:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3367:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement7258); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3380:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==85) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3381:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3381:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3382:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement7289); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3396:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3396:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3397:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3397:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3398:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement7328); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3412:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3412:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3413:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3413:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3414:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,87,FOLLOW_87_in_ruleJoinStatement7365); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,88,FOLLOW_88_in_ruleJoinStatement7392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3431:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3432:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3432:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3433:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement7413);
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

            otherlv_8=(Token)match(input,89,FOLLOW_89_in_ruleJoinStatement7425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3453:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3454:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3454:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3455:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement7446);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3479:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3480:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3481:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn7482);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn7492); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3488:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3491:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3492:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3492:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3492:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3492:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3493:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3498:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3499:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3499:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3500:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn7547);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3516:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==67) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3516:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleResultColumn7560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3520:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3521:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3521:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3522:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn7577); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3546:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3547:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3548:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7620);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue7630); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3558:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3559:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3559:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 32:
                {
                alt63=1;
                }
                break;
            case RULE_STRING:
                {
                alt63=2;
                }
                break;
            case 90:
                {
                alt63=3;
                }
                break;
            case 91:
                {
                alt63=4;
                }
                break;
            case 92:
                {
                alt63=5;
                }
                break;
            case 93:
                {
                alt63=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3559:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3559:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3559:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3559:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3560:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3565:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3566:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3566:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3567:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7686);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3584:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3584:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3584:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3584:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3585:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3590:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3591:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3591:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3592:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7720); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3609:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3609:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3609:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3609:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3610:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3615:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3616:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3616:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3617:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue7760); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3631:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3631:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3631:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3631:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3632:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3637:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3638:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3638:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3639:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,91,FOLLOW_91_in_ruleLiteralValue7808); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3653:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3653:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3653:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3653:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3654:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3659:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3660:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3660:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3661:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,92,FOLLOW_92_in_ruleLiteralValue7856); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3675:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3675:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3675:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3675:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3676:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3681:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3682:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3682:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3683:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,93,FOLLOW_93_in_ruleLiteralValue7904); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3704:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3705:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3706:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7954);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7964); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3713:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3716:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3717:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3717:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            int alt64=10;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3718:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement8011);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3728:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8038);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3738:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8065);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3748:5: this_CreateIndexStatement_3= ruleCreateIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateIndexStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8092);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3758:5: this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8119);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3768:5: this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8146);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3778:5: this_DropTableStatement_6= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8173);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3788:5: this_DropTriggerStatement_7= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8200);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3798:5: this_DropViewStatement_8= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8227);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3808:5: this_DropIndexStatement_9= ruleDropIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropIndexStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8254);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3824:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3825:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3826:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8289);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement8299); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3833:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3836:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3837:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3837:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3837:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3837:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3838:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleCreateTableStatement8345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3847:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==95) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3848:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3848:1: (lv_temporary_2_0= 'temp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3849:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTableStatement8363); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,96,FOLLOW_96_in_ruleCreateTableStatement8389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3866:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3867:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3867:1: (lv_name_4_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3868:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement8406); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCreateTableStatement8423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3888:1: ( (lv_columnDefs_6_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3889:1: (lv_columnDefs_6_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3889:1: (lv_columnDefs_6_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3890:3: lv_columnDefs_6_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8444);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3906:2: (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==22) ) {
                    int LA66_1 = input.LA(2);

                    if ( (LA66_1==RULE_ID) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3906:4: otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleCreateTableStatement8457); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3910:1: ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3911:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3911:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3912:3: lv_columnDefs_8_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8478);
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
            	    break loop66;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3928:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==22) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3928:6: otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    {
            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleCreateTableStatement8493); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3932:1: ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3933:1: (lv_constraints_10_0= ruleTableConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3933:1: (lv_constraints_10_0= ruleTableConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3934:3: lv_constraints_10_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8514);
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
            	    break loop67;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleCreateTableStatement8528); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3962:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3963:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3964:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8564);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement8574); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3971:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3974:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3975:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3975:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3975:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3975:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3976:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleCreateViewStatement8620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3985:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==95) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3986:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3986:1: (lv_temporary_2_0= 'temp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3987:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateViewStatement8638); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,97,FOLLOW_97_in_ruleCreateViewStatement8664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getViewKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4004:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4005:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4005:1: (lv_name_4_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4006:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement8681); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,67,FOLLOW_67_in_ruleCreateViewStatement8698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewStatementAccess().getAsKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4026:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4027:1: (lv_selectStatement_6_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4027:1: (lv_selectStatement_6_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4028:3: lv_selectStatement_6_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8719);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4052:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4053:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4054:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8755);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement8765); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4061:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4064:28: ( (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4065:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4065:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4065:3: otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement8802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4069:1: ( (lv_temporary_1_0= 'temp' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==95) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4070:1: (lv_temporary_1_0= 'temp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4070:1: (lv_temporary_1_0= 'temp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4071:3: lv_temporary_1_0= 'temp'
                    {
                    lv_temporary_1_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement8820); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4088:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4089:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4089:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4090:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8863); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4106:2: ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=99 && LA71_0<=101)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4107:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4107:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4108:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4108:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    int alt70=3;
                    switch ( input.LA(1) ) {
                    case 99:
                        {
                        alt70=1;
                        }
                        break;
                    case 100:
                        {
                        alt70=2;
                        }
                        break;
                    case 101:
                        {
                        alt70=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }

                    switch (alt70) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4109:3: lv_when_4_1= 'before'
                            {
                            lv_when_4_1=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8888); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4121:8: lv_when_4_2= 'after'
                            {
                            lv_when_4_2=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8917); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4133:8: lv_when_4_3= 'instead of'
                            {
                            lv_when_4_3=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement8946); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4148:3: ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt74=1;
                }
                break;
            case 103:
                {
                alt74=2;
                }
                break;
            case 104:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4148:4: ( (lv_eventType_5_0= 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4148:4: ( (lv_eventType_5_0= 'delete' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4149:1: (lv_eventType_5_0= 'delete' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4149:1: (lv_eventType_5_0= 'delete' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4150:3: lv_eventType_5_0= 'delete'
                    {
                    lv_eventType_5_0=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement8982); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4164:6: ( (lv_eventType_6_0= 'insert' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4164:6: ( (lv_eventType_6_0= 'insert' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4165:1: (lv_eventType_6_0= 'insert' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4165:1: (lv_eventType_6_0= 'insert' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4166:3: lv_eventType_6_0= 'insert'
                    {
                    lv_eventType_6_0=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement9019); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4180:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4180:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4180:7: ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4180:7: ( (lv_eventType_7_0= 'update' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4181:1: (lv_eventType_7_0= 'update' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4181:1: (lv_eventType_7_0= 'update' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4182:3: lv_eventType_7_0= 'update'
                    {
                    lv_eventType_7_0=(Token)match(input,104,FOLLOW_104_in_ruleCreateTriggerStatement9057); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4195:2: (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==105) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4195:4: otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            {
                            otherlv_8=(Token)match(input,105,FOLLOW_105_in_ruleCreateTriggerStatement9083); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_5_2_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4199:1: ( (lv_updateColumnNames_9_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4200:1: (lv_updateColumnNames_9_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4200:1: (lv_updateColumnNames_9_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4201:3: lv_updateColumnNames_9_0= RULE_ID
                            {
                            lv_updateColumnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9100); if (state.failed) return current;
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4217:2: (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==22) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4217:4: otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleCreateTriggerStatement9118); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_5_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4221:1: ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4222:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4222:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4223:3: lv_updateColumnNames_11_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9135); if (state.failed) return current;
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
                            	    break loop72;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,89,FOLLOW_89_in_ruleCreateTriggerStatement9158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_6());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4243:1: ( (otherlv_13= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4244:1: (otherlv_13= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4244:1: (otherlv_13= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4245:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_7_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4256:2: ( (lv_forEachRow_14_0= 'for each row' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==106) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4257:1: (lv_forEachRow_14_0= 'for each row' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4257:1: (lv_forEachRow_14_0= 'for each row' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4258:3: lv_forEachRow_14_0= 'for each row'
                    {
                    lv_forEachRow_14_0=(Token)match(input,106,FOLLOW_106_in_ruleCreateTriggerStatement9196); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4271:3: (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==69) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4271:5: otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,69,FOLLOW_69_in_ruleCreateTriggerStatement9223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_9_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4275:1: ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4276:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4276:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4277:3: lv_whenExpression_16_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9244);
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

            otherlv_17=(Token)match(input,107,FOLLOW_107_in_ruleCreateTriggerStatement9258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_10());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4297:1: ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==74||(LA78_0>=102 && LA78_0<=104)||LA78_0==122) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4297:2: ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4297:2: ( (lv_statements_18_0= ruleDMLStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4298:1: (lv_statements_18_0= ruleDMLStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4298:1: (lv_statements_18_0= ruleDMLStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4299:3: lv_statements_18_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9280);
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

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleCreateTriggerStatement9292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4319:1: ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==74||(LA77_0>=102 && LA77_0<=104)||LA77_0==122) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4319:2: ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4319:2: ( (lv_statements_20_0= ruleDMLStatement ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4320:1: (lv_statements_20_0= ruleDMLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4320:1: (lv_statements_20_0= ruleDMLStatement )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4321:3: lv_statements_20_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9314);
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

                    	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleCreateTriggerStatement9326); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,65,FOLLOW_65_in_ruleCreateTriggerStatement9342); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4353:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4354:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4355:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9378);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9388); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4362:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4365:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4366:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4366:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4366:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4366:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4367:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableRenameStatement9434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,96,FOLLOW_96_in_ruleAlterTableRenameStatement9446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4380:1: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4381:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4381:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4382:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleAlterTableRenameStatement9478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4397:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4398:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4398:1: (lv_name_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4399:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9495); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4423:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4424:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4425:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9536);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9546); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4432:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4435:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4436:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4436:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4436:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableAddColumnStatement9583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleAlterTableAddColumnStatement9595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4444:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4445:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4445:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4446:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,110,FOLLOW_110_in_ruleAlterTableAddColumnStatement9627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4461:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4462:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4462:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4463:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9648);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4487:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4488:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4489:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9684);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement9694); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4496:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4499:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4500:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4500:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4500:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTableStatement9731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleDropTableStatement9743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4508:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==112) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4509:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4509:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4510:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropTableStatement9761); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4523:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4524:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4524:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4525:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement9795); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4544:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4545:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4546:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9831);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9841); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4553:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4556:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4557:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4557:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4557:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTriggerStatement9878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,98,FOLLOW_98_in_ruleDropTriggerStatement9890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4565:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==112) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4566:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4566:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4567:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropTriggerStatement9908); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4580:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4581:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4581:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4582:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9942); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4601:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4602:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4603:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9978);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9988); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4610:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4613:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4614:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4614:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4614:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropViewStatement10025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleDropViewStatement10037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4622:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==112) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4623:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4623:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4624:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropViewStatement10055); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4637:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4638:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4638:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4639:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement10089); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4658:1: entryRuleCreateIndexStatement returns [EObject current=null] : iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF ;
    public final EObject entryRuleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateIndexStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4659:2: (iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4660:2: iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10125);
            iv_ruleCreateIndexStatement=ruleCreateIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateIndexStatement10135); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4667:1: ruleCreateIndexStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4670:28: ( (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4671:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4671:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4671:3: otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateIndexStatement10172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateIndexStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4675:1: ( (lv_unique_1_0= 'unique' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==113) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4676:1: (lv_unique_1_0= 'unique' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4676:1: (lv_unique_1_0= 'unique' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4677:3: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,113,FOLLOW_113_in_ruleCreateIndexStatement10190); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,114,FOLLOW_114_in_ruleCreateIndexStatement10216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateIndexStatementAccess().getIndexKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4694:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4695:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4695:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4696:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10233); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,89,FOLLOW_89_in_ruleCreateIndexStatement10250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateIndexStatementAccess().getOnKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4716:1: ( (otherlv_5= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4717:1: (otherlv_5= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4717:1: (otherlv_5= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4718:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getCreateIndexStatementAccess().getTableTableDefinitionCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleCreateIndexStatement10282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCreateIndexStatementAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4733:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4734:1: (lv_columns_7_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4734:1: (lv_columns_7_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4735:3: lv_columns_7_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10303);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4751:2: (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==22) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4751:4: otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleCreateIndexStatement10316); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateIndexStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4755:1: ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4756:1: (lv_columns_9_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4756:1: (lv_columns_9_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4757:3: lv_columns_9_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10337);
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
            	    break loop83;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleCreateIndexStatement10351); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4785:1: entryRuleDropIndexStatement returns [EObject current=null] : iv_ruleDropIndexStatement= ruleDropIndexStatement EOF ;
    public final EObject entryRuleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4786:2: (iv_ruleDropIndexStatement= ruleDropIndexStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4787:2: iv_ruleDropIndexStatement= ruleDropIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10387);
            iv_ruleDropIndexStatement=ruleDropIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropIndexStatement10397); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4794:1: ruleDropIndexStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4797:28: ( (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4798:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4798:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4798:3: otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropIndexStatement10434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropIndexStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleDropIndexStatement10446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropIndexStatementAccess().getIndexKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4806:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==112) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4807:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4807:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4808:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropIndexStatement10464); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4821:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4822:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4822:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4823:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropIndexStatement10498); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4842:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4843:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4844:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef10534);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef10544); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4851:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4854:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4856:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4861:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4862:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4862:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4863:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef10595); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4879:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4880:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4880:1: (lv_type_2_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4881:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef10621);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4897:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==56||LA85_0==113||LA85_0==115||(LA85_0>=117 && LA85_0<=118)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4898:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4898:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4899:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef10642);
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
            	    break loop85;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4923:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4924:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4925:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10679);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint10689); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) ;
    public final EObject ruleColumnConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asc_2_0=null;
        Token lv_desc_3_0=null;
        Token lv_autoincrement_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_conflictClause_7_0 = null;

        EObject lv_conflictClause_10_0 = null;

        EObject lv_defaultValue_13_0 = null;

        EObject lv_expression_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4935:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4936:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4936:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            int alt90=5;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt90=1;
                }
                break;
            case 56:
                {
                alt90=2;
                }
                break;
            case 113:
                {
                alt90=3;
                }
                break;
            case 117:
                {
                alt90=4;
                }
                break;
            case 118:
                {
                alt90=5;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4936:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4936:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4936:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4936:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4937:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleColumnConstraint10736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4946:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt86=3;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==81) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==82) ) {
                        alt86=2;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4946:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4946:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4947:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4947:1: (lv_asc_2_0= 'asc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4948:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,81,FOLLOW_81_in_ruleColumnConstraint10755); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4962:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4962:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4963:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4963:1: (lv_desc_3_0= 'desc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4964:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,82,FOLLOW_82_in_ruleColumnConstraint10792); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4977:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==116) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4978:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4978:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4979:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,116,FOLLOW_116_in_ruleColumnConstraint10825); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4993:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4993:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4993:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4993:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4994:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleColumnConstraint10868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5003:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==89) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5004:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5004:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5005:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10889);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5022:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5022:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5022:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5022:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5023:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,113,FOLLOW_113_in_ruleColumnConstraint10919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5032:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==89) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5033:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5033:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5034:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint10940);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5051:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5051:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5051:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5051:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5052:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,117,FOLLOW_117_in_ruleColumnConstraint10970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5061:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5062:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5062:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5063:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10991);
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
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5080:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5080:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5080:7: () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5080:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5081:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getCheckConstraintAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,118,FOLLOW_118_in_ruleColumnConstraint11020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getColumnConstraintAccess().getCheckKeyword_4_1());
                          
                    }
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleColumnConstraint11032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getColumnConstraintAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5094:1: ( (lv_expression_17_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5095:1: (lv_expression_17_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5095:1: (lv_expression_17_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5096:3: lv_expression_17_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11053);
                    lv_expression_17_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_17_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleColumnConstraint11065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getColumnConstraintAccess().getRightParenthesisKeyword_4_4());
                          
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5124:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5125:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5126:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11102);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint11112); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5133:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5136:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5137:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5137:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 119:
                {
                int LA91_1 = input.LA(2);

                if ( (LA91_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 113:
                        {
                        alt91=1;
                        }
                        break;
                    case 115:
                        {
                        alt91=2;
                        }
                        break;
                    case 118:
                        {
                        alt91=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 1, input);

                    throw nvae;
                }
                }
                break;
            case 113:
                {
                alt91=1;
                }
                break;
            case 115:
                {
                alt91=2;
                }
                break;
            case 118:
                {
                alt91=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5138:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11159);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5148:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11186);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5158:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11213);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5174:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5175:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5176:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11248);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint11258); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5183:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5186:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5187:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5187:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5187:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5187:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==119) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5187:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleUniqueTableConstraint11296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5191:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5192:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5192:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5193:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11313); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,113,FOLLOW_113_in_ruleUniqueTableConstraint11332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleUniqueTableConstraint11344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5217:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5218:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5218:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5219:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11365);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5235:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==22) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5235:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleUniqueTableConstraint11378); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5239:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5240:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5240:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5241:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11399);
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
            	    break loop93;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleUniqueTableConstraint11413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5261:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5262:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5262:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5263:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11434);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5287:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5288:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5289:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11470);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint11480); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5296:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5299:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5300:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5300:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5300:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5300:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==119) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5300:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,119,FOLLOW_119_in_rulePrimaryConstraint11518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5304:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5305:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5305:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5306:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint11535); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_rulePrimaryConstraint11554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePrimaryConstraint11566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5330:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5331:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5331:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5332:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11587);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5348:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==22) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5348:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulePrimaryConstraint11600); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5352:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5353:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5353:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5354:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11621);
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
            	    break loop95;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_rulePrimaryConstraint11635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5374:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5375:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5375:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5376:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11656);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5400:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5401:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5402:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11692);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint11702); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5409:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5412:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5413:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5413:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5413:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5413:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==119) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5413:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleCheckTableConstraint11740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5417:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5418:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5418:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5419:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint11757); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,118,FOLLOW_118_in_ruleCheckTableConstraint11776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCheckTableConstraint11788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5443:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5444:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5444:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5445:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11809);
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

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleCheckTableConstraint11821); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5473:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5474:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5475:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11857);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn11867); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5482:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collationName_2_0=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5485:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5486:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5486:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5486:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5486:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5487:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5487:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5488:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5499:2: (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==120) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5499:4: otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,120,FOLLOW_120_in_ruleIndexedColumn11925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIndexedColumnAccess().getCollateKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5503:1: ( (lv_collationName_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5504:1: (lv_collationName_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5504:1: (lv_collationName_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5505:3: lv_collationName_2_0= RULE_ID
                    {
                    lv_collationName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn11942); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5521:4: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            int alt98=3;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==81) ) {
                alt98=1;
            }
            else if ( (LA98_0==82) ) {
                alt98=2;
            }
            switch (alt98) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5521:5: ( (lv_asc_3_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5521:5: ( (lv_asc_3_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5522:1: (lv_asc_3_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5522:1: (lv_asc_3_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5523:3: lv_asc_3_0= 'asc'
                    {
                    lv_asc_3_0=(Token)match(input,81,FOLLOW_81_in_ruleIndexedColumn11968); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5537:6: ( (lv_desc_4_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5537:6: ( (lv_desc_4_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5538:1: (lv_desc_4_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5538:1: (lv_desc_4_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5539:3: lv_desc_4_0= 'desc'
                    {
                    lv_desc_4_0=(Token)match(input,82,FOLLOW_82_in_ruleIndexedColumn12005); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5560:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5561:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5562:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12056);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue12066); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5569:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5572:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5573:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5573:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=RULE_STRING && LA99_0<=RULE_NUMBER)||LA99_0==32||(LA99_0>=90 && LA99_0<=93)) ) {
                alt99=1;
            }
            else if ( (LA99_0==21) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5573:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5573:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5573:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5573:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5574:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5579:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5580:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5580:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5581:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue12122);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5598:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5598:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5598:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5598:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5599:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDefaultValue12151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5608:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5609:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5609:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5610:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue12172);
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

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleDefaultValue12184); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5638:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5639:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5640:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause12221);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause12231); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5647:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5650:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5651:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5651:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5651:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleConflictClause12268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,121,FOLLOW_121_in_ruleConflictClause12280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5659:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5660:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5660:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5661:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause12301);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5685:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5686:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5687:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12337);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement12347); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5694:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5697:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5698:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5698:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt100=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt100=1;
                }
                break;
            case 103:
            case 122:
                {
                alt100=2;
                }
                break;
            case 104:
                {
                alt100=3;
                }
                break;
            case 102:
                {
                alt100=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5699:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement12394);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5709:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement12421);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5719:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12448);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5729:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12475);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5745:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5746:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5747:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12510);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement12520); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5754:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5757:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5758:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5758:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5758:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleDeleteStatement12557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleDeleteStatement12569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5766:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5767:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5767:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5768:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement12589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5779:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==78) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5779:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,78,FOLLOW_78_in_ruleDeleteStatement12602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5783:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5784:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5784:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5785:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12623);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5809:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5810:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5811:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12661);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement12671); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5818:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5821:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5822:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5822:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5822:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5822:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==103) ) {
                alt103=1;
            }
            else if ( (LA103_0==122) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5822:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5822:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5822:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleInsertStatement12710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5826:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==54) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5826:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleInsertStatement12723); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5830:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5831:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5831:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5832:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement12744);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5849:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,122,FOLLOW_122_in_ruleInsertStatement12765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,123,FOLLOW_123_in_ruleInsertStatement12778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5857:1: ( (otherlv_5= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5858:1: (otherlv_5= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5858:1: (otherlv_5= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5859:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5870:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==21) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5870:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleInsertStatement12811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5874:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5875:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5875:1: (otherlv_7= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5876:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5887:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==22) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5887:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleInsertStatement12844); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5891:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5892:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5892:1: (otherlv_9= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5893:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement12864); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleInsertStatement12878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5908:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==74||LA108_0==124) ) {
                alt108=1;
            }
            else if ( (LA108_0==117) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5908:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5908:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==124) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==74) ) {
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5908:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5908:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5908:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,124,FOLLOW_124_in_ruleInsertStatement12895); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleInsertStatement12907); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5916:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5917:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5917:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5918:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12928);
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5934:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop106:
                            do {
                                int alt106=2;
                                int LA106_0 = input.LA(1);

                                if ( (LA106_0==22) ) {
                                    alt106=1;
                                }


                                switch (alt106) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5934:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleInsertStatement12941); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5938:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5939:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5939:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5940:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement12962);
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
                            	    break loop106;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleInsertStatement12976); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5961:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5961:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5962:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5962:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5963:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement13004);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5980:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5980:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5980:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,117,FOLLOW_117_in_ruleInsertStatement13024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,124,FOLLOW_124_in_ruleInsertStatement13036); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5996:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5997:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5998:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13074);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement13084); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6005:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6008:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6009:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6009:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6009:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleUpdateStatement13121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6013:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==54) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6013:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleUpdateStatement13134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6017:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6018:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6018:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6019:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13155);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6035:4: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6036:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6036:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6037:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement13177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,125,FOLLOW_125_in_ruleUpdateStatement13189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6052:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6053:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6053:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6054:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13210);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6070:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==22) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6070:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleUpdateStatement13223); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6074:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6075:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6075:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6076:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13244);
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
            	    break loop110;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6092:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==78) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6092:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleUpdateStatement13259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6096:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6097:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6097:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6098:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13280);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6122:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6123:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6124:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13318);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression13328); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6131:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6134:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6135:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6135:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6135:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6135:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6136:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6136:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6137:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleUpdateColumnExpression13385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6152:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6153:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6153:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6154:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13406);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6178:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6179:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6180:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13443);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber13454); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6187:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6190:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6191:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6191:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6191:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6191:2: (kw= '-' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==32) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6192:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleSignedNumber13493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber13510); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6212:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6213:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6214:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13556);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13567); if (state.failed) return current;

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6221:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6224:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6225:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6225:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6225:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6232:1: (kw= '.' this_ID_2= RULE_ID )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==60) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6233:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleQualifiedName13626); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13641); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop113;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6253:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6255:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6256:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6256:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt114=4;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt114=1;
                }
                break;
            case 127:
                {
                alt114=2;
                }
                break;
            case 128:
                {
                alt114=3;
                }
                break;
            case 129:
                {
                alt114=4;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6256:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6256:2: (enumLiteral_0= 'union all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6256:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_126_in_ruleCompoundOperator13702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6262:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6262:6: (enumLiteral_1= 'union' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6262:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_127_in_ruleCompoundOperator13719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6268:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6268:6: (enumLiteral_2= 'intersect' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6268:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,128,FOLLOW_128_in_ruleCompoundOperator13736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6274:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6274:6: (enumLiteral_3= 'except' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6274:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,129,FOLLOW_129_in_ruleCompoundOperator13753); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6284:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6286:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6287:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6287:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt115=6;
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
            case 134:
                {
                alt115=5;
                }
                break;
            case 135:
                {
                alt115=6;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6287:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6287:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6287:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_130_in_ruleSqliteDataType13798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6293:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6293:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6293:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_131_in_ruleSqliteDataType13815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6299:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6299:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6299:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_132_in_ruleSqliteDataType13832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6305:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6305:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6305:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,133,FOLLOW_133_in_ruleSqliteDataType13849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6311:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6311:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6311:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,134,FOLLOW_134_in_ruleSqliteDataType13866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6317:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6317:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6317:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,135,FOLLOW_135_in_ruleSqliteDataType13883); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6327:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6329:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6330:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6330:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt116=5;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt116=1;
                }
                break;
            case 131:
                {
                alt116=2;
                }
                break;
            case 132:
                {
                alt116=3;
                }
                break;
            case 133:
                {
                alt116=4;
                }
                break;
            case 136:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6330:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6330:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6330:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_130_in_ruleColumnType13928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6336:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6336:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6336:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_131_in_ruleColumnType13945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6342:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6342:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6342:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_132_in_ruleColumnType13962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6348:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6348:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6348:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,133,FOLLOW_133_in_ruleColumnType13979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6354:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6354:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6354:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,136,FOLLOW_136_in_ruleColumnType13996); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6364:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6366:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6367:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6367:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt117=5;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt117=1;
                }
                break;
            case 138:
                {
                alt117=2;
                }
                break;
            case 139:
                {
                alt117=3;
                }
                break;
            case 140:
                {
                alt117=4;
                }
                break;
            case 122:
                {
                alt117=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6367:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6367:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6367:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,137,FOLLOW_137_in_ruleConflictResolution14041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6373:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6373:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6373:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,138,FOLLOW_138_in_ruleConflictResolution14058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6379:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6379:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6379:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,139,FOLLOW_139_in_ruleConflictResolution14075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6385:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6385:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6385:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,140,FOLLOW_140_in_ruleConflictResolution14092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6391:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6391:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:6391:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,122,FOLLOW_122_in_ruleConflictResolution14109); if (state.failed) return current;
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
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:5: ( ( RULE_ID ) )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1822:1: ( RULE_ID )
        {
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1822:1: ( RULE_ID )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1823:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel4033); if (state.failed) return ;

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


    protected DFA39 dfa39 = new DFA39(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA39_eotS =
        "\15\uffff";
    static final String DFA39_eofS =
        "\3\uffff\1\12\11\uffff";
    static final String DFA39_minS =
        "\1\4\2\uffff\1\22\1\uffff\1\4\7\uffff";
    static final String DFA39_maxS =
        "\1\135\2\uffff\1\u0081\1\uffff\1\135\7\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\12\1\3\1\10\1\5";
    static final String DFA39_specialS =
        "\15\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\3\2\4\16\uffff\1\5\12\uffff\1\4\31\uffff\1\1\1\2\1\uffff\2\6\1\7\2\uffff\1\10\1\uffff\1\11\25\uffff\4\4",
            "",
            "",
            "\1\12\2\uffff\1\13\3\12\2\uffff\1\12\1\uffff\35\12\2\uffff\1\12\3\uffff\2\12\1\uffff\1\12\1\uffff\5\12\3\uffff\10\12\1\uffff\3\12\22\uffff\1\12\22\uffff\4\12",
            "",
            "\3\14\16\uffff\1\14\12\uffff\1\14\31\uffff\2\14\1\uffff\3\14\2\uffff\1\14\1\uffff\1\14\5\uffff\1\6\17\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "1767:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )";
        }
    }
    static final String DFA31_eotS =
        "\121\uffff";
    static final String DFA31_eofS =
        "\1\uffff\1\3\1\44\1\uffff\1\5\114\uffff";
    static final String DFA31_minS =
        "\1\4\1\22\1\4\1\uffff\1\4\76\uffff\1\4\14\uffff\1\0";
    static final String DFA31_maxS =
        "\1\4\2\u0081\1\uffff\1\u0081\76\uffff\1\135\14\uffff\1\0";
    static final String DFA31_acceptS =
        "\3\uffff\1\3\1\uffff\1\2\75\1\1\uffff\14\1\1\uffff";
    static final String DFA31_specialS =
        "\2\uffff\1\0\1\uffff\1\2\113\uffff\1\1}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\3\3\uffff\3\3\2\uffff\1\3\1\uffff\35\3\2\uffff\1\2\3\uffff\2\3\1\uffff\1\3\1\uffff\5\3\3\uffff\10\3\1\uffff\3\3\22\uffff\1\3\22\uffff\4\3",
            "\1\5\15\uffff\1\55\3\uffff\1\50\1\45\1\41\2\uffff\1\4\1\uffff\1\43\1\42\1\37\1\40\1\33\1\34\1\35\1\36\1\27\1\30\1\31\1\32\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\12\1\11\1\6\1\7\1\10\6\uffff\1\53\1\47\1\uffff\1\51\1\uffff\1\46\1\52\1\64\1\65\1\54\3\uffff\1\76\1\70\1\56\1\57\1\66\1\67\1\71\1\72\1\uffff\1\73\1\74\1\75\22\uffff\1\77\22\uffff\1\60\1\61\1\62\1\63",
            "",
            "\1\102\1\105\1\104\13\uffff\1\5\2\uffff\1\112\3\5\2\uffff\1\5\1\uffff\3\5\1\103\31\5\1\100\1\101\1\uffff\1\113\1\114\1\115\2\5\1\116\1\5\1\117\5\5\3\uffff\10\5\1\uffff\3\5\1\uffff\1\106\1\107\1\110\1\111\15\uffff\1\5\22\uffff\4\5",
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
            "",
            "",
            "\2\5\1\120\16\uffff\1\5\12\uffff\1\5\31\uffff\2\5\1\uffff\3\5\2\uffff\1\5\1\uffff\1\5\25\uffff\4\5",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1821:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_2==27) ) {s = 4;}

                        else if ( (LA31_2==RULE_ID) ) {s = 5;}

                        else if ( (LA31_2==55) && (synpred1_InternalSqliteModel())) {s = 6;}

                        else if ( (LA31_2==56) && (synpred1_InternalSqliteModel())) {s = 7;}

                        else if ( (LA31_2==57) && (synpred1_InternalSqliteModel())) {s = 8;}

                        else if ( (LA31_2==54) && (synpred1_InternalSqliteModel())) {s = 9;}

                        else if ( (LA31_2==53) && (synpred1_InternalSqliteModel())) {s = 10;}

                        else if ( (LA31_2==41) && (synpred1_InternalSqliteModel())) {s = 11;}

                        else if ( (LA31_2==42) && (synpred1_InternalSqliteModel())) {s = 12;}

                        else if ( (LA31_2==43) && (synpred1_InternalSqliteModel())) {s = 13;}

                        else if ( (LA31_2==44) && (synpred1_InternalSqliteModel())) {s = 14;}

                        else if ( (LA31_2==45) && (synpred1_InternalSqliteModel())) {s = 15;}

                        else if ( (LA31_2==46) && (synpred1_InternalSqliteModel())) {s = 16;}

                        else if ( (LA31_2==47) && (synpred1_InternalSqliteModel())) {s = 17;}

                        else if ( (LA31_2==48) && (synpred1_InternalSqliteModel())) {s = 18;}

                        else if ( (LA31_2==49) && (synpred1_InternalSqliteModel())) {s = 19;}

                        else if ( (LA31_2==50) && (synpred1_InternalSqliteModel())) {s = 20;}

                        else if ( (LA31_2==51) && (synpred1_InternalSqliteModel())) {s = 21;}

                        else if ( (LA31_2==52) && (synpred1_InternalSqliteModel())) {s = 22;}

                        else if ( (LA31_2==37) && (synpred1_InternalSqliteModel())) {s = 23;}

                        else if ( (LA31_2==38) && (synpred1_InternalSqliteModel())) {s = 24;}

                        else if ( (LA31_2==39) && (synpred1_InternalSqliteModel())) {s = 25;}

                        else if ( (LA31_2==40) && (synpred1_InternalSqliteModel())) {s = 26;}

                        else if ( (LA31_2==33) && (synpred1_InternalSqliteModel())) {s = 27;}

                        else if ( (LA31_2==34) && (synpred1_InternalSqliteModel())) {s = 28;}

                        else if ( (LA31_2==35) && (synpred1_InternalSqliteModel())) {s = 29;}

                        else if ( (LA31_2==36) && (synpred1_InternalSqliteModel())) {s = 30;}

                        else if ( (LA31_2==31) && (synpred1_InternalSqliteModel())) {s = 31;}

                        else if ( (LA31_2==32) && (synpred1_InternalSqliteModel())) {s = 32;}

                        else if ( (LA31_2==24) && (synpred1_InternalSqliteModel())) {s = 33;}

                        else if ( (LA31_2==30) && (synpred1_InternalSqliteModel())) {s = 34;}

                        else if ( (LA31_2==29) && (synpred1_InternalSqliteModel())) {s = 35;}

                        else if ( (LA31_2==EOF) && (synpred1_InternalSqliteModel())) {s = 36;}

                        else if ( (LA31_2==23) && (synpred1_InternalSqliteModel())) {s = 37;}

                        else if ( (LA31_2==69) && (synpred1_InternalSqliteModel())) {s = 38;}

                        else if ( (LA31_2==65) && (synpred1_InternalSqliteModel())) {s = 39;}

                        else if ( (LA31_2==22) && (synpred1_InternalSqliteModel())) {s = 40;}

                        else if ( (LA31_2==67) && (synpred1_InternalSqliteModel())) {s = 41;}

                        else if ( (LA31_2==70) && (synpred1_InternalSqliteModel())) {s = 42;}

                        else if ( (LA31_2==64) && (synpred1_InternalSqliteModel())) {s = 43;}

                        else if ( (LA31_2==73) && (synpred1_InternalSqliteModel())) {s = 44;}

                        else if ( (LA31_2==18) && (synpred1_InternalSqliteModel())) {s = 45;}

                        else if ( (LA31_2==79) && (synpred1_InternalSqliteModel())) {s = 46;}

                        else if ( (LA31_2==80) && (synpred1_InternalSqliteModel())) {s = 47;}

                        else if ( (LA31_2==126) && (synpred1_InternalSqliteModel())) {s = 48;}

                        else if ( (LA31_2==127) && (synpred1_InternalSqliteModel())) {s = 49;}

                        else if ( (LA31_2==128) && (synpred1_InternalSqliteModel())) {s = 50;}

                        else if ( (LA31_2==129) && (synpred1_InternalSqliteModel())) {s = 51;}

                        else if ( (LA31_2==71) && (synpred1_InternalSqliteModel())) {s = 52;}

                        else if ( (LA31_2==72) && (synpred1_InternalSqliteModel())) {s = 53;}

                        else if ( (LA31_2==81) && (synpred1_InternalSqliteModel())) {s = 54;}

                        else if ( (LA31_2==82) && (synpred1_InternalSqliteModel())) {s = 55;}

                        else if ( (LA31_2==78) && (synpred1_InternalSqliteModel())) {s = 56;}

                        else if ( (LA31_2==83) && (synpred1_InternalSqliteModel())) {s = 57;}

                        else if ( (LA31_2==84) && (synpred1_InternalSqliteModel())) {s = 58;}

                        else if ( (LA31_2==86) && (synpred1_InternalSqliteModel())) {s = 59;}

                        else if ( (LA31_2==87) && (synpred1_InternalSqliteModel())) {s = 60;}

                        else if ( (LA31_2==88) && (synpred1_InternalSqliteModel())) {s = 61;}

                        else if ( (LA31_2==77) && (synpred1_InternalSqliteModel())) {s = 62;}

                        else if ( (LA31_2==107) && (synpred1_InternalSqliteModel())) {s = 63;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_80 = input.LA(1);

                         
                        int index31_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqliteModel()) ) {s = 79;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index31_80);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_4==58) && (synpred1_InternalSqliteModel())) {s = 64;}

                        else if ( (LA31_4==59) && (synpred1_InternalSqliteModel())) {s = 65;}

                        else if ( (LA31_4==RULE_ID) && (synpred1_InternalSqliteModel())) {s = 66;}

                        else if ( (LA31_4==32) ) {s = 67;}

                        else if ( (LA31_4==RULE_NUMBER) && (synpred1_InternalSqliteModel())) {s = 68;}

                        else if ( (LA31_4==RULE_STRING) && (synpred1_InternalSqliteModel())) {s = 69;}

                        else if ( (LA31_4==90) && (synpred1_InternalSqliteModel())) {s = 70;}

                        else if ( (LA31_4==91) && (synpred1_InternalSqliteModel())) {s = 71;}

                        else if ( (LA31_4==92) && (synpred1_InternalSqliteModel())) {s = 72;}

                        else if ( (LA31_4==93) && (synpred1_InternalSqliteModel())) {s = 73;}

                        else if ( (LA31_4==21) && (synpred1_InternalSqliteModel())) {s = 74;}

                        else if ( (LA31_4==61) && (synpred1_InternalSqliteModel())) {s = 75;}

                        else if ( (LA31_4==62) && (synpred1_InternalSqliteModel())) {s = 76;}

                        else if ( (LA31_4==63) && (synpred1_InternalSqliteModel())) {s = 77;}

                        else if ( (LA31_4==66) && (synpred1_InternalSqliteModel())) {s = 78;}

                        else if ( (LA31_4==68) && (synpred1_InternalSqliteModel())) {s = 79;}

                        else if ( (LA31_4==EOF||LA31_4==18||(LA31_4>=22 && LA31_4<=24)||LA31_4==27||(LA31_4>=29 && LA31_4<=31)||(LA31_4>=33 && LA31_4<=57)||(LA31_4>=64 && LA31_4<=65)||LA31_4==67||(LA31_4>=69 && LA31_4<=73)||(LA31_4>=77 && LA31_4<=84)||(LA31_4>=86 && LA31_4<=88)||LA31_4==107||(LA31_4>=126 && LA31_4<=129)) ) {s = 5;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\21\uffff";
    static final String DFA64_eofS =
        "\21\uffff";
    static final String DFA64_minS =
        "\1\136\1\137\3\140\4\uffff\1\4\4\uffff\1\155\2\uffff";
    static final String DFA64_maxS =
        "\1\157\1\162\1\140\1\162\1\142\4\uffff\1\4\4\uffff\1\156\2\uffff";
    static final String DFA64_acceptS =
        "\5\uffff\1\1\1\2\1\4\1\3\1\uffff\1\11\1\12\1\10\1\7\1\uffff\1\6\1\5";
    static final String DFA64_specialS =
        "\21\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\15\uffff\1\2\2\uffff\1\3",
            "\1\4\1\5\1\6\1\10\16\uffff\2\7",
            "\1\11",
            "\1\15\1\12\1\14\17\uffff\1\13",
            "\1\5\1\6\1\10",
            "",
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

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3717:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )";
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
    public static final BitSet FOLLOW_ruleInitBlock_in_ruleDatabaseBlock324 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock346 = new BitSet(new long[]{0x0000000010008000L});
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
    public static final BitSet FOLLOW_14_in_ruleConfigurationStatement932 = new BitSet(new long[]{0x0000000000008000L,0x040001C000000400L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleConfigurationStatement954 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConfigurationStatement966 = new BitSet(new long[]{0x0000000000008000L,0x040001C000000400L});
    public static final BitSet FOLLOW_15_in_ruleConfigurationStatement980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArg1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleFunctionArg1073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionArg1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri1131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleContentUri1178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUri1195 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleContentUri1213 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1234 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContentUriSegment1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1374 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContentUriSegment1391 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleContentUriSegment1410 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_27_in_ruleContentUriSegment1447 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContentUriSegment1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMigrationBlock1566 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock1578 = new BitSet(new long[]{0x0000000000008000L,0x0000900040000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1600 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationBlock1612 = new BitSet(new long[]{0x0000000000008000L,0x0000900040000000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1809 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleExprConcat1836 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1870 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1965 = new BitSet(new long[]{0x0000000049000002L});
    public static final BitSet FOLLOW_27_in_ruleExprMult1994 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_24_in_ruleExprMult2023 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_30_in_ruleExprMult2052 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult2089 = new BitSet(new long[]{0x0000000049000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd2127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2184 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleExprAdd2213 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_32_in_ruleExprAdd2242 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2279 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2374 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_33_in_ruleExprBit2403 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_34_in_ruleExprBit2432 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_35_in_ruleExprBit2461 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_36_in_ruleExprBit2490 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2527 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2622 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_37_in_ruleExprRelate2651 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_38_in_ruleExprRelate2680 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_39_in_ruleExprRelate2709 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_40_in_ruleExprRelate2738 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2775 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2870 = new BitSet(new long[]{0x001FFE0000000002L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2899 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2928 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2957 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2986 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual3015 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual3044 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual3073 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_48_in_ruleExprEqual3102 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_49_in_ruleExprEqual3131 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_50_in_ruleExprEqual3160 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_51_in_ruleExprEqual3189 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_52_in_ruleExprEqual3218 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3255 = new BitSet(new long[]{0x001FFE0000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3350 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExprAnd3377 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3411 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3506 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExprOr3533 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3567 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3662 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression3730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNullExpression3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNullExpression3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNullExpression3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4050 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4090 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4102 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4256 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4277 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4324 = new BitSet(new long[]{0x4000000000200000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4356 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4403 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4444 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000034L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4465 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000034L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4487 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000037L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4501 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4570 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4587 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_27_in_rulePrimaryExpression4606 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4647 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression4660 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4681 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimaryExpression4726 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4738 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_rulePrimaryExpression4771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4792 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePrimaryExpression4833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCase4937 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleCase4970 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement5083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleSelectStatement5096 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSelectStatement5132 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5153 = new BitSet(new long[]{0x0000000000400002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleSelectStatement5167 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_22_in_ruleSelectStatement5185 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5303 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleOrderingTermList5316 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5337 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore5375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5432 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore5462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5483 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5577 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5596 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression5633 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_27_in_ruleSelectExpression5667 = new BitSet(new long[]{0x0000000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5707 = new BitSet(new long[]{0x0000000000000002L,0x000000000001E000L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression5721 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5742 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_78_in_ruleSelectExpression5757 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleSelectExpression5793 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSelectExpression5829 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5944 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleSelectList5957 = new BitSet(new long[]{0xEC00000108200070L,0x000000003C001814L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5978 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6162 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleGroupByExpressions6175 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6196 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleOrderingTerm6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOrderingTerm6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource6487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6543 = new BitSet(new long[]{0x0000000000000002L,0x0000000001D80000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource6564 = new BitSet(new long[]{0x0000000000000002L,0x0000000001D80000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource6601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6811 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSingleSourceTable6824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSingleSourceSelectStatement6940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6961 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSingleSourceSelectStatement6973 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSingleSourceSelectStatement6986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSingleSourceJoin7093 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7114 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSingleSourceJoin7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement7224 = new BitSet(new long[]{0x0000000000000000L,0x0000000001D00000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement7258 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement7289 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement7328 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_87_in_ruleJoinStatement7365 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleJoinStatement7392 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement7413 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleJoinStatement7425 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn7482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn7547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleResultColumn7560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleLiteralValue7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleLiteralValue7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleLiteralValue7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateTableStatement8345 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTableStatement8363 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTableStatement8389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement8406 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCreateTableStatement8423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8444 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCreateTableStatement8457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8478 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCreateTableStatement8493 = new BitSet(new long[]{0x0000000000000000L,0x00CA000000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8514 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTableStatement8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement8564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateViewStatement8620 = new BitSet(new long[]{0x0000000000000000L,0x0000000280000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateViewStatement8638 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateViewStatement8664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement8681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCreateViewStatement8698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement8802 = new BitSet(new long[]{0x0000000000000000L,0x0000000480000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement8820 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8863 = new BitSet(new long[]{0x0000000000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8888 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8917 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement8946 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement8982 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement9019 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_104_in_ruleCreateTriggerStatement9057 = new BitSet(new long[]{0x0000000000000000L,0x0000020002000000L});
    public static final BitSet FOLLOW_105_in_ruleCreateTriggerStatement9083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9100 = new BitSet(new long[]{0x0000000000400000L,0x0000000002000000L});
    public static final BitSet FOLLOW_22_in_ruleCreateTriggerStatement9118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9135 = new BitSet(new long[]{0x0000000000400000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleCreateTriggerStatement9158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9178 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000020L});
    public static final BitSet FOLLOW_106_in_ruleCreateTriggerStatement9196 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000020L});
    public static final BitSet FOLLOW_69_in_ruleCreateTriggerStatement9223 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9244 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleCreateTriggerStatement9258 = new BitSet(new long[]{0x0000000000000000L,0x040001C000000402L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9280 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCreateTriggerStatement9292 = new BitSet(new long[]{0x0000000000000000L,0x040001C000000402L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9314 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCreateTriggerStatement9326 = new BitSet(new long[]{0x0000000000000000L,0x040001C000000402L});
    public static final BitSet FOLLOW_65_in_ruleCreateTriggerStatement9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableRenameStatement9434 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleAlterTableRenameStatement9446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9466 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleAlterTableRenameStatement9478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableAddColumnStatement9583 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleAlterTableAddColumnStatement9595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement9615 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleAlterTableAddColumnStatement9627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropTableStatement9731 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleDropTableStatement9743 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropTableStatement9761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement9795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropTriggerStatement9878 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleDropTriggerStatement9890 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropTriggerStatement9908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropViewStatement10025 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDropViewStatement10037 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropViewStatement10055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement10089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateIndexStatement10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateIndexStatement10172 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_113_in_ruleCreateIndexStatement10190 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleCreateIndexStatement10216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10233 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleCreateIndexStatement10250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10270 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCreateIndexStatement10282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10303 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCreateIndexStatement10316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10337 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCreateIndexStatement10351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropIndexStatement10397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropIndexStatement10434 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleDropIndexStatement10446 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropIndexStatement10464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropIndexStatement10498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef10534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef10595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000013CL});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef10621 = new BitSet(new long[]{0x0100000000000002L,0x006A000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef10642 = new BitSet(new long[]{0x0100000000000002L,0x006A000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint10679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint10689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleColumnConstraint10736 = new BitSet(new long[]{0x0000000000000002L,0x0010000000060000L});
    public static final BitSet FOLLOW_81_in_ruleColumnConstraint10755 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_82_in_ruleColumnConstraint10792 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleColumnConstraint10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleColumnConstraint10868 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleColumnConstraint10919 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint10940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleColumnConstraint10970 = new BitSet(new long[]{0x0000000100200060L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleColumnConstraint11020 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleColumnConstraint11032 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11053 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleColumnConstraint11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleUniqueTableConstraint11296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11313 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleUniqueTableConstraint11332 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUniqueTableConstraint11344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11365 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleUniqueTableConstraint11378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11399 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleUniqueTableConstraint11413 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_rulePrimaryConstraint11518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint11535 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_rulePrimaryConstraint11554 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryConstraint11566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11587 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryConstraint11600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint11621 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryConstraint11635 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint11656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint11692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint11702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleCheckTableConstraint11740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint11757 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleCheckTableConstraint11776 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCheckTableConstraint11788 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint11809 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCheckTableConstraint11821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn11857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11912 = new BitSet(new long[]{0x0000000000000002L,0x0100000000060000L});
    public static final BitSet FOLLOW_120_in_ruleIndexedColumn11925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn11942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_ruleIndexedColumn11968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleIndexedColumn12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDefaultValue12151 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue12172 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDefaultValue12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause12221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause12231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleConflictClause12268 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleConflictClause12280 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement12421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement12520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleDeleteStatement12557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleDeleteStatement12569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement12589 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleDeleteStatement12602 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement12623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement12661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement12671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleInsertStatement12710 = new BitSet(new long[]{0x0040000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_54_in_ruleInsertStatement12723 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement12744 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_122_in_ruleInsertStatement12765 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleInsertStatement12778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12798 = new BitSet(new long[]{0x0000000000200000L,0x1020000000000400L});
    public static final BitSet FOLLOW_21_in_ruleInsertStatement12811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12831 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleInsertStatement12844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement12864 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleInsertStatement12878 = new BitSet(new long[]{0x0000000000000000L,0x1020000000000400L});
    public static final BitSet FOLLOW_124_in_ruleInsertStatement12895 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInsertStatement12907 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12928 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleInsertStatement12941 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement12962 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleInsertStatement12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement13004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleInsertStatement13024 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleInsertStatement13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement13084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleUpdateStatement13121 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_54_in_ruleUpdateStatement13134 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement13177 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleUpdateStatement13189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13210 = new BitSet(new long[]{0x0000000000400002L,0x0000000000004000L});
    public static final BitSet FOLLOW_22_in_ruleUpdateStatement13223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13244 = new BitSet(new long[]{0x0000000000400002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleUpdateStatement13259 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression13328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13373 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleUpdateColumnExpression13385 = new BitSet(new long[]{0xEC00000100200070L,0x000000003C000014L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber13454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSignedNumber13493 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber13510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13607 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualifiedName13626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13641 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleCompoundOperator13702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleCompoundOperator13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleCompoundOperator13736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleCompoundOperator13753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSqliteDataType13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSqliteDataType13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSqliteDataType13832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSqliteDataType13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleSqliteDataType13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleSqliteDataType13883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType13928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleColumnType13945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleColumnType13962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleColumnType13979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleColumnType13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleConflictResolution14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleConflictResolution14058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleConflictResolution14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleConflictResolution14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleConflictResolution14109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel4033 = new BitSet(new long[]{0x0000000000000002L});

}