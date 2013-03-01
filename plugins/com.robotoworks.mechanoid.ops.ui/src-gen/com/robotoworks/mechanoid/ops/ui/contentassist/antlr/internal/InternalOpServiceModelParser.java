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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'String'", "'int'", "'float'", "'long'", "'Parcelable'", "'package'", "'service'", "'{'", "'}'", "'operation'", "'('", "')'", "','", "'not'", "'unique'", "'.'"
    };
    public static final int RULE_ID=4;
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


    // $ANTLR start "entryRuleUniqueClause"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:172:1: entryRuleUniqueClause : ruleUniqueClause EOF ;
    public final void entryRuleUniqueClause() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:173:1: ( ruleUniqueClause EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:174:1: ruleUniqueClause EOF
            {
             before(grammarAccess.getUniqueClauseRule()); 
            pushFollow(FOLLOW_ruleUniqueClause_in_entryRuleUniqueClause301);
            ruleUniqueClause();

            state._fsp--;

             after(grammarAccess.getUniqueClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueClause308); 

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
    // $ANTLR end "entryRuleUniqueClause"


    // $ANTLR start "ruleUniqueClause"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:181:1: ruleUniqueClause : ( ( rule__UniqueClause__Alternatives ) ) ;
    public final void ruleUniqueClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:185:2: ( ( ( rule__UniqueClause__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:186:1: ( ( rule__UniqueClause__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:186:1: ( ( rule__UniqueClause__Alternatives ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:187:1: ( rule__UniqueClause__Alternatives )
            {
             before(grammarAccess.getUniqueClauseAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:188:1: ( rule__UniqueClause__Alternatives )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:188:2: rule__UniqueClause__Alternatives
            {
            pushFollow(FOLLOW_rule__UniqueClause__Alternatives_in_ruleUniqueClause334);
            rule__UniqueClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUniqueClauseAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUniqueClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:200:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:201:1: ( ruleQualifiedName EOF )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:202:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName368); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:209:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:213:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:215:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:216:1: ( rule__QualifiedName__Group__0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:216:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


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


    // $ANTLR start "rule__UniqueClause__Alternatives"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:247:1: rule__UniqueClause__Alternatives : ( ( ( rule__UniqueClause__Group_0__0 ) ) | ( ( rule__UniqueClause__Group_1__0 ) ) );
    public final void rule__UniqueClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:251:1: ( ( ( rule__UniqueClause__Group_0__0 ) ) | ( ( rule__UniqueClause__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:252:1: ( ( rule__UniqueClause__Group_0__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:252:1: ( ( rule__UniqueClause__Group_0__0 ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:253:1: ( rule__UniqueClause__Group_0__0 )
                    {
                     before(grammarAccess.getUniqueClauseAccess().getGroup_0()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:254:1: ( rule__UniqueClause__Group_0__0 )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:254:2: rule__UniqueClause__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UniqueClause__Group_0__0_in_rule__UniqueClause__Alternatives466);
                    rule__UniqueClause__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUniqueClauseAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:258:6: ( ( rule__UniqueClause__Group_1__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:258:6: ( ( rule__UniqueClause__Group_1__0 ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:259:1: ( rule__UniqueClause__Group_1__0 )
                    {
                     before(grammarAccess.getUniqueClauseAccess().getGroup_1()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:260:1: ( rule__UniqueClause__Group_1__0 )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:260:2: rule__UniqueClause__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UniqueClause__Group_1__0_in_rule__UniqueClause__Alternatives484);
                    rule__UniqueClause__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUniqueClauseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UniqueClause__Alternatives"


    // $ANTLR start "rule__OpArgType__Alternatives"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:269:1: rule__OpArgType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) | ( ( 'Parcelable' ) ) );
    public final void rule__OpArgType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:273:1: ( ( ( 'boolean' ) ) | ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'long' ) ) | ( ( 'Parcelable' ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:274:1: ( ( 'boolean' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:274:1: ( ( 'boolean' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:275:1: ( 'boolean' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:276:1: ( 'boolean' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:276:3: 'boolean'
                    {
                    match(input,11,FOLLOW_11_in_rule__OpArgType__Alternatives518); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:281:6: ( ( 'String' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:281:6: ( ( 'String' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:282:1: ( 'String' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:283:1: ( 'String' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:283:3: 'String'
                    {
                    match(input,12,FOLLOW_12_in_rule__OpArgType__Alternatives539); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:288:6: ( ( 'int' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:288:6: ( ( 'int' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:289:1: ( 'int' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:290:1: ( 'int' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:290:3: 'int'
                    {
                    match(input,13,FOLLOW_13_in_rule__OpArgType__Alternatives560); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:295:6: ( ( 'float' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:295:6: ( ( 'float' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:296:1: ( 'float' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:297:1: ( 'float' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:297:3: 'float'
                    {
                    match(input,14,FOLLOW_14_in_rule__OpArgType__Alternatives581); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:302:6: ( ( 'long' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:302:6: ( ( 'long' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:303:1: ( 'long' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_4()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:304:1: ( 'long' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:304:3: 'long'
                    {
                    match(input,15,FOLLOW_15_in_rule__OpArgType__Alternatives602); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:309:6: ( ( 'Parcelable' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:309:6: ( ( 'Parcelable' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:310:1: ( 'Parcelable' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_5()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:311:1: ( 'Parcelable' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:311:3: 'Parcelable'
                    {
                    match(input,16,FOLLOW_16_in_rule__OpArgType__Alternatives623); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_5()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:323:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:327:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:328:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0656);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0659);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:335:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:339:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:340:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:340:1: ( 'package' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:341:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group__0__Impl687); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:354:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:358:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:359:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1718);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1721);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:366:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:370:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:371:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:371:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:372:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:373:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:373:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl748);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:383:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:387:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:388:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2778);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:394:1: rule__Model__Group__2__Impl : ( ( rule__Model__ServiceAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:398:1: ( ( ( rule__Model__ServiceAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:399:1: ( ( rule__Model__ServiceAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:399:1: ( ( rule__Model__ServiceAssignment_2 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:400:1: ( rule__Model__ServiceAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getServiceAssignment_2()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:401:1: ( rule__Model__ServiceAssignment_2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:401:2: rule__Model__ServiceAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__ServiceAssignment_2_in_rule__Model__Group__2__Impl805);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:417:1: rule__ServiceBlock__Group__0 : rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 ;
    public final void rule__ServiceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:421:1: ( rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:422:2: rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__0841);
            rule__ServiceBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__0844);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:429:1: rule__ServiceBlock__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:433:1: ( ( 'service' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:434:1: ( 'service' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:434:1: ( 'service' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:435:1: 'service'
            {
             before(grammarAccess.getServiceBlockAccess().getServiceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ServiceBlock__Group__0__Impl872); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:448:1: rule__ServiceBlock__Group__1 : rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 ;
    public final void rule__ServiceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:452:1: ( rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:453:2: rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__1903);
            rule__ServiceBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__1906);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:460:1: rule__ServiceBlock__Group__1__Impl : ( ( rule__ServiceBlock__NameAssignment_1 ) ) ;
    public final void rule__ServiceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:464:1: ( ( ( rule__ServiceBlock__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:465:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:465:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:466:1: ( rule__ServiceBlock__NameAssignment_1 )
            {
             before(grammarAccess.getServiceBlockAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:467:1: ( rule__ServiceBlock__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:467:2: rule__ServiceBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl933);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:477:1: rule__ServiceBlock__Group__2 : rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 ;
    public final void rule__ServiceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:481:1: ( rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:482:2: rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__2963);
            rule__ServiceBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__2966);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:489:1: rule__ServiceBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:493:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:494:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:494:1: ( '{' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:495:1: '{'
            {
             before(grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__ServiceBlock__Group__2__Impl994); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:508:1: rule__ServiceBlock__Group__3 : rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 ;
    public final void rule__ServiceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:512:1: ( rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:513:2: rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__31025);
            rule__ServiceBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__31028);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:520:1: rule__ServiceBlock__Group__3__Impl : ( ( rule__ServiceBlock__OpsAssignment_3 )* ) ;
    public final void rule__ServiceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:524:1: ( ( ( rule__ServiceBlock__OpsAssignment_3 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:525:1: ( ( rule__ServiceBlock__OpsAssignment_3 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:525:1: ( ( rule__ServiceBlock__OpsAssignment_3 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:526:1: ( rule__ServiceBlock__OpsAssignment_3 )*
            {
             before(grammarAccess.getServiceBlockAccess().getOpsAssignment_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:527:1: ( rule__ServiceBlock__OpsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:527:2: rule__ServiceBlock__OpsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceBlock__OpsAssignment_3_in_rule__ServiceBlock__Group__3__Impl1055);
            	    rule__ServiceBlock__OpsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:537:1: rule__ServiceBlock__Group__4 : rule__ServiceBlock__Group__4__Impl ;
    public final void rule__ServiceBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:541:1: ( rule__ServiceBlock__Group__4__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:542:2: rule__ServiceBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__41086);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:548:1: rule__ServiceBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ServiceBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:552:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:553:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:553:1: ( '}' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:554:1: '}'
            {
             before(grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__ServiceBlock__Group__4__Impl1114); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:577:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:581:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:582:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01155);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01158);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:589:1: rule__Operation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:593:1: ( ( 'operation' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:594:1: ( 'operation' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:594:1: ( 'operation' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:595:1: 'operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Operation__Group__0__Impl1186); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:608:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:612:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:613:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11217);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11220);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:620:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:624:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:625:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:625:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:626:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:627:1: ( rule__Operation__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:627:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1247);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:637:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:641:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:642:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21277);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__21280);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:649:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:653:1: ( ( '(' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:654:1: ( '(' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:654:1: ( '(' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:655:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Operation__Group__2__Impl1308); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:668:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:672:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:673:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__31339);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__31342);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:680:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:684:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:685:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:685:1: ( ( rule__Operation__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:686:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:687:1: ( rule__Operation__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=16)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:687:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl1369);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:697:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:701:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:702:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__41400);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__41403);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:709:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:713:1: ( ( ')' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:714:1: ( ')' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:714:1: ( ')' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:715:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Operation__Group__4__Impl1431); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:728:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:732:1: ( rule__Operation__Group__5__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:733:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__51462);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:739:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__UniqueClauseAssignment_5 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:743:1: ( ( ( rule__Operation__UniqueClauseAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:744:1: ( ( rule__Operation__UniqueClauseAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:744:1: ( ( rule__Operation__UniqueClauseAssignment_5 )? )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:745:1: ( rule__Operation__UniqueClauseAssignment_5 )?
            {
             before(grammarAccess.getOperationAccess().getUniqueClauseAssignment_5()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:746:1: ( rule__Operation__UniqueClauseAssignment_5 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=25 && LA5_0<=26)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:746:2: rule__Operation__UniqueClauseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Operation__UniqueClauseAssignment_5_in_rule__Operation__Group__5__Impl1489);
                    rule__Operation__UniqueClauseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getUniqueClauseAssignment_5()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:768:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:772:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:773:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__01532);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__01535);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:780:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__ArgsAssignment_3_0 ) ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:784:1: ( ( ( rule__Operation__ArgsAssignment_3_0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:785:1: ( ( rule__Operation__ArgsAssignment_3_0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:785:1: ( ( rule__Operation__ArgsAssignment_3_0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:786:1: ( rule__Operation__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getOperationAccess().getArgsAssignment_3_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:787:1: ( rule__Operation__ArgsAssignment_3_0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:787:2: rule__Operation__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Operation__ArgsAssignment_3_0_in_rule__Operation__Group_3__0__Impl1562);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:797:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:801:1: ( rule__Operation__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:802:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__11592);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:808:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__Group_3_1__0 )* ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:812:1: ( ( ( rule__Operation__Group_3_1__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:813:1: ( ( rule__Operation__Group_3_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:813:1: ( ( rule__Operation__Group_3_1__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:814:1: ( rule__Operation__Group_3_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_3_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:815:1: ( rule__Operation__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:815:2: rule__Operation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl1619);
            	    rule__Operation__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:829:1: rule__Operation__Group_3_1__0 : rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 ;
    public final void rule__Operation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:833:1: ( rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:834:2: rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__01654);
            rule__Operation__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__01657);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:841:1: rule__Operation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:845:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:846:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:846:1: ( ',' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:847:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Operation__Group_3_1__0__Impl1685); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:860:1: rule__Operation__Group_3_1__1 : rule__Operation__Group_3_1__1__Impl ;
    public final void rule__Operation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:864:1: ( rule__Operation__Group_3_1__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:865:2: rule__Operation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__11716);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:871:1: rule__Operation__Group_3_1__1__Impl : ( ( rule__Operation__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Operation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:875:1: ( ( ( rule__Operation__ArgsAssignment_3_1_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:876:1: ( ( rule__Operation__ArgsAssignment_3_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:876:1: ( ( rule__Operation__ArgsAssignment_3_1_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:877:1: ( rule__Operation__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getOperationAccess().getArgsAssignment_3_1_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:878:1: ( rule__Operation__ArgsAssignment_3_1_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:878:2: rule__Operation__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ArgsAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl1743);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:892:1: rule__OperationArg__Group__0 : rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1 ;
    public final void rule__OperationArg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:896:1: ( rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:897:2: rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1
            {
            pushFollow(FOLLOW_rule__OperationArg__Group__0__Impl_in_rule__OperationArg__Group__01777);
            rule__OperationArg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationArg__Group__1_in_rule__OperationArg__Group__01780);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:904:1: rule__OperationArg__Group__0__Impl : ( ( rule__OperationArg__TypeAssignment_0 ) ) ;
    public final void rule__OperationArg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:908:1: ( ( ( rule__OperationArg__TypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:909:1: ( ( rule__OperationArg__TypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:909:1: ( ( rule__OperationArg__TypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:910:1: ( rule__OperationArg__TypeAssignment_0 )
            {
             before(grammarAccess.getOperationArgAccess().getTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:911:1: ( rule__OperationArg__TypeAssignment_0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:911:2: rule__OperationArg__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__OperationArg__TypeAssignment_0_in_rule__OperationArg__Group__0__Impl1807);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:921:1: rule__OperationArg__Group__1 : rule__OperationArg__Group__1__Impl ;
    public final void rule__OperationArg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:925:1: ( rule__OperationArg__Group__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:926:2: rule__OperationArg__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OperationArg__Group__1__Impl_in_rule__OperationArg__Group__11837);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:932:1: rule__OperationArg__Group__1__Impl : ( ( rule__OperationArg__NameAssignment_1 ) ) ;
    public final void rule__OperationArg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:936:1: ( ( ( rule__OperationArg__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:937:1: ( ( rule__OperationArg__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:937:1: ( ( rule__OperationArg__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:938:1: ( rule__OperationArg__NameAssignment_1 )
            {
             before(grammarAccess.getOperationArgAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:939:1: ( rule__OperationArg__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:939:2: rule__OperationArg__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationArg__NameAssignment_1_in_rule__OperationArg__Group__1__Impl1864);
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


    // $ANTLR start "rule__UniqueClause__Group_0__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:953:1: rule__UniqueClause__Group_0__0 : rule__UniqueClause__Group_0__0__Impl rule__UniqueClause__Group_0__1 ;
    public final void rule__UniqueClause__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:957:1: ( rule__UniqueClause__Group_0__0__Impl rule__UniqueClause__Group_0__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:958:2: rule__UniqueClause__Group_0__0__Impl rule__UniqueClause__Group_0__1
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_0__0__Impl_in_rule__UniqueClause__Group_0__01898);
            rule__UniqueClause__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_0__1_in_rule__UniqueClause__Group_0__01901);
            rule__UniqueClause__Group_0__1();

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
    // $ANTLR end "rule__UniqueClause__Group_0__0"


    // $ANTLR start "rule__UniqueClause__Group_0__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:965:1: rule__UniqueClause__Group_0__0__Impl : ( () ) ;
    public final void rule__UniqueClause__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:969:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:970:1: ( () )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:970:1: ( () )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:971:1: ()
            {
             before(grammarAccess.getUniqueClauseAccess().getNotUniqueAction_0_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:972:1: ()
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:974:1: 
            {
            }

             after(grammarAccess.getUniqueClauseAccess().getNotUniqueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueClause__Group_0__0__Impl"


    // $ANTLR start "rule__UniqueClause__Group_0__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:984:1: rule__UniqueClause__Group_0__1 : rule__UniqueClause__Group_0__1__Impl rule__UniqueClause__Group_0__2 ;
    public final void rule__UniqueClause__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:988:1: ( rule__UniqueClause__Group_0__1__Impl rule__UniqueClause__Group_0__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:989:2: rule__UniqueClause__Group_0__1__Impl rule__UniqueClause__Group_0__2
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_0__1__Impl_in_rule__UniqueClause__Group_0__11959);
            rule__UniqueClause__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_0__2_in_rule__UniqueClause__Group_0__11962);
            rule__UniqueClause__Group_0__2();

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
    // $ANTLR end "rule__UniqueClause__Group_0__1"


    // $ANTLR start "rule__UniqueClause__Group_0__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:996:1: rule__UniqueClause__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__UniqueClause__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1000:1: ( ( 'not' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1001:1: ( 'not' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1001:1: ( 'not' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1002:1: 'not'
            {
             before(grammarAccess.getUniqueClauseAccess().getNotKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__UniqueClause__Group_0__1__Impl1990); 
             after(grammarAccess.getUniqueClauseAccess().getNotKeyword_0_1()); 

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
    // $ANTLR end "rule__UniqueClause__Group_0__1__Impl"


    // $ANTLR start "rule__UniqueClause__Group_0__2"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1015:1: rule__UniqueClause__Group_0__2 : rule__UniqueClause__Group_0__2__Impl ;
    public final void rule__UniqueClause__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1019:1: ( rule__UniqueClause__Group_0__2__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1020:2: rule__UniqueClause__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_0__2__Impl_in_rule__UniqueClause__Group_0__22021);
            rule__UniqueClause__Group_0__2__Impl();

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
    // $ANTLR end "rule__UniqueClause__Group_0__2"


    // $ANTLR start "rule__UniqueClause__Group_0__2__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1026:1: rule__UniqueClause__Group_0__2__Impl : ( 'unique' ) ;
    public final void rule__UniqueClause__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1030:1: ( ( 'unique' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1031:1: ( 'unique' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1031:1: ( 'unique' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1032:1: 'unique'
            {
             before(grammarAccess.getUniqueClauseAccess().getUniqueKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__UniqueClause__Group_0__2__Impl2049); 
             after(grammarAccess.getUniqueClauseAccess().getUniqueKeyword_0_2()); 

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
    // $ANTLR end "rule__UniqueClause__Group_0__2__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1051:1: rule__UniqueClause__Group_1__0 : rule__UniqueClause__Group_1__0__Impl rule__UniqueClause__Group_1__1 ;
    public final void rule__UniqueClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1055:1: ( rule__UniqueClause__Group_1__0__Impl rule__UniqueClause__Group_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1056:2: rule__UniqueClause__Group_1__0__Impl rule__UniqueClause__Group_1__1
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__0__Impl_in_rule__UniqueClause__Group_1__02086);
            rule__UniqueClause__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__1_in_rule__UniqueClause__Group_1__02089);
            rule__UniqueClause__Group_1__1();

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
    // $ANTLR end "rule__UniqueClause__Group_1__0"


    // $ANTLR start "rule__UniqueClause__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1063:1: rule__UniqueClause__Group_1__0__Impl : ( () ) ;
    public final void rule__UniqueClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1067:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1068:1: ( () )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1068:1: ( () )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1069:1: ()
            {
             before(grammarAccess.getUniqueClauseAccess().getUniqueDeclarationAction_1_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1070:1: ()
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1072:1: 
            {
            }

             after(grammarAccess.getUniqueClauseAccess().getUniqueDeclarationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UniqueClause__Group_1__0__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1082:1: rule__UniqueClause__Group_1__1 : rule__UniqueClause__Group_1__1__Impl rule__UniqueClause__Group_1__2 ;
    public final void rule__UniqueClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1086:1: ( rule__UniqueClause__Group_1__1__Impl rule__UniqueClause__Group_1__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1087:2: rule__UniqueClause__Group_1__1__Impl rule__UniqueClause__Group_1__2
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__1__Impl_in_rule__UniqueClause__Group_1__12147);
            rule__UniqueClause__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__2_in_rule__UniqueClause__Group_1__12150);
            rule__UniqueClause__Group_1__2();

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
    // $ANTLR end "rule__UniqueClause__Group_1__1"


    // $ANTLR start "rule__UniqueClause__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1094:1: rule__UniqueClause__Group_1__1__Impl : ( 'unique' ) ;
    public final void rule__UniqueClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1098:1: ( ( 'unique' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1099:1: ( 'unique' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1099:1: ( 'unique' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1100:1: 'unique'
            {
             before(grammarAccess.getUniqueClauseAccess().getUniqueKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__UniqueClause__Group_1__1__Impl2178); 
             after(grammarAccess.getUniqueClauseAccess().getUniqueKeyword_1_1()); 

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
    // $ANTLR end "rule__UniqueClause__Group_1__1__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1__2"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1113:1: rule__UniqueClause__Group_1__2 : rule__UniqueClause__Group_1__2__Impl rule__UniqueClause__Group_1__3 ;
    public final void rule__UniqueClause__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1117:1: ( rule__UniqueClause__Group_1__2__Impl rule__UniqueClause__Group_1__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1118:2: rule__UniqueClause__Group_1__2__Impl rule__UniqueClause__Group_1__3
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__2__Impl_in_rule__UniqueClause__Group_1__22209);
            rule__UniqueClause__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__3_in_rule__UniqueClause__Group_1__22212);
            rule__UniqueClause__Group_1__3();

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
    // $ANTLR end "rule__UniqueClause__Group_1__2"


    // $ANTLR start "rule__UniqueClause__Group_1__2__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1125:1: rule__UniqueClause__Group_1__2__Impl : ( '(' ) ;
    public final void rule__UniqueClause__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1129:1: ( ( '(' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1130:1: ( '(' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1130:1: ( '(' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1131:1: '('
            {
             before(grammarAccess.getUniqueClauseAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__UniqueClause__Group_1__2__Impl2240); 
             after(grammarAccess.getUniqueClauseAccess().getLeftParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__UniqueClause__Group_1__2__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1__3"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1144:1: rule__UniqueClause__Group_1__3 : rule__UniqueClause__Group_1__3__Impl rule__UniqueClause__Group_1__4 ;
    public final void rule__UniqueClause__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1148:1: ( rule__UniqueClause__Group_1__3__Impl rule__UniqueClause__Group_1__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1149:2: rule__UniqueClause__Group_1__3__Impl rule__UniqueClause__Group_1__4
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__3__Impl_in_rule__UniqueClause__Group_1__32271);
            rule__UniqueClause__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__4_in_rule__UniqueClause__Group_1__32274);
            rule__UniqueClause__Group_1__4();

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
    // $ANTLR end "rule__UniqueClause__Group_1__3"


    // $ANTLR start "rule__UniqueClause__Group_1__3__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1156:1: rule__UniqueClause__Group_1__3__Impl : ( ( rule__UniqueClause__ArgsAssignment_1_3 ) ) ;
    public final void rule__UniqueClause__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1160:1: ( ( ( rule__UniqueClause__ArgsAssignment_1_3 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1161:1: ( ( rule__UniqueClause__ArgsAssignment_1_3 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1161:1: ( ( rule__UniqueClause__ArgsAssignment_1_3 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1162:1: ( rule__UniqueClause__ArgsAssignment_1_3 )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsAssignment_1_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1163:1: ( rule__UniqueClause__ArgsAssignment_1_3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1163:2: rule__UniqueClause__ArgsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__UniqueClause__ArgsAssignment_1_3_in_rule__UniqueClause__Group_1__3__Impl2301);
            rule__UniqueClause__ArgsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getUniqueClauseAccess().getArgsAssignment_1_3()); 

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
    // $ANTLR end "rule__UniqueClause__Group_1__3__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1__4"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1173:1: rule__UniqueClause__Group_1__4 : rule__UniqueClause__Group_1__4__Impl rule__UniqueClause__Group_1__5 ;
    public final void rule__UniqueClause__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1177:1: ( rule__UniqueClause__Group_1__4__Impl rule__UniqueClause__Group_1__5 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1178:2: rule__UniqueClause__Group_1__4__Impl rule__UniqueClause__Group_1__5
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__4__Impl_in_rule__UniqueClause__Group_1__42331);
            rule__UniqueClause__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__5_in_rule__UniqueClause__Group_1__42334);
            rule__UniqueClause__Group_1__5();

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
    // $ANTLR end "rule__UniqueClause__Group_1__4"


    // $ANTLR start "rule__UniqueClause__Group_1__4__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1185:1: rule__UniqueClause__Group_1__4__Impl : ( ( rule__UniqueClause__Group_1_4__0 )* ) ;
    public final void rule__UniqueClause__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1189:1: ( ( ( rule__UniqueClause__Group_1_4__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1190:1: ( ( rule__UniqueClause__Group_1_4__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1190:1: ( ( rule__UniqueClause__Group_1_4__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1191:1: ( rule__UniqueClause__Group_1_4__0 )*
            {
             before(grammarAccess.getUniqueClauseAccess().getGroup_1_4()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1192:1: ( rule__UniqueClause__Group_1_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1192:2: rule__UniqueClause__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__0_in_rule__UniqueClause__Group_1__4__Impl2361);
            	    rule__UniqueClause__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUniqueClauseAccess().getGroup_1_4()); 

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
    // $ANTLR end "rule__UniqueClause__Group_1__4__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1__5"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1202:1: rule__UniqueClause__Group_1__5 : rule__UniqueClause__Group_1__5__Impl ;
    public final void rule__UniqueClause__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1206:1: ( rule__UniqueClause__Group_1__5__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1207:2: rule__UniqueClause__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__5__Impl_in_rule__UniqueClause__Group_1__52392);
            rule__UniqueClause__Group_1__5__Impl();

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
    // $ANTLR end "rule__UniqueClause__Group_1__5"


    // $ANTLR start "rule__UniqueClause__Group_1__5__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1213:1: rule__UniqueClause__Group_1__5__Impl : ( ')' ) ;
    public final void rule__UniqueClause__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1217:1: ( ( ')' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1218:1: ( ')' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1218:1: ( ')' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1219:1: ')'
            {
             before(grammarAccess.getUniqueClauseAccess().getRightParenthesisKeyword_1_5()); 
            match(input,23,FOLLOW_23_in_rule__UniqueClause__Group_1__5__Impl2420); 
             after(grammarAccess.getUniqueClauseAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__UniqueClause__Group_1__5__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1_4__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1244:1: rule__UniqueClause__Group_1_4__0 : rule__UniqueClause__Group_1_4__0__Impl rule__UniqueClause__Group_1_4__1 ;
    public final void rule__UniqueClause__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1248:1: ( rule__UniqueClause__Group_1_4__0__Impl rule__UniqueClause__Group_1_4__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1249:2: rule__UniqueClause__Group_1_4__0__Impl rule__UniqueClause__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__0__Impl_in_rule__UniqueClause__Group_1_4__02463);
            rule__UniqueClause__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__1_in_rule__UniqueClause__Group_1_4__02466);
            rule__UniqueClause__Group_1_4__1();

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
    // $ANTLR end "rule__UniqueClause__Group_1_4__0"


    // $ANTLR start "rule__UniqueClause__Group_1_4__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1256:1: rule__UniqueClause__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__UniqueClause__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1260:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1261:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1261:1: ( ',' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1262:1: ','
            {
             before(grammarAccess.getUniqueClauseAccess().getCommaKeyword_1_4_0()); 
            match(input,24,FOLLOW_24_in_rule__UniqueClause__Group_1_4__0__Impl2494); 
             after(grammarAccess.getUniqueClauseAccess().getCommaKeyword_1_4_0()); 

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
    // $ANTLR end "rule__UniqueClause__Group_1_4__0__Impl"


    // $ANTLR start "rule__UniqueClause__Group_1_4__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1275:1: rule__UniqueClause__Group_1_4__1 : rule__UniqueClause__Group_1_4__1__Impl ;
    public final void rule__UniqueClause__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1279:1: ( rule__UniqueClause__Group_1_4__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1280:2: rule__UniqueClause__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__1__Impl_in_rule__UniqueClause__Group_1_4__12525);
            rule__UniqueClause__Group_1_4__1__Impl();

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
    // $ANTLR end "rule__UniqueClause__Group_1_4__1"


    // $ANTLR start "rule__UniqueClause__Group_1_4__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1286:1: rule__UniqueClause__Group_1_4__1__Impl : ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) ) ;
    public final void rule__UniqueClause__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1290:1: ( ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1291:1: ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1291:1: ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1292:1: ( rule__UniqueClause__ArgsAssignment_1_4_1 )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsAssignment_1_4_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1293:1: ( rule__UniqueClause__ArgsAssignment_1_4_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1293:2: rule__UniqueClause__ArgsAssignment_1_4_1
            {
            pushFollow(FOLLOW_rule__UniqueClause__ArgsAssignment_1_4_1_in_rule__UniqueClause__Group_1_4__1__Impl2552);
            rule__UniqueClause__ArgsAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUniqueClauseAccess().getArgsAssignment_1_4_1()); 

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
    // $ANTLR end "rule__UniqueClause__Group_1_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1307:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1311:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1312:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02586);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02589);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1319:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1323:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1324:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1324:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1325:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2616); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1336:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1340:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1341:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12645);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1347:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1351:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1352:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1352:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1353:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1354:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1354:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2672);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1368:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1372:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1373:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02707);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02710);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1380:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1384:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1385:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1385:1: ( '.' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1386:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl2738); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1399:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1403:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1404:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12769);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1410:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1414:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1415:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1415:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1416:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2796); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__PackageNameAssignment_1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1432:1: rule__Model__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1436:1: ( ( ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1437:1: ( ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1437:1: ( ruleQualifiedName )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1438:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_12834);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1447:1: rule__Model__ServiceAssignment_2 : ( ruleServiceBlock ) ;
    public final void rule__Model__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1451:1: ( ( ruleServiceBlock ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1452:1: ( ruleServiceBlock )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1452:1: ( ruleServiceBlock )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1453:1: ruleServiceBlock
            {
             before(grammarAccess.getModelAccess().getServiceServiceBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_rule__Model__ServiceAssignment_22865);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1462:1: rule__ServiceBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1466:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1467:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1467:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1468:1: RULE_ID
            {
             before(grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_12896); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1477:1: rule__ServiceBlock__OpsAssignment_3 : ( ruleOperation ) ;
    public final void rule__ServiceBlock__OpsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1481:1: ( ( ruleOperation ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1482:1: ( ruleOperation )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1482:1: ( ruleOperation )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1483:1: ruleOperation
            {
             before(grammarAccess.getServiceBlockAccess().getOpsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__ServiceBlock__OpsAssignment_32927);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1492:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1496:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1497:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1497:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1498:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12958); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1507:1: rule__Operation__ArgsAssignment_3_0 : ( ruleOperationArg ) ;
    public final void rule__Operation__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1511:1: ( ( ruleOperationArg ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1512:1: ( ruleOperationArg )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1512:1: ( ruleOperationArg )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1513:1: ruleOperationArg
            {
             before(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_02989);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1522:1: rule__Operation__ArgsAssignment_3_1_1 : ( ruleOperationArg ) ;
    public final void rule__Operation__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1526:1: ( ( ruleOperationArg ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1527:1: ( ruleOperationArg )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1527:1: ( ruleOperationArg )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1528:1: ruleOperationArg
            {
             before(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_1_13020);
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


    // $ANTLR start "rule__Operation__UniqueClauseAssignment_5"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1537:1: rule__Operation__UniqueClauseAssignment_5 : ( ruleUniqueClause ) ;
    public final void rule__Operation__UniqueClauseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1541:1: ( ( ruleUniqueClause ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1542:1: ( ruleUniqueClause )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1542:1: ( ruleUniqueClause )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1543:1: ruleUniqueClause
            {
             before(grammarAccess.getOperationAccess().getUniqueClauseUniqueClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleUniqueClause_in_rule__Operation__UniqueClauseAssignment_53051);
            ruleUniqueClause();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getUniqueClauseUniqueClauseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Operation__UniqueClauseAssignment_5"


    // $ANTLR start "rule__OperationArg__TypeAssignment_0"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1552:1: rule__OperationArg__TypeAssignment_0 : ( ruleOpArgType ) ;
    public final void rule__OperationArg__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1556:1: ( ( ruleOpArgType ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1557:1: ( ruleOpArgType )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1557:1: ( ruleOpArgType )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1558:1: ruleOpArgType
            {
             before(grammarAccess.getOperationArgAccess().getTypeOpArgTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOpArgType_in_rule__OperationArg__TypeAssignment_03082);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1567:1: rule__OperationArg__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationArg__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1571:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1572:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1572:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1573:1: RULE_ID
            {
             before(grammarAccess.getOperationArgAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationArg__NameAssignment_13113); 
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


    // $ANTLR start "rule__UniqueClause__ArgsAssignment_1_3"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1582:1: rule__UniqueClause__ArgsAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueClause__ArgsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1586:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1587:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1587:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1588:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_3_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1589:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1590:1: RULE_ID
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_33148); 
             after(grammarAccess.getUniqueClauseAccess().getArgsOperationArgIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__UniqueClause__ArgsAssignment_1_3"


    // $ANTLR start "rule__UniqueClause__ArgsAssignment_1_4_1"
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1601:1: rule__UniqueClause__ArgsAssignment_1_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueClause__ArgsAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1605:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1606:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1606:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1607:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_4_1_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1608:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1609:1: RULE_ID
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgIDTerminalRuleCall_1_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_4_13187); 
             after(grammarAccess.getUniqueClauseAccess().getArgsOperationArgIDTerminalRuleCall_1_4_1_0_1()); 

            }

             after(grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_4_1_0()); 

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
    // $ANTLR end "rule__UniqueClause__ArgsAssignment_1_4_1"

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
    public static final BitSet FOLLOW_ruleUniqueClause_in_entryRuleUniqueClause301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueClause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Alternatives_in_ruleUniqueClause334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpArgType__Alternatives_in_ruleOpArgType431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__0_in_rule__UniqueClause__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__0_in_rule__UniqueClause__Alternatives484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OpArgType__Alternatives518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OpArgType__Alternatives539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OpArgType__Alternatives560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__OpArgType__Alternatives581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__OpArgType__Alternatives602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OpArgType__Alternatives623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group__0__Impl687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1718 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ServiceAssignment_2_in_rule__Model__Group__2__Impl805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__0841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__0844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ServiceBlock__Group__0__Impl872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__1903 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__2963 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ServiceBlock__Group__2__Impl994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__31025 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__31028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__OpsAssignment_3_in_rule__ServiceBlock__Group__3__Impl1055 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__41086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ServiceBlock__Group__4__Impl1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operation__Group__0__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11217 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21277 = new BitSet(new long[]{0x000000000081F800L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__21280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operation__Group__2__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__31339 = new BitSet(new long[]{0x000000000081F800L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__31342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__41400 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__41403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operation__Group__4__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__51462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UniqueClauseAssignment_5_in_rule__Operation__Group__5__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__01532 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__01535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgsAssignment_3_0_in_rule__Operation__Group_3__0__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl1619 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__01654 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__01657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operation__Group_3_1__0__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgsAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__0__Impl_in_rule__OperationArg__Group__01777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__1_in_rule__OperationArg__Group__01780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__TypeAssignment_0_in_rule__OperationArg__Group__0__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__1__Impl_in_rule__OperationArg__Group__11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__NameAssignment_1_in_rule__OperationArg__Group__1__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__0__Impl_in_rule__UniqueClause__Group_0__01898 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__1_in_rule__UniqueClause__Group_0__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__1__Impl_in_rule__UniqueClause__Group_0__11959 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__2_in_rule__UniqueClause__Group_0__11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UniqueClause__Group_0__1__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__2__Impl_in_rule__UniqueClause__Group_0__22021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UniqueClause__Group_0__2__Impl2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__0__Impl_in_rule__UniqueClause__Group_1__02086 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__1_in_rule__UniqueClause__Group_1__02089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__1__Impl_in_rule__UniqueClause__Group_1__12147 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__2_in_rule__UniqueClause__Group_1__12150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UniqueClause__Group_1__1__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__2__Impl_in_rule__UniqueClause__Group_1__22209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__3_in_rule__UniqueClause__Group_1__22212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UniqueClause__Group_1__2__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__3__Impl_in_rule__UniqueClause__Group_1__32271 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__4_in_rule__UniqueClause__Group_1__32274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__ArgsAssignment_1_3_in_rule__UniqueClause__Group_1__3__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__4__Impl_in_rule__UniqueClause__Group_1__42331 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__5_in_rule__UniqueClause__Group_1__42334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__0_in_rule__UniqueClause__Group_1__4__Impl2361 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__5__Impl_in_rule__UniqueClause__Group_1__52392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UniqueClause__Group_1__5__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__0__Impl_in_rule__UniqueClause__Group_1_4__02463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__1_in_rule__UniqueClause__Group_1_4__02466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UniqueClause__Group_1_4__0__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__1__Impl_in_rule__UniqueClause__Group_1_4__12525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__ArgsAssignment_1_4_1_in_rule__UniqueClause__Group_1_4__1__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02586 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2672 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QualifiedName__Group_1__0__Impl2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_12834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_rule__Model__ServiceAssignment_22865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_12896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__ServiceBlock__OpsAssignment_32927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_02989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_1_13020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueClause_in_rule__Operation__UniqueClauseAssignment_53051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpArgType_in_rule__OperationArg__TypeAssignment_03082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationArg__NameAssignment_13113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_33148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_4_13187 = new BitSet(new long[]{0x0000000000000002L});

}