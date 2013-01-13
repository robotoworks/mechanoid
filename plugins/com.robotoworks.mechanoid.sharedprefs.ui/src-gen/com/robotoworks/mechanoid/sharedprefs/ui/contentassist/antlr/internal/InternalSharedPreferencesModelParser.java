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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'int'", "'boolean'", "'float'", "'long'", "'package'", "'preferences'", "'{'", "'}'", "':'", "'.'"
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


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:145:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:146:1: ( ruleFQN EOF )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:147:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN247);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN254); if (state.failed) return ;

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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:154:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:158:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:159:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:159:1: ( ( rule__FQN__Group__0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:160:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:161:1: ( rule__FQN__Group__0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:161:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN280);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:174:1: rulePreferenceType : ( ( rule__PreferenceType__Alternatives ) ) ;
    public final void rulePreferenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:178:1: ( ( ( rule__PreferenceType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:179:1: ( ( rule__PreferenceType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:179:1: ( ( rule__PreferenceType__Alternatives ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:180:1: ( rule__PreferenceType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceTypeAccess().getAlternatives()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:181:1: ( rule__PreferenceType__Alternatives )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:181:2: rule__PreferenceType__Alternatives
            {
            pushFollow(FOLLOW_rule__PreferenceType__Alternatives_in_rulePreferenceType317);
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


    // $ANTLR start "rule__PreferenceType__Alternatives"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:192:1: rule__PreferenceType__Alternatives : ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) );
    public final void rule__PreferenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:196:1: ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
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
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:197:1: ( ( 'String' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:197:1: ( ( 'String' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:198:1: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:199:1: ( 'String' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:199:3: 'String'
                    {
                    match(input,11,FOLLOW_11_in_rule__PreferenceType__Alternatives353); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:204:6: ( ( 'int' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:204:6: ( ( 'int' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:205:1: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:206:1: ( 'int' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:206:3: 'int'
                    {
                    match(input,12,FOLLOW_12_in_rule__PreferenceType__Alternatives374); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:211:6: ( ( 'boolean' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:211:6: ( ( 'boolean' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:212:1: ( 'boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:213:1: ( 'boolean' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:213:3: 'boolean'
                    {
                    match(input,13,FOLLOW_13_in_rule__PreferenceType__Alternatives395); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:218:6: ( ( 'float' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:218:6: ( ( 'float' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:219:1: ( 'float' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:220:1: ( 'float' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:220:3: 'float'
                    {
                    match(input,14,FOLLOW_14_in_rule__PreferenceType__Alternatives416); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPreferenceTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:225:6: ( ( 'long' ) )
                    {
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:225:6: ( ( 'long' ) )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:226:1: ( 'long' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPreferenceTypeAccess().getLongEnumLiteralDeclaration_4()); 
                    }
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:227:1: ( 'long' )
                    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:227:3: 'long'
                    {
                    match(input,15,FOLLOW_15_in_rule__PreferenceType__Alternatives437); if (state.failed) return ;

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


    // $ANTLR start "rule__Model__Group__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:239:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:243:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:244:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0470);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0473);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:251:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:255:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:256:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:256:1: ( 'package' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:257:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Model__Group__0__Impl501); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:270:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:274:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:275:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1532);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1535);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:282:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:286:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:287:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:287:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:288:1: ( rule__Model__PackageNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:289:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:289:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl562);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:299:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:303:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:304:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2592);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:310:1: rule__Model__Group__2__Impl : ( ( rule__Model__PreferencesBlockAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:314:1: ( ( ( rule__Model__PreferencesBlockAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:315:1: ( ( rule__Model__PreferencesBlockAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:315:1: ( ( rule__Model__PreferencesBlockAssignment_2 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:316:1: ( rule__Model__PreferencesBlockAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPreferencesBlockAssignment_2()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:317:1: ( rule__Model__PreferencesBlockAssignment_2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:317:2: rule__Model__PreferencesBlockAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__PreferencesBlockAssignment_2_in_rule__Model__Group__2__Impl619);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:333:1: rule__PreferencesBlock__Group__0 : rule__PreferencesBlock__Group__0__Impl rule__PreferencesBlock__Group__1 ;
    public final void rule__PreferencesBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:337:1: ( rule__PreferencesBlock__Group__0__Impl rule__PreferencesBlock__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:338:2: rule__PreferencesBlock__Group__0__Impl rule__PreferencesBlock__Group__1
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__0__Impl_in_rule__PreferencesBlock__Group__0655);
            rule__PreferencesBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__1_in_rule__PreferencesBlock__Group__0658);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:345:1: rule__PreferencesBlock__Group__0__Impl : ( 'preferences' ) ;
    public final void rule__PreferencesBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:349:1: ( ( 'preferences' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:350:1: ( 'preferences' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:350:1: ( 'preferences' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:351:1: 'preferences'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getPreferencesKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__PreferencesBlock__Group__0__Impl686); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:364:1: rule__PreferencesBlock__Group__1 : rule__PreferencesBlock__Group__1__Impl rule__PreferencesBlock__Group__2 ;
    public final void rule__PreferencesBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:368:1: ( rule__PreferencesBlock__Group__1__Impl rule__PreferencesBlock__Group__2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:369:2: rule__PreferencesBlock__Group__1__Impl rule__PreferencesBlock__Group__2
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__1__Impl_in_rule__PreferencesBlock__Group__1717);
            rule__PreferencesBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__2_in_rule__PreferencesBlock__Group__1720);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:376:1: rule__PreferencesBlock__Group__1__Impl : ( ( rule__PreferencesBlock__NameAssignment_1 ) ) ;
    public final void rule__PreferencesBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:380:1: ( ( ( rule__PreferencesBlock__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:381:1: ( ( rule__PreferencesBlock__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:381:1: ( ( rule__PreferencesBlock__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:382:1: ( rule__PreferencesBlock__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getNameAssignment_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:383:1: ( rule__PreferencesBlock__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:383:2: rule__PreferencesBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__NameAssignment_1_in_rule__PreferencesBlock__Group__1__Impl747);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:393:1: rule__PreferencesBlock__Group__2 : rule__PreferencesBlock__Group__2__Impl rule__PreferencesBlock__Group__3 ;
    public final void rule__PreferencesBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:397:1: ( rule__PreferencesBlock__Group__2__Impl rule__PreferencesBlock__Group__3 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:398:2: rule__PreferencesBlock__Group__2__Impl rule__PreferencesBlock__Group__3
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__2__Impl_in_rule__PreferencesBlock__Group__2777);
            rule__PreferencesBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__3_in_rule__PreferencesBlock__Group__2780);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:405:1: rule__PreferencesBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__PreferencesBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:409:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:410:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:410:1: ( '{' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:411:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__PreferencesBlock__Group__2__Impl808); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:424:1: rule__PreferencesBlock__Group__3 : rule__PreferencesBlock__Group__3__Impl rule__PreferencesBlock__Group__4 ;
    public final void rule__PreferencesBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:428:1: ( rule__PreferencesBlock__Group__3__Impl rule__PreferencesBlock__Group__4 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:429:2: rule__PreferencesBlock__Group__3__Impl rule__PreferencesBlock__Group__4
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__3__Impl_in_rule__PreferencesBlock__Group__3839);
            rule__PreferencesBlock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__4_in_rule__PreferencesBlock__Group__3842);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:436:1: rule__PreferencesBlock__Group__3__Impl : ( ( rule__PreferencesBlock__PrefsAssignment_3 )* ) ;
    public final void rule__PreferencesBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:440:1: ( ( ( rule__PreferencesBlock__PrefsAssignment_3 )* ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:441:1: ( ( rule__PreferencesBlock__PrefsAssignment_3 )* )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:441:1: ( ( rule__PreferencesBlock__PrefsAssignment_3 )* )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:442:1: ( rule__PreferencesBlock__PrefsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getPrefsAssignment_3()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:443:1: ( rule__PreferencesBlock__PrefsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:443:2: rule__PreferencesBlock__PrefsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PreferencesBlock__PrefsAssignment_3_in_rule__PreferencesBlock__Group__3__Impl869);
            	    rule__PreferencesBlock__PrefsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:453:1: rule__PreferencesBlock__Group__4 : rule__PreferencesBlock__Group__4__Impl ;
    public final void rule__PreferencesBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:457:1: ( rule__PreferencesBlock__Group__4__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:458:2: rule__PreferencesBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PreferencesBlock__Group__4__Impl_in_rule__PreferencesBlock__Group__4900);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:464:1: rule__PreferencesBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__PreferencesBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:468:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:469:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:469:1: ( '}' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:470:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__PreferencesBlock__Group__4__Impl928); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:493:1: rule__Preference__Group__0 : rule__Preference__Group__0__Impl rule__Preference__Group__1 ;
    public final void rule__Preference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:497:1: ( rule__Preference__Group__0__Impl rule__Preference__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:498:2: rule__Preference__Group__0__Impl rule__Preference__Group__1
            {
            pushFollow(FOLLOW_rule__Preference__Group__0__Impl_in_rule__Preference__Group__0969);
            rule__Preference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Preference__Group__1_in_rule__Preference__Group__0972);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:505:1: rule__Preference__Group__0__Impl : ( ( rule__Preference__NameAssignment_0 ) ) ;
    public final void rule__Preference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:509:1: ( ( ( rule__Preference__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:510:1: ( ( rule__Preference__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:510:1: ( ( rule__Preference__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:511:1: ( rule__Preference__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getNameAssignment_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:512:1: ( rule__Preference__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:512:2: rule__Preference__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Preference__NameAssignment_0_in_rule__Preference__Group__0__Impl999);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:522:1: rule__Preference__Group__1 : rule__Preference__Group__1__Impl rule__Preference__Group__2 ;
    public final void rule__Preference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:526:1: ( rule__Preference__Group__1__Impl rule__Preference__Group__2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:527:2: rule__Preference__Group__1__Impl rule__Preference__Group__2
            {
            pushFollow(FOLLOW_rule__Preference__Group__1__Impl_in_rule__Preference__Group__11029);
            rule__Preference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Preference__Group__2_in_rule__Preference__Group__11032);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:534:1: rule__Preference__Group__1__Impl : ( ':' ) ;
    public final void rule__Preference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:538:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:539:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:539:1: ( ':' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:540:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getColonKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Preference__Group__1__Impl1060); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:553:1: rule__Preference__Group__2 : rule__Preference__Group__2__Impl ;
    public final void rule__Preference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:557:1: ( rule__Preference__Group__2__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:558:2: rule__Preference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Preference__Group__2__Impl_in_rule__Preference__Group__21091);
            rule__Preference__Group__2__Impl();

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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:564:1: rule__Preference__Group__2__Impl : ( ( rule__Preference__TypeAssignment_2 ) ) ;
    public final void rule__Preference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:568:1: ( ( ( rule__Preference__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:569:1: ( ( rule__Preference__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:569:1: ( ( rule__Preference__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:570:1: ( rule__Preference__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getTypeAssignment_2()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:571:1: ( rule__Preference__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:571:2: rule__Preference__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Preference__TypeAssignment_2_in_rule__Preference__Group__2__Impl1118);
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


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:587:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:591:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:592:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01154);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01157);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:599:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:603:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:604:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:604:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:605:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1184); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:616:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:620:1: ( rule__FQN__Group__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:621:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11213);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:627:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:631:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:632:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:632:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:633:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:634:1: ( rule__FQN__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:634:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1240);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:648:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:652:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:653:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01275);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01278);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:660:1: rule__FQN__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:664:1: ( ( ( '.' ) ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:665:1: ( ( '.' ) )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:665:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:666:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:667:1: ( '.' )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:668:2: '.'
            {
            match(input,21,FOLLOW_21_in_rule__FQN__Group_1__0__Impl1307); if (state.failed) return ;

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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:679:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:683:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:684:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11339);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:690:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:694:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:695:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:695:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:696:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1366); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:712:1: rule__Model__PackageNameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:716:1: ( ( ruleFQN ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:717:1: ( ruleFQN )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:717:1: ( ruleFQN )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:718:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_11404);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:727:1: rule__Model__PreferencesBlockAssignment_2 : ( rulePreferencesBlock ) ;
    public final void rule__Model__PreferencesBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:731:1: ( ( rulePreferencesBlock ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:732:1: ( rulePreferencesBlock )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:732:1: ( rulePreferencesBlock )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:733:1: rulePreferencesBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPreferencesBlockPreferencesBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePreferencesBlock_in_rule__Model__PreferencesBlockAssignment_21435);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:742:1: rule__PreferencesBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PreferencesBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:746:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:747:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:747:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:748:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PreferencesBlock__NameAssignment_11466); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:757:1: rule__PreferencesBlock__PrefsAssignment_3 : ( rulePreference ) ;
    public final void rule__PreferencesBlock__PrefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:761:1: ( ( rulePreference ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:762:1: ( rulePreference )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:762:1: ( rulePreference )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:763:1: rulePreference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferencesBlockAccess().getPrefsPreferenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePreference_in_rule__PreferencesBlock__PrefsAssignment_31497);
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:772:1: rule__Preference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Preference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:776:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:777:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:777:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:778:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Preference__NameAssignment_01528); if (state.failed) return ;
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
    // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:787:1: rule__Preference__TypeAssignment_2 : ( rulePreferenceType ) ;
    public final void rule__Preference__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:791:1: ( ( rulePreferenceType ) )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:792:1: ( rulePreferenceType )
            {
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:792:1: ( rulePreferenceType )
            // ../com.robotoworks.mechanoid.sharedprefs.ui/src-gen/com/robotoworks/mechanoid/sharedprefs/ui/contentassist/antlr/internal/InternalSharedPreferencesModel.g:793:1: rulePreferenceType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getTypePreferenceTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePreferenceType_in_rule__Preference__TypeAssignment_21559);
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
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferenceType__Alternatives_in_rulePreferenceType317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PreferenceType__Alternatives353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PreferenceType__Alternatives374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PreferenceType__Alternatives395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PreferenceType__Alternatives416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PreferenceType__Alternatives437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__0__Impl501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PreferencesBlockAssignment_2_in_rule__Model__Group__2__Impl619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__0__Impl_in_rule__PreferencesBlock__Group__0655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__1_in_rule__PreferencesBlock__Group__0658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PreferencesBlock__Group__0__Impl686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__1__Impl_in_rule__PreferencesBlock__Group__1717 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__2_in_rule__PreferencesBlock__Group__1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__NameAssignment_1_in_rule__PreferencesBlock__Group__1__Impl747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__2__Impl_in_rule__PreferencesBlock__Group__2777 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__3_in_rule__PreferencesBlock__Group__2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PreferencesBlock__Group__2__Impl808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__3__Impl_in_rule__PreferencesBlock__Group__3839 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__4_in_rule__PreferencesBlock__Group__3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__PrefsAssignment_3_in_rule__PreferencesBlock__Group__3__Impl869 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PreferencesBlock__Group__4__Impl_in_rule__PreferencesBlock__Group__4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PreferencesBlock__Group__4__Impl928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__0__Impl_in_rule__Preference__Group__0969 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Preference__Group__1_in_rule__Preference__Group__0972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__NameAssignment_0_in_rule__Preference__Group__0__Impl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__1__Impl_in_rule__Preference__Group__11029 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__Preference__Group__2_in_rule__Preference__Group__11032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Preference__Group__1__Impl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__Group__2__Impl_in_rule__Preference__Group__21091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preference__TypeAssignment_2_in_rule__Preference__Group__2__Impl1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01154 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1240 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FQN__Group_1__0__Impl1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_11404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferencesBlock_in_rule__Model__PreferencesBlockAssignment_21435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PreferencesBlock__NameAssignment_11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreference_in_rule__PreferencesBlock__PrefsAssignment_31497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Preference__NameAssignment_01528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreferenceType_in_rule__Preference__TypeAssignment_21559 = new BitSet(new long[]{0x0000000000000002L});

}