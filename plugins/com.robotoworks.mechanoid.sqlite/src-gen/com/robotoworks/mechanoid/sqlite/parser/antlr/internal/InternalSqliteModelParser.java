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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'action'", "'migration'", "';'", "'||'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new'", "'.'", "'old'", "'('", "')'", "'not'", "'exists'", "'case'", "'else'", "'end'", "','", "'cast'", "'as'", "'when'", "'then'", "'order by'", "'select'", "'distinct'", "'all'", "'from'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'.*'", "'null'", "'current_time'", "'current_date'", "'current_time_stamp'", "'create'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'drop'", "'if exists'", "'rename to'", "'add column'", "'primary key'", "'autoincrement'", "'default'", "'constraint'", "'unique'", "'check'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_database_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_database_2_0= ruleDatabaseBlock ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:85:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:87:3: lv_packageName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:349:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statements_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:352:28: ( ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:2: () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )* otherlv_5= '}'
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
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:367:1: ( ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==87||(LA4_0>=100 && LA4_0<=101)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:367:2: ( (lv_statements_3_0= ruleDDLStatement ) ) otherlv_4= ';'
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
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMigrationBlock763); 

                	newLeafNode(otherlv_5, grammarAccess.getMigrationBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:401:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:402:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:403:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
             newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression799);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;

             current =iv_ruleSqlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression809); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:410:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:413:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:415:5: this_ExprConcat_0= ruleExprConcat
            {
             
                    newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression855);
            this_ExprConcat_0=ruleExprConcat();

            state._fsp--;

             
                    current = this_ExprConcat_0; 
                    afterParserOrEnumRuleCall();
                

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:431:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:432:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:433:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
             newCompositeNode(grammarAccess.getExprConcatRule()); 
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat889);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;

             current =iv_ruleExprConcat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat899); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:440:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:443:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:444:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:444:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:445:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat946);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;

             
                    current = this_ExprMult_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:453:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:453:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:453:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:454:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:459:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:460:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:460:1: (lv_op_2_0= '||' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:461:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,20,FOLLOW_20_in_ruleExprConcat973); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprConcatRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:474:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:475:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:475:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:476:3: lv_right_3_0= ruleExprMult
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat1007);
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
            	    break loop5;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:500:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:501:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:502:2: iv_ruleExprMult= ruleExprMult EOF
            {
             newCompositeNode(grammarAccess.getExprMultRule()); 
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult1045);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;

             current =iv_ruleExprMult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult1055); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:509:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:512:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:513:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:513:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:514:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1102);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;

             
                    current = this_ExprAdd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:522:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:522:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:522:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:523:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:528:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:529:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:529:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:530:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:530:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt6=3;
            	    switch ( input.LA(1) ) {
            	    case 21:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:531:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_21_in_ruleExprMult1131); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprMultAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprMultRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:543:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,22,FOLLOW_22_in_ruleExprMult1160); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprMultAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprMultRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:555:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,23,FOLLOW_23_in_ruleExprMult1189); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:570:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:571:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:571:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:572:3: lv_right_3_0= ruleExprAdd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult1226);
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
    // $ANTLR end "ruleExprMult"


    // $ANTLR start "entryRuleExprAdd"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:596:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:597:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:598:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
             newCompositeNode(grammarAccess.getExprAddRule()); 
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd1264);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;

             current =iv_ruleExprAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd1274); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:605:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:608:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:609:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:609:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:610:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1321);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;

             
                    current = this_ExprBit_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:618:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:618:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:618:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:619:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:624:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:625:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:625:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:626:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:626:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==24) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==25) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:627:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,24,FOLLOW_24_in_ruleExprAdd1350); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprAddAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprAddRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:639:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,25,FOLLOW_25_in_ruleExprAdd1379); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:654:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:655:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:655:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:656:3: lv_right_3_0= ruleExprBit
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd1416);
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
    // $ANTLR end "ruleExprAdd"


    // $ANTLR start "entryRuleExprBit"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:680:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:681:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:682:2: iv_ruleExprBit= ruleExprBit EOF
            {
             newCompositeNode(grammarAccess.getExprBitRule()); 
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit1454);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;

             current =iv_ruleExprBit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit1464); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:689:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:692:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:693:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:693:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:694:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit1511);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;

             
                    current = this_ExprRelate_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:702:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:702:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:702:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:703:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:708:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:709:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:709:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:710:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:710:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt10=4;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:711:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_ruleExprBit1540); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprBitAccess().getOpLessThanSignLessThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:723:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_ruleExprBit1569); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprBitAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:735:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,28,FOLLOW_28_in_ruleExprBit1598); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprBitAccess().getOpAmpersandKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprBitRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:747:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,29,FOLLOW_29_in_ruleExprBit1627); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:762:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:763:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:763:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:764:3: lv_right_3_0= ruleExprRelate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit1664);
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
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:788:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:789:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:790:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
             newCompositeNode(grammarAccess.getExprRelateRule()); 
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate1702);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;

             current =iv_ruleExprRelate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate1712); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:797:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:800:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:801:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:801:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:802:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate1759);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;

             
                    current = this_ExprEqual_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:810:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:810:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:810:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:811:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:816:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:817:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:817:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:818:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:818:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 33:
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
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:819:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_30_in_ruleExprRelate1788); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprRelateAccess().getOpLessThanSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:831:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,31,FOLLOW_31_in_ruleExprRelate1817); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprRelateAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:843:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,32,FOLLOW_32_in_ruleExprRelate1846); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprRelateAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprRelateRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:855:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,33,FOLLOW_33_in_ruleExprRelate1875); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:870:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:871:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:871:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:872:3: lv_right_3_0= ruleExprEqual
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate1912);
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
    // $ANTLR end "ruleExprRelate"


    // $ANTLR start "entryRuleExprEqual"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:896:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:897:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:898:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
             newCompositeNode(grammarAccess.getExprEqualRule()); 
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual1950);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;

             current =iv_ruleExprEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual1960); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:905:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:908:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:909:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:909:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:910:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2007);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;

             
                    current = this_ExprAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:918:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=34 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:918:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:918:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:919:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:924:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:925:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:925:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:926:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:926:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'like' | lv_op_2_9= 'glob' | lv_op_2_10= 'match' | lv_op_2_11= 'regexp' )
            	    int alt14=11;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt14=5;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt14=6;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt14=7;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt14=8;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt14=9;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt14=10;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt14=11;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:927:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleExprEqual2036); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getExprEqualAccess().getOpEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:939:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleExprEqual2065); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getExprEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:951:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,36,FOLLOW_36_in_ruleExprEqual2094); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getExprEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:963:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,37,FOLLOW_37_in_ruleExprEqual2123); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getExprEqualAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:975:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,38,FOLLOW_38_in_ruleExprEqual2152); 

            	                    newLeafNode(lv_op_2_5, grammarAccess.getExprEqualAccess().getOpIsKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:987:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,39,FOLLOW_39_in_ruleExprEqual2181); 

            	                    newLeafNode(lv_op_2_6, grammarAccess.getExprEqualAccess().getOpIsNotKeyword_1_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            	    

            	            }
            	            break;
            	        case 7 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:999:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,40,FOLLOW_40_in_ruleExprEqual2210); 

            	                    newLeafNode(lv_op_2_7, grammarAccess.getExprEqualAccess().getOpInKeyword_1_1_0_6());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_7, null);
            	            	    

            	            }
            	            break;
            	        case 8 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1011:8: lv_op_2_8= 'like'
            	            {
            	            lv_op_2_8=(Token)match(input,41,FOLLOW_41_in_ruleExprEqual2239); 

            	                    newLeafNode(lv_op_2_8, grammarAccess.getExprEqualAccess().getOpLikeKeyword_1_1_0_7());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_8, null);
            	            	    

            	            }
            	            break;
            	        case 9 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1023:8: lv_op_2_9= 'glob'
            	            {
            	            lv_op_2_9=(Token)match(input,42,FOLLOW_42_in_ruleExprEqual2268); 

            	                    newLeafNode(lv_op_2_9, grammarAccess.getExprEqualAccess().getOpGlobKeyword_1_1_0_8());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_9, null);
            	            	    

            	            }
            	            break;
            	        case 10 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1035:8: lv_op_2_10= 'match'
            	            {
            	            lv_op_2_10=(Token)match(input,43,FOLLOW_43_in_ruleExprEqual2297); 

            	                    newLeafNode(lv_op_2_10, grammarAccess.getExprEqualAccess().getOpMatchKeyword_1_1_0_9());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExprEqualRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_10, null);
            	            	    

            	            }
            	            break;
            	        case 11 :
            	            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1047:8: lv_op_2_11= 'regexp'
            	            {
            	            lv_op_2_11=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual2326); 

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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1062:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1063:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1063:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1064:3: lv_right_3_0= ruleExprAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual2363);
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
    // $ANTLR end "ruleExprEqual"


    // $ANTLR start "entryRuleExprAnd"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1088:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1089:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1090:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
             newCompositeNode(grammarAccess.getExprAndRule()); 
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2401);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;

             current =iv_ruleExprAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2411); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1097:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1100:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1101:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1101:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1102:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2458);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;

             
                    current = this_ExprOr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1110:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==45) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1110:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1110:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1111:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1116:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1117:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1117:1: (lv_op_2_0= 'and' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1118:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,45,FOLLOW_45_in_ruleExprAnd2485); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprAndRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1131:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1132:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1132:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1133:3: lv_right_3_0= ruleExprOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2519);
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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1157:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1158:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1159:2: iv_ruleExprOr= ruleExprOr EOF
            {
             newCompositeNode(grammarAccess.getExprOrRule()); 
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2557);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;

             current =iv_ruleExprOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2567); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1166:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1169:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1170:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1170:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr2614);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;

             
                    current = this_NullCheckExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1179:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1179:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1179:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1180:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1185:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1186:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1186:1: (lv_op_2_0= 'or' )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1187:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,46,FOLLOW_46_in_ruleExprOr2641); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExprOrRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1200:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1201:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1201:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1202:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr2675);
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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleNullCheckExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1226:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1227:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1228:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
             newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression2713);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;

             current =iv_ruleNullCheckExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression2723); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1235:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1238:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1239:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1239:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1240:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression2770);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1248:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=47 && LA18_0<=49)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1248:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1248:2: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1249:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1254:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1255:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1255:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1256:3: lv_right_2_0= ruleNullExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression2800);
                    lv_right_2_0=ruleNullExpression();

                    state._fsp--;


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


    // $ANTLR start "entryRuleNullExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1280:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1281:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1282:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression2838);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression2848); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1289:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1292:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1293:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1293:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=48 && LA20_0<=49)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1293:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1293:2: ( () otherlv_1= 'is null' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1293:3: () otherlv_1= 'is null'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1293:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1294:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleNullExpression2895); 

                        	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1304:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1304:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1304:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1304:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1305:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1310:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==48) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==49) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1310:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleNullExpression2925); 

                                	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1315:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleNullExpression2943); 

                                	newLeafNode(otherlv_4, grammarAccess.getNullExpressionAccess().getNotnullKeyword_1_1_1());
                                

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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1327:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1328:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1329:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2981);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2991); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1336:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_literalValue_13_0= ruleLiteralValue ) ) ) | ( () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')' ) | ( () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')' ) | ( () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end' ) | ( () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')' ) | ( () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_not_19_0=null;
        Token lv_exists_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token lv_name_32_0=null;
        Token otherlv_33=null;
        Token lv_all_34_0=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        EObject lv_literalValue_13_0 = null;

        EObject lv_expression_16_0 = null;

        EObject lv_select_22_0 = null;

        EObject lv_caseExpression_26_0 = null;

        EObject lv_cases_27_0 = null;

        EObject lv_elseExpression_29_0 = null;

        EObject lv_arguments_35_0 = null;

        EObject lv_arugments_37_0 = null;

        EObject lv_expression_42_0 = null;

        Enumerator lv_type_44_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1339:28: ( ( ( () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_literalValue_13_0= ruleLiteralValue ) ) ) | ( () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')' ) | ( () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')' ) | ( () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end' ) | ( () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')' ) | ( () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1340:1: ( ( () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_literalValue_13_0= ruleLiteralValue ) ) ) | ( () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')' ) | ( () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')' ) | ( () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end' ) | ( () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')' ) | ( () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1340:1: ( ( () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_literalValue_13_0= ruleLiteralValue ) ) ) | ( () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')' ) | ( () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')' ) | ( () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end' ) | ( () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')' ) | ( () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')' ) )
            int alt29=9;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1340:2: ( () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1340:2: ( () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1340:3: () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1340:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1341:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNewColumnSourceAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_rulePrimaryExpression3038); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3050); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_0_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1354:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1355:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1355:1: (otherlv_3= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1356:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3070); 

                    		newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1368:6: ( () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1368:6: ( () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1368:7: () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1368:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1369:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getOldColumnSourceAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,52,FOLLOW_52_in_rulePrimaryExpression3099); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                        
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3111); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_1_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1382:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1383:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1383:1: (otherlv_7= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1384:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3131); 

                    		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1396:6: ( () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1396:6: ( () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1396:7: () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1396:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1397:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getColumnSourceAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1402:2: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==51) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1402:3: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.'
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1402:3: ( (otherlv_9= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1403:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1403:1: (otherlv_9= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1404:3: otherlv_9= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                    
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3169); 

                            		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0()); 
                            	

                            }


                            }

                            otherlv_10=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression3181); 

                                	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1());
                                

                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1419:3: ( (otherlv_11= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1420:1: (otherlv_11= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1420:1: (otherlv_11= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1421:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3203); 

                    		newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1433:6: ( () ( (lv_literalValue_13_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1433:6: ( () ( (lv_literalValue_13_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1433:7: () ( (lv_literalValue_13_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1433:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1434:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1439:2: ( (lv_literalValue_13_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1440:1: (lv_literalValue_13_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1440:1: (lv_literalValue_13_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1441:3: lv_literalValue_13_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3241);
                    lv_literalValue_13_0=ruleLiteralValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"literalValue",
                            		lv_literalValue_13_0, 
                            		"LiteralValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1458:6: ( () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1458:6: ( () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1458:7: () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1458:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1459:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                current);
                        

                    }

                    otherlv_15=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3270); 

                        	newLeafNode(otherlv_15, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1468:1: ( (lv_expression_16_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1469:1: (lv_expression_16_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1469:1: (lv_expression_16_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1470:3: lv_expression_16_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3291);
                    lv_expression_16_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_16_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3303); 

                        	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1491:6: ( () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1491:6: ( () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1491:7: () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1491:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1492:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1497:2: ( (lv_not_19_0= 'not' ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==55) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1498:1: (lv_not_19_0= 'not' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1498:1: (lv_not_19_0= 'not' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1499:3: lv_not_19_0= 'not'
                            {
                            lv_not_19_0=(Token)match(input,55,FOLLOW_55_in_rulePrimaryExpression3338); 

                                    newLeafNode(lv_not_19_0, grammarAccess.getPrimaryExpressionAccess().getNotNotKeyword_5_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "not", true, "not");
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1512:3: ( (lv_exists_20_0= 'exists' ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==56) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1513:1: (lv_exists_20_0= 'exists' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1513:1: (lv_exists_20_0= 'exists' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1514:3: lv_exists_20_0= 'exists'
                            {
                            lv_exists_20_0=(Token)match(input,56,FOLLOW_56_in_rulePrimaryExpression3370); 

                                    newLeafNode(lv_exists_20_0, grammarAccess.getPrimaryExpressionAccess().getExistsExistsKeyword_5_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "exists", true, "exists");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3396); 

                        	newLeafNode(otherlv_21, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1531:1: ( (lv_select_22_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1532:1: (lv_select_22_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1532:1: (lv_select_22_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1533:3: lv_select_22_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3417);
                    lv_select_22_0=ruleSelectStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"select",
                            		lv_select_22_0, 
                            		"SelectStatement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_23=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3429); 

                        	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1554:6: ( () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1554:6: ( () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1554:7: () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1554:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1555:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                current);
                        

                    }

                    otherlv_25=(Token)match(input,57,FOLLOW_57_in_rulePrimaryExpression3458); 

                        	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1564:1: ( (lv_caseExpression_26_0= ruleSqlExpression ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_NUMBER)||LA24_0==25||LA24_0==50||(LA24_0>=52 && LA24_0<=53)||(LA24_0>=55 && LA24_0<=57)||LA24_0==61||(LA24_0>=83 && LA24_0<=86)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1565:1: (lv_caseExpression_26_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1565:1: (lv_caseExpression_26_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1566:3: lv_caseExpression_26_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3479);
                            lv_caseExpression_26_0=ruleSqlExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"caseExpression",
                                    		lv_caseExpression_26_0, 
                                    		"SqlExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1582:3: ( (lv_cases_27_0= ruleCase ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==63) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1583:1: (lv_cases_27_0= ruleCase )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1583:1: (lv_cases_27_0= ruleCase )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1584:3: lv_cases_27_0= ruleCase
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression3501);
                    	    lv_cases_27_0=ruleCase();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"cases",
                    	            		lv_cases_27_0, 
                    	            		"Case");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1600:3: (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==58) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1600:5: otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) )
                            {
                            otherlv_28=(Token)match(input,58,FOLLOW_58_in_rulePrimaryExpression3515); 

                                	newLeafNode(otherlv_28, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1604:1: ( (lv_elseExpression_29_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1605:1: (lv_elseExpression_29_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1605:1: (lv_elseExpression_29_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1606:3: lv_elseExpression_29_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3536);
                            lv_elseExpression_29_0=ruleSqlExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"elseExpression",
                                    		lv_elseExpression_29_0, 
                                    		"SqlExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,59,FOLLOW_59_in_rulePrimaryExpression3550); 

                        	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1627:6: ( () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1627:6: ( () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1627:7: () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1627:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1628:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1633:2: ( (lv_name_32_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1634:1: (lv_name_32_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1634:1: (lv_name_32_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1635:3: lv_name_32_0= RULE_ID
                    {
                    lv_name_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3584); 

                    			newLeafNode(lv_name_32_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_32_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_33=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3601); 

                        	newLeafNode(otherlv_33, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1655:1: ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==21) ) {
                        alt28=1;
                    }
                    else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_NUMBER)||LA28_0==25||LA28_0==50||(LA28_0>=52 && LA28_0<=53)||(LA28_0>=55 && LA28_0<=57)||LA28_0==61||(LA28_0>=83 && LA28_0<=86)) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1655:2: ( (lv_all_34_0= '*' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1655:2: ( (lv_all_34_0= '*' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1656:1: (lv_all_34_0= '*' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1656:1: (lv_all_34_0= '*' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1657:3: lv_all_34_0= '*'
                            {
                            lv_all_34_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression3620); 

                                    newLeafNode(lv_all_34_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_7_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "all", true, "*");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1671:6: ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1671:6: ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1671:7: ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1671:7: ( (lv_arguments_35_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1672:1: (lv_arguments_35_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1672:1: (lv_arguments_35_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1673:3: lv_arguments_35_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3661);
                            lv_arguments_35_0=ruleSqlExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"arguments",
                                    		lv_arguments_35_0, 
                                    		"SqlExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1689:2: (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==60) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1689:4: otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_36=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression3674); 

                            	        	newLeafNode(otherlv_36, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	        
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1693:1: ( (lv_arugments_37_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1694:1: (lv_arugments_37_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1694:1: (lv_arugments_37_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1695:3: lv_arugments_37_0= ruleSqlExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArugmentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3695);
                            	    lv_arugments_37_0=ruleSqlExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"arugments",
                            	            		lv_arugments_37_0, 
                            	            		"SqlExpression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_38=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3711); 

                        	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1716:6: ( () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1716:6: ( () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1716:7: () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1716:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1717:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                current);
                        

                    }

                    otherlv_40=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression3740); 

                        	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                        
                    otherlv_41=(Token)match(input,53,FOLLOW_53_in_rulePrimaryExpression3752); 

                        	newLeafNode(otherlv_41, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1730:1: ( (lv_expression_42_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1731:1: (lv_expression_42_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1731:1: (lv_expression_42_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1732:3: lv_expression_42_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3773);
                    lv_expression_42_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_42_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_43=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression3785); 

                        	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1752:1: ( (lv_type_44_0= ruleSqliteDataType ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1753:1: (lv_type_44_0= ruleSqliteDataType )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1753:1: (lv_type_44_0= ruleSqliteDataType )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1754:3: lv_type_44_0= ruleSqliteDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression3806);
                    lv_type_44_0=ruleSqliteDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_44_0, 
                            		"SqliteDataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_45=(Token)match(input,54,FOLLOW_54_in_rulePrimaryExpression3818); 

                        	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                        

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1782:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1783:2: (iv_ruleCase= ruleCase EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1784:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase3855);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase3865); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1791:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1794:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1795:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1795:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1795:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleCase3902); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1799:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1800:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1800:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1801:3: lv_whenExpression_1_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase3923);
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

            otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleCase3935); 

                	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1821:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1822:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1822:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1823:3: lv_thenExpression_3_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase3956);
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


    // $ANTLR start "entryRuleSelectStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1847:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1848:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1849:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement3992);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement4002); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1856:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )* )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_core_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;

        EObject lv_orderingTerms_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1859:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )* )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1860:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )* )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1860:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )* )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1860:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )* )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1860:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1861:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1861:1: (lv_core_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1862:3: lv_core_0_0= ruleSelectCore
            {
             
            	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement4048);
            lv_core_0_0=ruleSelectCore();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1878:2: (otherlv_1= 'order by' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==65) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1878:4: otherlv_1= 'order by' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )*
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleSelectStatement4061); 

                        	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1882:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1883:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1883:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1884:3: lv_orderingTerms_2_0= ruleOrderingTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleSelectStatement4082);
                    lv_orderingTerms_2_0=ruleOrderingTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"orderingTerms",
                            		lv_orderingTerms_2_0, 
                            		"OrderingTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1900:2: (otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==60) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1900:4: otherlv_3= ',' ( (lv_orderingTerms_4_0= ruleOrderingTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleSelectStatement4095); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1904:1: ( (lv_orderingTerms_4_0= ruleOrderingTerm ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1905:1: (lv_orderingTerms_4_0= ruleOrderingTerm )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1905:1: (lv_orderingTerms_4_0= ruleOrderingTerm )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1906:3: lv_orderingTerms_4_0= ruleOrderingTerm
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderingTermsOrderingTermParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleSelectStatement4116);
                    	    lv_orderingTerms_4_0=ruleOrderingTerm();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"orderingTerms",
                    	            		lv_orderingTerms_4_0, 
                    	            		"OrderingTerm");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
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


    // $ANTLR start "entryRuleSelectCore"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1930:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1931:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1932:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
             newCompositeNode(grammarAccess.getSelectCoreRule()); 
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore4156);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;

             current =iv_ruleSelectCore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore4166); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1939:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1942:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1943:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1943:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1944:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4213);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;

             
                    current = this_SelectExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1952:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=116 && LA32_0<=119)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1952:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1952:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1953:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1958:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1959:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1959:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1960:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore4243);
            	    lv_op_2_0=ruleCompoundOperator();

            	    state._fsp--;


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

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1976:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1977:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1977:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1978:3: lv_right_3_0= ruleSelectExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4264);
            	    lv_right_3_0=ruleSelectExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop32;
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
    // $ANTLR end "ruleSelectCore"


    // $ANTLR start "entryRuleSelectExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2002:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2003:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2004:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4302);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;

             current =iv_ruleSelectExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression4312); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2011:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( (lv_resultColumns_4_0= ruleResultColumn ) ) (otherlv_5= ',' ( (lv_resultColumns_6_0= ruleResultColumn ) ) )* (otherlv_7= 'from' ( (lv_source_8_0= ruleJoinSource ) ) )? (otherlv_9= 'where' ( (lv_whereExpression_10_0= ruleSqlExpression ) ) )? (otherlv_11= 'group by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_distinct_2_0=null;
        Token lv_all_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_resultColumns_4_0 = null;

        EObject lv_resultColumns_6_0 = null;

        EObject lv_source_8_0 = null;

        EObject lv_whereExpression_10_0 = null;

        EObject lv_groupByExpressions_12_0 = null;

        EObject lv_groupByExpressions_14_0 = null;

        EObject lv_havingExpression_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2014:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( (lv_resultColumns_4_0= ruleResultColumn ) ) (otherlv_5= ',' ( (lv_resultColumns_6_0= ruleResultColumn ) ) )* (otherlv_7= 'from' ( (lv_source_8_0= ruleJoinSource ) ) )? (otherlv_9= 'where' ( (lv_whereExpression_10_0= ruleSqlExpression ) ) )? (otherlv_11= 'group by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2015:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( (lv_resultColumns_4_0= ruleResultColumn ) ) (otherlv_5= ',' ( (lv_resultColumns_6_0= ruleResultColumn ) ) )* (otherlv_7= 'from' ( (lv_source_8_0= ruleJoinSource ) ) )? (otherlv_9= 'where' ( (lv_whereExpression_10_0= ruleSqlExpression ) ) )? (otherlv_11= 'group by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2015:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( (lv_resultColumns_4_0= ruleResultColumn ) ) (otherlv_5= ',' ( (lv_resultColumns_6_0= ruleResultColumn ) ) )* (otherlv_7= 'from' ( (lv_source_8_0= ruleJoinSource ) ) )? (otherlv_9= 'where' ( (lv_whereExpression_10_0= ruleSqlExpression ) ) )? (otherlv_11= 'group by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2015:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( (lv_resultColumns_4_0= ruleResultColumn ) ) (otherlv_5= ',' ( (lv_resultColumns_6_0= ruleResultColumn ) ) )* (otherlv_7= 'from' ( (lv_source_8_0= ruleJoinSource ) ) )? (otherlv_9= 'where' ( (lv_whereExpression_10_0= ruleSqlExpression ) ) )? (otherlv_11= 'group by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )? (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2015:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2016:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleSelectExpression4358); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2025:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==67) ) {
                alt33=1;
            }
            else if ( (LA33_0==68) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2025:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2025:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2026:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2026:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2027:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,67,FOLLOW_67_in_ruleSelectExpression4377); 

                            newLeafNode(lv_distinct_2_0, grammarAccess.getSelectExpressionAccess().getDistinctDistinctKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "distinct", true, "distinct");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2041:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2041:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2042:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2042:1: (lv_all_3_0= 'all' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2043:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,68,FOLLOW_68_in_ruleSelectExpression4414); 

                            newLeafNode(lv_all_3_0, grammarAccess.getSelectExpressionAccess().getAllAllKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "all", true, "all");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2056:4: ( (lv_resultColumns_4_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2057:1: (lv_resultColumns_4_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2057:1: (lv_resultColumns_4_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2058:3: lv_resultColumns_4_0= ruleResultColumn
            {
             
            	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getResultColumnsResultColumnParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectExpression4450);
            lv_resultColumns_4_0=ruleResultColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"resultColumns",
                    		lv_resultColumns_4_0, 
                    		"ResultColumn");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2074:2: (otherlv_5= ',' ( (lv_resultColumns_6_0= ruleResultColumn ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==60) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2074:4: otherlv_5= ',' ( (lv_resultColumns_6_0= ruleResultColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_60_in_ruleSelectExpression4463); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSelectExpressionAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2078:1: ( (lv_resultColumns_6_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2079:1: (lv_resultColumns_6_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2079:1: (lv_resultColumns_6_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2080:3: lv_resultColumns_6_0= ruleResultColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getResultColumnsResultColumnParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectExpression4484);
            	    lv_resultColumns_6_0=ruleResultColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resultColumns",
            	            		lv_resultColumns_6_0, 
            	            		"ResultColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2096:4: (otherlv_7= 'from' ( (lv_source_8_0= ruleJoinSource ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2096:6: otherlv_7= 'from' ( (lv_source_8_0= ruleJoinSource ) )
                    {
                    otherlv_7=(Token)match(input,69,FOLLOW_69_in_ruleSelectExpression4499); 

                        	newLeafNode(otherlv_7, grammarAccess.getSelectExpressionAccess().getFromKeyword_5_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2100:1: ( (lv_source_8_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2101:1: (lv_source_8_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2101:1: (lv_source_8_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2102:3: lv_source_8_0= ruleJoinSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression4520);
                    lv_source_8_0=ruleJoinSource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"source",
                            		lv_source_8_0, 
                            		"JoinSource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2118:4: (otherlv_9= 'where' ( (lv_whereExpression_10_0= ruleSqlExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==70) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2118:6: otherlv_9= 'where' ( (lv_whereExpression_10_0= ruleSqlExpression ) )
                    {
                    otherlv_9=(Token)match(input,70,FOLLOW_70_in_ruleSelectExpression4535); 

                        	newLeafNode(otherlv_9, grammarAccess.getSelectExpressionAccess().getWhereKeyword_6_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2122:1: ( (lv_whereExpression_10_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:1: (lv_whereExpression_10_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:1: (lv_whereExpression_10_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2124:3: lv_whereExpression_10_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectExpression4556);
                    lv_whereExpression_10_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"whereExpression",
                            		lv_whereExpression_10_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2140:4: (otherlv_11= 'group by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==71) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2140:6: otherlv_11= 'group by' ( (lv_groupByExpressions_12_0= ruleSqlExpression ) ) (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )*
                    {
                    otherlv_11=(Token)match(input,71,FOLLOW_71_in_ruleSelectExpression4571); 

                        	newLeafNode(otherlv_11, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_7_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2144:1: ( (lv_groupByExpressions_12_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2145:1: (lv_groupByExpressions_12_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2145:1: (lv_groupByExpressions_12_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2146:3: lv_groupByExpressions_12_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByExpressionsSqlExpressionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectExpression4592);
                    lv_groupByExpressions_12_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"groupByExpressions",
                            		lv_groupByExpressions_12_0, 
                            		"SqlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2162:2: (otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==60) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2162:4: otherlv_13= ',' ( (lv_groupByExpressions_14_0= ruleSqlExpression ) )
                    	    {
                    	    otherlv_13=(Token)match(input,60,FOLLOW_60_in_ruleSelectExpression4605); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getSelectExpressionAccess().getCommaKeyword_7_2_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2166:1: ( (lv_groupByExpressions_14_0= ruleSqlExpression ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2167:1: (lv_groupByExpressions_14_0= ruleSqlExpression )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2167:1: (lv_groupByExpressions_14_0= ruleSqlExpression )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2168:3: lv_groupByExpressions_14_0= ruleSqlExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByExpressionsSqlExpressionParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectExpression4626);
                    	    lv_groupByExpressions_14_0=ruleSqlExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
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
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2184:6: (otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==72) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2184:8: otherlv_15= 'having' ( (lv_havingExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,72,FOLLOW_72_in_ruleSelectExpression4643); 

                        	newLeafNode(otherlv_15, grammarAccess.getSelectExpressionAccess().getHavingKeyword_8_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2188:1: ( (lv_havingExpression_16_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2189:1: (lv_havingExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2189:1: (lv_havingExpression_16_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2190:3: lv_havingExpression_16_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingExpressionSqlExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectExpression4664);
                    lv_havingExpression_16_0=ruleSqlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
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
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRuleOrderingTerm"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2214:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2215:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2216:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
             newCompositeNode(grammarAccess.getOrderingTermRule()); 
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm4702);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;

             current =iv_ruleOrderingTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm4712); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2223:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2226:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2227:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2227:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2227:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2227:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2228:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2228:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2229:3: lv_expression_0_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm4758);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2245:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==73) ) {
                alt40=1;
            }
            else if ( (LA40_0==74) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2245:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2245:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2246:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2246:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2247:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,73,FOLLOW_73_in_ruleOrderingTerm4777); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2261:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2261:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2262:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2262:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2263:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,74,FOLLOW_74_in_ruleOrderingTerm4814); 

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


    // $ANTLR start "entryRuleJoinSource"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2284:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2285:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2286:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
             newCompositeNode(grammarAccess.getJoinSourceRule()); 
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource4865);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;

             current =iv_ruleJoinSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource4875); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2293:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2296:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2297:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2297:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2297:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2297:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2298:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2298:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2299:3: lv_source_0_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource4921);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2315:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=75 && LA41_0<=76)||(LA41_0>=78 && LA41_0<=80)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2316:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2316:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2317:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource4942);
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
            	    break loop41;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2341:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2342:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2343:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
             newCompositeNode(grammarAccess.getSingleSourceRule()); 
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource4979);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;

             current =iv_ruleSingleSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource4989); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2350:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2353:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2354:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2354:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( (LA42_0==53) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==RULE_ID||LA42_2==53) ) {
                    alt42=3;
                }
                else if ( (LA42_2==66) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2355:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                     
                            newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource5036);
                    this_SingleSourceTable_0=ruleSingleSourceTable();

                    state._fsp--;

                     
                            current = this_SingleSourceTable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2365:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                     
                            newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource5063);
                    this_SingleSourceSelectStatement_1=ruleSingleSourceSelectStatement();

                    state._fsp--;

                     
                            current = this_SingleSourceSelectStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2375:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                     
                            newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource5090);
                    this_SingleSourceJoin_2=ruleSingleSourceJoin();

                    state._fsp--;

                     
                            current = this_SingleSourceJoin_2; 
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
    // $ANTLR end "ruleSingleSource"


    // $ANTLR start "entryRuleSingleSourceTable"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2391:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2392:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2393:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
             newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable5125);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;

             current =iv_ruleSingleSourceTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable5135); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2400:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2403:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2404:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2404:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2404:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2404:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2405:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2410:2: ( (otherlv_1= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2411:1: (otherlv_1= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2411:1: (otherlv_1= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2412:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable5189); 

            		newLeafNode(otherlv_1, grammarAccess.getSingleSourceTableAccess().getTableReferenceCreateTableStatementCrossReference_1_0()); 
            	

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2423:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==62) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2423:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleSingleSourceTable5202); 

                        	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2427:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2428:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2428:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2429:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable5219); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getSingleSourceTableAccess().getNameIDTerminalRuleCall_2_1_0()); 
                    		

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
    // $ANTLR end "ruleSingleSourceTable"


    // $ANTLR start "entryRuleSingleSourceSelectStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2453:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2454:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2455:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement5262);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;

             current =iv_ruleSingleSourceSelectStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement5272); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2462:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2465:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2466:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2466:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2466:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2466:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2467:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleSingleSourceSelectStatement5318); 

                	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2476:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2477:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2477:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2478:3: lv_selectStatement_2_0= ruleSelectStatement
            {
             
            	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement5339);
            lv_selectStatement_2_0=ruleSelectStatement();

            state._fsp--;


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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleSingleSourceSelectStatement5351); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2498:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==62) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2498:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_62_in_ruleSingleSourceSelectStatement5364); 

                        	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2502:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2503:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2503:1: (lv_name_5_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2504:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement5381); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getSingleSourceSelectStatementAccess().getNameIDTerminalRuleCall_4_1_0()); 
                    		

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
    // $ANTLR end "ruleSingleSourceSelectStatement"


    // $ANTLR start "entryRuleSingleSourceJoin"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2528:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2529:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2530:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
             newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin5424);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;

             current =iv_ruleSingleSourceJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin5434); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2537:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2540:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2541:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2541:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2541:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleSingleSourceJoin5471); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2545:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2546:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2546:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2547:3: lv_joinSource_1_0= ruleJoinSource
            {
             
            	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin5492);
            lv_joinSource_1_0=ruleJoinSource();

            state._fsp--;


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

            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleSingleSourceJoin5504); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleSourceJoinAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleSingleSourceJoin"


    // $ANTLR start "entryRuleJoinStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2575:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2576:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2577:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
             newCompositeNode(grammarAccess.getJoinStatementRule()); 
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement5540);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;

             current =iv_ruleJoinStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement5550); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2584:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2587:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2588:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2588:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2588:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2588:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2589:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2594:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==75) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2595:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2596:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,75,FOLLOW_75_in_ruleJoinStatement5602); 

                            newLeafNode(lv_natural_1_0, grammarAccess.getJoinStatementAccess().getNaturalNaturalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "natural", true, "natural");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2609:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt47=4;
            switch ( input.LA(1) ) {
                case 76:
                    {
                    alt47=1;
                    }
                    break;
                case 78:
                    {
                    alt47=2;
                    }
                    break;
                case 79:
                    {
                    alt47=3;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2609:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2609:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2609:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2609:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2610:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2610:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2611:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,76,FOLLOW_76_in_ruleJoinStatement5636); 

                            newLeafNode(lv_left_2_0, grammarAccess.getJoinStatementAccess().getLeftLeftKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "left", true, "left");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2624:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==77) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2625:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2625:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2626:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,77,FOLLOW_77_in_ruleJoinStatement5667); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2640:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2640:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2641:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2641:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2642:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,78,FOLLOW_78_in_ruleJoinStatement5706); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2656:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2656:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2657:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2657:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2658:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,79,FOLLOW_79_in_ruleJoinStatement5743); 

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

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleJoinStatement5770); 

                	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2675:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2676:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2676:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2677:3: lv_singleSource_7_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement5791);
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

            otherlv_8=(Token)match(input,81,FOLLOW_81_in_ruleJoinStatement5803); 

                	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2697:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2698:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2698:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2699:3: lv_expression_9_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement5824);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2723:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2724:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2725:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
             newCompositeNode(grammarAccess.getResultColumnRule()); 
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn5860);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;

             current =iv_ruleResultColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn5870); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2732:1: ruleResultColumn returns [EObject current=null] : (this_ResultColumnAll_0= ruleResultColumnAll | this_ResultColumnExpression_1= ruleResultColumnExpression ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject this_ResultColumnAll_0 = null;

        EObject this_ResultColumnExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2735:28: ( (this_ResultColumnAll_0= ruleResultColumnAll | this_ResultColumnExpression_1= ruleResultColumnExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2736:1: (this_ResultColumnAll_0= ruleResultColumnAll | this_ResultColumnExpression_1= ruleResultColumnExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2736:1: (this_ResultColumnAll_0= ruleResultColumnAll | this_ResultColumnExpression_1= ruleResultColumnExpression )
            int alt48=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||(LA48_1>=19 && LA48_1<=49)||LA48_1==51||(LA48_1>=53 && LA48_1<=54)||LA48_1==60||LA48_1==62||LA48_1==65||(LA48_1>=69 && LA48_1<=72)||(LA48_1>=116 && LA48_1<=119)) ) {
                    alt48=2;
                }
                else if ( (LA48_1==82) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 19:
            case 21:
            case 54:
            case 60:
            case 65:
            case 69:
            case 70:
            case 71:
            case 72:
            case 116:
            case 117:
            case 118:
            case 119:
                {
                alt48=1;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 25:
            case 50:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 61:
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt48=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2737:5: this_ResultColumnAll_0= ruleResultColumnAll
                    {
                     
                            newCompositeNode(grammarAccess.getResultColumnAccess().getResultColumnAllParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleResultColumnAll_in_ruleResultColumn5917);
                    this_ResultColumnAll_0=ruleResultColumnAll();

                    state._fsp--;

                     
                            current = this_ResultColumnAll_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2747:5: this_ResultColumnExpression_1= ruleResultColumnExpression
                    {
                     
                            newCompositeNode(grammarAccess.getResultColumnAccess().getResultColumnExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleResultColumnExpression_in_ruleResultColumn5944);
                    this_ResultColumnExpression_1=ruleResultColumnExpression();

                    state._fsp--;

                     
                            current = this_ResultColumnExpression_1; 
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
    // $ANTLR end "ruleResultColumn"


    // $ANTLR start "entryRuleResultColumnAll"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2763:1: entryRuleResultColumnAll returns [EObject current=null] : iv_ruleResultColumnAll= ruleResultColumnAll EOF ;
    public final EObject entryRuleResultColumnAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumnAll = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2764:2: (iv_ruleResultColumnAll= ruleResultColumnAll EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2765:2: iv_ruleResultColumnAll= ruleResultColumnAll EOF
            {
             newCompositeNode(grammarAccess.getResultColumnAllRule()); 
            pushFollow(FOLLOW_ruleResultColumnAll_in_entryRuleResultColumnAll5979);
            iv_ruleResultColumnAll=ruleResultColumnAll();

            state._fsp--;

             current =iv_ruleResultColumnAll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumnAll5989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultColumnAll"


    // $ANTLR start "ruleResultColumnAll"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2772:1: ruleResultColumnAll returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )? | otherlv_3= '*' ) ) ;
    public final EObject ruleResultColumnAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2775:28: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )? | otherlv_3= '*' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2776:1: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )? | otherlv_3= '*' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2776:1: ( () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )? | otherlv_3= '*' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2776:2: () ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )? | otherlv_3= '*' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2776:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2777:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResultColumnAllAccess().getResultColumnAllAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2782:2: ( ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )? | otherlv_3= '*' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==EOF||LA50_0==RULE_ID||LA50_0==19||LA50_0==54||LA50_0==60||LA50_0==65||(LA50_0>=69 && LA50_0<=72)||(LA50_0>=116 && LA50_0<=119)) ) {
                alt50=1;
            }
            else if ( (LA50_0==21) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2782:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2782:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2782:4: ( (otherlv_1= RULE_ID ) ) otherlv_2= '.*'
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2782:4: ( (otherlv_1= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2783:1: (otherlv_1= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2783:1: (otherlv_1= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2784:3: otherlv_1= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getResultColumnAllRule());
                            	        }
                                    
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumnAll6045); 

                            		newLeafNode(otherlv_1, grammarAccess.getResultColumnAllAccess().getReferenceSelectSourceCrossReference_1_0_0_0()); 
                            	

                            }


                            }

                            otherlv_2=(Token)match(input,82,FOLLOW_82_in_ruleResultColumnAll6057); 

                                	newLeafNode(otherlv_2, grammarAccess.getResultColumnAllAccess().getFullStopAsteriskKeyword_1_0_1());
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2800:7: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleResultColumnAll6077); 

                        	newLeafNode(otherlv_3, grammarAccess.getResultColumnAllAccess().getAsteriskKeyword_1_1());
                        

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
    // $ANTLR end "ruleResultColumnAll"


    // $ANTLR start "entryRuleResultColumnExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2812:1: entryRuleResultColumnExpression returns [EObject current=null] : iv_ruleResultColumnExpression= ruleResultColumnExpression EOF ;
    public final EObject entryRuleResultColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2813:2: (iv_ruleResultColumnExpression= ruleResultColumnExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2814:2: iv_ruleResultColumnExpression= ruleResultColumnExpression EOF
            {
             newCompositeNode(grammarAccess.getResultColumnExpressionRule()); 
            pushFollow(FOLLOW_ruleResultColumnExpression_in_entryRuleResultColumnExpression6114);
            iv_ruleResultColumnExpression=ruleResultColumnExpression();

            state._fsp--;

             current =iv_ruleResultColumnExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumnExpression6124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultColumnExpression"


    // $ANTLR start "ruleResultColumnExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2821:1: ruleResultColumnExpression returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2824:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2825:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2825:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2825:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2825:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2826:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResultColumnExpressionAccess().getResultColumnExpressionAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2831:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2832:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2832:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2833:3: lv_expression_1_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getResultColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumnExpression6179);
            lv_expression_1_0=ruleSqlExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResultColumnExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"SqlExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2849:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==62) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2849:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleResultColumnExpression6192); 

                        	newLeafNode(otherlv_2, grammarAccess.getResultColumnExpressionAccess().getAsKeyword_2_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2853:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2854:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2854:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2855:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumnExpression6209); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getResultColumnExpressionAccess().getNameIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResultColumnExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
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
    // $ANTLR end "ruleResultColumnExpression"


    // $ANTLR start "entryRuleLiteralValue"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2879:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2880:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2881:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue6252);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;

             current =iv_ruleLiteralValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue6262); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2888:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2891:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2892:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2892:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            int alt52=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 25:
                {
                alt52=1;
                }
                break;
            case RULE_STRING:
                {
                alt52=2;
                }
                break;
            case 83:
                {
                alt52=3;
                }
                break;
            case 84:
                {
                alt52=4;
                }
                break;
            case 85:
                {
                alt52=5;
                }
                break;
            case 86:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2892:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2892:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2892:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2892:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2893:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2898:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2899:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2899:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2900:3: lv_number_1_0= ruleSignedNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue6318);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2917:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2917:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2917:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2917:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2918:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2923:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2924:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2924:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2925:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue6352); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2942:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2942:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2942:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2942:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2943:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2948:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2949:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2949:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2950:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,83,FOLLOW_83_in_ruleLiteralValue6392); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2964:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2964:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2964:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2964:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2965:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2970:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2971:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2971:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2972:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,84,FOLLOW_84_in_ruleLiteralValue6440); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2986:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2986:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2986:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2986:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2987:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2992:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2993:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2993:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2994:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,85,FOLLOW_85_in_ruleLiteralValue6488); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3008:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3008:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3008:7: () ( (lv_literal_11_0= 'current_time_stamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3008:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3009:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3014:2: ( (lv_literal_11_0= 'current_time_stamp' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3015:1: (lv_literal_11_0= 'current_time_stamp' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3015:1: (lv_literal_11_0= 'current_time_stamp' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3016:3: lv_literal_11_0= 'current_time_stamp'
                    {
                    lv_literal_11_0=(Token)match(input,86,FOLLOW_86_in_ruleLiteralValue6536); 

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


    // $ANTLR start "entryRuleDDLStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3037:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3038:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3039:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
             newCompositeNode(grammarAccess.getDDLStatementRule()); 
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement6586);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;

             current =iv_ruleDDLStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement6596); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3046:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableStatement_3= ruleAlterTableStatement | this_DropTableStatement_4= ruleDropTableStatement | this_DropTriggerStatement_5= ruleDropTriggerStatement | this_DropViewStatement_6= ruleDropViewStatement ) ;
    public final EObject ruleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTableStatement_0 = null;

        EObject this_CreateViewStatement_1 = null;

        EObject this_CreateTriggerStatement_2 = null;

        EObject this_AlterTableStatement_3 = null;

        EObject this_DropTableStatement_4 = null;

        EObject this_DropTriggerStatement_5 = null;

        EObject this_DropViewStatement_6 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3049:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableStatement_3= ruleAlterTableStatement | this_DropTableStatement_4= ruleDropTableStatement | this_DropTriggerStatement_5= ruleDropTriggerStatement | this_DropViewStatement_6= ruleDropViewStatement ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3050:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableStatement_3= ruleAlterTableStatement | this_DropTableStatement_4= ruleDropTableStatement | this_DropTriggerStatement_5= ruleDropTriggerStatement | this_DropViewStatement_6= ruleDropViewStatement )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3050:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableStatement_3= ruleAlterTableStatement | this_DropTableStatement_4= ruleDropTableStatement | this_DropTriggerStatement_5= ruleDropTriggerStatement | this_DropViewStatement_6= ruleDropViewStatement )
            int alt53=7;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3051:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement6643);
                    this_CreateTableStatement_0=ruleCreateTableStatement();

                    state._fsp--;

                     
                            current = this_CreateTableStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3061:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement6670);
                    this_CreateViewStatement_1=ruleCreateViewStatement();

                    state._fsp--;

                     
                            current = this_CreateViewStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3071:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement6697);
                    this_CreateTriggerStatement_2=ruleCreateTriggerStatement();

                    state._fsp--;

                     
                            current = this_CreateTriggerStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3081:5: this_AlterTableStatement_3= ruleAlterTableStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAlterTableStatement_in_ruleDDLStatement6724);
                    this_AlterTableStatement_3=ruleAlterTableStatement();

                    state._fsp--;

                     
                            current = this_AlterTableStatement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3091:5: this_DropTableStatement_4= ruleDropTableStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement6751);
                    this_DropTableStatement_4=ruleDropTableStatement();

                    state._fsp--;

                     
                            current = this_DropTableStatement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3101:5: this_DropTriggerStatement_5= ruleDropTriggerStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement6778);
                    this_DropTriggerStatement_5=ruleDropTriggerStatement();

                    state._fsp--;

                     
                            current = this_DropTriggerStatement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3111:5: this_DropViewStatement_6= ruleDropViewStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement6805);
                    this_DropViewStatement_6=ruleDropViewStatement();

                    state._fsp--;

                     
                            current = this_DropViewStatement_6; 
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
    // $ANTLR end "ruleDDLStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3127:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3128:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3129:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement6840);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;

             current =iv_ruleCreateTableStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement6850); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3136:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3139:28: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3140:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3140:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3140:2: () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')'
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3140:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3141:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleCreateTableStatement6896); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                
            otherlv_2=(Token)match(input,88,FOLLOW_88_in_ruleCreateTableStatement6908); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3154:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3155:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3155:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3156:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement6925); 

            			newLeafNode(lv_name_3_0, grammarAccess.getCreateTableStatementAccess().getNameIDTerminalRuleCall_3_0()); 
            		

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

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleCreateTableStatement6942); 

                	newLeafNode(otherlv_4, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_4());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3176:1: ( (lv_columnDefs_5_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3177:1: (lv_columnDefs_5_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3177:1: (lv_columnDefs_5_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3178:3: lv_columnDefs_5_0= ruleColumnDef
            {
             
            	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement6963);
            lv_columnDefs_5_0=ruleColumnDef();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3194:2: (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==60) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==RULE_ID) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3194:4: otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    {
            	    otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleCreateTableStatement6976); 

            	        	newLeafNode(otherlv_6, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_6_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3198:1: ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3199:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3199:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3200:3: lv_columnDefs_7_0= ruleColumnDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement6997);
            	    lv_columnDefs_7_0=ruleColumnDef();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3216:4: (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==60) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3216:6: otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    {
            	    otherlv_8=(Token)match(input,60,FOLLOW_60_in_ruleCreateTableStatement7012); 

            	        	newLeafNode(otherlv_8, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3220:1: ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3221:1: (lv_constraints_9_0= ruleTableConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3221:1: (lv_constraints_9_0= ruleTableConstraint )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3222:3: lv_constraints_9_0= ruleTableConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7033);
            	    lv_constraints_9_0=ruleTableConstraint();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleCreateTableStatement7047); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_8());
                

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
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleCreateViewStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3250:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3251:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3252:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7083);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;

             current =iv_ruleCreateViewStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement7093); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3259:1: ruleCreateViewStatement returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_selectStatement_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3262:28: ( (otherlv_0= 'create' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3263:1: (otherlv_0= 'create' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3263:1: (otherlv_0= 'create' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_selectStatement_4_0= ruleSelectStatement ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3263:3: otherlv_0= 'create' otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_selectStatement_4_0= ruleSelectStatement ) )
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleCreateViewStatement7130); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_0());
                
            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleCreateViewStatement7142); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getViewKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3271:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3272:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3273:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement7159); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCreateViewStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleCreateViewStatement7176); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getAsKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3293:1: ( (lv_selectStatement_4_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3294:1: (lv_selectStatement_4_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3294:1: (lv_selectStatement_4_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3295:3: lv_selectStatement_4_0= ruleSelectStatement
            {
             
            	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement7197);
            lv_selectStatement_4_0=ruleSelectStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCreateViewStatementRule());
            	        }
                   		set(
                   			current, 
                   			"selectStatement",
                    		lv_selectStatement_4_0, 
                    		"SelectStatement");
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
    // $ANTLR end "ruleCreateViewStatement"


    // $ANTLR start "entryRuleCreateTriggerStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3319:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3320:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3321:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement7233);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;

             current =iv_ruleCreateTriggerStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement7243); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3328:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (lv_tableName_12_0= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) ;
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
        Token lv_tableName_12_0=null;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3331:28: ( (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (lv_tableName_12_0= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3332:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (lv_tableName_12_0= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3332:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (lv_tableName_12_0= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3332:3: otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (lv_tableName_12_0= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleCreateTriggerStatement7280); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                
            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleCreateTriggerStatement7292); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3340:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3341:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3341:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3342:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7309); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCreateTriggerStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            		

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3358:2: ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=91 && LA57_0<=93)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3359:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3359:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3360:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3360:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    int alt56=3;
                    switch ( input.LA(1) ) {
                    case 91:
                        {
                        alt56=1;
                        }
                        break;
                    case 92:
                        {
                        alt56=2;
                        }
                        break;
                    case 93:
                        {
                        alt56=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3361:3: lv_when_3_1= 'before'
                            {
                            lv_when_3_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateTriggerStatement7334); 

                                    newLeafNode(lv_when_3_1, grammarAccess.getCreateTriggerStatementAccess().getWhenBeforeKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                            	        }
                                   		setWithLastConsumed(current, "when", lv_when_3_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3373:8: lv_when_3_2= 'after'
                            {
                            lv_when_3_2=(Token)match(input,92,FOLLOW_92_in_ruleCreateTriggerStatement7363); 

                                    newLeafNode(lv_when_3_2, grammarAccess.getCreateTriggerStatementAccess().getWhenAfterKeyword_3_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                            	        }
                                   		setWithLastConsumed(current, "when", lv_when_3_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3385:8: lv_when_3_3= 'instead of'
                            {
                            lv_when_3_3=(Token)match(input,93,FOLLOW_93_in_ruleCreateTriggerStatement7392); 

                                    newLeafNode(lv_when_3_3, grammarAccess.getCreateTriggerStatementAccess().getWhenInsteadOfKeyword_3_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                            	        }
                                   		setWithLastConsumed(current, "when", lv_when_3_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3400:3: ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt60=1;
                }
                break;
            case 95:
                {
                alt60=2;
                }
                break;
            case 96:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3400:4: ( (lv_eventType_4_0= 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3400:4: ( (lv_eventType_4_0= 'delete' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3401:1: (lv_eventType_4_0= 'delete' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3401:1: (lv_eventType_4_0= 'delete' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3402:3: lv_eventType_4_0= 'delete'
                    {
                    lv_eventType_4_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement7428); 

                            newLeafNode(lv_eventType_4_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeDeleteKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                    	        }
                           		setWithLastConsumed(current, "eventType", lv_eventType_4_0, "delete");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3416:6: ( (lv_eventType_5_0= 'insert' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3416:6: ( (lv_eventType_5_0= 'insert' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3417:1: (lv_eventType_5_0= 'insert' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3417:1: (lv_eventType_5_0= 'insert' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3418:3: lv_eventType_5_0= 'insert'
                    {
                    lv_eventType_5_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement7465); 

                            newLeafNode(lv_eventType_5_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeInsertKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                    	        }
                           		setWithLastConsumed(current, "eventType", lv_eventType_5_0, "insert");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3432:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3432:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3432:7: ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3432:7: ( (lv_eventType_6_0= 'update' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3433:1: (lv_eventType_6_0= 'update' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3433:1: (lv_eventType_6_0= 'update' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3434:3: lv_eventType_6_0= 'update'
                    {
                    lv_eventType_6_0=(Token)match(input,96,FOLLOW_96_in_ruleCreateTriggerStatement7503); 

                            newLeafNode(lv_eventType_6_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeUpdateKeyword_4_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                    	        }
                           		setWithLastConsumed(current, "eventType", lv_eventType_6_0, "update");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3447:2: (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==97) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3447:4: otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            {
                            otherlv_7=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement7529); 

                                	newLeafNode(otherlv_7, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_4_2_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3451:1: ( (lv_updateColumnNames_8_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3452:1: (lv_updateColumnNames_8_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3452:1: (lv_updateColumnNames_8_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3453:3: lv_updateColumnNames_8_0= RULE_ID
                            {
                            lv_updateColumnNames_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7546); 

                            			newLeafNode(lv_updateColumnNames_8_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_4_2_1_1_0()); 
                            		

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

                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3469:2: (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==60) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3469:4: otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,60,FOLLOW_60_in_ruleCreateTriggerStatement7564); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_4_2_1_2_0());
                            	        
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3473:1: ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3474:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3474:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3475:3: lv_updateColumnNames_10_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7581); 

                            	    			newLeafNode(lv_updateColumnNames_10_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_4_2_1_2_1_0()); 
                            	    		

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
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,81,FOLLOW_81_in_ruleCreateTriggerStatement7604); 

                	newLeafNode(otherlv_11, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_5());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3495:1: ( (lv_tableName_12_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3496:1: (lv_tableName_12_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3496:1: (lv_tableName_12_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3497:3: lv_tableName_12_0= RULE_ID
            {
            lv_tableName_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7621); 

            			newLeafNode(lv_tableName_12_0, grammarAccess.getCreateTriggerStatementAccess().getTableNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tableName",
                    		lv_tableName_12_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3513:2: ( (lv_forEachRow_13_0= 'for each row' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==98) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3514:1: (lv_forEachRow_13_0= 'for each row' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3514:1: (lv_forEachRow_13_0= 'for each row' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3515:3: lv_forEachRow_13_0= 'for each row'
                    {
                    lv_forEachRow_13_0=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement7644); 

                            newLeafNode(lv_forEachRow_13_0, grammarAccess.getCreateTriggerStatementAccess().getForEachRowForEachRowKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                    	        }
                           		setWithLastConsumed(current, "forEachRow", lv_forEachRow_13_0, "for each row");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3528:3: (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==63) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3528:5: otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    {
                    otherlv_14=(Token)match(input,63,FOLLOW_63_in_ruleCreateTriggerStatement7671); 

                        	newLeafNode(otherlv_14, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_8_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3532:1: ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3533:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3533:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3534:3: lv_whenExpression_15_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement7692);
                    lv_whenExpression_15_0=ruleSqlExpression();

                    state._fsp--;


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
                    break;

            }

            otherlv_16=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement7706); 

                	newLeafNode(otherlv_16, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_9());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3554:1: ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==66||(LA64_0>=94 && LA64_0<=96)||LA64_0==112) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3554:2: ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3554:2: ( (lv_statements_17_0= ruleDMLStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3555:1: (lv_statements_17_0= ruleDMLStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3555:1: (lv_statements_17_0= ruleDMLStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3556:3: lv_statements_17_0= ruleDMLStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement7728);
                    lv_statements_17_0=ruleDMLStatement();

                    state._fsp--;


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

                    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement7740); 

                        	newLeafNode(otherlv_18, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_10_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3576:1: ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==66||(LA63_0>=94 && LA63_0<=96)||LA63_0==112) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3576:2: ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3576:2: ( (lv_statements_19_0= ruleDMLStatement ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3577:1: (lv_statements_19_0= ruleDMLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3577:1: (lv_statements_19_0= ruleDMLStatement )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3578:3: lv_statements_19_0= ruleDMLStatement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement7762);
                    	    lv_statements_19_0=ruleDMLStatement();

                    	    state._fsp--;


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

                    	    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleCreateTriggerStatement7774); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_10_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,59,FOLLOW_59_in_ruleCreateTriggerStatement7790); 

                	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getEndKeyword_11());
                

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
    // $ANTLR end "ruleCreateTriggerStatement"


    // $ANTLR start "entryRuleAlterTableStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3610:1: entryRuleAlterTableStatement returns [EObject current=null] : iv_ruleAlterTableStatement= ruleAlterTableStatement EOF ;
    public final EObject entryRuleAlterTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3611:2: (iv_ruleAlterTableStatement= ruleAlterTableStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3612:2: iv_ruleAlterTableStatement= ruleAlterTableStatement EOF
            {
             newCompositeNode(grammarAccess.getAlterTableStatementRule()); 
            pushFollow(FOLLOW_ruleAlterTableStatement_in_entryRuleAlterTableStatement7826);
            iv_ruleAlterTableStatement=ruleAlterTableStatement();

            state._fsp--;

             current =iv_ruleAlterTableStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableStatement7836); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlterTableStatement"


    // $ANTLR start "ruleAlterTableStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3619:1: ruleAlterTableStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) ( (lv_clause_3_0= ruleAlterTableClause ) ) ) ;
    public final EObject ruleAlterTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_clause_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3622:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) ( (lv_clause_3_0= ruleAlterTableClause ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3623:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) ( (lv_clause_3_0= ruleAlterTableClause ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3623:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) ( (lv_clause_3_0= ruleAlterTableClause ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3623:3: otherlv_0= 'alter' otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) ( (lv_clause_3_0= ruleAlterTableClause ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleAlterTableStatement7873); 

                	newLeafNode(otherlv_0, grammarAccess.getAlterTableStatementAccess().getAlterKeyword_0());
                
            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleAlterTableStatement7885); 

                	newLeafNode(otherlv_1, grammarAccess.getAlterTableStatementAccess().getTableKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3631:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3632:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3632:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3633:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableStatement7902); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAlterTableStatementAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlterTableStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3649:2: ( (lv_clause_3_0= ruleAlterTableClause ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3650:1: (lv_clause_3_0= ruleAlterTableClause )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3650:1: (lv_clause_3_0= ruleAlterTableClause )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3651:3: lv_clause_3_0= ruleAlterTableClause
            {
             
            	        newCompositeNode(grammarAccess.getAlterTableStatementAccess().getClauseAlterTableClauseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAlterTableClause_in_ruleAlterTableStatement7928);
            lv_clause_3_0=ruleAlterTableClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlterTableStatementRule());
            	        }
                   		set(
                   			current, 
                   			"clause",
                    		lv_clause_3_0, 
                    		"AlterTableClause");
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
    // $ANTLR end "ruleAlterTableStatement"


    // $ANTLR start "entryRuleDropTableStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3675:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3676:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3677:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
             newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement7964);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;

             current =iv_ruleDropTableStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement7974); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3684:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3687:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3688:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3688:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3688:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleDropTableStatement8011); 

                	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                
            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleDropTableStatement8023); 

                	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3696:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==102) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3697:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3697:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3698:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,102,FOLLOW_102_in_ruleDropTableStatement8041); 

                            newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTableStatementAccess().getIfExistsIfExistsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDropTableStatementRule());
                    	        }
                           		setWithLastConsumed(current, "ifExists", true, "if exists");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3711:3: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3712:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3712:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3713:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement8072); 

            			newLeafNode(lv_name_3_0, grammarAccess.getDropTableStatementAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDropTableStatementRule());
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
    // $ANTLR end "ruleDropTableStatement"


    // $ANTLR start "entryRuleDropTriggerStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3737:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3738:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3739:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
             newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement8113);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;

             current =iv_ruleDropTriggerStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement8123); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3746:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3749:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3750:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3750:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3750:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleDropTriggerStatement8160); 

                	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                
            otherlv_1=(Token)match(input,90,FOLLOW_90_in_ruleDropTriggerStatement8172); 

                	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3758:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==102) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3759:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3759:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3760:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,102,FOLLOW_102_in_ruleDropTriggerStatement8190); 

                            newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTriggerStatementAccess().getIfExistsIfExistsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
                    	        }
                           		setWithLastConsumed(current, "ifExists", true, "if exists");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3773:3: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3774:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3774:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3775:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement8221); 

            			newLeafNode(lv_name_3_0, grammarAccess.getDropTriggerStatementAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
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
    // $ANTLR end "ruleDropTriggerStatement"


    // $ANTLR start "entryRuleDropViewStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3799:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3800:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3801:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
             newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement8262);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;

             current =iv_ruleDropViewStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement8272); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3808:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3811:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3812:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3812:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3812:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleDropViewStatement8309); 

                	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                
            otherlv_1=(Token)match(input,89,FOLLOW_89_in_ruleDropViewStatement8321); 

                	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3820:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==102) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3821:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3821:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3822:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,102,FOLLOW_102_in_ruleDropViewStatement8339); 

                            newLeafNode(lv_ifExists_2_0, grammarAccess.getDropViewStatementAccess().getIfExistsIfExistsKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDropViewStatementRule());
                    	        }
                           		setWithLastConsumed(current, "ifExists", true, "if exists");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3835:3: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3836:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3836:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3837:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement8370); 

            			newLeafNode(lv_name_3_0, grammarAccess.getDropViewStatementAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDropViewStatementRule());
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
    // $ANTLR end "ruleDropViewStatement"


    // $ANTLR start "entryRuleAlterTableClause"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3861:1: entryRuleAlterTableClause returns [EObject current=null] : iv_ruleAlterTableClause= ruleAlterTableClause EOF ;
    public final EObject entryRuleAlterTableClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3862:2: (iv_ruleAlterTableClause= ruleAlterTableClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3863:2: iv_ruleAlterTableClause= ruleAlterTableClause EOF
            {
             newCompositeNode(grammarAccess.getAlterTableClauseRule()); 
            pushFollow(FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause8411);
            iv_ruleAlterTableClause=ruleAlterTableClause();

            state._fsp--;

             current =iv_ruleAlterTableClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableClause8421); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3870:1: ruleAlterTableClause returns [EObject current=null] : ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) ;
    public final EObject ruleAlterTableClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_columnDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3873:28: ( ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3874:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3874:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==103) ) {
                alt68=1;
            }
            else if ( (LA68_0==104) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3874:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3874:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3874:3: () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3874:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3875:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableRenameClauseAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,103,FOLLOW_103_in_ruleAlterTableClause8468); 

                        	newLeafNode(otherlv_1, grammarAccess.getAlterTableClauseAccess().getRenameToKeyword_0_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3884:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3885:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3885:1: (lv_name_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3886:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableClause8485); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3903:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3903:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3903:7: () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3903:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3904:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableAddColumnClauseAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,104,FOLLOW_104_in_ruleAlterTableClause8519); 

                        	newLeafNode(otherlv_4, grammarAccess.getAlterTableClauseAccess().getAddColumnKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3913:1: ( (lv_columnDef_5_0= ruleColumnDef ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3914:1: (lv_columnDef_5_0= ruleColumnDef )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3914:1: (lv_columnDef_5_0= ruleColumnDef )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3915:3: lv_columnDef_5_0= ruleColumnDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlterTableClauseAccess().getColumnDefColumnDefParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableClause8540);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3939:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3940:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3941:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
             newCompositeNode(grammarAccess.getColumnDefRule()); 
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef8577);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;

             current =iv_ruleColumnDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef8587); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3948:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3951:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3952:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3952:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3952:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3952:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3953:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3958:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3959:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3959:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3960:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef8638); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColumnDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3976:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3977:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3977:1: (lv_type_2_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3978:3: lv_type_2_0= ruleColumnType
            {
             
            	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef8664);
            lv_type_2_0=ruleColumnType();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3994:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==48||LA69_0==105||LA69_0==107) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3995:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3995:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:3996:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef8685);
            	    lv_constraints_3_0=ruleColumnConstraint();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop69;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4020:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4021:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4022:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
             newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint8722);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;

             current =iv_ruleColumnConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint8732); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4029:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4032:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4033:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4033:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt73=1;
                }
                break;
            case 48:
                {
                alt73=2;
                }
                break;
            case 107:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4033:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4033:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4033:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4033:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4034:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,105,FOLLOW_105_in_ruleColumnConstraint8779); 

                        	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4043:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt70=3;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==73) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==74) ) {
                        alt70=2;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4043:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4043:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4044:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4044:1: (lv_asc_2_0= 'asc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4045:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,73,FOLLOW_73_in_ruleColumnConstraint8798); 

                                    newLeafNode(lv_asc_2_0, grammarAccess.getColumnConstraintAccess().getAscAscKeyword_0_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                            	        }
                                   		setWithLastConsumed(current, "asc", true, "asc");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4059:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4059:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4060:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4060:1: (lv_desc_3_0= 'desc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4061:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,74,FOLLOW_74_in_ruleColumnConstraint8835); 

                                    newLeafNode(lv_desc_3_0, grammarAccess.getColumnConstraintAccess().getDescDescKeyword_0_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                            	        }
                                   		setWithLastConsumed(current, "desc", true, "desc");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4074:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==106) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4075:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4075:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4076:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,106,FOLLOW_106_in_ruleColumnConstraint8868); 

                                    newLeafNode(lv_autoincrement_4_0, grammarAccess.getColumnConstraintAccess().getAutoincrementAutoincrementKeyword_0_3_0());
                                

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4090:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4090:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4090:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4090:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4091:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleColumnConstraint8911); 

                        	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4100:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==81) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4101:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4101:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4102:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                             
                            	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint8932);
                            lv_conflictClause_7_0=ruleConflictClause();

                            state._fsp--;


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
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4119:6: ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4119:6: ( () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4119:7: () otherlv_9= 'default' ( (lv_defaultValue_10_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4119:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4120:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_2_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,107,FOLLOW_107_in_ruleColumnConstraint8962); 

                        	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4129:1: ( (lv_defaultValue_10_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4130:1: (lv_defaultValue_10_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4130:1: (lv_defaultValue_10_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4131:3: lv_defaultValue_10_0= ruleDefaultValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint8983);
                    lv_defaultValue_10_0=ruleDefaultValue();

                    state._fsp--;


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


    // $ANTLR start "entryRuleTableConstraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4155:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4156:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4157:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
             newCompositeNode(grammarAccess.getTableConstraintRule()); 
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9020);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;

             current =iv_ruleTableConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint9030); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4164:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4167:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4168:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4168:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 108:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 105:
                        {
                        alt74=2;
                        }
                        break;
                    case 110:
                        {
                        alt74=3;
                        }
                        break;
                    case 109:
                        {
                        alt74=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 5, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case 109:
                {
                alt74=1;
                }
                break;
            case 105:
                {
                alt74=2;
                }
                break;
            case 110:
                {
                alt74=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4169:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9077);
                    this_UniqueTableConstraint_0=ruleUniqueTableConstraint();

                    state._fsp--;

                     
                            current = this_UniqueTableConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4179:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint9104);
                    this_PrimaryConstraint_1=rulePrimaryConstraint();

                    state._fsp--;

                     
                            current = this_PrimaryConstraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4189:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint9131);
                    this_CheckTableConstraint_2=ruleCheckTableConstraint();

                    state._fsp--;

                     
                            current = this_CheckTableConstraint_2; 
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
    // $ANTLR end "ruleTableConstraint"


    // $ANTLR start "entryRuleUniqueTableConstraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4205:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4206:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4207:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
             newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint9166);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;

             current =iv_ruleUniqueTableConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint9176); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4214:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4217:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4218:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4218:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4218:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4218:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==108) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4218:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleUniqueTableConstraint9214); 

                        	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4222:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4223:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4223:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4224:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint9231); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getUniqueTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

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
                    break;

            }

            otherlv_2=(Token)match(input,109,FOLLOW_109_in_ruleUniqueTableConstraint9250); 

                	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                
            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleUniqueTableConstraint9262); 

                	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4248:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4249:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4249:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4250:3: lv_columns_4_0= ruleIndexedColumn
            {
             
            	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint9283);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4266:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==60) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4266:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_60_in_ruleUniqueTableConstraint9296); 

            	        	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4270:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4271:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4271:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4272:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint9317);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleUniqueTableConstraint9331); 

                	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4292:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4293:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4293:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4294:3: lv_conflictClause_8_0= ruleConflictClause
            {
             
            	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint9352);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;


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
    // $ANTLR end "ruleUniqueTableConstraint"


    // $ANTLR start "entryRulePrimaryConstraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4318:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4319:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4320:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
             newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint9388);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;

             current =iv_rulePrimaryConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint9398); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4327:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4330:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4331:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4331:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4331:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4331:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==108) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4331:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,108,FOLLOW_108_in_rulePrimaryConstraint9436); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4335:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4336:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4336:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4337:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint9453); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getPrimaryConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

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
                    break;

            }

            otherlv_2=(Token)match(input,105,FOLLOW_105_in_rulePrimaryConstraint9472); 

                	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                
            otherlv_3=(Token)match(input,53,FOLLOW_53_in_rulePrimaryConstraint9484); 

                	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4361:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4362:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4362:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4363:3: lv_columns_4_0= ruleIndexedColumn
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint9505);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;


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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4379:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==60) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4379:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_60_in_rulePrimaryConstraint9518); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4383:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4384:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4385:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint9539);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_7=(Token)match(input,54,FOLLOW_54_in_rulePrimaryConstraint9553); 

                	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4405:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4406:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4406:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4407:3: lv_conflictClause_8_0= ruleConflictClause
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint9574);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;


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
    // $ANTLR end "rulePrimaryConstraint"


    // $ANTLR start "entryRuleCheckTableConstraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4431:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4432:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4433:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
             newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint9610);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;

             current =iv_ruleCheckTableConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint9620); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4440:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4443:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4444:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4444:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4444:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4444:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==108) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4444:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleCheckTableConstraint9658); 

                        	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4448:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4449:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4449:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4450:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint9675); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getCheckTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

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
                    break;

            }

            otherlv_2=(Token)match(input,110,FOLLOW_110_in_ruleCheckTableConstraint9694); 

                	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                
            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleCheckTableConstraint9706); 

                	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4474:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4475:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4475:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4476:3: lv_expression_4_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint9727);
            lv_expression_4_0=ruleSqlExpression();

            state._fsp--;


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

            otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleCheckTableConstraint9739); 

                	newLeafNode(otherlv_5, grammarAccess.getCheckTableConstraintAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleCheckTableConstraint"


    // $ANTLR start "entryRuleIndexedColumn"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4504:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4505:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4506:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
             newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn9775);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;

             current =iv_ruleIndexedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn9785); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4513:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4516:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4517:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4517:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4517:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4517:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4518:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4518:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4519:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexedColumnRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn9830); 

            		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
            	

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4530:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==73) ) {
                alt80=1;
            }
            else if ( (LA80_0==74) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4530:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4530:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4531:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4531:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4532:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,73,FOLLOW_73_in_ruleIndexedColumn9849); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4546:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4546:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4547:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4547:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4548:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,74,FOLLOW_74_in_ruleIndexedColumn9886); 

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


    // $ANTLR start "entryRuleDefaultValue"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4569:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4570:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4571:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
             newCompositeNode(grammarAccess.getDefaultValueRule()); 
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue9937);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;

             current =iv_ruleDefaultValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue9947); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4578:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4581:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_STRING && LA81_0<=RULE_NUMBER)||LA81_0==25||(LA81_0>=83 && LA81_0<=86)) ) {
                alt81=1;
            }
            else if ( (LA81_0==53) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4582:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4583:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4588:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4589:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4589:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4590:3: lv_literal_1_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue10003);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4607:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4607:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4607:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4607:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4608:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleDefaultValue10032); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4617:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4618:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4618:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4619:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue10053);
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

                    otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleDefaultValue10065); 

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


    // $ANTLR start "entryRuleConflictClause"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4647:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4648:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4649:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
             newCompositeNode(grammarAccess.getConflictClauseRule()); 
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause10102);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;

             current =iv_ruleConflictClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause10112); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4656:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4659:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4660:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4660:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4660:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleConflictClause10149); 

                	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                
            otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleConflictClause10161); 

                	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4668:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4669:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4669:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4670:3: lv_resolution_2_0= ruleConflictResolution
            {
             
            	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause10182);
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


    // $ANTLR start "entryRuleDMLStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4694:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4695:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4696:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
             newCompositeNode(grammarAccess.getDMLStatementRule()); 
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement10218);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;

             current =iv_ruleDMLStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement10228); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4703:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4706:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4707:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4707:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt82=1;
                }
                break;
            case 95:
            case 112:
                {
                alt82=2;
                }
                break;
            case 96:
                {
                alt82=3;
                }
                break;
            case 94:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4708:5: this_SelectStatement_0= ruleSelectStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement10275);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;

                     
                            current = this_SelectStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4718:5: this_InsertStatement_1= ruleInsertStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement10302);
                    this_InsertStatement_1=ruleInsertStatement();

                    state._fsp--;

                     
                            current = this_InsertStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4728:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement10329);
                    this_UpdateStatement_2=ruleUpdateStatement();

                    state._fsp--;

                     
                            current = this_UpdateStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4738:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                     
                            newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement10356);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4754:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4755:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4756:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement10391);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;

             current =iv_ruleDeleteStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement10401); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4763:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tableName_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4766:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4767:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4767:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4767:3: otherlv_0= 'delete' otherlv_1= 'from' ( (lv_tableName_2_0= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleDeleteStatement10438); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                
            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleDeleteStatement10450); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4775:1: ( (lv_tableName_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4776:1: (lv_tableName_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4776:1: (lv_tableName_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4777:3: lv_tableName_2_0= RULE_ID
            {
            lv_tableName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement10467); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4793:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==70) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4793:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_70_in_ruleDeleteStatement10485); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4797:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4798:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4798:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4799:3: lv_expression_4_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement10506);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4823:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4824:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4825:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
             newCompositeNode(grammarAccess.getInsertStatementRule()); 
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement10544);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;

             current =iv_ruleInsertStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement10554); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4832:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4835:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (lv_tableName_5_0= RULE_ID ) ) (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==95) ) {
                alt85=1;
            }
            else if ( (LA85_0==112) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4836:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleInsertStatement10593); 

                        	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4840:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==46) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4840:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleInsertStatement10606); 

                                	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4844:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4845:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4845:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4846:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement10627);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4863:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,112,FOLLOW_112_in_ruleInsertStatement10648); 

                        	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,113,FOLLOW_113_in_ruleInsertStatement10661); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4871:1: ( (lv_tableName_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4872:1: (lv_tableName_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4872:1: (lv_tableName_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4873:3: lv_tableName_5_0= RULE_ID
            {
            lv_tableName_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement10678); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4889:2: (otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==53) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4889:4: otherlv_6= '(' ( (lv_columnNames_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleInsertStatement10696); 

                        	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4893:1: ( (lv_columnNames_7_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4894:1: (lv_columnNames_7_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4894:1: (lv_columnNames_7_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4895:3: lv_columnNames_7_0= RULE_ID
                    {
                    lv_columnNames_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement10713); 

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4911:2: (otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==60) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4911:4: otherlv_8= ',' ( (lv_columnNames_9_0= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,60,FOLLOW_60_in_ruleInsertStatement10731); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4915:1: ( (lv_columnNames_9_0= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4916:1: (lv_columnNames_9_0= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4916:1: (lv_columnNames_9_0= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4917:3: lv_columnNames_9_0= RULE_ID
                    	    {
                    	    lv_columnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement10748); 

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
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,54,FOLLOW_54_in_ruleInsertStatement10767); 

                        	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4937:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==66||LA90_0==114) ) {
                alt90=1;
            }
            else if ( (LA90_0==107) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4937:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4937:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==114) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==66) ) {
                        alt89=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4937:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4937:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4937:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,114,FOLLOW_114_in_ruleInsertStatement10784); 

                                	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                
                            otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleInsertStatement10796); 

                                	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4945:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4946:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4946:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4947:3: lv_expressions_13_0= ruleSqlExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement10817);
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

                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4963:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==60) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4963:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,60,FOLLOW_60_in_ruleInsertStatement10830); 

                            	        	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	        
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4967:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4968:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4968:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4969:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement10851);
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
                            	    break loop88;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,54,FOLLOW_54_in_ruleInsertStatement10865); 

                                	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4990:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4990:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4991:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4991:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:4992:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                             
                            	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement10893);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5009:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5009:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5009:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,107,FOLLOW_107_in_ruleInsertStatement10913); 

                        	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                        
                    otherlv_19=(Token)match(input,114,FOLLOW_114_in_ruleInsertStatement10925); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5025:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5026:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5027:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement10963);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement10973); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5034:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5037:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5038:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5038:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5038:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (lv_tableName_3_0= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,96,FOLLOW_96_in_ruleUpdateStatement11010); 

                	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5042:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==46) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5042:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleUpdateStatement11023); 

                        	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5046:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5047:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5047:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5048:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11044);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5064:4: ( (lv_tableName_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5065:1: (lv_tableName_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5065:1: (lv_tableName_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5066:3: lv_tableName_3_0= RULE_ID
            {
            lv_tableName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement11063); 

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

            otherlv_4=(Token)match(input,115,FOLLOW_115_in_ruleUpdateStatement11080); 

                	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5086:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5087:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5087:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5088:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11101);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5104:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==60) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5104:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleUpdateStatement11114); 

            	        	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5108:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5109:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5109:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5110:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11135);
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
            	    break loop92;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5126:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==70) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5126:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,70,FOLLOW_70_in_ruleUpdateStatement11150); 

                        	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5130:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5131:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5131:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5132:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement11171);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5156:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5157:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5158:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
             newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression11209);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;

             current =iv_ruleUpdateColumnExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression11219); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5165:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token lv_columnName_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5168:28: ( ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5169:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5169:1: ( ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5169:2: ( (lv_columnName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5169:2: ( (lv_columnName_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5170:1: (lv_columnName_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5170:1: (lv_columnName_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5171:3: lv_columnName_0_0= RULE_ID
            {
            lv_columnName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression11261); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleUpdateColumnExpression11278); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5191:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5192:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5192:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5193:3: lv_expression_2_0= ruleSqlExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression11299);
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


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5217:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5218:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5219:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
             newCompositeNode(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber11336);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;

             current =iv_ruleSignedNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber11347); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5226:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5229:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5230:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5230:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5230:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5230:2: (kw= '-' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==25) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5231:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleSignedNumber11386); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber11403); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5251:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5252:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5253:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11449);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11460); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5260:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5263:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5264:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5264:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5264:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName11500); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5271:1: (kw= '.' this_ID_2= RULE_ID )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==51) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5272:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,51,FOLLOW_51_in_ruleQualifiedName11519); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName11534); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop95;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCompoundOperator"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5292:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5294:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5295:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5295:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt96=1;
                }
                break;
            case 117:
                {
                alt96=2;
                }
                break;
            case 118:
                {
                alt96=3;
                }
                break;
            case 119:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5295:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5295:2: (enumLiteral_0= 'union all' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5295:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_116_in_ruleCompoundOperator11595); 

                            current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5301:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5301:6: (enumLiteral_1= 'union' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5301:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_117_in_ruleCompoundOperator11612); 

                            current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5307:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5307:6: (enumLiteral_2= 'intersect' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5307:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,118,FOLLOW_118_in_ruleCompoundOperator11629); 

                            current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5313:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5313:6: (enumLiteral_3= 'except' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5313:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,119,FOLLOW_119_in_ruleCompoundOperator11646); 

                            current = grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleCompoundOperator"


    // $ANTLR start "ruleSqliteDataType"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5323:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5325:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5326:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5326:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt97=6;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt97=1;
                }
                break;
            case 121:
                {
                alt97=2;
                }
                break;
            case 122:
                {
                alt97=3;
                }
                break;
            case 123:
                {
                alt97=4;
                }
                break;
            case 124:
                {
                alt97=5;
                }
                break;
            case 125:
                {
                alt97=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5326:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5326:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5326:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_120_in_ruleSqliteDataType11691); 

                            current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5332:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5332:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5332:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_121_in_ruleSqliteDataType11708); 

                            current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5338:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5338:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5338:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_122_in_ruleSqliteDataType11725); 

                            current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5344:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5344:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5344:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_123_in_ruleSqliteDataType11742); 

                            current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5350:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5350:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5350:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,124,FOLLOW_124_in_ruleSqliteDataType11759); 

                            current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5356:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5356:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5356:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,125,FOLLOW_125_in_ruleSqliteDataType11776); 

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


    // $ANTLR start "ruleColumnType"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5366:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5368:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5369:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5369:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt98=5;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt98=1;
                }
                break;
            case 121:
                {
                alt98=2;
                }
                break;
            case 122:
                {
                alt98=3;
                }
                break;
            case 123:
                {
                alt98=4;
                }
                break;
            case 126:
                {
                alt98=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5369:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5369:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5369:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_120_in_ruleColumnType11821); 

                            current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5375:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5375:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5375:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_121_in_ruleColumnType11838); 

                            current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5381:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5381:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5381:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_122_in_ruleColumnType11855); 

                            current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5387:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5387:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5387:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_123_in_ruleColumnType11872); 

                            current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5393:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5393:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5393:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,126,FOLLOW_126_in_ruleColumnType11889); 

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


    // $ANTLR start "ruleConflictResolution"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5403:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5405:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5406:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5406:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt99=1;
                }
                break;
            case 128:
                {
                alt99=2;
                }
                break;
            case 129:
                {
                alt99=3;
                }
                break;
            case 130:
                {
                alt99=4;
                }
                break;
            case 112:
                {
                alt99=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5406:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5406:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5406:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_127_in_ruleConflictResolution11934); 

                            current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5412:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5412:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5412:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_128_in_ruleConflictResolution11951); 

                            current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5418:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5418:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5418:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_129_in_ruleConflictResolution11968); 

                            current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5424:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5424:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5424:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,130,FOLLOW_130_in_ruleConflictResolution11985); 

                            current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5430:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5430:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:5430:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,112,FOLLOW_112_in_ruleConflictResolution12002); 

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


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA29_eotS =
        "\14\uffff";
    static final String DFA29_eofS =
        "\3\uffff\1\12\10\uffff";
    static final String DFA29_minS =
        "\1\4\2\uffff\1\23\1\uffff\1\4\6\uffff";
    static final String DFA29_maxS =
        "\1\126\2\uffff\1\167\1\uffff\1\126\6\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\10\1\3\1\5";
    static final String DFA29_specialS =
        "\14\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\3\2\4\22\uffff\1\4\30\uffff\1\1\1\uffff\1\2\1\5\1\uffff\2"+
            "\6\1\7\3\uffff\1\10\25\uffff\4\4",
            "",
            "",
            "\37\12\1\uffff\1\12\1\uffff\1\11\1\12\3\uffff\3\12\1\uffff"+
            "\4\12\3\uffff\10\12\1\uffff\3\12\22\uffff\1\12\20\uffff\4\12",
            "",
            "\3\13\22\uffff\1\13\30\uffff\1\13\1\uffff\2\13\1\uffff\3\13"+
            "\3\uffff\1\13\4\uffff\1\6\20\uffff\4\13",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1340:1: ( ( () otherlv_1= 'new' otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) | ( () otherlv_5= 'old' otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) | ( () ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' )? ( (otherlv_11= RULE_ID ) ) ) | ( () ( (lv_literalValue_13_0= ruleLiteralValue ) ) ) | ( () otherlv_15= '(' ( (lv_expression_16_0= ruleSqlExpression ) ) otherlv_17= ')' ) | ( () ( (lv_not_19_0= 'not' ) )? ( (lv_exists_20_0= 'exists' ) )? otherlv_21= '(' ( (lv_select_22_0= ruleSelectStatement ) ) otherlv_23= ')' ) | ( () otherlv_25= 'case' ( (lv_caseExpression_26_0= ruleSqlExpression ) )? ( (lv_cases_27_0= ruleCase ) )+ (otherlv_28= 'else' ( (lv_elseExpression_29_0= ruleSqlExpression ) ) )? otherlv_30= 'end' ) | ( () ( (lv_name_32_0= RULE_ID ) ) otherlv_33= '(' ( ( (lv_all_34_0= '*' ) ) | ( ( (lv_arguments_35_0= ruleSqlExpression ) ) (otherlv_36= ',' ( (lv_arugments_37_0= ruleSqlExpression ) ) )* ) ) otherlv_38= ')' ) | ( () otherlv_40= 'cast' otherlv_41= '(' ( (lv_expression_42_0= ruleSqlExpression ) ) otherlv_43= 'as' ( (lv_type_44_0= ruleSqliteDataType ) ) otherlv_45= ')' ) )";
        }
    }
    static final String DFA53_eotS =
        "\12\uffff";
    static final String DFA53_eofS =
        "\12\uffff";
    static final String DFA53_minS =
        "\1\127\1\130\1\uffff\1\130\6\uffff";
    static final String DFA53_maxS =
        "\1\145\1\132\1\uffff\1\132\6\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\4\1\uffff\1\3\1\1\1\2\1\6\1\5\1\7";
    static final String DFA53_specialS =
        "\12\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\14\uffff\1\2\1\3",
            "\1\5\1\6\1\4",
            "",
            "\1\10\1\11\1\7",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3050:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableStatement_3= ruleAlterTableStatement | this_DropTableStatement_4= ruleDropTableStatement | this_DropTriggerStatement_5= ruleDropTriggerStatement | this_DropViewStatement_6= ruleDropViewStatement )";
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
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock715 = new BitSet(new long[]{0x0000000000008000L,0x0000003000800000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock737 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock749 = new BitSet(new long[]{0x0000000000008000L,0x0000003000800000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat946 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleExprConcat973 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1007 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1102 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_21_in_ruleExprMult1131 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_22_in_ruleExprMult1160 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_23_in_ruleExprMult1189 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1226 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1321 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleExprAdd1350 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_25_in_ruleExprAdd1379 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1416 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1511 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_26_in_ruleExprBit1540 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_27_in_ruleExprBit1569 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_28_in_ruleExprBit1598 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_29_in_ruleExprBit1627 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1664 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate1759 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_30_in_ruleExprRelate1788 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_31_in_ruleExprRelate1817 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_32_in_ruleExprRelate1846 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_33_in_ruleExprRelate1875 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate1912 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual1950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2007 = new BitSet(new long[]{0x00001FFC00000002L});
    public static final BitSet FOLLOW_34_in_ruleExprEqual2036 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_35_in_ruleExprEqual2065 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_36_in_ruleExprEqual2094 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_37_in_ruleExprEqual2123 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_38_in_ruleExprEqual2152 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2181 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2210 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2239 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2268 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2297 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2326 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2363 = new BitSet(new long[]{0x00001FFC00000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2458 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleExprAnd2485 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2519 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr2614 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleExprOr2641 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr2675 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression2713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression2770 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression2838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNullExpression2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNullExpression2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNullExpression2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrimaryExpression3038 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimaryExpression3099 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3169 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression3181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3270 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3291 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimaryExpression3338 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3370 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3417 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3458 = new BitSet(new long[]{0xA3B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3479 = new BitSet(new long[]{0xA3B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression3501 = new BitSet(new long[]{0xAFB4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3515 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3536 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3584 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3601 = new BitSet(new long[]{0x23B4000002200070L,0x0000000000780000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3620 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3661 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression3674 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3695 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression3740 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_rulePrimaryExpression3752 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3773 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression3785 = new BitSet(new long[]{0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression3806 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryExpression3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase3855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCase3902 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase3923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleCase3935 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement3992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement4048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSelectStatement4061 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleSelectStatement4082 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSelectStatement4095 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleSelectStatement4116 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore4156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4213 = new BitSet(new long[]{0x0000000000000002L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore4243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4264 = new BitSet(new long[]{0x0000000000000002L,0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSelectExpression4358 = new BitSet(new long[]{0x23B4000002200070L,0x0000000000780018L});
    public static final BitSet FOLLOW_67_in_ruleSelectExpression4377 = new BitSet(new long[]{0x23B4000002200070L,0x0000000000780018L});
    public static final BitSet FOLLOW_68_in_ruleSelectExpression4414 = new BitSet(new long[]{0x23B4000002200070L,0x0000000000780018L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectExpression4450 = new BitSet(new long[]{0x1000000000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_60_in_ruleSelectExpression4463 = new BitSet(new long[]{0x23B4000002200070L,0x0000000000780018L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectExpression4484 = new BitSet(new long[]{0x1000000000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_69_in_ruleSelectExpression4499 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression4520 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleSelectExpression4535 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectExpression4556 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleSelectExpression4571 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectExpression4592 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_60_in_ruleSelectExpression4605 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectExpression4626 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSelectExpression4643 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectExpression4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm4702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm4758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleOrderingTerm4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOrderingTerm4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource4865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource4921 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D800L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource4942 = new BitSet(new long[]{0x0000000000000002L,0x000000000001D800L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource4979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable5125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable5189 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSingleSourceTable5202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement5262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSingleSourceSelectStatement5318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement5339 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSingleSourceSelectStatement5351 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSingleSourceSelectStatement5364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin5424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSingleSourceJoin5471 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin5492 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSingleSourceJoin5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement5540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJoinStatement5602 = new BitSet(new long[]{0x0000000000000000L,0x000000000001D000L});
    public static final BitSet FOLLOW_76_in_ruleJoinStatement5636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_77_in_ruleJoinStatement5667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_78_in_ruleJoinStatement5706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79_in_ruleJoinStatement5743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleJoinStatement5770 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement5791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleJoinStatement5803 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn5860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumnAll_in_ruleResultColumn5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumnExpression_in_ruleResultColumn5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumnAll_in_entryRuleResultColumnAll5979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumnAll5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumnAll6045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleResultColumnAll6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleResultColumnAll6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumnExpression_in_entryRuleResultColumnExpression6114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumnExpression6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumnExpression6179 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleResultColumnExpression6192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumnExpression6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue6252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleLiteralValue6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleLiteralValue6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleLiteralValue6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleLiteralValue6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement6586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableStatement_in_ruleDDLStatement6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement6840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleCreateTableStatement6896 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleCreateTableStatement6908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement6925 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleCreateTableStatement6942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement6963 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_60_in_ruleCreateTableStatement6976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement6997 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_60_in_ruleCreateTableStatement7012 = new BitSet(new long[]{0x0000000000000000L,0x0000720000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7033 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleCreateTableStatement7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleCreateViewStatement7130 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleCreateViewStatement7142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement7159 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleCreateViewStatement7176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement7233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleCreateTriggerStatement7280 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleCreateTriggerStatement7292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7309 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8000000L});
    public static final BitSet FOLLOW_91_in_ruleCreateTriggerStatement7334 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTriggerStatement7363 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateTriggerStatement7392 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement7428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement7465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTriggerStatement7503 = new BitSet(new long[]{0x0000000000000000L,0x0000000200020000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement7529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7546 = new BitSet(new long[]{0x1000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_60_in_ruleCreateTriggerStatement7564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7581 = new BitSet(new long[]{0x1000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleCreateTriggerStatement7604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement7621 = new BitSet(new long[]{0x8000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement7644 = new BitSet(new long[]{0x8000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_63_in_ruleCreateTriggerStatement7671 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement7692 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement7706 = new BitSet(new long[]{0x0800000000000000L,0x00010001C0000004L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement7728 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement7740 = new BitSet(new long[]{0x0800000000000000L,0x00010001C0000004L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement7762 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCreateTriggerStatement7774 = new BitSet(new long[]{0x0800000000000000L,0x00010001C0000004L});
    public static final BitSet FOLLOW_59_in_ruleCreateTriggerStatement7790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableStatement_in_entryRuleAlterTableStatement7826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableStatement7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleAlterTableStatement7873 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleAlterTableStatement7885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableStatement7902 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_ruleAlterTableStatement7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement7964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleDropTableStatement8011 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleDropTableStatement8023 = new BitSet(new long[]{0x0000000000000010L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleDropTableStatement8041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement8113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleDropTriggerStatement8160 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleDropTriggerStatement8172 = new BitSet(new long[]{0x0000000000000010L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleDropTriggerStatement8190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement8262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleDropViewStatement8309 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleDropViewStatement8321 = new BitSet(new long[]{0x0000000000000010L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleDropViewStatement8339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause8411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableClause8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleAlterTableClause8468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableClause8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleAlterTableClause8519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableClause8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef8577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef8638 = new BitSet(new long[]{0x0000000000000000L,0x4F00000000000000L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef8664 = new BitSet(new long[]{0x0001000000000002L,0x00000A0000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef8685 = new BitSet(new long[]{0x0001000000000002L,0x00000A0000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint8722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint8732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleColumnConstraint8779 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000600L});
    public static final BitSet FOLLOW_73_in_ruleColumnConstraint8798 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_74_in_ruleColumnConstraint8835 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleColumnConstraint8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleColumnConstraint8911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleColumnConstraint8962 = new BitSet(new long[]{0x0020000002000060L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint8983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint9030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint9104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint9131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint9166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleUniqueTableConstraint9214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint9231 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleUniqueTableConstraint9250 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleUniqueTableConstraint9262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint9283 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_60_in_ruleUniqueTableConstraint9296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint9317 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleUniqueTableConstraint9331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint9388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rulePrimaryConstraint9436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint9453 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_rulePrimaryConstraint9472 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_rulePrimaryConstraint9484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint9505 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_60_in_rulePrimaryConstraint9518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint9539 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePrimaryConstraint9553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint9610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleCheckTableConstraint9658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint9675 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleCheckTableConstraint9694 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleCheckTableConstraint9706 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint9727 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleCheckTableConstraint9739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn9775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn9785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn9830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleIndexedColumn9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleIndexedColumn9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue9937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue10003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDefaultValue10032 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue10053 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleDefaultValue10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause10102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleConflictClause10149 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleConflictClause10161 = new BitSet(new long[]{0x0000000000000000L,0x8001000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement10218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement10275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement10391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleDeleteStatement10438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleDeleteStatement10450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement10467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleDeleteStatement10485 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement10544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleInsertStatement10593 = new BitSet(new long[]{0x0000400000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_46_in_ruleInsertStatement10606 = new BitSet(new long[]{0x0000000000000000L,0x8001000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement10627 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_112_in_ruleInsertStatement10648 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleInsertStatement10661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement10678 = new BitSet(new long[]{0x0020000000000000L,0x0004080000000004L});
    public static final BitSet FOLLOW_53_in_ruleInsertStatement10696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement10713 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_60_in_ruleInsertStatement10731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement10748 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleInsertStatement10767 = new BitSet(new long[]{0x0000000000000000L,0x0004080000000004L});
    public static final BitSet FOLLOW_114_in_ruleInsertStatement10784 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleInsertStatement10796 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement10817 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_60_in_ruleInsertStatement10830 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement10851 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleInsertStatement10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement10893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleInsertStatement10913 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleInsertStatement10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement10963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement10973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleUpdateStatement11010 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46_in_ruleUpdateStatement11023 = new BitSet(new long[]{0x0000000000000000L,0x8001000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement11063 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleUpdateStatement11080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11101 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_60_in_ruleUpdateStatement11114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement11135 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleUpdateStatement11150 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement11171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression11209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression11219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression11261 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleUpdateColumnExpression11278 = new BitSet(new long[]{0x23B4000002000070L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression11299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber11336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSignedNumber11386 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName11500 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleQualifiedName11519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName11534 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_116_in_ruleCompoundOperator11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleCompoundOperator11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleCompoundOperator11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleCompoundOperator11646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleSqliteDataType11691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleSqliteDataType11708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleSqliteDataType11725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleSqliteDataType11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSqliteDataType11759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleSqliteDataType11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleColumnType11821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleColumnType11838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleColumnType11855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleColumnType11872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleColumnType11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleConflictResolution11934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleConflictResolution11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleConflictResolution11968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleConflictResolution11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleConflictResolution12002 = new BitSet(new long[]{0x0000000000000002L});

}