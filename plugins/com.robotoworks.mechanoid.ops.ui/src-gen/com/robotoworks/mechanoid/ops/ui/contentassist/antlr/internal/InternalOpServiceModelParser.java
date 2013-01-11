package com.robotoworks.mechanoid.ops.ui.contentassist.antlr.internal; 

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
import com.robotoworks.mechanoid.ops.services.OpServiceModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpServiceModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'String'", "'int'", "'float'", "'long'", "'Parcelable'", "'PendingIntent'", "'package'", "'service'", "'{'", "'}'", "'operation'", "'('", "')'", "','", "'with'", "'unique'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
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


        public InternalOpServiceModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOpServiceModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOpServiceModelParser.tokenNames; }
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g"; }


     
     	private OpServiceModelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OpServiceModelGrammarAccess grammarAccess) {
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:61:1: ( ruleModel EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:76:1: ( rule__Model__Group__0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleServiceBlock"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:88:1: entryRuleServiceBlock : ruleServiceBlock EOF ;
    public final void entryRuleServiceBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:89:1: ( ruleServiceBlock EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:90:1: ruleServiceBlock EOF
            {
             before(grammarAccess.getServiceBlockRule()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock121);
            ruleServiceBlock();

            state._fsp--;

             after(grammarAccess.getServiceBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceBlock128); 

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
    // $ANTLR end "entryRuleServiceBlock"


    // $ANTLR start "ruleServiceBlock"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:97:1: ruleServiceBlock : ( ( rule__ServiceBlock__Group__0 ) ) ;
    public final void ruleServiceBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:101:2: ( ( ( rule__ServiceBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:102:1: ( ( rule__ServiceBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:102:1: ( ( rule__ServiceBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:103:1: ( rule__ServiceBlock__Group__0 )
            {
             before(grammarAccess.getServiceBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:104:1: ( rule__ServiceBlock__Group__0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:104:2: rule__ServiceBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__0_in_ruleServiceBlock154);
            rule__ServiceBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceBlock"


    // $ANTLR start "entryRuleOperation"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:116:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:117:1: ( ruleOperation EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:118:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation181);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation188); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:125:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:129:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:130:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:130:1: ( ( rule__Operation__Group__0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:131:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:132:1: ( rule__Operation__Group__0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:132:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation214);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationArg"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:144:1: entryRuleOperationArg : ruleOperationArg EOF ;
    public final void entryRuleOperationArg() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:145:1: ( ruleOperationArg EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:146:1: ruleOperationArg EOF
            {
             before(grammarAccess.getOperationArgRule()); 
            pushFollow(FOLLOW_ruleOperationArg_in_entryRuleOperationArg241);
            ruleOperationArg();

            state._fsp--;

             after(grammarAccess.getOperationArgRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationArg248); 

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
    // $ANTLR end "entryRuleOperationArg"


    // $ANTLR start "ruleOperationArg"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:153:1: ruleOperationArg : ( ( rule__OperationArg__Group__0 ) ) ;
    public final void ruleOperationArg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:157:2: ( ( ( rule__OperationArg__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:158:1: ( ( rule__OperationArg__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:158:1: ( ( rule__OperationArg__Group__0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:159:1: ( rule__OperationArg__Group__0 )
            {
             before(grammarAccess.getOperationArgAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:160:1: ( rule__OperationArg__Group__0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:160:2: rule__OperationArg__Group__0
            {
            pushFollow(FOLLOW_rule__OperationArg__Group__0_in_ruleOperationArg274);
            rule__OperationArg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationArgAccess().getGroup()); 

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
    // $ANTLR end "ruleOperationArg"


    // $ANTLR start "entryRuleWithUniqueBlock"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:172:1: entryRuleWithUniqueBlock : ruleWithUniqueBlock EOF ;
    public final void entryRuleWithUniqueBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:173:1: ( ruleWithUniqueBlock EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:174:1: ruleWithUniqueBlock EOF
            {
             before(grammarAccess.getWithUniqueBlockRule()); 
            pushFollow(FOLLOW_ruleWithUniqueBlock_in_entryRuleWithUniqueBlock301);
            ruleWithUniqueBlock();

            state._fsp--;

             after(grammarAccess.getWithUniqueBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWithUniqueBlock308); 

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
    // $ANTLR end "entryRuleWithUniqueBlock"


    // $ANTLR start "ruleWithUniqueBlock"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:181:1: ruleWithUniqueBlock : ( ( rule__WithUniqueBlock__Group__0 ) ) ;
    public final void ruleWithUniqueBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:185:2: ( ( ( rule__WithUniqueBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:186:1: ( ( rule__WithUniqueBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:186:1: ( ( rule__WithUniqueBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:187:1: ( rule__WithUniqueBlock__Group__0 )
            {
             before(grammarAccess.getWithUniqueBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:188:1: ( rule__WithUniqueBlock__Group__0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:188:2: rule__WithUniqueBlock__Group__0
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__0_in_ruleWithUniqueBlock334);
            rule__WithUniqueBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWithUniqueBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleWithUniqueBlock"


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:200:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:201:1: ( ruleFQN EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:202:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN361);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN368); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:209:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:213:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:214:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:214:1: ( ( rule__FQN__Group__0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:215:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:216:1: ( rule__FQN__Group__0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:216:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN394);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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


    // $ANTLR start "ruleOpArgType"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:229:1: ruleOpArgType : ( ( rule__OpArgType__Alternatives ) ) ;
    public final void ruleOpArgType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:233:1: ( ( ( rule__OpArgType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:234:1: ( ( rule__OpArgType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:234:1: ( ( rule__OpArgType__Alternatives ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:235:1: ( rule__OpArgType__Alternatives )
            {
             before(grammarAccess.getOpArgTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:236:1: ( rule__OpArgType__Alternatives )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:236:2: rule__OpArgType__Alternatives
            {
            pushFollow(FOLLOW_rule__OpArgType__Alternatives_in_ruleOpArgType431);
            rule__OpArgType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpArgTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOpArgType"


    // $ANTLR start "rule__OpArgType__Alternatives"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:247:1: rule__OpArgType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) | ( ( 'Parcelable' ) ) | ( ( 'PendingIntent' ) ) );
    public final void rule__OpArgType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:251:1: ( ( ( 'boolean' ) ) | ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) | ( ( 'Parcelable' ) ) | ( ( 'PendingIntent' ) ) )
            int alt1=7;
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
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:252:1: ( ( 'boolean' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:252:1: ( ( 'boolean' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:253:1: ( 'boolean' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:254:1: ( 'boolean' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:254:3: 'boolean'
                    {
                    match(input,11,FOLLOW_11_in_rule__OpArgType__Alternatives467); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:259:6: ( ( 'String' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:259:6: ( ( 'String' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:260:1: ( 'String' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:261:1: ( 'String' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:261:3: 'String'
                    {
                    match(input,12,FOLLOW_12_in_rule__OpArgType__Alternatives488); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:266:6: ( ( 'int' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:266:6: ( ( 'int' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:267:1: ( 'int' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:268:1: ( 'int' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:268:3: 'int'
                    {
                    match(input,13,FOLLOW_13_in_rule__OpArgType__Alternatives509); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:273:6: ( ( 'float' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:273:6: ( ( 'float' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:274:1: ( 'float' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:275:1: ( 'float' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:275:3: 'float'
                    {
                    match(input,14,FOLLOW_14_in_rule__OpArgType__Alternatives530); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:280:6: ( ( 'long' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:280:6: ( ( 'long' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:281:1: ( 'long' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_4()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:282:1: ( 'long' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:282:3: 'long'
                    {
                    match(input,15,FOLLOW_15_in_rule__OpArgType__Alternatives551); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:287:6: ( ( 'Parcelable' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:287:6: ( ( 'Parcelable' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:288:1: ( 'Parcelable' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_5()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:289:1: ( 'Parcelable' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:289:3: 'Parcelable'
                    {
                    match(input,16,FOLLOW_16_in_rule__OpArgType__Alternatives572); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:294:6: ( ( 'PendingIntent' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:294:6: ( ( 'PendingIntent' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:295:1: ( 'PendingIntent' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getPendingIntentEnumLiteralDeclaration_6()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:296:1: ( 'PendingIntent' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:296:3: 'PendingIntent'
                    {
                    match(input,17,FOLLOW_17_in_rule__OpArgType__Alternatives593); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getPendingIntentEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__OpArgType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:308:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:312:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:313:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0626);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0629);
            rule__Model__Group__1();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:320:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:324:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:325:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:325:1: ( 'package' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:326:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__0__Impl657); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:339:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:343:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:344:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1688);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1691);
            rule__Model__Group__2();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:351:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:355:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:356:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:356:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:357:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:358:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:358:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl718);
            rule__Model__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:368:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:372:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:373:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2748);
            rule__Model__Group__2__Impl();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:379:1: rule__Model__Group__2__Impl : ( ( rule__Model__ServiceAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:383:1: ( ( ( rule__Model__ServiceAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:384:1: ( ( rule__Model__ServiceAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:384:1: ( ( rule__Model__ServiceAssignment_2 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:385:1: ( rule__Model__ServiceAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getServiceAssignment_2()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:386:1: ( rule__Model__ServiceAssignment_2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:386:2: rule__Model__ServiceAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__ServiceAssignment_2_in_rule__Model__Group__2__Impl775);
            rule__Model__ServiceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getServiceAssignment_2()); 

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


    // $ANTLR start "rule__ServiceBlock__Group__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:402:1: rule__ServiceBlock__Group__0 : rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 ;
    public final void rule__ServiceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:406:1: ( rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:407:2: rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__0811);
            rule__ServiceBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__0814);
            rule__ServiceBlock__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceBlock__Group__0"


    // $ANTLR start "rule__ServiceBlock__Group__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:414:1: rule__ServiceBlock__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:418:1: ( ( 'service' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:419:1: ( 'service' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:419:1: ( 'service' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:420:1: 'service'
            {
             before(grammarAccess.getServiceBlockAccess().getServiceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ServiceBlock__Group__0__Impl842); 
             after(grammarAccess.getServiceBlockAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__0__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:433:1: rule__ServiceBlock__Group__1 : rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 ;
    public final void rule__ServiceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:437:1: ( rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:438:2: rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__1873);
            rule__ServiceBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__1876);
            rule__ServiceBlock__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceBlock__Group__1"


    // $ANTLR start "rule__ServiceBlock__Group__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:445:1: rule__ServiceBlock__Group__1__Impl : ( ( rule__ServiceBlock__NameAssignment_1 ) ) ;
    public final void rule__ServiceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:449:1: ( ( ( rule__ServiceBlock__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:450:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:450:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:451:1: ( rule__ServiceBlock__NameAssignment_1 )
            {
             before(grammarAccess.getServiceBlockAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:452:1: ( rule__ServiceBlock__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:452:2: rule__ServiceBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl903);
            rule__ServiceBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__1__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__2"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:462:1: rule__ServiceBlock__Group__2 : rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 ;
    public final void rule__ServiceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:466:1: ( rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:467:2: rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__2933);
            rule__ServiceBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__2936);
            rule__ServiceBlock__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceBlock__Group__2"


    // $ANTLR start "rule__ServiceBlock__Group__2__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:474:1: rule__ServiceBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:478:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:479:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:479:1: ( '{' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:480:1: '{'
            {
             before(grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__ServiceBlock__Group__2__Impl964); 
             after(grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__2__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__3"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:493:1: rule__ServiceBlock__Group__3 : rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 ;
    public final void rule__ServiceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:497:1: ( rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:498:2: rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__3995);
            rule__ServiceBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__3998);
            rule__ServiceBlock__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceBlock__Group__3"


    // $ANTLR start "rule__ServiceBlock__Group__3__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:505:1: rule__ServiceBlock__Group__3__Impl : ( ( rule__ServiceBlock__OpsAssignment_3 )* ) ;
    public final void rule__ServiceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:509:1: ( ( ( rule__ServiceBlock__OpsAssignment_3 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:510:1: ( ( rule__ServiceBlock__OpsAssignment_3 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:510:1: ( ( rule__ServiceBlock__OpsAssignment_3 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:511:1: ( rule__ServiceBlock__OpsAssignment_3 )*
            {
             before(grammarAccess.getServiceBlockAccess().getOpsAssignment_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:512:1: ( rule__ServiceBlock__OpsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:512:2: rule__ServiceBlock__OpsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceBlock__OpsAssignment_3_in_rule__ServiceBlock__Group__3__Impl1025);
            	    rule__ServiceBlock__OpsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getServiceBlockAccess().getOpsAssignment_3()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__3__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__4"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:522:1: rule__ServiceBlock__Group__4 : rule__ServiceBlock__Group__4__Impl ;
    public final void rule__ServiceBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:526:1: ( rule__ServiceBlock__Group__4__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:527:2: rule__ServiceBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__41056);
            rule__ServiceBlock__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceBlock__Group__4"


    // $ANTLR start "rule__ServiceBlock__Group__4__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:533:1: rule__ServiceBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ServiceBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:537:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:538:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:538:1: ( '}' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:539:1: '}'
            {
             before(grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__ServiceBlock__Group__4__Impl1084); 
             after(grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:562:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:566:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:567:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01125);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01128);
            rule__Operation__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:574:1: rule__Operation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:578:1: ( ( 'operation' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:579:1: ( 'operation' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:579:1: ( 'operation' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:580:1: 'operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Operation__Group__0__Impl1156); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_0()); 

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
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:593:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:597:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:598:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11187);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11190);
            rule__Operation__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:605:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:609:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:610:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:610:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:611:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:612:1: ( rule__Operation__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:612:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1217);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:622:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:626:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:627:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21247);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__21250);
            rule__Operation__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:634:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:638:1: ( ( '(' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:639:1: ( '(' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:639:1: ( '(' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:640:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Operation__Group__2__Impl1278); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:653:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:657:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:658:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__31309);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__31312);
            rule__Operation__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:665:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:669:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:670:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:670:1: ( ( rule__Operation__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:671:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:672:1: ( rule__Operation__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=17)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:672:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl1339);
                    rule__Operation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:682:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:686:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:687:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__41370);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__41373);
            rule__Operation__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:694:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:698:1: ( ( ')' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:699:1: ( ')' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:699:1: ( ')' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:700:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Operation__Group__4__Impl1401); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:713:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:717:1: ( rule__Operation__Group__5__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:718:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__51432);
            rule__Operation__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:724:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__UniqueAssignment_5 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:728:1: ( ( ( rule__Operation__UniqueAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:729:1: ( ( rule__Operation__UniqueAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:729:1: ( ( rule__Operation__UniqueAssignment_5 )? )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:730:1: ( rule__Operation__UniqueAssignment_5 )?
            {
             before(grammarAccess.getOperationAccess().getUniqueAssignment_5()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:731:1: ( rule__Operation__UniqueAssignment_5 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:731:2: rule__Operation__UniqueAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Operation__UniqueAssignment_5_in_rule__Operation__Group__5__Impl1459);
                    rule__Operation__UniqueAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getUniqueAssignment_5()); 

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
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:753:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:757:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:758:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__01502);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__01505);
            rule__Operation__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:765:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__ArgsAssignment_3_0 ) ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:769:1: ( ( ( rule__Operation__ArgsAssignment_3_0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:770:1: ( ( rule__Operation__ArgsAssignment_3_0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:770:1: ( ( rule__Operation__ArgsAssignment_3_0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:771:1: ( rule__Operation__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getOperationAccess().getArgsAssignment_3_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:772:1: ( rule__Operation__ArgsAssignment_3_0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:772:2: rule__Operation__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Operation__ArgsAssignment_3_0_in_rule__Operation__Group_3__0__Impl1532);
            rule__Operation__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getArgsAssignment_3_0()); 

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
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:782:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:786:1: ( rule__Operation__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:787:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__11562);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:793:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__Group_3_1__0 )* ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:797:1: ( ( ( rule__Operation__Group_3_1__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:798:1: ( ( rule__Operation__Group_3_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:798:1: ( ( rule__Operation__Group_3_1__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:799:1: ( rule__Operation__Group_3_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_3_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:800:1: ( rule__Operation__Group_3_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:800:2: rule__Operation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl1589);
            	    rule__Operation__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_3_1__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:814:1: rule__Operation__Group_3_1__0 : rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 ;
    public final void rule__Operation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:818:1: ( rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:819:2: rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__01624);
            rule__Operation__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__01627);
            rule__Operation__Group_3_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group_3_1__0"


    // $ANTLR start "rule__Operation__Group_3_1__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:826:1: rule__Operation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:830:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:831:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:831:1: ( ',' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:832:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_3_1__0__Impl1655); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Operation__Group_3_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_3_1__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:845:1: rule__Operation__Group_3_1__1 : rule__Operation__Group_3_1__1__Impl ;
    public final void rule__Operation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:849:1: ( rule__Operation__Group_3_1__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:850:2: rule__Operation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__11686);
            rule__Operation__Group_3_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Operation__Group_3_1__1"


    // $ANTLR start "rule__Operation__Group_3_1__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:856:1: rule__Operation__Group_3_1__1__Impl : ( ( rule__Operation__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Operation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:860:1: ( ( ( rule__Operation__ArgsAssignment_3_1_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:861:1: ( ( rule__Operation__ArgsAssignment_3_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:861:1: ( ( rule__Operation__ArgsAssignment_3_1_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:862:1: ( rule__Operation__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getOperationAccess().getArgsAssignment_3_1_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:863:1: ( rule__Operation__ArgsAssignment_3_1_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:863:2: rule__Operation__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ArgsAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl1713);
            rule__Operation__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getArgsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Operation__Group_3_1__1__Impl"


    // $ANTLR start "rule__OperationArg__Group__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:877:1: rule__OperationArg__Group__0 : rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1 ;
    public final void rule__OperationArg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:881:1: ( rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:882:2: rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1
            {
            pushFollow(FOLLOW_rule__OperationArg__Group__0__Impl_in_rule__OperationArg__Group__01747);
            rule__OperationArg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationArg__Group__1_in_rule__OperationArg__Group__01750);
            rule__OperationArg__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__OperationArg__Group__0"


    // $ANTLR start "rule__OperationArg__Group__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:889:1: rule__OperationArg__Group__0__Impl : ( ( rule__OperationArg__TypeAssignment_0 ) ) ;
    public final void rule__OperationArg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:893:1: ( ( ( rule__OperationArg__TypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:894:1: ( ( rule__OperationArg__TypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:894:1: ( ( rule__OperationArg__TypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:895:1: ( rule__OperationArg__TypeAssignment_0 )
            {
             before(grammarAccess.getOperationArgAccess().getTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:896:1: ( rule__OperationArg__TypeAssignment_0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:896:2: rule__OperationArg__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__OperationArg__TypeAssignment_0_in_rule__OperationArg__Group__0__Impl1777);
            rule__OperationArg__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationArgAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__OperationArg__Group__0__Impl"


    // $ANTLR start "rule__OperationArg__Group__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:906:1: rule__OperationArg__Group__1 : rule__OperationArg__Group__1__Impl ;
    public final void rule__OperationArg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:910:1: ( rule__OperationArg__Group__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:911:2: rule__OperationArg__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OperationArg__Group__1__Impl_in_rule__OperationArg__Group__11807);
            rule__OperationArg__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__OperationArg__Group__1"


    // $ANTLR start "rule__OperationArg__Group__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:917:1: rule__OperationArg__Group__1__Impl : ( ( rule__OperationArg__NameAssignment_1 ) ) ;
    public final void rule__OperationArg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:921:1: ( ( ( rule__OperationArg__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:922:1: ( ( rule__OperationArg__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:922:1: ( ( rule__OperationArg__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:923:1: ( rule__OperationArg__NameAssignment_1 )
            {
             before(grammarAccess.getOperationArgAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:924:1: ( rule__OperationArg__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:924:2: rule__OperationArg__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationArg__NameAssignment_1_in_rule__OperationArg__Group__1__Impl1834);
            rule__OperationArg__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationArgAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__OperationArg__Group__1__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:938:1: rule__WithUniqueBlock__Group__0 : rule__WithUniqueBlock__Group__0__Impl rule__WithUniqueBlock__Group__1 ;
    public final void rule__WithUniqueBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:942:1: ( rule__WithUniqueBlock__Group__0__Impl rule__WithUniqueBlock__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:943:2: rule__WithUniqueBlock__Group__0__Impl rule__WithUniqueBlock__Group__1
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__0__Impl_in_rule__WithUniqueBlock__Group__01868);
            rule__WithUniqueBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__1_in_rule__WithUniqueBlock__Group__01871);
            rule__WithUniqueBlock__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group__0"


    // $ANTLR start "rule__WithUniqueBlock__Group__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:950:1: rule__WithUniqueBlock__Group__0__Impl : ( 'with' ) ;
    public final void rule__WithUniqueBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:954:1: ( ( 'with' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:955:1: ( 'with' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:955:1: ( 'with' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:956:1: 'with'
            {
             before(grammarAccess.getWithUniqueBlockAccess().getWithKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__WithUniqueBlock__Group__0__Impl1899); 
             after(grammarAccess.getWithUniqueBlockAccess().getWithKeyword_0()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group__0__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:969:1: rule__WithUniqueBlock__Group__1 : rule__WithUniqueBlock__Group__1__Impl rule__WithUniqueBlock__Group__2 ;
    public final void rule__WithUniqueBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:973:1: ( rule__WithUniqueBlock__Group__1__Impl rule__WithUniqueBlock__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:974:2: rule__WithUniqueBlock__Group__1__Impl rule__WithUniqueBlock__Group__2
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__1__Impl_in_rule__WithUniqueBlock__Group__11930);
            rule__WithUniqueBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__2_in_rule__WithUniqueBlock__Group__11933);
            rule__WithUniqueBlock__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group__1"


    // $ANTLR start "rule__WithUniqueBlock__Group__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:981:1: rule__WithUniqueBlock__Group__1__Impl : ( 'unique' ) ;
    public final void rule__WithUniqueBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:985:1: ( ( 'unique' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:986:1: ( 'unique' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:986:1: ( 'unique' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:987:1: 'unique'
            {
             before(grammarAccess.getWithUniqueBlockAccess().getUniqueKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__WithUniqueBlock__Group__1__Impl1961); 
             after(grammarAccess.getWithUniqueBlockAccess().getUniqueKeyword_1()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group__1__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group__2"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1000:1: rule__WithUniqueBlock__Group__2 : rule__WithUniqueBlock__Group__2__Impl rule__WithUniqueBlock__Group__3 ;
    public final void rule__WithUniqueBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1004:1: ( rule__WithUniqueBlock__Group__2__Impl rule__WithUniqueBlock__Group__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1005:2: rule__WithUniqueBlock__Group__2__Impl rule__WithUniqueBlock__Group__3
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__2__Impl_in_rule__WithUniqueBlock__Group__21992);
            rule__WithUniqueBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__3_in_rule__WithUniqueBlock__Group__21995);
            rule__WithUniqueBlock__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group__2"


    // $ANTLR start "rule__WithUniqueBlock__Group__2__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1012:1: rule__WithUniqueBlock__Group__2__Impl : ( '(' ) ;
    public final void rule__WithUniqueBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1016:1: ( ( '(' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1017:1: ( '(' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1017:1: ( '(' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1018:1: '('
            {
             before(grammarAccess.getWithUniqueBlockAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__WithUniqueBlock__Group__2__Impl2023); 
             after(grammarAccess.getWithUniqueBlockAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group__2__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group__3"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1031:1: rule__WithUniqueBlock__Group__3 : rule__WithUniqueBlock__Group__3__Impl rule__WithUniqueBlock__Group__4 ;
    public final void rule__WithUniqueBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1035:1: ( rule__WithUniqueBlock__Group__3__Impl rule__WithUniqueBlock__Group__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1036:2: rule__WithUniqueBlock__Group__3__Impl rule__WithUniqueBlock__Group__4
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__3__Impl_in_rule__WithUniqueBlock__Group__32054);
            rule__WithUniqueBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__4_in_rule__WithUniqueBlock__Group__32057);
            rule__WithUniqueBlock__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group__3"


    // $ANTLR start "rule__WithUniqueBlock__Group__3__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1043:1: rule__WithUniqueBlock__Group__3__Impl : ( ( rule__WithUniqueBlock__ArgsAssignment_3 ) ) ;
    public final void rule__WithUniqueBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1047:1: ( ( ( rule__WithUniqueBlock__ArgsAssignment_3 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1048:1: ( ( rule__WithUniqueBlock__ArgsAssignment_3 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1048:1: ( ( rule__WithUniqueBlock__ArgsAssignment_3 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1049:1: ( rule__WithUniqueBlock__ArgsAssignment_3 )
            {
             before(grammarAccess.getWithUniqueBlockAccess().getArgsAssignment_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1050:1: ( rule__WithUniqueBlock__ArgsAssignment_3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1050:2: rule__WithUniqueBlock__ArgsAssignment_3
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__ArgsAssignment_3_in_rule__WithUniqueBlock__Group__3__Impl2084);
            rule__WithUniqueBlock__ArgsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWithUniqueBlockAccess().getArgsAssignment_3()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group__3__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group__4"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1060:1: rule__WithUniqueBlock__Group__4 : rule__WithUniqueBlock__Group__4__Impl rule__WithUniqueBlock__Group__5 ;
    public final void rule__WithUniqueBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1064:1: ( rule__WithUniqueBlock__Group__4__Impl rule__WithUniqueBlock__Group__5 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1065:2: rule__WithUniqueBlock__Group__4__Impl rule__WithUniqueBlock__Group__5
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__4__Impl_in_rule__WithUniqueBlock__Group__42114);
            rule__WithUniqueBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__5_in_rule__WithUniqueBlock__Group__42117);
            rule__WithUniqueBlock__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group__4"


    // $ANTLR start "rule__WithUniqueBlock__Group__4__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1072:1: rule__WithUniqueBlock__Group__4__Impl : ( ( rule__WithUniqueBlock__Group_4__0 )* ) ;
    public final void rule__WithUniqueBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1076:1: ( ( ( rule__WithUniqueBlock__Group_4__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1077:1: ( ( rule__WithUniqueBlock__Group_4__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1077:1: ( ( rule__WithUniqueBlock__Group_4__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1078:1: ( rule__WithUniqueBlock__Group_4__0 )*
            {
             before(grammarAccess.getWithUniqueBlockAccess().getGroup_4()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1079:1: ( rule__WithUniqueBlock__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1079:2: rule__WithUniqueBlock__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__WithUniqueBlock__Group_4__0_in_rule__WithUniqueBlock__Group__4__Impl2144);
            	    rule__WithUniqueBlock__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWithUniqueBlockAccess().getGroup_4()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group__4__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group__5"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1089:1: rule__WithUniqueBlock__Group__5 : rule__WithUniqueBlock__Group__5__Impl ;
    public final void rule__WithUniqueBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1093:1: ( rule__WithUniqueBlock__Group__5__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1094:2: rule__WithUniqueBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group__5__Impl_in_rule__WithUniqueBlock__Group__52175);
            rule__WithUniqueBlock__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group__5"


    // $ANTLR start "rule__WithUniqueBlock__Group__5__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1100:1: rule__WithUniqueBlock__Group__5__Impl : ( ')' ) ;
    public final void rule__WithUniqueBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1104:1: ( ( ')' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1105:1: ( ')' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1105:1: ( ')' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1106:1: ')'
            {
             before(grammarAccess.getWithUniqueBlockAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__WithUniqueBlock__Group__5__Impl2203); 
             after(grammarAccess.getWithUniqueBlockAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group__5__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group_4__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1131:1: rule__WithUniqueBlock__Group_4__0 : rule__WithUniqueBlock__Group_4__0__Impl rule__WithUniqueBlock__Group_4__1 ;
    public final void rule__WithUniqueBlock__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1135:1: ( rule__WithUniqueBlock__Group_4__0__Impl rule__WithUniqueBlock__Group_4__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1136:2: rule__WithUniqueBlock__Group_4__0__Impl rule__WithUniqueBlock__Group_4__1
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group_4__0__Impl_in_rule__WithUniqueBlock__Group_4__02246);
            rule__WithUniqueBlock__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WithUniqueBlock__Group_4__1_in_rule__WithUniqueBlock__Group_4__02249);
            rule__WithUniqueBlock__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group_4__0"


    // $ANTLR start "rule__WithUniqueBlock__Group_4__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1143:1: rule__WithUniqueBlock__Group_4__0__Impl : ( ',' ) ;
    public final void rule__WithUniqueBlock__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1147:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1148:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1148:1: ( ',' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1149:1: ','
            {
             before(grammarAccess.getWithUniqueBlockAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__WithUniqueBlock__Group_4__0__Impl2277); 
             after(grammarAccess.getWithUniqueBlockAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group_4__0__Impl"


    // $ANTLR start "rule__WithUniqueBlock__Group_4__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1162:1: rule__WithUniqueBlock__Group_4__1 : rule__WithUniqueBlock__Group_4__1__Impl ;
    public final void rule__WithUniqueBlock__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1166:1: ( rule__WithUniqueBlock__Group_4__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1167:2: rule__WithUniqueBlock__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__Group_4__1__Impl_in_rule__WithUniqueBlock__Group_4__12308);
            rule__WithUniqueBlock__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__WithUniqueBlock__Group_4__1"


    // $ANTLR start "rule__WithUniqueBlock__Group_4__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1173:1: rule__WithUniqueBlock__Group_4__1__Impl : ( ( rule__WithUniqueBlock__ArgsAssignment_4_1 ) ) ;
    public final void rule__WithUniqueBlock__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1177:1: ( ( ( rule__WithUniqueBlock__ArgsAssignment_4_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1178:1: ( ( rule__WithUniqueBlock__ArgsAssignment_4_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1178:1: ( ( rule__WithUniqueBlock__ArgsAssignment_4_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1179:1: ( rule__WithUniqueBlock__ArgsAssignment_4_1 )
            {
             before(grammarAccess.getWithUniqueBlockAccess().getArgsAssignment_4_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1180:1: ( rule__WithUniqueBlock__ArgsAssignment_4_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1180:2: rule__WithUniqueBlock__ArgsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__WithUniqueBlock__ArgsAssignment_4_1_in_rule__WithUniqueBlock__Group_4__1__Impl2335);
            rule__WithUniqueBlock__ArgsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWithUniqueBlockAccess().getArgsAssignment_4_1()); 

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
    // $ANTLR end "rule__WithUniqueBlock__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1194:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1198:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1199:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02369);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02372);
            rule__FQN__Group__1();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1206:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1210:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1211:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1211:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1212:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2399); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1223:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1227:1: ( rule__FQN__Group__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1228:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12428);
            rule__FQN__Group__1__Impl();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1234:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1238:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1239:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1239:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1240:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1241:1: ( rule__FQN__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1241:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2455);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1255:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1259:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1260:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02490);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02493);
            rule__FQN__Group_1__1();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1267:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1271:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1272:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1272:1: ( '.' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1273:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__FQN__Group_1__0__Impl2521); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1286:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1290:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1291:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12552);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1297:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1301:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1302:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1302:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1303:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2579); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1319:1: rule__Model__PackageNameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1323:1: ( ( ruleFQN ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1324:1: ( ruleFQN )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1324:1: ( ruleFQN )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1325:1: ruleFQN
            {
             before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_12617);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Model__ServiceAssignment_2"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1334:1: rule__Model__ServiceAssignment_2 : ( ruleServiceBlock ) ;
    public final void rule__Model__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1338:1: ( ( ruleServiceBlock ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1339:1: ( ruleServiceBlock )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1339:1: ( ruleServiceBlock )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1340:1: ruleServiceBlock
            {
             before(grammarAccess.getModelAccess().getServiceServiceBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_rule__Model__ServiceAssignment_22648);
            ruleServiceBlock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getServiceServiceBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__ServiceAssignment_2"


    // $ANTLR start "rule__ServiceBlock__NameAssignment_1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1349:1: rule__ServiceBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1353:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1354:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1354:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1355:1: RULE_ID
            {
             before(grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_12679); 
             after(grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServiceBlock__NameAssignment_1"


    // $ANTLR start "rule__ServiceBlock__OpsAssignment_3"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1364:1: rule__ServiceBlock__OpsAssignment_3 : ( ruleOperation ) ;
    public final void rule__ServiceBlock__OpsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1368:1: ( ( ruleOperation ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1369:1: ( ruleOperation )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1369:1: ( ruleOperation )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1370:1: ruleOperation
            {
             before(grammarAccess.getServiceBlockAccess().getOpsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__ServiceBlock__OpsAssignment_32710);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getServiceBlockAccess().getOpsOperationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ServiceBlock__OpsAssignment_3"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1379:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1383:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1384:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1384:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1385:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12741); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__ArgsAssignment_3_0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1394:1: rule__Operation__ArgsAssignment_3_0 : ( ruleOperationArg ) ;
    public final void rule__Operation__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1398:1: ( ( ruleOperationArg ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1399:1: ( ruleOperationArg )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1399:1: ( ruleOperationArg )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1400:1: ruleOperationArg
            {
             before(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_02772);
            ruleOperationArg();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Operation__ArgsAssignment_3_0"


    // $ANTLR start "rule__Operation__ArgsAssignment_3_1_1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1409:1: rule__Operation__ArgsAssignment_3_1_1 : ( ruleOperationArg ) ;
    public final void rule__Operation__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1413:1: ( ( ruleOperationArg ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1414:1: ( ruleOperationArg )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1414:1: ( ruleOperationArg )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1415:1: ruleOperationArg
            {
             before(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_1_12803);
            ruleOperationArg();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Operation__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__Operation__UniqueAssignment_5"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1424:1: rule__Operation__UniqueAssignment_5 : ( ruleWithUniqueBlock ) ;
    public final void rule__Operation__UniqueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1428:1: ( ( ruleWithUniqueBlock ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1429:1: ( ruleWithUniqueBlock )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1429:1: ( ruleWithUniqueBlock )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1430:1: ruleWithUniqueBlock
            {
             before(grammarAccess.getOperationAccess().getUniqueWithUniqueBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleWithUniqueBlock_in_rule__Operation__UniqueAssignment_52834);
            ruleWithUniqueBlock();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getUniqueWithUniqueBlockParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Operation__UniqueAssignment_5"


    // $ANTLR start "rule__OperationArg__TypeAssignment_0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1439:1: rule__OperationArg__TypeAssignment_0 : ( ruleOpArgType ) ;
    public final void rule__OperationArg__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1443:1: ( ( ruleOpArgType ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1444:1: ( ruleOpArgType )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1444:1: ( ruleOpArgType )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1445:1: ruleOpArgType
            {
             before(grammarAccess.getOperationArgAccess().getTypeOpArgTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOpArgType_in_rule__OperationArg__TypeAssignment_02865);
            ruleOpArgType();

            state._fsp--;

             after(grammarAccess.getOperationArgAccess().getTypeOpArgTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__OperationArg__TypeAssignment_0"


    // $ANTLR start "rule__OperationArg__NameAssignment_1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1454:1: rule__OperationArg__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationArg__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1458:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1459:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1459:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1460:1: RULE_ID
            {
             before(grammarAccess.getOperationArgAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationArg__NameAssignment_12896); 
             after(grammarAccess.getOperationArgAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__OperationArg__NameAssignment_1"


    // $ANTLR start "rule__WithUniqueBlock__ArgsAssignment_3"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1469:1: rule__WithUniqueBlock__ArgsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WithUniqueBlock__ArgsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1473:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1474:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1474:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1475:1: ( RULE_ID )
            {
             before(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgCrossReference_3_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1476:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1477:1: RULE_ID
            {
             before(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WithUniqueBlock__ArgsAssignment_32931); 
             after(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgCrossReference_3_0()); 

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
    // $ANTLR end "rule__WithUniqueBlock__ArgsAssignment_3"


    // $ANTLR start "rule__WithUniqueBlock__ArgsAssignment_4_1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1488:1: rule__WithUniqueBlock__ArgsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__WithUniqueBlock__ArgsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1492:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1493:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1493:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1494:1: ( RULE_ID )
            {
             before(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgCrossReference_4_1_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1495:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1496:1: RULE_ID
            {
             before(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WithUniqueBlock__ArgsAssignment_4_12970); 
             after(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getWithUniqueBlockAccess().getArgsOperationArgCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__WithUniqueBlock__ArgsAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__0_in_ruleServiceBlock154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_entryRuleOperationArg241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationArg248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__0_in_ruleOperationArg274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWithUniqueBlock_in_entryRuleWithUniqueBlock301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWithUniqueBlock308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__0_in_ruleWithUniqueBlock334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpArgType__Alternatives_in_ruleOpArgType431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OpArgType__Alternatives467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OpArgType__Alternatives488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OpArgType__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OpArgType__Alternatives530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OpArgType__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OpArgType__Alternatives572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OpArgType__Alternatives593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__0__Impl657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1688 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ServiceAssignment_2_in_rule__Model__Group__2__Impl775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__0811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__0814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ServiceBlock__Group__0__Impl842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__1873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__2933 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ServiceBlock__Group__2__Impl964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__3995 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__OpsAssignment_3_in_rule__ServiceBlock__Group__3__Impl1025 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__41056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ServiceBlock__Group__4__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operation__Group__0__Impl1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11187 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21247 = new BitSet(new long[]{0x000000000103F800L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__21250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operation__Group__2__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__31309 = new BitSet(new long[]{0x000000000103F800L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__31312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__41370 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__41373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operation__Group__4__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__51432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UniqueAssignment_5_in_rule__Operation__Group__5__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__01502 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__01505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgsAssignment_3_0_in_rule__Operation__Group_3__0__Impl1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl1589 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__01624 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__01627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_3_1__0__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgsAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__0__Impl_in_rule__OperationArg__Group__01747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__1_in_rule__OperationArg__Group__01750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__TypeAssignment_0_in_rule__OperationArg__Group__0__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__1__Impl_in_rule__OperationArg__Group__11807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__NameAssignment_1_in_rule__OperationArg__Group__1__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__0__Impl_in_rule__WithUniqueBlock__Group__01868 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__1_in_rule__WithUniqueBlock__Group__01871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__WithUniqueBlock__Group__0__Impl1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__1__Impl_in_rule__WithUniqueBlock__Group__11930 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__2_in_rule__WithUniqueBlock__Group__11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__WithUniqueBlock__Group__1__Impl1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__2__Impl_in_rule__WithUniqueBlock__Group__21992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__3_in_rule__WithUniqueBlock__Group__21995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WithUniqueBlock__Group__2__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__3__Impl_in_rule__WithUniqueBlock__Group__32054 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__4_in_rule__WithUniqueBlock__Group__32057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__ArgsAssignment_3_in_rule__WithUniqueBlock__Group__3__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__4__Impl_in_rule__WithUniqueBlock__Group__42114 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__5_in_rule__WithUniqueBlock__Group__42117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group_4__0_in_rule__WithUniqueBlock__Group__4__Impl2144 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group__5__Impl_in_rule__WithUniqueBlock__Group__52175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__WithUniqueBlock__Group__5__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group_4__0__Impl_in_rule__WithUniqueBlock__Group_4__02246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group_4__1_in_rule__WithUniqueBlock__Group_4__02249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__WithUniqueBlock__Group_4__0__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__Group_4__1__Impl_in_rule__WithUniqueBlock__Group_4__12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WithUniqueBlock__ArgsAssignment_4_1_in_rule__WithUniqueBlock__Group_4__1__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__02369 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__02372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl2455 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FQN__Group_1__0__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_12617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_rule__Model__ServiceAssignment_22648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__ServiceBlock__OpsAssignment_32710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_02772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_1_12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWithUniqueBlock_in_rule__Operation__UniqueAssignment_52834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpArgType_in_rule__OperationArg__TypeAssignment_02865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationArg__NameAssignment_12896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WithUniqueBlock__ArgsAssignment_32931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WithUniqueBlock__ArgsAssignment_4_12970 = new BitSet(new long[]{0x0000000000000002L});

}