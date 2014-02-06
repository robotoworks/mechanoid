package com.robotoworks.mechanoid.sharedprefs.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.robotoworks.mechanoid.sharedprefs.services.SharedPreferencesModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSharedPreferencesModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'int'", "'boolean'", "'float'", "'long'", "'true'", "'false'", "'package'", "'preferences'", "'{'", "'}'", "':'", "'='", "'-'", "'.'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_NUMBER=4;
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
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g"; }


     
     	private SharedPreferencesModelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SharedPreferencesModelGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:62:1: ( ruleModel EOF )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:77:1: ( rule__Model__Group__0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePreferencesBlock"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:89:1: entryRulePreferencesBlock : rulePreferencesBlock EOF ;
    public final void entryRulePreferencesBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:90:1: ( rulePreferencesBlock EOF )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:91:1: rulePreferencesBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockRule()); 
            }
            pushFollow(FOLLOW_rulePreferencesBlock_in_entryRulePreferencesBlock127);
            rulePreferencesBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreferencesBlock134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreferencesBlock"


    // $ANTLR start "rulePreferencesBlock"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:98:1: rulePreferencesBlock : ( ( rule__PreferencesBlock__Group__0 ) ) ;
    public final void rulePreferencesBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:102:2: ( ( ( rule__PreferencesBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:103:1: ( ( rule__PreferencesBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:103:1: ( ( rule__PreferencesBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:104:1: ( rule__PreferencesBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getGroup()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:105:1: ( rule__PreferencesBlock__Group__0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:105:2: rule__PreferencesBlock__Group__0
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__0_in_rulePreferencesBlock160);
            rule__PreferencesBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreferencesBlock"


    // $ANTLR start "entryRulePreference"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:117:1: entryRulePreference : rulePreference EOF ;
    public final void entryRulePreference() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:118:1: ( rulePreference EOF )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:119:1: rulePreference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceRule()); 
            }
            pushFollow(FOLLOW_rulePreference_in_entryRulePreference187);
            rulePreference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreference194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:126:1: rulePreference : ( ( rule__Preference__Group__0 ) ) ;
    public final void rulePreference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:130:2: ( ( ( rule__Preference__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:131:1: ( ( rule__Preference__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:131:1: ( ( rule__Preference__Group__0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:132:1: ( rule__Preference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getGroup()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:133:1: ( rule__Preference__Group__0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:133:2: rule__Preference__Group__0
            {
            pushFollow(FOLLOW_rule__Preference__Group__0_in_rulePreference220);
            rule__Preference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleLiteral"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:145:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:146:1: ( ruleLiteral EOF )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:147:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral247);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:154:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:158:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:159:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:159:1: ( ( rule__Literal__Alternatives ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:160:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:161:1: ( rule__Literal__Alternatives )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:161:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral280);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:173:1: entryRuleSignedNumber : ruleSignedNumber EOF ;
    public final void entryRuleSignedNumber() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:174:1: ( ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:175:1: ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber307);
            ruleSignedNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedNumberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignedNumber"


    // $ANTLR start "ruleSignedNumber"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:182:1: ruleSignedNumber : ( ( rule__SignedNumber__Group__0 ) ) ;
    public final void ruleSignedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:186:2: ( ( ( rule__SignedNumber__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:187:1: ( ( rule__SignedNumber__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:187:1: ( ( rule__SignedNumber__Group__0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:188:1: ( rule__SignedNumber__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedNumberAccess().getGroup()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:189:1: ( rule__SignedNumber__Group__0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:189:2: rule__SignedNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber340);
            rule__SignedNumber__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedNumberAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignedNumber"


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:201:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:202:1: ( ruleFQN EOF )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:203:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN367);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:210:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:214:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:215:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:215:1: ( ( rule__FQN__Group__0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:216:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:217:1: ( rule__FQN__Group__0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:217:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN400);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rulePreferenceType"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:230:1: rulePreferenceType : ( ( rule__PreferenceType__Alternatives ) ) ;
    public final void rulePreferenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:234:1: ( ( ( rule__PreferenceType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:235:1: ( ( rule__PreferenceType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:235:1: ( ( rule__PreferenceType__Alternatives ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:236:1: ( rule__PreferenceType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceTypeAccess().getAlternatives()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:237:1: ( rule__PreferenceType__Alternatives )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:237:2: rule__PreferenceType__Alternatives
            {
            pushFollow(FOLLOW_rule__PreferenceType__Alternatives_in_rulePreferenceType437);
            rule__PreferenceType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreferenceType"


    // $ANTLR start "ruleBooleanValue"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:249:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:253:1: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:254:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:254:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:255:1: ( rule__BooleanValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:256:1: ( rule__BooleanValue__Alternatives )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:256:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue473);
            rule__BooleanValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:267:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:271:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case RULE_NUMBER:
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:272:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:272:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:273:1: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:274:1: ( rule__Literal__Group_0__0 )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:274:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives508);
                    rule__Literal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:278:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:278:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:279:1: ( rule__Literal__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:280:1: ( rule__Literal__Group_1__0 )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:280:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives526);
                    rule__Literal__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:284:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:284:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:285:1: ( rule__Literal__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:286:1: ( rule__Literal__Group_2__0 )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:286:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives544);
                    rule__Literal__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__PreferenceType__Alternatives"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:295:1: rule__PreferenceType__Alternatives : ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) );
    public final void rule__PreferenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:299:1: ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:300:1: ( ( 'String' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:300:1: ( ( 'String' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:301:1: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:302:1: ( 'String' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:302:3: 'String'
                    {
                    match(input,12,FOLLOW_12_in_rule__PreferenceType__Alternatives578); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:307:6: ( ( 'int' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:307:6: ( ( 'int' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:308:1: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:309:1: ( 'int' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:309:3: 'int'
                    {
                    match(input,13,FOLLOW_13_in_rule__PreferenceType__Alternatives599); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:314:6: ( ( 'boolean' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:314:6: ( ( 'boolean' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:315:1: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:316:1: ( 'boolean' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:316:3: 'boolean'
                    {
                    match(input,14,FOLLOW_14_in_rule__PreferenceType__Alternatives620); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:321:6: ( ( 'float' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:321:6: ( ( 'float' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:322:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:323:1: ( 'float' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:323:3: 'float'
                    {
                    match(input,15,FOLLOW_15_in_rule__PreferenceType__Alternatives641); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:328:6: ( ( 'long' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:328:6: ( ( 'long' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:329:1: ( 'long' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getLongEnumLiteralDeclaration_4()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:330:1: ( 'long' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:330:3: 'long'
                    {
                    match(input,16,FOLLOW_16_in_rule__PreferenceType__Alternatives662); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getLongEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferenceType__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:340:1: rule__BooleanValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:344:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:345:1: ( ( 'true' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:345:1: ( ( 'true' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:346:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:347:1: ( 'true' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:347:3: 'true'
                    {
                    match(input,17,FOLLOW_17_in_rule__BooleanValue__Alternatives698); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:352:6: ( ( 'false' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:352:6: ( ( 'false' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:353:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:354:1: ( 'false' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:354:3: 'false'
                    {
                    match(input,18,FOLLOW_18_in_rule__BooleanValue__Alternatives719); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:366:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:370:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:371:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0752);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0755);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:378:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:382:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:383:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:383:1: ( 'package' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:384:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Model__Group__0__Impl783); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:397:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:401:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:402:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1814);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1817);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:409:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:413:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:414:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:414:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:415:1: ( rule__Model__PackageNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:416:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:416:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl844);
            rule__Model__PackageNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:426:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:430:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:431:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2874);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:437:1: rule__Model__Group__2__Impl : ( ( rule__Model__PreferencesBlockAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:441:1: ( ( ( rule__Model__PreferencesBlockAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:442:1: ( ( rule__Model__PreferencesBlockAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:442:1: ( ( rule__Model__PreferencesBlockAssignment_2 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:443:1: ( rule__Model__PreferencesBlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPreferencesBlockAssignment_2()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:444:1: ( rule__Model__PreferencesBlockAssignment_2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:444:2: rule__Model__PreferencesBlockAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__PreferencesBlockAssignment_2_in_rule__Model__Group__2__Impl901);
            rule__Model__PreferencesBlockAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPreferencesBlockAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__PreferencesBlock__Group__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:460:1: rule__PreferencesBlock__Group__0 : rule__PreferencesBlock__Group__0__Impl rule__PreferencesBlock__Group__1 ;
    public final void rule__PreferencesBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:464:1: ( rule__PreferencesBlock__Group__0__Impl rule__PreferencesBlock__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:465:2: rule__PreferencesBlock__Group__0__Impl rule__PreferencesBlock__Group__1
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__0__Impl_in_rule__PreferencesBlock__Group__0937);
            rule__PreferencesBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__1_in_rule__PreferencesBlock__Group__0940);
            rule__PreferencesBlock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__0"


    // $ANTLR start "rule__PreferencesBlock__Group__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:472:1: rule__PreferencesBlock__Group__0__Impl : ( 'preferences' ) ;
    public final void rule__PreferencesBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:476:1: ( ( 'preferences' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:477:1: ( 'preferences' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:477:1: ( 'preferences' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:478:1: 'preferences'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getPreferencesKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__PreferencesBlock__Group__0__Impl968); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getPreferencesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__0__Impl"


    // $ANTLR start "rule__PreferencesBlock__Group__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:491:1: rule__PreferencesBlock__Group__1 : rule__PreferencesBlock__Group__1__Impl rule__PreferencesBlock__Group__2 ;
    public final void rule__PreferencesBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:495:1: ( rule__PreferencesBlock__Group__1__Impl rule__PreferencesBlock__Group__2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:496:2: rule__PreferencesBlock__Group__1__Impl rule__PreferencesBlock__Group__2
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__1__Impl_in_rule__PreferencesBlock__Group__1999);
            rule__PreferencesBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__2_in_rule__PreferencesBlock__Group__11002);
            rule__PreferencesBlock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__1"


    // $ANTLR start "rule__PreferencesBlock__Group__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:503:1: rule__PreferencesBlock__Group__1__Impl : ( ( rule__PreferencesBlock__NameAssignment_1 ) ) ;
    public final void rule__PreferencesBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:507:1: ( ( ( rule__PreferencesBlock__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:508:1: ( ( rule__PreferencesBlock__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:508:1: ( ( rule__PreferencesBlock__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:509:1: ( rule__PreferencesBlock__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getNameAssignment_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:510:1: ( rule__PreferencesBlock__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:510:2: rule__PreferencesBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__NameAssignment_1_in_rule__PreferencesBlock__Group__1__Impl1029);
            rule__PreferencesBlock__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__1__Impl"


    // $ANTLR start "rule__PreferencesBlock__Group__2"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:520:1: rule__PreferencesBlock__Group__2 : rule__PreferencesBlock__Group__2__Impl rule__PreferencesBlock__Group__3 ;
    public final void rule__PreferencesBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:524:1: ( rule__PreferencesBlock__Group__2__Impl rule__PreferencesBlock__Group__3 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:525:2: rule__PreferencesBlock__Group__2__Impl rule__PreferencesBlock__Group__3
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__2__Impl_in_rule__PreferencesBlock__Group__21059);
            rule__PreferencesBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__3_in_rule__PreferencesBlock__Group__21062);
            rule__PreferencesBlock__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__2"


    // $ANTLR start "rule__PreferencesBlock__Group__2__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:532:1: rule__PreferencesBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__PreferencesBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:536:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:537:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:537:1: ( '{' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:538:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__PreferencesBlock__Group__2__Impl1090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__2__Impl"


    // $ANTLR start "rule__PreferencesBlock__Group__3"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:551:1: rule__PreferencesBlock__Group__3 : rule__PreferencesBlock__Group__3__Impl rule__PreferencesBlock__Group__4 ;
    public final void rule__PreferencesBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:555:1: ( rule__PreferencesBlock__Group__3__Impl rule__PreferencesBlock__Group__4 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:556:2: rule__PreferencesBlock__Group__3__Impl rule__PreferencesBlock__Group__4
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__3__Impl_in_rule__PreferencesBlock__Group__31121);
            rule__PreferencesBlock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__4_in_rule__PreferencesBlock__Group__31124);
            rule__PreferencesBlock__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__3"


    // $ANTLR start "rule__PreferencesBlock__Group__3__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:563:1: rule__PreferencesBlock__Group__3__Impl : ( ( rule__PreferencesBlock__PrefsAssignment_3 )* ) ;
    public final void rule__PreferencesBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:567:1: ( ( ( rule__PreferencesBlock__PrefsAssignment_3 )* ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:568:1: ( ( rule__PreferencesBlock__PrefsAssignment_3 )* )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:568:1: ( ( rule__PreferencesBlock__PrefsAssignment_3 )* )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:569:1: ( rule__PreferencesBlock__PrefsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getPrefsAssignment_3()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:570:1: ( rule__PreferencesBlock__PrefsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:570:2: rule__PreferencesBlock__PrefsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PreferencesBlock__PrefsAssignment_3_in_rule__PreferencesBlock__Group__3__Impl1151);
            	    rule__PreferencesBlock__PrefsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getPrefsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__3__Impl"


    // $ANTLR start "rule__PreferencesBlock__Group__4"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:580:1: rule__PreferencesBlock__Group__4 : rule__PreferencesBlock__Group__4__Impl ;
    public final void rule__PreferencesBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:584:1: ( rule__PreferencesBlock__Group__4__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:585:2: rule__PreferencesBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__4__Impl_in_rule__PreferencesBlock__Group__41182);
            rule__PreferencesBlock__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__4"


    // $ANTLR start "rule__PreferencesBlock__Group__4__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:591:1: rule__PreferencesBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PreferencesBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:595:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:596:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:596:1: ( '}' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:597:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__PreferencesBlock__Group__4__Impl1210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__Group__4__Impl"


    // $ANTLR start "rule__Preference__Group__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:620:1: rule__Preference__Group__0 : rule__Preference__Group__0__Impl rule__Preference__Group__1 ;
    public final void rule__Preference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:624:1: ( rule__Preference__Group__0__Impl rule__Preference__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:625:2: rule__Preference__Group__0__Impl rule__Preference__Group__1
            {
            pushFollow(FOLLOW_rule__Preference__Group__0__Impl_in_rule__Preference__Group__01251);
            rule__Preference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Preference__Group__1_in_rule__Preference__Group__01254);
            rule__Preference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__0"


    // $ANTLR start "rule__Preference__Group__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:632:1: rule__Preference__Group__0__Impl : ( ( rule__Preference__NameAssignment_0 ) ) ;
    public final void rule__Preference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:636:1: ( ( ( rule__Preference__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:637:1: ( ( rule__Preference__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:637:1: ( ( rule__Preference__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:638:1: ( rule__Preference__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getNameAssignment_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:639:1: ( rule__Preference__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:639:2: rule__Preference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Preference__NameAssignment_0_in_rule__Preference__Group__0__Impl1281);
            rule__Preference__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__0__Impl"


    // $ANTLR start "rule__Preference__Group__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:649:1: rule__Preference__Group__1 : rule__Preference__Group__1__Impl rule__Preference__Group__2 ;
    public final void rule__Preference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:653:1: ( rule__Preference__Group__1__Impl rule__Preference__Group__2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:654:2: rule__Preference__Group__1__Impl rule__Preference__Group__2
            {
            pushFollow(FOLLOW_rule__Preference__Group__1__Impl_in_rule__Preference__Group__11311);
            rule__Preference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Preference__Group__2_in_rule__Preference__Group__11314);
            rule__Preference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__1"


    // $ANTLR start "rule__Preference__Group__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:661:1: rule__Preference__Group__1__Impl : ( ':' ) ;
    public final void rule__Preference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:665:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:666:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:666:1: ( ':' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:667:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getColonKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Preference__Group__1__Impl1342); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__1__Impl"


    // $ANTLR start "rule__Preference__Group__2"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:680:1: rule__Preference__Group__2 : rule__Preference__Group__2__Impl rule__Preference__Group__3 ;
    public final void rule__Preference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:684:1: ( rule__Preference__Group__2__Impl rule__Preference__Group__3 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:685:2: rule__Preference__Group__2__Impl rule__Preference__Group__3
            {
            pushFollow(FOLLOW_rule__Preference__Group__2__Impl_in_rule__Preference__Group__21373);
            rule__Preference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Preference__Group__3_in_rule__Preference__Group__21376);
            rule__Preference__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__2"


    // $ANTLR start "rule__Preference__Group__2__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:692:1: rule__Preference__Group__2__Impl : ( ( rule__Preference__TypeAssignment_2 ) ) ;
    public final void rule__Preference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:696:1: ( ( ( rule__Preference__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:697:1: ( ( rule__Preference__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:697:1: ( ( rule__Preference__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:698:1: ( rule__Preference__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getTypeAssignment_2()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:699:1: ( rule__Preference__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:699:2: rule__Preference__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Preference__TypeAssignment_2_in_rule__Preference__Group__2__Impl1403);
            rule__Preference__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__2__Impl"


    // $ANTLR start "rule__Preference__Group__3"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:709:1: rule__Preference__Group__3 : rule__Preference__Group__3__Impl ;
    public final void rule__Preference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:713:1: ( rule__Preference__Group__3__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:714:2: rule__Preference__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Preference__Group__3__Impl_in_rule__Preference__Group__31433);
            rule__Preference__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__3"


    // $ANTLR start "rule__Preference__Group__3__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:720:1: rule__Preference__Group__3__Impl : ( ( rule__Preference__Group_3__0 )? ) ;
    public final void rule__Preference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:724:1: ( ( ( rule__Preference__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:725:1: ( ( rule__Preference__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:725:1: ( ( rule__Preference__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:726:1: ( rule__Preference__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getGroup_3()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:727:1: ( rule__Preference__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:727:2: rule__Preference__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Preference__Group_3__0_in_rule__Preference__Group__3__Impl1460);
                    rule__Preference__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__3__Impl"


    // $ANTLR start "rule__Preference__Group_3__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:745:1: rule__Preference__Group_3__0 : rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1 ;
    public final void rule__Preference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:749:1: ( rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:750:2: rule__Preference__Group_3__0__Impl rule__Preference__Group_3__1
            {
            pushFollow(FOLLOW_rule__Preference__Group_3__0__Impl_in_rule__Preference__Group_3__01499);
            rule__Preference__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Preference__Group_3__1_in_rule__Preference__Group_3__01502);
            rule__Preference__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group_3__0"


    // $ANTLR start "rule__Preference__Group_3__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:757:1: rule__Preference__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Preference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:761:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:762:1: ( '=' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:762:1: ( '=' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:763:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Preference__Group_3__0__Impl1530); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getEqualsSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group_3__0__Impl"


    // $ANTLR start "rule__Preference__Group_3__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:776:1: rule__Preference__Group_3__1 : rule__Preference__Group_3__1__Impl ;
    public final void rule__Preference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:780:1: ( rule__Preference__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:781:2: rule__Preference__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Preference__Group_3__1__Impl_in_rule__Preference__Group_3__11561);
            rule__Preference__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group_3__1"


    // $ANTLR start "rule__Preference__Group_3__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:787:1: rule__Preference__Group_3__1__Impl : ( ( rule__Preference__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__Preference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:791:1: ( ( ( rule__Preference__DefaultValueAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:792:1: ( ( rule__Preference__DefaultValueAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:792:1: ( ( rule__Preference__DefaultValueAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:793:1: ( rule__Preference__DefaultValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getDefaultValueAssignment_3_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:794:1: ( rule__Preference__DefaultValueAssignment_3_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:794:2: rule__Preference__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Preference__DefaultValueAssignment_3_1_in_rule__Preference__Group_3__1__Impl1588);
            rule__Preference__DefaultValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getDefaultValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group_3__1__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:808:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:812:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:813:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__01622);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__01625);
            rule__Literal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:820:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:824:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:825:1: ( () )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:825:1: ( () )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:826:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:827:1: ()
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:829:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:839:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:843:1: ( rule__Literal__Group_0__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:844:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__11683);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:850:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__LiteralAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:854:1: ( ( ( rule__Literal__LiteralAssignment_0_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:855:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:855:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:856:1: ( rule__Literal__LiteralAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:857:1: ( rule__Literal__LiteralAssignment_0_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:857:2: rule__Literal__LiteralAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl1710);
            rule__Literal__LiteralAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:871:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:875:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:876:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__01744);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__01747);
            rule__Literal__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:883:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:887:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:888:1: ( () )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:888:1: ( () )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:889:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:890:1: ()
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:892:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:902:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:906:1: ( rule__Literal__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:907:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__11805);
            rule__Literal__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:913:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__LiteralAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:917:1: ( ( ( rule__Literal__LiteralAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:918:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:918:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:919:1: ( rule__Literal__LiteralAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:920:1: ( rule__Literal__LiteralAssignment_1_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:920:2: rule__Literal__LiteralAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl1832);
            rule__Literal__LiteralAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:934:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:938:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:939:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__01866);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__01869);
            rule__Literal__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:946:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:950:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:951:1: ( () )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:951:1: ( () )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:952:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:953:1: ()
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:955:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:965:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:969:1: ( rule__Literal__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:970:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__11927);
            rule__Literal__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:976:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__LiteralAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:980:1: ( ( ( rule__Literal__LiteralAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:981:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:981:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:982:1: ( rule__Literal__LiteralAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:983:1: ( rule__Literal__LiteralAssignment_2_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:983:2: rule__Literal__LiteralAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl1954);
            rule__Literal__LiteralAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__SignedNumber__Group__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:997:1: rule__SignedNumber__Group__0 : rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 ;
    public final void rule__SignedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1001:1: ( rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1002:2: rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__01988);
            rule__SignedNumber__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__01991);
            rule__SignedNumber__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__0"


    // $ANTLR start "rule__SignedNumber__Group__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1009:1: rule__SignedNumber__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1013:1: ( ( ( '-' )? ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1014:1: ( ( '-' )? )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1014:1: ( ( '-' )? )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1015:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1016:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1017:2: '-'
                    {
                    match(input,25,FOLLOW_25_in_rule__SignedNumber__Group__0__Impl2020); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__0__Impl"


    // $ANTLR start "rule__SignedNumber__Group__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1028:1: rule__SignedNumber__Group__1 : rule__SignedNumber__Group__1__Impl ;
    public final void rule__SignedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1032:1: ( rule__SignedNumber__Group__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1033:2: rule__SignedNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__12053);
            rule__SignedNumber__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__1"


    // $ANTLR start "rule__SignedNumber__Group__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1039:1: rule__SignedNumber__Group__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__SignedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1043:1: ( ( RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1044:1: ( RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1044:1: ( RULE_NUMBER )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1045:1: RULE_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
            }
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl2080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1060:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1064:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1065:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02113);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02116);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1072:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1076:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1077:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1077:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1078:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2143); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1089:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1093:1: ( rule__FQN__Group__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1094:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12172);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1100:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1104:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1105:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1105:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1106:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1107:1: ( rule__FQN__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1107:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2199);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1121:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1125:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1126:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02234);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02237);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1133:1: rule__FQN__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1137:1: ( ( ( '.' ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1138:1: ( ( '.' ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1138:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1139:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1140:1: ( '.' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1141:2: '.'
            {
            match(input,26,FOLLOW_26_in_rule__FQN__Group_1__0__Impl2266); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1152:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1156:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1157:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12298);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1163:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1167:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1168:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1168:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1169:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2325); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Model__PackageNameAssignment_1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1185:1: rule__Model__PackageNameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1189:1: ( ( ruleFQN ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1190:1: ( ruleFQN )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1190:1: ( ruleFQN )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1191:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_12363);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageNameAssignment_1"


    // $ANTLR start "rule__Model__PreferencesBlockAssignment_2"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1200:1: rule__Model__PreferencesBlockAssignment_2 : ( rulePreferencesBlock ) ;
    public final void rule__Model__PreferencesBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1204:1: ( ( rulePreferencesBlock ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1205:1: ( rulePreferencesBlock )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1205:1: ( rulePreferencesBlock )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1206:1: rulePreferencesBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPreferencesBlockPreferencesBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePreferencesBlock_in_rule__Model__PreferencesBlockAssignment_22394);
            rulePreferencesBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPreferencesBlockPreferencesBlockParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PreferencesBlockAssignment_2"


    // $ANTLR start "rule__PreferencesBlock__NameAssignment_1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1215:1: rule__PreferencesBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PreferencesBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1219:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1220:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1220:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1221:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PreferencesBlock__NameAssignment_12425); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__NameAssignment_1"


    // $ANTLR start "rule__PreferencesBlock__PrefsAssignment_3"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1230:1: rule__PreferencesBlock__PrefsAssignment_3 : ( rulePreference ) ;
    public final void rule__PreferencesBlock__PrefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1234:1: ( ( rulePreference ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1235:1: ( rulePreference )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1235:1: ( rulePreference )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1236:1: rulePreference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getPrefsPreferenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePreference_in_rule__PreferencesBlock__PrefsAssignment_32456);
            rulePreference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferencesBlockAccess().getPrefsPreferenceParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreferencesBlock__PrefsAssignment_3"


    // $ANTLR start "rule__Preference__NameAssignment_0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1245:1: rule__Preference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Preference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1249:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1250:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1250:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1251:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Preference__NameAssignment_02487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__NameAssignment_0"


    // $ANTLR start "rule__Preference__TypeAssignment_2"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1260:1: rule__Preference__TypeAssignment_2 : ( rulePreferenceType ) ;
    public final void rule__Preference__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1264:1: ( ( rulePreferenceType ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1265:1: ( rulePreferenceType )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1265:1: ( rulePreferenceType )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1266:1: rulePreferenceType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getTypePreferenceTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePreferenceType_in_rule__Preference__TypeAssignment_22518);
            rulePreferenceType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getTypePreferenceTypeEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__TypeAssignment_2"


    // $ANTLR start "rule__Preference__DefaultValueAssignment_3_1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1275:1: rule__Preference__DefaultValueAssignment_3_1 : ( ruleLiteral ) ;
    public final void rule__Preference__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1279:1: ( ( ruleLiteral ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1280:1: ( ruleLiteral )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1280:1: ( ruleLiteral )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1281:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getDefaultValueLiteralParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Preference__DefaultValueAssignment_3_12549);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getDefaultValueLiteralParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__DefaultValueAssignment_3_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_0_1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1290:1: rule__Literal__LiteralAssignment_0_1 : ( ruleBooleanValue ) ;
    public final void rule__Literal__LiteralAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1294:1: ( ( ruleBooleanValue ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1295:1: ( ruleBooleanValue )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1295:1: ( ruleBooleanValue )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1296:1: ruleBooleanValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_12580);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment_0_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_1_1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1305:1: rule__Literal__LiteralAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Literal__LiteralAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1309:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1310:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1310:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1311:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_12611); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment_1_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_2_1"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1320:1: rule__Literal__LiteralAssignment_2_1 : ( ruleSignedNumber ) ;
    public final void rule__Literal__LiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1324:1: ( ( ruleSignedNumber ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1325:1: ( ruleSignedNumber )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1325:1: ( ruleSignedNumber )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:1326:1: ruleSignedNumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_12642);
            ruleSignedNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferencesBlock_in_entryRulePreferencesBlock127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreferencesBlock134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__0_in_rulePreferencesBlock160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreference_in_entryRulePreference187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreference194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__0_in_rulePreference220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferenceType__Alternatives_in_rulePreferenceType437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PreferenceType__Alternatives578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PreferenceType__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PreferenceType__Alternatives620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PreferenceType__Alternatives641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PreferenceType__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanValue__Alternatives698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanValue__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__0__Impl783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1814 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PreferencesBlockAssignment_2_in_rule__Model__Group__2__Impl901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__0__Impl_in_rule__PreferencesBlock__Group__0937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__1_in_rule__PreferencesBlock__Group__0940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PreferencesBlock__Group__0__Impl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__1__Impl_in_rule__PreferencesBlock__Group__1999 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__2_in_rule__PreferencesBlock__Group__11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__NameAssignment_1_in_rule__PreferencesBlock__Group__1__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__2__Impl_in_rule__PreferencesBlock__Group__21059 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__3_in_rule__PreferencesBlock__Group__21062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PreferencesBlock__Group__2__Impl1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__3__Impl_in_rule__PreferencesBlock__Group__31121 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__4_in_rule__PreferencesBlock__Group__31124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__PrefsAssignment_3_in_rule__PreferencesBlock__Group__3__Impl1151 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__4__Impl_in_rule__PreferencesBlock__Group__41182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PreferencesBlock__Group__4__Impl1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__0__Impl_in_rule__Preference__Group__01251 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Preference__Group__1_in_rule__Preference__Group__01254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__NameAssignment_0_in_rule__Preference__Group__0__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__1__Impl_in_rule__Preference__Group__11311 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Preference__Group__2_in_rule__Preference__Group__11314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Preference__Group__1__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__2__Impl_in_rule__Preference__Group__21373 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Preference__Group__3_in_rule__Preference__Group__21376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__TypeAssignment_2_in_rule__Preference__Group__2__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__3__Impl_in_rule__Preference__Group__31433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group_3__0_in_rule__Preference__Group__3__Impl1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group_3__0__Impl_in_rule__Preference__Group_3__01499 = new BitSet(new long[]{0x0000000002060050L});
    public static final BitSet FOLLOW_rule__Preference__Group_3__1_in_rule__Preference__Group_3__01502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Preference__Group_3__0__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group_3__1__Impl_in_rule__Preference__Group_3__11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__DefaultValueAssignment_3_1_in_rule__Preference__Group_3__1__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__01622 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__01625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__11683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__01744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__01747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__01866 = new BitSet(new long[]{0x0000000002060050L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__01869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__01988 = new BitSet(new long[]{0x0000000002060050L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SignedNumber__Group__0__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02113 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2199 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FQN__Group_1__0__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferencesBlock_in_rule__Model__PreferencesBlockAssignment_22394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PreferencesBlock__NameAssignment_12425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreference_in_rule__PreferencesBlock__PrefsAssignment_32456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Preference__NameAssignment_02487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceType_in_rule__Preference__TypeAssignment_22518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Preference__DefaultValueAssignment_3_12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_12580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_12611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_12642 = new BitSet(new long[]{0x0000000000000002L});

}