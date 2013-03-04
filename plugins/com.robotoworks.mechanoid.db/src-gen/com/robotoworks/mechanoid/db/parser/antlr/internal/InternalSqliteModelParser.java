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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'action'", "'/'", "':'", "'#'", "'*'", "'migration'", "';'", "'||'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'('", "')'", "'not'", "'exists'", "'case'", "'else'", "'end'", "','", "'cast'", "'as'", "'when'", "'then'", "'order by'", "'select'", "'distinct'", "'all'", "'from'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_time_stamp'", "'create'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'primary key'", "'autoincrement'", "'default'", "'constraint'", "'unique'", "'check'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:138:1: ruleDatabaseBlock returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' ) ;
    public final EObject ruleDatabaseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_config_3_0 = null;

        EObject lv_migrations_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:141:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:142:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}'
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

                if ( (LA2_0==22) ) {
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDatabaseBlock337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDatabaseBlockAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:216:1: entryRuleConfigBlock returns [EObject current=null] : iv_ruleConfigBlock= ruleConfigBlock EOF ;
    public final EObject entryRuleConfigBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigBlock = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:217:2: (iv_ruleConfigBlock= ruleConfigBlock EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:218:2: iv_ruleConfigBlock= ruleConfigBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigBlockRule()); 
            }
            pushFollow(FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock373);
            iv_ruleConfigBlock=ruleConfigBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigBlock383); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:225:1: ruleConfigBlock returns [EObject current=null] : ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleConfigBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:228:28: ( ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:229:1: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:229:1: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:229:2: () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:229:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:230:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigBlockAccess().getConfigBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleConfigBlock429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigBlockAccess().getConfigKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleConfigBlock441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConfigBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:243:1: ( (lv_statements_3_0= ruleConfigurationStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:244:1: (lv_statements_3_0= ruleConfigurationStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:244:1: (lv_statements_3_0= ruleConfigurationStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:245:3: lv_statements_3_0= ruleConfigurationStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConfigBlockAccess().getStatementsConfigurationStatementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConfigurationStatement_in_ruleConfigBlock462);
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
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConfigBlock475); if (state.failed) return current;
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


    // $ANTLR start "entryRuleConfigurationStatement"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:273:1: entryRuleConfigurationStatement returns [EObject current=null] : iv_ruleConfigurationStatement= ruleConfigurationStatement EOF ;
    public final EObject entryRuleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:274:2: (iv_ruleConfigurationStatement= ruleConfigurationStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:275:2: iv_ruleConfigurationStatement= ruleConfigurationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleConfigurationStatement_in_entryRuleConfigurationStatement511);
            iv_ruleConfigurationStatement=ruleConfigurationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationStatement521); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:282:1: ruleConfigurationStatement returns [EObject current=null] : ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) ;
    public final EObject ruleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_uri_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:285:28: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:286:1: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:286:1: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:286:2: () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uri_3_0= ruleContentUri ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:286:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:287:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConfigurationStatementAccess().getActionStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleConfigurationStatement567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConfigurationStatementAccess().getActionKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:296:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:297:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:297:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:298:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationStatement584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_2_0()); 
              		
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:314:2: ( (lv_uri_3_0= ruleContentUri ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:315:1: (lv_uri_3_0= ruleContentUri )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:315:1: (lv_uri_3_0= ruleContentUri )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:316:3: lv_uri_3_0= ruleContentUri
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConfigurationStatementAccess().getUriContentUriParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleContentUri_in_ruleConfigurationStatement610);
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


    // $ANTLR start "entryRuleContentUri"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:340:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:341:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:342:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri646);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri656); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:349:1: ruleContentUri returns [EObject current=null] : (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:352:28: ( (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:353:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:353:1: (otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:353:3: otherlv_0= '/' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleContentUri693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriAccess().getSolidusKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:357:1: ( (lv_type_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:358:1: (lv_type_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:358:1: (lv_type_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:359:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUri710); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:375:2: (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:375:4: otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleContentUri728); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:379:1: ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:380:1: (lv_segments_3_0= ruleContentUriSegment )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:380:1: (lv_segments_3_0= ruleContentUriSegment )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:381:3: lv_segments_3_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri749);
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
            	    break loop4;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:405:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:406:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:407:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment787);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment797); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:414:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:417:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:418:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:418:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:418:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:418:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:419:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:419:1: (lv_name_0_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:420:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment839); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:437:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:437:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:437:7: () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) ) otherlv_7= '}'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:437:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:438:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContentUriSegment872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:447:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:448:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:448:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:449:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment889); if (state.failed) return current;
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

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleContentUriSegment906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentUriSegmentAccess().getColonKeyword_1_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:469:1: ( ( (lv_num_5_0= '#' ) ) | ( (lv_text_6_0= '*' ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==21) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:469:2: ( (lv_num_5_0= '#' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:469:2: ( (lv_num_5_0= '#' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:470:1: (lv_num_5_0= '#' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:470:1: (lv_num_5_0= '#' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:471:3: lv_num_5_0= '#'
                            {
                            lv_num_5_0=(Token)match(input,20,FOLLOW_20_in_ruleContentUriSegment925); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:485:6: ( (lv_text_6_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:485:6: ( (lv_text_6_0= '*' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:486:1: (lv_text_6_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:486:1: (lv_text_6_0= '*' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:487:3: lv_text_6_0= '*'
                            {
                            lv_text_6_0=(Token)match(input,21,FOLLOW_21_in_ruleContentUriSegment962); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContentUriSegment988); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:512:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:513:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:514:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1025);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1035); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:521:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:524:28: ( ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:525:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:525:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:525:2: () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:525:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:526:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleMigrationBlock1081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMigrationBlock1093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:539:1: ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==88||LA7_0==101||LA7_0==104) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:539:2: ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';'
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:539:2: ( (lv_statements_3_0= ruleDDLStatement ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:540:1: (lv_statements_3_0= ruleDDLStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:540:1: (lv_statements_3_0= ruleDDLStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:541:3: lv_statements_3_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1115);
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

            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleMigrationBlock1127); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMigrationBlock1141); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:573:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:574:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:575:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1177);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression1187); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:582:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:585:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:587:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression1233);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:603:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:604:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:605:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat1267);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat1277); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:612:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:615:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:616:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:616:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:617:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1324);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:625:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:625:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:625:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:626:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:631:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:632:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:632:1: (lv_op_2_0= '||' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:633:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,24,FOLLOW_24_in_ruleExprConcat1351); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:646:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:647:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:647:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:648:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1385);
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
            	    break loop8;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:672:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:673:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:674:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1423);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1433); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:681:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:684:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:685:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:685:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:686:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1480);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:694:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18||LA10_0==21||LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:694:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:694:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:695:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:700:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:701:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:701:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:702:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:702:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:703:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_21_in_ruleExprMult1509); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:715:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,18,FOLLOW_18_in_ruleExprMult1538); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:727:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,25,FOLLOW_25_in_ruleExprMult1567); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:742:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:743:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:743:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:744:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1604);
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
    // $ANTLR end "ruleExprMult"


    // $ANTLR start "entryRuleExprAdd"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:768:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:769:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:770:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd1642);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd1652); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:777:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:780:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:781:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:781:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:782:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1699);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:790:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:790:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:790:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:791:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:796:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:797:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:797:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:798:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:798:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:799:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_ruleExprAdd1728); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:811:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_ruleExprAdd1757); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:826:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:827:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:827:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:828:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1794);
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
            	    break loop12;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:852:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:853:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:854:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit1832);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit1842); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:861:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:864:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:865:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:865:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:866:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit1889);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:874:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=28 && LA14_0<=31)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:874:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:874:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:875:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:880:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:881:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:881:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:882:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:882:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:883:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_28_in_ruleExprBit1918); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:895:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_29_in_ruleExprBit1947); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:907:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,30,FOLLOW_30_in_ruleExprBit1976); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:919:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,31,FOLLOW_31_in_ruleExprBit2005); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:934:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:935:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:935:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:936:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2042);
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
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:960:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:961:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:962:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate2080);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate2090); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:969:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:972:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:973:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:973:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:974:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2137);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:982:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:982:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:982:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:983:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:988:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:989:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:989:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:990:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:990:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt15=4;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:991:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_32_in_ruleExprRelate2166); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1003:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_33_in_ruleExprRelate2195); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1015:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,34,FOLLOW_34_in_ruleExprRelate2224); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1027:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,35,FOLLOW_35_in_ruleExprRelate2253); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1042:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1043:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1043:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1044:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2290);
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
    // $ANTLR end "ruleExprRelate"


    // $ANTLR start "entryRuleExprEqual"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1068:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1069:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1070:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual2328);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual2338); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1077:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
        EObject this_ExprAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1080:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1081:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1081:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1082:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2385);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1090:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=36 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1090:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1090:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1091:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1096:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1097:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1097:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1098:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1098:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    int alt17=11;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt17=5;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt17=6;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt17=7;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt17=8;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt17=9;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt17=10;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt17=11;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1099:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_36_in_ruleExprEqual2414); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1111:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_37_in_ruleExprEqual2443); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1123:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,38,FOLLOW_38_in_ruleExprEqual2472); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1135:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,39,FOLLOW_39_in_ruleExprEqual2501); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1147:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,40,FOLLOW_40_in_ruleExprEqual2530); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1159:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2559); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1171:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2588); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1183:8: lv_op_2_8= 'like'
            	            {
            	            lv_op_2_8=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2617); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_8, grammarAccess.getExprEqualAccess().getOpLikeKeyword_1_1_0_7());
            	                  
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1195:8: lv_op_2_9= 'glob'
            	            {
            	            lv_op_2_9=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2646); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_9, grammarAccess.getExprEqualAccess().getOpGlobKeyword_1_1_0_8());
            	                  
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1207:8: lv_op_2_10= 'match'
            	            {
            	            lv_op_2_10=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual2675); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_10, grammarAccess.getExprEqualAccess().getOpMatchKeyword_1_1_0_9());
            	                  
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1219:8: lv_op_2_11= 'regexp'
            	            {
            	            lv_op_2_11=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual2704); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_11, grammarAccess.getExprEqualAccess().getOpRegexpKeyword_1_1_0_10());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_11, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1234:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1235:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1235:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1236:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2741);
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
    // $ANTLR end "ruleExprEqual"


    // $ANTLR start "entryRuleExprAnd"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1260:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1261:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1262:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2779);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2789); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1269:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1272:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1273:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1273:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1274:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2836);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1282:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1282:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1282:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1283:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1288:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1289:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1289:1: (lv_op_2_0= 'and' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1290:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,47,FOLLOW_47_in_ruleExprAnd2863); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1303:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1304:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1304:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1305:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2897);
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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1329:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1330:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1331:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2935);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2945); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1338:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1341:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1342:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1342:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1343:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr2992);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1351:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1351:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1351:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1352:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1357:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1358:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1358:1: (lv_op_2_0= 'or' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1359:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,48,FOLLOW_48_in_ruleExprOr3019); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1372:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1373:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1373:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1374:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3053);
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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleNullCheckExpression"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1398:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1399:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1400:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3091);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression3101); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1407:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1410:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1411:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1411:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1412:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3148);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1420:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=49 && LA21_0<=51)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1420:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1420:2: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1421:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1426:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1427:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1427:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1428:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3178);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1452:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1453:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1454:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression3216);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression3226); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1461:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1464:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1465:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1465:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=50 && LA23_0<=51)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1465:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1465:2: ( () otherlv_1= 'is null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1465:3: () otherlv_1= 'is null'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1465:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1466:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleNullExpression3273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1476:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1476:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1476:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1476:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1477:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1482:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==50) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==51) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1482:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleNullExpression3303); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1487:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleNullExpression3321); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1499:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1500:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1501:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3359);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3369); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1508:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1511:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) )
            int alt33=9;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1513:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_rulePrimaryExpression3416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1522:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1523:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1523:1: (otherlv_2= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1536:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1536:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1536:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1536:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1537:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1546:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1547:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1547:1: (otherlv_5= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1548:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1560:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1560:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1560:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1560:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1561:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1566:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt25=3;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1566:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1566:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1566:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1566:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1566:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1572:1: (otherlv_7= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1573:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3536); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3548); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1589:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1589:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1589:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1589:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1590:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1590:1: (otherlv_9= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1591:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3576); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3588); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1606:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==21) ) {
                                alt24=1;
                            }
                            else if ( (LA24_0==RULE_ID) ) {
                                alt24=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 24, 0, input);

                                throw nvae;
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1606:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1606:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1607:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1607:1: (lv_all_11_0= '*' )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1608:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression3607); if (state.failed) return current;
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
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1622:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1622:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1623:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1623:1: (otherlv_12= RULE_ID )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1624:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3646); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1636:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1636:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1637:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1637:1: (otherlv_13= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1638:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3674); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1650:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1650:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1650:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1650:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1651:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1656:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1657:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1657:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1658:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3713);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1675:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1675:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1675:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1675:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1676:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1685:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1686:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1686:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1687:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3763);
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

                    otherlv_19=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1708:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1708:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1708:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1708:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1709:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1714:2: ( (lv_not_21_0= 'not' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==57) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1715:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1715:1: (lv_not_21_0= 'not' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1716:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3810); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1729:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==58) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1730:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1730:1: (lv_exists_22_0= 'exists' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1731:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3842); if (state.failed) return current;
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

                    otherlv_23=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1748:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1749:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1749:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1750:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3889);
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

                    otherlv_25=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1771:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1771:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1771:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1771:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1772:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1781:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_NUMBER)||LA28_0==27||(LA28_0>=52 && LA28_0<=53)||LA28_0==55||(LA28_0>=57 && LA28_0<=59)||LA28_0==63||(LA28_0>=84 && LA28_0<=87)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1782:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1782:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1783:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3951);
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1799:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==65) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1800:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1800:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1801:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression3973);
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
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==60) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1817:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression3987); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1821:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1822:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1822:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1823:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4008);
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

                    otherlv_32=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1844:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1845:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1850:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1851:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1851:1: (lv_name_34_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1852:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4056); if (state.failed) return current;
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

                    otherlv_35=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression4073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1872:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==21) ) {
                        alt32=1;
                    }
                    else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_NUMBER)||LA32_0==27||(LA32_0>=52 && LA32_0<=53)||LA32_0==55||(LA32_0>=57 && LA32_0<=59)||LA32_0==63||(LA32_0>=84 && LA32_0<=87)) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1872:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1872:2: ( (lv_all_36_0= '*' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1873:1: (lv_all_36_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1873:1: (lv_all_36_0= '*' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1874:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4092); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1888:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1888:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1888:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1888:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1889:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1889:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1890:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4133);
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1906:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==62) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1906:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4146); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1910:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1911:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1911:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1912:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4167);
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
                            	    break loop31;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression4183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1933:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1933:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1933:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1933:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1934:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression4224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1947:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1948:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1948:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1949:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4245);
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

                    otherlv_45=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1969:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1970:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1970:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1971:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4278);
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

                    otherlv_47=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression4290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1999:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2000:2: (iv_ruleCase= ruleCase EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2001:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4327);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4337); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2008:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2011:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2012:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2012:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2012:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleCase4374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2016:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2017:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2017:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2018:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4395);
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

            otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleCase4407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2038:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2039:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2039:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2040:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4428);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2064:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2065:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2066:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4464);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement4474); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2073:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_core_0_0 = null;

        EObject lv_orderby_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2076:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2077:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2077:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2077:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2077:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2078:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2078:1: (lv_core_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2079:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement4520);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2095:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==67) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2095:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleSelectStatement4533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2099:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2100:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2100:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2101:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4554);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2125:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2126:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2127:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList4592);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList4602); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2134:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2137:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2138:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2138:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2138:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2138:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2139:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2139:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2140:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4648);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2156:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==62) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2156:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleOrderingTermList4661); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2160:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2161:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2161:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2162:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4682);
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
            	    break loop35;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2186:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2187:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2188:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore4720);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore4730); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2195:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2198:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2200:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4777);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2208:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=117 && LA36_0<=120)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2208:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2208:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2209:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2214:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2215:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2215:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2216:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore4807);
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2232:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2233:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2233:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2234:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4828);
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
            	    break loop36;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2258:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2259:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2260:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4866);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression4876); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2267:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2270:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2271:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2271:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2271:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2271:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2272:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleSelectExpression4922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2281:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            else if ( (LA37_0==70) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2281:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2281:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2282:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2282:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2283:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,69,FOLLOW_69_in_ruleSelectExpression4941); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2297:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2297:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2298:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2298:1: (lv_all_3_0= 'all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2299:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,70,FOLLOW_70_in_ruleSelectExpression4978); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2312:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_NUMBER)||LA38_0==27||(LA38_0>=52 && LA38_0<=53)||LA38_0==55||(LA38_0>=57 && LA38_0<=59)||LA38_0==63||(LA38_0>=84 && LA38_0<=87)) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2312:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2312:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2313:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2313:1: (lv_allColumns_4_0= '*' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2314:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,21,FOLLOW_21_in_ruleSelectExpression5012); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2328:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2328:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2329:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2329:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2330:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5052);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2346:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==71) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2346:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleSelectExpression5066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2350:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2351:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2351:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2352:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5087);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2368:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==72) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2368:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,72,FOLLOW_72_in_ruleSelectExpression5102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2372:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2373:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2373:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2374:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5123);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2390:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==73) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2390:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_73_in_ruleSelectExpression5138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2394:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2395:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2395:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2396:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5159);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2412:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==74) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2412:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2416:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2417:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2417:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2418:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5195);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2442:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2443:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2444:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5233);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5243); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2451:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2454:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2455:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2455:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2455:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2455:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2456:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2456:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2457:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5289);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2473:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==62) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2473:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleSelectList5302); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2477:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2478:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2478:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2479:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5323);
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
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRuleWhereExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2503:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2504:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2505:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5361);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions5371); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2512:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2515:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2517:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2517:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2518:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5416);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2542:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2543:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2544:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5451);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions5461); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2551:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2554:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2555:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2555:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2555:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2555:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2556:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2556:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2557:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5507);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2573:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==62) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2573:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleGroupByExpressions5520); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2577:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2578:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2578:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2579:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5541);
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
    // $ANTLR end "ruleGroupByExpressions"


    // $ANTLR start "entryRuleHavingExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2603:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2604:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2605:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5579);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions5589); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2612:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2615:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2616:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2616:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2617:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2617:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2618:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions5634);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2642:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2643:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2644:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm5669);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm5679); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2651:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2654:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2655:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2655:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2655:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2655:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2656:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2656:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2657:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm5725);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2673:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2673:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2673:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2674:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2674:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2675:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,75,FOLLOW_75_in_ruleOrderingTerm5744); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2689:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2689:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2690:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2690:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2691:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,76,FOLLOW_76_in_ruleOrderingTerm5781); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2712:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2713:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2714:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource5832);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource5842); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2721:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2724:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2725:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2725:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2725:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2725:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2726:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2726:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2727:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource5888);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2743:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=77 && LA46_0<=78)||(LA46_0>=80 && LA46_0<=82)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2744:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2744:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2745:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource5909);
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
            	    break loop46;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2769:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2770:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2771:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource5946);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource5956); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2778:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2781:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2782:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2782:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==55) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==RULE_ID||LA47_2==55) ) {
                    alt47=3;
                }
                else if ( (LA47_2==68) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2783:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6003);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2793:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6030);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2803:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6057);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2819:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2820:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2821:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6092);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6102); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2828:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2831:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2832:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2832:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2832:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2832:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2833:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2838:2: ( (otherlv_1= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2839:1: (otherlv_1= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2839:1: (otherlv_1= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2840:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2851:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==64) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2851:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleSingleSourceTable6169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2855:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2856:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2856:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2857:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6186); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2881:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2882:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2883:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6229);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6239); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2890:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2893:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2894:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2894:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2894:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2894:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2895:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleSingleSourceSelectStatement6285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2904:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2905:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2905:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2906:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6306);
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

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleSingleSourceSelectStatement6318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2926:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==64) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2926:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleSingleSourceSelectStatement6331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2930:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2931:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2931:1: (lv_name_5_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2932:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6348); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2956:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2957:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2958:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6391);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin6401); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2965:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2968:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2969:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2969:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2969:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleSingleSourceJoin6438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2973:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2974:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2974:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2975:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6459);
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

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleSingleSourceJoin6471); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3003:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3004:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3005:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6507);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement6517); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3012:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3015:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3016:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3016:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3016:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3016:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3017:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3022:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3023:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3023:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3024:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,77,FOLLOW_77_in_ruleJoinStatement6569); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3037:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt52=4;
            switch ( input.LA(1) ) {
                case 78:
                    {
                    alt52=1;
                    }
                    break;
                case 80:
                    {
                    alt52=2;
                    }
                    break;
                case 81:
                    {
                    alt52=3;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3037:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3037:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3037:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3037:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3038:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3038:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3039:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,78,FOLLOW_78_in_ruleJoinStatement6603); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3052:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==79) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3053:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3053:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3054:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,79,FOLLOW_79_in_ruleJoinStatement6634); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3068:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3068:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3069:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3069:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3070:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,80,FOLLOW_80_in_ruleJoinStatement6673); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3084:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3084:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3085:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3085:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3086:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,81,FOLLOW_81_in_ruleJoinStatement6710); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,82,FOLLOW_82_in_ruleJoinStatement6737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3103:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3104:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3104:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3105:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement6758);
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

            otherlv_8=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement6770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3125:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3126:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3126:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3127:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement6791);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3151:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3152:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3153:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn6827);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn6837); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3160:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3163:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3164:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3164:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3164:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3164:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3165:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3170:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3171:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3171:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3172:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn6892);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3188:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==64) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3188:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleResultColumn6905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3192:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3193:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3193:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3194:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn6922); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3218:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3219:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3220:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue6965);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue6975); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3227:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3230:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            int alt54=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 27:
                {
                alt54=1;
                }
                break;
            case RULE_STRING:
                {
                alt54=2;
                }
                break;
            case 84:
                {
                alt54=3;
                }
                break;
            case 85:
                {
                alt54=4;
                }
                break;
            case 86:
                {
                alt54=5;
                }
                break;
            case 87:
                {
                alt54=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3232:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3237:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3238:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3238:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3239:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7031);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3256:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3256:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3256:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3256:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3257:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3262:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3263:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3263:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3264:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7065); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3281:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3281:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3281:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3281:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3282:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3287:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3288:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3288:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3289:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,84,FOLLOW_84_in_ruleLiteralValue7105); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3303:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3303:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3303:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3303:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3304:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3309:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3310:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3310:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3311:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,85,FOLLOW_85_in_ruleLiteralValue7153); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3325:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3325:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3325:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3325:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3326:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3331:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3332:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3332:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3333:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,86,FOLLOW_86_in_ruleLiteralValue7201); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3347:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3347:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3347:7: () ( (lv_literal_11_0= 'current_time_stamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3347:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3348:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3353:2: ( (lv_literal_11_0= 'current_time_stamp' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3354:1: (lv_literal_11_0= 'current_time_stamp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3354:1: (lv_literal_11_0= 'current_time_stamp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3355:3: lv_literal_11_0= 'current_time_stamp'
                    {
                    lv_literal_11_0=(Token)match(input,87,FOLLOW_87_in_ruleLiteralValue7249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_11_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_time_stampKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_11_0, "current_time_stamp");
                      	    
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3376:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3377:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3378:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7299);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7309); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3385:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement ) ;
    public final EObject ruleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTableStatement_0 = null;

        EObject this_CreateViewStatement_1 = null;

        EObject this_CreateTriggerStatement_2 = null;

        EObject this_AlterTableRenameStatement_3 = null;

        EObject this_AlterTableAddColumnStatement_4 = null;

        EObject this_DropTableStatement_5 = null;

        EObject this_DropTriggerStatement_6 = null;

        EObject this_DropViewStatement_7 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3388:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3389:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3389:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )
            int alt55=8;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3390:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7356);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3400:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7383);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3410:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7410);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3420:5: this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7437);
                    this_AlterTableRenameStatement_3=ruleAlterTableRenameStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableRenameStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3430:5: this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7464);
                    this_AlterTableAddColumnStatement_4=ruleAlterTableAddColumnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableAddColumnStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3440:5: this_DropTableStatement_5= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7491);
                    this_DropTableStatement_5=ruleDropTableStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTableStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3450:5: this_DropTriggerStatement_6= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7518);
                    this_DropTriggerStatement_6=ruleDropTriggerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTriggerStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3460:5: this_DropViewStatement_7= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7545);
                    this_DropViewStatement_7=ruleDropViewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropViewStatement_7; 
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3476:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3477:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3478:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement7580);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement7590); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3485:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_columnDefs_5_0 = null;

        EObject lv_columnDefs_7_0 = null;

        EObject lv_constraints_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3488:28: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3489:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3489:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3489:2: () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3489:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3490:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleCreateTableStatement7636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,89,FOLLOW_89_in_ruleCreateTableStatement7648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3503:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3504:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3504:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3505:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement7665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateTableStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTableStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleCreateTableStatement7682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3525:1: ( (lv_columnDefs_5_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3526:1: (lv_columnDefs_5_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3526:1: (lv_columnDefs_5_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3527:3: lv_columnDefs_5_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7703);
            lv_columnDefs_5_0=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
              	        }
                     		add(
                     			current, 
                     			"columnDefs",
                      		lv_columnDefs_5_0, 
                      		"ColumnDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3543:2: (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==62) ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1==RULE_ID) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3543:4: otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_62_in_ruleCreateTableStatement7716); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3547:1: ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3548:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3548:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3549:3: lv_columnDefs_7_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7737);
            	    lv_columnDefs_7_0=ruleColumnDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columnDefs",
            	              		lv_columnDefs_7_0, 
            	              		"ColumnDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3565:4: (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==62) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3565:6: otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    {
            	    otherlv_8=(Token)match(input,62,FOLLOW_62_in_ruleCreateTableStatement7752); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3569:1: ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3570:1: (lv_constraints_9_0= ruleTableConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3570:1: (lv_constraints_9_0= ruleTableConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3571:3: lv_constraints_9_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7773);
            	    lv_constraints_9_0=ruleTableConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_9_0, 
            	              		"TableConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_10=(Token)match(input,56,FOLLOW_56_in_ruleCreateTableStatement7787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_8());
                  
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3599:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3600:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3601:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7823);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement7833); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3608:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_selectStatement_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3611:28: ( ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3612:1: ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3612:1: ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3612:2: () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3612:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3613:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleCreateViewStatement7879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,90,FOLLOW_90_in_ruleCreateViewStatement7891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateViewStatementAccess().getViewKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3626:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3627:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3627:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3628:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement7908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateViewStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleCreateViewStatement7925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateViewStatementAccess().getAsKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3648:1: ( (lv_selectStatement_5_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3649:1: (lv_selectStatement_5_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3649:1: (lv_selectStatement_5_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3650:3: lv_selectStatement_5_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement7946);
            lv_selectStatement_5_0=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateViewStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectStatement",
                      		lv_selectStatement_5_0, 
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3674:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3675:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3676:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement7982);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement7992); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3683:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) ;
    public final EObject ruleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_when_3_1=null;
        Token lv_when_3_2=null;
        Token lv_when_3_3=null;
        Token lv_eventType_4_0=null;
        Token lv_eventType_5_0=null;
        Token lv_eventType_6_0=null;
        Token otherlv_7=null;
        Token lv_updateColumnNames_8_0=null;
        Token otherlv_9=null;
        Token lv_updateColumnNames_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_forEachRow_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_whenExpression_15_0 = null;

        EObject lv_statements_17_0 = null;

        EObject lv_statements_19_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3686:28: ( (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3687:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3687:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3687:3: otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleCreateTriggerStatement8029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateTriggerStatement8041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3695:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3696:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3696:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3697:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getCreateTriggerStatementAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3713:2: ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=92 && LA59_0<=94)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3714:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3714:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3715:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3715:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    int alt58=3;
                    switch ( input.LA(1) ) {
                    case 92:
                        {
                        alt58=1;
                        }
                        break;
                    case 93:
                        {
                        alt58=2;
                        }
                        break;
                    case 94:
                        {
                        alt58=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3716:3: lv_when_3_1= 'before'
                            {
                            lv_when_3_1=(Token)match(input,92,FOLLOW_92_in_ruleCreateTriggerStatement8083); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_3_1, grammarAccess.getCreateTriggerStatementAccess().getWhenBeforeKeyword_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3728:8: lv_when_3_2= 'after'
                            {
                            lv_when_3_2=(Token)match(input,93,FOLLOW_93_in_ruleCreateTriggerStatement8112); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_3_2, grammarAccess.getCreateTriggerStatementAccess().getWhenAfterKeyword_3_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_3_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3740:8: lv_when_3_3= 'instead of'
                            {
                            lv_when_3_3=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement8141); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_3_3, grammarAccess.getCreateTriggerStatementAccess().getWhenInsteadOfKeyword_3_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_3_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3755:3: ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt62=1;
                }
                break;
            case 96:
                {
                alt62=2;
                }
                break;
            case 97:
                {
                alt62=3;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3755:4: ( (lv_eventType_4_0= 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3755:4: ( (lv_eventType_4_0= 'delete' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3756:1: (lv_eventType_4_0= 'delete' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3756:1: (lv_eventType_4_0= 'delete' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3757:3: lv_eventType_4_0= 'delete'
                    {
                    lv_eventType_4_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement8177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_4_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeDeleteKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_4_0, "delete");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3771:6: ( (lv_eventType_5_0= 'insert' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3771:6: ( (lv_eventType_5_0= 'insert' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3772:1: (lv_eventType_5_0= 'insert' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3772:1: (lv_eventType_5_0= 'insert' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3773:3: lv_eventType_5_0= 'insert'
                    {
                    lv_eventType_5_0=(Token)match(input,96,FOLLOW_96_in_ruleCreateTriggerStatement8214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_5_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeInsertKeyword_4_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_5_0, "insert");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3787:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3787:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3787:7: ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3787:7: ( (lv_eventType_6_0= 'update' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3788:1: (lv_eventType_6_0= 'update' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3788:1: (lv_eventType_6_0= 'update' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3789:3: lv_eventType_6_0= 'update'
                    {
                    lv_eventType_6_0=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement8252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_6_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeUpdateKeyword_4_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_6_0, "update");
                      	    
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3802:2: (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==98) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3802:4: otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            {
                            otherlv_7=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8278); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_4_2_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3806:1: ( (lv_updateColumnNames_8_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3807:1: (lv_updateColumnNames_8_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3807:1: (lv_updateColumnNames_8_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3808:3: lv_updateColumnNames_8_0= RULE_ID
                            {
                            lv_updateColumnNames_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8295); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_updateColumnNames_8_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_4_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		addWithLastConsumed(
                                     			current, 
                                     			"updateColumnNames",
                                      		lv_updateColumnNames_8_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3824:2: (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==62) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3824:4: otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,62,FOLLOW_62_in_ruleCreateTriggerStatement8313); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_4_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3828:1: ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3829:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3829:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3830:3: lv_updateColumnNames_10_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8330); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      			newLeafNode(lv_updateColumnNames_10_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_4_2_1_2_1_0()); 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                            	      	        }
                            	             		addWithLastConsumed(
                            	             			current, 
                            	             			"updateColumnNames",
                            	              		lv_updateColumnNames_10_0, 
                            	              		"ID");
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,83,FOLLOW_83_in_ruleCreateTriggerStatement8353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3850:1: ( (otherlv_12= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3851:1: (otherlv_12= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3851:1: (otherlv_12= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3852:3: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_6_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3863:2: ( (lv_forEachRow_13_0= 'for each row' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==99) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3864:1: (lv_forEachRow_13_0= 'for each row' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3864:1: (lv_forEachRow_13_0= 'for each row' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3865:3: lv_forEachRow_13_0= 'for each row'
                    {
                    lv_forEachRow_13_0=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_forEachRow_13_0, grammarAccess.getCreateTriggerStatementAccess().getForEachRowForEachRowKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "forEachRow", lv_forEachRow_13_0, "for each row");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3878:3: (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==65) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3878:5: otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    {
                    otherlv_14=(Token)match(input,65,FOLLOW_65_in_ruleCreateTriggerStatement8418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_8_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3882:1: ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3883:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3883:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3884:3: lv_whenExpression_15_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement8439);
                    lv_whenExpression_15_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whenExpression",
                              		lv_whenExpression_15_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_9());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3904:1: ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==68||(LA66_0>=95 && LA66_0<=97)||LA66_0==113) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3904:2: ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3904:2: ( (lv_statements_17_0= ruleDMLStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3905:1: (lv_statements_17_0= ruleDMLStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3905:1: (lv_statements_17_0= ruleDMLStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3906:3: lv_statements_17_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8475);
                    lv_statements_17_0=ruleDMLStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_17_0, 
                              		"DMLStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleCreateTriggerStatement8487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_10_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3926:1: ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==68||(LA65_0>=95 && LA65_0<=97)||LA65_0==113) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3926:2: ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3926:2: ( (lv_statements_19_0= ruleDMLStatement ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3927:1: (lv_statements_19_0= ruleDMLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3927:1: (lv_statements_19_0= ruleDMLStatement )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3928:3: lv_statements_19_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8509);
                    	    lv_statements_19_0=ruleDMLStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_19_0, 
                    	              		"DMLStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleCreateTriggerStatement8521); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_20, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_10_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,61,FOLLOW_61_in_ruleCreateTriggerStatement8537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getEndKeyword_11());
                  
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3960:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3961:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3962:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement8573);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement8583); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3969:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3972:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3973:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3973:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3973:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3973:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3974:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,101,FOLLOW_101_in_ruleAlterTableRenameStatement8629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,89,FOLLOW_89_in_ruleAlterTableRenameStatement8641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3987:1: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3988:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3988:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3989:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,102,FOLLOW_102_in_ruleAlterTableRenameStatement8673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4004:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4005:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4005:1: (lv_name_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4006:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8690); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4030:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4031:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4032:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement8731);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement8741); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4039:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4042:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4043:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4043:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4043:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleAlterTableAddColumnStatement8778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleAlterTableAddColumnStatement8790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4051:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4052:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4052:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4053:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement8810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,103,FOLLOW_103_in_ruleAlterTableAddColumnStatement8822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4068:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4069:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4069:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4070:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement8843);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4094:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4095:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4096:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement8879);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement8889); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4103:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4106:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4107:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4107:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4107:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleDropTableStatement8926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleDropTableStatement8938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4115:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==105) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4116:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4116:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4117:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,105,FOLLOW_105_in_ruleDropTableStatement8956); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4130:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4131:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4131:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4132:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement8990); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4151:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4152:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4153:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9026);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9036); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4160:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4163:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4164:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4164:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4164:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleDropTriggerStatement9073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleDropTriggerStatement9085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4172:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==105) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4173:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4173:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4174:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,105,FOLLOW_105_in_ruleDropTriggerStatement9103); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4187:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4188:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4188:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4189:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9137); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4208:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4209:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4210:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9173);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9183); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4217:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4220:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4221:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4221:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4221:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleDropViewStatement9220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleDropViewStatement9232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4229:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==105) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4230:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4230:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4231:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,105,FOLLOW_105_in_ruleDropViewStatement9250); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4244:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4245:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4245:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4246:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement9284); if (state.failed) return current;
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


    // $ANTLR start "entryRuleColumnDef"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4265:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4266:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4267:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef9320);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef9330); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4274:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4277:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4278:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4278:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4278:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4278:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4279:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4284:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4285:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4285:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4286:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef9381); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4302:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4303:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4303:1: (lv_type_2_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4304:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef9407);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4320:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==50||LA70_0==106||LA70_0==108) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4321:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4321:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4322:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef9428);
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
            	    break loop70;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4346:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4347:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4348:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint9465);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint9475); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4355:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) ) ;
    public final EObject ruleColumnConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asc_2_0=null;
        Token lv_desc_3_0=null;
        Token lv_autoincrement_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_conflictClause_7_0 = null;

        EObject lv_defaultValue_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4358:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4359:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4359:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt74=1;
                }
                break;
            case 50:
                {
                alt74=2;
                }
                break;
            case 108:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4359:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4359:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4359:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4359:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4360:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,106,FOLLOW_106_in_ruleColumnConstraint9522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4369:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt71=3;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==75) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==76) ) {
                        alt71=2;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4369:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4369:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4370:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4370:1: (lv_asc_2_0= 'asc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4371:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,75,FOLLOW_75_in_ruleColumnConstraint9541); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4385:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4385:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4386:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4386:1: (lv_desc_3_0= 'desc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4387:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,76,FOLLOW_76_in_ruleColumnConstraint9578); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4400:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==107) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4401:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4401:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4402:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,107,FOLLOW_107_in_ruleColumnConstraint9611); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4416:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4416:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4416:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4416:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4417:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleColumnConstraint9654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4426:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==83) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4427:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4427:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4428:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint9675);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4445:6: ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4445:6: ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4445:7: () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4445:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4446:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,108,FOLLOW_108_in_ruleColumnConstraint9705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_2_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4455:1: ( (lv_defaultValue_10_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4456:1: (lv_defaultValue_10_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4456:1: (lv_defaultValue_10_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4457:3: lv_defaultValue_10_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint9726);
                    lv_defaultValue_10_0=ruleDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_10_0, 
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4481:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4482:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4483:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9763);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint9773); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4490:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4493:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4494:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4494:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 109:
                {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 106:
                        {
                        alt75=2;
                        }
                        break;
                    case 111:
                        {
                        alt75=3;
                        }
                        break;
                    case 110:
                        {
                        alt75=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
                }
                break;
            case 110:
                {
                alt75=1;
                }
                break;
            case 106:
                {
                alt75=2;
                }
                break;
            case 111:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4495:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9820);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4505:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint9847);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4515:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint9874);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4531:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4532:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4533:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint9909);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint9919); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4540:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4543:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4544:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4544:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4544:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4544:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==109) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4544:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleUniqueTableConstraint9957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4548:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4549:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4549:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4550:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint9974); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,110,FOLLOW_110_in_ruleUniqueTableConstraint9993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleUniqueTableConstraint10005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4574:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4575:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4575:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4576:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10026);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4592:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==62) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4592:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleUniqueTableConstraint10039); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4596:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4597:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4597:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4598:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10060);
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
            	    break loop77;
                }
            } while (true);

            otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleUniqueTableConstraint10074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4618:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4619:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4619:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4620:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint10095);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4644:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4645:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4646:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint10131);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint10141); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4653:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4656:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4657:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4657:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4657:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4657:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==109) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4657:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,109,FOLLOW_109_in_rulePrimaryConstraint10179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4661:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4662:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4662:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4663:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint10196); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,106,FOLLOW_106_in_rulePrimaryConstraint10215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,55,FOLLOW_55_in_rulePrimaryConstraint10227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4687:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4688:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4688:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4689:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10248);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4705:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==62) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4705:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,62,FOLLOW_62_in_rulePrimaryConstraint10261); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4709:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4710:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4710:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4711:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10282);
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
            	    break loop79;
                }
            } while (true);

            otherlv_7=(Token)match(input,56,FOLLOW_56_in_rulePrimaryConstraint10296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4731:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4732:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4732:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4733:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint10317);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4757:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4758:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4759:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint10353);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint10363); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4766:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4769:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4770:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4770:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4770:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4770:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==109) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4770:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleCheckTableConstraint10401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4774:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4775:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4775:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4776:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint10418); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleCheckTableConstraint10437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleCheckTableConstraint10449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4800:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4801:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4801:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4802:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint10470);
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

            otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleCheckTableConstraint10482); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4830:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4831:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4832:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn10518);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn10528); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4839:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4842:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4843:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4843:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4843:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4843:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4844:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4844:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4845:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn10573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4856:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==75) ) {
                alt81=1;
            }
            else if ( (LA81_0==76) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4856:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4856:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4857:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4857:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4858:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,75,FOLLOW_75_in_ruleIndexedColumn10592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asc_1_0, grammarAccess.getIndexedColumnAccess().getAscAscKeyword_1_0_0());
                          
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4872:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4872:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4873:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4873:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4874:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,76,FOLLOW_76_in_ruleIndexedColumn10629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_desc_2_0, grammarAccess.getIndexedColumnAccess().getDescDescKeyword_1_1_0());
                          
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4895:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4896:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4897:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue10680);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue10690); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4904:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4907:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4908:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4908:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_STRING && LA82_0<=RULE_NUMBER)||LA82_0==27||(LA82_0>=84 && LA82_0<=87)) ) {
                alt82=1;
            }
            else if ( (LA82_0==55) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4908:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4908:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4908:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4908:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4909:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4914:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4915:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4915:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4916:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue10746);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4934:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleDefaultValue10775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4943:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4944:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4944:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4945:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue10796);
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

                    otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleDefaultValue10808); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4973:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4974:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4975:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause10845);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause10855); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4982:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4985:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4986:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4986:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4986:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleConflictClause10892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,112,FOLLOW_112_in_ruleConflictClause10904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4994:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4995:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4995:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4996:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause10925);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5020:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5021:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5022:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement10961);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement10971); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5029:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5032:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5033:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5033:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt83=1;
                }
                break;
            case 96:
            case 113:
                {
                alt83=2;
                }
                break;
            case 97:
                {
                alt83=3;
                }
                break;
            case 95:
                {
                alt83=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5034:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement11018);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5044:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement11045);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5054:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement11072);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5064:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement11099);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5080:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5081:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5082:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement11134);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement11144); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5089:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5092:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5093:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5093:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5093:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleDeleteStatement11181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleDeleteStatement11193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5101:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5102:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5102:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5103:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement11213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5114:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==72) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5114:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_72_in_ruleDeleteStatement11226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5118:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5119:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5119:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5120:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement11247);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5144:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5145:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5146:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement11285);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement11295); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5153:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_columnNames_7_0=null;
        Token otherlv_8=null;
        Token lv_columnNames_9_0=null;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5156:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==96) ) {
                alt86=1;
            }
            else if ( (LA86_0==113) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleInsertStatement11334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5161:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==48) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5161:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleInsertStatement11347); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5165:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5166:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5166:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5167:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement11368);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5184:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,113,FOLLOW_113_in_ruleInsertStatement11389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,114,FOLLOW_114_in_ruleInsertStatement11402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5192:1: ( (otherlv_5= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5193:1: (otherlv_5= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5193:1: (otherlv_5= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5194:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5205:2: (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==55) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5205:4: otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleInsertStatement11435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5209:1: ( (lv_columnNames_7_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5210:1: (lv_columnNames_7_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5210:1: (lv_columnNames_7_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5211:3: lv_columnNames_7_0= RULE_ID
                    {
                    lv_columnNames_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_columnNames_7_0, grammarAccess.getInsertStatementAccess().getColumnNamesIDTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"columnNames",
                              		lv_columnNames_7_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5227:2: (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==62) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5227:4: otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,62,FOLLOW_62_in_ruleInsertStatement11470); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5231:1: ( (lv_columnNames_9_0= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5232:1: (lv_columnNames_9_0= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5232:1: (lv_columnNames_9_0= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5233:3: lv_columnNames_9_0= RULE_ID
                    	    {
                    	    lv_columnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11487); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_columnNames_9_0, grammarAccess.getInsertStatementAccess().getColumnNamesIDTerminalRuleCall_3_2_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"columnNames",
                    	              		lv_columnNames_9_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,56,FOLLOW_56_in_ruleInsertStatement11506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5253:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==68||LA91_0==115) ) {
                alt91=1;
            }
            else if ( (LA91_0==108) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5253:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5253:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==115) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==68) ) {
                        alt90=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5253:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5253:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5253:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,115,FOLLOW_115_in_ruleInsertStatement11523); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,55,FOLLOW_55_in_ruleInsertStatement11535); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5261:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5262:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5262:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5263:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement11556);
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5279:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==62) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5279:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,62,FOLLOW_62_in_ruleInsertStatement11569); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5283:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5284:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5284:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5285:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement11590);
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
                            	    break loop89;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,56,FOLLOW_56_in_ruleInsertStatement11604); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5306:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5306:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5307:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5307:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5308:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement11632);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5325:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5325:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5325:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,108,FOLLOW_108_in_ruleInsertStatement11652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,115,FOLLOW_115_in_ruleInsertStatement11664); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5341:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5342:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5343:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement11702);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement11712); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5350:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5353:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5354:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5354:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5354:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleUpdateStatement11749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5358:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==48) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5358:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleUpdateStatement11762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5362:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5363:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5363:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5364:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11783);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5380:4: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5381:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5381:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5382:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement11805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,116,FOLLOW_116_in_ruleUpdateStatement11817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5397:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5398:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5398:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5399:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11838);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5415:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==62) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5415:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_62_in_ruleUpdateStatement11851); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5419:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5420:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5420:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5421:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11872);
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
            	    break loop93;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5437:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==72) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5437:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,72,FOLLOW_72_in_ruleUpdateStatement11887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5441:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5442:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5442:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5443:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement11908);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5467:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5468:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5469:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression11946);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression11956); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5476:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token lv_columnName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5479:28: ( ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5480:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5480:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5480:2: ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5480:2: ( (lv_columnName_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5481:1: (lv_columnName_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5481:1: (lv_columnName_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5482:3: lv_columnName_0_0= RULE_ID
            {
            lv_columnName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression11998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_columnName_0_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"columnName",
                      		lv_columnName_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleUpdateColumnExpression12015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5502:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5503:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5503:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5504:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression12036);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5528:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5529:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5530:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber12073);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber12084); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5537:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5540:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5541:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5541:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5541:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5541:2: (kw= '-' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==27) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5542:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleSignedNumber12123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber12140); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5562:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5563:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5564:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12186);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12197); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5571:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5574:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5575:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5575:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5575:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5582:1: (kw= '.' this_ID_2= RULE_ID )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==54) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5583:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_54_in_ruleQualifiedName12256); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12271); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop96;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5603:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5605:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5606:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5606:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt97=4;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt97=1;
                }
                break;
            case 118:
                {
                alt97=2;
                }
                break;
            case 119:
                {
                alt97=3;
                }
                break;
            case 120:
                {
                alt97=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5606:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5606:2: (enumLiteral_0= 'union all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5606:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,117,FOLLOW_117_in_ruleCompoundOperator12332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5612:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5612:6: (enumLiteral_1= 'union' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5612:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,118,FOLLOW_118_in_ruleCompoundOperator12349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5618:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5618:6: (enumLiteral_2= 'intersect' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5618:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,119,FOLLOW_119_in_ruleCompoundOperator12366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5624:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5624:6: (enumLiteral_3= 'except' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5624:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,120,FOLLOW_120_in_ruleCompoundOperator12383); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5634:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5636:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5637:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5637:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt98=6;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt98=1;
                }
                break;
            case 122:
                {
                alt98=2;
                }
                break;
            case 123:
                {
                alt98=3;
                }
                break;
            case 124:
                {
                alt98=4;
                }
                break;
            case 125:
                {
                alt98=5;
                }
                break;
            case 126:
                {
                alt98=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5637:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5637:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5637:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_121_in_ruleSqliteDataType12428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5643:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5643:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5643:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_122_in_ruleSqliteDataType12445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5649:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5649:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5649:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_123_in_ruleSqliteDataType12462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5655:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5655:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5655:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_124_in_ruleSqliteDataType12479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5661:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5661:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5661:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,125,FOLLOW_125_in_ruleSqliteDataType12496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5667:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5667:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5667:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,126,FOLLOW_126_in_ruleSqliteDataType12513); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5677:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5679:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5680:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5680:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt99=1;
                }
                break;
            case 122:
                {
                alt99=2;
                }
                break;
            case 123:
                {
                alt99=3;
                }
                break;
            case 124:
                {
                alt99=4;
                }
                break;
            case 127:
                {
                alt99=5;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5680:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5680:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5680:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_121_in_ruleColumnType12558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5686:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5686:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5686:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_122_in_ruleColumnType12575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5692:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5692:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5692:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_123_in_ruleColumnType12592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5698:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5698:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5698:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_124_in_ruleColumnType12609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5704:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5704:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5704:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,127,FOLLOW_127_in_ruleColumnType12626); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5714:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5716:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt100=5;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt100=1;
                }
                break;
            case 129:
                {
                alt100=2;
                }
                break;
            case 130:
                {
                alt100=3;
                }
                break;
            case 131:
                {
                alt100=4;
                }
                break;
            case 113:
                {
                alt100=5;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5717:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_128_in_ruleConflictResolution12671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5723:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5723:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5723:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_129_in_ruleConflictResolution12688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5729:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5729:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5729:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_130_in_ruleConflictResolution12705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5735:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5735:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5735:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,131,FOLLOW_131_in_ruleConflictResolution12722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5741:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5741:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5741:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,113,FOLLOW_113_in_ruleConflictResolution12739); if (state.failed) return current;
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
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1566:5: ( ( RULE_ID ) )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1567:1: ( RULE_ID )
        {
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1567:1: ( RULE_ID )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1568:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel3519); if (state.failed) return ;

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


    protected DFA33 dfa33 = new DFA33(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\3\uffff\1\12\10\uffff";
    static final String DFA33_minS =
        "\1\4\2\uffff\1\22\1\uffff\1\4\6\uffff";
    static final String DFA33_maxS =
        "\1\127\2\uffff\1\170\1\uffff\1\127\6\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\10\1\3\1\5";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\2\4\24\uffff\1\4\30\uffff\1\1\1\2\1\uffff\1\5\1\uffff\2"+
            "\6\1\7\3\uffff\1\10\24\uffff\4\4",
            "",
            "",
            "\1\12\2\uffff\1\12\1\uffff\35\12\2\uffff\1\12\1\11\1\12\3\uffff"+
            "\3\12\1\uffff\4\12\3\uffff\10\12\1\uffff\3\12\21\uffff\1\12"+
            "\20\uffff\4\12",
            "",
            "\3\13\24\uffff\1\13\30\uffff\2\13\1\uffff\1\13\1\uffff\3\13"+
            "\3\uffff\1\13\4\uffff\1\6\17\uffff\4\13",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1512:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) )";
        }
    }
    static final String DFA25_eotS =
        "\115\uffff";
    static final String DFA25_eofS =
        "\1\uffff\1\3\1\42\33\uffff\1\74\56\uffff";
    static final String DFA25_minS =
        "\1\4\1\22\1\4\33\uffff\1\4\36\uffff\1\4\16\uffff\1\0";
    static final String DFA25_maxS =
        "\1\4\2\170\33\uffff\1\170\36\uffff\1\127\16\uffff\1\0";
    static final String DFA25_acceptS =
        "\3\uffff\1\3\32\1\1\uffff\35\1\1\2\1\uffff\16\1\1\uffff";
    static final String DFA25_specialS =
        "\2\uffff\1\1\33\uffff\1\0\55\uffff\1\2}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\3\1\uffff\35\3\2\uffff\1\2\1\uffff\1\3\3\uffff"+
            "\3\3\1\uffff\4\3\3\uffff\10\3\1\uffff\3\3\21\uffff\1\3\20\uffff"+
            "\4\3",
            "\1\74\15\uffff\1\37\2\uffff\1\36\1\uffff\1\61\1\41\1\40\1\34"+
            "\1\35\1\30\1\31\1\32\1\33\1\24\1\25\1\26\1\27\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\10\1\7\1\4\1\5\1"+
            "\6\4\uffff\1\43\3\uffff\1\51\1\45\1\46\1\uffff\1\47\1\44\1\50"+
            "\1\60\3\uffff\1\72\1\64\1\52\1\53\1\62\1\63\1\65\1\66\1\uffff"+
            "\1\67\1\70\1\71\21\uffff\1\73\20\uffff\1\54\1\55\1\56\1\57",
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
            "\1\100\1\102\1\101\13\uffff\1\74\2\uffff\1\74\1\uffff\4\74"+
            "\1\75\30\74\1\76\1\77\1\uffff\1\107\1\74\1\110\1\111\1\112\3"+
            "\74\1\113\4\74\3\uffff\10\74\1\uffff\3\74\1\uffff\1\103\1\104"+
            "\1\105\1\106\14\uffff\1\74\20\uffff\4\74",
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
            "\2\74\1\114\24\uffff\1\74\30\uffff\2\74\1\uffff\1\74\1\uffff"+
            "\3\74\3\uffff\1\74\24\uffff\4\74",
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1566:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_30 = input.LA(1);

                         
                        int index25_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_30==EOF||LA25_30==18||LA25_30==21||(LA25_30>=23 && LA25_30<=26)||(LA25_30>=28 && LA25_30<=51)||LA25_30==56||(LA25_30>=60 && LA25_30<=62)||(LA25_30>=64 && LA25_30<=67)||(LA25_30>=71 && LA25_30<=78)||(LA25_30>=80 && LA25_30<=82)||LA25_30==100||(LA25_30>=117 && LA25_30<=120)) ) {s = 60;}

                        else if ( (LA25_30==27) ) {s = 61;}

                        else if ( (LA25_30==52) && (synpred1_InternalSqliteModel())) {s = 62;}

                        else if ( (LA25_30==53) && (synpred1_InternalSqliteModel())) {s = 63;}

                        else if ( (LA25_30==RULE_ID) && (synpred1_InternalSqliteModel())) {s = 64;}

                        else if ( (LA25_30==RULE_NUMBER) && (synpred1_InternalSqliteModel())) {s = 65;}

                        else if ( (LA25_30==RULE_STRING) && (synpred1_InternalSqliteModel())) {s = 66;}

                        else if ( (LA25_30==84) && (synpred1_InternalSqliteModel())) {s = 67;}

                        else if ( (LA25_30==85) && (synpred1_InternalSqliteModel())) {s = 68;}

                        else if ( (LA25_30==86) && (synpred1_InternalSqliteModel())) {s = 69;}

                        else if ( (LA25_30==87) && (synpred1_InternalSqliteModel())) {s = 70;}

                        else if ( (LA25_30==55) && (synpred1_InternalSqliteModel())) {s = 71;}

                        else if ( (LA25_30==57) && (synpred1_InternalSqliteModel())) {s = 72;}

                        else if ( (LA25_30==58) && (synpred1_InternalSqliteModel())) {s = 73;}

                        else if ( (LA25_30==59) && (synpred1_InternalSqliteModel())) {s = 74;}

                        else if ( (LA25_30==63) && (synpred1_InternalSqliteModel())) {s = 75;}

                         
                        input.seek(index25_30);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_2==49) && (synpred1_InternalSqliteModel())) {s = 4;}

                        else if ( (LA25_2==50) && (synpred1_InternalSqliteModel())) {s = 5;}

                        else if ( (LA25_2==51) && (synpred1_InternalSqliteModel())) {s = 6;}

                        else if ( (LA25_2==48) && (synpred1_InternalSqliteModel())) {s = 7;}

                        else if ( (LA25_2==47) && (synpred1_InternalSqliteModel())) {s = 8;}

                        else if ( (LA25_2==36) && (synpred1_InternalSqliteModel())) {s = 9;}

                        else if ( (LA25_2==37) && (synpred1_InternalSqliteModel())) {s = 10;}

                        else if ( (LA25_2==38) && (synpred1_InternalSqliteModel())) {s = 11;}

                        else if ( (LA25_2==39) && (synpred1_InternalSqliteModel())) {s = 12;}

                        else if ( (LA25_2==40) && (synpred1_InternalSqliteModel())) {s = 13;}

                        else if ( (LA25_2==41) && (synpred1_InternalSqliteModel())) {s = 14;}

                        else if ( (LA25_2==42) && (synpred1_InternalSqliteModel())) {s = 15;}

                        else if ( (LA25_2==43) && (synpred1_InternalSqliteModel())) {s = 16;}

                        else if ( (LA25_2==44) && (synpred1_InternalSqliteModel())) {s = 17;}

                        else if ( (LA25_2==45) && (synpred1_InternalSqliteModel())) {s = 18;}

                        else if ( (LA25_2==46) && (synpred1_InternalSqliteModel())) {s = 19;}

                        else if ( (LA25_2==32) && (synpred1_InternalSqliteModel())) {s = 20;}

                        else if ( (LA25_2==33) && (synpred1_InternalSqliteModel())) {s = 21;}

                        else if ( (LA25_2==34) && (synpred1_InternalSqliteModel())) {s = 22;}

                        else if ( (LA25_2==35) && (synpred1_InternalSqliteModel())) {s = 23;}

                        else if ( (LA25_2==28) && (synpred1_InternalSqliteModel())) {s = 24;}

                        else if ( (LA25_2==29) && (synpred1_InternalSqliteModel())) {s = 25;}

                        else if ( (LA25_2==30) && (synpred1_InternalSqliteModel())) {s = 26;}

                        else if ( (LA25_2==31) && (synpred1_InternalSqliteModel())) {s = 27;}

                        else if ( (LA25_2==26) && (synpred1_InternalSqliteModel())) {s = 28;}

                        else if ( (LA25_2==27) && (synpred1_InternalSqliteModel())) {s = 29;}

                        else if ( (LA25_2==21) ) {s = 30;}

                        else if ( (LA25_2==18) && (synpred1_InternalSqliteModel())) {s = 31;}

                        else if ( (LA25_2==25) && (synpred1_InternalSqliteModel())) {s = 32;}

                        else if ( (LA25_2==24) && (synpred1_InternalSqliteModel())) {s = 33;}

                        else if ( (LA25_2==EOF) && (synpred1_InternalSqliteModel())) {s = 34;}

                        else if ( (LA25_2==56) && (synpred1_InternalSqliteModel())) {s = 35;}

                        else if ( (LA25_2==65) && (synpred1_InternalSqliteModel())) {s = 36;}

                        else if ( (LA25_2==61) && (synpred1_InternalSqliteModel())) {s = 37;}

                        else if ( (LA25_2==62) && (synpred1_InternalSqliteModel())) {s = 38;}

                        else if ( (LA25_2==64) && (synpred1_InternalSqliteModel())) {s = 39;}

                        else if ( (LA25_2==66) && (synpred1_InternalSqliteModel())) {s = 40;}

                        else if ( (LA25_2==60) && (synpred1_InternalSqliteModel())) {s = 41;}

                        else if ( (LA25_2==73) && (synpred1_InternalSqliteModel())) {s = 42;}

                        else if ( (LA25_2==74) && (synpred1_InternalSqliteModel())) {s = 43;}

                        else if ( (LA25_2==117) && (synpred1_InternalSqliteModel())) {s = 44;}

                        else if ( (LA25_2==118) && (synpred1_InternalSqliteModel())) {s = 45;}

                        else if ( (LA25_2==119) && (synpred1_InternalSqliteModel())) {s = 46;}

                        else if ( (LA25_2==120) && (synpred1_InternalSqliteModel())) {s = 47;}

                        else if ( (LA25_2==67) && (synpred1_InternalSqliteModel())) {s = 48;}

                        else if ( (LA25_2==23) && (synpred1_InternalSqliteModel())) {s = 49;}

                        else if ( (LA25_2==75) && (synpred1_InternalSqliteModel())) {s = 50;}

                        else if ( (LA25_2==76) && (synpred1_InternalSqliteModel())) {s = 51;}

                        else if ( (LA25_2==72) && (synpred1_InternalSqliteModel())) {s = 52;}

                        else if ( (LA25_2==77) && (synpred1_InternalSqliteModel())) {s = 53;}

                        else if ( (LA25_2==78) && (synpred1_InternalSqliteModel())) {s = 54;}

                        else if ( (LA25_2==80) && (synpred1_InternalSqliteModel())) {s = 55;}

                        else if ( (LA25_2==81) && (synpred1_InternalSqliteModel())) {s = 56;}

                        else if ( (LA25_2==82) && (synpred1_InternalSqliteModel())) {s = 57;}

                        else if ( (LA25_2==71) && (synpred1_InternalSqliteModel())) {s = 58;}

                        else if ( (LA25_2==100) && (synpred1_InternalSqliteModel())) {s = 59;}

                        else if ( (LA25_2==RULE_ID) ) {s = 60;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_76 = input.LA(1);

                         
                        int index25_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqliteModel()) ) {s = 75;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index25_76);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\16\uffff";
    static final String DFA55_eofS =
        "\16\uffff";
    static final String DFA55_minS =
        "\1\130\3\131\3\uffff\1\4\3\uffff\1\146\2\uffff";
    static final String DFA55_maxS =
        "\1\150\1\133\1\131\1\133\3\uffff\1\4\3\uffff\1\147\2\uffff";
    static final String DFA55_acceptS =
        "\4\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\1\6\1\uffff\1\5\1\4";
    static final String DFA55_specialS =
        "\16\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\14\uffff\1\2\2\uffff\1\3",
            "\1\4\1\5\1\6",
            "\1\7",
            "\1\12\1\11\1\10",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "\1\15\1\14",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3389:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )";
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
    public static final BitSet FOLLOW_14_in_ruleDatabaseBlock281 = new BitSet(new long[]{0x0000000000418000L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_ruleDatabaseBlock302 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock324 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15_in_ruleDatabaseBlock337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigBlock383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConfigBlock429 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfigBlock441 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleConfigurationStatement_in_ruleConfigBlock462 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleConfigBlock475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationStatement_in_entryRuleConfigurationStatement511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationStatement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleConfigurationStatement567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationStatement584 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleContentUri_in_ruleConfigurationStatement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleContentUri693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUri710 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleContentUri728 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri749 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContentUriSegment872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment889 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContentUriSegment906 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleContentUriSegment925 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21_in_ruleContentUriSegment962 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContentUriSegment988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMigrationBlock1081 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock1093 = new BitSet(new long[]{0x0000000000008000L,0x0000012001000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1115 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMigrationBlock1127 = new BitSet(new long[]{0x0000000000008000L,0x0000012001000000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1324 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleExprConcat1351 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1385 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1480 = new BitSet(new long[]{0x0000000002240002L});
    public static final BitSet FOLLOW_21_in_ruleExprMult1509 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_18_in_ruleExprMult1538 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_25_in_ruleExprMult1567 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1604 = new BitSet(new long[]{0x0000000002240002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1699 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleExprAdd1728 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_27_in_ruleExprAdd1757 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1794 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1889 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_28_in_ruleExprBit1918 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_29_in_ruleExprBit1947 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_30_in_ruleExprBit1976 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_31_in_ruleExprBit2005 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2042 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2137 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_32_in_ruleExprRelate2166 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_33_in_ruleExprRelate2195 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_34_in_ruleExprRelate2224 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_35_in_ruleExprRelate2253 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2290 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2385 = new BitSet(new long[]{0x00007FF000000002L});
    public static final BitSet FOLLOW_36_in_ruleExprEqual2414 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_37_in_ruleExprEqual2443 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_38_in_ruleExprEqual2472 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2501 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2530 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2559 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2588 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2617 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2646 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual2675 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual2704 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2741 = new BitSet(new long[]{0x00007FF000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2836 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleExprAnd2863 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2897 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr2992 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprOr3019 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3053 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3148 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression3216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNullExpression3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNullExpression3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNullExpression3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimaryExpression3416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3536 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3576 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3588 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3742 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3763 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3810 = new BitSet(new long[]{0x0480000000000000L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3842 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3889 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3930 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3951 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00002L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression3973 = new BitSet(new long[]{0xBEB0000008000070L,0x0000000000F00002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression3987 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4008 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4056 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression4073 = new BitSet(new long[]{0x8EB0000008200070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4092 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4133 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4146 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4167 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4212 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression4224 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4257 = new BitSet(new long[]{0x0000000000000000L,0x7E00000000000000L});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4278 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCase4374 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleCase4407 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement4520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSelectStatement4533 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList4592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4648 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOrderingTermList4661 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4682 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4777 = new BitSet(new long[]{0x0000000000000002L,0x01E0000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore4807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4828 = new BitSet(new long[]{0x0000000000000002L,0x01E0000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleSelectExpression4922 = new BitSet(new long[]{0x8EB0000008200070L,0x0000000000F00060L});
    public static final BitSet FOLLOW_69_in_ruleSelectExpression4941 = new BitSet(new long[]{0x8EB0000008200070L,0x0000000000F00060L});
    public static final BitSet FOLLOW_70_in_ruleSelectExpression4978 = new BitSet(new long[]{0x8EB0000008200070L,0x0000000000F00060L});
    public static final BitSet FOLLOW_21_in_ruleSelectExpression5012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5052 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_71_in_ruleSelectExpression5066 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5087 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_72_in_ruleSelectExpression5102 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleSelectExpression5138 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5174 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5289 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSelectList5302 = new BitSet(new long[]{0x8EB0000008200070L,0x0000000000F00060L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5323 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5507 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleGroupByExpressions5520 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5541 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm5669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm5725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleOrderingTerm5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOrderingTerm5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource5832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource5888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000076000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource5909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000076000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource5946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6156 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleSingleSourceTable6169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSingleSourceSelectStatement6285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6306 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleSingleSourceSelectStatement6318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleSingleSourceSelectStatement6331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSingleSourceJoin6438 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6459 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleSingleSourceJoin6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJoinStatement6569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000074000L});
    public static final BitSet FOLLOW_78_in_ruleJoinStatement6603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000048000L});
    public static final BitSet FOLLOW_79_in_ruleJoinStatement6634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_80_in_ruleJoinStatement6673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_81_in_ruleJoinStatement6710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleJoinStatement6737 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement6758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement6770 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn6827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn6892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleResultColumn6905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue6965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleLiteralValue7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleLiteralValue7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleLiteralValue7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLiteralValue7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement7580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleCreateTableStatement7636 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleCreateTableStatement7648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement7665 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleCreateTableStatement7682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7703 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCreateTableStatement7716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7737 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCreateTableStatement7752 = new BitSet(new long[]{0x0000000000000000L,0x0000E40000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7773 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCreateTableStatement7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleCreateViewStatement7879 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleCreateViewStatement7891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement7908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleCreateViewStatement7925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement7982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleCreateTriggerStatement8029 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleCreateTriggerStatement8041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8058 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTriggerStatement8083 = new BitSet(new long[]{0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateTriggerStatement8112 = new BitSet(new long[]{0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement8141 = new BitSet(new long[]{0x0000000000000000L,0x0000000380000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement8177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTriggerStatement8214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement8252 = new BitSet(new long[]{0x0000000000000000L,0x0000000400080000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8295 = new BitSet(new long[]{0x4000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_62_in_ruleCreateTriggerStatement8313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8330 = new BitSet(new long[]{0x4000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleCreateTriggerStatement8353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8373 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000002L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8391 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000002L});
    public static final BitSet FOLLOW_65_in_ruleCreateTriggerStatement8418 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement8439 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8453 = new BitSet(new long[]{0x2000000000000000L,0x0002000380000010L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8475 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTriggerStatement8487 = new BitSet(new long[]{0x2000000000000000L,0x0002000380000010L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8509 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTriggerStatement8521 = new BitSet(new long[]{0x2000000000000000L,0x0002000380000010L});
    public static final BitSet FOLLOW_61_in_ruleCreateTriggerStatement8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement8573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleAlterTableRenameStatement8629 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleAlterTableRenameStatement8641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8661 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleAlterTableRenameStatement8673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement8731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleAlterTableAddColumnStatement8778 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleAlterTableAddColumnStatement8790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement8810 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleAlterTableAddColumnStatement8822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement8879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleDropTableStatement8926 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleDropTableStatement8938 = new BitSet(new long[]{0x0000000000000010L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleDropTableStatement8956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement8990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleDropTriggerStatement9073 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleDropTriggerStatement9085 = new BitSet(new long[]{0x0000000000000010L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleDropTriggerStatement9103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleDropViewStatement9220 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleDropViewStatement9232 = new BitSet(new long[]{0x0000000000000010L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleDropViewStatement9250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef9320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef9381 = new BitSet(new long[]{0x0000000000000000L,0x9E00000000000000L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef9407 = new BitSet(new long[]{0x0004000000000002L,0x0000140000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef9428 = new BitSet(new long[]{0x0004000000000002L,0x0000140000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint9465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleColumnConstraint9522 = new BitSet(new long[]{0x0000000000000002L,0x0000080000001800L});
    public static final BitSet FOLLOW_75_in_ruleColumnConstraint9541 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_76_in_ruleColumnConstraint9578 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleColumnConstraint9611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleColumnConstraint9654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleColumnConstraint9705 = new BitSet(new long[]{0x0080000008000060L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint9726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint9874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint9909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint9919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleUniqueTableConstraint9957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint9974 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleUniqueTableConstraint9993 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleUniqueTableConstraint10005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10026 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_62_in_ruleUniqueTableConstraint10039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10060 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleUniqueTableConstraint10074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint10095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint10131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rulePrimaryConstraint10179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint10196 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_rulePrimaryConstraint10215 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryConstraint10227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10248 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryConstraint10261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10282 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryConstraint10296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint10353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleCheckTableConstraint10401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint10418 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleCheckTableConstraint10437 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleCheckTableConstraint10449 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint10470 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCheckTableConstraint10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn10518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn10573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleIndexedColumn10592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleIndexedColumn10629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue10680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue10690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDefaultValue10775 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue10796 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleDefaultValue10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause10845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause10855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleConflictClause10892 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleConflictClause10904 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement10961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement10971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement11018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement11134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement11144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleDeleteStatement11181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleDeleteStatement11193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement11213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleDeleteStatement11226 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement11247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement11285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleInsertStatement11334 = new BitSet(new long[]{0x0001000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInsertStatement11347 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement11368 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_113_in_ruleInsertStatement11389 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleInsertStatement11402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11422 = new BitSet(new long[]{0x0080000000000000L,0x0008100000000010L});
    public static final BitSet FOLLOW_55_in_ruleInsertStatement11435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11452 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_62_in_ruleInsertStatement11470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11487 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleInsertStatement11506 = new BitSet(new long[]{0x0000000000000000L,0x0008100000000010L});
    public static final BitSet FOLLOW_115_in_ruleInsertStatement11523 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInsertStatement11535 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement11556 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_62_in_ruleInsertStatement11569 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement11590 = new BitSet(new long[]{0x4100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleInsertStatement11604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleInsertStatement11652 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleInsertStatement11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement11702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleUpdateStatement11749 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleUpdateStatement11762 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement11805 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleUpdateStatement11817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11838 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_62_in_ruleUpdateStatement11851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11872 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleUpdateStatement11887 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression11946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression11956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression11998 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleUpdateColumnExpression12015 = new BitSet(new long[]{0x8EB0000008000070L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber12073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber12084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSignedNumber12123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber12140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12237 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQualifiedName12256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12271 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_117_in_ruleCompoundOperator12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleCompoundOperator12349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleCompoundOperator12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleCompoundOperator12383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleSqliteDataType12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleSqliteDataType12445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSqliteDataType12462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSqliteDataType12479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleSqliteDataType12496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleSqliteDataType12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleColumnType12558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleColumnType12575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleColumnType12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleColumnType12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleColumnType12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleConflictResolution12671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleConflictResolution12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleConflictResolution12705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleConflictResolution12722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleConflictResolution12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel3519 = new BitSet(new long[]{0x0000000000000002L});

}