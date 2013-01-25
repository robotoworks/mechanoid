package com.robotoworks.mechanoid.sharedprefs.parser.antlr.internal; 

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
import com.robotoworks.mechanoid.sharedprefs.services.SharedPreferencesModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSharedPreferencesModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'preferences'", "'{'", "'}'", "':'", "'='", "'-'", "'.'", "'String'", "'int'", "'boolean'", "'float'", "'long'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSharedPreferencesModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSharedPreferencesModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSharedPreferencesModelParser.tokenNames; }
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g"; }



     	private SharedPreferencesModelGrammarAccess grammarAccess;
     	
        public InternalSharedPreferencesModelParser(TokenStream input, SharedPreferencesModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SharedPreferencesModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_preferencesBlock_2_0= rulePreferencesBlock ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_preferencesBlock_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_preferencesBlock_2_0= rulePreferencesBlock ) ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_preferencesBlock_2_0= rulePreferencesBlock ) ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_preferencesBlock_2_0= rulePreferencesBlock ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleFQN ) ) ( (lv_preferencesBlock_2_0= rulePreferencesBlock ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:85:1: ( (lv_packageName_1_0= ruleFQN ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:86:1: (lv_packageName_1_0= ruleFQN )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:86:1: (lv_packageName_1_0= ruleFQN )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:87:3: lv_packageName_1_0= ruleFQN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFQN_in_ruleModel143);
            lv_packageName_1_0=ruleFQN();

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
                      		"FQN");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:103:2: ( (lv_preferencesBlock_2_0= rulePreferencesBlock ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:104:1: (lv_preferencesBlock_2_0= rulePreferencesBlock )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:104:1: (lv_preferencesBlock_2_0= rulePreferencesBlock )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:105:3: lv_preferencesBlock_2_0= rulePreferencesBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getPreferencesBlockPreferencesBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePreferencesBlock_in_ruleModel164);
            lv_preferencesBlock_2_0=rulePreferencesBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"preferencesBlock",
                      		lv_preferencesBlock_2_0, 
                      		"PreferencesBlock");
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


    // $ANTLR start "entryRulePreferencesBlock"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:129:1: entryRulePreferencesBlock returns [EObject current=null] : iv_rulePreferencesBlock= rulePreferencesBlock EOF ;
    public final EObject entryRulePreferencesBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferencesBlock = null;


        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:130:2: (iv_rulePreferencesBlock= rulePreferencesBlock EOF )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:131:2: iv_rulePreferencesBlock= rulePreferencesBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreferencesBlockRule()); 
            }
            pushFollow(FOLLOW_rulePreferencesBlock_in_entryRulePreferencesBlock200);
            iv_rulePreferencesBlock=rulePreferencesBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreferencesBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferencesBlock210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreferencesBlock"


    // $ANTLR start "rulePreferencesBlock"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:138:1: rulePreferencesBlock returns [EObject current=null] : (otherlv_0= 'preferences' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefs_3_0= rulePreference ) )* otherlv_4= '}' ) ;
    public final EObject rulePreferencesBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_prefs_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:141:28: ( (otherlv_0= 'preferences' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefs_3_0= rulePreference ) )* otherlv_4= '}' ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:142:1: (otherlv_0= 'preferences' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefs_3_0= rulePreference ) )* otherlv_4= '}' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:142:1: (otherlv_0= 'preferences' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefs_3_0= rulePreference ) )* otherlv_4= '}' )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:142:3: otherlv_0= 'preferences' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_prefs_3_0= rulePreference ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePreferencesBlock247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPreferencesBlockAccess().getPreferencesKeyword_0());
                  
            }
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:146:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:147:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:147:1: (lv_name_1_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:148:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePreferencesBlock264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPreferencesBlockAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPreferencesBlockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePreferencesBlock281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreferencesBlockAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:168:1: ( (lv_prefs_3_0= rulePreference ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:169:1: (lv_prefs_3_0= rulePreference )
            	    {
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:169:1: (lv_prefs_3_0= rulePreference )
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:170:3: lv_prefs_3_0= rulePreference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPreferencesBlockAccess().getPrefsPreferenceParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreference_in_rulePreferencesBlock302);
            	    lv_prefs_3_0=rulePreference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPreferencesBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"prefs",
            	              		lv_prefs_3_0, 
            	              		"Preference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePreferencesBlock315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPreferencesBlockAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "rulePreferencesBlock"


    // $ANTLR start "entryRulePreference"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:198:1: entryRulePreference returns [EObject current=null] : iv_rulePreference= rulePreference EOF ;
    public final EObject entryRulePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreference = null;


        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:199:2: (iv_rulePreference= rulePreference EOF )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:200:2: iv_rulePreference= rulePreference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreferenceRule()); 
            }
            pushFollow(FOLLOW_rulePreference_in_entryRulePreference351);
            iv_rulePreference=rulePreference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreference361); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:207:1: rulePreference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? ) ;
    public final EObject rulePreference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:210:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:211:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )?
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:211:2: ( (lv_name_0_0= RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:212:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:212:1: (lv_name_0_0= RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:213:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePreference403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPreferenceAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPreferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePreference420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPreferenceAccess().getColonKeyword_1());
                  
            }
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:233:1: ( (lv_type_2_0= rulePreferenceType ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:234:1: (lv_type_2_0= rulePreferenceType )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:234:1: (lv_type_2_0= rulePreferenceType )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:235:3: lv_type_2_0= rulePreferenceType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreferenceAccess().getTypePreferenceTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePreferenceType_in_rulePreference441);
            lv_type_2_0=rulePreferenceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPreferenceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"PreferenceType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:251:2: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:251:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePreference454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPreferenceAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:255:1: ( (lv_defaultValue_4_0= ruleLiteral ) )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:256:1: (lv_defaultValue_4_0= ruleLiteral )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:256:1: (lv_defaultValue_4_0= ruleLiteral )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:257:3: lv_defaultValue_4_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreferenceAccess().getDefaultValueLiteralParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePreference475);
                    lv_defaultValue_4_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_4_0, 
                              		"Literal");
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
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleLiteral"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:281:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:282:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:283:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral513);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral523); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:290:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_3_0=null;
        Enumerator lv_literal_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:293:28: ( ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:294:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:294:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_NUMBER:
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:294:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:294:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:294:3: () ( (lv_literal_1_0= ruleBooleanValue ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:294:3: ()
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:295:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:300:2: ( (lv_literal_1_0= ruleBooleanValue ) )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:301:1: (lv_literal_1_0= ruleBooleanValue )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:301:1: (lv_literal_1_0= ruleBooleanValue )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:302:3: lv_literal_1_0= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteral579);
                    lv_literal_1_0=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_1_0, 
                              		"BooleanValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:319:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:319:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:319:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:319:7: ()
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:320:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:325:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:326:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:326:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:327:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_literal_3_0, grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralRule());
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
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:344:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:344:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:344:7: () ( (lv_literal_5_0= ruleSignedNumber ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:344:7: ()
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:345:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:350:2: ( (lv_literal_5_0= ruleSignedNumber ) )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:351:1: (lv_literal_5_0= ruleSignedNumber )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:351:1: (lv_literal_5_0= ruleSignedNumber )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:352:3: lv_literal_5_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteral656);
                    lv_literal_5_0=ruleSignedNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_5_0, 
                              		"SignedNumber");
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:376:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:377:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:378:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber694);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber705); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:385:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:388:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:389:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:389:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:389:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:389:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:390:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleSignedNumber744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber761); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:410:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:411:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:412:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN807);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN818); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:419:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:422:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:423:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:423:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:423:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:430:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) && (synpred1_InternalSharedPreferencesModel())) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:430:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:430:2: ( ( '.' )=>kw= '.' )
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:430:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleFQN886); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN902); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rulePreferenceType"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:453:1: rulePreferenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) ) ;
    public final Enumerator rulePreferenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:455:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:456:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:456:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:456:2: (enumLiteral_0= 'String' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:456:2: (enumLiteral_0= 'String' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:456:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_rulePreferenceType963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:462:6: (enumLiteral_1= 'int' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:462:6: (enumLiteral_1= 'int' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:462:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_21_in_rulePreferenceType980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:468:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:468:6: (enumLiteral_2= 'boolean' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:468:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_22_in_rulePreferenceType997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:474:6: (enumLiteral_3= 'float' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:474:6: (enumLiteral_3= 'float' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:474:8: enumLiteral_3= 'float'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_23_in_rulePreferenceType1014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:480:6: (enumLiteral_4= 'long' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:480:6: (enumLiteral_4= 'long' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:480:8: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_24_in_rulePreferenceType1031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getPreferenceTypeAccess().getLongEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "rulePreferenceType"


    // $ANTLR start "ruleBooleanValue"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:490:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:492:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:493:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:493:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:493:2: (enumLiteral_0= 'true' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:493:2: (enumLiteral_0= 'true' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:493:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleBooleanValue1076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:499:6: (enumLiteral_1= 'false' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:499:6: (enumLiteral_1= 'false' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:499:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleBooleanValue1093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleBooleanValue"

    // $ANTLR start synpred1_InternalSharedPreferencesModel
    public final void synpred1_InternalSharedPreferencesModel_fragment() throws RecognitionException {   
        // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:430:3: ( '.' )
        // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:431:2: '.'
        {
        match(input,19,FOLLOW_19_in_synpred1_InternalSharedPreferencesModel877); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSharedPreferencesModel

    // Delegated rules

    public final boolean synpred1_InternalSharedPreferencesModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSharedPreferencesModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rulePreferencesBlock_in_ruleModel164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferencesBlock_in_entryRulePreferencesBlock200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferencesBlock210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePreferencesBlock247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreferencesBlock264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePreferencesBlock281 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rulePreference_in_rulePreferencesBlock302 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_rulePreferencesBlock315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreference_in_entryRulePreference351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreference361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreference403 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePreference420 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_rulePreferenceType_in_rulePreference441 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_rulePreference454 = new BitSet(new long[]{0x0000000006040060L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePreference475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteral579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteral656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSignedNumber744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN858 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFQN886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN902 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_20_in_rulePreferenceType963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePreferenceType980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePreferenceType997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePreferenceType1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePreferenceType1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBooleanValue1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBooleanValue1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred1_InternalSharedPreferencesModel877 = new BitSet(new long[]{0x0000000000000002L});

}