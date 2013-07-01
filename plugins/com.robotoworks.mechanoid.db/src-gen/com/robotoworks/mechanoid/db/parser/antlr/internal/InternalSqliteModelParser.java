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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'database'", "'{'", "'}'", "'config'", "'action'", "'/'", "':'", "'#'", "'*'", "'migration'", "';'", "'||'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'like'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'('", "')'", "'not'", "'exists'", "'case'", "'else'", "'end'", "','", "'cast'", "'as'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'from'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'on'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'primary key'", "'autoincrement'", "'unique'", "'default'", "'constraint'", "'check'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
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
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
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

                if ( (LA7_0==91||LA7_0==104||LA7_0==107) ) {
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

                    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_NUMBER)||LA28_0==27||(LA28_0>=53 && LA28_0<=54)||LA28_0==56||(LA28_0>=58 && LA28_0<=60)||LA28_0==64||(LA28_0>=87 && LA28_0<=90)) ) {
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
                    else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_NUMBER)||LA32_0==27||(LA32_0>=53 && LA32_0<=54)||LA32_0==56||(LA32_0>=58 && LA32_0<=60)||LA32_0==64||(LA32_0>=87 && LA32_0<=90)) ) {
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2085:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2088:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2089:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2089:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2089:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2129:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2129:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleSelectStatement4598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2133:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2134:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2134:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2135:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement4619);
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2151:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==63||LA36_0==70) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2151:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2151:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==70) ) {
                                alt35=1;
                            }
                            else if ( (LA35_0==63) ) {
                                alt35=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 35, 0, input);

                                throw nvae;
                            }
                            switch (alt35) {
                                case 1 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2151:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleSelectStatement4633); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2156:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleSelectStatement4651); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2160:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2161:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2161:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2162:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement4673);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2186:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2187:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2188:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList4713);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList4723); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2195:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2198:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2199:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2200:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2200:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2201:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4769);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2217:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==63) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2217:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleOrderingTermList4782); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2221:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2222:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2222:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2223:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4803);
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
            	    break loop38;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2247:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2248:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2249:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore4841);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore4851); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2256:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2259:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2260:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2260:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2261:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4898);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2269:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=120 && LA39_0<=123)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2269:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2269:2: ()
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2270:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2275:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2276:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2276:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2277:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore4928);
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

            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2293:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2294:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2294:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2295:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore4949);
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
            	    break loop39;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2319:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2320:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2321:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4987);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression4997); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2328:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2331:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2332:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2332:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2332:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2332:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2333:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSelectExpression5043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2342:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==72) ) {
                alt40=1;
            }
            else if ( (LA40_0==73) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2342:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2342:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2343:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2343:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2344:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,72,FOLLOW_72_in_ruleSelectExpression5062); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2358:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2358:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2359:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2359:1: (lv_all_3_0= 'all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2360:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,73,FOLLOW_73_in_ruleSelectExpression5099); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2373:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_NUMBER)||LA41_0==27||(LA41_0>=53 && LA41_0<=54)||LA41_0==56||(LA41_0>=58 && LA41_0<=60)||LA41_0==64||(LA41_0>=87 && LA41_0<=90)) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2373:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2373:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2374:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2374:1: (lv_allColumns_4_0= '*' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2375:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,21,FOLLOW_21_in_ruleSelectExpression5133); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2389:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2389:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2390:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2390:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2391:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression5173);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2407:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==74) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2407:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleSelectExpression5187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2411:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2412:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2412:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2413:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression5208);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2429:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==75) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2429:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_75_in_ruleSelectExpression5223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2433:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2434:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2434:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2435:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5244);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2451:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==76) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2451:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression5259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2455:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2456:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2456:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2457:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5280);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2473:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==77) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2473:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression5295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2477:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2478:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2478:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2479:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5316);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2503:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2504:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2505:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList5354);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList5364); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2512:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2515:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2516:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2517:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2517:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2518:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5410);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2534:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==63) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2534:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleSelectList5423); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2538:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2539:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2539:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2540:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList5444);
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
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRuleWhereExpressions"
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2564:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2565:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2566:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5482);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions5492); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2573:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2576:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2577:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2577:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2578:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2578:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2579:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5537);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2603:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2604:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2605:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5572);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions5582); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2612:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2615:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2616:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2616:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2616:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2616:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2617:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2617:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2618:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5628);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2634:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==63) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2634:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleGroupByExpressions5641); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2638:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2639:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2639:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2640:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5662);
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
            	    break loop47;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2664:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2665:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2666:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5700);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions5710); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2673:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2676:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2677:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2677:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2678:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2678:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2679:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions5755);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2703:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2704:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2705:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm5790);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm5800); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2712:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2715:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2716:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2716:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2716:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2716:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2717:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2717:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2718:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm5846);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2734:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            else if ( (LA48_0==79) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2734:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2734:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2735:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2735:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2736:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,78,FOLLOW_78_in_ruleOrderingTerm5865); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2750:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2750:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2751:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2751:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2752:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,79,FOLLOW_79_in_ruleOrderingTerm5902); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2773:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2774:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2775:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource5953);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource5963); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2782:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2785:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2786:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2786:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2786:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2786:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2787:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2787:1: (lv_source_0_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2788:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6009);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2804:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=80 && LA49_0<=81)||(LA49_0>=83 && LA49_0<=85)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2805:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2805:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2806:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource6030);
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
            	    break loop49;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2830:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2831:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2832:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource6067);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource6077); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2839:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2842:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2843:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2843:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( (LA50_0==56) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==RULE_ID||LA50_2==56) ) {
                    alt50=3;
                }
                else if ( (LA50_2==71) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2844:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6124);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2854:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6151);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2864:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6178);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2880:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2881:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2882:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6213);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable6223); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2889:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2892:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2893:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2893:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2893:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2893:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2894:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2899:2: ( (otherlv_1= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2900:1: (otherlv_1= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2900:1: (otherlv_1= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2901:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2912:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==65) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2912:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleSingleSourceTable6290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2916:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2917:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2917:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2918:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable6307); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2942:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2943:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2944:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6350);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6360); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2951:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2954:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2955:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2955:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2955:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2955:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2956:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleSingleSourceSelectStatement6406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2965:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2966:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2966:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2967:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6427);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleSingleSourceSelectStatement6439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2987:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==65) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2987:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleSingleSourceSelectStatement6452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2991:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2992:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2992:1: (lv_name_5_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:2993:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6469); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3017:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3018:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3019:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6512);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin6522); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3026:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3029:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3030:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3030:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3030:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleSingleSourceJoin6559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3034:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3035:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3035:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3036:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6580);
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

            otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleSingleSourceJoin6592); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3064:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3065:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3066:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6628);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement6638); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3073:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3076:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3077:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3077:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3077:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3077:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3078:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3083:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==80) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3084:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3084:1: (lv_natural_1_0= 'natural' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3085:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,80,FOLLOW_80_in_ruleJoinStatement6690); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3098:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt55=4;
            switch ( input.LA(1) ) {
                case 81:
                    {
                    alt55=1;
                    }
                    break;
                case 83:
                    {
                    alt55=2;
                    }
                    break;
                case 84:
                    {
                    alt55=3;
                    }
                    break;
            }

            switch (alt55) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3098:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3098:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3098:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3098:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3099:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3099:1: (lv_left_2_0= 'left' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3100:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,81,FOLLOW_81_in_ruleJoinStatement6724); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3113:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==82) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3114:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3114:1: (lv_outer_3_0= 'outer' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3115:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,82,FOLLOW_82_in_ruleJoinStatement6755); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3129:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3129:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3130:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3130:1: (lv_inner_4_0= 'inner' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3131:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,83,FOLLOW_83_in_ruleJoinStatement6794); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3145:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3145:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3146:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3146:1: (lv_cross_5_0= 'cross' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3147:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement6831); if (state.failed) return current;
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

            otherlv_6=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement6858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3164:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3165:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3165:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3166:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement6879);
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

            otherlv_8=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement6891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3186:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3187:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3187:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3188:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement6912);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3212:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3213:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3214:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn6948);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn6958); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3221:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3224:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3225:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3225:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3225:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3225:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3226:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3231:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3232:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3232:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3233:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn7013);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3249:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==65) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3249:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleResultColumn7026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3253:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3254:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3254:1: (lv_name_3_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3255:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn7043); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3279:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3280:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3281:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7086);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue7096); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3288:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3291:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3292:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3292:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt57=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 27:
                {
                alt57=1;
                }
                break;
            case RULE_STRING:
                {
                alt57=2;
                }
                break;
            case 87:
                {
                alt57=3;
                }
                break;
            case 88:
                {
                alt57=4;
                }
                break;
            case 89:
                {
                alt57=5;
                }
                break;
            case 90:
                {
                alt57=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3292:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3292:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3292:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3292:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3293:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3298:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3299:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3299:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3300:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue7152);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3317:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3317:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3317:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3317:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3318:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3323:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3324:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3324:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3325:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue7186); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3342:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3342:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3342:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3342:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3343:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3348:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3349:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3349:1: (lv_literal_5_0= 'null' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3350:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,87,FOLLOW_87_in_ruleLiteralValue7226); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3364:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3364:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3364:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3364:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3365:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3370:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3371:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3371:1: (lv_literal_7_0= 'current_time' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3372:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,88,FOLLOW_88_in_ruleLiteralValue7274); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3386:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3386:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3386:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3386:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3387:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3392:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3393:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3393:1: (lv_literal_9_0= 'current_date' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3394:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,89,FOLLOW_89_in_ruleLiteralValue7322); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3408:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3408:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3408:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3408:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3409:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3414:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3415:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3415:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3416:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue7370); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3437:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3438:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3439:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7420);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement7430); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3446:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3449:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3450:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3450:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )
            int alt58=8;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3451:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7477);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3461:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7504);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3471:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7531);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3481:5: this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7558);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3491:5: this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7585);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3501:5: this_DropTableStatement_5= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7612);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3511:5: this_DropTriggerStatement_6= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7639);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3521:5: this_DropViewStatement_7= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7666);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3537:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3538:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3539:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement7701);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement7711); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3546:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3549:28: ( ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3550:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3550:1: ( () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3550:2: () otherlv_1= 'create' otherlv_2= 'table' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_columnDefs_5_0= ruleColumnDef ) ) (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )* (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )* otherlv_10= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3550:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3551:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateTableStatement7757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,92,FOLLOW_92_in_ruleCreateTableStatement7769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3564:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3565:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3565:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3566:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement7786); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleCreateTableStatement7803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3586:1: ( (lv_columnDefs_5_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3587:1: (lv_columnDefs_5_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3587:1: (lv_columnDefs_5_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3588:3: lv_columnDefs_5_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7824);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3604:2: (otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==63) ) {
                    int LA59_1 = input.LA(2);

                    if ( (LA59_1==RULE_ID) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3604:4: otherlv_6= ',' ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    {
            	    otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleCreateTableStatement7837); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3608:1: ( (lv_columnDefs_7_0= ruleColumnDef ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3609:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3609:1: (lv_columnDefs_7_0= ruleColumnDef )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3610:3: lv_columnDefs_7_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7858);
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
            	    break loop59;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3626:4: (otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==63) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3626:6: otherlv_8= ',' ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    {
            	    otherlv_8=(Token)match(input,63,FOLLOW_63_in_ruleCreateTableStatement7873); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3630:1: ( (lv_constraints_9_0= ruleTableConstraint ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3631:1: (lv_constraints_9_0= ruleTableConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3631:1: (lv_constraints_9_0= ruleTableConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3632:3: lv_constraints_9_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7894);
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
            	    break loop60;
                }
            } while (true);

            otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleCreateTableStatement7908); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3660:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3661:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3662:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7944);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement7954); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3669:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_selectStatement_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3672:28: ( ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3673:1: ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3673:1: ( () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3673:2: () otherlv_1= 'create' otherlv_2= 'view' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_selectStatement_5_0= ruleSelectStatement ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3673:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3674:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleCreateViewStatement8000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,93,FOLLOW_93_in_ruleCreateViewStatement8012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateViewStatementAccess().getViewKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3687:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3688:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3688:1: (lv_name_3_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3689:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement8029); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,65,FOLLOW_65_in_ruleCreateViewStatement8046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateViewStatementAccess().getAsKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3709:1: ( (lv_selectStatement_5_0= ruleSelectStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3710:1: (lv_selectStatement_5_0= ruleSelectStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3710:1: (lv_selectStatement_5_0= ruleSelectStatement )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3711:3: lv_selectStatement_5_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8067);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3735:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3736:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3737:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8103);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement8113); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3744:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3747:28: ( (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3748:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3748:1: (otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3748:3: otherlv_0= 'create' otherlv_1= 'trigger' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )? ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) ) otherlv_11= 'on' ( (otherlv_12= RULE_ID ) ) ( (lv_forEachRow_13_0= 'for each row' ) )? (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )? otherlv_16= 'begin' ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )? otherlv_21= 'end'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleCreateTriggerStatement8150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement8162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3756:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3757:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3757:1: (lv_name_2_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3758:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8179); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3774:2: ( ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=95 && LA62_0<=97)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3775:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3775:1: ( (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3776:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3776:1: (lv_when_3_1= 'before' | lv_when_3_2= 'after' | lv_when_3_3= 'instead of' )
                    int alt61=3;
                    switch ( input.LA(1) ) {
                    case 95:
                        {
                        alt61=1;
                        }
                        break;
                    case 96:
                        {
                        alt61=2;
                        }
                        break;
                    case 97:
                        {
                        alt61=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3777:3: lv_when_3_1= 'before'
                            {
                            lv_when_3_1=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement8204); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3789:8: lv_when_3_2= 'after'
                            {
                            lv_when_3_2=(Token)match(input,96,FOLLOW_96_in_ruleCreateTriggerStatement8233); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3801:8: lv_when_3_3= 'instead of'
                            {
                            lv_when_3_3=(Token)match(input,97,FOLLOW_97_in_ruleCreateTriggerStatement8262); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3816:3: ( ( (lv_eventType_4_0= 'delete' ) ) | ( (lv_eventType_5_0= 'insert' ) ) | ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt65=1;
                }
                break;
            case 99:
                {
                alt65=2;
                }
                break;
            case 100:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3816:4: ( (lv_eventType_4_0= 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3816:4: ( (lv_eventType_4_0= 'delete' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3817:1: (lv_eventType_4_0= 'delete' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3817:1: (lv_eventType_4_0= 'delete' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3818:3: lv_eventType_4_0= 'delete'
                    {
                    lv_eventType_4_0=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement8298); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3832:6: ( (lv_eventType_5_0= 'insert' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3832:6: ( (lv_eventType_5_0= 'insert' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3833:1: (lv_eventType_5_0= 'insert' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3833:1: (lv_eventType_5_0= 'insert' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3834:3: lv_eventType_5_0= 'insert'
                    {
                    lv_eventType_5_0=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement8335); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3848:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3848:6: ( ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3848:7: ( (lv_eventType_6_0= 'update' ) ) (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3848:7: ( (lv_eventType_6_0= 'update' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3849:1: (lv_eventType_6_0= 'update' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3849:1: (lv_eventType_6_0= 'update' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3850:3: lv_eventType_6_0= 'update'
                    {
                    lv_eventType_6_0=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement8373); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3863:2: (otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )* )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==101) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3863:4: otherlv_7= 'of' ( (lv_updateColumnNames_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            {
                            otherlv_7=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement8399); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_4_2_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3867:1: ( (lv_updateColumnNames_8_0= RULE_ID ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3868:1: (lv_updateColumnNames_8_0= RULE_ID )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3868:1: (lv_updateColumnNames_8_0= RULE_ID )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3869:3: lv_updateColumnNames_8_0= RULE_ID
                            {
                            lv_updateColumnNames_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8416); if (state.failed) return current;
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3885:2: (otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==63) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3885:4: otherlv_9= ',' ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    {
                            	    otherlv_9=(Token)match(input,63,FOLLOW_63_in_ruleCreateTriggerStatement8434); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_4_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3889:1: ( (lv_updateColumnNames_10_0= RULE_ID ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3890:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3890:1: (lv_updateColumnNames_10_0= RULE_ID )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3891:3: lv_updateColumnNames_10_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8451); if (state.failed) return current;
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
                            	    break loop63;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,86,FOLLOW_86_in_ruleCreateTriggerStatement8474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3911:1: ( (otherlv_12= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3912:1: (otherlv_12= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3912:1: (otherlv_12= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3913:3: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_6_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3924:2: ( (lv_forEachRow_13_0= 'for each row' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==102) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3925:1: (lv_forEachRow_13_0= 'for each row' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3925:1: (lv_forEachRow_13_0= 'for each row' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3926:3: lv_forEachRow_13_0= 'for each row'
                    {
                    lv_forEachRow_13_0=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement8512); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3939:3: (otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==66) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3939:5: otherlv_14= 'when' ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    {
                    otherlv_14=(Token)match(input,66,FOLLOW_66_in_ruleCreateTriggerStatement8539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_8_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3943:1: ( (lv_whenExpression_15_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3944:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3944:1: (lv_whenExpression_15_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3945:3: lv_whenExpression_15_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement8560);
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

            otherlv_16=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement8574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_9());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3965:1: ( ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==71||(LA69_0>=98 && LA69_0<=100)||LA69_0==116) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3965:2: ( (lv_statements_17_0= ruleDMLStatement ) ) otherlv_18= ';' ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3965:2: ( (lv_statements_17_0= ruleDMLStatement ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3966:1: (lv_statements_17_0= ruleDMLStatement )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3966:1: (lv_statements_17_0= ruleDMLStatement )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3967:3: lv_statements_17_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8596);
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

                    otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleCreateTriggerStatement8608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_10_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3987:1: ( ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';' )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==71||(LA68_0>=98 && LA68_0<=100)||LA68_0==116) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3987:2: ( (lv_statements_19_0= ruleDMLStatement ) ) otherlv_20= ';'
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3987:2: ( (lv_statements_19_0= ruleDMLStatement ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3988:1: (lv_statements_19_0= ruleDMLStatement )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3988:1: (lv_statements_19_0= ruleDMLStatement )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:3989:3: lv_statements_19_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_10_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8630);
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

                    	    otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleCreateTriggerStatement8642); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_20, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_10_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,62,FOLLOW_62_in_ruleCreateTriggerStatement8658); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4021:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4022:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4023:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement8694);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement8704); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4030:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4033:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4034:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4034:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4034:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4034:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4035:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,104,FOLLOW_104_in_ruleAlterTableRenameStatement8750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,92,FOLLOW_92_in_ruleAlterTableRenameStatement8762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4048:1: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4049:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4049:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4050:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,105,FOLLOW_105_in_ruleAlterTableRenameStatement8794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4065:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4066:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4066:1: (lv_name_5_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4067:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8811); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4091:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4092:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4093:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement8852);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement8862); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4100:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4103:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4104:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4104:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4104:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleAlterTableAddColumnStatement8899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleAlterTableAddColumnStatement8911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4112:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4113:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4113:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4114:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement8931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,106,FOLLOW_106_in_ruleAlterTableAddColumnStatement8943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4129:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4130:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4130:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4131:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement8964);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4155:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4156:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4157:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9000);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement9010); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4164:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4167:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4168:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4168:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4168:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_107_in_ruleDropTableStatement9047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleDropTableStatement9059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4176:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==108) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4177:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4177:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4178:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,108,FOLLOW_108_in_ruleDropTableStatement9077); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4191:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4192:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4192:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4193:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement9111); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4212:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4213:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4214:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9147);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement9157); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4221:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4224:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4225:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4225:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4225:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_107_in_ruleDropTriggerStatement9194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleDropTriggerStatement9206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4233:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==108) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4234:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4234:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4235:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,108,FOLLOW_108_in_ruleDropTriggerStatement9224); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4248:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4249:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4249:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4250:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement9258); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4269:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4270:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4271:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9294);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement9304); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4278:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4281:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4282:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4282:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4282:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_107_in_ruleDropViewStatement9341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleDropViewStatement9353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4290:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==108) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4291:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4291:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4292:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,108,FOLLOW_108_in_ruleDropViewStatement9371); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4305:3: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4306:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4306:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4307:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement9405); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4326:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4327:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4328:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef9441);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef9451); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4335:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4338:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4339:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4339:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4339:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4339:2: ()
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4340:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4345:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4346:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4346:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4347:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef9502); if (state.failed) return current;
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4363:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4364:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4364:1: (lv_type_2_0= ruleColumnType )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4365:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef9528);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4381:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==51||LA73_0==109||(LA73_0>=111 && LA73_0<=112)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4382:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4382:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4383:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef9549);
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
            	    break loop73;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4407:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4408:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4409:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint9586);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint9596); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4416:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4419:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4420:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4420:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt78=1;
                }
                break;
            case 51:
                {
                alt78=2;
                }
                break;
            case 111:
                {
                alt78=3;
                }
                break;
            case 112:
                {
                alt78=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4420:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4420:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4420:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4420:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4421:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,109,FOLLOW_109_in_ruleColumnConstraint9643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4430:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt74=3;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==78) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==79) ) {
                        alt74=2;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4430:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4430:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4431:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4431:1: (lv_asc_2_0= 'asc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4432:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,78,FOLLOW_78_in_ruleColumnConstraint9662); if (state.failed) return current;
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
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4446:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4446:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4447:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4447:1: (lv_desc_3_0= 'desc' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4448:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,79,FOLLOW_79_in_ruleColumnConstraint9699); if (state.failed) return current;
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

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4461:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==110) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4462:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4462:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4463:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,110,FOLLOW_110_in_ruleColumnConstraint9732); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4477:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4477:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4477:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4477:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4478:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleColumnConstraint9775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4487:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==86) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4488:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4488:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4489:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint9796);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4506:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4506:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4506:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4506:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4507:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,111,FOLLOW_111_in_ruleColumnConstraint9826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4516:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==86) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4517:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4517:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4518:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint9847);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4535:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4535:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4535:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4535:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4536:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,112,FOLLOW_112_in_ruleColumnConstraint9877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4545:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4546:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4546:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4547:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint9898);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4571:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4572:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4573:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9935);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint9945); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4580:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4583:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4584:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4584:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 113:
                {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 109:
                        {
                        alt79=2;
                        }
                        break;
                    case 111:
                        {
                        alt79=1;
                        }
                        break;
                    case 114:
                        {
                        alt79=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
                }
                break;
            case 111:
                {
                alt79=1;
                }
                break;
            case 109:
                {
                alt79=2;
                }
                break;
            case 114:
                {
                alt79=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4585:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9992);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4595:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint10019);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4605:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint10046);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4621:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4622:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4623:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint10081);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint10091); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4630:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4633:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4634:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4634:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4634:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4634:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==113) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4634:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,113,FOLLOW_113_in_ruleUniqueTableConstraint10129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4638:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4639:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4639:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4640:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint10146); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleUniqueTableConstraint10165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleUniqueTableConstraint10177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4664:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4665:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4665:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4666:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10198);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4682:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==63) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4682:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,63,FOLLOW_63_in_ruleUniqueTableConstraint10211); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4686:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4687:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4687:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4688:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10232);
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
            	    break loop81;
                }
            } while (true);

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleUniqueTableConstraint10246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4708:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4709:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4709:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4710:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint10267);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4734:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4735:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4736:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint10303);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint10313); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4743:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4746:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4747:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4747:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4747:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4747:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==113) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4747:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,113,FOLLOW_113_in_rulePrimaryConstraint10351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4751:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4752:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4752:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4753:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint10368); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,109,FOLLOW_109_in_rulePrimaryConstraint10387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,56,FOLLOW_56_in_rulePrimaryConstraint10399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4777:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4778:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4778:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4779:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10420);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4795:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==63) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4795:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,63,FOLLOW_63_in_rulePrimaryConstraint10433); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4799:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4800:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4800:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4801:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10454);
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
            	    break loop83;
                }
            } while (true);

            otherlv_7=(Token)match(input,57,FOLLOW_57_in_rulePrimaryConstraint10468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4821:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4822:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4822:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4823:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint10489);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4847:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4848:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4849:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint10525);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint10535); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4856:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4859:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4860:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4860:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4860:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4860:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==113) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4860:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,113,FOLLOW_113_in_ruleCheckTableConstraint10573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4864:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4865:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4865:1: (lv_name_1_0= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4866:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint10590); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,114,FOLLOW_114_in_ruleCheckTableConstraint10609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleCheckTableConstraint10621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4890:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4891:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4891:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4892:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint10642);
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

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleCheckTableConstraint10654); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4920:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4921:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4922:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn10690);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn10700); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4929:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4932:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4933:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4934:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4934:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4935:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn10745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4946:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==78) ) {
                alt85=1;
            }
            else if ( (LA85_0==79) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4946:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4946:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4947:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4947:1: (lv_asc_1_0= 'asc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4948:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,78,FOLLOW_78_in_ruleIndexedColumn10764); if (state.failed) return current;
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4962:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4962:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4963:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4963:1: (lv_desc_2_0= 'desc' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4964:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,79,FOLLOW_79_in_ruleIndexedColumn10801); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4985:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4986:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4987:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue10852);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue10862); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4994:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4997:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_STRING && LA86_0<=RULE_NUMBER)||LA86_0==27||(LA86_0>=87 && LA86_0<=90)) ) {
                alt86=1;
            }
            else if ( (LA86_0==56) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4998:3: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:4999:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5004:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5005:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5005:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5006:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue10918);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5023:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5023:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5023:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5023:7: ()
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5024:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleDefaultValue10947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5033:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5034:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5034:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5035:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue10968);
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

                    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleDefaultValue10980); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5063:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5064:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5065:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause11017);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause11027); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5072:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5075:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5076:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5076:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5076:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,86,FOLLOW_86_in_ruleConflictClause11064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,115,FOLLOW_115_in_ruleConflictClause11076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5084:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5085:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5085:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5086:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause11097);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5110:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5111:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5112:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement11133);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement11143); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5119:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5122:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5123:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5123:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt87=1;
                }
                break;
            case 99:
            case 116:
                {
                alt87=2;
                }
                break;
            case 100:
                {
                alt87=3;
                }
                break;
            case 98:
                {
                alt87=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5124:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement11190);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5134:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement11217);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5144:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement11244);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5154:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement11271);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5170:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5171:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5172:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement11306);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement11316); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5179:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5182:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5183:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5183:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5183:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,98,FOLLOW_98_in_ruleDeleteStatement11353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleDeleteStatement11365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5191:1: ( (otherlv_2= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5192:1: (otherlv_2= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5192:1: (otherlv_2= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5193:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement11385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5204:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==75) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5204:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleDeleteStatement11398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5208:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5209:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5209:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5210:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement11419);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5234:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5235:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5236:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement11457);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement11467); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5243:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5246:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==99) ) {
                alt90=1;
            }
            else if ( (LA90_0==116) ) {
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5247:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleInsertStatement11506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5251:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==49) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5251:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleInsertStatement11519); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5255:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5256:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5256:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5257:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement11540);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5274:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,116,FOLLOW_116_in_ruleInsertStatement11561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,117,FOLLOW_117_in_ruleInsertStatement11574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5282:1: ( (otherlv_5= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5283:1: (otherlv_5= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5283:1: (otherlv_5= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5284:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5295:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==56) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5295:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleInsertStatement11607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5299:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5300:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5300:1: (otherlv_7= RULE_ID )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5301:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5312:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==63) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5312:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,63,FOLLOW_63_in_ruleInsertStatement11640); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5316:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5317:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5317:1: (otherlv_9= RULE_ID )
                    	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5318:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement11660); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleInsertStatement11674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5333:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==71||LA95_0==118) ) {
                alt95=1;
            }
            else if ( (LA95_0==112) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5333:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5333:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==118) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==71) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5333:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5333:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5333:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,118,FOLLOW_118_in_ruleInsertStatement11691); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,56,FOLLOW_56_in_ruleInsertStatement11703); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5341:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5342:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5342:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5343:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement11724);
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

                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5359:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==63) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5359:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,63,FOLLOW_63_in_ruleInsertStatement11737); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5363:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5364:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5364:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5365:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement11758);
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
                            	    break loop93;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,57,FOLLOW_57_in_ruleInsertStatement11772); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5386:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5386:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5387:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5387:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5388:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement11800);
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
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5405:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5405:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5405:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,112,FOLLOW_112_in_ruleInsertStatement11820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,118,FOLLOW_118_in_ruleInsertStatement11832); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5421:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5422:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5423:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement11870);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement11880); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5430:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5433:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5434:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5434:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5434:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleUpdateStatement11917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5438:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==49) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5438:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleUpdateStatement11930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5442:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5443:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5443:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5444:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11951);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5460:4: ( (otherlv_3= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5461:1: (otherlv_3= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5461:1: (otherlv_3= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5462:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement11973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,119,FOLLOW_119_in_ruleUpdateStatement11985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5477:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5478:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5478:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5479:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement12006);
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

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5495:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==63) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5495:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleUpdateStatement12019); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5499:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5500:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5500:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5501:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement12040);
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
            	    break loop97;
                }
            } while (true);

            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5517:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==75) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5517:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,75,FOLLOW_75_in_ruleUpdateStatement12055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5521:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5522:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5522:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5523:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement12076);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5547:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5548:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5549:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression12114);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression12124); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5556:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5559:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5560:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5560:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5560:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5560:2: ( (otherlv_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5561:1: (otherlv_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5561:1: (otherlv_0= RULE_ID )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5562:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression12169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleUpdateColumnExpression12181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5577:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5578:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5578:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5579:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression12202);
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5603:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5604:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5605:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber12239);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber12250); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5612:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5615:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5616:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5616:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5616:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5616:2: (kw= '-' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==27) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5617:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleSignedNumber12289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber12306); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5637:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5638:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5639:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12352);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12363); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5646:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5649:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5650:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5650:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5650:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5657:1: (kw= '.' this_ID_2= RULE_ID )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==55) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5658:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleQualifiedName12422); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12437); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop100;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5678:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5680:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5681:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5681:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt101=4;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt101=1;
                }
                break;
            case 121:
                {
                alt101=2;
                }
                break;
            case 122:
                {
                alt101=3;
                }
                break;
            case 123:
                {
                alt101=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5681:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5681:2: (enumLiteral_0= 'union all' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5681:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_120_in_ruleCompoundOperator12498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5687:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5687:6: (enumLiteral_1= 'union' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5687:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_121_in_ruleCompoundOperator12515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5693:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5693:6: (enumLiteral_2= 'intersect' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5693:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_122_in_ruleCompoundOperator12532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5699:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5699:6: (enumLiteral_3= 'except' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5699:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_123_in_ruleCompoundOperator12549); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5709:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
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
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5711:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5712:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5712:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt102=6;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt102=1;
                }
                break;
            case 125:
                {
                alt102=2;
                }
                break;
            case 126:
                {
                alt102=3;
                }
                break;
            case 127:
                {
                alt102=4;
                }
                break;
            case 128:
                {
                alt102=5;
                }
                break;
            case 129:
                {
                alt102=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5712:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5712:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5712:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_124_in_ruleSqliteDataType12594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5718:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5718:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5718:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_125_in_ruleSqliteDataType12611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5724:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5724:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5724:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_126_in_ruleSqliteDataType12628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5730:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5730:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5730:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,127,FOLLOW_127_in_ruleSqliteDataType12645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5736:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5736:6: (enumLiteral_4= 'none' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5736:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,128,FOLLOW_128_in_ruleSqliteDataType12662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5742:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5742:6: (enumLiteral_5= 'numeric' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5742:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,129,FOLLOW_129_in_ruleSqliteDataType12679); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5752:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5754:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5755:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5755:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt103=5;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt103=1;
                }
                break;
            case 125:
                {
                alt103=2;
                }
                break;
            case 126:
                {
                alt103=3;
                }
                break;
            case 127:
                {
                alt103=4;
                }
                break;
            case 130:
                {
                alt103=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5755:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5755:2: (enumLiteral_0= 'text' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5755:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_124_in_ruleColumnType12724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5761:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5761:6: (enumLiteral_1= 'integer' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5761:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_125_in_ruleColumnType12741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5767:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5767:6: (enumLiteral_2= 'real' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5767:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_126_in_ruleColumnType12758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5773:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5773:6: (enumLiteral_3= 'blob' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5773:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,127,FOLLOW_127_in_ruleColumnType12775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5779:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5779:6: (enumLiteral_4= 'boolean' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5779:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,130,FOLLOW_130_in_ruleColumnType12792); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5789:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5791:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5792:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5792:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt104=5;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt104=1;
                }
                break;
            case 132:
                {
                alt104=2;
                }
                break;
            case 133:
                {
                alt104=3;
                }
                break;
            case 134:
                {
                alt104=4;
                }
                break;
            case 116:
                {
                alt104=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5792:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5792:2: (enumLiteral_0= 'rollback' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5792:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,131,FOLLOW_131_in_ruleConflictResolution12837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5798:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5798:6: (enumLiteral_1= 'abort' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5798:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,132,FOLLOW_132_in_ruleConflictResolution12854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5804:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5804:6: (enumLiteral_2= 'fail' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5804:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,133,FOLLOW_133_in_ruleConflictResolution12871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5810:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5810:6: (enumLiteral_3= 'ignore' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5810:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,134,FOLLOW_134_in_ruleConflictResolution12888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5816:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5816:6: (enumLiteral_4= 'replace' )
                    // ../com.robotoworks.mechanoid.db/src-gen/com/robotoworks/mechanoid/db/parser/antlr/internal/InternalSqliteModel.g:5816:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,116,FOLLOW_116_in_ruleConflictResolution12905); if (state.failed) return current;
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
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\3\uffff\1\11\10\uffff";
    static final String DFA33_minS =
        "\1\4\2\uffff\1\22\1\uffff\1\4\6\uffff";
    static final String DFA33_maxS =
        "\1\132\2\uffff\1\173\1\uffff\1\132\6\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\3\1\10\1\5";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\3\2\4\24\uffff\1\4\31\uffff\1\1\1\2\1\uffff\1\5\1\uffff\2"+
            "\6\1\7\3\uffff\1\10\26\uffff\4\4",
            "",
            "",
            "\1\11\2\uffff\1\11\1\uffff\36\11\2\uffff\1\11\1\12\1\11\3\uffff"+
            "\3\11\1\uffff\6\11\3\uffff\10\11\1\uffff\3\11\21\uffff\1\11"+
            "\20\uffff\4\11",
            "",
            "\3\13\24\uffff\1\13\31\uffff\2\13\1\uffff\1\13\1\uffff\3\13"+
            "\3\uffff\1\13\6\uffff\1\6\17\uffff\4\13",
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
        "\120\uffff";
    static final String DFA25_eofS =
        "\1\uffff\1\3\1\43\34\uffff\1\77\60\uffff";
    static final String DFA25_minS =
        "\1\4\1\22\1\4\34\uffff\1\4\40\uffff\1\4\16\uffff\1\0";
    static final String DFA25_maxS =
        "\1\4\2\173\34\uffff\1\173\40\uffff\1\132\16\uffff\1\0";
    static final String DFA25_acceptS =
        "\3\uffff\1\3\33\1\1\uffff\37\1\1\2\1\uffff\16\1\1\uffff";
    static final String DFA25_specialS =
        "\2\uffff\1\1\34\uffff\1\2\57\uffff\1\0}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\3\1\uffff\36\3\2\uffff\1\2\1\uffff\1\3\3\uffff"+
            "\3\3\1\uffff\6\3\3\uffff\10\3\1\uffff\3\3\21\uffff\1\3\20\uffff"+
            "\4\3",
            "\1\77\15\uffff\1\40\2\uffff\1\37\1\uffff\1\54\1\42\1\41\1\35"+
            "\1\36\1\31\1\32\1\33\1\34\1\25\1\26\1\27\1\30\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\10\1\7\1\4\1"+
            "\5\1\6\4\uffff\1\44\3\uffff\1\52\1\46\1\47\1\uffff\1\50\1\45"+
            "\1\51\1\63\1\64\1\53\3\uffff\1\75\1\67\1\55\1\56\1\65\1\66\1"+
            "\70\1\71\1\uffff\1\72\1\73\1\74\21\uffff\1\76\20\uffff\1\57"+
            "\1\60\1\61\1\62",
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
            "\1\103\1\105\1\104\13\uffff\1\77\2\uffff\1\77\1\uffff\4\77"+
            "\1\100\31\77\1\101\1\102\1\uffff\1\112\1\77\1\113\1\114\1\115"+
            "\3\77\1\116\6\77\3\uffff\10\77\1\uffff\3\77\1\uffff\1\106\1"+
            "\107\1\110\1\111\14\uffff\1\77\20\uffff\4\77",
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
            "\2\77\1\117\24\uffff\1\77\31\uffff\2\77\1\uffff\1\77\1\uffff"+
            "\3\77\3\uffff\1\77\26\uffff\4\77",
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
                        int LA25_79 = input.LA(1);

                         
                        int index25_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSqliteModel()) ) {s = 78;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index25_79);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
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

                        else if ( (LA25_2==70) && (synpred1_InternalSqliteModel())) {s = 43;}

                        else if ( (LA25_2==23) && (synpred1_InternalSqliteModel())) {s = 44;}

                        else if ( (LA25_2==76) && (synpred1_InternalSqliteModel())) {s = 45;}

                        else if ( (LA25_2==77) && (synpred1_InternalSqliteModel())) {s = 46;}

                        else if ( (LA25_2==120) && (synpred1_InternalSqliteModel())) {s = 47;}

                        else if ( (LA25_2==121) && (synpred1_InternalSqliteModel())) {s = 48;}

                        else if ( (LA25_2==122) && (synpred1_InternalSqliteModel())) {s = 49;}

                        else if ( (LA25_2==123) && (synpred1_InternalSqliteModel())) {s = 50;}

                        else if ( (LA25_2==68) && (synpred1_InternalSqliteModel())) {s = 51;}

                        else if ( (LA25_2==69) && (synpred1_InternalSqliteModel())) {s = 52;}

                        else if ( (LA25_2==78) && (synpred1_InternalSqliteModel())) {s = 53;}

                        else if ( (LA25_2==79) && (synpred1_InternalSqliteModel())) {s = 54;}

                        else if ( (LA25_2==75) && (synpred1_InternalSqliteModel())) {s = 55;}

                        else if ( (LA25_2==80) && (synpred1_InternalSqliteModel())) {s = 56;}

                        else if ( (LA25_2==81) && (synpred1_InternalSqliteModel())) {s = 57;}

                        else if ( (LA25_2==83) && (synpred1_InternalSqliteModel())) {s = 58;}

                        else if ( (LA25_2==84) && (synpred1_InternalSqliteModel())) {s = 59;}

                        else if ( (LA25_2==85) && (synpred1_InternalSqliteModel())) {s = 60;}

                        else if ( (LA25_2==74) && (synpred1_InternalSqliteModel())) {s = 61;}

                        else if ( (LA25_2==103) && (synpred1_InternalSqliteModel())) {s = 62;}

                        else if ( (LA25_2==RULE_ID) ) {s = 63;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_31 = input.LA(1);

                         
                        int index25_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_31==EOF||LA25_31==18||LA25_31==21||(LA25_31>=23 && LA25_31<=26)||(LA25_31>=28 && LA25_31<=52)||LA25_31==57||(LA25_31>=61 && LA25_31<=63)||(LA25_31>=65 && LA25_31<=70)||(LA25_31>=74 && LA25_31<=81)||(LA25_31>=83 && LA25_31<=85)||LA25_31==103||(LA25_31>=120 && LA25_31<=123)) ) {s = 63;}

                        else if ( (LA25_31==27) ) {s = 64;}

                        else if ( (LA25_31==53) && (synpred1_InternalSqliteModel())) {s = 65;}

                        else if ( (LA25_31==54) && (synpred1_InternalSqliteModel())) {s = 66;}

                        else if ( (LA25_31==RULE_ID) && (synpred1_InternalSqliteModel())) {s = 67;}

                        else if ( (LA25_31==RULE_NUMBER) && (synpred1_InternalSqliteModel())) {s = 68;}

                        else if ( (LA25_31==RULE_STRING) && (synpred1_InternalSqliteModel())) {s = 69;}

                        else if ( (LA25_31==87) && (synpred1_InternalSqliteModel())) {s = 70;}

                        else if ( (LA25_31==88) && (synpred1_InternalSqliteModel())) {s = 71;}

                        else if ( (LA25_31==89) && (synpred1_InternalSqliteModel())) {s = 72;}

                        else if ( (LA25_31==90) && (synpred1_InternalSqliteModel())) {s = 73;}

                        else if ( (LA25_31==56) && (synpred1_InternalSqliteModel())) {s = 74;}

                        else if ( (LA25_31==58) && (synpred1_InternalSqliteModel())) {s = 75;}

                        else if ( (LA25_31==59) && (synpred1_InternalSqliteModel())) {s = 76;}

                        else if ( (LA25_31==60) && (synpred1_InternalSqliteModel())) {s = 77;}

                        else if ( (LA25_31==64) && (synpred1_InternalSqliteModel())) {s = 78;}

                         
                        input.seek(index25_31);
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
    static final String DFA58_eotS =
        "\16\uffff";
    static final String DFA58_eofS =
        "\16\uffff";
    static final String DFA58_minS =
        "\1\133\3\134\3\uffff\1\4\3\uffff\1\151\2\uffff";
    static final String DFA58_maxS =
        "\1\153\1\136\1\134\1\136\3\uffff\1\4\3\uffff\1\152\2\uffff";
    static final String DFA58_acceptS =
        "\4\uffff\1\2\1\3\1\1\1\uffff\1\7\1\10\1\6\1\uffff\1\5\1\4";
    static final String DFA58_specialS =
        "\16\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\14\uffff\1\2\2\uffff\1\3",
            "\1\6\1\4\1\5",
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3450:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_AlterTableRenameStatement_3= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_4= ruleAlterTableAddColumnStatement | this_DropTableStatement_5= ruleDropTableStatement | this_DropTriggerStatement_6= ruleDropTriggerStatement | this_DropViewStatement_7= ruleDropViewStatement )";
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
    public static final BitSet FOLLOW_14_in_ruleMigrationBlock1093 = new BitSet(new long[]{0x0000000000008000L,0x0000090008000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock1115 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMigrationBlock1127 = new BitSet(new long[]{0x0000000000008000L,0x0000090008000000L});
    public static final BitSet FOLLOW_15_in_ruleMigrationBlock1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1324 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleExprConcat1351 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat1385 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1480 = new BitSet(new long[]{0x0000000002240002L});
    public static final BitSet FOLLOW_21_in_ruleExprMult1509 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_18_in_ruleExprMult1538 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_25_in_ruleExprMult1567 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult1604 = new BitSet(new long[]{0x0000000002240002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1699 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleExprAdd1728 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_27_in_ruleExprAdd1757 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd1794 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit1889 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_28_in_ruleExprBit1918 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_29_in_ruleExprBit1947 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_30_in_ruleExprBit1976 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_31_in_ruleExprBit2005 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2042 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2137 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_32_in_ruleExprRelate2166 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_33_in_ruleExprRelate2195 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_34_in_ruleExprRelate2224 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_35_in_ruleExprRelate2253 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate2290 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2385 = new BitSet(new long[]{0x0000FFF000000002L});
    public static final BitSet FOLLOW_36_in_ruleExprEqual2414 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_37_in_ruleExprEqual2443 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_38_in_ruleExprEqual2472 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_39_in_ruleExprEqual2501 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_40_in_ruleExprEqual2530 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_41_in_ruleExprEqual2559 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_42_in_ruleExprEqual2588 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_43_in_ruleExprEqual2617 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual2646 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual2675 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual2704 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual2733 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual2770 = new BitSet(new long[]{0x0000FFF000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2865 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExprAnd2892 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2926 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3021 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleExprOr3048 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
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
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3771 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3792 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryExpression3839 = new BitSet(new long[]{0x0900000000000000L});
    public static final BitSet FOLLOW_59_in_rulePrimaryExpression3871 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression3918 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression3959 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression3980 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800005L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4002 = new BitSet(new long[]{0x7D60000008000070L,0x0000000007800005L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4016 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4037 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4085 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression4102 = new BitSet(new long[]{0x1D60000008200070L,0x0000000007800001L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4121 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4162 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4175 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4196 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4241 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryExpression4253 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4286 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression4307 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryExpression4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase4356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCase4403 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleCase4436 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement4493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement4549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleSelectStatement4562 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement4583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSelectStatement4598 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement4619 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleSelectStatement4633 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_63_in_ruleSelectStatement4651 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList4713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4769 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOrderingTermList4782 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList4803 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore4841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4898 = new BitSet(new long[]{0x0000000000000002L,0x0F00000000000000L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore4928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore4949 = new BitSet(new long[]{0x0000000000000002L,0x0F00000000000000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression4987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSelectExpression5043 = new BitSet(new long[]{0x1D60000008200070L,0x0000000007800301L});
    public static final BitSet FOLLOW_72_in_ruleSelectExpression5062 = new BitSet(new long[]{0x1D60000008200070L,0x0000000007800301L});
    public static final BitSet FOLLOW_73_in_ruleSelectExpression5099 = new BitSet(new long[]{0x1D60000008200070L,0x0000000007800301L});
    public static final BitSet FOLLOW_21_in_ruleSelectExpression5133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression5173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_74_in_ruleSelectExpression5187 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression5208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_ruleSelectExpression5223 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression5244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression5259 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression5280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression5295 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList5354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5410 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSelectList5423 = new BitSet(new long[]{0x1D60000008200070L,0x0000000007800301L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList5444 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions5482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions5572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5628 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleGroupByExpressions5641 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions5662 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions5700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm5790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm5846 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleOrderingTerm5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOrderingTerm5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource5953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6009 = new BitSet(new long[]{0x0000000000000002L,0x00000000003B0000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource6030 = new BitSet(new long[]{0x0000000000000002L,0x00000000003B0000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource6067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource6124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable6213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6277 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSingleSourceTable6290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement6350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSingleSourceSelectStatement6406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement6427 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleSingleSourceSelectStatement6439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSingleSourceSelectStatement6452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin6512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSingleSourceJoin6559 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin6580 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleSingleSourceJoin6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement6628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJoinStatement6690 = new BitSet(new long[]{0x0000000000000000L,0x00000000003A0000L});
    public static final BitSet FOLLOW_81_in_ruleJoinStatement6724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000240000L});
    public static final BitSet FOLLOW_82_in_ruleJoinStatement6755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_83_in_ruleJoinStatement6794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement6831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement6858 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement6879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement6891 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn6948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn7013 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleResultColumn7026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue7086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLiteralValue7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleLiteralValue7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLiteralValue7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement7420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement7701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateTableStatement7757 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleCreateTableStatement7769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement7786 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCreateTableStatement7803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7824 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleCreateTableStatement7837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement7858 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleCreateTableStatement7873 = new BitSet(new long[]{0x0000000000000000L,0x0006A00000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement7894 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCreateTableStatement7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement7944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateViewStatement8000 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleCreateViewStatement8012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement8029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCreateViewStatement8046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement8103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCreateTriggerStatement8150 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement8162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8179 = new BitSet(new long[]{0x0000000000000000L,0x0000001F80000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement8204 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTriggerStatement8233 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateTriggerStatement8262 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement8298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement8335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement8373 = new BitSet(new long[]{0x0000000000000000L,0x0000002000400000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement8399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8416 = new BitSet(new long[]{0x8000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_63_in_ruleCreateTriggerStatement8434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8451 = new BitSet(new long[]{0x8000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleCreateTriggerStatement8474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement8494 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000004L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement8512 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000004L});
    public static final BitSet FOLLOW_66_in_ruleCreateTriggerStatement8539 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement8560 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement8574 = new BitSet(new long[]{0x4000000000000000L,0x0010001C00000080L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8596 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTriggerStatement8608 = new BitSet(new long[]{0x4000000000000000L,0x0010001C00000080L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement8630 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTriggerStatement8642 = new BitSet(new long[]{0x4000000000000000L,0x0010001C00000080L});
    public static final BitSet FOLLOW_62_in_ruleCreateTriggerStatement8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement8694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleAlterTableRenameStatement8750 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleAlterTableRenameStatement8762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8782 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleAlterTableRenameStatement8794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement8852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleAlterTableAddColumnStatement8899 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleAlterTableAddColumnStatement8911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement8931 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleAlterTableAddColumnStatement8943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement9000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleDropTableStatement9047 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleDropTableStatement9059 = new BitSet(new long[]{0x0000000000000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleDropTableStatement9077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement9147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleDropTriggerStatement9194 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleDropTriggerStatement9206 = new BitSet(new long[]{0x0000000000000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleDropTriggerStatement9224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement9294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleDropViewStatement9341 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleDropViewStatement9353 = new BitSet(new long[]{0x0000000000000010L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleDropViewStatement9371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef9441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef9502 = new BitSet(new long[]{0x0000000000000000L,0xF000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef9528 = new BitSet(new long[]{0x0008000000000002L,0x0001A00000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef9549 = new BitSet(new long[]{0x0008000000000002L,0x0001A00000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint9586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint9596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleColumnConstraint9643 = new BitSet(new long[]{0x0000000000000002L,0x000040000000C000L});
    public static final BitSet FOLLOW_78_in_ruleColumnConstraint9662 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_79_in_ruleColumnConstraint9699 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleColumnConstraint9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleColumnConstraint9775 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint9796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleColumnConstraint9826 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleColumnConstraint9877 = new BitSet(new long[]{0x0100000008000060L,0x0000000007800000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint9935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint9992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint10019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint10081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint10091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleUniqueTableConstraint10129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint10146 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleUniqueTableConstraint10165 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleUniqueTableConstraint10177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10198 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleUniqueTableConstraint10211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint10232 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleUniqueTableConstraint10246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint10267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint10303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rulePrimaryConstraint10351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint10368 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_rulePrimaryConstraint10387 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePrimaryConstraint10399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10420 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_rulePrimaryConstraint10433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint10454 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_rulePrimaryConstraint10468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint10525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint10535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleCheckTableConstraint10573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint10590 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleCheckTableConstraint10609 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCheckTableConstraint10621 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint10642 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCheckTableConstraint10654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn10690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn10745 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleIndexedColumn10764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleIndexedColumn10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue10852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue10862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue10918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDefaultValue10947 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue10968 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDefaultValue10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause11017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleConflictClause11064 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleConflictClause11076 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement11133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement11190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement11306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleDeleteStatement11353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleDeleteStatement11365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement11385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleDeleteStatement11398 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement11457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleInsertStatement11506 = new BitSet(new long[]{0x0002000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_49_in_ruleInsertStatement11519 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement11540 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_116_in_ruleInsertStatement11561 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleInsertStatement11574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11594 = new BitSet(new long[]{0x0100000000000000L,0x0041000000000080L});
    public static final BitSet FOLLOW_56_in_ruleInsertStatement11607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11627 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleInsertStatement11640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement11660 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleInsertStatement11674 = new BitSet(new long[]{0x0000000000000000L,0x0041000000000080L});
    public static final BitSet FOLLOW_118_in_ruleInsertStatement11691 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleInsertStatement11703 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement11724 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_63_in_ruleInsertStatement11737 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement11758 = new BitSet(new long[]{0x8200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleInsertStatement11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement11800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleInsertStatement11820 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleInsertStatement11832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement11870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement11880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleUpdateStatement11917 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_49_in_ruleUpdateStatement11930 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement11951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement11973 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleUpdateStatement11985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement12006 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_63_in_ruleUpdateStatement12019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement12040 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleUpdateStatement12055 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression12114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression12169 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleUpdateColumnExpression12181 = new BitSet(new long[]{0x1D60000008000070L,0x0000000007800001L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression12202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber12239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSignedNumber12289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12403 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQualifiedName12422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12437 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_120_in_ruleCompoundOperator12498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleCompoundOperator12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleCompoundOperator12532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleCompoundOperator12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleSqliteDataType12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleSqliteDataType12611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleSqliteDataType12628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleSqliteDataType12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSqliteDataType12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSqliteDataType12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleColumnType12724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleColumnType12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleColumnType12758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleColumnType12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType12792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleConflictResolution12837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleConflictResolution12854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleConflictResolution12871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleConflictResolution12888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleConflictResolution12905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalSqliteModel3548 = new BitSet(new long[]{0x0000000000000002L});

}