package com.robotoworks.mechanoid.sqlite.parser.antlr.internal; 

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
import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqliteModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'action'", "'active'", "'migration'", "';'", "'||'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'('", "')'", "'not'", "'exists'", "'case'", "'else'", "'end'", "','", "'cast'", "'as'", "'is null'", "'not null'", "'notnull'", "'when'", "'then'", "'create'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead'", "'of'", "'delete'", "'insert'", "'update'", "'on'", "'for'", "'each'", "'row'", "'begin'", "'alter'", "'drop'", "'if'", "'from'", "'where'", "'replace'", "'into'", "'values'", "'default'", "'set'", "'order'", "'by'", "'rename to'", "'add column'", "'primary'", "'key'", "'asc'", "'desc'", "'autoincrement'", "'null'", "'constraint'", "'unique'", "'check'", "'union all'", "'union'", "'intersect'", "'except'", "'select'", "'distinct'", "'all'", "'group'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'conflict'", "'current_time'", "'current_date'", "'current_time_stamp'", "'.'", "'text'", "'integer'", "'real'", "'blob'", "'boolean'", "'none'", "'numeric'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g"; }



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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_database_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_database_2_0= ruleDatabaseBlock ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:85:1: ( (lv_packageName_1_0= ruleFQN ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:86:1: (lv_packageName_1_0= ruleFQN )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:86:1: (lv_packageName_1_0= ruleFQN )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:87:3: lv_packageName_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModel143);
            lv_packageName_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:103:2: ( (lv_database_2_0= ruleDatabaseBlock ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:104:1: (lv_database_2_0= ruleDatabaseBlock )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:104:1: (lv_database_2_0= ruleDatabaseBlock )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:105:3: lv_database_2_0= ruleDatabaseBlock
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getDatabaseDatabaseBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDatabaseBlock_in_ruleModel164);
            lv_database_2_0=ruleDatabaseBlock();

            state._fsp--;


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

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:129:1: entryRuleDatabaseBlock returns [EObject current=null] : iv_ruleDatabaseBlock= ruleDatabaseBlock EOF ;
    public final EObject entryRuleDatabaseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseBlock = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:130:2: (iv_ruleDatabaseBlock= ruleDatabaseBlock EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:131:2: iv_ruleDatabaseBlock= ruleDatabaseBlock EOF
            {
             newCompositeNode(grammarAccess.getDatabaseBlockRule()); 
            pushFollow(FOLLOW_ruleDatabaseBlock_in_entryRuleDatabaseBlock200);
            iv_ruleDatabaseBlock=ruleDatabaseBlock();

            state._fsp--;

             current =iv_ruleDatabaseBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabaseBlock210); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:138:1: ruleDatabaseBlock returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:141:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:142:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_config_3_0= ruleConfigBlock ) )? ( (lv_migrations_4_0= ruleMigrationBlock ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDatabaseBlock247); 

                	newLeafNode(otherlv_0, grammarAccess.getDatabaseBlockAccess().getDatabaseKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:146:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:147:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:147:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:148:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabaseBlock264); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDatabaseBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDatabaseBlock281); 

                	newLeafNode(otherlv_2, grammarAccess.getDatabaseBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:168:1: ( (lv_config_3_0= ruleConfigBlock ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:169:1: (lv_config_3_0= ruleConfigBlock )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:169:1: (lv_config_3_0= ruleConfigBlock )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:170:3: lv_config_3_0= ruleConfigBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getConfigConfigBlockParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConfigBlock_in_ruleDatabaseBlock302);
                    lv_config_3_0=ruleConfigBlock();

                    state._fsp--;


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
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:186:3: ( (lv_migrations_4_0= ruleMigrationBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:187:1: (lv_migrations_4_0= ruleMigrationBlock )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:187:1: (lv_migrations_4_0= ruleMigrationBlock )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:188:3: lv_migrations_4_0= ruleMigrationBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getMigrationsMigrationBlockParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock324);
            	    lv_migrations_4_0=ruleMigrationBlock();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDatabaseBlock337); 

                	newLeafNode(otherlv_5, grammarAccess.getDatabaseBlockAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:216:1: entryRuleConfigBlock returns [EObject current=null] : iv_ruleConfigBlock= ruleConfigBlock EOF ;
    public final EObject entryRuleConfigBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigBlock = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:217:2: (iv_ruleConfigBlock= ruleConfigBlock EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:218:2: iv_ruleConfigBlock= ruleConfigBlock EOF
            {
             newCompositeNode(grammarAccess.getConfigBlockRule()); 
            pushFollow(FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock373);
            iv_ruleConfigBlock=ruleConfigBlock();

            state._fsp--;

             current =iv_ruleConfigBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigBlock383); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:225:1: ruleConfigBlock returns [EObject current=null] : ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleConfigBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:228:28: ( ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:229:1: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:229:1: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:229:2: () otherlv_1= 'config' otherlv_2= '{' ( (lv_statements_3_0= ruleConfigurationStatement ) )* otherlv_4= '}'
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:229:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:230:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigBlockAccess().getConfigBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleConfigBlock429); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigBlockAccess().getConfigKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleConfigBlock441); 

                	newLeafNode(otherlv_2, grammarAccess.getConfigBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:243:1: ( (lv_statements_3_0= ruleConfigurationStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:244:1: (lv_statements_3_0= ruleConfigurationStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:244:1: (lv_statements_3_0= ruleConfigurationStatement )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:245:3: lv_statements_3_0= ruleConfigurationStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConfigBlockAccess().getStatementsConfigurationStatementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfigurationStatement_in_ruleConfigBlock462);
            	    lv_statements_3_0=ruleConfigurationStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleConfigBlock475); 

                	newLeafNode(otherlv_4, grammarAccess.getConfigBlockAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:273:1: entryRuleConfigurationStatement returns [EObject current=null] : iv_ruleConfigurationStatement= ruleConfigurationStatement EOF ;
    public final EObject entryRuleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:274:2: (iv_ruleConfigurationStatement= ruleConfigurationStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:275:2: iv_ruleConfigurationStatement= ruleConfigurationStatement EOF
            {
             newCompositeNode(grammarAccess.getConfigurationStatementRule()); 
            pushFollow(FOLLOW_ruleConfigurationStatement_in_entryRuleConfigurationStatement511);
            iv_ruleConfigurationStatement=ruleConfigurationStatement();

            state._fsp--;

             current =iv_ruleConfigurationStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationStatement521); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:282:1: ruleConfigurationStatement returns [EObject current=null] : ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'active' ( (lv_name_6_0= RULE_ID ) ) ) ) ;
    public final EObject ruleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_path_3_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:285:28: ( ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'active' ( (lv_name_6_0= RULE_ID ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:1: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'active' ( (lv_name_6_0= RULE_ID ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:1: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'active' ( (lv_name_6_0= RULE_ID ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:2: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:2: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:3: () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:287:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigurationStatementAccess().getActionStatementAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleConfigurationStatement568); 

                        	newLeafNode(otherlv_1, grammarAccess.getConfigurationStatementAccess().getActionKeyword_0_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:296:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:297:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:297:1: (lv_name_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:298:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationStatement585); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:314:2: ( (lv_path_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:315:1: (lv_path_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:315:1: (lv_path_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:316:3: lv_path_3_0= RULE_STRING
                    {
                    lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationStatement607); 

                    			newLeafNode(lv_path_3_0, grammarAccess.getConfigurationStatementAccess().getPathSTRINGTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigurationStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"path",
                            		lv_path_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:333:6: ( () otherlv_5= 'active' ( (lv_name_6_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:333:6: ( () otherlv_5= 'active' ( (lv_name_6_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:333:7: () otherlv_5= 'active' ( (lv_name_6_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:333:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:334:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigurationStatementAccess().getActiveRecordRegistrationStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleConfigurationStatement641); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfigurationStatementAccess().getActiveKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:343:1: ( (lv_name_6_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:344:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:344:1: (lv_name_6_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:345:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationStatement658); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_1_2_0()); 
                    		

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


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleMigrationBlock"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:369:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:370:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:371:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
             newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock700);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;

             current =iv_ruleMigrationBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock710); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:378:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_statements_3_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:381:28: ( ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:382:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:382:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:382:2: () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}'
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:382:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:383:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock756); 

                	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrationKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMigrationBlock768); 

                	newLeafNode(otherlv_2, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:396:1: ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==63||(LA6_0>=79 && LA6_0<=80)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:396:2: ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:396:2: ( (lv_statements_3_0= ruleDDLStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:397:1: (lv_statements_3_0= ruleDDLStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:397:1: (lv_statements_3_0= ruleDDLStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:398:3: lv_statements_3_0= ruleDDLStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock790);
                    lv_statements_3_0=ruleDDLStatement();

                    state._fsp--;


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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMigrationBlock802); 

                        	newLeafNode(otherlv_4, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:418:1: ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==63||(LA5_0>=79 && LA5_0<=80)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:418:2: ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:418:2: ( (lv_statements_5_0= ruleDDLStatement ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:419:1: (lv_statements_5_0= ruleDDLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:419:1: (lv_statements_5_0= ruleDDLStatement )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:420:3: lv_statements_5_0= ruleDDLStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_3_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock824);
                    	    lv_statements_5_0=ruleDDLStatement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMigrationBlockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"statements",
                    	            		lv_statements_5_0, 
                    	            		"DDLStatement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleMigrationBlock836); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleMigrationBlock852); 

                	newLeafNode(otherlv_7, grammarAccess.getMigrationBlockAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:452:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:453:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:454:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
             newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression888);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;

             current =iv_ruleSqlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression898); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:461:1: ruleSqlExpression returns [EObject current=null] : ( (lv_root_0_0= ruleExprConcat ) ) ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_root_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:464:28: ( ( (lv_root_0_0= ruleExprConcat ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:465:1: ( (lv_root_0_0= ruleExprConcat ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:465:1: ( (lv_root_0_0= ruleExprConcat ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:466:1: (lv_root_0_0= ruleExprConcat )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:466:1: (lv_root_0_0= ruleExprConcat )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:467:3: lv_root_0_0= ruleExprConcat
            {
             
            	        newCompositeNode(grammarAccess.getSqlExpressionAccess().getRootExprConcatParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression943);
            lv_root_0_0=ruleExprConcat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSqlExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_0_0, 
                    		"ExprConcat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:491:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:492:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:493:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
             newCompositeNode(grammarAccess.getExprConcatRule()); 
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat978);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;

             current =iv_ruleExprConcat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat988); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:500:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:503:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:504:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:504:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:505:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1035);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;

             
                    current = this_ExprMult_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:513:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:513:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:513:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:514:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:519:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:520:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:520:1: (lv_op_2_0= '||' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:521:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,21,FOLLOW_21_in_ruleExprConcat1062); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprConcatRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:534:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:535:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:535:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:536:3: lv_right_3_0= ruleExprMult
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1096);
            	    lv_right_3_0=ruleExprMult();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:560:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:561:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:562:2: iv_ruleExprMult= ruleExprMult EOF
            {
             newCompositeNode(grammarAccess.getExprMultRule()); 
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1134);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;

             current =iv_ruleExprMult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1144); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:569:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:572:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:573:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:573:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:574:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1191);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;

             
                    current = this_ExprAdd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:582:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=22 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:582:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:582:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:583:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:588:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:589:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:589:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:590:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:590:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt8=3;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:591:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,22,FOLLOW_22_in_ruleExprMult1220); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprMultAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprMultRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:603:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,23,FOLLOW_23_in_ruleExprMult1249); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprMultAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprMultRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:615:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,24,FOLLOW_24_in_ruleExprMult1278); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprMultAccess().getOpPercentSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprMultRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:630:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:631:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:631:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:632:3: lv_right_3_0= ruleExprAdd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1315);
            	    lv_right_3_0=ruleExprAdd();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:656:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:657:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:658:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
             newCompositeNode(grammarAccess.getExprAddRule()); 
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd1353);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;

             current =iv_ruleExprAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd1363); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:665:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:668:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:669:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:669:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:670:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1410);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;

             
                    current = this_ExprBit_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:678:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=25 && LA11_0<=26)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:678:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:678:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:679:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:684:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:685:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:685:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:686:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:686:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==25) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==26) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:687:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_ruleExprAdd1439); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprAddAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprAddRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:699:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleExprAdd1468); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprAddAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprAddRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:714:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:715:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:715:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:716:3: lv_right_3_0= ruleExprBit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1505);
            	    lv_right_3_0=ruleExprBit();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:740:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:741:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:742:2: iv_ruleExprBit= ruleExprBit EOF
            {
             newCompositeNode(grammarAccess.getExprBitRule()); 
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit1543);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;

             current =iv_ruleExprBit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit1553); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:749:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:752:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:753:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:753:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:754:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit1600);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;

             
                    current = this_ExprRelate_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:762:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=27 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:762:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:762:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:763:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:768:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:769:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:769:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:770:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:770:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:771:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,27,FOLLOW_27_in_ruleExprBit1629); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprBitAccess().getOpLessThanSignLessThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:783:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,28,FOLLOW_28_in_ruleExprBit1658); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprBitAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:795:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,29,FOLLOW_29_in_ruleExprBit1687); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprBitAccess().getOpAmpersandKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:807:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,30,FOLLOW_30_in_ruleExprBit1716); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getExprBitAccess().getOpVerticalLineKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:822:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:823:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:823:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:824:3: lv_right_3_0= ruleExprRelate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit1753);
            	    lv_right_3_0=ruleExprRelate();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:848:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:849:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:850:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
             newCompositeNode(grammarAccess.getExprRelateRule()); 
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate1791);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;

             current =iv_ruleExprRelate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate1801); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:857:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:860:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:861:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:861:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:862:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate1848);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;

             
                    current = this_ExprEqual_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:870:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=34)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:870:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:870:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:871:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:876:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:877:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:877:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:878:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:878:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:879:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_31_in_ruleExprRelate1877); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprRelateAccess().getOpLessThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:891:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_32_in_ruleExprRelate1906); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprRelateAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:903:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_33_in_ruleExprRelate1935); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprRelateAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:915:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,34,FOLLOW_34_in_ruleExprRelate1964); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getExprRelateAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:930:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:931:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:931:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:932:3: lv_right_3_0= ruleExprEqual
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate2001);
            	    lv_right_3_0=ruleExprEqual();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:956:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:957:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:958:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
             newCompositeNode(grammarAccess.getExprEqualRule()); 
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual2039);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;

             current =iv_ruleExprEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual2049); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:965:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:968:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:969:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:969:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:970:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2096);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;

             
                    current = this_ExprAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:978:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=35 && LA17_0<=45)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:978:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:978:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:979:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:984:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:985:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:985:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:986:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:986:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    int alt16=11;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt16=6;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt16=7;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt16=8;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt16=9;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt16=10;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt16=11;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:987:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_35_in_ruleExprEqual2125); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprEqualAccess().getOpEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:999:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_36_in_ruleExprEqual2154); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1011:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,37,FOLLOW_37_in_ruleExprEqual2183); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1023:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,38,FOLLOW_38_in_ruleExprEqual2212); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getExprEqualAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1035:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,39,FOLLOW_39_in_ruleExprEqual2241); 

            	                    newLeafNode(lv_op_2_5, grammarAccess.getExprEqualAccess().getOpIsKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1047:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,40,FOLLOW_40_in_ruleExprEqual2270); 

            	                    newLeafNode(lv_op_2_6, grammarAccess.getExprEqualAccess().getOpIsNotKeyword_1_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            	    

            	            }
            	            break;
            	        case 7 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1059:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2299); 

            	                    newLeafNode(lv_op_2_7, grammarAccess.getExprEqualAccess().getOpInKeyword_1_1_0_6());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_7, null);
            	            	    

            	            }
            	            break;
            	        case 8 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1071:8: lv_op_2_8= 'like'
            	            {
            	            lv_op_2_8=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2328); 

            	                    newLeafNode(lv_op_2_8, grammarAccess.getExprEqualAccess().getOpLikeKeyword_1_1_0_7());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_8, null);
            	            	    

            	            }
            	            break;
            	        case 9 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1083:8: lv_op_2_9= 'glob'
            	            {
            	            lv_op_2_9=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2357); 

            	                    newLeafNode(lv_op_2_9, grammarAccess.getExprEqualAccess().getOpGlobKeyword_1_1_0_8());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_9, null);
            	            	    

            	            }
            	            break;
            	        case 10 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1095:8: lv_op_2_10= 'match'
            	            {
            	            lv_op_2_10=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2386); 

            	                    newLeafNode(lv_op_2_10, grammarAccess.getExprEqualAccess().getOpMatchKeyword_1_1_0_9());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_10, null);
            	            	    

            	            }
            	            break;
            	        case 11 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1107:8: lv_op_2_11= 'regexp'
            	            {
            	            lv_op_2_11=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual2415); 

            	                    newLeafNode(lv_op_2_11, grammarAccess.getExprEqualAccess().getOpRegexpKeyword_1_1_0_10());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_11, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1122:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1123:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1123:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1124:3: lv_right_3_0= ruleExprAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2452);
            	    lv_right_3_0=ruleExprAnd();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1148:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1149:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1150:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
             newCompositeNode(grammarAccess.getExprAndRule()); 
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2490);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;

             current =iv_ruleExprAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2500); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1157:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1160:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1161:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1161:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1162:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2547);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;

             
                    current = this_ExprOr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1170:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1170:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1170:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1176:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1177:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1177:1: (lv_op_2_0= 'and' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1178:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,46,FOLLOW_46_in_ruleExprAnd2574); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprAndRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1191:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1192:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1192:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1193:3: lv_right_3_0= ruleExprOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2608);
            	    lv_right_3_0=ruleExprOr();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1217:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1218:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1219:2: iv_ruleExprOr= ruleExprOr EOF
            {
             newCompositeNode(grammarAccess.getExprOrRule()); 
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2646);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;

             current =iv_ruleExprOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2656); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1226:1: ruleExprOr returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1229:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1230:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1230:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1231:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprOrAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleExprOr2703);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1239:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1239:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1239:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1240:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1245:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1246:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1246:1: (lv_op_2_0= 'or' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1247:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,47,FOLLOW_47_in_ruleExprOr2730); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprOrRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1260:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1261:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1261:1: (lv_right_3_0= rulePrimaryExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1262:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprOrAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleExprOr2764);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PrimaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1286:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1287:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1288:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2802);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2812); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1295:1: rulePrimaryExpression returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) ) ( ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) ) )? ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_not_8_0=null;
        Token lv_exists_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_name_22_0=null;
        Token otherlv_23=null;
        Token lv_all_24_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token lv_isnull_36_1=null;
        Token lv_isnull_36_2=null;
        Token lv_isnull_36_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literalValue_3_0 = null;

        EObject this_SqlExpression_5 = null;

        EObject lv_select_11_0 = null;

        EObject lv_caseExpression_15_0 = null;

        EObject lv_cases_16_0 = null;

        EObject lv_cases_17_0 = null;

        EObject lv_elseExpression_19_0 = null;

        EObject lv_arguments_25_0 = null;

        EObject lv_arugments_27_0 = null;

        EObject lv_expression_32_0 = null;

        Enumerator lv_type_34_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1298:28: ( ( ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) ) ( ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:1: ( ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) ) ( ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:1: ( ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) ) ( ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:2: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) ) ( ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:2: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) )
            int alt27=7;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:3: ( () ( (lv_name_1_0= ruleFQN ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:3: ( () ( (lv_name_1_0= ruleFQN ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:4: () ( (lv_name_1_0= ruleFQN ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1299:4: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1300:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getColumnLiteralAction_0_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1305:2: ( (lv_name_1_0= ruleFQN ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1306:1: (lv_name_1_0= ruleFQN )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1306:1: (lv_name_1_0= ruleFQN )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1307:3: lv_name_1_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNameFQNParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_rulePrimaryExpression2869);
                    lv_name_1_0=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"FQN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1324:6: ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1324:6: ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1324:7: () ( (lv_literalValue_3_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1324:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1325:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getLiteralAction_0_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1330:2: ( (lv_literalValue_3_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1331:1: (lv_literalValue_3_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1331:1: (lv_literalValue_3_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1332:3: lv_literalValue_3_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression2907);
                    lv_literalValue_3_0=ruleLiteralValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"literalValue",
                            		lv_literalValue_3_0, 
                            		"LiteralValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1349:6: (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1349:6: (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1349:8: otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_rulePrimaryExpression2927); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSqlExpressionParserRuleCall_0_2_1()); 
                        
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression2949);
                    this_SqlExpression_5=ruleSqlExpression();

                    state._fsp--;

                     
                            current = this_SqlExpression_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_rulePrimaryExpression2960); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1367:6: ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1367:6: ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1367:7: () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1367:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1368:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_0_3_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1373:2: ( (lv_not_8_0= 'not' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==50) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1374:1: (lv_not_8_0= 'not' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1374:1: (lv_not_8_0= 'not' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1375:3: lv_not_8_0= 'not'
                            {
                            lv_not_8_0=(Token)match(input,50,FOLLOW_50_in_rulePrimaryExpression2995); 

                                    newLeafNode(lv_not_8_0, grammarAccess.getPrimaryExpressionAccess().getNotNotKeyword_0_3_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "not", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1388:3: ( (lv_exists_9_0= 'exists' ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==51) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1389:1: (lv_exists_9_0= 'exists' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1389:1: (lv_exists_9_0= 'exists' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1390:3: lv_exists_9_0= 'exists'
                            {
                            lv_exists_9_0=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3027); 

                                    newLeafNode(lv_exists_9_0, grammarAccess.getPrimaryExpressionAccess().getExistsExistsKeyword_0_3_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "exists", true, "exists");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_rulePrimaryExpression3053); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_3_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1407:1: ( (lv_select_11_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1408:1: (lv_select_11_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1408:1: (lv_select_11_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1409:3: lv_select_11_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_0_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3074);
                    lv_select_11_0=ruleSelectStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"select",
                            		lv_select_11_0, 
                            		"SelectStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,49,FOLLOW_49_in_rulePrimaryExpression3086); 

                        	newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_3_5());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1430:6: ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1430:6: ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1430:7: () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1430:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1431:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_0_4_0(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,52,FOLLOW_52_in_rulePrimaryExpression3115); 

                        	newLeafNode(otherlv_14, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_0_4_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1440:1: ( (lv_caseExpression_15_0= ruleSqlExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_NUMBER)||LA22_0==26||LA22_0==48||(LA22_0>=50 && LA22_0<=52)||LA22_0==56||LA22_0==98||(LA22_0>=117 && LA22_0<=119)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1441:1: (lv_caseExpression_15_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1441:1: (lv_caseExpression_15_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1442:3: lv_caseExpression_15_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_0_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3136);
                            lv_caseExpression_15_0=ruleSqlExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"caseExpression",
                                    		lv_caseExpression_15_0, 
                                    		"SqlExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1458:3: ( (lv_cases_16_0= ruleCase ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1459:1: (lv_cases_16_0= ruleCase )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1459:1: (lv_cases_16_0= ruleCase )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1460:3: lv_cases_16_0= ruleCase
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_0_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression3158);
                    lv_cases_16_0=ruleCase();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"cases",
                            		lv_cases_16_0, 
                            		"Case");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1476:2: ( (lv_cases_17_0= ruleCase ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==61) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1477:1: (lv_cases_17_0= ruleCase )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1477:1: (lv_cases_17_0= ruleCase )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1478:3: lv_cases_17_0= ruleCase
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_0_4_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression3179);
                    	    lv_cases_17_0=ruleCase();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"cases",
                    	            		lv_cases_17_0, 
                    	            		"Case");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1494:3: (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==53) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1494:5: otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) )
                            {
                            otherlv_18=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3193); 

                                	newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_0_4_5_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1498:1: ( (lv_elseExpression_19_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1499:1: (lv_elseExpression_19_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1499:1: (lv_elseExpression_19_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1500:3: lv_elseExpression_19_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_0_4_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3214);
                            lv_elseExpression_19_0=ruleSqlExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"elseExpression",
                                    		lv_elseExpression_19_0, 
                                    		"SqlExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3228); 

                        	newLeafNode(otherlv_20, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_0_4_6());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1521:6: ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1521:6: ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1521:7: () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1521:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1522:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getFunctionAction_0_5_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1527:2: ( (lv_name_22_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1528:1: (lv_name_22_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1528:1: (lv_name_22_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1529:3: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3262); 

                    			newLeafNode(lv_name_22_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_0_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_22_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,48,FOLLOW_48_in_rulePrimaryExpression3279); 

                        	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_5_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1549:1: ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==22) ) {
                        alt26=1;
                    }
                    else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_NUMBER)||LA26_0==26||LA26_0==48||(LA26_0>=50 && LA26_0<=52)||LA26_0==56||LA26_0==98||(LA26_0>=117 && LA26_0<=119)) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1549:2: ( (lv_all_24_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1549:2: ( (lv_all_24_0= '*' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1550:1: (lv_all_24_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1550:1: (lv_all_24_0= '*' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1551:3: lv_all_24_0= '*'
                            {
                            lv_all_24_0=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression3298); 

                                    newLeafNode(lv_all_24_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_0_5_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "all", true, "*");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1565:6: ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1565:6: ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1565:7: ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1565:7: ( (lv_arguments_25_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1566:1: (lv_arguments_25_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1566:1: (lv_arguments_25_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1567:3: lv_arguments_25_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_0_5_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3339);
                            lv_arguments_25_0=ruleSqlExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"arguments",
                                    		lv_arguments_25_0, 
                                    		"SqlExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1583:2: (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==55) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1583:4: otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_26=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3352); 

                            	        	newLeafNode(otherlv_26, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_0_5_3_1_1_0());
                            	        
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1587:1: ( (lv_arugments_27_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1588:1: (lv_arugments_27_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1588:1: (lv_arugments_27_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1589:3: lv_arugments_27_0= ruleSqlExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArugmentsSqlExpressionParserRuleCall_0_5_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3373);
                            	    lv_arugments_27_0=ruleSqlExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"arugments",
                            	            		lv_arugments_27_0, 
                            	            		"SqlExpression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

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
                            break;

                    }

                    otherlv_28=(Token)match(input,49,FOLLOW_49_in_rulePrimaryExpression3389); 

                        	newLeafNode(otherlv_28, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_5_4());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1610:6: ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1610:6: ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1610:7: () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1610:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1611:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_0_6_0(),
                                current);
                        

                    }

                    otherlv_30=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3418); 

                        	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_0_6_1());
                        
                    otherlv_31=(Token)match(input,48,FOLLOW_48_in_rulePrimaryExpression3430); 

                        	newLeafNode(otherlv_31, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_6_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1624:1: ( (lv_expression_32_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1625:1: (lv_expression_32_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1625:1: (lv_expression_32_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1626:3: lv_expression_32_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_0_6_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3451);
                    lv_expression_32_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_32_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_33=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3463); 

                        	newLeafNode(otherlv_33, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_0_6_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1646:1: ( (lv_type_34_0= ruleSqliteDataType ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1647:1: (lv_type_34_0= ruleSqliteDataType )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1647:1: (lv_type_34_0= ruleSqliteDataType )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1648:3: lv_type_34_0= ruleSqliteDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_0_6_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression3484);
                    lv_type_34_0=ruleSqliteDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_34_0, 
                            		"SqliteDataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_35=(Token)match(input,49,FOLLOW_49_in_rulePrimaryExpression3496); 

                        	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_6_6());
                        

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1668:3: ( ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=58 && LA29_0<=60)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1669:1: ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1669:1: ( (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1670:1: (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1670:1: (lv_isnull_36_1= 'is null' | lv_isnull_36_2= 'not null' | lv_isnull_36_3= 'notnull' )
                    int alt28=3;
                    switch ( input.LA(1) ) {
                    case 58:
                        {
                        alt28=1;
                        }
                        break;
                    case 59:
                        {
                        alt28=2;
                        }
                        break;
                    case 60:
                        {
                        alt28=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1671:3: lv_isnull_36_1= 'is null'
                            {
                            lv_isnull_36_1=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3518); 

                                    newLeafNode(lv_isnull_36_1, grammarAccess.getPrimaryExpressionAccess().getIsnullIsNullKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "isnull", true, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1683:8: lv_isnull_36_2= 'not null'
                            {
                            lv_isnull_36_2=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3547); 

                                    newLeafNode(lv_isnull_36_2, grammarAccess.getPrimaryExpressionAccess().getIsnullNotNullKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "isnull", true, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1695:8: lv_isnull_36_3= 'notnull'
                            {
                            lv_isnull_36_3=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression3576); 

                                    newLeafNode(lv_isnull_36_3, grammarAccess.getPrimaryExpressionAccess().getIsnullNotnullKeyword_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "isnull", true, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1718:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1719:2: (iv_ruleCase= ruleCase EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1720:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase3629);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase3639); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1727:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1730:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1731:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1731:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1731:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleCase3676); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1735:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1736:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1736:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1737:3: lv_whenExpression_1_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase3697);
            lv_whenExpression_1_0=ruleSqlExpression();

            state._fsp--;


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

            otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleCase3709); 

                	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1757:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1758:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1758:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1759:3: lv_thenExpression_3_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase3730);
            lv_thenExpression_3_0=ruleSqlExpression();

            state._fsp--;


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

             leaveRule(); 
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


    // $ANTLR start "entryRuleDDLStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1783:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1784:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1785:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
             newCompositeNode(grammarAccess.getDDLStatementRule()); 
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement3766);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;

             current =iv_ruleDDLStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement3776); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1792:1: ruleDDLStatement returns [EObject current=null] : ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) ) ;
    public final EObject ruleDDLStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_name_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_updateColumnNames_29_0=null;
        Token otherlv_30=null;
        Token lv_updateColumnNames_31_0=null;
        Token otherlv_32=null;
        Token lv_tableName_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token lv_name_48_0=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token lv_name_55_0=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token lv_name_61_0=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token lv_name_67_0=null;
        EObject lv_columnDefs_5_0 = null;

        EObject lv_columnDefs_7_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_selectStatement_16_0 = null;

        EObject lv_whenExpression_38_0 = null;

        EObject lv_statements_40_0 = null;

        EObject lv_statements_42_0 = null;

        EObject lv_clause_49_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1795:28: ( ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1796:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1796:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) )
            int alt43=7;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1796:2: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1796:2: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1796:3: () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1796:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1797:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getCreateTableStatementAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleDDLStatement3823); 

                        	newLeafNode(otherlv_1, grammarAccess.getDDLStatementAccess().getCreateKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleDDLStatement3835); 

                        	newLeafNode(otherlv_2, grammarAccess.getDDLStatementAccess().getTableKeyword_0_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1810:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1811:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1811:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1812:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement3852); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleDDLStatement3869); 

                        	newLeafNode(otherlv_4, grammarAccess.getDDLStatementAccess().getLeftParenthesisKeyword_0_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1832:1: ( (lv_columnDefs_5_0= ruleColumnDef ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1833:1: (lv_columnDefs_5_0= ruleColumnDef )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1833:1: (lv_columnDefs_5_0= ruleColumnDef )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1834:3: lv_columnDefs_5_0= ruleColumnDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getColumnDefsColumnDefParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnDef_in_ruleDDLStatement3890);
                    lv_columnDefs_5_0=ruleColumnDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"columnDefs",
                            		lv_columnDefs_5_0, 
                            		"ColumnDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1850:2: (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==55) ) {
                            int LA30_1 = input.LA(2);

                            if ( (LA30_1==RULE_ID) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1850:4: otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleDDLStatement3903); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDDLStatementAccess().getCommaKeyword_0_6_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1854:1: ( (lv_columnDefs_7_0= ruleColumnDef ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1855:1: (lv_columnDefs_7_0= ruleColumnDef )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1855:1: (lv_columnDefs_7_0= ruleColumnDef )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1856:3: lv_columnDefs_7_0= ruleColumnDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getColumnDefsColumnDefParserRuleCall_0_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColumnDef_in_ruleDDLStatement3924);
                    	    lv_columnDefs_7_0=ruleColumnDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
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
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1872:4: (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==55) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1872:6: otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleDDLStatement3939); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getDDLStatementAccess().getCommaKeyword_0_7_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1876:1: ( (lv_constraints_9_0= ruleTableConstraint ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1877:1: (lv_constraints_9_0= ruleTableConstraint )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1877:1: (lv_constraints_9_0= ruleTableConstraint )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1878:3: lv_constraints_9_0= ruleTableConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getConstraintsTableConstraintParserRuleCall_0_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleDDLStatement3960);
                    	    lv_constraints_9_0=ruleTableConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
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
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleDDLStatement3974); 

                        	newLeafNode(otherlv_10, grammarAccess.getDDLStatementAccess().getRightParenthesisKeyword_0_8());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1899:6: ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1899:6: ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1899:7: () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1899:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1900:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getCreateViewStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,63,FOLLOW_63_in_ruleDDLStatement4003); 

                        	newLeafNode(otherlv_12, grammarAccess.getDDLStatementAccess().getCreateKeyword_1_1());
                        
                    otherlv_13=(Token)match(input,65,FOLLOW_65_in_ruleDDLStatement4015); 

                        	newLeafNode(otherlv_13, grammarAccess.getDDLStatementAccess().getViewKeyword_1_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1913:1: ( (lv_name_14_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1914:1: (lv_name_14_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1914:1: (lv_name_14_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1915:3: lv_name_14_0= RULE_ID
                    {
                    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4032); 

                    			newLeafNode(lv_name_14_0, grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_14_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,57,FOLLOW_57_in_ruleDDLStatement4049); 

                        	newLeafNode(otherlv_15, grammarAccess.getDDLStatementAccess().getAsKeyword_1_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1935:1: ( (lv_selectStatement_16_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1936:1: (lv_selectStatement_16_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1936:1: (lv_selectStatement_16_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1937:3: lv_selectStatement_16_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getSelectStatementSelectStatementParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDDLStatement4070);
                    lv_selectStatement_16_0=ruleSelectStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"selectStatement",
                            		lv_selectStatement_16_0, 
                            		"SelectStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1954:6: ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1954:6: ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1954:7: () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1954:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1955:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getCreateTriggerStatementAction_2_0(),
                                current);
                        

                    }

                    otherlv_18=(Token)match(input,63,FOLLOW_63_in_ruleDDLStatement4099); 

                        	newLeafNode(otherlv_18, grammarAccess.getDDLStatementAccess().getCreateKeyword_2_1());
                        
                    otherlv_19=(Token)match(input,66,FOLLOW_66_in_ruleDDLStatement4111); 

                        	newLeafNode(otherlv_19, grammarAccess.getDDLStatementAccess().getTriggerKeyword_2_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1968:1: ( (lv_name_20_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1969:1: (lv_name_20_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1969:1: (lv_name_20_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1970:3: lv_name_20_0= RULE_ID
                    {
                    lv_name_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4128); 

                    			newLeafNode(lv_name_20_0, grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_20_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1986:2: (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )?
                    int alt32=4;
                    switch ( input.LA(1) ) {
                        case 67:
                            {
                            alt32=1;
                            }
                            break;
                        case 68:
                            {
                            alt32=2;
                            }
                            break;
                        case 69:
                            {
                            alt32=3;
                            }
                            break;
                    }

                    switch (alt32) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1986:4: otherlv_21= 'before'
                            {
                            otherlv_21=(Token)match(input,67,FOLLOW_67_in_ruleDDLStatement4146); 

                                	newLeafNode(otherlv_21, grammarAccess.getDDLStatementAccess().getBeforeKeyword_2_4_0());
                                

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1991:7: otherlv_22= 'after'
                            {
                            otherlv_22=(Token)match(input,68,FOLLOW_68_in_ruleDDLStatement4164); 

                                	newLeafNode(otherlv_22, grammarAccess.getDDLStatementAccess().getAfterKeyword_2_4_1());
                                

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1996:6: (otherlv_23= 'instead' otherlv_24= 'of' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1996:6: (otherlv_23= 'instead' otherlv_24= 'of' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1996:8: otherlv_23= 'instead' otherlv_24= 'of'
                            {
                            otherlv_23=(Token)match(input,69,FOLLOW_69_in_ruleDDLStatement4183); 

                                	newLeafNode(otherlv_23, grammarAccess.getDDLStatementAccess().getInsteadKeyword_2_4_2_0());
                                
                            otherlv_24=(Token)match(input,70,FOLLOW_70_in_ruleDDLStatement4195); 

                                	newLeafNode(otherlv_24, grammarAccess.getDDLStatementAccess().getOfKeyword_2_4_2_1());
                                

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2004:4: (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case 71:
                        {
                        alt35=1;
                        }
                        break;
                    case 72:
                        {
                        alt35=2;
                        }
                        break;
                    case 73:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2004:6: otherlv_25= 'delete'
                            {
                            otherlv_25=(Token)match(input,71,FOLLOW_71_in_ruleDDLStatement4211); 

                                	newLeafNode(otherlv_25, grammarAccess.getDDLStatementAccess().getDeleteKeyword_2_5_0());
                                

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2009:7: otherlv_26= 'insert'
                            {
                            otherlv_26=(Token)match(input,72,FOLLOW_72_in_ruleDDLStatement4229); 

                                	newLeafNode(otherlv_26, grammarAccess.getDDLStatementAccess().getInsertKeyword_2_5_1());
                                

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2014:6: (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2014:6: (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2014:8: otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )?
                            {
                            otherlv_27=(Token)match(input,73,FOLLOW_73_in_ruleDDLStatement4248); 

                                	newLeafNode(otherlv_27, grammarAccess.getDDLStatementAccess().getUpdateKeyword_2_5_2_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2018:1: (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==70) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2018:3: otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )*
                                    {
                                    otherlv_28=(Token)match(input,70,FOLLOW_70_in_ruleDDLStatement4261); 

                                        	newLeafNode(otherlv_28, grammarAccess.getDDLStatementAccess().getOfKeyword_2_5_2_1_0());
                                        
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2022:1: ( (lv_updateColumnNames_29_0= RULE_ID ) )
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2023:1: (lv_updateColumnNames_29_0= RULE_ID )
                                    {
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2023:1: (lv_updateColumnNames_29_0= RULE_ID )
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2024:3: lv_updateColumnNames_29_0= RULE_ID
                                    {
                                    lv_updateColumnNames_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4278); 

                                    			newLeafNode(lv_updateColumnNames_29_0, grammarAccess.getDDLStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_2_5_2_1_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                                    	        }
                                           		addWithLastConsumed(
                                           			current, 
                                           			"updateColumnNames",
                                            		lv_updateColumnNames_29_0, 
                                            		"ID");
                                    	    

                                    }


                                    }

                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2040:2: (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )*
                                    loop33:
                                    do {
                                        int alt33=2;
                                        int LA33_0 = input.LA(1);

                                        if ( (LA33_0==55) ) {
                                            alt33=1;
                                        }


                                        switch (alt33) {
                                    	case 1 :
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2040:4: otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) )
                                    	    {
                                    	    otherlv_30=(Token)match(input,55,FOLLOW_55_in_ruleDDLStatement4296); 

                                    	        	newLeafNode(otherlv_30, grammarAccess.getDDLStatementAccess().getCommaKeyword_2_5_2_1_2_0());
                                    	        
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2044:1: ( (lv_updateColumnNames_31_0= RULE_ID ) )
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2045:1: (lv_updateColumnNames_31_0= RULE_ID )
                                    	    {
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2045:1: (lv_updateColumnNames_31_0= RULE_ID )
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2046:3: lv_updateColumnNames_31_0= RULE_ID
                                    	    {
                                    	    lv_updateColumnNames_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4313); 

                                    	    			newLeafNode(lv_updateColumnNames_31_0, grammarAccess.getDDLStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_2_5_2_1_2_1_0()); 
                                    	    		

                                    	    	        if (current==null) {
                                    	    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                                    	    	        }
                                    	           		addWithLastConsumed(
                                    	           			current, 
                                    	           			"updateColumnNames",
                                    	            		lv_updateColumnNames_31_0, 
                                    	            		"ID");
                                    	    	    

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop33;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,74,FOLLOW_74_in_ruleDDLStatement4336); 

                        	newLeafNode(otherlv_32, grammarAccess.getDDLStatementAccess().getOnKeyword_2_6());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2066:1: ( (lv_tableName_33_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2067:1: (lv_tableName_33_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2067:1: (lv_tableName_33_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2068:3: lv_tableName_33_0= RULE_ID
                    {
                    lv_tableName_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4353); 

                    			newLeafNode(lv_tableName_33_0, grammarAccess.getDDLStatementAccess().getTableNameIDTerminalRuleCall_2_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tableName",
                            		lv_tableName_33_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2084:2: (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==75) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2084:4: otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row'
                            {
                            otherlv_34=(Token)match(input,75,FOLLOW_75_in_ruleDDLStatement4371); 

                                	newLeafNode(otherlv_34, grammarAccess.getDDLStatementAccess().getForKeyword_2_8_0());
                                
                            otherlv_35=(Token)match(input,76,FOLLOW_76_in_ruleDDLStatement4383); 

                                	newLeafNode(otherlv_35, grammarAccess.getDDLStatementAccess().getEachKeyword_2_8_1());
                                
                            otherlv_36=(Token)match(input,77,FOLLOW_77_in_ruleDDLStatement4395); 

                                	newLeafNode(otherlv_36, grammarAccess.getDDLStatementAccess().getRowKeyword_2_8_2());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2096:3: (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==61) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2096:5: otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) )
                            {
                            otherlv_37=(Token)match(input,61,FOLLOW_61_in_ruleDDLStatement4410); 

                                	newLeafNode(otherlv_37, grammarAccess.getDDLStatementAccess().getWhenKeyword_2_9_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2100:1: ( (lv_whenExpression_38_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2101:1: (lv_whenExpression_38_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2101:1: (lv_whenExpression_38_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2102:3: lv_whenExpression_38_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getDDLStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_2_9_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleDDLStatement4431);
                            lv_whenExpression_38_0=ruleSqlExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"whenExpression",
                                    		lv_whenExpression_38_0, 
                                    		"SqlExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_39=(Token)match(input,78,FOLLOW_78_in_ruleDDLStatement4445); 

                        	newLeafNode(otherlv_39, grammarAccess.getDDLStatementAccess().getBeginKeyword_2_10());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2122:1: ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=71 && LA39_0<=73)||LA39_0==84||LA39_0==106) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2122:2: ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )*
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2122:2: ( (lv_statements_40_0= ruleDMLStatement ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:1: (lv_statements_40_0= ruleDMLStatement )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:1: (lv_statements_40_0= ruleDMLStatement )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2124:3: lv_statements_40_0= ruleDMLStatement
                            {
                             
                            	        newCompositeNode(grammarAccess.getDDLStatementAccess().getStatementsDMLStatementParserRuleCall_2_11_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDMLStatement_in_ruleDDLStatement4467);
                            lv_statements_40_0=ruleDMLStatement();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"statements",
                                    		lv_statements_40_0, 
                                    		"DMLStatement");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_41=(Token)match(input,20,FOLLOW_20_in_ruleDDLStatement4479); 

                                	newLeafNode(otherlv_41, grammarAccess.getDDLStatementAccess().getSemicolonKeyword_2_11_1());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2144:1: ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( ((LA38_0>=71 && LA38_0<=73)||LA38_0==84||LA38_0==106) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2144:2: ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';'
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2144:2: ( (lv_statements_42_0= ruleDMLStatement ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2145:1: (lv_statements_42_0= ruleDMLStatement )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2145:1: (lv_statements_42_0= ruleDMLStatement )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2146:3: lv_statements_42_0= ruleDMLStatement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getStatementsDMLStatementParserRuleCall_2_11_2_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleDDLStatement4501);
                            	    lv_statements_42_0=ruleDMLStatement();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"statements",
                            	            		lv_statements_42_0, 
                            	            		"DMLStatement");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    otherlv_43=(Token)match(input,20,FOLLOW_20_in_ruleDDLStatement4513); 

                            	        	newLeafNode(otherlv_43, grammarAccess.getDDLStatementAccess().getSemicolonKeyword_2_11_2_1());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_44=(Token)match(input,54,FOLLOW_54_in_ruleDDLStatement4529); 

                        	newLeafNode(otherlv_44, grammarAccess.getDDLStatementAccess().getEndKeyword_2_12());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2171:6: ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2171:6: ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2171:7: () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2171:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2172:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getAlterTableStatementAction_3_0(),
                                current);
                        

                    }

                    otherlv_46=(Token)match(input,79,FOLLOW_79_in_ruleDDLStatement4558); 

                        	newLeafNode(otherlv_46, grammarAccess.getDDLStatementAccess().getAlterKeyword_3_1());
                        
                    otherlv_47=(Token)match(input,64,FOLLOW_64_in_ruleDDLStatement4570); 

                        	newLeafNode(otherlv_47, grammarAccess.getDDLStatementAccess().getTableKeyword_3_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2185:1: ( (lv_name_48_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2186:1: (lv_name_48_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2186:1: (lv_name_48_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2187:3: lv_name_48_0= RULE_ID
                    {
                    lv_name_48_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4587); 

                    			newLeafNode(lv_name_48_0, grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_48_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2203:2: ( (lv_clause_49_0= ruleAlterTableClause ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2204:1: (lv_clause_49_0= ruleAlterTableClause )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2204:1: (lv_clause_49_0= ruleAlterTableClause )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2205:3: lv_clause_49_0= ruleAlterTableClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getClauseAlterTableClauseParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlterTableClause_in_ruleDDLStatement4613);
                    lv_clause_49_0=ruleAlterTableClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDDLStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"clause",
                            		lv_clause_49_0, 
                            		"AlterTableClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2222:6: ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2222:6: ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2222:7: () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2222:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2223:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getDropTableStatementAction_4_0(),
                                current);
                        

                    }

                    otherlv_51=(Token)match(input,80,FOLLOW_80_in_ruleDDLStatement4642); 

                        	newLeafNode(otherlv_51, grammarAccess.getDDLStatementAccess().getDropKeyword_4_1());
                        
                    otherlv_52=(Token)match(input,64,FOLLOW_64_in_ruleDDLStatement4654); 

                        	newLeafNode(otherlv_52, grammarAccess.getDDLStatementAccess().getTableKeyword_4_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2236:1: (otherlv_53= 'if' otherlv_54= 'exists' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==81) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2236:3: otherlv_53= 'if' otherlv_54= 'exists'
                            {
                            otherlv_53=(Token)match(input,81,FOLLOW_81_in_ruleDDLStatement4667); 

                                	newLeafNode(otherlv_53, grammarAccess.getDDLStatementAccess().getIfKeyword_4_3_0());
                                
                            otherlv_54=(Token)match(input,51,FOLLOW_51_in_ruleDDLStatement4679); 

                                	newLeafNode(otherlv_54, grammarAccess.getDDLStatementAccess().getExistsKeyword_4_3_1());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2244:3: ( (lv_name_55_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2245:1: (lv_name_55_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2245:1: (lv_name_55_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2246:3: lv_name_55_0= RULE_ID
                    {
                    lv_name_55_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4698); 

                    			newLeafNode(lv_name_55_0, grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_4_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_55_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2263:6: ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2263:6: ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2263:7: () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2263:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2264:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getDropTriggerStatementAction_5_0(),
                                current);
                        

                    }

                    otherlv_57=(Token)match(input,80,FOLLOW_80_in_ruleDDLStatement4732); 

                        	newLeafNode(otherlv_57, grammarAccess.getDDLStatementAccess().getDropKeyword_5_1());
                        
                    otherlv_58=(Token)match(input,66,FOLLOW_66_in_ruleDDLStatement4744); 

                        	newLeafNode(otherlv_58, grammarAccess.getDDLStatementAccess().getTriggerKeyword_5_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2277:1: (otherlv_59= 'if' otherlv_60= 'exists' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==81) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2277:3: otherlv_59= 'if' otherlv_60= 'exists'
                            {
                            otherlv_59=(Token)match(input,81,FOLLOW_81_in_ruleDDLStatement4757); 

                                	newLeafNode(otherlv_59, grammarAccess.getDDLStatementAccess().getIfKeyword_5_3_0());
                                
                            otherlv_60=(Token)match(input,51,FOLLOW_51_in_ruleDDLStatement4769); 

                                	newLeafNode(otherlv_60, grammarAccess.getDDLStatementAccess().getExistsKeyword_5_3_1());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2285:3: ( (lv_name_61_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2286:1: (lv_name_61_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2286:1: (lv_name_61_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2287:3: lv_name_61_0= RULE_ID
                    {
                    lv_name_61_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4788); 

                    			newLeafNode(lv_name_61_0, grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_5_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_61_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2304:6: ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2304:6: ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2304:7: () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2304:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2305:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getDropViewStatementAction_6_0(),
                                current);
                        

                    }

                    otherlv_63=(Token)match(input,80,FOLLOW_80_in_ruleDDLStatement4822); 

                        	newLeafNode(otherlv_63, grammarAccess.getDDLStatementAccess().getDropKeyword_6_1());
                        
                    otherlv_64=(Token)match(input,65,FOLLOW_65_in_ruleDDLStatement4834); 

                        	newLeafNode(otherlv_64, grammarAccess.getDDLStatementAccess().getViewKeyword_6_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2318:1: (otherlv_65= 'if' otherlv_66= 'exists' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==81) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2318:3: otherlv_65= 'if' otherlv_66= 'exists'
                            {
                            otherlv_65=(Token)match(input,81,FOLLOW_81_in_ruleDDLStatement4847); 

                                	newLeafNode(otherlv_65, grammarAccess.getDDLStatementAccess().getIfKeyword_6_3_0());
                                
                            otherlv_66=(Token)match(input,51,FOLLOW_51_in_ruleDDLStatement4859); 

                                	newLeafNode(otherlv_66, grammarAccess.getDDLStatementAccess().getExistsKeyword_6_3_1());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2326:3: ( (lv_name_67_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2327:1: (lv_name_67_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2327:1: (lv_name_67_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2328:3: lv_name_67_0= RULE_ID
                    {
                    lv_name_67_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4878); 

                    			newLeafNode(lv_name_67_0, grammarAccess.getDDLStatementAccess().getNameIDTerminalRuleCall_6_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDDLStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_67_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleDMLStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2352:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2353:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2354:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
             newCompositeNode(grammarAccess.getDMLStatementRule()); 
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement4920);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;

             current =iv_ruleDMLStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement4930); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2361:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2364:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2365:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2365:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt44=1;
                }
                break;
            case 72:
            case 84:
                {
                alt44=2;
                }
                break;
            case 73:
                {
                alt44=3;
                }
                break;
            case 71:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2366:5: this_SelectStatement_0= ruleSelectStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement4977);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;

                     
                            current = this_SelectStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2376:5: this_InsertStatement_1= ruleInsertStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement5004);
                    this_InsertStatement_1=ruleInsertStatement();

                    state._fsp--;

                     
                            current = this_InsertStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2386:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement5031);
                    this_UpdateStatement_2=ruleUpdateStatement();

                    state._fsp--;

                     
                            current = this_UpdateStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2396:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement5058);
                    this_DeleteStatement_3=ruleDeleteStatement();

                    state._fsp--;

                     
                            current = this_DeleteStatement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2412:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2413:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2414:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement5093);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;

             current =iv_ruleDeleteStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement5103); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2421:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tableName_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2424:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2425:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2425:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2425:3: otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleDeleteStatement5140); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleDeleteStatement5152); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2433:1: ( (lv_tableName_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2434:1: (lv_tableName_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2434:1: (lv_tableName_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2435:3: lv_tableName_2_0= RULE_ID
            {
            lv_tableName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement5169); 

            			newLeafNode(lv_tableName_2_0, grammarAccess.getDeleteStatementAccess().getTableNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeleteStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tableName",
                    		lv_tableName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2451:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==83) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2451:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_83_in_ruleDeleteStatement5187); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2455:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2456:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2456:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2457:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement5208);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2481:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2482:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2483:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
             newCompositeNode(grammarAccess.getInsertStatementRule()); 
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement5246);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;

             current =iv_ruleInsertStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement5256); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2490:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_tableName_5_0=null;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2493:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2494:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2494:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2494:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2494:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            else if ( (LA47_0==84) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2494:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2494:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2494:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleInsertStatement5295); 

                        	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2498:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==47) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2498:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleInsertStatement5308); 

                                	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2502:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2503:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2503:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2504:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement5329);
                            lv_conflictResolution_2_0=ruleConflictResolution();

                            state._fsp--;


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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2521:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,84,FOLLOW_84_in_ruleInsertStatement5350); 

                        	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,85,FOLLOW_85_in_ruleInsertStatement5363); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2529:1: ( (lv_tableName_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2530:1: (lv_tableName_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2530:1: (lv_tableName_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2531:3: lv_tableName_5_0= RULE_ID
            {
            lv_tableName_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement5380); 

            			newLeafNode(lv_tableName_5_0, grammarAccess.getInsertStatementAccess().getTableNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInsertStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tableName",
                    		lv_tableName_5_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2547:2: (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2547:4: otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleInsertStatement5398); 

                        	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2551:1: ( (lv_columnNames_7_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2552:1: (lv_columnNames_7_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2552:1: (lv_columnNames_7_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2553:3: lv_columnNames_7_0= RULE_ID
                    {
                    lv_columnNames_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement5415); 

                    			newLeafNode(lv_columnNames_7_0, grammarAccess.getInsertStatementAccess().getColumnNamesIDTerminalRuleCall_3_1_0()); 
                    		

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2569:2: (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==55) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2569:4: otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleInsertStatement5433); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2573:1: ( (lv_columnNames_9_0= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:1: (lv_columnNames_9_0= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:1: (lv_columnNames_9_0= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2575:3: lv_columnNames_9_0= RULE_ID
                    	    {
                    	    lv_columnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement5450); 

                    	    			newLeafNode(lv_columnNames_9_0, grammarAccess.getInsertStatementAccess().getColumnNamesIDTerminalRuleCall_3_2_1_0()); 
                    	    		

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
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleInsertStatement5469); 

                        	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==86||LA52_0==106) ) {
                alt52=1;
            }
            else if ( (LA52_0==87) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==86) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==106) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,86,FOLLOW_86_in_ruleInsertStatement5486); 

                                	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                
                            otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleInsertStatement5498); 

                                	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2603:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2604:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2604:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2605:3: lv_expressions_13_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement5519);
                            lv_expressions_13_0=ruleSqlExpression();

                            state._fsp--;


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

                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2621:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==55) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2621:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,55,FOLLOW_55_in_ruleInsertStatement5532); 

                            	        	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	        
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2625:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2626:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2626:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2627:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement5553);
                            	    lv_expressions_15_0=ruleSqlExpression();

                            	    state._fsp--;


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
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,49,FOLLOW_49_in_ruleInsertStatement5567); 

                                	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2648:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2648:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2649:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2649:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2650:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement5595);
                            lv_selectStatement_17_0=ruleSelectStatement();

                            state._fsp--;


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
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2667:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2667:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2667:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,87,FOLLOW_87_in_ruleInsertStatement5615); 

                        	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                        
                    otherlv_19=(Token)match(input,86,FOLLOW_86_in_ruleInsertStatement5627); 

                        	newLeafNode(otherlv_19, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_1_1());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2683:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2684:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2685:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement5665);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement5675); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2692:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tableName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_conflictResolution_2_0 = null;

        EObject lv_updateColumnExpressions_5_0 = null;

        EObject lv_updateColumnExpressions_7_0 = null;

        EObject lv_whereExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2695:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2696:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2696:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2696:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleUpdateStatement5712); 

                	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2700:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2700:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleUpdateStatement5725); 

                        	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2704:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2705:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2705:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2706:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement5746);
                    lv_conflictResolution_2_0=ruleConflictResolution();

                    state._fsp--;


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
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2722:4: ( (lv_tableName_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2723:1: (lv_tableName_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2723:1: (lv_tableName_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2724:3: lv_tableName_3_0= RULE_ID
            {
            lv_tableName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement5765); 

            			newLeafNode(lv_tableName_3_0, grammarAccess.getUpdateStatementAccess().getTableNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUpdateStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tableName",
                    		lv_tableName_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_88_in_ruleUpdateStatement5782); 

                	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2744:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2745:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2745:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2746:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5803);
            lv_updateColumnExpressions_5_0=ruleUpdateColumnExpression();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2762:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==55) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2762:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleUpdateStatement5816); 

            	        	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2766:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2767:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2767:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2768:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5837);
            	    lv_updateColumnExpressions_7_0=ruleUpdateColumnExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2784:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==83) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2784:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,83,FOLLOW_83_in_ruleUpdateStatement5852); 

                        	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2788:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2789:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2789:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2790:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement5873);
                    lv_whereExpression_9_0=ruleSqlExpression();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2814:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2815:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2816:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression5911);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;

             current =iv_ruleUpdateColumnExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression5921); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2823:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token lv_columnName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2826:28: ( ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2827:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2827:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2827:2: ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2827:2: ( (lv_columnName_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2828:1: (lv_columnName_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2828:1: (lv_columnName_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2829:3: lv_columnName_0_0= RULE_ID
            {
            lv_columnName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression5963); 

            			newLeafNode(lv_columnName_0_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleUpdateColumnExpression5980); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2849:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2850:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2850:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2851:3: lv_expression_2_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression6001);
            lv_expression_2_0=ruleSqlExpression();

            state._fsp--;


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

             leaveRule(); 
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


    // $ANTLR start "entryRuleSelectStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2875:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2876:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2877:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement6037);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement6047); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2884:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_coreStatements_0_0 = null;

        EObject lv_coreStatements_2_0 = null;

        EObject lv_orderingTerms_5_0 = null;

        EObject lv_orderingTerms_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2887:28: ( ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2888:1: ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2888:1: ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2888:2: ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2888:2: ( (lv_coreStatements_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2889:1: (lv_coreStatements_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2889:1: (lv_coreStatements_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2890:3: lv_coreStatements_0_0= ruleSelectCore
            {
             
            	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreStatementsSelectCoreParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement6093);
            lv_coreStatements_0_0=ruleSelectCore();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            	        }
                   		add(
                   			current, 
                   			"coreStatements",
                    		lv_coreStatements_0_0, 
                    		"SelectCore");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2906:2: ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=102 && LA56_0<=105)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2907:5: ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSelectStatementAccess().getCompoundOperatorParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectStatement6110);
            	    ruleCompoundOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2914:1: ( (lv_coreStatements_2_0= ruleSelectCore ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2915:1: (lv_coreStatements_2_0= ruleSelectCore )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2915:1: (lv_coreStatements_2_0= ruleSelectCore )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2916:3: lv_coreStatements_2_0= ruleSelectCore
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreStatementsSelectCoreParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement6130);
            	    lv_coreStatements_2_0=ruleSelectCore();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"coreStatements",
            	            		lv_coreStatements_2_0, 
            	            		"SelectCore");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2932:4: (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==89) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2932:6: otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )*
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_89_in_ruleSelectStatement6145); 

                        	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getOrderKeyword_2_0());
                        
                    otherlv_4=(Token)match(input,90,FOLLOW_90_in_ruleSelectStatement6157); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getByKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2940:1: ( (lv_orderingTerms_5_0= ruleOrderingTerm ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2941:1: (lv_orderingTerms_5_0= ruleOrderingTerm )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2941:1: (lv_orderingTerms_5_0= ruleOrderingTerm )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2942:3: lv_orderingTerms_5_0= ruleOrderingTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderingTermsOrderingTermParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6178);
                    lv_orderingTerms_5_0=ruleOrderingTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"orderingTerms",
                            		lv_orderingTerms_5_0, 
                            		"OrderingTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2958:2: (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==55) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2958:4: otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) )
                    	    {
                    	    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleSelectStatement6191); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2962:1: ( (lv_orderingTerms_7_0= ruleOrderingTerm ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2963:1: (lv_orderingTerms_7_0= ruleOrderingTerm )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2963:1: (lv_orderingTerms_7_0= ruleOrderingTerm )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2964:3: lv_orderingTerms_7_0= ruleOrderingTerm
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderingTermsOrderingTermParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6212);
                    	    lv_orderingTerms_7_0=ruleOrderingTerm();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"orderingTerms",
                    	            		lv_orderingTerms_7_0, 
                    	            		"OrderingTerm");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleAlterTableClause"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2988:1: entryRuleAlterTableClause returns [EObject current=null] : iv_ruleAlterTableClause= ruleAlterTableClause EOF ;
    public final EObject entryRuleAlterTableClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2989:2: (iv_ruleAlterTableClause= ruleAlterTableClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2990:2: iv_ruleAlterTableClause= ruleAlterTableClause EOF
            {
             newCompositeNode(grammarAccess.getAlterTableClauseRule()); 
            pushFollow(FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause6252);
            iv_ruleAlterTableClause=ruleAlterTableClause();

            state._fsp--;

             current =iv_ruleAlterTableClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableClause6262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterTableClause"


    // $ANTLR start "ruleAlterTableClause"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2997:1: ruleAlterTableClause returns [EObject current=null] : ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) ;
    public final EObject ruleAlterTableClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_columnDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3000:28: ( ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3001:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3001:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==91) ) {
                alt59=1;
            }
            else if ( (LA59_0==92) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3001:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3001:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3001:3: () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3001:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3002:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableRenameClauseAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleAlterTableClause6309); 

                        	newLeafNode(otherlv_1, grammarAccess.getAlterTableClauseAccess().getRenameToKeyword_0_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3011:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3012:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3012:1: (lv_name_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3013:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableClause6326); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getAlterTableClauseAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlterTableClauseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3030:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3030:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3030:7: () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3030:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3031:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableAddColumnClauseAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,92,FOLLOW_92_in_ruleAlterTableClause6360); 

                        	newLeafNode(otherlv_4, grammarAccess.getAlterTableClauseAccess().getAddColumnKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3040:1: ( (lv_columnDef_5_0= ruleColumnDef ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3041:1: (lv_columnDef_5_0= ruleColumnDef )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3041:1: (lv_columnDef_5_0= ruleColumnDef )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3042:3: lv_columnDef_5_0= ruleColumnDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlterTableClauseAccess().getColumnDefColumnDefParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableClause6381);
                    lv_columnDef_5_0=ruleColumnDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAlterTableClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"columnDef",
                            		lv_columnDef_5_0, 
                            		"ColumnDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlterTableClause"


    // $ANTLR start "entryRuleColumnDef"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3066:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3067:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3068:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
             newCompositeNode(grammarAccess.getColumnDefRule()); 
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef6418);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;

             current =iv_ruleColumnDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef6428); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3075:1: ruleColumnDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_constraints_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3078:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3079:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3079:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3079:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3079:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3080:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3080:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3081:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef6470); 

            			newLeafNode(lv_name_0_0, grammarAccess.getColumnDefAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3097:2: ( (lv_type_1_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3098:1: (lv_type_1_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3098:1: (lv_type_1_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3099:3: lv_type_1_0= ruleColumnType
            {
             
            	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef6496);
            lv_type_1_0=ruleColumnType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ColumnType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3115:2: ( (lv_constraints_2_0= ruleColumnConstraint ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==50||LA60_0==87||LA60_0==93) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3116:1: (lv_constraints_2_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3116:1: (lv_constraints_2_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3117:3: lv_constraints_2_0= ruleColumnConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef6517);
            	    lv_constraints_2_0=ruleColumnConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_2_0, 
            	            		"ColumnConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3141:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3142:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3143:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
             newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint6554);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;

             current =iv_ruleColumnConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint6564); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3150:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) ) ;
    public final EObject ruleColumnConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;
        Token lv_autoincrement_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_conflictClause_9_0 = null;

        EObject lv_defaultValue_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3153:28: ( ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3154:1: ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3154:1: ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt64=1;
                }
                break;
            case 50:
                {
                alt64=2;
                }
                break;
            case 87:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3154:2: ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3154:2: ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3154:3: () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3154:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3155:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleColumnConstraint6611); 

                        	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,94,FOLLOW_94_in_ruleColumnConstraint6623); 

                        	newLeafNode(otherlv_2, grammarAccess.getColumnConstraintAccess().getKeyKeyword_0_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3168:1: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
                    int alt61=3;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==95) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==96) ) {
                        alt61=2;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3168:2: ( (lv_asc_3_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3168:2: ( (lv_asc_3_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3169:1: (lv_asc_3_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3169:1: (lv_asc_3_0= 'asc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3170:3: lv_asc_3_0= 'asc'
                            {
                            lv_asc_3_0=(Token)match(input,95,FOLLOW_95_in_ruleColumnConstraint6642); 

                                    newLeafNode(lv_asc_3_0, grammarAccess.getColumnConstraintAccess().getAscAscKeyword_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                            	        }
                                   		setWithLastConsumed(current, "asc", true, "asc");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3184:6: ( (lv_desc_4_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3184:6: ( (lv_desc_4_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3185:1: (lv_desc_4_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3185:1: (lv_desc_4_0= 'desc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3186:3: lv_desc_4_0= 'desc'
                            {
                            lv_desc_4_0=(Token)match(input,96,FOLLOW_96_in_ruleColumnConstraint6679); 

                                    newLeafNode(lv_desc_4_0, grammarAccess.getColumnConstraintAccess().getDescDescKeyword_0_3_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                            	        }
                                   		setWithLastConsumed(current, "desc", true, "desc");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3199:4: ( (lv_autoincrement_5_0= 'autoincrement' ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==97) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3200:1: (lv_autoincrement_5_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3200:1: (lv_autoincrement_5_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3201:3: lv_autoincrement_5_0= 'autoincrement'
                            {
                            lv_autoincrement_5_0=(Token)match(input,97,FOLLOW_97_in_ruleColumnConstraint6712); 

                                    newLeafNode(lv_autoincrement_5_0, grammarAccess.getColumnConstraintAccess().getAutoincrementAutoincrementKeyword_0_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                            	        }
                                   		setWithLastConsumed(current, "autoincrement", true, "autoincrement");
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3215:6: ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3215:6: ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3215:7: () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3215:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3216:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleColumnConstraint6755); 

                        	newLeafNode(otherlv_7, grammarAccess.getColumnConstraintAccess().getNotKeyword_1_1());
                        
                    otherlv_8=(Token)match(input,98,FOLLOW_98_in_ruleColumnConstraint6767); 

                        	newLeafNode(otherlv_8, grammarAccess.getColumnConstraintAccess().getNullKeyword_1_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3229:1: ( (lv_conflictClause_9_0= ruleConflictClause ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==74) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3230:1: (lv_conflictClause_9_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3230:1: (lv_conflictClause_9_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3231:3: lv_conflictClause_9_0= ruleConflictClause
                            {
                             
                            	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint6788);
                            lv_conflictClause_9_0=ruleConflictClause();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"conflictClause",
                                    		lv_conflictClause_9_0, 
                                    		"ConflictClause");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3248:6: ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3248:6: ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3248:7: () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3248:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3249:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_2_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,87,FOLLOW_87_in_ruleColumnConstraint6818); 

                        	newLeafNode(otherlv_11, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3258:1: ( (lv_defaultValue_12_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3259:1: (lv_defaultValue_12_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3259:1: (lv_defaultValue_12_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3260:3: lv_defaultValue_12_0= ruleDefaultValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint6839);
                    lv_defaultValue_12_0=ruleDefaultValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_12_0, 
                            		"DefaultValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleDefaultValue"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3284:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3285:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3286:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
             newCompositeNode(grammarAccess.getDefaultValueRule()); 
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue6876);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;

             current =iv_ruleDefaultValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue6886); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3293:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3296:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_NUMBER)||LA65_0==26||LA65_0==98||(LA65_0>=117 && LA65_0<=119)) ) {
                alt65=1;
            }
            else if ( (LA65_0==48) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3298:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3303:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3304:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3304:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3305:3: lv_literal_1_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue6942);
                    lv_literal_1_0=ruleLiteralValue();

                    state._fsp--;


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
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3322:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3322:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3322:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3322:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3323:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleDefaultValue6971); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3332:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3333:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3333:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3334:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue6992);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;


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

                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleDefaultValue7004); 

                        	newLeafNode(otherlv_5, grammarAccess.getDefaultValueAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleTableConstraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3362:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3363:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3364:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
             newCompositeNode(grammarAccess.getTableConstraintRule()); 
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint7041);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;

             current =iv_ruleTableConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint7051); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3371:1: ruleTableConstraint returns [EObject current=null] : ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token lv_name_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_columns_5_0 = null;

        EObject lv_columns_7_0 = null;

        EObject lv_conflictClause_9_0 = null;

        EObject lv_columns_16_0 = null;

        EObject lv_columns_18_0 = null;

        EObject lv_conflictClause_20_0 = null;

        EObject lv_expression_26_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3374:28: ( ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3375:1: ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3375:1: ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 100:
                        {
                        alt71=1;
                        }
                        break;
                    case 101:
                        {
                        alt71=3;
                        }
                        break;
                    case 93:
                        {
                        alt71=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 5, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
                }
                break;
            case 100:
                {
                alt71=1;
                }
                break;
            case 93:
                {
                alt71=2;
                }
                break;
            case 101:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3375:2: ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3375:2: ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3375:3: () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3375:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3376:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTableConstraintAccess().getUniqueTableContraintAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3381:2: (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==99) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3381:4: otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,99,FOLLOW_99_in_ruleTableConstraint7099); 

                                	newLeafNode(otherlv_1, grammarAccess.getTableConstraintAccess().getConstraintKeyword_0_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3385:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3386:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3386:1: (lv_name_2_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3387:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableConstraint7116); 

                            			newLeafNode(lv_name_2_0, grammarAccess.getTableConstraintAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTableConstraintRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,100,FOLLOW_100_in_ruleTableConstraint7135); 

                        	newLeafNode(otherlv_3, grammarAccess.getTableConstraintAccess().getUniqueKeyword_0_2());
                        
                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleTableConstraint7147); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableConstraintAccess().getLeftParenthesisKeyword_0_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3411:1: ( (lv_columns_5_0= ruleIndexedColumn ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3412:1: (lv_columns_5_0= ruleIndexedColumn )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3412:1: (lv_columns_5_0= ruleIndexedColumn )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3413:3: lv_columns_5_0= ruleIndexedColumn
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7168);
                    lv_columns_5_0=ruleIndexedColumn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableConstraintRule());
                    	        }
                           		add(
                           			current, 
                           			"columns",
                            		lv_columns_5_0, 
                            		"IndexedColumn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3429:2: (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==55) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3429:4: otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleTableConstraint7181); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTableConstraintAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3433:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3434:1: (lv_columns_7_0= ruleIndexedColumn )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3434:1: (lv_columns_7_0= ruleIndexedColumn )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3435:3: lv_columns_7_0= ruleIndexedColumn
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_0_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7202);
                    	    lv_columns_7_0=ruleIndexedColumn();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTableConstraintRule());
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
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleTableConstraint7216); 

                        	newLeafNode(otherlv_8, grammarAccess.getTableConstraintAccess().getRightParenthesisKeyword_0_6());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3455:1: ( (lv_conflictClause_9_0= ruleConflictClause ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3456:1: (lv_conflictClause_9_0= ruleConflictClause )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3456:1: (lv_conflictClause_9_0= ruleConflictClause )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3457:3: lv_conflictClause_9_0= ruleConflictClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConflictClause_in_ruleTableConstraint7237);
                    lv_conflictClause_9_0=ruleConflictClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"conflictClause",
                            		lv_conflictClause_9_0, 
                            		"ConflictClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3474:6: ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3474:6: ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3474:7: () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3474:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3475:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTableConstraintAccess().getPrimaryContraintAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3480:2: (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==99) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3480:4: otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) )
                            {
                            otherlv_11=(Token)match(input,99,FOLLOW_99_in_ruleTableConstraint7267); 

                                	newLeafNode(otherlv_11, grammarAccess.getTableConstraintAccess().getConstraintKeyword_1_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3484:1: ( (lv_name_12_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3485:1: (lv_name_12_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3485:1: (lv_name_12_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3486:3: lv_name_12_0= RULE_ID
                            {
                            lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableConstraint7284); 

                            			newLeafNode(lv_name_12_0, grammarAccess.getTableConstraintAccess().getNameIDTerminalRuleCall_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTableConstraintRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_12_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,93,FOLLOW_93_in_ruleTableConstraint7303); 

                        	newLeafNode(otherlv_13, grammarAccess.getTableConstraintAccess().getPrimaryKeyword_1_2());
                        
                    otherlv_14=(Token)match(input,94,FOLLOW_94_in_ruleTableConstraint7315); 

                        	newLeafNode(otherlv_14, grammarAccess.getTableConstraintAccess().getKeyKeyword_1_3());
                        
                    otherlv_15=(Token)match(input,48,FOLLOW_48_in_ruleTableConstraint7327); 

                        	newLeafNode(otherlv_15, grammarAccess.getTableConstraintAccess().getLeftParenthesisKeyword_1_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3514:1: ( (lv_columns_16_0= ruleIndexedColumn ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3515:1: (lv_columns_16_0= ruleIndexedColumn )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3515:1: (lv_columns_16_0= ruleIndexedColumn )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3516:3: lv_columns_16_0= ruleIndexedColumn
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7348);
                    lv_columns_16_0=ruleIndexedColumn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableConstraintRule());
                    	        }
                           		add(
                           			current, 
                           			"columns",
                            		lv_columns_16_0, 
                            		"IndexedColumn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3532:2: (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==55) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3532:4: otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) )
                    	    {
                    	    otherlv_17=(Token)match(input,55,FOLLOW_55_in_ruleTableConstraint7361); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getTableConstraintAccess().getCommaKeyword_1_6_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3536:1: ( (lv_columns_18_0= ruleIndexedColumn ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3537:1: (lv_columns_18_0= ruleIndexedColumn )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3537:1: (lv_columns_18_0= ruleIndexedColumn )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3538:3: lv_columns_18_0= ruleIndexedColumn
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_1_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7382);
                    	    lv_columns_18_0=ruleIndexedColumn();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTableConstraintRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"columns",
                    	            		lv_columns_18_0, 
                    	            		"IndexedColumn");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,49,FOLLOW_49_in_ruleTableConstraint7396); 

                        	newLeafNode(otherlv_19, grammarAccess.getTableConstraintAccess().getRightParenthesisKeyword_1_7());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3558:1: ( (lv_conflictClause_20_0= ruleConflictClause ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3559:1: (lv_conflictClause_20_0= ruleConflictClause )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3559:1: (lv_conflictClause_20_0= ruleConflictClause )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3560:3: lv_conflictClause_20_0= ruleConflictClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConflictClause_in_ruleTableConstraint7417);
                    lv_conflictClause_20_0=ruleConflictClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"conflictClause",
                            		lv_conflictClause_20_0, 
                            		"ConflictClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3577:6: ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3577:6: ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3577:7: () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3577:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3578:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTableConstraintAccess().getCheckTableConstraintAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3583:2: (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==99) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3583:4: otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) )
                            {
                            otherlv_22=(Token)match(input,99,FOLLOW_99_in_ruleTableConstraint7447); 

                                	newLeafNode(otherlv_22, grammarAccess.getTableConstraintAccess().getConstraintKeyword_2_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3587:1: ( (lv_name_23_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3588:1: (lv_name_23_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3588:1: (lv_name_23_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3589:3: lv_name_23_0= RULE_ID
                            {
                            lv_name_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableConstraint7464); 

                            			newLeafNode(lv_name_23_0, grammarAccess.getTableConstraintAccess().getNameIDTerminalRuleCall_2_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTableConstraintRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_23_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,101,FOLLOW_101_in_ruleTableConstraint7483); 

                        	newLeafNode(otherlv_24, grammarAccess.getTableConstraintAccess().getCheckKeyword_2_2());
                        
                    otherlv_25=(Token)match(input,48,FOLLOW_48_in_ruleTableConstraint7495); 

                        	newLeafNode(otherlv_25, grammarAccess.getTableConstraintAccess().getLeftParenthesisKeyword_2_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3613:1: ( (lv_expression_26_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3614:1: (lv_expression_26_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3614:1: (lv_expression_26_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3615:3: lv_expression_26_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleTableConstraint7516);
                    lv_expression_26_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_26_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_27=(Token)match(input,49,FOLLOW_49_in_ruleTableConstraint7528); 

                        	newLeafNode(otherlv_27, grammarAccess.getTableConstraintAccess().getRightParenthesisKeyword_2_5());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleIndexedColumn"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3643:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3644:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3645:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
             newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn7565);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;

             current =iv_ruleIndexedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn7575); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3652:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3655:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3656:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3656:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3656:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3656:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3657:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3657:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3658:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexedColumnRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn7620); 

            		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getNameColumnDefCrossReference_0_0()); 
            	

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3669:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==95) ) {
                alt72=1;
            }
            else if ( (LA72_0==96) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3669:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3669:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3670:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3670:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3671:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,95,FOLLOW_95_in_ruleIndexedColumn7639); 

                            newLeafNode(lv_asc_1_0, grammarAccess.getIndexedColumnAccess().getAscAscKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                    	        }
                           		setWithLastConsumed(current, "asc", true, "asc");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3685:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3685:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3686:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3686:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3687:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,96,FOLLOW_96_in_ruleIndexedColumn7676); 

                            newLeafNode(lv_desc_2_0, grammarAccess.getIndexedColumnAccess().getDescDescKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                    	        }
                           		setWithLastConsumed(current, "desc", true, "desc");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleCompoundOperator"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3708:1: entryRuleCompoundOperator returns [String current=null] : iv_ruleCompoundOperator= ruleCompoundOperator EOF ;
    public final String entryRuleCompoundOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundOperator = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3709:2: (iv_ruleCompoundOperator= ruleCompoundOperator EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3710:2: iv_ruleCompoundOperator= ruleCompoundOperator EOF
            {
             newCompositeNode(grammarAccess.getCompoundOperatorRule()); 
            pushFollow(FOLLOW_ruleCompoundOperator_in_entryRuleCompoundOperator7728);
            iv_ruleCompoundOperator=ruleCompoundOperator();

            state._fsp--;

             current =iv_ruleCompoundOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundOperator7739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundOperator"


    // $ANTLR start "ruleCompoundOperator"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3717:1: ruleCompoundOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' ) ;
    public final AntlrDatatypeRuleToken ruleCompoundOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3720:28: ( (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3721:1: (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3721:1: (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' )
            int alt73=4;
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
            case 105:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3722:2: kw= 'union all'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleCompoundOperator7777); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompoundOperatorAccess().getUnionAllKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3729:2: kw= 'union'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleCompoundOperator7796); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompoundOperatorAccess().getUnionKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3736:2: kw= 'intersect'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleCompoundOperator7815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompoundOperatorAccess().getIntersectKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3743:2: kw= 'except'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleCompoundOperator7834); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompoundOperatorAccess().getExceptKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleOrderingTerm"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3756:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3757:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3758:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
             newCompositeNode(grammarAccess.getOrderingTermRule()); 
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm7874);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;

             current =iv_ruleOrderingTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm7884); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3765:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3768:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3769:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3769:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3769:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3769:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3770:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3770:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3771:3: lv_expression_0_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm7930);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3787:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==95) ) {
                alt74=1;
            }
            else if ( (LA74_0==96) ) {
                alt74=2;
            }
            switch (alt74) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3787:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3787:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3788:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3788:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3789:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,95,FOLLOW_95_in_ruleOrderingTerm7949); 

                            newLeafNode(lv_asc_1_0, grammarAccess.getOrderingTermAccess().getAscAscKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrderingTermRule());
                    	        }
                           		setWithLastConsumed(current, "asc", true, "asc");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3803:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3803:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3804:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3804:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3805:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,96,FOLLOW_96_in_ruleOrderingTerm7986); 

                            newLeafNode(lv_desc_2_0, grammarAccess.getOrderingTermAccess().getDescDescKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrderingTermRule());
                    	        }
                           		setWithLastConsumed(current, "desc", true, "desc");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleSelectCore"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3826:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3827:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3828:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
             newCompositeNode(grammarAccess.getSelectCoreRule()); 
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore8037);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;

             current =iv_ruleSelectCore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore8047); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3835:1: ruleSelectCore returns [EObject current=null] : (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distinct_1_0=null;
        Token lv_all_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_resultColumns_3_0 = null;

        EObject lv_resultColumns_5_0 = null;

        EObject lv_source_7_0 = null;

        EObject lv_whereExpression_9_0 = null;

        EObject lv_groupByExpressions_12_0 = null;

        EObject lv_groupByExpressions_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3838:28: ( (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3839:1: (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3839:1: (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3839:3: otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )?
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleSelectCore8084); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectCoreAccess().getSelectKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3843:1: ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )?
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==107) ) {
                alt75=1;
            }
            else if ( (LA75_0==108) ) {
                alt75=2;
            }
            switch (alt75) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3843:2: ( (lv_distinct_1_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3843:2: ( (lv_distinct_1_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3844:1: (lv_distinct_1_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3844:1: (lv_distinct_1_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3845:3: lv_distinct_1_0= 'distinct'
                    {
                    lv_distinct_1_0=(Token)match(input,107,FOLLOW_107_in_ruleSelectCore8103); 

                            newLeafNode(lv_distinct_1_0, grammarAccess.getSelectCoreAccess().getDistinctDistinctKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectCoreRule());
                    	        }
                           		setWithLastConsumed(current, "distinct", true, "distinct");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3859:6: ( (lv_all_2_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3859:6: ( (lv_all_2_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3860:1: (lv_all_2_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3860:1: (lv_all_2_0= 'all' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3861:3: lv_all_2_0= 'all'
                    {
                    lv_all_2_0=(Token)match(input,108,FOLLOW_108_in_ruleSelectCore8140); 

                            newLeafNode(lv_all_2_0, grammarAccess.getSelectCoreAccess().getAllAllKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectCoreRule());
                    	        }
                           		setWithLastConsumed(current, "all", true, "all");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3874:4: ( (lv_resultColumns_3_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3875:1: (lv_resultColumns_3_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3875:1: (lv_resultColumns_3_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3876:3: lv_resultColumns_3_0= ruleResultColumn
            {
             
            	        newCompositeNode(grammarAccess.getSelectCoreAccess().getResultColumnsResultColumnParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectCore8176);
            lv_resultColumns_3_0=ruleResultColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	        }
                   		add(
                   			current, 
                   			"resultColumns",
                    		lv_resultColumns_3_0, 
                    		"ResultColumn");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3892:2: (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==55) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3892:4: otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) )
            	    {
            	    otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleSelectCore8189); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSelectCoreAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3896:1: ( (lv_resultColumns_5_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3897:1: (lv_resultColumns_5_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3897:1: (lv_resultColumns_5_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3898:3: lv_resultColumns_5_0= ruleResultColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getResultColumnsResultColumnParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectCore8210);
            	    lv_resultColumns_5_0=ruleResultColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resultColumns",
            	            		lv_resultColumns_5_0, 
            	            		"ResultColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3914:4: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==82) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3914:6: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,82,FOLLOW_82_in_ruleSelectCore8225); 

                        	newLeafNode(otherlv_6, grammarAccess.getSelectCoreAccess().getFromKeyword_4_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3918:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3919:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3919:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3920:3: lv_source_7_0= ruleJoinSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectCore8246);
                    lv_source_7_0=ruleJoinSource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
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
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3936:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==83) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3936:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,83,FOLLOW_83_in_ruleSelectCore8261); 

                        	newLeafNode(otherlv_8, grammarAccess.getSelectCoreAccess().getWhereKeyword_5_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3940:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3941:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3941:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3942:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getWhereExpressionSqlExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectCore8282);
                    lv_whereExpression_9_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
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
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3958:4: (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==109) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3958:6: otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )*
                    {
                    otherlv_10=(Token)match(input,109,FOLLOW_109_in_ruleSelectCore8297); 

                        	newLeafNode(otherlv_10, grammarAccess.getSelectCoreAccess().getGroupKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,90,FOLLOW_90_in_ruleSelectCore8309); 

                        	newLeafNode(otherlv_11, grammarAccess.getSelectCoreAccess().getByKeyword_6_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3966:1: ( (lv_groupByExpressions_12_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3967:1: (lv_groupByExpressions_12_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3967:1: (lv_groupByExpressions_12_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3968:3: lv_groupByExpressions_12_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getGroupByExpressionsSqlExpressionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectCore8330);
                    lv_groupByExpressions_12_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
                    	        }
                           		add(
                           			current, 
                           			"groupByExpressions",
                            		lv_groupByExpressions_12_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3984:2: (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==55) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3984:4: otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) )
                    	    {
                    	    otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleSelectCore8343); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getSelectCoreAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3988:1: ( (lv_groupByExpressions_14_0= ruleSqlExpression ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3989:1: (lv_groupByExpressions_14_0= ruleSqlExpression )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3989:1: (lv_groupByExpressions_14_0= ruleSqlExpression )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3990:3: lv_groupByExpressions_14_0= ruleSqlExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getGroupByExpressionsSqlExpressionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectCore8364);
                    	    lv_groupByExpressions_14_0=ruleSqlExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groupByExpressions",
                    	            		lv_groupByExpressions_14_0, 
                    	            		"SqlExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleJoinSource"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4014:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4015:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4016:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
             newCompositeNode(grammarAccess.getJoinSourceRule()); 
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource8404);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;

             current =iv_ruleJoinSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource8414); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4023:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4026:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4027:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4027:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4027:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4027:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4028:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4028:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4029:3: lv_source_0_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource8460);
            lv_source_0_0=ruleSingleSource();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4045:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( ((LA81_0>=110 && LA81_0<=111)||(LA81_0>=113 && LA81_0<=115)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4046:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4046:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4047:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource8481);
            	    lv_joinStatements_1_0=ruleJoinStatement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4071:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4072:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4073:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
             newCompositeNode(grammarAccess.getSingleSourceRule()); 
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource8518);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;

             current =iv_ruleSingleSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource8528); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4080:1: ruleSingleSource returns [EObject current=null] : ( ( () ( (lv_source_1_0= ruleTableSource ) ) ) | ( () otherlv_3= '(' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) otherlv_5= ')' ) | ( () otherlv_7= '(' ( (lv_joinSource_8_0= ruleJoinSource ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_source_1_0 = null;

        EObject lv_selectStatement_4_0 = null;

        EObject lv_joinSource_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4083:28: ( ( ( () ( (lv_source_1_0= ruleTableSource ) ) ) | ( () otherlv_3= '(' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) otherlv_5= ')' ) | ( () otherlv_7= '(' ( (lv_joinSource_8_0= ruleJoinSource ) ) otherlv_9= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4084:1: ( ( () ( (lv_source_1_0= ruleTableSource ) ) ) | ( () otherlv_3= '(' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) otherlv_5= ')' ) | ( () otherlv_7= '(' ( (lv_joinSource_8_0= ruleJoinSource ) ) otherlv_9= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4084:1: ( ( () ( (lv_source_1_0= ruleTableSource ) ) ) | ( () otherlv_3= '(' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) otherlv_5= ')' ) | ( () otherlv_7= '(' ( (lv_joinSource_8_0= ruleJoinSource ) ) otherlv_9= ')' ) )
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==48) ) {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==106) ) {
                    alt82=2;
                }
                else if ( (LA82_2==RULE_ID||LA82_2==48) ) {
                    alt82=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4084:2: ( () ( (lv_source_1_0= ruleTableSource ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4084:2: ( () ( (lv_source_1_0= ruleTableSource ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4084:3: () ( (lv_source_1_0= ruleTableSource ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4084:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4085:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceTableAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4090:2: ( (lv_source_1_0= ruleTableSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4091:1: (lv_source_1_0= ruleTableSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4091:1: (lv_source_1_0= ruleTableSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4092:3: lv_source_1_0= ruleTableSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleSourceAccess().getSourceTableSourceParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTableSource_in_ruleSingleSource8584);
                    lv_source_1_0=ruleTableSource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"source",
                            		lv_source_1_0, 
                            		"TableSource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4109:6: ( () otherlv_3= '(' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4109:6: ( () otherlv_3= '(' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4109:7: () otherlv_3= '(' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4109:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4110:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleSingleSource8613); 

                        	newLeafNode(otherlv_3, grammarAccess.getSingleSourceAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4119:1: ( (lv_selectStatement_4_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4120:1: (lv_selectStatement_4_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4120:1: (lv_selectStatement_4_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4121:3: lv_selectStatement_4_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleSourceAccess().getSelectStatementSelectStatementParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSource8634);
                    lv_selectStatement_4_0=ruleSelectStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"selectStatement",
                            		lv_selectStatement_4_0, 
                            		"SelectStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleSingleSource8646); 

                        	newLeafNode(otherlv_5, grammarAccess.getSingleSourceAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4142:6: ( () otherlv_7= '(' ( (lv_joinSource_8_0= ruleJoinSource ) ) otherlv_9= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4142:6: ( () otherlv_7= '(' ( (lv_joinSource_8_0= ruleJoinSource ) ) otherlv_9= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4142:7: () otherlv_7= '(' ( (lv_joinSource_8_0= ruleJoinSource ) ) otherlv_9= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4142:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4143:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceJoinAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleSingleSource8675); 

                        	newLeafNode(otherlv_7, grammarAccess.getSingleSourceAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4152:1: ( (lv_joinSource_8_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4153:1: (lv_joinSource_8_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4153:1: (lv_joinSource_8_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4154:3: lv_joinSource_8_0= ruleJoinSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleSourceAccess().getJoinSourceJoinSourceParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSource8696);
                    lv_joinSource_8_0=ruleJoinSource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"joinSource",
                            		lv_joinSource_8_0, 
                            		"JoinSource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleSingleSource8708); 

                        	newLeafNode(otherlv_9, grammarAccess.getSingleSourceAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleJoinStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4182:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4183:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4184:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
             newCompositeNode(grammarAccess.getJoinStatementRule()); 
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement8745);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;

             current =iv_ruleJoinStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement8755); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4191:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4194:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4195:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4195:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4195:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4195:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4196:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4201:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==110) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4202:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4202:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4203:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,110,FOLLOW_110_in_ruleJoinStatement8807); 

                            newLeafNode(lv_natural_1_0, grammarAccess.getJoinStatementAccess().getNaturalNaturalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "natural", true, "natural");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4216:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt85=4;
            switch ( input.LA(1) ) {
                case 111:
                    {
                    alt85=1;
                    }
                    break;
                case 113:
                    {
                    alt85=2;
                    }
                    break;
                case 114:
                    {
                    alt85=3;
                    }
                    break;
            }

            switch (alt85) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4216:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4216:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4216:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4216:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4217:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4217:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4218:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,111,FOLLOW_111_in_ruleJoinStatement8841); 

                            newLeafNode(lv_left_2_0, grammarAccess.getJoinStatementAccess().getLeftLeftKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "left", true, "left");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4231:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==112) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4232:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4232:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4233:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,112,FOLLOW_112_in_ruleJoinStatement8872); 

                                    newLeafNode(lv_outer_3_0, grammarAccess.getJoinStatementAccess().getOuterOuterKeyword_2_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getJoinStatementRule());
                            	        }
                                   		setWithLastConsumed(current, "outer", true, "outer");
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4247:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4247:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4248:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4248:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4249:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,113,FOLLOW_113_in_ruleJoinStatement8911); 

                            newLeafNode(lv_inner_4_0, grammarAccess.getJoinStatementAccess().getInnerInnerKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "inner", true, "inner");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4263:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4263:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4264:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4264:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4265:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,114,FOLLOW_114_in_ruleJoinStatement8948); 

                            newLeafNode(lv_cross_5_0, grammarAccess.getJoinStatementAccess().getCrossCrossKeyword_2_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "cross", true, "cross");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,115,FOLLOW_115_in_ruleJoinStatement8975); 

                	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4282:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4283:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4283:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4284:3: lv_singleSource_7_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement8996);
            lv_singleSource_7_0=ruleSingleSource();

            state._fsp--;


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

            otherlv_8=(Token)match(input,74,FOLLOW_74_in_ruleJoinStatement9008); 

                	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4304:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4305:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4305:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4306:3: lv_expression_9_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement9029);
            lv_expression_9_0=ruleSqlExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4330:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4331:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4332:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
             newCompositeNode(grammarAccess.getResultColumnRule()); 
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn9065);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;

             current =iv_ruleResultColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn9075); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4339:1: ruleResultColumn returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )? ) ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4342:28: ( ( ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )? ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4343:1: ( ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )? ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4343:1: ( ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )? ) )
            int alt88=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==EOF||(LA88_1>=20 && LA88_1<=21)||(LA88_1>=23 && LA88_1<=49)||LA88_1==55||(LA88_1>=57 && LA88_1<=60)||(LA88_1>=82 && LA88_1<=83)||LA88_1==89||(LA88_1>=102 && LA88_1<=105)||LA88_1==109||LA88_1==120) ) {
                    alt88=2;
                }
                else if ( (LA88_1==22) ) {
                    int LA88_4 = input.LA(3);

                    if ( ((LA88_4>=RULE_ID && LA88_4<=RULE_NUMBER)||LA88_4==26||LA88_4==48||(LA88_4>=50 && LA88_4<=52)||LA88_4==56||LA88_4==98||(LA88_4>=117 && LA88_4<=119)) ) {
                        alt88=2;
                    }
                    else if ( (LA88_4==EOF||LA88_4==20||LA88_4==49||LA88_4==55||(LA88_4>=82 && LA88_4<=83)||LA88_4==89||(LA88_4>=102 && LA88_4<=105)||LA88_4==109) ) {
                        alt88=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt88=1;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 26:
            case 48:
            case 50:
            case 51:
            case 52:
            case 56:
            case 98:
            case 117:
            case 118:
            case 119:
                {
                alt88=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4343:2: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '*' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4343:2: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '*' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4343:3: () ( (otherlv_1= RULE_ID ) )? otherlv_2= '*'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4343:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4344:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getResultColumnAccess().getResultColumnAllAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4349:2: ( (otherlv_1= RULE_ID ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_ID) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4350:1: (otherlv_1= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4350:1: (otherlv_1= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4351:3: otherlv_1= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getResultColumnRule());
                            	        }
                                    
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn9130); 

                            		newLeafNode(otherlv_1, grammarAccess.getResultColumnAccess().getTableTableSourceCrossReference_0_1_0()); 
                            	

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleResultColumn9143); 

                        	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsteriskKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4367:6: ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4367:6: ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4367:7: () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4367:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4368:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getResultColumnAccess().getResultColumnExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4373:2: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4374:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4374:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4375:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn9181);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResultColumnRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_4_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4391:2: (otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==57) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4391:4: otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleResultColumn9194); 

                                	newLeafNode(otherlv_5, grammarAccess.getResultColumnAccess().getAsKeyword_1_2_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4395:1: ( (lv_name_6_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4396:1: (lv_name_6_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4396:1: (lv_name_6_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4397:3: lv_name_6_0= RULE_ID
                            {
                            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn9211); 

                            			newLeafNode(lv_name_6_0, grammarAccess.getResultColumnAccess().getNameIDTerminalRuleCall_1_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getResultColumnRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_6_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleConflictClause"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4421:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4422:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4423:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
             newCompositeNode(grammarAccess.getConflictClauseRule()); 
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause9255);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;

             current =iv_ruleConflictClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause9265); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4430:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4433:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4434:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4434:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4434:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleConflictClause9302); 

                	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                
            otherlv_1=(Token)match(input,116,FOLLOW_116_in_ruleConflictClause9314); 

                	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4442:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4443:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4443:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4444:3: lv_resolution_2_0= ruleConflictResolution
            {
             
            	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause9335);
            lv_resolution_2_0=ruleConflictResolution();

            state._fsp--;


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

             leaveRule(); 
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


    // $ANTLR start "entryRuleLiteralValue"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4468:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4469:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4470:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue9371);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;

             current =iv_ruleLiteralValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue9381); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4477:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4480:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4481:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4481:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            int alt89=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 26:
                {
                alt89=1;
                }
                break;
            case RULE_STRING:
                {
                alt89=2;
                }
                break;
            case 98:
                {
                alt89=3;
                }
                break;
            case 117:
                {
                alt89=4;
                }
                break;
            case 118:
                {
                alt89=5;
                }
                break;
            case 119:
                {
                alt89=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4481:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4481:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4481:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4481:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4482:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4487:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4488:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4488:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4489:3: lv_number_1_0= ruleSignedNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue9437);
                    lv_number_1_0=ruleSignedNumber();

                    state._fsp--;


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
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4506:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4506:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4506:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4506:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4507:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4512:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4513:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4513:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4514:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue9471); 

                    			newLeafNode(lv_literal_3_0, grammarAccess.getLiteralValueAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
                    		

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
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4531:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4531:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4531:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4531:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4532:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4537:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4538:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4538:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4539:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,98,FOLLOW_98_in_ruleLiteralValue9511); 

                            newLeafNode(lv_literal_5_0, grammarAccess.getLiteralValueAccess().getLiteralNullKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralValueRule());
                    	        }
                           		setWithLastConsumed(current, "literal", lv_literal_5_0, "null");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4553:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4553:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4553:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4553:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4554:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4559:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4560:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4560:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4561:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,117,FOLLOW_117_in_ruleLiteralValue9559); 

                            newLeafNode(lv_literal_7_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_timeKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralValueRule());
                    	        }
                           		setWithLastConsumed(current, "literal", lv_literal_7_0, "current_time");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4575:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4575:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4575:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4575:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4576:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4581:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4583:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,118,FOLLOW_118_in_ruleLiteralValue9607); 

                            newLeafNode(lv_literal_9_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_dateKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralValueRule());
                    	        }
                           		setWithLastConsumed(current, "literal", lv_literal_9_0, "current_date");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4597:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4597:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4597:7: () ( (lv_literal_11_0= 'current_time_stamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4597:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4598:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4603:2: ( (lv_literal_11_0= 'current_time_stamp' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4604:1: (lv_literal_11_0= 'current_time_stamp' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4604:1: (lv_literal_11_0= 'current_time_stamp' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4605:3: lv_literal_11_0= 'current_time_stamp'
                    {
                    lv_literal_11_0=(Token)match(input,119,FOLLOW_119_in_ruleLiteralValue9655); 

                            newLeafNode(lv_literal_11_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_time_stampKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralValueRule());
                    	        }
                           		setWithLastConsumed(current, "literal", lv_literal_11_0, "current_time_stamp");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4626:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4627:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4628:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
             newCompositeNode(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber9706);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;

             current =iv_ruleSignedNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber9717); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4635:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4638:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4639:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4639:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4639:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4639:2: (kw= '-' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==26) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4640:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleSignedNumber9756); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber9773); 

            		current.merge(this_NUMBER_1);
                
             
                newLeafNode(this_NUMBER_1, grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4660:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4661:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4662:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN9819);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN9830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4669:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4672:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4673:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4673:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4673:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN9870); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4680:1: (kw= '.' this_ID_2= RULE_ID )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==120) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4681:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,120,FOLLOW_120_in_ruleFQN9889); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN9904); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleTableSource"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4701:1: entryRuleTableSource returns [EObject current=null] : iv_ruleTableSource= ruleTableSource EOF ;
    public final EObject entryRuleTableSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4702:2: (iv_ruleTableSource= ruleTableSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4703:2: iv_ruleTableSource= ruleTableSource EOF
            {
             newCompositeNode(grammarAccess.getTableSourceRule()); 
            pushFollow(FOLLOW_ruleTableSource_in_entryRuleTableSource9951);
            iv_ruleTableSource=ruleTableSource();

            state._fsp--;

             current =iv_ruleTableSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableSource9961); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableSource"


    // $ANTLR start "ruleTableSource"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4710:1: ruleTableSource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_tableAlias_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleTableSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tableAlias_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4713:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_tableAlias_2_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4714:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_tableAlias_2_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4714:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_tableAlias_2_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4714:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_tableAlias_2_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4714:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4715:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4715:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4716:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTableSourceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableSource10006); 

            		newLeafNode(otherlv_0, grammarAccess.getTableSourceAccess().getTableCreateTableStatementCrossReference_0_0()); 
            	

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4727:2: (otherlv_1= 'as' ( (lv_tableAlias_2_0= RULE_ID ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==57) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4727:4: otherlv_1= 'as' ( (lv_tableAlias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleTableSource10019); 

                        	newLeafNode(otherlv_1, grammarAccess.getTableSourceAccess().getAsKeyword_1_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4731:1: ( (lv_tableAlias_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4732:1: (lv_tableAlias_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4732:1: (lv_tableAlias_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4733:3: lv_tableAlias_2_0= RULE_ID
                    {
                    lv_tableAlias_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableSource10036); 

                    			newLeafNode(lv_tableAlias_2_0, grammarAccess.getTableSourceAccess().getTableAliasIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableSourceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tableAlias",
                            		lv_tableAlias_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableSource"


    // $ANTLR start "ruleColumnType"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4757:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4759:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4760:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4760:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt93=5;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt93=1;
                }
                break;
            case 122:
                {
                alt93=2;
                }
                break;
            case 123:
                {
                alt93=3;
                }
                break;
            case 124:
                {
                alt93=4;
                }
                break;
            case 125:
                {
                alt93=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4760:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4760:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4760:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_121_in_ruleColumnType10093); 

                            current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4766:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4766:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4766:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_122_in_ruleColumnType10110); 

                            current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4772:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4772:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4772:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_123_in_ruleColumnType10127); 

                            current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4778:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4778:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4778:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_124_in_ruleColumnType10144); 

                            current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4784:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4784:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4784:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,125,FOLLOW_125_in_ruleColumnType10161); 

                            current = grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "ruleSqliteDataType"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4794:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4796:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4797:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4797:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt94=6;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt94=1;
                }
                break;
            case 122:
                {
                alt94=2;
                }
                break;
            case 123:
                {
                alt94=3;
                }
                break;
            case 124:
                {
                alt94=4;
                }
                break;
            case 126:
                {
                alt94=5;
                }
                break;
            case 127:
                {
                alt94=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4797:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4797:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4797:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_121_in_ruleSqliteDataType10206); 

                            current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4803:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4803:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4803:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_122_in_ruleSqliteDataType10223); 

                            current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4809:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4809:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4809:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_123_in_ruleSqliteDataType10240); 

                            current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4815:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4815:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4815:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_124_in_ruleSqliteDataType10257); 

                            current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4821:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4821:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4821:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,126,FOLLOW_126_in_ruleSqliteDataType10274); 

                            current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4827:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4827:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4827:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,127,FOLLOW_127_in_ruleSqliteDataType10291); 

                            current = grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "ruleConflictResolution"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4837:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4839:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4840:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4840:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt95=5;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt95=1;
                }
                break;
            case 129:
                {
                alt95=2;
                }
                break;
            case 130:
                {
                alt95=3;
                }
                break;
            case 131:
                {
                alt95=4;
                }
                break;
            case 84:
                {
                alt95=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4840:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4840:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4840:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_128_in_ruleConflictResolution10336); 

                            current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4846:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4846:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4846:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_129_in_ruleConflictResolution10353); 

                            current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4852:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4852:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4852:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_130_in_ruleConflictResolution10370); 

                            current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4858:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4858:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4858:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,131,FOLLOW_131_in_ruleConflictResolution10387); 

                            current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4864:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4864:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4864:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_84_in_ruleConflictResolution10404); 

                            current = grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\1\uffff\1\10\10\uffff";
    static final String DFA27_minS =
        "\1\4\1\24\1\uffff\1\4\6\uffff";
    static final String DFA27_maxS =
        "\1\167\1\170\1\uffff\1\167\6\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\7\1\6\1\1\1\3";
    static final String DFA27_specialS =
        "\12\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\2\2\23\uffff\1\2\25\uffff\1\3\1\uffff\2\4\1\5\3\uffff\1"+
            "\6\51\uffff\1\2\22\uffff\3\2",
            "\34\10\1\7\1\10\3\uffff\3\10\1\uffff\6\10\17\uffff\1\10\3\uffff"+
            "\2\10\5\uffff\1\10\5\uffff\2\10\5\uffff\4\10\3\uffff\3\10\1"+
            "\uffff\3\10\4\uffff\1\10",
            "",
            "\3\11\23\uffff\1\11\25\uffff\1\11\1\uffff\3\11\3\uffff\1\11"+
            "\51\uffff\1\11\7\uffff\1\4\12\uffff\3\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1299:2: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) )";
        }
    }
    static final String DFA43_eotS =
        "\12\uffff";
    static final String DFA43_eofS =
        "\12\uffff";
    static final String DFA43_minS =
        "\1\77\1\100\1\uffff\1\100\6\uffff";
    static final String DFA43_maxS =
        "\1\120\1\102\1\uffff\1\102\6\uffff";
    static final String DFA43_acceptS =
        "\2\uffff\1\4\1\uffff\1\1\1\2\1\3\1\6\1\5\1\7";
    static final String DFA43_specialS =
        "\12\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\17\uffff\1\2\1\3",
            "\1\4\1\5\1\6",
            "",
            "\1\10\1\11\1\7",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1796:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleDatabaseBlock_in_ruleModel164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabaseBlock_in_entryRuleDatabaseBlock200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseBlock210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDatabaseBlock247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabaseBlock264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDatabaseBlock281 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_ruleDatabaseBlock302 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock324 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleDatabaseBlock337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_entryRuleConfigBlock373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigBlock383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConfigBlock429 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConfigBlock441 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_ruleConfigurationStatement_in_ruleConfigBlock462 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_15_in_ruleConfigBlock475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationStatement_in_entryRuleConfigurationStatement511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationStatement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleConfigurationStatement568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationStatement585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationStatement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleConfigurationStatement641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationStatement658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock756 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock768 = new BitSet(new long[]{0x8000000000008000L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock790 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationBlock802 = new BitSet(new long[]{0x8000000000008000L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock824 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationBlock836 = new BitSet(new long[]{0x8000000000008000L,0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1035 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleExprConcat1062 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1096 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1191 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_22_in_ruleExprMult1220 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_23_in_ruleExprMult1249 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_24_in_ruleExprMult1278 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1315 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1410 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleExprAdd1439 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_26_in_ruleExprAdd1468 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1505 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1600 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_27_in_ruleExprBit1629 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_28_in_ruleExprBit1658 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_29_in_ruleExprBit1687 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_30_in_ruleExprBit1716 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1753 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate1848 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_31_in_ruleExprRelate1877 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_32_in_ruleExprRelate1906 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_33_in_ruleExprRelate1935 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_34_in_ruleExprRelate1964 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2001 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2096 = new BitSet(new long[]{0x00003FF800000002L});
    public static final BitSet FOLLOW_35_in_ruleExprEqual2125 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_36_in_ruleExprEqual2154 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_37_in_ruleExprEqual2183 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_38_in_ruleExprEqual2212 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2241 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2270 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2299 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2328 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2357 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2386 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual2415 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2452 = new BitSet(new long[]{0x00003FF800000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2547 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExprAnd2574 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2608 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleExprOr2703 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleExprOr2730 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleExprOr2764 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimaryExpression2869 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression2907 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_48_in_rulePrimaryExpression2927 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression2949 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_rulePrimaryExpression2960 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrimaryExpression2995 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3027 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePrimaryExpression3053 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3074 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_rulePrimaryExpression3086 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimaryExpression3115 = new BitSet(new long[]{0x211D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3136 = new BitSet(new long[]{0x211D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression3158 = new BitSet(new long[]{0x217D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression3179 = new BitSet(new long[]{0x217D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3193 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3214 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3228 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3262 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePrimaryExpression3279 = new BitSet(new long[]{0x011D000004400070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression3298 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3339 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3352 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3373 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_49_in_rulePrimaryExpression3389 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3418 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_rulePrimaryExpression3430 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3451 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3463 = new BitSet(new long[]{0x0000000000000000L,0xDE00000000000000L});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression3484 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_rulePrimaryExpression3496 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase3629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCase3676 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase3697 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCase3709 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement3766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDDLStatement3823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDDLStatement3835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement3852 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleDDLStatement3869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleDDLStatement3890 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_55_in_ruleDDLStatement3903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleDDLStatement3924 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_55_in_ruleDDLStatement3939 = new BitSet(new long[]{0x0000000000000000L,0x0000003820000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleDDLStatement3960 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_49_in_ruleDDLStatement3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDDLStatement4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDDLStatement4015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4032 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDDLStatement4049 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDDLStatement4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDDLStatement4099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleDDLStatement4111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4128 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003B8L});
    public static final BitSet FOLLOW_67_in_ruleDDLStatement4146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_68_in_ruleDDLStatement4164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_69_in_ruleDDLStatement4183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleDDLStatement4195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_71_in_ruleDDLStatement4211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_72_in_ruleDDLStatement4229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_73_in_ruleDDLStatement4248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000440L});
    public static final BitSet FOLLOW_70_in_ruleDDLStatement4261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4278 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_55_in_ruleDDLStatement4296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4313 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleDDLStatement4336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4353 = new BitSet(new long[]{0x2000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_75_in_ruleDDLStatement4371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleDDLStatement4383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleDDLStatement4395 = new BitSet(new long[]{0x2000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61_in_ruleDDLStatement4410 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDDLStatement4431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleDDLStatement4445 = new BitSet(new long[]{0x0040000000000000L,0x0000040000100380L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleDDLStatement4467 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDDLStatement4479 = new BitSet(new long[]{0x0040000000000000L,0x0000040000100380L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleDDLStatement4501 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDDLStatement4513 = new BitSet(new long[]{0x0040000000000000L,0x0000040000100380L});
    public static final BitSet FOLLOW_54_in_ruleDDLStatement4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDDLStatement4558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDDLStatement4570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4587 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_ruleDDLStatement4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDDLStatement4642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDDLStatement4654 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleDDLStatement4667 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDDLStatement4679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDDLStatement4732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleDDLStatement4744 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleDDLStatement4757 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDDLStatement4769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDDLStatement4822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDDLStatement4834 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleDDLStatement4847 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDDLStatement4859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement4920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement5093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDeleteStatement5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleDeleteStatement5152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement5169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleDeleteStatement5187 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement5246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleInsertStatement5295 = new BitSet(new long[]{0x0000800000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_47_in_ruleInsertStatement5308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement5329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_84_in_ruleInsertStatement5350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleInsertStatement5363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement5380 = new BitSet(new long[]{0x0001000000000000L,0x0000040000C00000L});
    public static final BitSet FOLLOW_48_in_ruleInsertStatement5398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement5415 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInsertStatement5433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement5450 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_49_in_ruleInsertStatement5469 = new BitSet(new long[]{0x0000000000000000L,0x0000040000C00000L});
    public static final BitSet FOLLOW_86_in_ruleInsertStatement5486 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInsertStatement5498 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement5519 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_55_in_ruleInsertStatement5532 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement5553 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_49_in_ruleInsertStatement5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleInsertStatement5615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleInsertStatement5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement5665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUpdateStatement5712 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_47_in_ruleUpdateStatement5725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement5746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement5765 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleUpdateStatement5782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5803 = new BitSet(new long[]{0x0080000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_55_in_ruleUpdateStatement5816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5837 = new BitSet(new long[]{0x0080000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleUpdateStatement5852 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression5911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression5963 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleUpdateColumnExpression5980 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement6037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement6093 = new BitSet(new long[]{0x0000000000000002L,0x000003C002000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectStatement6110 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement6130 = new BitSet(new long[]{0x0000000000000002L,0x000003C002000000L});
    public static final BitSet FOLLOW_89_in_ruleSelectStatement6145 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleSelectStatement6157 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6178 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSelectStatement6191 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6212 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause6252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableClause6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAlterTableClause6309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableClause6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleAlterTableClause6360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableClause6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef6418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef6470 = new BitSet(new long[]{0x0000000000000000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef6496 = new BitSet(new long[]{0x0004000000000002L,0x0000000020800000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef6517 = new BitSet(new long[]{0x0004000000000002L,0x0000000020800000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint6554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleColumnConstraint6611 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleColumnConstraint6623 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_95_in_ruleColumnConstraint6642 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_96_in_ruleColumnConstraint6679 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleColumnConstraint6712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleColumnConstraint6755 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleColumnConstraint6767 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleColumnConstraint6818 = new BitSet(new long[]{0x0001000004000060L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue6876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDefaultValue6971 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue6992 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleDefaultValue7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint7041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTableConstraint7099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableConstraint7116 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleTableConstraint7135 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTableConstraint7147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7168 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTableConstraint7181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7202 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTableConstraint7216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleTableConstraint7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTableConstraint7267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableConstraint7284 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleTableConstraint7303 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleTableConstraint7315 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTableConstraint7327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7348 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTableConstraint7361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7382 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTableConstraint7396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleTableConstraint7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTableConstraint7447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableConstraint7464 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleTableConstraint7483 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTableConstraint7495 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleTableConstraint7516 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTableConstraint7528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn7565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn7620 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_95_in_ruleIndexedColumn7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleIndexedColumn7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_entryRuleCompoundOperator7728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundOperator7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleCompoundOperator7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleCompoundOperator7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleCompoundOperator7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCompoundOperator7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm7874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm7930 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_95_in_ruleOrderingTerm7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOrderingTerm7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore8037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleSelectCore8084 = new BitSet(new long[]{0x011D000004400070L,0x00E0180400000000L});
    public static final BitSet FOLLOW_107_in_ruleSelectCore8103 = new BitSet(new long[]{0x011D000004400070L,0x00E0180400000000L});
    public static final BitSet FOLLOW_108_in_ruleSelectCore8140 = new BitSet(new long[]{0x011D000004400070L,0x00E0180400000000L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectCore8176 = new BitSet(new long[]{0x0080000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_55_in_ruleSelectCore8189 = new BitSet(new long[]{0x011D000004400070L,0x00E0180400000000L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectCore8210 = new BitSet(new long[]{0x0080000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleSelectCore8225 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectCore8246 = new BitSet(new long[]{0x0000000000000002L,0x0000200000080000L});
    public static final BitSet FOLLOW_83_in_ruleSelectCore8261 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectCore8282 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleSelectCore8297 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleSelectCore8309 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectCore8330 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSelectCore8343 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectCore8364 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource8404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource8460 = new BitSet(new long[]{0x0000000000000002L,0x000EC00000000000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource8481 = new BitSet(new long[]{0x0000000000000002L,0x000EC00000000000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource8518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableSource_in_ruleSingleSource8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSingleSource8613 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSource8634 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleSingleSource8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSingleSource8675 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSource8696 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleSingleSource8708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement8745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleJoinStatement8807 = new BitSet(new long[]{0x0000000000000000L,0x000E800000000000L});
    public static final BitSet FOLLOW_111_in_ruleJoinStatement8841 = new BitSet(new long[]{0x0000000000000000L,0x0009000000000000L});
    public static final BitSet FOLLOW_112_in_ruleJoinStatement8872 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_113_in_ruleJoinStatement8911 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_114_in_ruleJoinStatement8948 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleJoinStatement8975 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement8996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleJoinStatement9008 = new BitSet(new long[]{0x011D000004000070L,0x00E0000400000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn9065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn9130 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleResultColumn9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn9181 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleResultColumn9194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause9255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleConflictClause9302 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleConflictClause9314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue9371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue9471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleLiteralValue9511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleLiteralValue9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleLiteralValue9607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleLiteralValue9655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber9706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSignedNumber9756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN9819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN9830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN9870 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleFQN9889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN9904 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleTableSource_in_entryRuleTableSource9951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableSource9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableSource10006 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTableSource10019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableSource10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleColumnType10093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleColumnType10110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleColumnType10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleColumnType10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleColumnType10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleSqliteDataType10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleSqliteDataType10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSqliteDataType10240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSqliteDataType10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleSqliteDataType10274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSqliteDataType10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleConflictResolution10336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleConflictResolution10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleConflictResolution10370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleConflictResolution10387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleConflictResolution10404 = new BitSet(new long[]{0x0000000000000002L});

}