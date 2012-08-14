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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'migration'", "';'", "'or'", "'and'", "'('", "')'", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'like'", "'glob'", "'match'", "'regexp'", "'<'", "'<='", "'>'", "'>='", "'create'", "'table'", "','", "'alter'", "'view'", "'as'", "'rename to'", "'add column'", "'primary'", "'key'", "'asc'", "'desc'", "'autoincrement'", "'not'", "'null'", "'default'", "'unique'", "'select'", "'distinct'", "'all'", "'from'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'*'", "'.'", "'conflict'", "'current_time'", "'current_date'", "'current_time_stamp'", "'-'", "'text'", "'integer'", "'real'", "'blob'", "'rollback'", "'abort'", "'fail'", "'ignore'", "'replace'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:138:1: ruleDatabaseBlock returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_migrations_3_0= ruleMigrationBlock ) )* otherlv_4= '}' ) ;
    public final EObject ruleDatabaseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_migrations_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:141:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_migrations_3_0= ruleMigrationBlock ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_migrations_3_0= ruleMigrationBlock ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:142:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_migrations_3_0= ruleMigrationBlock ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:142:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_migrations_3_0= ruleMigrationBlock ) )* otherlv_4= '}'
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
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:168:1: ( (lv_migrations_3_0= ruleMigrationBlock ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:169:1: (lv_migrations_3_0= ruleMigrationBlock )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:169:1: (lv_migrations_3_0= ruleMigrationBlock )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:170:3: lv_migrations_3_0= ruleMigrationBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatabaseBlockAccess().getMigrationsMigrationBlockParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock302);
            	    lv_migrations_3_0=ruleMigrationBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDatabaseBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"migrations",
            	            		lv_migrations_3_0, 
            	            		"MigrationBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDatabaseBlock315); 

                	newLeafNode(otherlv_4, grammarAccess.getDatabaseBlockAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleMigrationBlock"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:198:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:199:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:200:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
             newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock351);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;

             current =iv_ruleMigrationBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock361); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:207:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleStatment ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )* )? otherlv_7= '}' ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:210:28: ( ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleStatment ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )* )? otherlv_7= '}' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:211:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleStatment ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )* )? otherlv_7= '}' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:211:1: ( () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleStatment ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )* )? otherlv_7= '}' )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:211:2: () otherlv_1= 'migration' otherlv_2= '{' ( ( (lv_statements_3_0= ruleStatment ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )* )? otherlv_7= '}'
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:211:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:212:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMigrationBlock407); 

                	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrationKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMigrationBlock419); 

                	newLeafNode(otherlv_2, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:225:1: ( ( (lv_statements_3_0= ruleStatment ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37||LA3_0==40) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:225:2: ( (lv_statements_3_0= ruleStatment ) ) otherlv_4= ';' ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:225:2: ( (lv_statements_3_0= ruleStatment ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:226:1: (lv_statements_3_0= ruleStatment )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:226:1: (lv_statements_3_0= ruleStatment )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:227:3: lv_statements_3_0= ruleStatment
                    {
                     
                    	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsStatmentParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStatment_in_ruleMigrationBlock441);
                    lv_statements_3_0=ruleStatment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMigrationBlockRule());
                    	        }
                           		add(
                           			current, 
                           			"statements",
                            		lv_statements_3_0, 
                            		"Statment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMigrationBlock453); 

                        	newLeafNode(otherlv_4, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:247:1: ( ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==37||LA2_0==40) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:247:2: ( (lv_statements_5_0= ruleStatment ) ) otherlv_6= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:247:2: ( (lv_statements_5_0= ruleStatment ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:248:1: (lv_statements_5_0= ruleStatment )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:248:1: (lv_statements_5_0= ruleStatment )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:249:3: lv_statements_5_0= ruleStatment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsStatmentParserRuleCall_3_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatment_in_ruleMigrationBlock475);
                    	    lv_statements_5_0=ruleStatment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMigrationBlockRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"statements",
                    	            		lv_statements_5_0, 
                    	            		"Statment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleMigrationBlock487); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_3_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleMigrationBlock503); 

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


    // $ANTLR start "entryRuleOr"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:281:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:282:2: (iv_ruleOr= ruleOr EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:283:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr539);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:290:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:293:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:294:1: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:294:1: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:295:5: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr596);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:303:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:303:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:303:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:304:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOr617); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:313:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:314:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:314:1: (lv_right_3_0= ruleAnd )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:315:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr638);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:339:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:340:2: (iv_ruleAnd= ruleAnd EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:341:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd676);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd686); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:348:1: ruleAnd returns [EObject current=null] : (this_PrimaryComparison_0= rulePrimaryComparison ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimaryComparison ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryComparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:351:28: ( (this_PrimaryComparison_0= rulePrimaryComparison ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimaryComparison ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:352:1: (this_PrimaryComparison_0= rulePrimaryComparison ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimaryComparison ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:352:1: (this_PrimaryComparison_0= rulePrimaryComparison ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimaryComparison ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:353:5: this_PrimaryComparison_0= rulePrimaryComparison ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimaryComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getPrimaryComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryComparison_in_ruleAnd733);
            this_PrimaryComparison_0=rulePrimaryComparison();

            state._fsp--;

             
                    current = this_PrimaryComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:361:1: ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimaryComparison ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:361:2: () otherlv_2= 'and' ( (lv_right_3_0= rulePrimaryComparison ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:361:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:362:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAnd754); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:371:1: ( (lv_right_3_0= rulePrimaryComparison ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:372:1: (lv_right_3_0= rulePrimaryComparison )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:372:1: (lv_right_3_0= rulePrimaryComparison )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:373:3: lv_right_3_0= rulePrimaryComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryComparison_in_ruleAnd775);
            	    lv_right_3_0=rulePrimaryComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PrimaryComparison");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimaryComparison"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:397:1: entryRulePrimaryComparison returns [EObject current=null] : iv_rulePrimaryComparison= rulePrimaryComparison EOF ;
    public final EObject entryRulePrimaryComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryComparison = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:398:2: (iv_rulePrimaryComparison= rulePrimaryComparison EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:399:2: iv_rulePrimaryComparison= rulePrimaryComparison EOF
            {
             newCompositeNode(grammarAccess.getPrimaryComparisonRule()); 
            pushFollow(FOLLOW_rulePrimaryComparison_in_entryRulePrimaryComparison813);
            iv_rulePrimaryComparison=rulePrimaryComparison();

            state._fsp--;

             current =iv_rulePrimaryComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryComparison823); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryComparison"


    // $ANTLR start "rulePrimaryComparison"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:406:1: rulePrimaryComparison returns [EObject current=null] : (this_SecondaryComparison_0= ruleSecondaryComparison ( () ( (lv_op_2_0= ruleSecondaryComparisonOp ) ) ( (lv_right_3_0= ruleSecondaryComparison ) ) )* ) ;
    public final EObject rulePrimaryComparison() throws RecognitionException {
        EObject current = null;

        EObject this_SecondaryComparison_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:409:28: ( (this_SecondaryComparison_0= ruleSecondaryComparison ( () ( (lv_op_2_0= ruleSecondaryComparisonOp ) ) ( (lv_right_3_0= ruleSecondaryComparison ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:410:1: (this_SecondaryComparison_0= ruleSecondaryComparison ( () ( (lv_op_2_0= ruleSecondaryComparisonOp ) ) ( (lv_right_3_0= ruleSecondaryComparison ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:410:1: (this_SecondaryComparison_0= ruleSecondaryComparison ( () ( (lv_op_2_0= ruleSecondaryComparisonOp ) ) ( (lv_right_3_0= ruleSecondaryComparison ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:411:5: this_SecondaryComparison_0= ruleSecondaryComparison ( () ( (lv_op_2_0= ruleSecondaryComparisonOp ) ) ( (lv_right_3_0= ruleSecondaryComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPrimaryComparisonAccess().getSecondaryComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSecondaryComparison_in_rulePrimaryComparison870);
            this_SecondaryComparison_0=ruleSecondaryComparison();

            state._fsp--;

             
                    current = this_SecondaryComparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:419:1: ( () ( (lv_op_2_0= ruleSecondaryComparisonOp ) ) ( (lv_right_3_0= ruleSecondaryComparison ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=33 && LA6_0<=36)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:419:2: () ( (lv_op_2_0= ruleSecondaryComparisonOp ) ) ( (lv_right_3_0= ruleSecondaryComparison ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:419:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:420:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPrimaryComparisonAccess().getPrimaryComparisonExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:425:2: ( (lv_op_2_0= ruleSecondaryComparisonOp ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:426:1: (lv_op_2_0= ruleSecondaryComparisonOp )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:426:1: (lv_op_2_0= ruleSecondaryComparisonOp )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:427:3: lv_op_2_0= ruleSecondaryComparisonOp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimaryComparisonAccess().getOpSecondaryComparisonOpParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSecondaryComparisonOp_in_rulePrimaryComparison900);
            	    lv_op_2_0=ruleSecondaryComparisonOp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrimaryComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"SecondaryComparisonOp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:443:2: ( (lv_right_3_0= ruleSecondaryComparison ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:444:1: (lv_right_3_0= ruleSecondaryComparison )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:444:1: (lv_right_3_0= ruleSecondaryComparison )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:445:3: lv_right_3_0= ruleSecondaryComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimaryComparisonAccess().getRightSecondaryComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSecondaryComparison_in_rulePrimaryComparison921);
            	    lv_right_3_0=ruleSecondaryComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrimaryComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"SecondaryComparison");
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
    // $ANTLR end "rulePrimaryComparison"


    // $ANTLR start "entryRuleSecondaryComparison"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:469:1: entryRuleSecondaryComparison returns [EObject current=null] : iv_ruleSecondaryComparison= ruleSecondaryComparison EOF ;
    public final EObject entryRuleSecondaryComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryComparison = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:470:2: (iv_ruleSecondaryComparison= ruleSecondaryComparison EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:471:2: iv_ruleSecondaryComparison= ruleSecondaryComparison EOF
            {
             newCompositeNode(grammarAccess.getSecondaryComparisonRule()); 
            pushFollow(FOLLOW_ruleSecondaryComparison_in_entryRuleSecondaryComparison959);
            iv_ruleSecondaryComparison=ruleSecondaryComparison();

            state._fsp--;

             current =iv_ruleSecondaryComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecondaryComparison969); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecondaryComparison"


    // $ANTLR start "ruleSecondaryComparison"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:478:1: ruleSecondaryComparison returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= rulePrimaryComparisonOp ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleSecondaryComparison() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:481:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= rulePrimaryComparisonOp ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:482:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= rulePrimaryComparisonOp ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:482:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= rulePrimaryComparisonOp ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:483:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= rulePrimaryComparisonOp ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSecondaryComparisonAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleSecondaryComparison1016);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:491:1: ( () ( (lv_op_2_0= rulePrimaryComparisonOp ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=32)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:491:2: () ( (lv_op_2_0= rulePrimaryComparisonOp ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:491:2: ()
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:492:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getSecondaryComparisonAccess().getSecondaryComparisonExprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:497:2: ( (lv_op_2_0= rulePrimaryComparisonOp ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:498:1: (lv_op_2_0= rulePrimaryComparisonOp )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:498:1: (lv_op_2_0= rulePrimaryComparisonOp )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:499:3: lv_op_2_0= rulePrimaryComparisonOp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecondaryComparisonAccess().getOpPrimaryComparisonOpParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryComparisonOp_in_ruleSecondaryComparison1046);
            	    lv_op_2_0=rulePrimaryComparisonOp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecondaryComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"PrimaryComparisonOp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:515:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:516:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:516:1: (lv_right_3_0= rulePrimaryExpression )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:517:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecondaryComparisonAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleSecondaryComparison1067);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecondaryComparisonRule());
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
    // $ANTLR end "ruleSecondaryComparison"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:541:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:542:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:543:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1105);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1115); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:550:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_Or_5= ruleOr otherlv_6= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literalValue_3_0 = null;

        EObject this_Or_5 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:553:28: ( ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_Or_5= ruleOr otherlv_6= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:554:1: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_Or_5= ruleOr otherlv_6= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:554:1: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) | ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) ) | (otherlv_4= '(' this_Or_5= ruleOr otherlv_6= ')' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 51:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt8=2;
                }
                break;
            case 20:
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:554:2: ( () ( (lv_name_1_0= ruleFQN ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:554:2: ( () ( (lv_name_1_0= ruleFQN ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:554:3: () ( (lv_name_1_0= ruleFQN ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:554:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:555:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getColumnLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:560:2: ( (lv_name_1_0= ruleFQN ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:561:1: (lv_name_1_0= ruleFQN )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:561:1: (lv_name_1_0= ruleFQN )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:562:3: lv_name_1_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNameFQNParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_rulePrimaryExpression1171);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:579:6: ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:579:6: ( () ( (lv_literalValue_3_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:579:7: () ( (lv_literalValue_3_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:579:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:580:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:585:2: ( (lv_literalValue_3_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:586:1: (lv_literalValue_3_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:586:1: (lv_literalValue_3_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:587:3: lv_literalValue_3_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression1209);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:604:6: (otherlv_4= '(' this_Or_5= ruleOr otherlv_6= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:604:6: (otherlv_4= '(' this_Or_5= ruleOr otherlv_6= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:604:8: otherlv_4= '(' this_Or_5= ruleOr otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePrimaryExpression1229); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOrParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleOr_in_rulePrimaryExpression1251);
                    this_Or_5=ruleOr();

                    state._fsp--;

                     
                            current = this_Or_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression1262); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                        

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


    // $ANTLR start "entryRulePrimaryComparisonOp"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:629:1: entryRulePrimaryComparisonOp returns [String current=null] : iv_rulePrimaryComparisonOp= rulePrimaryComparisonOp EOF ;
    public final String entryRulePrimaryComparisonOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryComparisonOp = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:630:2: (iv_rulePrimaryComparisonOp= rulePrimaryComparisonOp EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:631:2: iv_rulePrimaryComparisonOp= rulePrimaryComparisonOp EOF
            {
             newCompositeNode(grammarAccess.getPrimaryComparisonOpRule()); 
            pushFollow(FOLLOW_rulePrimaryComparisonOp_in_entryRulePrimaryComparisonOp1300);
            iv_rulePrimaryComparisonOp=rulePrimaryComparisonOp();

            state._fsp--;

             current =iv_rulePrimaryComparisonOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryComparisonOp1311); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryComparisonOp"


    // $ANTLR start "rulePrimaryComparisonOp"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:638:1: rulePrimaryComparisonOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '==' | kw= '!=' | kw= '<>' | kw= 'is' | kw= 'is not' | kw= 'in' | kw= 'like' | kw= 'glob' | kw= 'match' | kw= 'regexp' ) ;
    public final AntlrDatatypeRuleToken rulePrimaryComparisonOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:641:28: ( (kw= '=' | kw= '==' | kw= '!=' | kw= '<>' | kw= 'is' | kw= 'is not' | kw= 'in' | kw= 'like' | kw= 'glob' | kw= 'match' | kw= 'regexp' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:642:1: (kw= '=' | kw= '==' | kw= '!=' | kw= '<>' | kw= 'is' | kw= 'is not' | kw= 'in' | kw= 'like' | kw= 'glob' | kw= 'match' | kw= 'regexp' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:642:1: (kw= '=' | kw= '==' | kw= '!=' | kw= '<>' | kw= 'is' | kw= 'is not' | kw= 'in' | kw= 'like' | kw= 'glob' | kw= 'match' | kw= 'regexp' )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case 27:
                {
                alt9=6;
                }
                break;
            case 28:
                {
                alt9=7;
                }
                break;
            case 29:
                {
                alt9=8;
                }
                break;
            case 30:
                {
                alt9=9;
                }
                break;
            case 31:
                {
                alt9=10;
                }
                break;
            case 32:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:643:2: kw= '='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_rulePrimaryComparisonOp1349); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:650:2: kw= '=='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulePrimaryComparisonOp1368); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getEqualsSignEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:657:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulePrimaryComparisonOp1387); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getExclamationMarkEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:664:2: kw= '<>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulePrimaryComparisonOp1406); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getLessThanSignGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:671:2: kw= 'is'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulePrimaryComparisonOp1425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getIsKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:678:2: kw= 'is not'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulePrimaryComparisonOp1444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getIsNotKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:685:2: kw= 'in'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_rulePrimaryComparisonOp1463); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getInKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:692:2: kw= 'like'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulePrimaryComparisonOp1482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getLikeKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:699:2: kw= 'glob'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulePrimaryComparisonOp1501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getGlobKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:706:2: kw= 'match'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulePrimaryComparisonOp1520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getMatchKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:713:2: kw= 'regexp'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulePrimaryComparisonOp1539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryComparisonOpAccess().getRegexpKeyword_10()); 
                        

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
    // $ANTLR end "rulePrimaryComparisonOp"


    // $ANTLR start "entryRuleSecondaryComparisonOp"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:726:1: entryRuleSecondaryComparisonOp returns [String current=null] : iv_ruleSecondaryComparisonOp= ruleSecondaryComparisonOp EOF ;
    public final String entryRuleSecondaryComparisonOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSecondaryComparisonOp = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:727:2: (iv_ruleSecondaryComparisonOp= ruleSecondaryComparisonOp EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:728:2: iv_ruleSecondaryComparisonOp= ruleSecondaryComparisonOp EOF
            {
             newCompositeNode(grammarAccess.getSecondaryComparisonOpRule()); 
            pushFollow(FOLLOW_ruleSecondaryComparisonOp_in_entryRuleSecondaryComparisonOp1580);
            iv_ruleSecondaryComparisonOp=ruleSecondaryComparisonOp();

            state._fsp--;

             current =iv_ruleSecondaryComparisonOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecondaryComparisonOp1591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecondaryComparisonOp"


    // $ANTLR start "ruleSecondaryComparisonOp"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:735:1: ruleSecondaryComparisonOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleSecondaryComparisonOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:738:28: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:739:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:739:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 36:
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:740:2: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleSecondaryComparisonOp1629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSecondaryComparisonOpAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:747:2: kw= '<='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleSecondaryComparisonOp1648); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSecondaryComparisonOpAccess().getLessThanSignEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:754:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleSecondaryComparisonOp1667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSecondaryComparisonOpAccess().getGreaterThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:761:2: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleSecondaryComparisonOp1686); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSecondaryComparisonOpAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                        

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
    // $ANTLR end "ruleSecondaryComparisonOp"


    // $ANTLR start "entryRuleStatment"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:774:1: entryRuleStatment returns [EObject current=null] : iv_ruleStatment= ruleStatment EOF ;
    public final EObject entryRuleStatment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatment = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:775:2: (iv_ruleStatment= ruleStatment EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:776:2: iv_ruleStatment= ruleStatment EOF
            {
             newCompositeNode(grammarAccess.getStatmentRule()); 
            pushFollow(FOLLOW_ruleStatment_in_entryRuleStatment1726);
            iv_ruleStatment=ruleStatment();

            state._fsp--;

             current =iv_ruleStatment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatment1736); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatment"


    // $ANTLR start "ruleStatment"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:783:1: ruleStatment returns [EObject current=null] : ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'alter' otherlv_13= 'table' ( (lv_name_14_0= RULE_ID ) ) ( (lv_clause_15_0= ruleAlterTableClause ) ) ) | ( () otherlv_17= 'create' otherlv_18= 'view' ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'as' ( (lv_selectStatement_21_0= ruleSelectStatement ) ) ) ) ;
    public final EObject ruleStatment() throws RecognitionException {
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        EObject lv_columnDefs_5_0 = null;

        EObject lv_columnDefs_7_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_clause_15_0 = null;

        EObject lv_selectStatement_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:786:28: ( ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'alter' otherlv_13= 'table' ( (lv_name_14_0= RULE_ID ) ) ( (lv_clause_15_0= ruleAlterTableClause ) ) ) | ( () otherlv_17= 'create' otherlv_18= 'view' ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'as' ( (lv_selectStatement_21_0= ruleSelectStatement ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:787:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'alter' otherlv_13= 'table' ( (lv_name_14_0= RULE_ID ) ) ( (lv_clause_15_0= ruleAlterTableClause ) ) ) | ( () otherlv_17= 'create' otherlv_18= 'view' ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'as' ( (lv_selectStatement_21_0= ruleSelectStatement ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:787:1: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) | ( () otherlv_12= 'alter' otherlv_13= 'table' ( (lv_name_14_0= RULE_ID ) ) ( (lv_clause_15_0= ruleAlterTableClause ) ) ) | ( () otherlv_17= 'create' otherlv_18= 'view' ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'as' ( (lv_selectStatement_21_0= ruleSelectStatement ) ) ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==38) ) {
                    alt13=1;
                }
                else if ( (LA13_1==41) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==40) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:787:2: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:787:2: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:787:3: () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:787:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:788:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStatmentAccess().getCreateTableStatementAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleStatment1783); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatmentAccess().getCreateKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleStatment1795); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatmentAccess().getTableKeyword_0_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:801:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:802:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:802:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:803:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatment1812); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getStatmentAccess().getNameIDTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStatment1829); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatmentAccess().getLeftParenthesisKeyword_0_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:823:1: ( (lv_columnDefs_5_0= ruleColumnDef ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:824:1: (lv_columnDefs_5_0= ruleColumnDef )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:824:1: (lv_columnDefs_5_0= ruleColumnDef )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:825:3: lv_columnDefs_5_0= ruleColumnDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatmentAccess().getColumnDefsColumnDefParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnDef_in_ruleStatment1850);
                    lv_columnDefs_5_0=ruleColumnDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatmentRule());
                    	        }
                           		add(
                           			current, 
                           			"columnDefs",
                            		lv_columnDefs_5_0, 
                            		"ColumnDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:841:2: (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==39) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==RULE_ID) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:841:4: otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) )
                    	    {
                    	    otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleStatment1863); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getStatmentAccess().getCommaKeyword_0_6_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:845:1: ( (lv_columnDefs_7_0= ruleColumnDef ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:846:1: (lv_columnDefs_7_0= ruleColumnDef )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:846:1: (lv_columnDefs_7_0= ruleColumnDef )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:847:3: lv_columnDefs_7_0= ruleColumnDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatmentAccess().getColumnDefsColumnDefParserRuleCall_0_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColumnDef_in_ruleStatment1884);
                    	    lv_columnDefs_7_0=ruleColumnDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatmentRule());
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
                    	    break loop11;
                        }
                    } while (true);

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:863:4: (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==39) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:863:6: otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) )
                    	    {
                    	    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleStatment1899); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getStatmentAccess().getCommaKeyword_0_7_0());
                    	        
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:867:1: ( (lv_constraints_9_0= ruleTableConstraint ) )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:868:1: (lv_constraints_9_0= ruleTableConstraint )
                    	    {
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:868:1: (lv_constraints_9_0= ruleTableConstraint )
                    	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:869:3: lv_constraints_9_0= ruleTableConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStatmentAccess().getConstraintsTableConstraintParserRuleCall_0_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleStatment1920);
                    	    lv_constraints_9_0=ruleTableConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStatmentRule());
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleStatment1934); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatmentAccess().getRightParenthesisKeyword_0_8());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:890:6: ( () otherlv_12= 'alter' otherlv_13= 'table' ( (lv_name_14_0= RULE_ID ) ) ( (lv_clause_15_0= ruleAlterTableClause ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:890:6: ( () otherlv_12= 'alter' otherlv_13= 'table' ( (lv_name_14_0= RULE_ID ) ) ( (lv_clause_15_0= ruleAlterTableClause ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:890:7: () otherlv_12= 'alter' otherlv_13= 'table' ( (lv_name_14_0= RULE_ID ) ) ( (lv_clause_15_0= ruleAlterTableClause ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:890:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:891:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStatmentAccess().getAlterTableStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleStatment1963); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatmentAccess().getAlterKeyword_1_1());
                        
                    otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleStatment1975); 

                        	newLeafNode(otherlv_13, grammarAccess.getStatmentAccess().getTableKeyword_1_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:904:1: ( (lv_name_14_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:905:1: (lv_name_14_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:905:1: (lv_name_14_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:906:3: lv_name_14_0= RULE_ID
                    {
                    lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatment1992); 

                    			newLeafNode(lv_name_14_0, grammarAccess.getStatmentAccess().getNameIDTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_14_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:922:2: ( (lv_clause_15_0= ruleAlterTableClause ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:923:1: (lv_clause_15_0= ruleAlterTableClause )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:923:1: (lv_clause_15_0= ruleAlterTableClause )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:924:3: lv_clause_15_0= ruleAlterTableClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatmentAccess().getClauseAlterTableClauseParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlterTableClause_in_ruleStatment2018);
                    lv_clause_15_0=ruleAlterTableClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatmentRule());
                    	        }
                           		set(
                           			current, 
                           			"clause",
                            		lv_clause_15_0, 
                            		"AlterTableClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:941:6: ( () otherlv_17= 'create' otherlv_18= 'view' ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'as' ( (lv_selectStatement_21_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:941:6: ( () otherlv_17= 'create' otherlv_18= 'view' ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'as' ( (lv_selectStatement_21_0= ruleSelectStatement ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:941:7: () otherlv_17= 'create' otherlv_18= 'view' ( (lv_name_19_0= RULE_ID ) ) otherlv_20= 'as' ( (lv_selectStatement_21_0= ruleSelectStatement ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:941:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:942:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStatmentAccess().getCreateViewStatementAction_2_0(),
                                current);
                        

                    }

                    otherlv_17=(Token)match(input,37,FOLLOW_37_in_ruleStatment2047); 

                        	newLeafNode(otherlv_17, grammarAccess.getStatmentAccess().getCreateKeyword_2_1());
                        
                    otherlv_18=(Token)match(input,41,FOLLOW_41_in_ruleStatment2059); 

                        	newLeafNode(otherlv_18, grammarAccess.getStatmentAccess().getViewKeyword_2_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:955:1: ( (lv_name_19_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:956:1: (lv_name_19_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:956:1: (lv_name_19_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:957:3: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatment2076); 

                    			newLeafNode(lv_name_19_0, grammarAccess.getStatmentAccess().getNameIDTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_19_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,42,FOLLOW_42_in_ruleStatment2093); 

                        	newLeafNode(otherlv_20, grammarAccess.getStatmentAccess().getAsKeyword_2_4());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:977:1: ( (lv_selectStatement_21_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:978:1: (lv_selectStatement_21_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:978:1: (lv_selectStatement_21_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:979:3: lv_selectStatement_21_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatmentAccess().getSelectStatementSelectStatementParserRuleCall_2_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleStatment2114);
                    lv_selectStatement_21_0=ruleSelectStatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatmentRule());
                    	        }
                           		set(
                           			current, 
                           			"selectStatement",
                            		lv_selectStatement_21_0, 
                            		"SelectStatement");
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
    // $ANTLR end "ruleStatment"


    // $ANTLR start "entryRuleAlterTableClause"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1005:1: entryRuleAlterTableClause returns [EObject current=null] : iv_ruleAlterTableClause= ruleAlterTableClause EOF ;
    public final EObject entryRuleAlterTableClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1006:2: (iv_ruleAlterTableClause= ruleAlterTableClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1007:2: iv_ruleAlterTableClause= ruleAlterTableClause EOF
            {
             newCompositeNode(grammarAccess.getAlterTableClauseRule()); 
            pushFollow(FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause2153);
            iv_ruleAlterTableClause=ruleAlterTableClause();

            state._fsp--;

             current =iv_ruleAlterTableClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableClause2163); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1014:1: ruleAlterTableClause returns [EObject current=null] : ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) ;
    public final EObject ruleAlterTableClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_columnDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1017:28: ( ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1018:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1018:1: ( ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) ) | ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            else if ( (LA14_0==44) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1018:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1018:2: ( () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1018:3: () otherlv_1= 'rename to' ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1018:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1019:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableRenameClauseAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAlterTableClause2210); 

                        	newLeafNode(otherlv_1, grammarAccess.getAlterTableClauseAccess().getRenameToKeyword_0_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1028:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1029:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1029:1: (lv_name_2_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1030:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableClause2227); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1047:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1047:6: ( () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1047:7: () otherlv_4= 'add column' ( (lv_columnDef_5_0= ruleColumnDef ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1047:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1048:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAlterTableClauseAccess().getAlterTableAddColumnClauseAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleAlterTableClause2261); 

                        	newLeafNode(otherlv_4, grammarAccess.getAlterTableClauseAccess().getAddColumnKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1057:1: ( (lv_columnDef_5_0= ruleColumnDef ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1058:1: (lv_columnDef_5_0= ruleColumnDef )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1058:1: (lv_columnDef_5_0= ruleColumnDef )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1059:3: lv_columnDef_5_0= ruleColumnDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlterTableClauseAccess().getColumnDefColumnDefParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableClause2282);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1083:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1084:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1085:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
             newCompositeNode(grammarAccess.getColumnDefRule()); 
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef2319);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;

             current =iv_ruleColumnDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef2329); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1092:1: ruleColumnDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_constraints_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1095:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1096:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1096:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1096:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleColumnType ) ) ( (lv_constraints_2_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1096:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1097:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1097:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1098:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef2371); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1114:2: ( (lv_type_1_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1115:1: (lv_type_1_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1115:1: (lv_type_1_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1116:3: lv_type_1_0= ruleColumnType
            {
             
            	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef2397);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1132:2: ( (lv_constraints_2_0= ruleColumnConstraint ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45||LA15_0==50||LA15_0==52) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1133:1: (lv_constraints_2_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1133:1: (lv_constraints_2_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1134:3: lv_constraints_2_0= ruleColumnConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef2418);
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
    // $ANTLR end "ruleColumnDef"


    // $ANTLR start "entryRuleColumnConstraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1158:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1159:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1160:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
             newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint2455);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;

             current =iv_ruleColumnConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint2465); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1167:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1170:28: ( ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:1: ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:1: ( ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? ) | ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? ) | ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 50:
                {
                alt19=2;
                }
                break;
            case 52:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:2: ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:2: ( () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:3: () otherlv_1= 'primary' otherlv_2= 'key' ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ( (lv_autoincrement_5_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1171:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1172:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleColumnConstraint2512); 

                        	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleColumnConstraint2524); 

                        	newLeafNode(otherlv_2, grammarAccess.getColumnConstraintAccess().getKeyKeyword_0_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1185:1: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==47) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==48) ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1185:2: ( (lv_asc_3_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1185:2: ( (lv_asc_3_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1186:1: (lv_asc_3_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1186:1: (lv_asc_3_0= 'asc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1187:3: lv_asc_3_0= 'asc'
                            {
                            lv_asc_3_0=(Token)match(input,47,FOLLOW_47_in_ruleColumnConstraint2543); 

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
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1201:6: ( (lv_desc_4_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1201:6: ( (lv_desc_4_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1202:1: (lv_desc_4_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1202:1: (lv_desc_4_0= 'desc' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1203:3: lv_desc_4_0= 'desc'
                            {
                            lv_desc_4_0=(Token)match(input,48,FOLLOW_48_in_ruleColumnConstraint2580); 

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

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1216:4: ( (lv_autoincrement_5_0= 'autoincrement' ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==49) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1217:1: (lv_autoincrement_5_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1217:1: (lv_autoincrement_5_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1218:3: lv_autoincrement_5_0= 'autoincrement'
                            {
                            lv_autoincrement_5_0=(Token)match(input,49,FOLLOW_49_in_ruleColumnConstraint2613); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1232:6: ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1232:6: ( () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1232:7: () otherlv_7= 'not' otherlv_8= 'null' ( (lv_conflictClause_9_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1232:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1233:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleColumnConstraint2656); 

                        	newLeafNode(otherlv_7, grammarAccess.getColumnConstraintAccess().getNotKeyword_1_1());
                        
                    otherlv_8=(Token)match(input,51,FOLLOW_51_in_ruleColumnConstraint2668); 

                        	newLeafNode(otherlv_8, grammarAccess.getColumnConstraintAccess().getNullKeyword_1_2());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1246:1: ( (lv_conflictClause_9_0= ruleConflictClause ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==64) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1247:1: (lv_conflictClause_9_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1247:1: (lv_conflictClause_9_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1248:3: lv_conflictClause_9_0= ruleConflictClause
                            {
                             
                            	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint2689);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1265:6: ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1265:6: ( () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1265:7: () otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1265:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1266:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_2_0(),
                                current);
                        

                    }

                    otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleColumnConstraint2719); 

                        	newLeafNode(otherlv_11, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1275:1: ( (lv_defaultValue_12_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1276:1: (lv_defaultValue_12_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1276:1: (lv_defaultValue_12_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1277:3: lv_defaultValue_12_0= ruleDefaultValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint2740);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1301:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1302:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1303:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
             newCompositeNode(grammarAccess.getDefaultValueRule()); 
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue2777);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;

             current =iv_ruleDefaultValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue2787); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1310:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleOr ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1313:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleOr ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1314:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleOr ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1314:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleOr ) ) otherlv_5= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_NUMBER)||LA20_0==51||(LA20_0>=68 && LA20_0<=71)) ) {
                alt20=1;
            }
            else if ( (LA20_0==20) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1314:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1314:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1314:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1314:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1315:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1320:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1321:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1321:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1322:3: lv_literal_1_0= ruleLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue2843);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1339:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleOr ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1339:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleOr ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1339:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleOr ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1339:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1340:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleDefaultValue2872); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1349:1: ( (lv_expression_4_0= ruleOr ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1350:1: (lv_expression_4_0= ruleOr )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1350:1: (lv_expression_4_0= ruleOr )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1351:3: lv_expression_4_0= ruleOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionOrParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOr_in_ruleDefaultValue2893);
                    lv_expression_4_0=ruleOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_4_0, 
                            		"Or");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleDefaultValue2905); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1379:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1380:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1381:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
             newCompositeNode(grammarAccess.getTableConstraintRule()); 
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint2942);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;

             current =iv_ruleTableConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint2952); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1388:1: ruleTableConstraint returns [EObject current=null] : this_UniqueTableContraint_0= ruleUniqueTableContraint ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableContraint_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1391:28: (this_UniqueTableContraint_0= ruleUniqueTableContraint )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1393:5: this_UniqueTableContraint_0= ruleUniqueTableContraint
            {
             
                    newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableContraintParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUniqueTableContraint_in_ruleTableConstraint2998);
            this_UniqueTableContraint_0=ruleUniqueTableContraint();

            state._fsp--;

             
                    current = this_UniqueTableContraint_0; 
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
    // $ANTLR end "ruleTableConstraint"


    // $ANTLR start "entryRuleUniqueTableContraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1409:1: entryRuleUniqueTableContraint returns [EObject current=null] : iv_ruleUniqueTableContraint= ruleUniqueTableContraint EOF ;
    public final EObject entryRuleUniqueTableContraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableContraint = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1410:2: (iv_ruleUniqueTableContraint= ruleUniqueTableContraint EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1411:2: iv_ruleUniqueTableContraint= ruleUniqueTableContraint EOF
            {
             newCompositeNode(grammarAccess.getUniqueTableContraintRule()); 
            pushFollow(FOLLOW_ruleUniqueTableContraint_in_entryRuleUniqueTableContraint3032);
            iv_ruleUniqueTableContraint=ruleUniqueTableContraint();

            state._fsp--;

             current =iv_ruleUniqueTableContraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableContraint3042); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniqueTableContraint"


    // $ANTLR start "ruleUniqueTableContraint"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1418:1: ruleUniqueTableContraint returns [EObject current=null] : (otherlv_0= 'unique' otherlv_1= '(' ( (lv_columns_2_0= ruleIndexedColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleIndexedColumn ) ) )* otherlv_5= ')' ( (lv_conflictClause_6_0= ruleConflictClause ) ) ) ;
    public final EObject ruleUniqueTableContraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;

        EObject lv_conflictClause_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1421:28: ( (otherlv_0= 'unique' otherlv_1= '(' ( (lv_columns_2_0= ruleIndexedColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleIndexedColumn ) ) )* otherlv_5= ')' ( (lv_conflictClause_6_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1422:1: (otherlv_0= 'unique' otherlv_1= '(' ( (lv_columns_2_0= ruleIndexedColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleIndexedColumn ) ) )* otherlv_5= ')' ( (lv_conflictClause_6_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1422:1: (otherlv_0= 'unique' otherlv_1= '(' ( (lv_columns_2_0= ruleIndexedColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleIndexedColumn ) ) )* otherlv_5= ')' ( (lv_conflictClause_6_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1422:3: otherlv_0= 'unique' otherlv_1= '(' ( (lv_columns_2_0= ruleIndexedColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleIndexedColumn ) ) )* otherlv_5= ')' ( (lv_conflictClause_6_0= ruleConflictClause ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleUniqueTableContraint3079); 

                	newLeafNode(otherlv_0, grammarAccess.getUniqueTableContraintAccess().getUniqueKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleUniqueTableContraint3091); 

                	newLeafNode(otherlv_1, grammarAccess.getUniqueTableContraintAccess().getLeftParenthesisKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1430:1: ( (lv_columns_2_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1431:1: (lv_columns_2_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1431:1: (lv_columns_2_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1432:3: lv_columns_2_0= ruleIndexedColumn
            {
             
            	        newCompositeNode(grammarAccess.getUniqueTableContraintAccess().getColumnsIndexedColumnParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableContraint3112);
            lv_columns_2_0=ruleIndexedColumn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniqueTableContraintRule());
            	        }
                   		add(
                   			current, 
                   			"columns",
                    		lv_columns_2_0, 
                    		"IndexedColumn");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1448:2: (otherlv_3= ',' ( (lv_columns_4_0= ruleIndexedColumn ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1448:4: otherlv_3= ',' ( (lv_columns_4_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleUniqueTableContraint3125); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUniqueTableContraintAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1452:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1453:1: (lv_columns_4_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1453:1: (lv_columns_4_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1454:3: lv_columns_4_0= ruleIndexedColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUniqueTableContraintAccess().getColumnsIndexedColumnParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableContraint3146);
            	    lv_columns_4_0=ruleIndexedColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUniqueTableContraintRule());
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
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleUniqueTableContraint3160); 

                	newLeafNode(otherlv_5, grammarAccess.getUniqueTableContraintAccess().getRightParenthesisKeyword_4());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1474:1: ( (lv_conflictClause_6_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1475:1: (lv_conflictClause_6_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1475:1: (lv_conflictClause_6_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1476:3: lv_conflictClause_6_0= ruleConflictClause
            {
             
            	        newCompositeNode(grammarAccess.getUniqueTableContraintAccess().getConflictClauseConflictClauseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableContraint3181);
            lv_conflictClause_6_0=ruleConflictClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniqueTableContraintRule());
            	        }
                   		set(
                   			current, 
                   			"conflictClause",
                    		lv_conflictClause_6_0, 
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
    // $ANTLR end "ruleUniqueTableContraint"


    // $ANTLR start "entryRuleIndexedColumn"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1500:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1501:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1502:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
             newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn3217);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;

             current =iv_ruleIndexedColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn3227); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1509:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1512:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1513:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1513:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1513:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1513:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1514:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1514:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1515:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexedColumnRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn3272); 

            		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getNameColumnDefCrossReference_0_0()); 
            	

            }


            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1526:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            else if ( (LA22_0==48) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1526:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1526:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1527:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1527:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1528:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,47,FOLLOW_47_in_ruleIndexedColumn3291); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1542:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1542:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1543:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1543:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1544:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,48,FOLLOW_48_in_ruleIndexedColumn3328); 

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


    // $ANTLR start "entryRuleSelectStatement"
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1565:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1566:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1567:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement3379);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement3389); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1574:1: ruleSelectStatement returns [EObject current=null] : ( (lv_core_0_0= ruleSelectCore ) ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_core_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1577:28: ( ( (lv_core_0_0= ruleSelectCore ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1578:1: ( (lv_core_0_0= ruleSelectCore ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1578:1: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1579:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1579:1: (lv_core_0_0= ruleSelectCore )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1580:3: lv_core_0_0= ruleSelectCore
            {
             
            	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement3434);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1604:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1605:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1606:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
             newCompositeNode(grammarAccess.getSelectCoreRule()); 
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore3469);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;

             current =iv_ruleSelectCore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore3479); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1613:1: ruleSelectCore returns [EObject current=null] : (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_distinct_1_0=null;
        Token lv_all_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_resultColumns_3_0 = null;

        EObject lv_resultColumns_5_0 = null;

        EObject lv_source_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1616:28: ( (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1617:1: (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1617:1: (otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1617:3: otherlv_0= 'select' ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )? ( (lv_resultColumns_3_0= ruleResultColumn ) ) (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )* (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleSelectCore3516); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectCoreAccess().getSelectKeyword_0());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1621:1: ( ( (lv_distinct_1_0= 'distinct' ) ) | ( (lv_all_2_0= 'all' ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            else if ( (LA23_0==56) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1621:2: ( (lv_distinct_1_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1621:2: ( (lv_distinct_1_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1622:1: (lv_distinct_1_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1622:1: (lv_distinct_1_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1623:3: lv_distinct_1_0= 'distinct'
                    {
                    lv_distinct_1_0=(Token)match(input,55,FOLLOW_55_in_ruleSelectCore3535); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1637:6: ( (lv_all_2_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1637:6: ( (lv_all_2_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1638:1: (lv_all_2_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1638:1: (lv_all_2_0= 'all' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1639:3: lv_all_2_0= 'all'
                    {
                    lv_all_2_0=(Token)match(input,56,FOLLOW_56_in_ruleSelectCore3572); 

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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1652:4: ( (lv_resultColumns_3_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1653:1: (lv_resultColumns_3_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1653:1: (lv_resultColumns_3_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1654:3: lv_resultColumns_3_0= ruleResultColumn
            {
             
            	        newCompositeNode(grammarAccess.getSelectCoreAccess().getResultColumnsResultColumnParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectCore3608);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1670:2: (otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1670:4: otherlv_4= ',' ( (lv_resultColumns_5_0= ruleResultColumn ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleSelectCore3621); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSelectCoreAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1674:1: ( (lv_resultColumns_5_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1675:1: (lv_resultColumns_5_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1675:1: (lv_resultColumns_5_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1676:3: lv_resultColumns_5_0= ruleResultColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getResultColumnsResultColumnParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectCore3642);
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
            	    break loop24;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1692:4: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==57) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1692:6: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleSelectCore3657); 

                        	newLeafNode(otherlv_6, grammarAccess.getSelectCoreAccess().getFromKeyword_4_0());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1696:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1697:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1697:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1698:3: lv_source_7_0= ruleJoinSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectCoreAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectCore3678);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1722:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1723:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1724:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
             newCompositeNode(grammarAccess.getJoinSourceRule()); 
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource3716);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;

             current =iv_ruleJoinSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource3726); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1731:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1734:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1735:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1735:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1735:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1735:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1736:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1736:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1737:3: lv_source_0_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource3772);
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

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1753:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=58 && LA26_0<=59)||(LA26_0>=61 && LA26_0<=63)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1754:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1754:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1755:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource3793);
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
            	    break loop26;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1779:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1780:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1781:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
             newCompositeNode(grammarAccess.getSingleSourceRule()); 
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource3830);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;

             current =iv_ruleSingleSource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource3840); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1788:1: ruleSingleSource returns [EObject current=null] : ( ( () ( (lv_tableName_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' ) | ( () otherlv_9= '(' ( (lv_joinSource_10_0= ruleJoinSource ) ) otherlv_11= ')' ) ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        Token lv_tableName_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_selectStatement_6_0 = null;

        EObject lv_joinSource_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1791:28: ( ( ( () ( (lv_tableName_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' ) | ( () otherlv_9= '(' ( (lv_joinSource_10_0= ruleJoinSource ) ) otherlv_11= ')' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1792:1: ( ( () ( (lv_tableName_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' ) | ( () otherlv_9= '(' ( (lv_joinSource_10_0= ruleJoinSource ) ) otherlv_11= ')' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1792:1: ( ( () ( (lv_tableName_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) | ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' ) | ( () otherlv_9= '(' ( (lv_joinSource_10_0= ruleJoinSource ) ) otherlv_11= ')' ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==20) ) {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==54) ) {
                    alt28=2;
                }
                else if ( (LA28_2==RULE_ID||LA28_2==20) ) {
                    alt28=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1792:2: ( () ( (lv_tableName_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1792:2: ( () ( (lv_tableName_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1792:3: () ( (lv_tableName_1_0= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1792:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1793:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceTableAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1798:2: ( (lv_tableName_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1799:1: (lv_tableName_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1799:1: (lv_tableName_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1800:3: lv_tableName_1_0= RULE_ID
                    {
                    lv_tableName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSource3892); 

                    			newLeafNode(lv_tableName_1_0, grammarAccess.getSingleSourceAccess().getTableNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleSourceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tableName",
                            		lv_tableName_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1816:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==42) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1816:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSingleSource3910); 

                                	newLeafNode(otherlv_2, grammarAccess.getSingleSourceAccess().getAsKeyword_0_2_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1820:1: ( (lv_name_3_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1821:1: (lv_name_3_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1821:1: (lv_name_3_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1822:3: lv_name_3_0= RULE_ID
                            {
                            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSource3927); 

                            			newLeafNode(lv_name_3_0, grammarAccess.getSingleSourceAccess().getNameIDTerminalRuleCall_0_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSingleSourceRule());
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
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1839:6: ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1839:6: ( () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1839:7: () otherlv_5= '(' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) otherlv_7= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1839:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1840:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSingleSource3963); 

                        	newLeafNode(otherlv_5, grammarAccess.getSingleSourceAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1849:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1850:1: (lv_selectStatement_6_0= ruleSelectStatement )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1850:1: (lv_selectStatement_6_0= ruleSelectStatement )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1851:3: lv_selectStatement_6_0= ruleSelectStatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleSourceAccess().getSelectStatementSelectStatementParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSource3984);
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

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleSingleSource3996); 

                        	newLeafNode(otherlv_7, grammarAccess.getSingleSourceAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1872:6: ( () otherlv_9= '(' ( (lv_joinSource_10_0= ruleJoinSource ) ) otherlv_11= ')' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1872:6: ( () otherlv_9= '(' ( (lv_joinSource_10_0= ruleJoinSource ) ) otherlv_11= ')' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1872:7: () otherlv_9= '(' ( (lv_joinSource_10_0= ruleJoinSource ) ) otherlv_11= ')'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1872:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1873:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSingleSourceAccess().getSingleSourceJoinAction_2_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSingleSource4025); 

                        	newLeafNode(otherlv_9, grammarAccess.getSingleSourceAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1882:1: ( (lv_joinSource_10_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1883:1: (lv_joinSource_10_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1883:1: (lv_joinSource_10_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1884:3: lv_joinSource_10_0= ruleJoinSource
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleSourceAccess().getJoinSourceJoinSourceParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSource4046);
                    lv_joinSource_10_0=ruleJoinSource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"joinSource",
                            		lv_joinSource_10_0, 
                            		"JoinSource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleSingleSource4058); 

                        	newLeafNode(otherlv_11, grammarAccess.getSingleSourceAccess().getRightParenthesisKeyword_2_3());
                        

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1912:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1913:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1914:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
             newCompositeNode(grammarAccess.getJoinStatementRule()); 
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement4095);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;

             current =iv_ruleJoinStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement4105); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1921:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleOr ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1924:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleOr ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1925:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleOr ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1925:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleOr ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1925:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleOr ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1925:2: ()
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1926:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                        current);
                

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1931:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1932:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1932:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1933:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,58,FOLLOW_58_in_ruleJoinStatement4157); 

                            newLeafNode(lv_natural_1_0, grammarAccess.getJoinStatementAccess().getNaturalNaturalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "natural", true, "natural");
                    	    

                    }


                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1946:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt31=4;
            switch ( input.LA(1) ) {
                case 59:
                    {
                    alt31=1;
                    }
                    break;
                case 61:
                    {
                    alt31=2;
                    }
                    break;
                case 62:
                    {
                    alt31=3;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1946:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1946:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1946:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1946:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1947:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1947:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1948:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,59,FOLLOW_59_in_ruleJoinStatement4191); 

                            newLeafNode(lv_left_2_0, grammarAccess.getJoinStatementAccess().getLeftLeftKeyword_2_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinStatementRule());
                    	        }
                           		setWithLastConsumed(current, "left", true, "left");
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1961:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==60) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1962:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1962:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1963:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,60,FOLLOW_60_in_ruleJoinStatement4222); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1977:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1977:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1978:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1978:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1979:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,61,FOLLOW_61_in_ruleJoinStatement4261); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1993:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1993:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1994:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1994:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:1995:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,62,FOLLOW_62_in_ruleJoinStatement4298); 

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

            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleJoinStatement4325); 

                	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2012:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2013:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2013:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2014:3: lv_singleSource_7_0= ruleSingleSource
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement4346);
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

            otherlv_8=(Token)match(input,64,FOLLOW_64_in_ruleJoinStatement4358); 

                	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2034:1: ( (lv_expression_9_0= ruleOr ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2035:1: (lv_expression_9_0= ruleOr )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2035:1: (lv_expression_9_0= ruleOr )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2036:3: lv_expression_9_0= ruleOr
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionOrParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleOr_in_ruleJoinStatement4379);
            lv_expression_9_0=ruleOr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_9_0, 
                    		"Or");
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2060:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2061:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2062:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
             newCompositeNode(grammarAccess.getResultColumnRule()); 
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn4415);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;

             current =iv_ruleResultColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn4425); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2069:1: ruleResultColumn returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () ( (lv_tableRef_3_0= RULE_ID ) ) otherlv_4= '.' otherlv_5= '*' ) | ( () ( (lv_expression_7_0= ruleOr ) ) (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )? ) ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_tableRef_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        EObject lv_expression_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2072:28: ( ( ( () otherlv_1= '*' ) | ( () ( (lv_tableRef_3_0= RULE_ID ) ) otherlv_4= '.' otherlv_5= '*' ) | ( () ( (lv_expression_7_0= ruleOr ) ) (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )? ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2073:1: ( ( () otherlv_1= '*' ) | ( () ( (lv_tableRef_3_0= RULE_ID ) ) otherlv_4= '.' otherlv_5= '*' ) | ( () ( (lv_expression_7_0= ruleOr ) ) (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )? ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2073:1: ( ( () otherlv_1= '*' ) | ( () ( (lv_tableRef_3_0= RULE_ID ) ) otherlv_4= '.' otherlv_5= '*' ) | ( () ( (lv_expression_7_0= ruleOr ) ) (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )? ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt33=1;
                }
                break;
            case RULE_ID:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==66) ) {
                    int LA33_4 = input.LA(3);

                    if ( (LA33_4==65) ) {
                        alt33=2;
                    }
                    else if ( (LA33_4==RULE_ID) ) {
                        alt33=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA33_2==EOF||(LA33_2>=17 && LA33_2<=19)||(LA33_2>=21 && LA33_2<=36)||LA33_2==39||LA33_2==42||LA33_2==57) ) {
                    alt33=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 20:
            case 51:
            case 68:
            case 69:
            case 70:
            case 71:
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2073:2: ( () otherlv_1= '*' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2073:2: ( () otherlv_1= '*' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2073:3: () otherlv_1= '*'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2073:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2074:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getResultColumnAccess().getResultColumnAllAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleResultColumn4472); 

                        	newLeafNode(otherlv_1, grammarAccess.getResultColumnAccess().getAsteriskKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2084:6: ( () ( (lv_tableRef_3_0= RULE_ID ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2084:6: ( () ( (lv_tableRef_3_0= RULE_ID ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2084:7: () ( (lv_tableRef_3_0= RULE_ID ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2084:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2085:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getResultColumnAccess().getResultColumnAllWithTableRefAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2090:2: ( (lv_tableRef_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2091:1: (lv_tableRef_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2091:1: (lv_tableRef_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2092:3: lv_tableRef_3_0= RULE_ID
                    {
                    lv_tableRef_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn4506); 

                    			newLeafNode(lv_tableRef_3_0, grammarAccess.getResultColumnAccess().getTableRefIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResultColumnRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tableRef",
                            		lv_tableRef_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,66,FOLLOW_66_in_ruleResultColumn4523); 

                        	newLeafNode(otherlv_4, grammarAccess.getResultColumnAccess().getFullStopKeyword_1_2());
                        
                    otherlv_5=(Token)match(input,65,FOLLOW_65_in_ruleResultColumn4535); 

                        	newLeafNode(otherlv_5, grammarAccess.getResultColumnAccess().getAsteriskKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2117:6: ( () ( (lv_expression_7_0= ruleOr ) ) (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2117:6: ( () ( (lv_expression_7_0= ruleOr ) ) (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )? )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2117:7: () ( (lv_expression_7_0= ruleOr ) ) (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )?
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2117:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2118:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getResultColumnAccess().getResultColumnExpressionAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2123:2: ( (lv_expression_7_0= ruleOr ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2124:1: (lv_expression_7_0= ruleOr )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2124:1: (lv_expression_7_0= ruleOr )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2125:3: lv_expression_7_0= ruleOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionOrParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOr_in_ruleResultColumn4573);
                    lv_expression_7_0=ruleOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResultColumnRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_7_0, 
                            		"Or");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2141:2: (otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==42) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2141:4: otherlv_8= 'as' ( (lv_name_9_0= RULE_ID ) )
                            {
                            otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleResultColumn4586); 

                                	newLeafNode(otherlv_8, grammarAccess.getResultColumnAccess().getAsKeyword_2_2_0());
                                
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2145:1: ( (lv_name_9_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2146:1: (lv_name_9_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2146:1: (lv_name_9_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2147:3: lv_name_9_0= RULE_ID
                            {
                            lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn4603); 

                            			newLeafNode(lv_name_9_0, grammarAccess.getResultColumnAccess().getNameIDTerminalRuleCall_2_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getResultColumnRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_9_0, 
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2171:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2172:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2173:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
             newCompositeNode(grammarAccess.getConflictClauseRule()); 
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause4647);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;

             current =iv_ruleConflictClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause4657); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2180:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2183:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2184:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2184:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2184:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleConflictClause4694); 

                	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                
            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleConflictClause4706); 

                	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2192:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2193:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2193:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2194:3: lv_resolution_2_0= ruleConflictResolution
            {
             
            	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause4727);
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2218:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2219:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2220:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4763);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;

             current =iv_ruleLiteralValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue4773); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2227:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2230:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2231:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2231:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 71:
                {
                alt34=1;
                }
                break;
            case RULE_STRING:
                {
                alt34=2;
                }
                break;
            case 51:
                {
                alt34=3;
                }
                break;
            case 68:
                {
                alt34=4;
                }
                break;
            case 69:
                {
                alt34=5;
                }
                break;
            case 70:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2231:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2231:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2231:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2231:3: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2232:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2237:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2238:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2238:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2239:3: lv_number_1_0= ruleSignedNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue4829);
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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2256:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2256:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2256:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2256:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2257:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2262:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2263:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2263:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2264:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue4863); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2281:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2281:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2281:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2281:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2282:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2287:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2288:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2288:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2289:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,51,FOLLOW_51_in_ruleLiteralValue4903); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2303:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2303:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2303:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2303:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2304:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2309:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2310:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2310:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2311:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,68,FOLLOW_68_in_ruleLiteralValue4951); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2325:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2325:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2325:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2325:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2326:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2331:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2332:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2332:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2333:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,69,FOLLOW_69_in_ruleLiteralValue4999); 

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
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2347:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2347:6: ( () ( (lv_literal_11_0= 'current_time_stamp' ) ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2347:7: () ( (lv_literal_11_0= 'current_time_stamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2347:7: ()
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2348:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                current);
                        

                    }

                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2353:2: ( (lv_literal_11_0= 'current_time_stamp' ) )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2354:1: (lv_literal_11_0= 'current_time_stamp' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2354:1: (lv_literal_11_0= 'current_time_stamp' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2355:3: lv_literal_11_0= 'current_time_stamp'
                    {
                    lv_literal_11_0=(Token)match(input,70,FOLLOW_70_in_ruleLiteralValue5047); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2376:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2377:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2378:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
             newCompositeNode(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber5098);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;

             current =iv_ruleSignedNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber5109); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2385:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2388:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2389:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2389:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2389:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2389:2: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==71) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2390:2: kw= '-'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleSignedNumber5148); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber5165); 

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2410:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2411:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2412:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN5211);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN5222); 

            }

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2419:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2422:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2423:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2423:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2423:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5262); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2430:1: (kw= '.' this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==66) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2431:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,66,FOLLOW_66_in_ruleFQN5281); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN5296); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2451:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2453:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2454:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2454:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt37=1;
                }
                break;
            case 73:
                {
                alt37=2;
                }
                break;
            case 74:
                {
                alt37=3;
                }
                break;
            case 75:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2454:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2454:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2454:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleColumnType5357); 

                            current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2460:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2460:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2460:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleColumnType5374); 

                            current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2466:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2466:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2466:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_74_in_ruleColumnType5391); 

                            current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2472:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2472:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2472:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_75_in_ruleColumnType5408); 

                            current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                        

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
    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2482:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2484:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2485:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2485:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt38=1;
                }
                break;
            case 77:
                {
                alt38=2;
                }
                break;
            case 78:
                {
                alt38=3;
                }
                break;
            case 79:
                {
                alt38=4;
                }
                break;
            case 80:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2485:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2485:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2485:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleConflictResolution5453); 

                            current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2491:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2491:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2491:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_77_in_ruleConflictResolution5470); 

                            current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2497:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2497:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2497:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_78_in_ruleConflictResolution5487); 

                            current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2503:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2503:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2503:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_79_in_ruleConflictResolution5504); 

                            current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2509:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2509:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.sqlite/src-gen/com/robotoworks/mechanoid/sqlite/parser/antlr/internal/InternalSqliteModel.g:2509:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_80_in_ruleConflictResolution5521); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleDatabaseBlock_in_ruleModel164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabaseBlock_in_entryRuleDatabaseBlock200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabaseBlock210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDatabaseBlock247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabaseBlock264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDatabaseBlock281 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleDatabaseBlock302 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDatabaseBlock315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMigrationBlock407 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock419 = new BitSet(new long[]{0x0000012000008000L});
    public static final BitSet FOLLOW_ruleStatment_in_ruleMigrationBlock441 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationBlock453 = new BitSet(new long[]{0x0000012000008000L});
    public static final BitSet FOLLOW_ruleStatment_in_ruleMigrationBlock475 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationBlock487 = new BitSet(new long[]{0x0000012000008000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr596 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleOr617 = new BitSet(new long[]{0x0008000000100070L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr638 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryComparison_in_ruleAnd733 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAnd754 = new BitSet(new long[]{0x0008000000100070L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryComparison_in_ruleAnd775 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulePrimaryComparison_in_entryRulePrimaryComparison813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryComparison823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecondaryComparison_in_rulePrimaryComparison870 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleSecondaryComparisonOp_in_rulePrimaryComparison900 = new BitSet(new long[]{0x0008000000100070L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleSecondaryComparison_in_rulePrimaryComparison921 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleSecondaryComparison_in_entryRuleSecondaryComparison959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecondaryComparison969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleSecondaryComparison1016 = new BitSet(new long[]{0x00000001FFC00002L});
    public static final BitSet FOLLOW_rulePrimaryComparisonOp_in_ruleSecondaryComparison1046 = new BitSet(new long[]{0x0008000000100070L,0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleSecondaryComparison1067 = new BitSet(new long[]{0x00000001FFC00002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePrimaryExpression1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimaryExpression1229 = new BitSet(new long[]{0x0008000000100070L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleOr_in_rulePrimaryExpression1251 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryComparisonOp_in_entryRulePrimaryComparisonOp1300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryComparisonOp1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimaryComparisonOp1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimaryComparisonOp1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimaryComparisonOp1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrimaryComparisonOp1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimaryComparisonOp1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrimaryComparisonOp1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrimaryComparisonOp1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimaryComparisonOp1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimaryComparisonOp1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrimaryComparisonOp1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrimaryComparisonOp1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecondaryComparisonOp_in_entryRuleSecondaryComparisonOp1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecondaryComparisonOp1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSecondaryComparisonOp1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSecondaryComparisonOp1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSecondaryComparisonOp1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSecondaryComparisonOp1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatment_in_entryRuleStatment1726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatment1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStatment1783 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStatment1795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatment1812 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatment1829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleStatment1850 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_ruleStatment1863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleStatment1884 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_ruleStatment1899 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleStatment1920 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_21_in_ruleStatment1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleStatment1963 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStatment1975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatment1992 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_ruleStatment2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStatment2047 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleStatment2059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatment2076 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleStatment2093 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleStatment2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableClause_in_entryRuleAlterTableClause2153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableClause2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAlterTableClause2210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableClause2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAlterTableClause2261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableClause2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef2371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef2397 = new BitSet(new long[]{0x0014200000000002L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef2418 = new BitSet(new long[]{0x0014200000000002L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleColumnConstraint2512 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleColumnConstraint2524 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_47_in_ruleColumnConstraint2543 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_48_in_ruleColumnConstraint2580 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleColumnConstraint2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleColumnConstraint2656 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleColumnConstraint2668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleColumnConstraint2719 = new BitSet(new long[]{0x0008000000100060L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue2777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefaultValue2872 = new BitSet(new long[]{0x0008000000100070L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleDefaultValue2893 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDefaultValue2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableContraint_in_ruleTableConstraint2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableContraint_in_entryRuleUniqueTableContraint3032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableContraint3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUniqueTableContraint3079 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUniqueTableContraint3091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableContraint3112 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_ruleUniqueTableContraint3125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableContraint3146 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_21_in_ruleUniqueTableContraint3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableContraint3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn3217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn3272 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_ruleIndexedColumn3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleIndexedColumn3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement3379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore3469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSelectCore3516 = new BitSet(new long[]{0x0188000000100070L,0x00000000000000F2L});
    public static final BitSet FOLLOW_55_in_ruleSelectCore3535 = new BitSet(new long[]{0x0188000000100070L,0x00000000000000F2L});
    public static final BitSet FOLLOW_56_in_ruleSelectCore3572 = new BitSet(new long[]{0x0188000000100070L,0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectCore3608 = new BitSet(new long[]{0x0200008000000002L});
    public static final BitSet FOLLOW_39_in_ruleSelectCore3621 = new BitSet(new long[]{0x0188000000100070L,0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectCore3642 = new BitSet(new long[]{0x0200008000000002L});
    public static final BitSet FOLLOW_57_in_ruleSelectCore3657 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectCore3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource3716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource3772 = new BitSet(new long[]{0xEC00000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource3793 = new BitSet(new long[]{0xEC00000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource3830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSource3892 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleSingleSource3910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSource3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSingleSource3963 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSource3984 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSingleSource3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSingleSource4025 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSource4046 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSingleSource4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement4095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleJoinStatement4157 = new BitSet(new long[]{0xE800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleJoinStatement4191 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleJoinStatement4222 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleJoinStatement4261 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleJoinStatement4298 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleJoinStatement4325 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement4346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleJoinStatement4358 = new BitSet(new long[]{0x0008000000100070L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleJoinStatement4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn4415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResultColumn4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn4506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleResultColumn4523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResultColumn4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleResultColumn4573 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleResultColumn4586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause4647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleConflictClause4694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleConflictClause4706 = new BitSet(new long[]{0x0000000000000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue4763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLiteralValue4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLiteralValue4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLiteralValue4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLiteralValue5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber5098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSignedNumber5148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN5211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleFQN5281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN5296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_72_in_ruleColumnType5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleColumnType5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleColumnType5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleColumnType5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleConflictResolution5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleConflictResolution5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleConflictResolution5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleConflictResolution5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleConflictResolution5521 = new BitSet(new long[]{0x0000000000000002L});

}