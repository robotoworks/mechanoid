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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'action'", "'/'", "':'", "'#'", "'*'", "'migration'", "';'", "'||'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'('", "')'", "'not'", "'exists'", "'case'", "'else'", "'end'", "','", "'cast'", "'as'", "'when'", "'then'", "'order by'", "'select'", "'distinct'", "'all'", "'from'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'primary key'", "'autoincrement'", "'default'", "'constraint'", "'unique'", "'check'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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

                if ( (LA7_0==89||LA7_0==102||LA7_0==105) ) {
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1077:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1080:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1081:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1081:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1082:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1090:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=36 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1090:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1096:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1097:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1097:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1098:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1098:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt17=12;
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
            	    case 47:
            	        {
            	        alt17=12;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1183:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2617); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1195:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2646); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1207:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual2675); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1219:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual2704); if (state.failed) return current;
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
            	            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1231:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual2733); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1246:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1247:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1247:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1248:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2770);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1272:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1273:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1274:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2808);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2818); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1281:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1284:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1285:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1285:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1286:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2865);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1294:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1294:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1294:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1295:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1300:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1301:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1301:1: (lv_op_2_0= 'and' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1302:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,48,FOLLOW_48_in_ruleExprAnd2892); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1315:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1316:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1316:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1317:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2926);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1341:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1342:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1343:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2964);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2974); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1350:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1353:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1354:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1354:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1355:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3021);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1363:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1363:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1363:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1364:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1369:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1370:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1370:1: (lv_op_2_0= 'or' )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1371:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,49,FOLLOW_49_in_ruleExprOr3048); if (state.failed) return current;
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1384:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1385:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1385:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1386:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3082);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1410:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1411:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1412:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3120);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression3130); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1419:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1422:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1423:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1423:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1424:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3177);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1432:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=50 && LA21_0<=52)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1432:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1432:2: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1433:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1438:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1439:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1439:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1440:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3207);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1464:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1465:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1466:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression3245);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression3255); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1473:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1476:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1477:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1477:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=51 && LA23_0<=52)) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1477:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1477:2: ( () otherlv_1= 'is null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1477:3: () otherlv_1= 'is null'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1477:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1478:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleNullExpression3302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1488:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1488:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1488:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1488:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1489:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1494:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==51) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==52) ) {
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1494:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleNullExpression3332); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1499:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleNullExpression3350); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1511:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1512:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1513:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3388);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3398); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1520:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1523:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) )
            int alt33=9;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1524:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1525:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1534:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1535:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1535:1: (otherlv_2= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1536:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1548:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1548:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1548:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1548:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1549:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1558:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1559:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1559:1: (otherlv_5= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1560:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1572:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1572:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1572:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1572:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1573:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1578:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt25=3;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1578:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1578:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1578:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1578:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1578:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1584:1: (otherlv_7= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1585:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3565); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3577); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1601:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1601:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1601:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1601:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1602:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1602:1: (otherlv_9= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1603:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3605); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3617); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1618:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
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
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1618:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1618:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1619:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1619:1: (lv_all_11_0= '*' )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1620:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression3636); if (state.failed) return current;
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
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1634:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1634:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1635:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1635:1: (otherlv_12= RULE_ID )
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1636:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3675); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1648:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1648:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1649:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1649:1: (otherlv_13= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1650:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3703); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1662:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1662:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1662:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1662:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1663:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1668:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1669:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1669:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1670:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3742);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1687:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1687:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1687:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1687:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1688:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1697:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1698:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1698:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1699:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3792);
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

                    otherlv_19=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1720:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1721:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1726:2: ( (lv_not_21_0= 'not' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==58) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1727:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1727:1: (lv_not_21_0= 'not' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1728:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3839); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1741:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==59) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1742:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1742:1: (lv_exists_22_0= 'exists' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1743:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3871); if (state.failed) return current;
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

                    otherlv_23=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1760:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1761:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1761:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1762:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3918);
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

                    otherlv_25=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1783:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1783:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1783:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1783:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1784:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression3959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1793:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_NUMBER)||LA28_0==27||(LA28_0>=53 && LA28_0<=54)||LA28_0==56||(LA28_0>=58 && LA28_0<=60)||LA28_0==64||(LA28_0>=85 && LA28_0<=88)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1794:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1794:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1795:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3980);
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1811:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==66) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1812:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1812:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1813:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4002);
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1829:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==61) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1829:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4016); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1833:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1834:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1834:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1835:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4037);
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

                    otherlv_32=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1856:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1856:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1856:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1856:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1857:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1862:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1863:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1863:1: (lv_name_34_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1864:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4085); if (state.failed) return current;
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

                    otherlv_35=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression4102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1884:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==21) ) {
                        alt32=1;
                    }
                    else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_NUMBER)||LA32_0==27||(LA32_0>=53 && LA32_0<=54)||LA32_0==56||(LA32_0>=58 && LA32_0<=60)||LA32_0==64||(LA32_0>=85 && LA32_0<=88)) ) {
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1884:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1884:2: ( (lv_all_36_0= '*' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1885:1: (lv_all_36_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1885:1: (lv_all_36_0= '*' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1886:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4121); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1900:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1900:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1900:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1900:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1901:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1901:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1902:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4162);
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1918:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==63) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1918:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4175); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1922:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1923:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1923:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1924:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4196);
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

                    otherlv_40=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression4212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1945:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1945:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1945:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1945:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1946:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression4253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1959:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1960:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1960:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1961:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4274);
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

                    otherlv_45=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1981:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1982:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1982:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1983:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4307);
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

                    otherlv_47=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression4319); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2011:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2012:2: (iv_ruleCase= ruleCase EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2013:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase4356);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase4366); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2020:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2023:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2024:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2024:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2024:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleCase4403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2028:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2029:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2029:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2030:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4424);
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

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleCase4436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2050:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2051:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2051:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2052:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase4457);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2076:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2077:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2078:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4493);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement4503); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2085:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_core_0_0 = null;

        EObject lv_orderby_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2088:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2089:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2089:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2089:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2089:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2090:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2090:1: (lv_core_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2091:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement4549);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2107:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==68) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2107:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleSelectStatement4562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2111:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2112:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2112:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2113:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4583);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2137:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2138:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2139:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList4621);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList4631); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2146:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2149:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2150:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2150:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2150:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2150:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2151:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2151:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2152:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4677);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2168:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==63) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2168:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleOrderingTermList4690); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2172:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2173:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2173:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2174:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4711);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2198:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2200:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore4749);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore4759); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2207:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2210:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2211:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2211:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2212:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4806);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2220:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=118 && LA36_0<=121)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2220:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2220:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2221:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2226:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2227:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2227:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2228:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore4836);
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2244:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2245:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2245:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2246:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4857);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2270:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2271:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2272:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4895);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression4905); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2279:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2282:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2283:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2283:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2283:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2283:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2284:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleSelectExpression4951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2293:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==70) ) {
                alt37=1;
            }
            else if ( (LA37_0==71) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2293:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2293:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2294:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2294:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2295:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,70,FOLLOW_70_in_ruleSelectExpression4970); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2309:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2309:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2310:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2310:1: (lv_all_3_0= 'all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2311:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,71,FOLLOW_71_in_ruleSelectExpression5007); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2324:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_NUMBER)||LA38_0==27||(LA38_0>=53 && LA38_0<=54)||LA38_0==56||(LA38_0>=58 && LA38_0<=60)||LA38_0==64||(LA38_0>=85 && LA38_0<=88)) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2324:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2324:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2325:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2325:1: (lv_allColumns_4_0= '*' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2326:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,21,FOLLOW_21_in_ruleSelectExpression5041); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2340:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2340:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2341:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2341:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2342:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5081);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2358:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==72) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2358:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleSelectExpression5095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2362:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2363:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2363:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2364:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5116);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2380:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==73) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2380:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,73,FOLLOW_73_in_ruleSelectExpression5131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2384:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2385:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2385:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2386:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5152);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2402:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==74) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2402:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2406:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2407:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2407:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2408:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5188);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2424:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==75) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2424:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2428:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2429:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2429:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2430:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5224);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2454:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2455:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2456:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5262);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5272); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2463:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2466:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2467:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2467:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2467:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2467:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2468:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2468:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2469:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5318);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2485:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==63) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2485:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleSelectList5331); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2489:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2490:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2490:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2491:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5352);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2515:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2517:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5390);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions5400); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2524:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2527:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2528:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2528:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2529:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2529:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2530:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5445);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2554:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2555:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2556:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5480);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions5490); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2563:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2566:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2567:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2567:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2567:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2567:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2568:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2568:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2569:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5536);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2585:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==63) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2585:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleGroupByExpressions5549); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2589:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2590:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2590:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2591:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5570);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2615:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2616:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2617:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5608);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions5618); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2624:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2627:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2628:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2628:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2629:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2629:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2630:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions5663);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2654:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2655:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2656:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm5698);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm5708); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2663:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2666:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2667:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2667:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2667:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2667:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2668:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2668:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2669:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm5754);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2685:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==76) ) {
                alt45=1;
            }
            else if ( (LA45_0==77) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2685:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2685:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2686:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2686:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2687:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,76,FOLLOW_76_in_ruleOrderingTerm5773); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2701:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2701:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2702:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2702:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2703:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,77,FOLLOW_77_in_ruleOrderingTerm5810); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2724:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2725:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2726:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource5861);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource5871); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2733:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2736:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2737:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2737:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2737:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2737:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2738:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2738:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2739:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource5917);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2755:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=78 && LA46_0<=79)||(LA46_0>=81 && LA46_0<=83)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2756:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2756:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2757:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource5938);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2781:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2782:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2783:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource5975);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource5985); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2790:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2793:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2794:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2794:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==56) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==RULE_ID||LA47_2==56) ) {
                    alt47=3;
                }
                else if ( (LA47_2==69) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2795:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6032);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2805:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6059);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2815:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6086);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2831:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2832:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2833:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6121);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6131); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2840:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2843:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2844:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2844:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2844:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2844:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2845:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2850:2: ( (otherlv_1= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2851:1: (otherlv_1= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2851:1: (otherlv_1= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2852:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2863:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2863:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleSingleSourceTable6198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2867:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2868:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2868:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2869:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6215); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2893:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2894:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2895:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6258);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6268); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2902:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2905:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2906:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2906:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2906:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2906:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2907:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleSingleSourceSelectStatement6314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2916:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2917:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2917:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2918:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6335);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleSingleSourceSelectStatement6347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2938:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==65) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2938:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleSingleSourceSelectStatement6360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2942:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2943:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2943:1: (lv_name_5_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2944:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6377); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2968:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2969:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2970:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6420);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin6430); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2977:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2980:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2981:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2981:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2981:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleSingleSourceJoin6467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2985:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2986:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2986:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2987:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6488);
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

            otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleSingleSourceJoin6500); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3015:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3016:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3017:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6536);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement6546); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3024:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3027:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3028:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3028:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3028:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3028:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3029:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3034:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==78) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3035:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3035:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3036:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,78,FOLLOW_78_in_ruleJoinStatement6598); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt52=4;
            switch ( input.LA(1) ) {
                case 79:
                    {
                    alt52=1;
                    }
                    break;
                case 81:
                    {
                    alt52=2;
                    }
                    break;
                case 82:
                    {
                    alt52=3;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3049:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3050:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3050:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3051:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,79,FOLLOW_79_in_ruleJoinStatement6632); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3064:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==80) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3065:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3065:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3066:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,80,FOLLOW_80_in_ruleJoinStatement6663); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3080:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3080:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3081:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3081:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3082:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,81,FOLLOW_81_in_ruleJoinStatement6702); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3096:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3096:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3097:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3097:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3098:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,82,FOLLOW_82_in_ruleJoinStatement6739); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement6766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3115:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3116:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3116:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3117:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement6787);
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

            otherlv_8=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement6799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3137:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3138:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3138:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3139:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement6820);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3163:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3164:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3165:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn6856);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn6866); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3172:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3175:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3176:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3176:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3176:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3176:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3177:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3182:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3183:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3183:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3184:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn6921);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3200:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==65) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3200:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleResultColumn6934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3204:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3205:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3205:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3206:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn6951); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3230:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3232:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue6994);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue7004); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3239:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3242:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3243:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3243:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
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
            case 85:
                {
                alt54=3;
                }
                break;
            case 86:
                {
                alt54=4;
                }
                break;
            case 87:
                {
                alt54=5;
                }
                break;
            case 88:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3243:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3243:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3243:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3243:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3244:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3249:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3250:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3250:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3251:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7060);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3268:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3268:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3268:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3268:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3269:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3274:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3275:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3275:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3276:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7094); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3294:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3299:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3300:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3300:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3301:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,85,FOLLOW_85_in_ruleLiteralValue7134); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3315:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3315:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3315:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3315:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3316:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3321:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3322:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3322:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3323:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,86,FOLLOW_86_in_ruleLiteralValue7182); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3337:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3337:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3337:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3337:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3338:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3343:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3344:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3344:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3345:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,87,FOLLOW_87_in_ruleLiteralValue7230); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3359:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3359:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3359:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3359:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3360:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3365:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3366:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3366:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3367:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,88,FOLLOW_88_in_ruleLiteralValue7278); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3388:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3389:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3390:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7328);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7338); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3397:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3400:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3401:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3401:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )
            int alt55=8;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3402:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7385);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3412:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7412);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3422:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7439);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3432:5: this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7466);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3442:5: this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7493);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3452:5: this_DropTableStatement_5= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7520);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3462:5: this_DropTriggerStatement_6= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7547);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3472:5: this_DropViewStatement_7= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7574);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3488:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3489:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3490:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement7609);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement7619); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3497:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3500:28: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3501:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3501:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3501:2: () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3501:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3502:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleCreateTableStatement7665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,90,FOLLOW_90_in_ruleCreateTableStatement7677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3515:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3516:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3516:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3517:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement7694); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleCreateTableStatement7711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3537:1: ( (lv_columnDefs_5_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3538:1: (lv_columnDefs_5_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3538:1: (lv_columnDefs_5_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3539:3: lv_columnDefs_5_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7732);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:2: (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==63) ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1==RULE_ID) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3555:4: otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    {
            	    otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleCreateTableStatement7745); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3559:1: ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3560:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3560:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3561:3: lv_columnDefs_7_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7766);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3577:4: (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==63) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3577:6: otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    {
            	    otherlv_8=(Token)match(input,63,FOLLOW_63_in_ruleCreateTableStatement7781); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3581:1: ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3582:1: (lv_constraints_9_0= ruleTableConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3582:1: (lv_constraints_9_0= ruleTableConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3583:3: lv_constraints_9_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7802);
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

            otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleCreateTableStatement7816); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3611:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3612:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3613:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7852);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement7862); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3620:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_selectStatement_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3623:28: ( ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3624:1: ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3624:1: ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3624:2: () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3624:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3625:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleCreateViewStatement7908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,91,FOLLOW_91_in_ruleCreateViewStatement7920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateViewStatementAccess().getViewKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3638:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3639:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3639:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3640:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement7937); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleCreateViewStatement7954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateViewStatementAccess().getAsKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3660:1: ( (lv_selectStatement_5_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3661:1: (lv_selectStatement_5_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3661:1: (lv_selectStatement_5_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3662:3: lv_selectStatement_5_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement7975);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3686:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3687:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3688:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8011);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement8021); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3695:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3698:28: ( (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3699:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3699:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3699:3: otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleCreateTriggerStatement8058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleCreateTriggerStatement8070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3707:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3708:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3708:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3709:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8087); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3725:2: ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=93 && LA59_0<=95)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3726:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3726:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3727:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3727:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    int alt58=3;
                    switch ( input.LA(1) ) {
                    case 93:
                        {
                        alt58=1;
                        }
                        break;
                    case 94:
                        {
                        alt58=2;
                        }
                        break;
                    case 95:
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3728:3: lv_when_3_1= 'before'
                            {
                            lv_when_3_1=(Token)match(input,93,FOLLOW_93_in_ruleCreateTriggerStatement8112); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3740:8: lv_when_3_2= 'after'
                            {
                            lv_when_3_2=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement8141); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3752:8: lv_when_3_3= 'instead of'
                            {
                            lv_when_3_3=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement8170); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3767:3: ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt62=1;
                }
                break;
            case 97:
                {
                alt62=2;
                }
                break;
            case 98:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3767:4: ( (lv_eventType_4_0= 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3767:4: ( (lv_eventType_4_0= 'delete' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3768:1: (lv_eventType_4_0= 'delete' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3768:1: (lv_eventType_4_0= 'delete' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3769:3: lv_eventType_4_0= 'delete'
                    {
                    lv_eventType_4_0=(Token)match(input,96,FOLLOW_96_in_ruleCreateTriggerStatement8206); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3783:6: ( (lv_eventType_5_0= 'insert' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3783:6: ( (lv_eventType_5_0= 'insert' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3784:1: (lv_eventType_5_0= 'insert' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3784:1: (lv_eventType_5_0= 'insert' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3785:3: lv_eventType_5_0= 'insert'
                    {
                    lv_eventType_5_0=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement8243); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3799:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3799:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3799:7: ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3799:7: ( (lv_eventType_6_0= 'update' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3800:1: (lv_eventType_6_0= 'update' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3800:1: (lv_eventType_6_0= 'update' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3801:3: lv_eventType_6_0= 'update'
                    {
                    lv_eventType_6_0=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8281); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3814:2: (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==99) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3814:4: otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            {
                            otherlv_7=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8307); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_4_2_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3818:1: ( (lv_updateColumnNames_8_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3819:1: (lv_updateColumnNames_8_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3819:1: (lv_updateColumnNames_8_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3820:3: lv_updateColumnNames_8_0= RULE_ID
                            {
                            lv_updateColumnNames_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8324); if (state.failed) return current;
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3836:2: (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==63) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3836:4: otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,63,FOLLOW_63_in_ruleCreateTriggerStatement8342); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_4_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3840:1: ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3841:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3841:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3842:3: lv_updateColumnNames_10_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8359); if (state.failed) return current;
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

            otherlv_11=(Token)match(input,84,FOLLOW_84_in_ruleCreateTriggerStatement8382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3862:1: ( (otherlv_12= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3863:1: (otherlv_12= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3863:1: (otherlv_12= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3864:3: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_6_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3875:2: ( (lv_forEachRow_13_0= 'for each row' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==100) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3876:1: (lv_forEachRow_13_0= 'for each row' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3876:1: (lv_forEachRow_13_0= 'for each row' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3877:3: lv_forEachRow_13_0= 'for each row'
                    {
                    lv_forEachRow_13_0=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8420); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3890:3: (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==66) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3890:5: otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    {
                    otherlv_14=(Token)match(input,66,FOLLOW_66_in_ruleCreateTriggerStatement8447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_8_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3894:1: ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3895:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3895:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3896:3: lv_whenExpression_15_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement8468);
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

            otherlv_16=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement8482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_9());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3916:1: ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==69||(LA66_0>=96 && LA66_0<=98)||LA66_0==114) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3916:2: ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3916:2: ( (lv_statements_17_0= ruleDMLStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3917:1: (lv_statements_17_0= ruleDMLStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3917:1: (lv_statements_17_0= ruleDMLStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3918:3: lv_statements_17_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8504);
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

                    otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleCreateTriggerStatement8516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_10_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3938:1: ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==69||(LA65_0>=96 && LA65_0<=98)||LA65_0==114) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3938:2: ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3938:2: ( (lv_statements_19_0= ruleDMLStatement ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3939:1: (lv_statements_19_0= ruleDMLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3939:1: (lv_statements_19_0= ruleDMLStatement )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3940:3: lv_statements_19_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8538);
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

                    	    otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleCreateTriggerStatement8550); if (state.failed) return current;
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

            otherlv_21=(Token)match(input,62,FOLLOW_62_in_ruleCreateTriggerStatement8566); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3972:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3973:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3974:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement8602);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement8612); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3981:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3984:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3985:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3985:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3985:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3985:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3986:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,102,FOLLOW_102_in_ruleAlterTableRenameStatement8658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,90,FOLLOW_90_in_ruleAlterTableRenameStatement8670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3999:1: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4000:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4000:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4001:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,103,FOLLOW_103_in_ruleAlterTableRenameStatement8702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4016:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4017:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4017:1: (lv_name_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4018:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8719); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4042:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4043:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4044:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement8760);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement8770); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4051:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4054:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4055:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4055:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4055:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleAlterTableAddColumnStatement8807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleAlterTableAddColumnStatement8819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4063:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4064:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4064:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4065:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement8839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,104,FOLLOW_104_in_ruleAlterTableAddColumnStatement8851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4080:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4081:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4081:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4082:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement8872);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4106:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4107:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4108:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement8908);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement8918); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4115:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4118:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4119:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4119:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4119:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleDropTableStatement8955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleDropTableStatement8967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4127:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==106) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4128:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4128:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4129:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,106,FOLLOW_106_in_ruleDropTableStatement8985); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4142:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4143:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4143:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4144:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement9019); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4163:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4164:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4165:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9055);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9065); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4172:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4175:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleDropTriggerStatement9102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleDropTriggerStatement9114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4184:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==106) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4185:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4185:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4186:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,106,FOLLOW_106_in_ruleDropTriggerStatement9132); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4199:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4200:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4200:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4201:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9166); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4220:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4221:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4222:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9202);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9212); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4229:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4232:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4233:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4233:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4233:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleDropViewStatement9249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleDropViewStatement9261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4241:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==106) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4242:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4242:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4243:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,106,FOLLOW_106_in_ruleDropViewStatement9279); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4256:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4257:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4257:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4258:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement9313); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4277:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4278:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4279:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef9349);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef9359); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4286:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4289:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4290:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4290:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4290:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4290:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4291:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4296:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4297:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4297:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4298:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef9410); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4314:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4315:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4315:1: (lv_type_2_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4316:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef9436);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4332:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==51||LA70_0==107||LA70_0==109) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4333:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4333:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4334:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef9457);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4358:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4359:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4360:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint9494);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint9504); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4367:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4370:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4371:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4371:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt74=1;
                }
                break;
            case 51:
                {
                alt74=2;
                }
                break;
            case 109:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4371:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4371:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4371:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4371:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4372:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,107,FOLLOW_107_in_ruleColumnConstraint9551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4381:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt71=3;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==76) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==77) ) {
                        alt71=2;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4381:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4381:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4382:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4382:1: (lv_asc_2_0= 'asc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4383:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,76,FOLLOW_76_in_ruleColumnConstraint9570); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4397:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4397:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4398:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4398:1: (lv_desc_3_0= 'desc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4399:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,77,FOLLOW_77_in_ruleColumnConstraint9607); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4412:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==108) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4413:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4413:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4414:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,108,FOLLOW_108_in_ruleColumnConstraint9640); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4428:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4428:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4428:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4428:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4429:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleColumnConstraint9683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4438:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==84) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4439:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4439:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4440:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint9704);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4457:6: ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4457:6: ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4457:7: () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4457:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4458:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,109,FOLLOW_109_in_ruleColumnConstraint9734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_2_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4467:1: ( (lv_defaultValue_10_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4468:1: (lv_defaultValue_10_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4468:1: (lv_defaultValue_10_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4469:3: lv_defaultValue_10_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint9755);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4493:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4494:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4495:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9792);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint9802); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4502:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4505:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4506:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4506:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 107:
                        {
                        alt75=2;
                        }
                        break;
                    case 111:
                        {
                        alt75=1;
                        }
                        break;
                    case 112:
                        {
                        alt75=3;
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
            case 111:
                {
                alt75=1;
                }
                break;
            case 107:
                {
                alt75=2;
                }
                break;
            case 112:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4507:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9849);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4517:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint9876);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4527:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint9903);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4543:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4544:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4545:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint9938);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint9948); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4552:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4555:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4556:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4556:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4556:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4556:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==110) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4556:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleUniqueTableConstraint9986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4560:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4561:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4561:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4562:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint10003); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleUniqueTableConstraint10022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleUniqueTableConstraint10034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4586:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4587:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4587:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4588:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10055);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4604:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==63) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4604:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,63,FOLLOW_63_in_ruleUniqueTableConstraint10068); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4608:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4609:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4609:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4610:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10089);
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

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleUniqueTableConstraint10103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4630:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4631:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4631:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4632:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint10124);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4656:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4657:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4658:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint10160);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint10170); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4665:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4668:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4669:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4669:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4669:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4669:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==110) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4669:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,110,FOLLOW_110_in_rulePrimaryConstraint10208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4673:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4674:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4674:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4675:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint10225); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,107,FOLLOW_107_in_rulePrimaryConstraint10244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,56,FOLLOW_56_in_rulePrimaryConstraint10256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4699:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4700:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4700:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4701:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10277);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4717:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==63) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4717:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,63,FOLLOW_63_in_rulePrimaryConstraint10290); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4721:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4722:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4722:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4723:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10311);
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

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_rulePrimaryConstraint10325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4743:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4744:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4744:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4745:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint10346);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4769:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4770:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4771:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint10382);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint10392); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4778:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4781:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4782:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4782:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4782:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4782:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==110) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4782:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleCheckTableConstraint10430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4786:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4787:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4787:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4788:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint10447); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,112,FOLLOW_112_in_ruleCheckTableConstraint10466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleCheckTableConstraint10478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4812:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4813:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4813:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4814:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint10499);
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

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleCheckTableConstraint10511); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4842:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4843:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4844:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn10547);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn10557); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4851:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4854:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4855:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4856:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4856:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4857:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn10602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4868:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==76) ) {
                alt81=1;
            }
            else if ( (LA81_0==77) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4868:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4868:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4869:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4869:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4870:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,76,FOLLOW_76_in_ruleIndexedColumn10621); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4884:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4884:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4885:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4885:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4886:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,77,FOLLOW_77_in_ruleIndexedColumn10658); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4907:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4908:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4909:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue10709);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue10719); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4916:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4919:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_STRING && LA82_0<=RULE_NUMBER)||LA82_0==27||(LA82_0>=85 && LA82_0<=88)) ) {
                alt82=1;
            }
            else if ( (LA82_0==56) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4921:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4926:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4927:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4927:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4928:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue10775);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4945:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4945:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4945:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4945:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4946:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleDefaultValue10804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4955:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4956:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4956:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4957:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue10825);
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

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleDefaultValue10837); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4985:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4986:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4987:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause10874);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause10884); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4994:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4997:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleConflictClause10921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,113,FOLLOW_113_in_ruleConflictClause10933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5006:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5007:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5007:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5008:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause10954);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5032:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5033:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5034:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement10990);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement11000); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5041:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5044:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5045:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5045:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt83=1;
                }
                break;
            case 97:
            case 114:
                {
                alt83=2;
                }
                break;
            case 98:
                {
                alt83=3;
                }
                break;
            case 96:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5046:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement11047);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5056:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement11074);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5066:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement11101);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5076:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement11128);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5092:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5093:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5094:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement11163);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement11173); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5101:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5104:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5105:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5105:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5105:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleDeleteStatement11210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleDeleteStatement11222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5113:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5114:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5114:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5115:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement11242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5126:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==73) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5126:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleDeleteStatement11255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5130:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5131:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5131:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5132:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement11276);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5156:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5157:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5158:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement11314);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement11324); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5165:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5168:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5169:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5169:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5169:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5169:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==97) ) {
                alt86=1;
            }
            else if ( (LA86_0==114) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5169:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5169:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5169:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleInsertStatement11363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5173:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==49) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5173:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleInsertStatement11376); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5177:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5178:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5178:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5179:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement11397);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5196:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,114,FOLLOW_114_in_ruleInsertStatement11418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,115,FOLLOW_115_in_ruleInsertStatement11431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5204:1: ( (otherlv_5= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5205:1: (otherlv_5= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5205:1: (otherlv_5= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5206:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5217:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==56) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5217:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleInsertStatement11464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5221:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5222:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5222:1: (otherlv_7= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5223:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5234:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==63) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5234:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,63,FOLLOW_63_in_ruleInsertStatement11497); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5238:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5239:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5239:1: (otherlv_9= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5240:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11517); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleInsertStatement11531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==69||LA91_0==116) ) {
                alt91=1;
            }
            else if ( (LA91_0==109) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==116) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==69) ) {
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,116,FOLLOW_116_in_ruleInsertStatement11548); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,56,FOLLOW_56_in_ruleInsertStatement11560); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5263:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5264:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5264:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5265:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement11581);
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5281:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==63) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5281:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,63,FOLLOW_63_in_ruleInsertStatement11594); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5285:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5286:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5286:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5287:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement11615);
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

                            otherlv_16=(Token)match(input,57,FOLLOW_57_in_ruleInsertStatement11629); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5308:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5308:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5309:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5309:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5310:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement11657);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5327:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5327:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5327:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,109,FOLLOW_109_in_ruleInsertStatement11677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,116,FOLLOW_116_in_ruleInsertStatement11689); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5343:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5344:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5345:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement11727);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement11737); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5352:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5355:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5356:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5356:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5356:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,98,FOLLOW_98_in_ruleUpdateStatement11774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5360:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==49) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5360:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleUpdateStatement11787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5364:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5365:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5365:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5366:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11808);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5382:4: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5383:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5383:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5384:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement11830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,117,FOLLOW_117_in_ruleUpdateStatement11842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5399:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5400:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5400:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5401:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11863);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5417:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==63) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5417:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleUpdateStatement11876); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5421:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5422:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5422:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5423:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11897);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5439:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==73) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5439:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,73,FOLLOW_73_in_ruleUpdateStatement11912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5443:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5444:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5444:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5445:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement11933);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5469:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5470:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5471:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression11971);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression11981); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5478:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5481:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5482:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5482:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5482:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5482:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5483:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5483:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5484:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression12026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleUpdateColumnExpression12038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5499:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5500:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5500:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5501:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression12059);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5525:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5526:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5527:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber12096);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber12107); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5534:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5537:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5538:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5538:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5538:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5538:2: (kw= '-' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==27) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5539:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleSignedNumber12146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber12163); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5559:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5560:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5561:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12209);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12220); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5568:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5571:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5572:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5572:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5572:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5579:1: (kw= '.' this_ID_2= RULE_ID )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==55) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5580:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleQualifiedName12279); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12294); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5600:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5602:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5603:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5603:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt97=4;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt97=1;
                }
                break;
            case 119:
                {
                alt97=2;
                }
                break;
            case 120:
                {
                alt97=3;
                }
                break;
            case 121:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5603:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5603:2: (enumLiteral_0= 'union all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5603:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_118_in_ruleCompoundOperator12355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5609:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5609:6: (enumLiteral_1= 'union' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5609:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_119_in_ruleCompoundOperator12372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5615:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5615:6: (enumLiteral_2= 'intersect' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5615:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_120_in_ruleCompoundOperator12389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5621:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5621:6: (enumLiteral_3= 'except' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5621:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,121,FOLLOW_121_in_ruleCompoundOperator12406); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5631:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5633:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5634:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5634:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt98=6;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt98=1;
                }
                break;
            case 123:
                {
                alt98=2;
                }
                break;
            case 124:
                {
                alt98=3;
                }
                break;
            case 125:
                {
                alt98=4;
                }
                break;
            case 126:
                {
                alt98=5;
                }
                break;
            case 127:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5634:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5634:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5634:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,122,FOLLOW_122_in_ruleSqliteDataType12451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5640:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5640:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5640:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,123,FOLLOW_123_in_ruleSqliteDataType12468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5646:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5646:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5646:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,124,FOLLOW_124_in_ruleSqliteDataType12485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5652:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5652:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5652:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,125,FOLLOW_125_in_ruleSqliteDataType12502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5658:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5658:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5658:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,126,FOLLOW_126_in_ruleSqliteDataType12519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5664:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5664:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5664:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,127,FOLLOW_127_in_ruleSqliteDataType12536); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5674:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5676:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5677:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5677:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt99=1;
                }
                break;
            case 123:
                {
                alt99=2;
                }
                break;
            case 124:
                {
                alt99=3;
                }
                break;
            case 125:
                {
                alt99=4;
                }
                break;
            case 128:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5677:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5677:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5677:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,122,FOLLOW_122_in_ruleColumnType12581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5683:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5683:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5683:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,123,FOLLOW_123_in_ruleColumnType12598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5689:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5689:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5689:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,124,FOLLOW_124_in_ruleColumnType12615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5695:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5695:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5695:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,125,FOLLOW_125_in_ruleColumnType12632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5701:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5701:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5701:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,128,FOLLOW_128_in_ruleColumnType12649); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5711:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5713:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5714:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5714:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt100=5;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt100=1;
                }
                break;
            case 130:
                {
                alt100=2;
                }
                break;
            case 131:
                {
                alt100=3;
                }
                break;
            case 132:
                {
                alt100=4;
                }
                break;
            case 114:
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5714:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5714:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5714:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,129,FOLLOW_129_in_ruleConflictResolution12694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5720:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5720:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5720:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,130,FOLLOW_130_in_ruleConflictResolution12711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5726:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5726:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5726:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,131,FOLLOW_131_in_ruleConflictResolution12728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5732:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5732:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5732:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,132,FOLLOW_132_in_ruleConflictResolution12745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5738:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5738:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5738:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,114,FOLLOW_114_in_ruleConflictResolution12762); if (state.failed) return current;
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
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1578:5: ( ( RULE_ID ) )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1579:1: ( RULE_ID )
        {
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1579:1: ( RULE_ID )
        // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:1580:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel3548); if (state.failed) return ;

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
        "\3\uffff\1\11\10\uffff";
    static final String DFA33_minS =
        "\1\4\2\uffff\1\22\1\uffff\1\4\6\uffff";
    static final String DFA33_maxS =
        "\1\130\2\uffff\1\171\1\uffff\1\130\6\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\3\1\10\1\5";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\2\4\24\uffff\1\4\31\uffff\1\1\1\2\1\uffff\1\5\1\uffff\2"+
            "\6\1\7\3\uffff\1\10\24\uffff\4\4",
            "",
            "",
            "\1\11\2\uffff\1\11\1\uffff\36\11\2\uffff\1\11\1\12\1\11\3\uffff"+
            "\3\11\1\uffff\4\11\3\uffff\10\11\1\uffff\3\11\21\uffff\1\11"+
            "\20\uffff\4\11",
            "",
            "\3\13\24\uffff\1\13\31\uffff\2\13\1\uffff\1\13\1\uffff\3\13"+
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
            return "1524:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) )";
        }
    }
    static final String DFA25_eotS =
        "\116\uffff";
    static final String DFA25_eofS =
        "\1\uffff\1\3\1\43\34\uffff\1\75\56\uffff";
    static final String DFA25_minS =
        "\1\4\1\22\1\4\34\uffff\1\4\36\uffff\1\4\16\uffff\1\0";
    static final String DFA25_maxS =
        "\1\4\2\171\34\uffff\1\171\36\uffff\1\130\16\uffff\1\0";
    static final String DFA25_acceptS =
        "\3\uffff\1\3\33\1\1\uffff\35\1\1\2\1\uffff\16\1\1\uffff";
    static final String DFA25_specialS =
        "\2\uffff\1\0\34\uffff\1\1\55\uffff\1\2}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\3\1\uffff\36\3\2\uffff\1\2\1\uffff\1\3\3\uffff"+
            "\3\3\1\uffff\4\3\3\uffff\10\3\1\uffff\3\3\21\uffff\1\3\20\uffff"+
            "\4\3",
            "\1\75\15\uffff\1\40\2\uffff\1\37\1\uffff\1\62\1\42\1\41\1\35"+
            "\1\36\1\31\1\32\1\33\1\34\1\25\1\26\1\27\1\30\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\10\1\7\1\4\1"+
            "\5\1\6\4\uffff\1\44\3\uffff\1\52\1\46\1\47\1\uffff\1\50\1\45"+
            "\1\51\1\61\3\uffff\1\73\1\65\1\53\1\54\1\63\1\64\1\66\1\67\1"+
            "\uffff\1\70\1\71\1\72\21\uffff\1\74\20\uffff\1\55\1\56\1\57"+
            "\1\60",
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
            "\1\101\1\103\1\102\13\uffff\1\75\2\uffff\1\75\1\uffff\4\75"+
            "\1\76\31\75\1\77\1\100\1\uffff\1\110\1\75\1\111\1\112\1\113"+
            "\3\75\1\114\4\75\3\uffff\10\75\1\uffff\3\75\1\uffff\1\104\1"+
            "\105\1\106\1\107\14\uffff\1\75\20\uffff\4\75",
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
            "\2\75\1\115\24\uffff\1\75\31\uffff\2\75\1\uffff\1\75\1\uffff"+
            "\3\75\3\uffff\1\75\24\uffff\4\75",
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
            return "1578:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_2==50) && (synpred1_InternalSqliteModel())) {s = 4;}

                        else if ( (LA25_2==51) && (synpred1_InternalSqliteModel())) {s = 5;}

                        else if ( (LA25_2==52) && (synpred1_InternalSqliteModel())) {s = 6;}

                        else if ( (LA25_2==49) && (synpred1_InternalSqliteModel())) {s = 7;}

                        else if ( (LA25_2==48) && (synpred1_InternalSqliteModel())) {s = 8;}

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

                        else if ( (LA25_2==47) && (synpred1_InternalSqliteModel())) {s = 20;}

                        else if ( (LA25_2==32) && (synpred1_InternalSqliteModel())) {s = 21;}

                        else if ( (LA25_2==33) && (synpred1_InternalSqliteModel())) {s = 22;}

                        else if ( (LA25_2==34) && (synpred1_InternalSqliteModel())) {s = 23;}

                        else if ( (LA25_2==35) && (synpred1_InternalSqliteModel())) {s = 24;}

                        else if ( (LA25_2==28) && (synpred1_InternalSqliteModel())) {s = 25;}

                        else if ( (LA25_2==29) && (synpred1_InternalSqliteModel())) {s = 26;}

                        else if ( (LA25_2==30) && (synpred1_InternalSqliteModel())) {s = 27;}

                        else if ( (LA25_2==31) && (synpred1_InternalSqliteModel())) {s = 28;}

                        else if ( (LA25_2==26) && (synpred1_InternalSqliteModel())) {s = 29;}

                        else if ( (LA25_2==27) && (synpred1_InternalSqliteModel())) {s = 30;}

                        else if ( (LA25_2==21) ) {s = 31;}

                        else if ( (LA25_2==18) && (synpred1_InternalSqliteModel())) {s = 32;}

                        else if ( (LA25_2==25) && (synpred1_InternalSqliteModel())) {s = 33;}

                        else if ( (LA25_2==24) && (synpred1_InternalSqliteModel())) {s = 34;}

                        else if ( (LA25_2==EOF) && (synpred1_InternalSqliteModel())) {s = 35;}

                        else if ( (LA25_2==57) && (synpred1_InternalSqliteModel())) {s = 36;}

                        else if ( (LA25_2==66) && (synpred1_InternalSqliteModel())) {s = 37;}

                        else if ( (LA25_2==62) && (synpred1_InternalSqliteModel())) {s = 38;}

                        else if ( (LA25_2==63) && (synpred1_InternalSqliteModel())) {s = 39;}

                        else if ( (LA25_2==65) && (synpred1_InternalSqliteModel())) {s = 40;}

                        else if ( (LA25_2==67) && (synpred1_InternalSqliteModel())) {s = 41;}

                        else if ( (LA25_2==61) && (synpred1_InternalSqliteModel())) {s = 42;}

                        else if ( (LA25_2==74) && (synpred1_InternalSqliteModel())) {s = 43;}

                        else if ( (LA25_2==75) && (synpred1_InternalSqliteModel())) {s = 44;}

                        else if ( (LA25_2==118) && (synpred1_InternalSqliteModel())) {s = 45;}

                        else if ( (LA25_2==119) && (synpred1_InternalSqliteModel())) {s = 46;}

                        else if ( (LA25_2==120) && (synpred1_InternalSqliteModel())) {s = 47;}

                        else if ( (LA25_2==121) && (synpred1_InternalSqliteModel())) {s = 48;}

                        else if ( (LA25_2==68) && (synpred1_InternalSqliteModel())) {s = 49;}

                        else if ( (LA25_2==23) && (synpred1_InternalSqliteModel())) {s = 50;}

                        else if ( (LA25_2==76) && (synpred1_InternalSqliteModel())) {s = 51;}

                        else if ( (LA25_2==77) && (synpred1_InternalSqliteModel())) {s = 52;}

                        else if ( (LA25_2==73) && (synpred1_InternalSqliteModel())) {s = 53;}

                        else if ( (LA25_2==78) && (synpred1_InternalSqliteModel())) {s = 54;}

                        else if ( (LA25_2==79) && (synpred1_InternalSqliteModel())) {s = 55;}

                        else if ( (LA25_2==81) && (synpred1_InternalSqliteModel())) {s = 56;}

                        else if ( (LA25_2==82) && (synpred1_InternalSqliteModel())) {s = 57;}

                        else if ( (LA25_2==83) && (synpred1_InternalSqliteModel())) {s = 58;}

                        else if ( (LA25_2==72) && (synpred1_InternalSqliteModel())) {s = 59;}

                        else if ( (LA25_2==101) && (synpred1_InternalSqliteModel())) {s = 60;}

                        else if ( (LA25_2==RULE_ID) ) {s = 61;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_31 = input.LA(1);

                         
                        int index25_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_31==EOF||LA25_31==18||LA25_31==21||(LA25_31>=23 && LA25_31<=26)||(LA25_31>=28 && LA25_31<=52)||LA25_31==57||(LA25_31>=61 && LA25_31<=63)||(LA25_31>=65 && LA25_31<=68)||(LA25_31>=72 && LA25_31<=79)||(LA25_31>=81 && LA25_31<=83)||LA25_31==101||(LA25_31>=118 && LA25_31<=121)) ) {s = 61;}

                        else if ( (LA25_31==27) ) {s = 62;}

                        else if ( (LA25_31==53) && (synpred1_InternalSqliteModel())) {s = 63;}

                        else if ( (LA25_31==54) && (synpred1_InternalSqliteModel())) {s = 64;}

                        else if ( (LA25_31==RULE_ID) && (synpred1_InternalSqliteModel())) {s = 65;}

                        else if ( (LA25_31==RULE_NUMBER) && (synpred1_InternalSqliteModel())) {s = 66;}

                        else if ( (LA25_31==RULE_STRING) && (synpred1_InternalSqliteModel())) {s = 67;}

                        else if ( (LA25_31==85) && (synpred1_InternalSqliteModel())) {s = 68;}

                        else if ( (LA25_31==86) && (synpred1_InternalSqliteModel())) {s = 69;}

                        else if ( (LA25_31==87) && (synpred1_InternalSqliteModel())) {s = 70;}

                        else if ( (LA25_31==88) && (synpred1_InternalSqliteModel())) {s = 71;}

                        else if ( (LA25_31==56) && (synpred1_InternalSqliteModel())) {s = 72;}

                        else if ( (LA25_31==58) && (synpred1_InternalSqliteModel())) {s = 73;}

                        else if ( (LA25_31==59) && (synpred1_InternalSqliteModel())) {s = 74;}

                        else if ( (LA25_31==60) && (synpred1_InternalSqliteModel())) {s = 75;}

                        else if ( (LA25_31==64) && (synpred1_InternalSqliteModel())) {s = 76;}

                         
                        input.seek(index25_31);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_77 = input.LA(1);

                         
                        int index25_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqliteModel()) ) {s = 76;}

                        else if ( (true) ) {s = 61;}

                         
                        input.seek(index25_77);
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
        "\1\131\3\132\3\uffff\1\4\3\uffff\1\147\2\uffff";
    static final String DFA55_maxS =
        "\1\151\1\134\1\132\1\134\3\uffff\1\4\3\uffff\1\150\2\uffff";
    static final String DFA55_acceptS =
        "\4\uffff\1\3\1\1\1\2\1\uffff\1\10\1\7\1\6\1\uffff\1\4\1\5";
    static final String DFA55_specialS =
        "\16\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\1\14\uffff\1\2\2\uffff\1\3",
            "\1\5\1\6\1\4",
            "\1\7",
            "\1\12\1\10\1\11",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "\1\14\1\15",
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
            return "3401:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )";
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
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock1093 = new BitSet(new long[]{0x0000000000008000L,0x0000024002000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1115 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMigrationBlock1127 = new BitSet(new long[]{0x0000000000008000L,0x0000024002000000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1324 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleExprConcat1351 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1385 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1480 = new BitSet(new long[]{0x0000000002240002L});
    public static final BitSet FOLLOW_21_in_ruleExprMult1509 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_18_in_ruleExprMult1538 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_25_in_ruleExprMult1567 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1604 = new BitSet(new long[]{0x0000000002240002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1699 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleExprAdd1728 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_27_in_ruleExprAdd1757 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1794 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1889 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_28_in_ruleExprBit1918 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_29_in_ruleExprBit1947 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_30_in_ruleExprBit1976 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_31_in_ruleExprBit2005 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2042 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2137 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_32_in_ruleExprRelate2166 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_33_in_ruleExprRelate2195 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_34_in_ruleExprRelate2224 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_35_in_ruleExprRelate2253 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2290 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2385 = new BitSet(new long[]{0x0000FFF000000002L});
    public static final BitSet FOLLOW_36_in_ruleExprEqual2414 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_37_in_ruleExprEqual2443 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_38_in_ruleExprEqual2472 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2501 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2530 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2559 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2588 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2617 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2646 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual2675 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual2704 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual2733 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2770 = new BitSet(new long[]{0x0000FFF000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2865 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprAnd2892 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2926 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3021 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleExprOr3048 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3082 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression3177 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression3245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNullExpression3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNullExpression3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNullExpression3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3565 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3605 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3617 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3771 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3792 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3839 = new BitSet(new long[]{0x0900000000000000L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3871 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3918 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression3959 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3980 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00005L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4002 = new BitSet(new long[]{0x7D60000008000070L,0x0000000001E00005L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4016 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4037 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4085 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression4102 = new BitSet(new long[]{0x1D60000008200070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4121 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4162 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4175 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4196 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4241 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression4253 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4286 = new BitSet(new long[]{0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4307 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCase4403 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCase4436 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement4549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSelectStatement4562 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList4621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4677 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOrderingTermList4690 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4711 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore4749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4806 = new BitSet(new long[]{0x0000000000000002L,0x03C0000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore4836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4857 = new BitSet(new long[]{0x0000000000000002L,0x03C0000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleSelectExpression4951 = new BitSet(new long[]{0x1D60000008200070L,0x0000000001E000C1L});
    public static final BitSet FOLLOW_70_in_ruleSelectExpression4970 = new BitSet(new long[]{0x1D60000008200070L,0x0000000001E000C1L});
    public static final BitSet FOLLOW_71_in_ruleSelectExpression5007 = new BitSet(new long[]{0x1D60000008200070L,0x0000000001E000C1L});
    public static final BitSet FOLLOW_21_in_ruleSelectExpression5041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_72_in_ruleSelectExpression5095 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000E00L});
    public static final BitSet FOLLOW_73_in_ruleSelectExpression5131 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5167 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5188 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5203 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5318 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSelectList5331 = new BitSet(new long[]{0x1D60000008200070L,0x0000000001E000C1L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5352 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5536 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleGroupByExpressions5549 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5570 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm5698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm5754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleOrderingTerm5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOrderingTerm5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource5861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource5917 = new BitSet(new long[]{0x0000000000000002L,0x00000000000EC000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource5938 = new BitSet(new long[]{0x0000000000000002L,0x00000000000EC000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource5975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6185 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSingleSourceTable6198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSingleSourceSelectStatement6314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6335 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleSingleSourceSelectStatement6347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSingleSourceSelectStatement6360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSingleSourceJoin6467 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6488 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleSingleSourceJoin6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJoinStatement6598 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E8000L});
    public static final BitSet FOLLOW_79_in_ruleJoinStatement6632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000090000L});
    public static final BitSet FOLLOW_80_in_ruleJoinStatement6663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_81_in_ruleJoinStatement6702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_82_in_ruleJoinStatement6739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement6766 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement6787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement6799 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn6856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn6921 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResultColumn6934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue6994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleLiteralValue7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleLiteralValue7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLiteralValue7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleLiteralValue7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement7609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement7619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleCreateTableStatement7665 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleCreateTableStatement7677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement7694 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCreateTableStatement7711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7732 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleCreateTableStatement7745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7766 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleCreateTableStatement7781 = new BitSet(new long[]{0x0000000000000000L,0x0001C80000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7802 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCreateTableStatement7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleCreateViewStatement7908 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleCreateViewStatement7920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement7937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCreateViewStatement7954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleCreateTriggerStatement8058 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTriggerStatement8070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8087 = new BitSet(new long[]{0x0000000000000000L,0x00000007E0000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateTriggerStatement8112 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement8141 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement8170 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTriggerStatement8206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement8243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8281 = new BitSet(new long[]{0x0000000000000000L,0x0000000800100000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8324 = new BitSet(new long[]{0x8000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_63_in_ruleCreateTriggerStatement8342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8359 = new BitSet(new long[]{0x8000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleCreateTriggerStatement8382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8402 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000004L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8420 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000004L});
    public static final BitSet FOLLOW_66_in_ruleCreateTriggerStatement8447 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement8468 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement8482 = new BitSet(new long[]{0x4000000000000000L,0x0004000700000020L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8504 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTriggerStatement8516 = new BitSet(new long[]{0x4000000000000000L,0x0004000700000020L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8538 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTriggerStatement8550 = new BitSet(new long[]{0x4000000000000000L,0x0004000700000020L});
    public static final BitSet FOLLOW_62_in_ruleCreateTriggerStatement8566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement8602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleAlterTableRenameStatement8658 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleAlterTableRenameStatement8670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8690 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleAlterTableRenameStatement8702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement8760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleAlterTableAddColumnStatement8807 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleAlterTableAddColumnStatement8819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement8839 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleAlterTableAddColumnStatement8851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement8908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleDropTableStatement8955 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleDropTableStatement8967 = new BitSet(new long[]{0x0000000000000010L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleDropTableStatement8985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleDropTriggerStatement9102 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleDropTriggerStatement9114 = new BitSet(new long[]{0x0000000000000010L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleDropTriggerStatement9132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleDropViewStatement9249 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleDropViewStatement9261 = new BitSet(new long[]{0x0000000000000010L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleDropViewStatement9279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement9313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef9349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef9410 = new BitSet(new long[]{0x0000000000000000L,0x3C00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef9436 = new BitSet(new long[]{0x0008000000000002L,0x0000280000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef9457 = new BitSet(new long[]{0x0008000000000002L,0x0000280000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint9494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint9504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleColumnConstraint9551 = new BitSet(new long[]{0x0000000000000002L,0x0000100000003000L});
    public static final BitSet FOLLOW_76_in_ruleColumnConstraint9570 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_77_in_ruleColumnConstraint9607 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleColumnConstraint9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleColumnConstraint9683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleColumnConstraint9734 = new BitSet(new long[]{0x0100000008000060L,0x0000000001E00000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint9903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint9938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleUniqueTableConstraint9986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint10003 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleUniqueTableConstraint10022 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleUniqueTableConstraint10034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10055 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleUniqueTableConstraint10068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10089 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleUniqueTableConstraint10103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint10160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint10170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rulePrimaryConstraint10208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint10225 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_rulePrimaryConstraint10244 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryConstraint10256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10277 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_rulePrimaryConstraint10290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10311 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryConstraint10325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint10346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint10382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleCheckTableConstraint10430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint10447 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleCheckTableConstraint10466 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCheckTableConstraint10478 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint10499 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCheckTableConstraint10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn10547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn10557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn10602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleIndexedColumn10621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleIndexedColumn10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue10709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue10719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue10775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDefaultValue10804 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue10825 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDefaultValue10837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause10874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause10884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleConflictClause10921 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleConflictClause10933 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement10990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement11128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement11163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement11173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleDeleteStatement11210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleDeleteStatement11222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement11242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleDeleteStatement11255 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement11314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleInsertStatement11363 = new BitSet(new long[]{0x0002000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_49_in_ruleInsertStatement11376 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement11397 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_114_in_ruleInsertStatement11418 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleInsertStatement11431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11451 = new BitSet(new long[]{0x0100000000000000L,0x0010200000000020L});
    public static final BitSet FOLLOW_56_in_ruleInsertStatement11464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11484 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleInsertStatement11497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11517 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleInsertStatement11531 = new BitSet(new long[]{0x0000000000000000L,0x0010200000000020L});
    public static final BitSet FOLLOW_116_in_ruleInsertStatement11548 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleInsertStatement11560 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement11581 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleInsertStatement11594 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement11615 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleInsertStatement11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleInsertStatement11677 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleInsertStatement11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement11727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleUpdateStatement11774 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_49_in_ruleUpdateStatement11787 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement11830 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleUpdateStatement11842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11863 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_63_in_ruleUpdateStatement11876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11897 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleUpdateStatement11912 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression11971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression11981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression12026 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleUpdateColumnExpression12038 = new BitSet(new long[]{0x1D60000008000070L,0x0000000001E00001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression12059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber12096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSignedNumber12146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber12163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12260 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQualifiedName12279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12294 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_118_in_ruleCompoundOperator12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleCompoundOperator12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleCompoundOperator12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleCompoundOperator12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleSqliteDataType12451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSqliteDataType12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSqliteDataType12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleSqliteDataType12502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleSqliteDataType12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSqliteDataType12536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleColumnType12581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleColumnType12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleColumnType12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleColumnType12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleColumnType12649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleConflictResolution12694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleConflictResolution12711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleConflictResolution12728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleConflictResolution12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleConflictResolution12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel3548 = new BitSet(new long[]{0x0000000000000002L});

}