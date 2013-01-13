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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'preferences'", "'{'", "'}'", "':'", "'.'", "'String'", "'int'", "'boolean'", "'float'", "'long'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePreferencesBlock247); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePreferencesBlock281); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePreferencesBlock315); if (state.failed) return current;
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
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:207:1: rulePreference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) ) ;
    public final EObject rulePreference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:210:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:211:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= rulePreferenceType ) )
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePreference420); if (state.failed) return current;
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:259:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:260:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:261:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN478);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN489); if (state.failed) return current;

            }

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
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:268:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:271:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:272:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:272:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:272:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:279:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) && (synpred1_InternalSharedPreferencesModel())) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:279:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:279:2: ( ( '.' )=>kw= '.' )
            	    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:279:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleFQN557); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN573); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:302:1: rulePreferenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) ) ;
    public final Enumerator rulePreferenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:304:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:305:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:305:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'float' ) | (enumLiteral_4= 'long' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
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
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:305:2: (enumLiteral_0= 'String' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:305:2: (enumLiteral_0= 'String' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:305:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_rulePreferenceType634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:311:6: (enumLiteral_1= 'int' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:311:6: (enumLiteral_1= 'int' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:311:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_rulePreferenceType651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:317:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:317:6: (enumLiteral_2= 'boolean' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:317:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_19_in_rulePreferenceType668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:323:6: (enumLiteral_3= 'float' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:323:6: (enumLiteral_3= 'float' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:323:8: enumLiteral_3= 'float'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_20_in_rulePreferenceType685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:329:6: (enumLiteral_4= 'long' )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:329:6: (enumLiteral_4= 'long' )
                    // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:329:8: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_21_in_rulePreferenceType702); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSharedPreferencesModel
    public final void synpred1_InternalSharedPreferencesModel_fragment() throws RecognitionException {   
        // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:279:3: ( '.' )
        // ../com.robotoworks.mechanoid.sharedprefs/src-gen/com/robotoworks/mechanoid/sharedprefs/parser/antlr/internal/InternalSharedPreferencesModel.g:280:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred1_InternalSharedPreferencesModel548); if (state.failed) return ;

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
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePreferencesBlock_in_ruleModel164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferencesBlock_in_entryRulePreferencesBlock200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferencesBlock210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePreferencesBlock247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreferencesBlock264 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePreferencesBlock281 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rulePreference_in_rulePreferencesBlock302 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_rulePreferencesBlock315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreference_in_entryRulePreference351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreference361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreference403 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePreference420 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_rulePreferenceType_in_rulePreference441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN529 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleFQN557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN573 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17_in_rulePreferenceType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePreferenceType651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePreferenceType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePreferenceType685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePreferenceType702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_InternalSharedPreferencesModel548 = new BitSet(new long[]{0x0000000000000002L});

}