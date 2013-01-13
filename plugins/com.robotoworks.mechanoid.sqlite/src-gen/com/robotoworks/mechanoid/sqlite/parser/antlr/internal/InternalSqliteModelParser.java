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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'action'", "'migration'", "';'", "'||'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'('", "')'", "'not'", "'exists'", "'case'", "'else'", "'end'", "','", "'cast'", "'as'", "'when'", "'then'", "'create'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead'", "'of'", "'delete'", "'insert'", "'update'", "'on'", "'for'", "'each'", "'row'", "'begin'", "'alter'", "'drop'", "'if'", "'from'", "'where'", "'replace'", "'into'", "'values'", "'default'", "'set'", "'order'", "'by'", "'rename to'", "'add column'", "'primary'", "'key'", "'asc'", "'desc'", "'autoincrement'", "'constraint'", "'unique'", "'check'", "'union all'", "'union'", "'intersect'", "'except'", "'select'", "'distinct'", "'all'", "'group'", "'having'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'conflict'", "'null'", "'current_time'", "'current_date'", "'current_time_stamp'", "'.'", "'text'", "'integer'", "'real'", "'blob'", "'boolean'", "'none'", "'numeric'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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

                if ( (LA2_0==18) ) {
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

                if ( (LA3_0==17) ) {
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:282:1: ruleConfigurationStatement returns [EObject current=null] : ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigurationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_path_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:285:28: ( ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:1: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:1: ( () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:2: () otherlv_1= 'action' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:286:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:287:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigurationStatementAccess().getActionStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleConfigurationStatement567); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationStatementAccess().getActionKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:296:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:297:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:297:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:298:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationStatement584); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConfigurationStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            		

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
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationStatement606); 

            			newLeafNode(lv_path_3_0, grammarAccess.getConfigurationStatementAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            		

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:340:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:341:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:342:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
             newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock647);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;

             current =iv_ruleMigrationBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock657); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:349:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:352:28: ( ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:2: () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )? otherlv_7= '}'
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMigrationBlock703); 

                	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrationKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMigrationBlock715); 

                	newLeafNode(otherlv_2, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:367:1: ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==62||(LA5_0>=78 && LA5_0<=79)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:367:2: ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:367:2: ( (lv_statements_3_0= ruleDDLStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:368:1: (lv_statements_3_0= ruleDDLStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:368:1: (lv_statements_3_0= ruleDDLStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:369:3: lv_statements_3_0= ruleDDLStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock737);
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

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock749); 

                        	newLeafNode(otherlv_4, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:389:1: ( ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==62||(LA4_0>=78 && LA4_0<=79)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:389:2: ( (lv_statements_5_0= ruleDDLStatement ) ) otherlv_6= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:389:2: ( (lv_statements_5_0= ruleDDLStatement ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:390:1: (lv_statements_5_0= ruleDDLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:390:1: (lv_statements_5_0= ruleDDLStatement )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:391:3: lv_statements_5_0= ruleDDLStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_3_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock771);
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

                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock783); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleMigrationBlock799); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:423:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:424:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:425:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
             newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression835);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;

             current =iv_ruleSqlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression845); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:432:1: ruleSqlExpression returns [EObject current=null] : ( (lv_root_0_0= ruleExprConcat ) ) ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_root_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:435:28: ( ( (lv_root_0_0= ruleExprConcat ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:436:1: ( (lv_root_0_0= ruleExprConcat ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:436:1: ( (lv_root_0_0= ruleExprConcat ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:437:1: (lv_root_0_0= ruleExprConcat )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:437:1: (lv_root_0_0= ruleExprConcat )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:438:3: lv_root_0_0= ruleExprConcat
            {
             
            	        newCompositeNode(grammarAccess.getSqlExpressionAccess().getRootExprConcatParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression890);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:462:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:463:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:464:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
             newCompositeNode(grammarAccess.getExprConcatRule()); 
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat925);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;

             current =iv_ruleExprConcat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat935); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:471:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:474:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:475:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:475:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:476:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat982);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;

             
                    current = this_ExprMult_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:484:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:484:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:484:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:485:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:490:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:491:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:491:1: (lv_op_2_0= '||' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:492:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,20,FOLLOW_20_in_ruleExprConcat1009); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprConcatRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:505:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:506:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:506:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:507:3: lv_right_3_0= ruleExprMult
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1043);
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
            	    break loop6;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:531:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:532:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:533:2: iv_ruleExprMult= ruleExprMult EOF
            {
             newCompositeNode(grammarAccess.getExprMultRule()); 
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1081);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;

             current =iv_ruleExprMult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1091); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:540:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:543:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:544:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:544:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:545:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1138);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;

             
                    current = this_ExprAdd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:553:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:553:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:553:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:554:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:559:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:560:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:560:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:561:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:561:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt7=3;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:562:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_21_in_ruleExprMult1167); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprMultAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprMultRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:574:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_22_in_ruleExprMult1196); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprMultAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprMultRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:586:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,23,FOLLOW_23_in_ruleExprMult1225); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:601:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:602:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:602:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:603:3: lv_right_3_0= ruleExprAdd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1262);
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
            	    break loop8;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:627:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:628:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:629:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
             newCompositeNode(grammarAccess.getExprAddRule()); 
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd1300);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;

             current =iv_ruleExprAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd1310); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:636:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:639:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:640:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:640:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:641:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1357);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;

             
                    current = this_ExprBit_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:649:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:649:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:649:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:650:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:655:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:656:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:656:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:657:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:657:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==24) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==25) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:658:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,24,FOLLOW_24_in_ruleExprAdd1386); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprAddAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprAddRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:670:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,25,FOLLOW_25_in_ruleExprAdd1415); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:685:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:686:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:686:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:687:3: lv_right_3_0= ruleExprBit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1452);
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
            	    break loop10;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:711:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:712:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:713:2: iv_ruleExprBit= ruleExprBit EOF
            {
             newCompositeNode(grammarAccess.getExprBitRule()); 
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit1490);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;

             current =iv_ruleExprBit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit1500); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:720:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:723:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:724:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:724:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:725:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit1547);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;

             
                    current = this_ExprRelate_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:733:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:733:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:733:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:734:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:739:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:740:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:740:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:741:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:741:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:742:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_ruleExprBit1576); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprBitAccess().getOpLessThanSignLessThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:754:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_ruleExprBit1605); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprBitAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:766:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,28,FOLLOW_28_in_ruleExprBit1634); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprBitAccess().getOpAmpersandKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:778:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,29,FOLLOW_29_in_ruleExprBit1663); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:793:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:794:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:794:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:795:3: lv_right_3_0= ruleExprRelate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit1700);
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
            	    break loop12;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:819:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:820:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:821:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
             newCompositeNode(grammarAccess.getExprRelateRule()); 
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate1738);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;

             current =iv_ruleExprRelate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate1748); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:828:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:831:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:832:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:832:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:833:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate1795);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;

             
                    current = this_ExprEqual_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:841:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=30 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:841:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:841:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:842:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:847:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:848:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:848:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:849:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:849:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:850:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_30_in_ruleExprRelate1824); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprRelateAccess().getOpLessThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:862:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,31,FOLLOW_31_in_ruleExprRelate1853); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprRelateAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:874:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,32,FOLLOW_32_in_ruleExprRelate1882); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprRelateAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:886:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,33,FOLLOW_33_in_ruleExprRelate1911); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:901:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:902:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:902:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:903:3: lv_right_3_0= ruleExprEqual
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate1948);
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
            	    break loop14;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:927:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:928:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:929:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
             newCompositeNode(grammarAccess.getExprEqualRule()); 
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual1986);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;

             current =iv_ruleExprEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual1996); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:936:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:939:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:940:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:940:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:941:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2043);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;

             
                    current = this_ExprAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:949:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=34 && LA16_0<=44)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:949:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:949:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:950:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:955:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:956:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:956:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:957:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:957:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    int alt15=11;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt15=5;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt15=6;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt15=7;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt15=8;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt15=9;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt15=10;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt15=11;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:958:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleExprEqual2072); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprEqualAccess().getOpEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:970:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleExprEqual2101); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:982:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_36_in_ruleExprEqual2130); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:994:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_37_in_ruleExprEqual2159); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getExprEqualAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1006:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,38,FOLLOW_38_in_ruleExprEqual2188); 

            	                    newLeafNode(lv_op_2_5, grammarAccess.getExprEqualAccess().getOpIsKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1018:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,39,FOLLOW_39_in_ruleExprEqual2217); 

            	                    newLeafNode(lv_op_2_6, grammarAccess.getExprEqualAccess().getOpIsNotKeyword_1_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            	    

            	            }
            	            break;
            	        case 7 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1030:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,40,FOLLOW_40_in_ruleExprEqual2246); 

            	                    newLeafNode(lv_op_2_7, grammarAccess.getExprEqualAccess().getOpInKeyword_1_1_0_6());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_7, null);
            	            	    

            	            }
            	            break;
            	        case 8 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1042:8: lv_op_2_8= 'like'
            	            {
            	            lv_op_2_8=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2275); 

            	                    newLeafNode(lv_op_2_8, grammarAccess.getExprEqualAccess().getOpLikeKeyword_1_1_0_7());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_8, null);
            	            	    

            	            }
            	            break;
            	        case 9 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1054:8: lv_op_2_9= 'glob'
            	            {
            	            lv_op_2_9=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2304); 

            	                    newLeafNode(lv_op_2_9, grammarAccess.getExprEqualAccess().getOpGlobKeyword_1_1_0_8());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_9, null);
            	            	    

            	            }
            	            break;
            	        case 10 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1066:8: lv_op_2_10= 'match'
            	            {
            	            lv_op_2_10=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2333); 

            	                    newLeafNode(lv_op_2_10, grammarAccess.getExprEqualAccess().getOpMatchKeyword_1_1_0_9());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_10, null);
            	            	    

            	            }
            	            break;
            	        case 11 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1078:8: lv_op_2_11= 'regexp'
            	            {
            	            lv_op_2_11=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2362); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1093:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1094:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1094:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1095:3: lv_right_3_0= ruleExprAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2399);
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
            	    break loop16;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1119:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1120:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1121:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
             newCompositeNode(grammarAccess.getExprAndRule()); 
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2437);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;

             current =iv_ruleExprAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2447); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1128:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1131:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1132:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1132:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1133:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2494);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;

             
                    current = this_ExprOr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1141:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1141:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1141:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1142:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1147:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1148:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1148:1: (lv_op_2_0= 'and' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1149:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,45,FOLLOW_45_in_ruleExprAnd2521); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprAndRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1162:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1163:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1163:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1164:3: lv_right_3_0= ruleExprOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2555);
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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1188:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1189:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1190:2: iv_ruleExprOr= ruleExprOr EOF
            {
             newCompositeNode(grammarAccess.getExprOrRule()); 
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2593);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;

             current =iv_ruleExprOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2603); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1197:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1200:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1201:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1201:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1202:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr2650);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;

             
                    current = this_NullCheckExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1210:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1210:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1210:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1211:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1216:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1217:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1217:1: (lv_op_2_0= 'or' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1218:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,46,FOLLOW_46_in_ruleExprOr2677); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprOrRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1231:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1232:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1232:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1233:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr2711);
            	    lv_right_3_0=ruleNullCheckExpression();

            	    state._fsp--;


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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleNullCheckExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1257:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1258:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1259:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
             newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression2749);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;

             current =iv_ruleNullCheckExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression2759); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1266:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression () (otherlv_2= 'is null' | otherlv_3= 'not null' | otherlv_4= 'notnull' )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1269:28: ( (this_PrimaryExpression_0= rulePrimaryExpression () (otherlv_2= 'is null' | otherlv_3= 'not null' | otherlv_4= 'notnull' )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1270:1: (this_PrimaryExpression_0= rulePrimaryExpression () (otherlv_2= 'is null' | otherlv_3= 'not null' | otherlv_4= 'notnull' )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1270:1: (this_PrimaryExpression_0= rulePrimaryExpression () (otherlv_2= 'is null' | otherlv_3= 'not null' | otherlv_4= 'notnull' )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1271:5: this_PrimaryExpression_0= rulePrimaryExpression () (otherlv_2= 'is null' | otherlv_3= 'not null' | otherlv_4= 'notnull' )?
            {
             
                    newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression2806);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1279:1: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1280:5: 
            {

                    current = forceCreateModelElementAndSet(
                        grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1285:2: (otherlv_2= 'is null' | otherlv_3= 'not null' | otherlv_4= 'notnull' )?
            int alt19=4;
            switch ( input.LA(1) ) {
                case 47:
                    {
                    alt19=1;
                    }
                    break;
                case 48:
                    {
                    alt19=2;
                    }
                    break;
                case 49:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1285:4: otherlv_2= 'is null'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleNullCheckExpression2827); 

                        	newLeafNode(otherlv_2, grammarAccess.getNullCheckExpressionAccess().getIsNullKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1290:7: otherlv_3= 'not null'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleNullCheckExpression2845); 

                        	newLeafNode(otherlv_3, grammarAccess.getNullCheckExpressionAccess().getNotNullKeyword_2_1());
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1295:7: otherlv_4= 'notnull'
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleNullCheckExpression2863); 

                        	newLeafNode(otherlv_4, grammarAccess.getNullCheckExpressionAccess().getNotnullKeyword_2_2());
                        

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
    // $ANTLR end "ruleNullCheckExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1307:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1308:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1309:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2901);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2911); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1316:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1319:28: ( ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1320:1: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1320:1: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) )
            int alt27=7;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1320:2: ( () ( (lv_name_1_0= ruleFQN ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1320:2: ( () ( (lv_name_1_0= ruleFQN ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1320:3: () ( (lv_name_1_0= ruleFQN ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1320:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1321:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getColumnLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1326:2: ( (lv_name_1_0= ruleFQN ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1327:1: (lv_name_1_0= ruleFQN )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1327:1: (lv_name_1_0= ruleFQN )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1328:3: lv_name_1_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNameFQNParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_rulePrimaryExpression2967);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1345:6: ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1345:6: ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1345:7: () ( (lv_literalValue_3_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1345:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1346:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1351:2: ( (lv_literalValue_3_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1352:1: (lv_literalValue_3_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1352:1: (lv_literalValue_3_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1353:3: lv_literalValue_3_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3005);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1370:6: (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1370:6: (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1370:8: otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_rulePrimaryExpression3025); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSqlExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3047);
                    this_SqlExpression_5=ruleSqlExpression();

                    state._fsp--;

                     
                            current = this_SqlExpression_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3058); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1388:6: ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1388:6: ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1388:7: () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1388:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1389:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_3_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1394:2: ( (lv_not_8_0= 'not' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==52) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1395:1: (lv_not_8_0= 'not' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1395:1: (lv_not_8_0= 'not' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1396:3: lv_not_8_0= 'not'
                            {
                            lv_not_8_0=(Token)match(input,52,FOLLOW_52_in_rulePrimaryExpression3093); 

                                    newLeafNode(lv_not_8_0, grammarAccess.getPrimaryExpressionAccess().getNotNotKeyword_3_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "not", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1409:3: ( (lv_exists_9_0= 'exists' ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==53) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1410:1: (lv_exists_9_0= 'exists' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1410:1: (lv_exists_9_0= 'exists' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1411:3: lv_exists_9_0= 'exists'
                            {
                            lv_exists_9_0=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3125); 

                                    newLeafNode(lv_exists_9_0, grammarAccess.getPrimaryExpressionAccess().getExistsExistsKeyword_3_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "exists", true, "exists");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,50,FOLLOW_50_in_rulePrimaryExpression3151); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1428:1: ( (lv_select_11_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1429:1: (lv_select_11_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1429:1: (lv_select_11_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1430:3: lv_select_11_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3172);
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

                    otherlv_12=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3184); 

                        	newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_5());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1451:6: ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1451:6: ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1451:7: () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1451:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1452:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_4_0(),
                                current);
                        

                    }

                    otherlv_14=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3213); 

                        	newLeafNode(otherlv_14, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_4_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1461:1: ( (lv_caseExpression_15_0= ruleSqlExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_NUMBER)||LA22_0==25||LA22_0==50||(LA22_0>=52 && LA22_0<=54)||LA22_0==58||(LA22_0>=116 && LA22_0<=119)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1462:1: (lv_caseExpression_15_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1462:1: (lv_caseExpression_15_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1463:3: lv_caseExpression_15_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3234);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1479:3: ( (lv_cases_16_0= ruleCase ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1480:1: (lv_cases_16_0= ruleCase )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1480:1: (lv_cases_16_0= ruleCase )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1481:3: lv_cases_16_0= ruleCase
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression3256);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1497:2: ( (lv_cases_17_0= ruleCase ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==60) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1498:1: (lv_cases_17_0= ruleCase )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1498:1: (lv_cases_17_0= ruleCase )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1499:3: lv_cases_17_0= ruleCase
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_4_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression3277);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1515:3: (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==55) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1515:5: otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) )
                            {
                            otherlv_18=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3291); 

                                	newLeafNode(otherlv_18, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_4_5_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1519:1: ( (lv_elseExpression_19_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1520:1: (lv_elseExpression_19_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1520:1: (lv_elseExpression_19_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1521:3: lv_elseExpression_19_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_4_5_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3312);
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

                    otherlv_20=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3326); 

                        	newLeafNode(otherlv_20, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_4_6());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1542:6: ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1542:6: ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1542:7: () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1542:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1543:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getFunctionAction_5_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1548:2: ( (lv_name_22_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1549:1: (lv_name_22_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1549:1: (lv_name_22_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1550:3: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3360); 

                    			newLeafNode(lv_name_22_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_5_1_0()); 
                    		

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

                    otherlv_23=(Token)match(input,50,FOLLOW_50_in_rulePrimaryExpression3377); 

                        	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1570:1: ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==21) ) {
                        alt26=1;
                    }
                    else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_NUMBER)||LA26_0==25||LA26_0==50||(LA26_0>=52 && LA26_0<=54)||LA26_0==58||(LA26_0>=116 && LA26_0<=119)) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1570:2: ( (lv_all_24_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1570:2: ( (lv_all_24_0= '*' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1571:1: (lv_all_24_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1571:1: (lv_all_24_0= '*' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1572:3: lv_all_24_0= '*'
                            {
                            lv_all_24_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression3396); 

                                    newLeafNode(lv_all_24_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_5_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "all", true, "*");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1586:6: ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1586:6: ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1586:7: ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1586:7: ( (lv_arguments_25_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1587:1: (lv_arguments_25_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1587:1: (lv_arguments_25_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1588:3: lv_arguments_25_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_5_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3437);
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

                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1604:2: (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==57) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1604:4: otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_26=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3450); 

                            	        	newLeafNode(otherlv_26, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_5_3_1_1_0());
                            	        
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1608:1: ( (lv_arugments_27_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1609:1: (lv_arugments_27_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1609:1: (lv_arugments_27_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1610:3: lv_arugments_27_0= ruleSqlExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArugmentsSqlExpressionParserRuleCall_5_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3471);
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

                    otherlv_28=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3487); 

                        	newLeafNode(otherlv_28, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_4());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1631:6: ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1631:6: ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1631:7: () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1631:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1632:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_6_0(),
                                current);
                        

                    }

                    otherlv_30=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3516); 

                        	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_6_1());
                        
                    otherlv_31=(Token)match(input,50,FOLLOW_50_in_rulePrimaryExpression3528); 

                        	newLeafNode(otherlv_31, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_6_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1645:1: ( (lv_expression_32_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1646:1: (lv_expression_32_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1646:1: (lv_expression_32_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1647:3: lv_expression_32_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3549);
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

                    otherlv_33=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3561); 

                        	newLeafNode(otherlv_33, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_6_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1667:1: ( (lv_type_34_0= ruleSqliteDataType ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1668:1: (lv_type_34_0= ruleSqliteDataType )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1668:1: (lv_type_34_0= ruleSqliteDataType )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1669:3: lv_type_34_0= ruleSqliteDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_6_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression3582);
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

                    otherlv_35=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3594); 

                        	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_6_6());
                        

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleCase"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1697:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1698:2: (iv_ruleCase= ruleCase EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1699:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase3631);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase3641); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1706:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1709:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1710:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1710:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1710:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleCase3678); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1714:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1715:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1715:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1716:3: lv_whenExpression_1_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase3699);
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

            otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleCase3711); 

                	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1736:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1737:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1737:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1738:3: lv_thenExpression_3_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase3732);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1762:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1763:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1764:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
             newCompositeNode(grammarAccess.getDDLStatementRule()); 
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement3768);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;

             current =iv_ruleDDLStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement3778); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1771:1: ruleDDLStatement returns [EObject current=null] : ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1774:28: ( ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1775:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1775:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) )
            int alt41=7;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1775:2: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1775:2: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1775:3: () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1775:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1776:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getCreateTableStatementAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleDDLStatement3825); 

                        	newLeafNode(otherlv_1, grammarAccess.getDDLStatementAccess().getCreateKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleDDLStatement3837); 

                        	newLeafNode(otherlv_2, grammarAccess.getDDLStatementAccess().getTableKeyword_0_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1789:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1790:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1790:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1791:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement3854); 

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

                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleDDLStatement3871); 

                        	newLeafNode(otherlv_4, grammarAccess.getDDLStatementAccess().getLeftParenthesisKeyword_0_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1811:1: ( (lv_columnDefs_5_0= ruleColumnDef ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1812:1: (lv_columnDefs_5_0= ruleColumnDef )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1812:1: (lv_columnDefs_5_0= ruleColumnDef )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1813:3: lv_columnDefs_5_0= ruleColumnDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getColumnDefsColumnDefParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnDef_in_ruleDDLStatement3892);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1829:2: (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==57) ) {
                            int LA28_1 = input.LA(2);

                            if ( (LA28_1==RULE_ID) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1829:4: otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleDDLStatement3905); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDDLStatementAccess().getCommaKeyword_0_6_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1833:1: ( (lv_columnDefs_7_0= ruleColumnDef ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1834:1: (lv_columnDefs_7_0= ruleColumnDef )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1834:1: (lv_columnDefs_7_0= ruleColumnDef )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1835:3: lv_columnDefs_7_0= ruleColumnDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getColumnDefsColumnDefParserRuleCall_0_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColumnDef_in_ruleDDLStatement3926);
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
                    	    break loop28;
                        }
                    } while (true);

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1851:4: (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==57) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1851:6: otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,57,FOLLOW_57_in_ruleDDLStatement3941); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getDDLStatementAccess().getCommaKeyword_0_7_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1855:1: ( (lv_constraints_9_0= ruleTableConstraint ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1856:1: (lv_constraints_9_0= ruleTableConstraint )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1856:1: (lv_constraints_9_0= ruleTableConstraint )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1857:3: lv_constraints_9_0= ruleTableConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getConstraintsTableConstraintParserRuleCall_0_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleDDLStatement3962);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleDDLStatement3976); 

                        	newLeafNode(otherlv_10, grammarAccess.getDDLStatementAccess().getRightParenthesisKeyword_0_8());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1878:6: ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1878:6: ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1878:7: () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1878:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1879:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getCreateViewStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,62,FOLLOW_62_in_ruleDDLStatement4005); 

                        	newLeafNode(otherlv_12, grammarAccess.getDDLStatementAccess().getCreateKeyword_1_1());
                        
                    otherlv_13=(Token)match(input,64,FOLLOW_64_in_ruleDDLStatement4017); 

                        	newLeafNode(otherlv_13, grammarAccess.getDDLStatementAccess().getViewKeyword_1_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1892:1: ( (lv_name_14_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1893:1: (lv_name_14_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1893:1: (lv_name_14_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1894:3: lv_name_14_0= RULE_ID
                    {
                    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4034); 

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

                    otherlv_15=(Token)match(input,59,FOLLOW_59_in_ruleDDLStatement4051); 

                        	newLeafNode(otherlv_15, grammarAccess.getDDLStatementAccess().getAsKeyword_1_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1914:1: ( (lv_selectStatement_16_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1915:1: (lv_selectStatement_16_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1915:1: (lv_selectStatement_16_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1916:3: lv_selectStatement_16_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getSelectStatementSelectStatementParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDDLStatement4072);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1933:6: ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1933:6: ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1933:7: () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1933:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1934:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getCreateTriggerStatementAction_2_0(),
                                current);
                        

                    }

                    otherlv_18=(Token)match(input,62,FOLLOW_62_in_ruleDDLStatement4101); 

                        	newLeafNode(otherlv_18, grammarAccess.getDDLStatementAccess().getCreateKeyword_2_1());
                        
                    otherlv_19=(Token)match(input,65,FOLLOW_65_in_ruleDDLStatement4113); 

                        	newLeafNode(otherlv_19, grammarAccess.getDDLStatementAccess().getTriggerKeyword_2_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1947:1: ( (lv_name_20_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1948:1: (lv_name_20_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1948:1: (lv_name_20_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1949:3: lv_name_20_0= RULE_ID
                    {
                    lv_name_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4130); 

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1965:2: (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )?
                    int alt30=4;
                    switch ( input.LA(1) ) {
                        case 66:
                            {
                            alt30=1;
                            }
                            break;
                        case 67:
                            {
                            alt30=2;
                            }
                            break;
                        case 68:
                            {
                            alt30=3;
                            }
                            break;
                    }

                    switch (alt30) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1965:4: otherlv_21= 'before'
                            {
                            otherlv_21=(Token)match(input,66,FOLLOW_66_in_ruleDDLStatement4148); 

                                	newLeafNode(otherlv_21, grammarAccess.getDDLStatementAccess().getBeforeKeyword_2_4_0());
                                

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1970:7: otherlv_22= 'after'
                            {
                            otherlv_22=(Token)match(input,67,FOLLOW_67_in_ruleDDLStatement4166); 

                                	newLeafNode(otherlv_22, grammarAccess.getDDLStatementAccess().getAfterKeyword_2_4_1());
                                

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1975:6: (otherlv_23= 'instead' otherlv_24= 'of' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1975:6: (otherlv_23= 'instead' otherlv_24= 'of' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1975:8: otherlv_23= 'instead' otherlv_24= 'of'
                            {
                            otherlv_23=(Token)match(input,68,FOLLOW_68_in_ruleDDLStatement4185); 

                                	newLeafNode(otherlv_23, grammarAccess.getDDLStatementAccess().getInsteadKeyword_2_4_2_0());
                                
                            otherlv_24=(Token)match(input,69,FOLLOW_69_in_ruleDDLStatement4197); 

                                	newLeafNode(otherlv_24, grammarAccess.getDDLStatementAccess().getOfKeyword_2_4_2_1());
                                

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1983:4: (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) )
                    int alt33=3;
                    switch ( input.LA(1) ) {
                    case 70:
                        {
                        alt33=1;
                        }
                        break;
                    case 71:
                        {
                        alt33=2;
                        }
                        break;
                    case 72:
                        {
                        alt33=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1983:6: otherlv_25= 'delete'
                            {
                            otherlv_25=(Token)match(input,70,FOLLOW_70_in_ruleDDLStatement4213); 

                                	newLeafNode(otherlv_25, grammarAccess.getDDLStatementAccess().getDeleteKeyword_2_5_0());
                                

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1988:7: otherlv_26= 'insert'
                            {
                            otherlv_26=(Token)match(input,71,FOLLOW_71_in_ruleDDLStatement4231); 

                                	newLeafNode(otherlv_26, grammarAccess.getDDLStatementAccess().getInsertKeyword_2_5_1());
                                

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1993:6: (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1993:6: (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1993:8: otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )?
                            {
                            otherlv_27=(Token)match(input,72,FOLLOW_72_in_ruleDDLStatement4250); 

                                	newLeafNode(otherlv_27, grammarAccess.getDDLStatementAccess().getUpdateKeyword_2_5_2_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1997:1: (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==69) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1997:3: otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )*
                                    {
                                    otherlv_28=(Token)match(input,69,FOLLOW_69_in_ruleDDLStatement4263); 

                                        	newLeafNode(otherlv_28, grammarAccess.getDDLStatementAccess().getOfKeyword_2_5_2_1_0());
                                        
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2001:1: ( (lv_updateColumnNames_29_0= RULE_ID ) )
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2002:1: (lv_updateColumnNames_29_0= RULE_ID )
                                    {
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2002:1: (lv_updateColumnNames_29_0= RULE_ID )
                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2003:3: lv_updateColumnNames_29_0= RULE_ID
                                    {
                                    lv_updateColumnNames_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4280); 

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

                                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2019:2: (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )*
                                    loop31:
                                    do {
                                        int alt31=2;
                                        int LA31_0 = input.LA(1);

                                        if ( (LA31_0==57) ) {
                                            alt31=1;
                                        }


                                        switch (alt31) {
                                    	case 1 :
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2019:4: otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) )
                                    	    {
                                    	    otherlv_30=(Token)match(input,57,FOLLOW_57_in_ruleDDLStatement4298); 

                                    	        	newLeafNode(otherlv_30, grammarAccess.getDDLStatementAccess().getCommaKeyword_2_5_2_1_2_0());
                                    	        
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2023:1: ( (lv_updateColumnNames_31_0= RULE_ID ) )
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2024:1: (lv_updateColumnNames_31_0= RULE_ID )
                                    	    {
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2024:1: (lv_updateColumnNames_31_0= RULE_ID )
                                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2025:3: lv_updateColumnNames_31_0= RULE_ID
                                    	    {
                                    	    lv_updateColumnNames_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4315); 

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
                                    	    break loop31;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,73,FOLLOW_73_in_ruleDDLStatement4338); 

                        	newLeafNode(otherlv_32, grammarAccess.getDDLStatementAccess().getOnKeyword_2_6());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2045:1: ( (lv_tableName_33_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2046:1: (lv_tableName_33_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2046:1: (lv_tableName_33_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2047:3: lv_tableName_33_0= RULE_ID
                    {
                    lv_tableName_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4355); 

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2063:2: (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==74) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2063:4: otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row'
                            {
                            otherlv_34=(Token)match(input,74,FOLLOW_74_in_ruleDDLStatement4373); 

                                	newLeafNode(otherlv_34, grammarAccess.getDDLStatementAccess().getForKeyword_2_8_0());
                                
                            otherlv_35=(Token)match(input,75,FOLLOW_75_in_ruleDDLStatement4385); 

                                	newLeafNode(otherlv_35, grammarAccess.getDDLStatementAccess().getEachKeyword_2_8_1());
                                
                            otherlv_36=(Token)match(input,76,FOLLOW_76_in_ruleDDLStatement4397); 

                                	newLeafNode(otherlv_36, grammarAccess.getDDLStatementAccess().getRowKeyword_2_8_2());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2075:3: (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==60) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2075:5: otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) )
                            {
                            otherlv_37=(Token)match(input,60,FOLLOW_60_in_ruleDDLStatement4412); 

                                	newLeafNode(otherlv_37, grammarAccess.getDDLStatementAccess().getWhenKeyword_2_9_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2079:1: ( (lv_whenExpression_38_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2080:1: (lv_whenExpression_38_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2080:1: (lv_whenExpression_38_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2081:3: lv_whenExpression_38_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getDDLStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_2_9_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleDDLStatement4433);
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

                    otherlv_39=(Token)match(input,77,FOLLOW_77_in_ruleDDLStatement4447); 

                        	newLeafNode(otherlv_39, grammarAccess.getDDLStatementAccess().getBeginKeyword_2_10());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2101:1: ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=70 && LA37_0<=72)||LA37_0==83||LA37_0==104) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2101:2: ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )*
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2101:2: ( (lv_statements_40_0= ruleDMLStatement ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2102:1: (lv_statements_40_0= ruleDMLStatement )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2102:1: (lv_statements_40_0= ruleDMLStatement )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2103:3: lv_statements_40_0= ruleDMLStatement
                            {
                             
                            	        newCompositeNode(grammarAccess.getDDLStatementAccess().getStatementsDMLStatementParserRuleCall_2_11_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDMLStatement_in_ruleDDLStatement4469);
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

                            otherlv_41=(Token)match(input,19,FOLLOW_19_in_ruleDDLStatement4481); 

                                	newLeafNode(otherlv_41, grammarAccess.getDDLStatementAccess().getSemicolonKeyword_2_11_1());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:1: ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( ((LA36_0>=70 && LA36_0<=72)||LA36_0==83||LA36_0==104) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:2: ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';'
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:2: ( (lv_statements_42_0= ruleDMLStatement ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2124:1: (lv_statements_42_0= ruleDMLStatement )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2124:1: (lv_statements_42_0= ruleDMLStatement )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2125:3: lv_statements_42_0= ruleDMLStatement
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getStatementsDMLStatementParserRuleCall_2_11_2_0_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleDDLStatement4503);
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

                            	    otherlv_43=(Token)match(input,19,FOLLOW_19_in_ruleDDLStatement4515); 

                            	        	newLeafNode(otherlv_43, grammarAccess.getDDLStatementAccess().getSemicolonKeyword_2_11_2_1());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_44=(Token)match(input,56,FOLLOW_56_in_ruleDDLStatement4531); 

                        	newLeafNode(otherlv_44, grammarAccess.getDDLStatementAccess().getEndKeyword_2_12());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2150:6: ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2150:6: ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2150:7: () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2150:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2151:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getAlterTableStatementAction_3_0(),
                                current);
                        

                    }

                    otherlv_46=(Token)match(input,78,FOLLOW_78_in_ruleDDLStatement4560); 

                        	newLeafNode(otherlv_46, grammarAccess.getDDLStatementAccess().getAlterKeyword_3_1());
                        
                    otherlv_47=(Token)match(input,63,FOLLOW_63_in_ruleDDLStatement4572); 

                        	newLeafNode(otherlv_47, grammarAccess.getDDLStatementAccess().getTableKeyword_3_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2164:1: ( (lv_name_48_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2165:1: (lv_name_48_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2165:1: (lv_name_48_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2166:3: lv_name_48_0= RULE_ID
                    {
                    lv_name_48_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4589); 

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2182:2: ( (lv_clause_49_0= ruleAlterTableClause ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2183:1: (lv_clause_49_0= ruleAlterTableClause )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2183:1: (lv_clause_49_0= ruleAlterTableClause )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2184:3: lv_clause_49_0= ruleAlterTableClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getDDLStatementAccess().getClauseAlterTableClauseParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlterTableClause_in_ruleDDLStatement4615);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2201:6: ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2201:6: ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2201:7: () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2201:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2202:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getDropTableStatementAction_4_0(),
                                current);
                        

                    }

                    otherlv_51=(Token)match(input,79,FOLLOW_79_in_ruleDDLStatement4644); 

                        	newLeafNode(otherlv_51, grammarAccess.getDDLStatementAccess().getDropKeyword_4_1());
                        
                    otherlv_52=(Token)match(input,63,FOLLOW_63_in_ruleDDLStatement4656); 

                        	newLeafNode(otherlv_52, grammarAccess.getDDLStatementAccess().getTableKeyword_4_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2215:1: (otherlv_53= 'if' otherlv_54= 'exists' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==80) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2215:3: otherlv_53= 'if' otherlv_54= 'exists'
                            {
                            otherlv_53=(Token)match(input,80,FOLLOW_80_in_ruleDDLStatement4669); 

                                	newLeafNode(otherlv_53, grammarAccess.getDDLStatementAccess().getIfKeyword_4_3_0());
                                
                            otherlv_54=(Token)match(input,53,FOLLOW_53_in_ruleDDLStatement4681); 

                                	newLeafNode(otherlv_54, grammarAccess.getDDLStatementAccess().getExistsKeyword_4_3_1());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2223:3: ( (lv_name_55_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2224:1: (lv_name_55_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2224:1: (lv_name_55_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2225:3: lv_name_55_0= RULE_ID
                    {
                    lv_name_55_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4700); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2242:6: ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2242:6: ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2242:7: () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2242:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2243:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getDropTriggerStatementAction_5_0(),
                                current);
                        

                    }

                    otherlv_57=(Token)match(input,79,FOLLOW_79_in_ruleDDLStatement4734); 

                        	newLeafNode(otherlv_57, grammarAccess.getDDLStatementAccess().getDropKeyword_5_1());
                        
                    otherlv_58=(Token)match(input,65,FOLLOW_65_in_ruleDDLStatement4746); 

                        	newLeafNode(otherlv_58, grammarAccess.getDDLStatementAccess().getTriggerKeyword_5_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2256:1: (otherlv_59= 'if' otherlv_60= 'exists' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==80) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2256:3: otherlv_59= 'if' otherlv_60= 'exists'
                            {
                            otherlv_59=(Token)match(input,80,FOLLOW_80_in_ruleDDLStatement4759); 

                                	newLeafNode(otherlv_59, grammarAccess.getDDLStatementAccess().getIfKeyword_5_3_0());
                                
                            otherlv_60=(Token)match(input,53,FOLLOW_53_in_ruleDDLStatement4771); 

                                	newLeafNode(otherlv_60, grammarAccess.getDDLStatementAccess().getExistsKeyword_5_3_1());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2264:3: ( (lv_name_61_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2265:1: (lv_name_61_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2265:1: (lv_name_61_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2266:3: lv_name_61_0= RULE_ID
                    {
                    lv_name_61_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4790); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2283:6: ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2283:6: ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2283:7: () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2283:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2284:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDDLStatementAccess().getDropViewStatementAction_6_0(),
                                current);
                        

                    }

                    otherlv_63=(Token)match(input,79,FOLLOW_79_in_ruleDDLStatement4824); 

                        	newLeafNode(otherlv_63, grammarAccess.getDDLStatementAccess().getDropKeyword_6_1());
                        
                    otherlv_64=(Token)match(input,64,FOLLOW_64_in_ruleDDLStatement4836); 

                        	newLeafNode(otherlv_64, grammarAccess.getDDLStatementAccess().getViewKeyword_6_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2297:1: (otherlv_65= 'if' otherlv_66= 'exists' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==80) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2297:3: otherlv_65= 'if' otherlv_66= 'exists'
                            {
                            otherlv_65=(Token)match(input,80,FOLLOW_80_in_ruleDDLStatement4849); 

                                	newLeafNode(otherlv_65, grammarAccess.getDDLStatementAccess().getIfKeyword_6_3_0());
                                
                            otherlv_66=(Token)match(input,53,FOLLOW_53_in_ruleDDLStatement4861); 

                                	newLeafNode(otherlv_66, grammarAccess.getDDLStatementAccess().getExistsKeyword_6_3_1());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2305:3: ( (lv_name_67_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2306:1: (lv_name_67_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2306:1: (lv_name_67_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2307:3: lv_name_67_0= RULE_ID
                    {
                    lv_name_67_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDDLStatement4880); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2331:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2332:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2333:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
             newCompositeNode(grammarAccess.getDMLStatementRule()); 
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement4922);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;

             current =iv_ruleDMLStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement4932); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2340:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2343:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2344:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2344:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt42=1;
                }
                break;
            case 71:
            case 83:
                {
                alt42=2;
                }
                break;
            case 72:
                {
                alt42=3;
                }
                break;
            case 70:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2345:5: this_SelectStatement_0= ruleSelectStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement4979);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;

                     
                            current = this_SelectStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2355:5: this_InsertStatement_1= ruleInsertStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement5006);
                    this_InsertStatement_1=ruleInsertStatement();

                    state._fsp--;

                     
                            current = this_InsertStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2365:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement5033);
                    this_UpdateStatement_2=ruleUpdateStatement();

                    state._fsp--;

                     
                            current = this_UpdateStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2375:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement5060);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2391:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2392:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2393:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement5095);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;

             current =iv_ruleDeleteStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement5105); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2400:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tableName_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2403:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2404:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2404:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2404:3: otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleDeleteStatement5142); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleDeleteStatement5154); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2412:1: ( (lv_tableName_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2413:1: (lv_tableName_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2413:1: (lv_tableName_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2414:3: lv_tableName_2_0= RULE_ID
            {
            lv_tableName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement5171); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2430:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==82) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2430:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_82_in_ruleDeleteStatement5189); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2434:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2435:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2435:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2436:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement5210);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2460:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2461:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2462:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
             newCompositeNode(grammarAccess.getInsertStatementRule()); 
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement5248);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;

             current =iv_ruleInsertStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement5258); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2469:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2472:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2473:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2473:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2473:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2473:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==71) ) {
                alt45=1;
            }
            else if ( (LA45_0==83) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2473:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2473:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2473:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleInsertStatement5297); 

                        	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2477:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==46) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2477:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleInsertStatement5310); 

                                	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2481:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2482:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2482:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2483:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement5331);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2500:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_83_in_ruleInsertStatement5352); 

                        	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,84,FOLLOW_84_in_ruleInsertStatement5365); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2508:1: ( (lv_tableName_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2509:1: (lv_tableName_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2509:1: (lv_tableName_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2510:3: lv_tableName_5_0= RULE_ID
            {
            lv_tableName_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement5382); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2526:2: (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2526:4: otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleInsertStatement5400); 

                        	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2530:1: ( (lv_columnNames_7_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2531:1: (lv_columnNames_7_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2531:1: (lv_columnNames_7_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2532:3: lv_columnNames_7_0= RULE_ID
                    {
                    lv_columnNames_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement5417); 

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2548:2: (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==57) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2548:4: otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,57,FOLLOW_57_in_ruleInsertStatement5435); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2552:1: ( (lv_columnNames_9_0= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2553:1: (lv_columnNames_9_0= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2553:1: (lv_columnNames_9_0= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2554:3: lv_columnNames_9_0= RULE_ID
                    	    {
                    	    lv_columnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement5452); 

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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,51,FOLLOW_51_in_ruleInsertStatement5471); 

                        	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==85||LA50_0==104) ) {
                alt50=1;
            }
            else if ( (LA50_0==86) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==85) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==104) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2574:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,85,FOLLOW_85_in_ruleInsertStatement5488); 

                                	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                
                            otherlv_12=(Token)match(input,50,FOLLOW_50_in_ruleInsertStatement5500); 

                                	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2582:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2583:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2583:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2584:3: lv_expressions_13_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement5521);
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

                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2600:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==57) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2600:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,57,FOLLOW_57_in_ruleInsertStatement5534); 

                            	        	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	        
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2604:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2605:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2605:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2606:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement5555);
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
                            	    break loop48;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,51,FOLLOW_51_in_ruleInsertStatement5569); 

                                	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2627:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2627:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2628:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2628:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2629:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement5597);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2646:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2646:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2646:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,86,FOLLOW_86_in_ruleInsertStatement5617); 

                        	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                        
                    otherlv_19=(Token)match(input,85,FOLLOW_85_in_ruleInsertStatement5629); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2662:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2663:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2664:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement5667);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement5677); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2671:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2674:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2675:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2675:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2675:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleUpdateStatement5714); 

                	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2679:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2679:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleUpdateStatement5727); 

                        	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2683:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2684:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2684:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2685:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement5748);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2701:4: ( (lv_tableName_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2702:1: (lv_tableName_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2702:1: (lv_tableName_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2703:3: lv_tableName_3_0= RULE_ID
            {
            lv_tableName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement5767); 

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

            otherlv_4=(Token)match(input,87,FOLLOW_87_in_ruleUpdateStatement5784); 

                	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2723:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2724:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2724:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2725:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5805);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2741:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==57) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2741:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleUpdateStatement5818); 

            	        	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2745:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2746:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2746:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2747:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5839);
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
            	    break loop52;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2763:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==82) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2763:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,82,FOLLOW_82_in_ruleUpdateStatement5854); 

                        	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2767:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2768:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2768:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2769:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement5875);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2793:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2794:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2795:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression5913);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;

             current =iv_ruleUpdateColumnExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression5923); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2802:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token lv_columnName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2805:28: ( ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2806:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2806:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2806:2: ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2806:2: ( (lv_columnName_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2807:1: (lv_columnName_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2807:1: (lv_columnName_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2808:3: lv_columnName_0_0= RULE_ID
            {
            lv_columnName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression5965); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleUpdateColumnExpression5982); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2828:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2829:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2829:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2830:3: lv_expression_2_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression6003);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2854:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2855:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2856:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement6039);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement6049); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2863:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2866:28: ( ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2867:1: ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2867:1: ( ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2867:2: ( (lv_coreStatements_0_0= ruleSelectCore ) ) ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )* (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2867:2: ( (lv_coreStatements_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2868:1: (lv_coreStatements_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2868:1: (lv_coreStatements_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2869:3: lv_coreStatements_0_0= ruleSelectCore
            {
             
            	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreStatementsSelectCoreParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement6095);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2885:2: ( ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=100 && LA54_0<=103)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2886:5: ruleCompoundOperator ( (lv_coreStatements_2_0= ruleSelectCore ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSelectStatementAccess().getCompoundOperatorParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectStatement6112);
            	    ruleCompoundOperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2893:1: ( (lv_coreStatements_2_0= ruleSelectCore ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2894:1: (lv_coreStatements_2_0= ruleSelectCore )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2894:1: (lv_coreStatements_2_0= ruleSelectCore )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2895:3: lv_coreStatements_2_0= ruleSelectCore
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreStatementsSelectCoreParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement6132);
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
            	    break loop54;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2911:4: (otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==88) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2911:6: otherlv_3= 'order' otherlv_4= 'by' ( (lv_orderingTerms_5_0= ruleOrderingTerm ) ) (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )*
                    {
                    otherlv_3=(Token)match(input,88,FOLLOW_88_in_ruleSelectStatement6147); 

                        	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getOrderKeyword_2_0());
                        
                    otherlv_4=(Token)match(input,89,FOLLOW_89_in_ruleSelectStatement6159); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getByKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2919:1: ( (lv_orderingTerms_5_0= ruleOrderingTerm ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2920:1: (lv_orderingTerms_5_0= ruleOrderingTerm )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2920:1: (lv_orderingTerms_5_0= ruleOrderingTerm )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2921:3: lv_orderingTerms_5_0= ruleOrderingTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderingTermsOrderingTermParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6180);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2937:2: (otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==57) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2937:4: otherlv_6= ',' ( (lv_orderingTerms_7_0= ruleOrderingTerm ) )
                    	    {
                    	    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleSelectStatement6193); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2941:1: ( (lv_orderingTerms_7_0= ruleOrderingTerm ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2942:1: (lv_orderingTerms_7_0= ruleOrderingTerm )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2942:1: (lv_orderingTerms_7_0= ruleOrderingTerm )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2943:3: lv_orderingTerms_7_0= ruleOrderingTerm
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderingTermsOrderingTermParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6214);
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
                    	    break loop55;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2967:1: entryRuleAlterTableClause returns [EObject current=null] : iv_ruleAlterTableClause= ruleAlterTableClause EOF ;
    public final EObject entryRuleAlterTableClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2968:2: (iv_ruleAlterTableClause= ruleAlterTableClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2969:2: iv_ruleAlterTableClause= ruleAlterTableClause EOF
            {
             newCompositeNode(grammarAccess.getAlterTableClauseRule()); 
            pushFollow(FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause6254);
            iv_ruleAlterTableClause=ruleAlterTableClause();

            state._fsp--;

             current =iv_ruleAlterTableClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableClause6264); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2976:1: ruleAlterTableClause returns [EObject current=null] : ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) ;
    public final EObject ruleAlterTableClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_columnDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2979:28: ( ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2980:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2980:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==90) ) {
                alt57=1;
            }
            else if ( (LA57_0==91) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2980:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2980:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2980:3: () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2980:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2981:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableRenameClauseAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleAlterTableClause6311); 

                        	newLeafNode(otherlv_1, grammarAccess.getAlterTableClauseAccess().getRenameToKeyword_0_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2990:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2991:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2991:1: (lv_name_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2992:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableClause6328); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3009:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3009:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3009:7: () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3009:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3010:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableAddColumnClauseAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,91,FOLLOW_91_in_ruleAlterTableClause6362); 

                        	newLeafNode(otherlv_4, grammarAccess.getAlterTableClauseAccess().getAddColumnKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3019:1: ( (lv_columnDef_5_0= ruleColumnDef ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3020:1: (lv_columnDef_5_0= ruleColumnDef )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3020:1: (lv_columnDef_5_0= ruleColumnDef )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3021:3: lv_columnDef_5_0= ruleColumnDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlterTableClauseAccess().getColumnDefColumnDefParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableClause6383);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3045:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3046:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3047:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
             newCompositeNode(grammarAccess.getColumnDefRule()); 
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef6420);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;

             current =iv_ruleColumnDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef6430); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3054:1: ruleColumnDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_constraints_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3057:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3058:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3058:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3058:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3058:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3059:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3059:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3060:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef6472); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3076:2: ( (lv_type_1_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3077:1: (lv_type_1_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3077:1: (lv_type_1_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3078:3: lv_type_1_0= ruleColumnType
            {
             
            	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef6498);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3094:2: ( (lv_constraints_2_0= ruleColumnConstraint ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==48||LA58_0==86||LA58_0==92) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3095:1: (lv_constraints_2_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3095:1: (lv_constraints_2_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3096:3: lv_constraints_2_0= ruleColumnConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef6519);
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
            	    break loop58;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3120:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3121:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3122:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
             newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint6556);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;

             current =iv_ruleColumnConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint6566); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3129:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not null' ( (lv_conflictClause_8_0= ruleConflictClause ) )? ) | ( () otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleDefaultValue ) ) ) ) ;
    public final EObject ruleColumnConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;
        Token lv_autoincrement_5_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_conflictClause_8_0 = null;

        EObject lv_defaultValue_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3132:28: ( ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not null' ( (lv_conflictClause_8_0= ruleConflictClause ) )? ) | ( () otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3133:1: ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not null' ( (lv_conflictClause_8_0= ruleConflictClause ) )? ) | ( () otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3133:1: ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not null' ( (lv_conflictClause_8_0= ruleConflictClause ) )? ) | ( () otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleDefaultValue ) ) ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt62=1;
                }
                break;
            case 48:
                {
                alt62=2;
                }
                break;
            case 86:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3133:2: ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3133:2: ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3133:3: () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3133:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3134:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleColumnConstraint6613); 

                        	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,93,FOLLOW_93_in_ruleColumnConstraint6625); 

                        	newLeafNode(otherlv_2, grammarAccess.getColumnConstraintAccess().getKeyKeyword_0_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3147:1: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
                    int alt59=3;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==94) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==95) ) {
                        alt59=2;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3147:2: ( (lv_asc_3_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3147:2: ( (lv_asc_3_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3148:1: (lv_asc_3_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3148:1: (lv_asc_3_0= 'asc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3149:3: lv_asc_3_0= 'asc'
                            {
                            lv_asc_3_0=(Token)match(input,94,FOLLOW_94_in_ruleColumnConstraint6644); 

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
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3163:6: ( (lv_desc_4_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3163:6: ( (lv_desc_4_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3164:1: (lv_desc_4_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3164:1: (lv_desc_4_0= 'desc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3165:3: lv_desc_4_0= 'desc'
                            {
                            lv_desc_4_0=(Token)match(input,95,FOLLOW_95_in_ruleColumnConstraint6681); 

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3178:4: ( (lv_autoincrement_5_0= 'autoincrement' ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==96) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3179:1: (lv_autoincrement_5_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3179:1: (lv_autoincrement_5_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3180:3: lv_autoincrement_5_0= 'autoincrement'
                            {
                            lv_autoincrement_5_0=(Token)match(input,96,FOLLOW_96_in_ruleColumnConstraint6714); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3194:6: ( () otherlv_7= 'not null' ( (lv_conflictClause_8_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3194:6: ( () otherlv_7= 'not null' ( (lv_conflictClause_8_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3194:7: () otherlv_7= 'not null' ( (lv_conflictClause_8_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3194:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3195:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleColumnConstraint6757); 

                        	newLeafNode(otherlv_7, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3204:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==73) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3205:1: (lv_conflictClause_8_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3205:1: (lv_conflictClause_8_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3206:3: lv_conflictClause_8_0= ruleConflictClause
                            {
                             
                            	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint6778);
                            lv_conflictClause_8_0=ruleConflictClause();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"conflictClause",
                                    		lv_conflictClause_8_0, 
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3223:6: ( () otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3223:6: ( () otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3223:7: () otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3223:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3224:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_2_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,86,FOLLOW_86_in_ruleColumnConstraint6808); 

                        	newLeafNode(otherlv_10, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3233:1: ( (lv_defaultValue_11_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3234:1: (lv_defaultValue_11_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3234:1: (lv_defaultValue_11_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3235:3: lv_defaultValue_11_0= ruleDefaultValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint6829);
                    lv_defaultValue_11_0=ruleDefaultValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_11_0, 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3259:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3260:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3261:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
             newCompositeNode(grammarAccess.getDefaultValueRule()); 
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue6866);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;

             current =iv_ruleDefaultValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue6876); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3268:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3271:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_NUMBER)||LA63_0==25||(LA63_0>=116 && LA63_0<=119)) ) {
                alt63=1;
            }
            else if ( (LA63_0==50) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3273:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3278:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3279:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3279:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3280:3: lv_literal_1_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue6932);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3297:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3298:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleDefaultValue6961); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3307:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3308:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3308:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3309:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue6982);
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

                    otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleDefaultValue6994); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3337:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3338:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3339:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
             newCompositeNode(grammarAccess.getTableConstraintRule()); 
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint7031);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;

             current =iv_ruleTableConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint7041); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3346:1: ruleTableConstraint returns [EObject current=null] : ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3349:28: ( ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3350:1: ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3350:1: ( ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) ) | ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) ) | ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' ) )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 98:
                        {
                        alt69=1;
                        }
                        break;
                    case 92:
                        {
                        alt69=2;
                        }
                        break;
                    case 99:
                        {
                        alt69=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 5, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
                }
                break;
            case 98:
                {
                alt69=1;
                }
                break;
            case 92:
                {
                alt69=2;
                }
                break;
            case 99:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3350:2: ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3350:2: ( () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3350:3: () (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= 'unique' otherlv_4= '(' ( (lv_columns_5_0= ruleIndexedColumn ) ) (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )* otherlv_8= ')' ( (lv_conflictClause_9_0= ruleConflictClause ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3350:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3351:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTableConstraintAccess().getUniqueTableContraintAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3356:2: (otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==97) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3356:4: otherlv_1= 'constraint' ( (lv_name_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleTableConstraint7089); 

                                	newLeafNode(otherlv_1, grammarAccess.getTableConstraintAccess().getConstraintKeyword_0_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3360:1: ( (lv_name_2_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3361:1: (lv_name_2_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3361:1: (lv_name_2_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3362:3: lv_name_2_0= RULE_ID
                            {
                            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableConstraint7106); 

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

                    otherlv_3=(Token)match(input,98,FOLLOW_98_in_ruleTableConstraint7125); 

                        	newLeafNode(otherlv_3, grammarAccess.getTableConstraintAccess().getUniqueKeyword_0_2());
                        
                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleTableConstraint7137); 

                        	newLeafNode(otherlv_4, grammarAccess.getTableConstraintAccess().getLeftParenthesisKeyword_0_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3386:1: ( (lv_columns_5_0= ruleIndexedColumn ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3387:1: (lv_columns_5_0= ruleIndexedColumn )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3387:1: (lv_columns_5_0= ruleIndexedColumn )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3388:3: lv_columns_5_0= ruleIndexedColumn
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7158);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3404:2: (otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==57) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3404:4: otherlv_6= ',' ( (lv_columns_7_0= ruleIndexedColumn ) )
                    	    {
                    	    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleTableConstraint7171); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTableConstraintAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3408:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3409:1: (lv_columns_7_0= ruleIndexedColumn )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3409:1: (lv_columns_7_0= ruleIndexedColumn )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3410:3: lv_columns_7_0= ruleIndexedColumn
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_0_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7192);
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
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,51,FOLLOW_51_in_ruleTableConstraint7206); 

                        	newLeafNode(otherlv_8, grammarAccess.getTableConstraintAccess().getRightParenthesisKeyword_0_6());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3430:1: ( (lv_conflictClause_9_0= ruleConflictClause ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3431:1: (lv_conflictClause_9_0= ruleConflictClause )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3431:1: (lv_conflictClause_9_0= ruleConflictClause )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3432:3: lv_conflictClause_9_0= ruleConflictClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConflictClause_in_ruleTableConstraint7227);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3449:6: ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3449:6: ( () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3449:7: () (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )? otherlv_13= 'primary' otherlv_14= 'key' otherlv_15= '(' ( (lv_columns_16_0= ruleIndexedColumn ) ) (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )* otherlv_19= ')' ( (lv_conflictClause_20_0= ruleConflictClause ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3449:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3450:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTableConstraintAccess().getPrimaryContraintAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3455:2: (otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==97) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3455:4: otherlv_11= 'constraint' ( (lv_name_12_0= RULE_ID ) )
                            {
                            otherlv_11=(Token)match(input,97,FOLLOW_97_in_ruleTableConstraint7257); 

                                	newLeafNode(otherlv_11, grammarAccess.getTableConstraintAccess().getConstraintKeyword_1_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3459:1: ( (lv_name_12_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3460:1: (lv_name_12_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3460:1: (lv_name_12_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3461:3: lv_name_12_0= RULE_ID
                            {
                            lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableConstraint7274); 

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

                    otherlv_13=(Token)match(input,92,FOLLOW_92_in_ruleTableConstraint7293); 

                        	newLeafNode(otherlv_13, grammarAccess.getTableConstraintAccess().getPrimaryKeyword_1_2());
                        
                    otherlv_14=(Token)match(input,93,FOLLOW_93_in_ruleTableConstraint7305); 

                        	newLeafNode(otherlv_14, grammarAccess.getTableConstraintAccess().getKeyKeyword_1_3());
                        
                    otherlv_15=(Token)match(input,50,FOLLOW_50_in_ruleTableConstraint7317); 

                        	newLeafNode(otherlv_15, grammarAccess.getTableConstraintAccess().getLeftParenthesisKeyword_1_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3489:1: ( (lv_columns_16_0= ruleIndexedColumn ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3490:1: (lv_columns_16_0= ruleIndexedColumn )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3490:1: (lv_columns_16_0= ruleIndexedColumn )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3491:3: lv_columns_16_0= ruleIndexedColumn
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7338);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3507:2: (otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==57) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3507:4: otherlv_17= ',' ( (lv_columns_18_0= ruleIndexedColumn ) )
                    	    {
                    	    otherlv_17=(Token)match(input,57,FOLLOW_57_in_ruleTableConstraint7351); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getTableConstraintAccess().getCommaKeyword_1_6_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3511:1: ( (lv_columns_18_0= ruleIndexedColumn ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3512:1: (lv_columns_18_0= ruleIndexedColumn )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3512:1: (lv_columns_18_0= ruleIndexedColumn )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3513:3: lv_columns_18_0= ruleIndexedColumn
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_1_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7372);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,51,FOLLOW_51_in_ruleTableConstraint7386); 

                        	newLeafNode(otherlv_19, grammarAccess.getTableConstraintAccess().getRightParenthesisKeyword_1_7());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3533:1: ( (lv_conflictClause_20_0= ruleConflictClause ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3534:1: (lv_conflictClause_20_0= ruleConflictClause )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3534:1: (lv_conflictClause_20_0= ruleConflictClause )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3535:3: lv_conflictClause_20_0= ruleConflictClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConflictClause_in_ruleTableConstraint7407);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3552:6: ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3552:6: ( () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3552:7: () (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )? otherlv_24= 'check' otherlv_25= '(' ( (lv_expression_26_0= ruleSqlExpression ) ) otherlv_27= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3552:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3553:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTableConstraintAccess().getCheckTableConstraintAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3558:2: (otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==97) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3558:4: otherlv_22= 'constraint' ( (lv_name_23_0= RULE_ID ) )
                            {
                            otherlv_22=(Token)match(input,97,FOLLOW_97_in_ruleTableConstraint7437); 

                                	newLeafNode(otherlv_22, grammarAccess.getTableConstraintAccess().getConstraintKeyword_2_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3562:1: ( (lv_name_23_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3563:1: (lv_name_23_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3563:1: (lv_name_23_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3564:3: lv_name_23_0= RULE_ID
                            {
                            lv_name_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableConstraint7454); 

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

                    otherlv_24=(Token)match(input,99,FOLLOW_99_in_ruleTableConstraint7473); 

                        	newLeafNode(otherlv_24, grammarAccess.getTableConstraintAccess().getCheckKeyword_2_2());
                        
                    otherlv_25=(Token)match(input,50,FOLLOW_50_in_ruleTableConstraint7485); 

                        	newLeafNode(otherlv_25, grammarAccess.getTableConstraintAccess().getLeftParenthesisKeyword_2_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3588:1: ( (lv_expression_26_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3589:1: (lv_expression_26_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3589:1: (lv_expression_26_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3590:3: lv_expression_26_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleTableConstraint7506);
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

                    otherlv_27=(Token)match(input,51,FOLLOW_51_in_ruleTableConstraint7518); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3618:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3619:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3620:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
             newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn7555);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;

             current =iv_ruleIndexedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn7565); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3627:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3630:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3631:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3631:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3631:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3631:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3632:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3632:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3633:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexedColumnRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn7610); 

            		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getNameColumnDefCrossReference_0_0()); 
            	

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3644:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==94) ) {
                alt70=1;
            }
            else if ( (LA70_0==95) ) {
                alt70=2;
            }
            switch (alt70) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3644:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3644:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3645:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3645:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3646:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,94,FOLLOW_94_in_ruleIndexedColumn7629); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3660:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3660:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3661:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3661:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3662:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,95,FOLLOW_95_in_ruleIndexedColumn7666); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3683:1: entryRuleCompoundOperator returns [String current=null] : iv_ruleCompoundOperator= ruleCompoundOperator EOF ;
    public final String entryRuleCompoundOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundOperator = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3684:2: (iv_ruleCompoundOperator= ruleCompoundOperator EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3685:2: iv_ruleCompoundOperator= ruleCompoundOperator EOF
            {
             newCompositeNode(grammarAccess.getCompoundOperatorRule()); 
            pushFollow(FOLLOW_ruleCompoundOperator_in_entryRuleCompoundOperator7718);
            iv_ruleCompoundOperator=ruleCompoundOperator();

            state._fsp--;

             current =iv_ruleCompoundOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundOperator7729); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3692:1: ruleCompoundOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' ) ;
    public final AntlrDatatypeRuleToken ruleCompoundOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3695:28: ( (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3696:1: (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3696:1: (kw= 'union all' | kw= 'union' | kw= 'intersect' | kw= 'except' )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt71=1;
                }
                break;
            case 101:
                {
                alt71=2;
                }
                break;
            case 102:
                {
                alt71=3;
                }
                break;
            case 103:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3697:2: kw= 'union all'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleCompoundOperator7767); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompoundOperatorAccess().getUnionAllKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3704:2: kw= 'union'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleCompoundOperator7786); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompoundOperatorAccess().getUnionKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3711:2: kw= 'intersect'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleCompoundOperator7805); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompoundOperatorAccess().getIntersectKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3718:2: kw= 'except'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleCompoundOperator7824); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3731:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3732:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3733:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
             newCompositeNode(grammarAccess.getOrderingTermRule()); 
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm7864);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;

             current =iv_ruleOrderingTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm7874); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3740:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3743:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3744:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3744:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3744:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3744:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3745:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3745:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3746:3: lv_expression_0_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm7920);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3762:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==94) ) {
                alt72=1;
            }
            else if ( (LA72_0==95) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3762:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3762:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3763:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3763:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3764:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,94,FOLLOW_94_in_ruleOrderingTerm7939); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3778:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3778:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3779:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3779:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3780:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,95,FOLLOW_95_in_ruleOrderingTerm7976); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3801:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3802:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3803:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
             newCompositeNode(grammarAccess.getSelectCoreRule()); 
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore8027);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;

             current =iv_ruleSelectCore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore8037); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3810:1: ruleSelectCore returns [EObject current=null] : (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? ) ;
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
        Token otherlv_15=null;
        EObject lv_resultColumns_3_0 = null;

        EObject lv_resultColumns_5_0 = null;

        EObject lv_source_7_0 = null;

        EObject lv_whereExpression_9_0 = null;

        EObject lv_groupByExpressions_12_0 = null;

        EObject lv_groupByExpressions_14_0 = null;

        EObject lv_havingExpression_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3813:28: ( (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3814:1: (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3814:1: (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3814:3: otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleSelectCore8074); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectCoreAccess().getSelectKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3818:1: ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )?
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==105) ) {
                alt73=1;
            }
            else if ( (LA73_0==106) ) {
                alt73=2;
            }
            switch (alt73) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3818:2: ( (lv_distinct_1_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3818:2: ( (lv_distinct_1_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3819:1: (lv_distinct_1_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3819:1: (lv_distinct_1_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3820:3: lv_distinct_1_0= 'distinct'
                    {
                    lv_distinct_1_0=(Token)match(input,105,FOLLOW_105_in_ruleSelectCore8093); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3834:6: ( (lv_all_2_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3834:6: ( (lv_all_2_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3835:1: (lv_all_2_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3835:1: (lv_all_2_0= 'all' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3836:3: lv_all_2_0= 'all'
                    {
                    lv_all_2_0=(Token)match(input,106,FOLLOW_106_in_ruleSelectCore8130); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3849:4: ( (lv_resultColumns_3_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3850:1: (lv_resultColumns_3_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3850:1: (lv_resultColumns_3_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3851:3: lv_resultColumns_3_0= ruleResultColumn
            {
             
            	        newCompositeNode(grammarAccess.getSelectCoreAccess().getResultColumnsResultColumnParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectCore8166);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3867:2: (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==57) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3867:4: otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleSelectCore8179); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSelectCoreAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3871:1: ( (lv_resultColumns_5_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3872:1: (lv_resultColumns_5_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3872:1: (lv_resultColumns_5_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3873:3: lv_resultColumns_5_0= ruleResultColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getResultColumnsResultColumnParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectCore8200);
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
            	    break loop74;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3889:4: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==81) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3889:6: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_81_in_ruleSelectCore8215); 

                        	newLeafNode(otherlv_6, grammarAccess.getSelectCoreAccess().getFromKeyword_4_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3893:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3894:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3894:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3895:3: lv_source_7_0= ruleJoinSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectCore8236);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3911:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==82) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3911:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,82,FOLLOW_82_in_ruleSelectCore8251); 

                        	newLeafNode(otherlv_8, grammarAccess.getSelectCoreAccess().getWhereKeyword_5_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3915:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3916:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3916:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3917:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getWhereExpressionSqlExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectCore8272);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3933:4: (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==107) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3933:6: otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )*
                    {
                    otherlv_10=(Token)match(input,107,FOLLOW_107_in_ruleSelectCore8287); 

                        	newLeafNode(otherlv_10, grammarAccess.getSelectCoreAccess().getGroupKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,89,FOLLOW_89_in_ruleSelectCore8299); 

                        	newLeafNode(otherlv_11, grammarAccess.getSelectCoreAccess().getByKeyword_6_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3941:1: ( (lv_groupByExpressions_12_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3942:1: (lv_groupByExpressions_12_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3942:1: (lv_groupByExpressions_12_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3943:3: lv_groupByExpressions_12_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getGroupByExpressionsSqlExpressionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectCore8320);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3959:2: (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==57) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3959:4: otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) )
                    	    {
                    	    otherlv_13=(Token)match(input,57,FOLLOW_57_in_ruleSelectCore8333); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getSelectCoreAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3963:1: ( (lv_groupByExpressions_14_0= ruleSqlExpression ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3964:1: (lv_groupByExpressions_14_0= ruleSqlExpression )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3964:1: (lv_groupByExpressions_14_0= ruleSqlExpression )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3965:3: lv_groupByExpressions_14_0= ruleSqlExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getGroupByExpressionsSqlExpressionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectCore8354);
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
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3981:6: (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==108) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3981:8: otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,108,FOLLOW_108_in_ruleSelectCore8371); 

                        	newLeafNode(otherlv_15, grammarAccess.getSelectCoreAccess().getHavingKeyword_7_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3985:1: ( (lv_havingExpression_16_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3986:1: (lv_havingExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3986:1: (lv_havingExpression_16_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3987:3: lv_havingExpression_16_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getHavingExpressionSqlExpressionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectCore8392);
                    lv_havingExpression_16_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
                    	        }
                           		set(
                           			current, 
                           			"havingExpression",
                            		lv_havingExpression_16_0, 
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
    // $ANTLR end "ruleSelectCore"


    // $ANTLR start "entryRuleJoinSource"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4011:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4012:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4013:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
             newCompositeNode(grammarAccess.getJoinSourceRule()); 
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource8430);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;

             current =iv_ruleJoinSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource8440); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4020:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4023:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4024:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4024:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4024:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4024:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4025:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4025:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4026:3: lv_source_0_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource8486);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4042:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=109 && LA80_0<=110)||(LA80_0>=112 && LA80_0<=114)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4043:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4043:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4044:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource8507);
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
            	    break loop80;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4068:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4069:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4070:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
             newCompositeNode(grammarAccess.getSingleSourceRule()); 
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource8544);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;

             current =iv_ruleSingleSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource8554); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4077:1: ruleSingleSource returns [EObject current=null] : ( ( () ( (lv_table_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ) | ( () otherlv_11= '(' ( (lv_joinSource_12_0= ruleJoinSource ) ) otherlv_13= ')' ) ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        Token lv_table_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_alias_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_selectStatement_6_0 = null;

        EObject lv_joinSource_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4080:28: ( ( ( () ( (lv_table_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ) | ( () otherlv_11= '(' ( (lv_joinSource_12_0= ruleJoinSource ) ) otherlv_13= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4081:1: ( ( () ( (lv_table_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ) | ( () otherlv_11= '(' ( (lv_joinSource_12_0= ruleJoinSource ) ) otherlv_13= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4081:1: ( ( () ( (lv_table_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? ) | ( () otherlv_11= '(' ( (lv_joinSource_12_0= ruleJoinSource ) ) otherlv_13= ')' ) )
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==50) ) {
                int LA83_2 = input.LA(2);

                if ( (LA83_2==RULE_ID||LA83_2==50) ) {
                    alt83=3;
                }
                else if ( (LA83_2==104) ) {
                    alt83=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4081:2: ( () ( (lv_table_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4081:2: ( () ( (lv_table_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4081:3: () ( (lv_table_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4081:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4082:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceTableAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4087:2: ( (lv_table_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4088:1: (lv_table_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4088:1: (lv_table_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4089:3: lv_table_1_0= RULE_ID
                    {
                    lv_table_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSource8606); 

                    			newLeafNode(lv_table_1_0, grammarAccess.getSingleSourceAccess().getTableIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleSourceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"table",
                            		lv_table_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4105:2: (otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==59) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4105:4: otherlv_2= 'as' ( (lv_alias_3_0= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleSingleSource8624); 

                                	newLeafNode(otherlv_2, grammarAccess.getSingleSourceAccess().getAsKeyword_0_2_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4109:1: ( (lv_alias_3_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4110:1: (lv_alias_3_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4110:1: (lv_alias_3_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4111:3: lv_alias_3_0= RULE_ID
                            {
                            lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSource8641); 

                            			newLeafNode(lv_alias_3_0, grammarAccess.getSingleSourceAccess().getAliasIDTerminalRuleCall_0_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSingleSourceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"alias",
                                    		lv_alias_3_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4128:6: ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4128:6: ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4128:7: () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4128:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4129:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleSingleSource8677); 

                        	newLeafNode(otherlv_5, grammarAccess.getSingleSourceAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4138:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4139:1: (lv_selectStatement_6_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4139:1: (lv_selectStatement_6_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4140:3: lv_selectStatement_6_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleSourceAccess().getSelectStatementSelectStatementParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSource8698);
                    lv_selectStatement_6_0=ruleSelectStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"selectStatement",
                            		lv_selectStatement_6_0, 
                            		"SelectStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleSingleSource8710); 

                        	newLeafNode(otherlv_7, grammarAccess.getSingleSourceAccess().getRightParenthesisKeyword_1_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4160:1: (otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==59) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4160:3: otherlv_8= 'as' ( (lv_alias_9_0= RULE_ID ) )
                            {
                            otherlv_8=(Token)match(input,59,FOLLOW_59_in_ruleSingleSource8723); 

                                	newLeafNode(otherlv_8, grammarAccess.getSingleSourceAccess().getAsKeyword_1_4_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4164:1: ( (lv_alias_9_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4165:1: (lv_alias_9_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4165:1: (lv_alias_9_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4166:3: lv_alias_9_0= RULE_ID
                            {
                            lv_alias_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSource8740); 

                            			newLeafNode(lv_alias_9_0, grammarAccess.getSingleSourceAccess().getAliasIDTerminalRuleCall_1_4_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSingleSourceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"alias",
                                    		lv_alias_9_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4183:6: ( () otherlv_11= '(' ( (lv_joinSource_12_0= ruleJoinSource ) ) otherlv_13= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4183:6: ( () otherlv_11= '(' ( (lv_joinSource_12_0= ruleJoinSource ) ) otherlv_13= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4183:7: () otherlv_11= '(' ( (lv_joinSource_12_0= ruleJoinSource ) ) otherlv_13= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4183:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4184:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceJoinAction_2_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,50,FOLLOW_50_in_ruleSingleSource8776); 

                        	newLeafNode(otherlv_11, grammarAccess.getSingleSourceAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4193:1: ( (lv_joinSource_12_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4194:1: (lv_joinSource_12_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4194:1: (lv_joinSource_12_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4195:3: lv_joinSource_12_0= ruleJoinSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleSourceAccess().getJoinSourceJoinSourceParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSource8797);
                    lv_joinSource_12_0=ruleJoinSource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"joinSource",
                            		lv_joinSource_12_0, 
                            		"JoinSource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleSingleSource8809); 

                        	newLeafNode(otherlv_13, grammarAccess.getSingleSourceAccess().getRightParenthesisKeyword_2_3());
                        

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4223:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4224:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4225:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
             newCompositeNode(grammarAccess.getJoinStatementRule()); 
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement8846);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;

             current =iv_ruleJoinStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement8856); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4232:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4235:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4236:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4236:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4236:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4236:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4237:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4242:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==109) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4243:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4243:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4244:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,109,FOLLOW_109_in_ruleJoinStatement8908); 

                            newLeafNode(lv_natural_1_0, grammarAccess.getJoinStatementAccess().getNaturalNaturalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "natural", true, "natural");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4257:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt86=4;
            switch ( input.LA(1) ) {
                case 110:
                    {
                    alt86=1;
                    }
                    break;
                case 112:
                    {
                    alt86=2;
                    }
                    break;
                case 113:
                    {
                    alt86=3;
                    }
                    break;
            }

            switch (alt86) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4257:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4257:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4257:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4257:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4258:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4258:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4259:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,110,FOLLOW_110_in_ruleJoinStatement8942); 

                            newLeafNode(lv_left_2_0, grammarAccess.getJoinStatementAccess().getLeftLeftKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "left", true, "left");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4272:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==111) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4273:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4273:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4274:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,111,FOLLOW_111_in_ruleJoinStatement8973); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4288:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4288:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4289:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4289:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4290:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,112,FOLLOW_112_in_ruleJoinStatement9012); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4304:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4304:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4305:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4305:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4306:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,113,FOLLOW_113_in_ruleJoinStatement9049); 

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

            otherlv_6=(Token)match(input,114,FOLLOW_114_in_ruleJoinStatement9076); 

                	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4323:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4324:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4324:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4325:3: lv_singleSource_7_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement9097);
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

            otherlv_8=(Token)match(input,73,FOLLOW_73_in_ruleJoinStatement9109); 

                	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4345:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4346:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4346:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4347:3: lv_expression_9_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement9130);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4371:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4372:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4373:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
             newCompositeNode(grammarAccess.getResultColumnRule()); 
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn9166);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;

             current =iv_ruleResultColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn9176); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4380:1: ruleResultColumn returns [EObject current=null] : ( ( () ( (lv_table_1_0= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? ) ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token lv_table_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_alias_6_0=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4383:28: ( ( ( () ( (lv_table_1_0= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:1: ( ( () ( (lv_table_1_0= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:1: ( ( () ( (lv_table_1_0= RULE_ID ) )? otherlv_2= '*' ) | ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? ) )
            int alt89=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==EOF||(LA89_1>=19 && LA89_1<=20)||(LA89_1>=22 && LA89_1<=51)||LA89_1==57||LA89_1==59||(LA89_1>=81 && LA89_1<=82)||LA89_1==88||(LA89_1>=100 && LA89_1<=103)||(LA89_1>=107 && LA89_1<=108)||LA89_1==120) ) {
                    alt89=2;
                }
                else if ( (LA89_1==21) ) {
                    int LA89_4 = input.LA(3);

                    if ( (LA89_4==EOF||LA89_4==19||LA89_4==51||LA89_4==57||(LA89_4>=81 && LA89_4<=82)||LA89_4==88||(LA89_4>=100 && LA89_4<=103)||(LA89_4>=107 && LA89_4<=108)) ) {
                        alt89=1;
                    }
                    else if ( ((LA89_4>=RULE_ID && LA89_4<=RULE_NUMBER)||LA89_4==25||LA89_4==50||(LA89_4>=52 && LA89_4<=54)||LA89_4==58||(LA89_4>=116 && LA89_4<=119)) ) {
                        alt89=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt89=1;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 25:
            case 50:
            case 52:
            case 53:
            case 54:
            case 58:
            case 116:
            case 117:
            case 118:
            case 119:
                {
                alt89=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:2: ( () ( (lv_table_1_0= RULE_ID ) )? otherlv_2= '*' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:2: ( () ( (lv_table_1_0= RULE_ID ) )? otherlv_2= '*' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:3: () ( (lv_table_1_0= RULE_ID ) )? otherlv_2= '*'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4385:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getResultColumnAccess().getResultColumnAllAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4390:2: ( (lv_table_1_0= RULE_ID ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_ID) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4391:1: (lv_table_1_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4391:1: (lv_table_1_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4392:3: lv_table_1_0= RULE_ID
                            {
                            lv_table_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn9228); 

                            			newLeafNode(lv_table_1_0, grammarAccess.getResultColumnAccess().getTableIDTerminalRuleCall_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getResultColumnRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"table",
                                    		lv_table_1_0, 
                                    		"ID");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleResultColumn9246); 

                        	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsteriskKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4413:6: ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4413:6: ( () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4413:7: () ( (lv_expression_4_0= ruleSqlExpression ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4413:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4414:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getResultColumnAccess().getResultColumnExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4419:2: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4420:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4420:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4421:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn9284);
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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4437:2: (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==59) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4437:4: otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,59,FOLLOW_59_in_ruleResultColumn9297); 

                                	newLeafNode(otherlv_5, grammarAccess.getResultColumnAccess().getAsKeyword_1_2_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4441:1: ( (lv_alias_6_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4442:1: (lv_alias_6_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4442:1: (lv_alias_6_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4443:3: lv_alias_6_0= RULE_ID
                            {
                            lv_alias_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn9314); 

                            			newLeafNode(lv_alias_6_0, grammarAccess.getResultColumnAccess().getAliasIDTerminalRuleCall_1_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getResultColumnRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"alias",
                                    		lv_alias_6_0, 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4467:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4468:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4469:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
             newCompositeNode(grammarAccess.getConflictClauseRule()); 
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause9358);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;

             current =iv_ruleConflictClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause9368); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4476:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4479:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4480:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4480:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4480:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleConflictClause9405); 

                	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                
            otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleConflictClause9417); 

                	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4488:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4489:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4489:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4490:3: lv_resolution_2_0= ruleConflictResolution
            {
             
            	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause9438);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4514:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4515:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4516:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue9474);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;

             current =iv_ruleLiteralValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue9484); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4523:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4526:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4527:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4527:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            int alt90=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 25:
                {
                alt90=1;
                }
                break;
            case RULE_STRING:
                {
                alt90=2;
                }
                break;
            case 116:
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
            case 119:
                {
                alt90=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4527:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4527:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4527:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4527:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4528:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4533:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4534:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4534:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4535:3: lv_number_1_0= ruleSignedNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue9540);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4552:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4552:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4552:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4552:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4553:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4558:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4559:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4559:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4560:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue9574); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4577:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4577:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4577:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4577:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4578:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4583:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4584:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4584:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4585:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,116,FOLLOW_116_in_ruleLiteralValue9614); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4599:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4599:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4599:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4599:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4600:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4605:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4606:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4606:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4607:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,117,FOLLOW_117_in_ruleLiteralValue9662); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4621:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4621:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4621:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4621:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4622:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4627:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4628:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4628:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4629:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,118,FOLLOW_118_in_ruleLiteralValue9710); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4643:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4643:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4643:7: () ( (lv_literal_11_0= 'current_time_stamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4643:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4644:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4649:2: ( (lv_literal_11_0= 'current_time_stamp' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4650:1: (lv_literal_11_0= 'current_time_stamp' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4650:1: (lv_literal_11_0= 'current_time_stamp' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4651:3: lv_literal_11_0= 'current_time_stamp'
                    {
                    lv_literal_11_0=(Token)match(input,119,FOLLOW_119_in_ruleLiteralValue9758); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4672:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4673:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4674:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
             newCompositeNode(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber9809);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;

             current =iv_ruleSignedNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber9820); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4681:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4684:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4685:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4685:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4685:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4685:2: (kw= '-' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==25) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4686:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleSignedNumber9859); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber9876); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4706:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4707:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4708:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN9922);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN9933); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4715:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4718:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4719:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4719:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4719:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN9973); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4726:1: (kw= '.' this_ID_2= RULE_ID )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==120) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4727:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,120,FOLLOW_120_in_ruleFQN9992); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN10007); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop92;
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


    // $ANTLR start "ruleColumnType"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4747:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4749:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4750:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4750:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4750:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4750:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4750:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_121_in_ruleColumnType10068); 

                            current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4756:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4756:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4756:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_122_in_ruleColumnType10085); 

                            current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4762:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4762:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4762:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_123_in_ruleColumnType10102); 

                            current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4768:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4768:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4768:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_124_in_ruleColumnType10119); 

                            current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4774:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4774:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4774:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,125,FOLLOW_125_in_ruleColumnType10136); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4784:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4786:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4787:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4787:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4787:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4787:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4787:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_121_in_ruleSqliteDataType10181); 

                            current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4793:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4793:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4793:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_122_in_ruleSqliteDataType10198); 

                            current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4799:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4799:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4799:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_123_in_ruleSqliteDataType10215); 

                            current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4805:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4805:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4805:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_124_in_ruleSqliteDataType10232); 

                            current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4811:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4811:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4811:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,126,FOLLOW_126_in_ruleSqliteDataType10249); 

                            current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4817:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4817:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4817:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,127,FOLLOW_127_in_ruleSqliteDataType10266); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4827:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4829:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4830:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4830:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
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
            case 83:
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4830:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4830:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4830:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_128_in_ruleConflictResolution10311); 

                            current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_129_in_ruleConflictResolution10328); 

                            current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4842:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4842:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4842:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_130_in_ruleConflictResolution10345); 

                            current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4848:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4848:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4848:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,131,FOLLOW_131_in_ruleConflictResolution10362); 

                            current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4854:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4854:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4854:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_83_in_ruleConflictResolution10379); 

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
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA27_eotS =
        "\12\uffff";
    static final String DFA27_eofS =
        "\1\uffff\1\10\10\uffff";
    static final String DFA27_minS =
        "\1\4\1\23\1\uffff\1\4\6\uffff";
    static final String DFA27_maxS =
        "\1\167\1\170\1\uffff\1\167\6\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\7\1\6\1\1\1\3";
    static final String DFA27_specialS =
        "\12\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\2\2\22\uffff\1\2\30\uffff\1\3\1\uffff\2\4\1\5\3\uffff\1"+
            "\6\71\uffff\4\2",
            "\37\10\1\7\1\10\3\uffff\3\10\1\uffff\3\10\17\uffff\1\10\3\uffff"+
            "\2\10\5\uffff\1\10\5\uffff\2\10\4\uffff\4\10\3\uffff\4\10\1"+
            "\uffff\3\10\5\uffff\1\10",
            "",
            "\3\11\22\uffff\1\11\30\uffff\1\11\1\uffff\3\11\3\uffff\1\11"+
            "\55\uffff\1\4\13\uffff\4\11",
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
            return "1320:1: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_SqlExpression_5= ruleSqlExpression otherlv_6= ')' ) | ( () ( (lv_not_8_0= 'not' ) )? ( (lv_exists_9_0= 'exists' ) )? otherlv_10= '(' ( (lv_select_11_0= ruleSelectStatement ) ) otherlv_12= ')' ) | ( () otherlv_14= 'case' ( (lv_caseExpression_15_0= ruleSqlExpression ) )? ( (lv_cases_16_0= ruleCase ) ) ( (lv_cases_17_0= ruleCase ) )* (otherlv_18= 'else' ( (lv_elseExpression_19_0= ruleSqlExpression ) ) )? otherlv_20= 'end' ) | ( () ( (lv_name_22_0= RULE_ID ) ) otherlv_23= '(' ( ( (lv_all_24_0= '*' ) ) | ( ( (lv_arguments_25_0= ruleSqlExpression ) ) (otherlv_26= ',' ( (lv_arugments_27_0= ruleSqlExpression ) ) )* ) ) otherlv_28= ')' ) | ( () otherlv_30= 'cast' otherlv_31= '(' ( (lv_expression_32_0= ruleSqlExpression ) ) otherlv_33= 'as' ( (lv_type_34_0= ruleSqliteDataType ) ) otherlv_35= ')' ) )";
        }
    }
    static final String DFA41_eotS =
        "\12\uffff";
    static final String DFA41_eofS =
        "\12\uffff";
    static final String DFA41_minS =
        "\1\76\1\77\1\uffff\1\77\6\uffff";
    static final String DFA41_maxS =
        "\1\117\1\101\1\uffff\1\101\6\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\4\1\uffff\1\2\1\1\1\3\1\7\1\6\1\5";
    static final String DFA41_specialS =
        "\12\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\17\uffff\1\2\1\3",
            "\1\5\1\4\1\6",
            "",
            "\1\11\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1775:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'create' otherlv_13= 'view' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= 'as' ( (lv_selectStatement_16_0= ruleSelectStatement ) ) ) | ( () otherlv_18= 'create' otherlv_19= 'trigger' ( (lv_name_20_0= RULE_ID ) ) (otherlv_21= 'before' | otherlv_22= 'after' | (otherlv_23= 'instead' otherlv_24= 'of' ) )? (otherlv_25= 'delete' | otherlv_26= 'insert' | (otherlv_27= 'update' (otherlv_28= 'of' ( (lv_updateColumnNames_29_0= RULE_ID ) ) (otherlv_30= ',' ( (lv_updateColumnNames_31_0= RULE_ID ) ) )* )? ) ) otherlv_32= 'on' ( (lv_tableName_33_0= RULE_ID ) ) (otherlv_34= 'for' otherlv_35= 'each' otherlv_36= 'row' )? (otherlv_37= 'when' ( (lv_whenExpression_38_0= ruleSqlExpression ) ) )? otherlv_39= 'begin' ( ( (lv_statements_40_0= ruleDMLStatement ) ) otherlv_41= ';' ( ( (lv_statements_42_0= ruleDMLStatement ) ) otherlv_43= ';' )* )? otherlv_44= 'end' ) | ( () otherlv_46= 'alter' otherlv_47= 'table' ( (lv_name_48_0= RULE_ID ) ) ( (lv_clause_49_0= ruleAlterTableClause ) ) ) | ( () otherlv_51= 'drop' otherlv_52= 'table' (otherlv_53= 'if' otherlv_54= 'exists' )? ( (lv_name_55_0= RULE_ID ) ) ) | ( () otherlv_57= 'drop' otherlv_58= 'trigger' (otherlv_59= 'if' otherlv_60= 'exists' )? ( (lv_name_61_0= RULE_ID ) ) ) | ( () otherlv_63= 'drop' otherlv_64= 'view' (otherlv_65= 'if' otherlv_66= 'exists' )? ( (lv_name_67_0= RULE_ID ) ) ) )";
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
    public static final BitSet FOLLOW_14_in_ruleDatabaseBlock281 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_ruleConfigBlock_in_ruleDatabaseBlock302 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock324 = new BitSet(new long[]{0x0000000000048000L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationStatement584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationStatement606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMigrationBlock703 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock715 = new BitSet(new long[]{0x4000000000008000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock737 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock749 = new BitSet(new long[]{0x4000000000008000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock771 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock783 = new BitSet(new long[]{0x4000000000008000L,0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat982 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleExprConcat1009 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1043 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1138 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_21_in_ruleExprMult1167 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_22_in_ruleExprMult1196 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_23_in_ruleExprMult1225 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1262 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1357 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleExprAdd1386 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_25_in_ruleExprAdd1415 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1452 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1547 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_26_in_ruleExprBit1576 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_27_in_ruleExprBit1605 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_28_in_ruleExprBit1634 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_29_in_ruleExprBit1663 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1700 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate1738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate1795 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_30_in_ruleExprRelate1824 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_31_in_ruleExprRelate1853 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_32_in_ruleExprRelate1882 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_33_in_ruleExprRelate1911 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate1948 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2043 = new BitSet(new long[]{0x00001FFC00000002L});
    public static final BitSet FOLLOW_34_in_ruleExprEqual2072 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_35_in_ruleExprEqual2101 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprEqual2130 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_37_in_ruleExprEqual2159 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_38_in_ruleExprEqual2188 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2217 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2246 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2275 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2304 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2333 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2362 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2399 = new BitSet(new long[]{0x00001FFC00000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2494 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleExprAnd2521 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2555 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr2650 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExprOr2677 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr2711 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression2806 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_47_in_ruleNullCheckExpression2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNullCheckExpression2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNullCheckExpression2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimaryExpression2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrimaryExpression3025 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3047 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimaryExpression3093 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3125 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_rulePrimaryExpression3151 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3172 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3213 = new BitSet(new long[]{0x1474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3234 = new BitSet(new long[]{0x1474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression3256 = new BitSet(new long[]{0x15F4000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression3277 = new BitSet(new long[]{0x15F4000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3291 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3312 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3360 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_rulePrimaryExpression3377 = new BitSet(new long[]{0x0474000002200070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3396 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3437 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3450 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3471 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3516 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_rulePrimaryExpression3528 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3549 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3561 = new BitSet(new long[]{0x0000000000000000L,0xDE00000000000000L});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression3582 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase3631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCase3678 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase3699 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleCase3711 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement3768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDDLStatement3825 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleDDLStatement3837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement3854 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleDDLStatement3871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleDDLStatement3892 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDDLStatement3905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleDDLStatement3926 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDDLStatement3941 = new BitSet(new long[]{0x0000000000000000L,0x0000000E10000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleDDLStatement3962 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDDLStatement3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDDLStatement4005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDDLStatement4017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4034 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleDDLStatement4051 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDDLStatement4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDDLStatement4101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDDLStatement4113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4130 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001DCL});
    public static final BitSet FOLLOW_66_in_ruleDDLStatement4148 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_67_in_ruleDDLStatement4166 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_68_in_ruleDDLStatement4185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleDDLStatement4197 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleDDLStatement4213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_71_in_ruleDDLStatement4231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72_in_ruleDDLStatement4250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000220L});
    public static final BitSet FOLLOW_69_in_ruleDDLStatement4263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4280 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_57_in_ruleDDLStatement4298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4315 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleDDLStatement4338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4355 = new BitSet(new long[]{0x1000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_74_in_ruleDDLStatement4373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleDDLStatement4385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleDDLStatement4397 = new BitSet(new long[]{0x1000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_60_in_ruleDDLStatement4412 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDDLStatement4433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleDDLStatement4447 = new BitSet(new long[]{0x0100000000000000L,0x00000100000801C0L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleDDLStatement4469 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDDLStatement4481 = new BitSet(new long[]{0x0100000000000000L,0x00000100000801C0L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleDDLStatement4503 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDDLStatement4515 = new BitSet(new long[]{0x0100000000000000L,0x00000100000801C0L});
    public static final BitSet FOLLOW_56_in_ruleDDLStatement4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDDLStatement4560 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleDDLStatement4572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4589 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_ruleDDLStatement4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDDLStatement4644 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleDDLStatement4656 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleDDLStatement4669 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleDDLStatement4681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDDLStatement4734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDDLStatement4746 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleDDLStatement4759 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleDDLStatement4771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDDLStatement4824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDDLStatement4836 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleDDLStatement4849 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleDDLStatement4861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDDLStatement4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement4922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement5095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDeleteStatement5142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleDeleteStatement5154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement5171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleDeleteStatement5189 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement5248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleInsertStatement5297 = new BitSet(new long[]{0x0000400000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_46_in_ruleInsertStatement5310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement5331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_83_in_ruleInsertStatement5352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleInsertStatement5365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement5382 = new BitSet(new long[]{0x0004000000000000L,0x0000010000600000L});
    public static final BitSet FOLLOW_50_in_ruleInsertStatement5400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement5417 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_ruleInsertStatement5435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement5452 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_51_in_ruleInsertStatement5471 = new BitSet(new long[]{0x0000000000000000L,0x0000010000600000L});
    public static final BitSet FOLLOW_85_in_ruleInsertStatement5488 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleInsertStatement5500 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement5521 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_ruleInsertStatement5534 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement5555 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_51_in_ruleInsertStatement5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleInsertStatement5617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleInsertStatement5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement5667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUpdateStatement5714 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleUpdateStatement5727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement5748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement5767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleUpdateStatement5784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5805 = new BitSet(new long[]{0x0200000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_57_in_ruleUpdateStatement5818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement5839 = new BitSet(new long[]{0x0200000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleUpdateStatement5854 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression5913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression5965 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUpdateColumnExpression5982 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement6039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement6095 = new BitSet(new long[]{0x0000000000000002L,0x000000F001000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectStatement6112 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement6132 = new BitSet(new long[]{0x0000000000000002L,0x000000F001000000L});
    public static final BitSet FOLLOW_88_in_ruleSelectStatement6147 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleSelectStatement6159 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6180 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSelectStatement6193 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleSelectStatement6214 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause6254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableClause6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleAlterTableClause6311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableClause6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAlterTableClause6362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableClause6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef6420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef6472 = new BitSet(new long[]{0x0000000000000000L,0x3E00000000000000L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef6498 = new BitSet(new long[]{0x0001000000000002L,0x0000000010400000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef6519 = new BitSet(new long[]{0x0001000000000002L,0x0000000010400000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint6556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleColumnConstraint6613 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleColumnConstraint6625 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_94_in_ruleColumnConstraint6644 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_95_in_ruleColumnConstraint6681 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleColumnConstraint6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleColumnConstraint6757 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleColumnConstraint6808 = new BitSet(new long[]{0x0004000002000060L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue6866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDefaultValue6961 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue6982 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDefaultValue6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint7031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTableConstraint7089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableConstraint7106 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleTableConstraint7125 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTableConstraint7137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7158 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_ruleTableConstraint7171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7192 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTableConstraint7206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleTableConstraint7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTableConstraint7257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableConstraint7274 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleTableConstraint7293 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleTableConstraint7305 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTableConstraint7317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7338 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_57_in_ruleTableConstraint7351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleTableConstraint7372 = new BitSet(new long[]{0x0208000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTableConstraint7386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleTableConstraint7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTableConstraint7437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableConstraint7454 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTableConstraint7473 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTableConstraint7485 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleTableConstraint7506 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleTableConstraint7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn7555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn7610 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_94_in_ruleIndexedColumn7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleIndexedColumn7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_entryRuleCompoundOperator7718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundOperator7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleCompoundOperator7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleCompoundOperator7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleCompoundOperator7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleCompoundOperator7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm7864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm7920 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_94_in_ruleOrderingTerm7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOrderingTerm7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore8027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore8037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleSelectCore8074 = new BitSet(new long[]{0x0474000002200070L,0x00F0060000000000L});
    public static final BitSet FOLLOW_105_in_ruleSelectCore8093 = new BitSet(new long[]{0x0474000002200070L,0x00F0060000000000L});
    public static final BitSet FOLLOW_106_in_ruleSelectCore8130 = new BitSet(new long[]{0x0474000002200070L,0x00F0060000000000L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectCore8166 = new BitSet(new long[]{0x0200000000000002L,0x0000180000060000L});
    public static final BitSet FOLLOW_57_in_ruleSelectCore8179 = new BitSet(new long[]{0x0474000002200070L,0x00F0060000000000L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectCore8200 = new BitSet(new long[]{0x0200000000000002L,0x0000180000060000L});
    public static final BitSet FOLLOW_81_in_ruleSelectCore8215 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectCore8236 = new BitSet(new long[]{0x0000000000000002L,0x0000180000040000L});
    public static final BitSet FOLLOW_82_in_ruleSelectCore8251 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectCore8272 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_107_in_ruleSelectCore8287 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleSelectCore8299 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectCore8320 = new BitSet(new long[]{0x0200000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_57_in_ruleSelectCore8333 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectCore8354 = new BitSet(new long[]{0x0200000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleSelectCore8371 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectCore8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource8430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource8486 = new BitSet(new long[]{0x0000000000000002L,0x0007600000000000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource8507 = new BitSet(new long[]{0x0000000000000002L,0x0007600000000000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource8544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSource8606 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSingleSource8624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSource8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSingleSource8677 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSource8698 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleSingleSource8710 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSingleSource8723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSource8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSingleSource8776 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSource8797 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleSingleSource8809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement8846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleJoinStatement8908 = new BitSet(new long[]{0x0000000000000000L,0x0007400000000000L});
    public static final BitSet FOLLOW_110_in_ruleJoinStatement8942 = new BitSet(new long[]{0x0000000000000000L,0x0004800000000000L});
    public static final BitSet FOLLOW_111_in_ruleJoinStatement8973 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_112_in_ruleJoinStatement9012 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_113_in_ruleJoinStatement9049 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleJoinStatement9076 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement9097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleJoinStatement9109 = new BitSet(new long[]{0x0474000002000070L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn9166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn9228 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResultColumn9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn9284 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleResultColumn9297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause9358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause9368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleConflictClause9405 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleConflictClause9417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue9474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue9540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleLiteralValue9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleLiteralValue9662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleLiteralValue9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleLiteralValue9758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber9809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSignedNumber9859 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN9922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN9933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN9973 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleFQN9992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN10007 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_121_in_ruleColumnType10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleColumnType10085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleColumnType10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleColumnType10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleColumnType10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleSqliteDataType10181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleSqliteDataType10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSqliteDataType10215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSqliteDataType10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleSqliteDataType10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSqliteDataType10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleConflictResolution10311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleConflictResolution10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleConflictResolution10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleConflictResolution10362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleConflictResolution10379 = new BitSet(new long[]{0x0000000000000002L});

}