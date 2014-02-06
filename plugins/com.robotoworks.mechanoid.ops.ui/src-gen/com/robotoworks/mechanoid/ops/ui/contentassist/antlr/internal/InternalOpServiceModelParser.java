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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'String'", "'int'", "'float'", "'double'", "'long'", "'Parcelable'", "'package'", "'service'", "'{'", "'}'", "'operation'", "'('", "')'", "','", "'not'", "'unique'", "'.'"
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

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:269:1: rule__OpArgType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'long' ) ) | ( ( 'Parcelable' ) ) );
    public final void rule__OpArgType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:273:1: ( ( ( 'boolean' ) ) | ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'long' ) ) | ( ( 'Parcelable' ) ) )
            int alt2=7;
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
            case 17:
                {
                alt2=7;
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
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:302:6: ( ( 'double' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:302:6: ( ( 'double' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:303:1: ( 'double' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:304:1: ( 'double' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:304:3: 'double'
                    {
                    match(input,15,FOLLOW_15_in_rule__OpArgType__Alternatives602); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:309:6: ( ( 'long' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:309:6: ( ( 'long' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:310:1: ( 'long' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_5()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:311:1: ( 'long' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:311:3: 'long'
                    {
                    match(input,16,FOLLOW_16_in_rule__OpArgType__Alternatives623); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getLongEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:316:6: ( ( 'Parcelable' ) )
                    {
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:316:6: ( ( 'Parcelable' ) )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:317:1: ( 'Parcelable' )
                    {
                     before(grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_6()); 
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:318:1: ( 'Parcelable' )
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:318:3: 'Parcelable'
                    {
                    match(input,17,FOLLOW_17_in_rule__OpArgType__Alternatives644); 

                    }

                     after(grammarAccess.getOpArgTypeAccess().getParcelableEnumLiteralDeclaration_6()); 

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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:330:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:334:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:335:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0677);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0680);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:342:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:346:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:347:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:347:1: ( 'package' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:348:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__0__Impl708); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:361:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:365:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:366:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1739);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1742);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:373:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:377:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:378:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:378:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:379:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:380:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:380:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl769);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:390:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:394:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:395:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2799);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:401:1: rule__Model__Group__2__Impl : ( ( rule__Model__ServiceAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:405:1: ( ( ( rule__Model__ServiceAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:406:1: ( ( rule__Model__ServiceAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:406:1: ( ( rule__Model__ServiceAssignment_2 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:407:1: ( rule__Model__ServiceAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getServiceAssignment_2()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:408:1: ( rule__Model__ServiceAssignment_2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:408:2: rule__Model__ServiceAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__ServiceAssignment_2_in_rule__Model__Group__2__Impl826);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:424:1: rule__ServiceBlock__Group__0 : rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 ;
    public final void rule__ServiceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:428:1: ( rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:429:2: rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__0862);
            rule__ServiceBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__0865);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:436:1: rule__ServiceBlock__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:440:1: ( ( 'service' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:441:1: ( 'service' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:441:1: ( 'service' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:442:1: 'service'
            {
             before(grammarAccess.getServiceBlockAccess().getServiceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ServiceBlock__Group__0__Impl893); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:455:1: rule__ServiceBlock__Group__1 : rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 ;
    public final void rule__ServiceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:459:1: ( rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:460:2: rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__1924);
            rule__ServiceBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__1927);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:467:1: rule__ServiceBlock__Group__1__Impl : ( ( rule__ServiceBlock__NameAssignment_1 ) ) ;
    public final void rule__ServiceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:471:1: ( ( ( rule__ServiceBlock__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:472:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:472:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:473:1: ( rule__ServiceBlock__NameAssignment_1 )
            {
             before(grammarAccess.getServiceBlockAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:474:1: ( rule__ServiceBlock__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:474:2: rule__ServiceBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl954);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:484:1: rule__ServiceBlock__Group__2 : rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 ;
    public final void rule__ServiceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:488:1: ( rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:489:2: rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__2984);
            rule__ServiceBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__2987);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:496:1: rule__ServiceBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:500:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:501:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:501:1: ( '{' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:502:1: '{'
            {
             before(grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__ServiceBlock__Group__2__Impl1015); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:515:1: rule__ServiceBlock__Group__3 : rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 ;
    public final void rule__ServiceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:519:1: ( rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:520:2: rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__31046);
            rule__ServiceBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__31049);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:527:1: rule__ServiceBlock__Group__3__Impl : ( ( rule__ServiceBlock__OpsAssignment_3 )* ) ;
    public final void rule__ServiceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:531:1: ( ( ( rule__ServiceBlock__OpsAssignment_3 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:532:1: ( ( rule__ServiceBlock__OpsAssignment_3 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:532:1: ( ( rule__ServiceBlock__OpsAssignment_3 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:533:1: ( rule__ServiceBlock__OpsAssignment_3 )*
            {
             before(grammarAccess.getServiceBlockAccess().getOpsAssignment_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:534:1: ( rule__ServiceBlock__OpsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:534:2: rule__ServiceBlock__OpsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceBlock__OpsAssignment_3_in_rule__ServiceBlock__Group__3__Impl1076);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:544:1: rule__ServiceBlock__Group__4 : rule__ServiceBlock__Group__4__Impl ;
    public final void rule__ServiceBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:548:1: ( rule__ServiceBlock__Group__4__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:549:2: rule__ServiceBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__41107);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:555:1: rule__ServiceBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ServiceBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:559:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:560:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:560:1: ( '}' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:561:1: '}'
            {
             before(grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__ServiceBlock__Group__4__Impl1135); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:584:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:588:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:589:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01176);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01179);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:596:1: rule__Operation__Group__0__Impl : ( 'operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:600:1: ( ( 'operation' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:601:1: ( 'operation' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:601:1: ( 'operation' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:602:1: 'operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Operation__Group__0__Impl1207); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:615:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:619:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:620:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11238);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11241);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:627:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:631:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:632:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:632:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:633:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:634:1: ( rule__Operation__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:634:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1268);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:644:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:648:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:649:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21298);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__21301);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:656:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:660:1: ( ( '(' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:661:1: ( '(' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:661:1: ( '(' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:662:1: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Operation__Group__2__Impl1329); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:675:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:679:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:680:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__31360);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__31363);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:687:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:691:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:692:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:692:1: ( ( rule__Operation__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:693:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:694:1: ( rule__Operation__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=17)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:694:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl1390);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:704:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:708:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:709:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__41421);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__41424);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:716:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:720:1: ( ( ')' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:721:1: ( ')' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:721:1: ( ')' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:722:1: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Operation__Group__4__Impl1452); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:735:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:739:1: ( rule__Operation__Group__5__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:740:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__51483);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:746:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__UniqueClauseAssignment_5 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:750:1: ( ( ( rule__Operation__UniqueClauseAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:751:1: ( ( rule__Operation__UniqueClauseAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:751:1: ( ( rule__Operation__UniqueClauseAssignment_5 )? )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:752:1: ( rule__Operation__UniqueClauseAssignment_5 )?
            {
             before(grammarAccess.getOperationAccess().getUniqueClauseAssignment_5()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:753:1: ( rule__Operation__UniqueClauseAssignment_5 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=27)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:753:2: rule__Operation__UniqueClauseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Operation__UniqueClauseAssignment_5_in_rule__Operation__Group__5__Impl1510);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:775:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:779:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:780:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__01553);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__01556);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:787:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__ArgsAssignment_3_0 ) ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:791:1: ( ( ( rule__Operation__ArgsAssignment_3_0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:792:1: ( ( rule__Operation__ArgsAssignment_3_0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:792:1: ( ( rule__Operation__ArgsAssignment_3_0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:793:1: ( rule__Operation__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getOperationAccess().getArgsAssignment_3_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:794:1: ( rule__Operation__ArgsAssignment_3_0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:794:2: rule__Operation__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Operation__ArgsAssignment_3_0_in_rule__Operation__Group_3__0__Impl1583);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:804:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:808:1: ( rule__Operation__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:809:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__11613);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:815:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__Group_3_1__0 )* ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:819:1: ( ( ( rule__Operation__Group_3_1__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:820:1: ( ( rule__Operation__Group_3_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:820:1: ( ( rule__Operation__Group_3_1__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:821:1: ( rule__Operation__Group_3_1__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_3_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:822:1: ( rule__Operation__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:822:2: rule__Operation__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl1640);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:836:1: rule__Operation__Group_3_1__0 : rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 ;
    public final void rule__Operation__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:840:1: ( rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:841:2: rule__Operation__Group_3_1__0__Impl rule__Operation__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__01675);
            rule__Operation__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__01678);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:848:1: rule__Operation__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:852:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:853:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:853:1: ( ',' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:854:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_3_1__0__Impl1706); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:867:1: rule__Operation__Group_3_1__1 : rule__Operation__Group_3_1__1__Impl ;
    public final void rule__Operation__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:871:1: ( rule__Operation__Group_3_1__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:872:2: rule__Operation__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__11737);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:878:1: rule__Operation__Group_3_1__1__Impl : ( ( rule__Operation__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Operation__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:882:1: ( ( ( rule__Operation__ArgsAssignment_3_1_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:883:1: ( ( rule__Operation__ArgsAssignment_3_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:883:1: ( ( rule__Operation__ArgsAssignment_3_1_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:884:1: ( rule__Operation__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getOperationAccess().getArgsAssignment_3_1_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:885:1: ( rule__Operation__ArgsAssignment_3_1_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:885:2: rule__Operation__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Operation__ArgsAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl1764);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:899:1: rule__OperationArg__Group__0 : rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1 ;
    public final void rule__OperationArg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:903:1: ( rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:904:2: rule__OperationArg__Group__0__Impl rule__OperationArg__Group__1
            {
            pushFollow(FOLLOW_rule__OperationArg__Group__0__Impl_in_rule__OperationArg__Group__01798);
            rule__OperationArg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperationArg__Group__1_in_rule__OperationArg__Group__01801);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:911:1: rule__OperationArg__Group__0__Impl : ( ( rule__OperationArg__TypeAssignment_0 ) ) ;
    public final void rule__OperationArg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:915:1: ( ( ( rule__OperationArg__TypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:916:1: ( ( rule__OperationArg__TypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:916:1: ( ( rule__OperationArg__TypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:917:1: ( rule__OperationArg__TypeAssignment_0 )
            {
             before(grammarAccess.getOperationArgAccess().getTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:918:1: ( rule__OperationArg__TypeAssignment_0 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:918:2: rule__OperationArg__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__OperationArg__TypeAssignment_0_in_rule__OperationArg__Group__0__Impl1828);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:928:1: rule__OperationArg__Group__1 : rule__OperationArg__Group__1__Impl ;
    public final void rule__OperationArg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:932:1: ( rule__OperationArg__Group__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:933:2: rule__OperationArg__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OperationArg__Group__1__Impl_in_rule__OperationArg__Group__11858);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:939:1: rule__OperationArg__Group__1__Impl : ( ( rule__OperationArg__NameAssignment_1 ) ) ;
    public final void rule__OperationArg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:943:1: ( ( ( rule__OperationArg__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:944:1: ( ( rule__OperationArg__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:944:1: ( ( rule__OperationArg__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:945:1: ( rule__OperationArg__NameAssignment_1 )
            {
             before(grammarAccess.getOperationArgAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:946:1: ( rule__OperationArg__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:946:2: rule__OperationArg__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OperationArg__NameAssignment_1_in_rule__OperationArg__Group__1__Impl1885);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:960:1: rule__UniqueClause__Group_0__0 : rule__UniqueClause__Group_0__0__Impl rule__UniqueClause__Group_0__1 ;
    public final void rule__UniqueClause__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:964:1: ( rule__UniqueClause__Group_0__0__Impl rule__UniqueClause__Group_0__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:965:2: rule__UniqueClause__Group_0__0__Impl rule__UniqueClause__Group_0__1
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_0__0__Impl_in_rule__UniqueClause__Group_0__01919);
            rule__UniqueClause__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_0__1_in_rule__UniqueClause__Group_0__01922);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:972:1: rule__UniqueClause__Group_0__0__Impl : ( () ) ;
    public final void rule__UniqueClause__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:976:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:977:1: ( () )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:977:1: ( () )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:978:1: ()
            {
             before(grammarAccess.getUniqueClauseAccess().getNotUniqueAction_0_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:979:1: ()
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:981:1: 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:991:1: rule__UniqueClause__Group_0__1 : rule__UniqueClause__Group_0__1__Impl rule__UniqueClause__Group_0__2 ;
    public final void rule__UniqueClause__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:995:1: ( rule__UniqueClause__Group_0__1__Impl rule__UniqueClause__Group_0__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:996:2: rule__UniqueClause__Group_0__1__Impl rule__UniqueClause__Group_0__2
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_0__1__Impl_in_rule__UniqueClause__Group_0__11980);
            rule__UniqueClause__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_0__2_in_rule__UniqueClause__Group_0__11983);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1003:1: rule__UniqueClause__Group_0__1__Impl : ( 'not' ) ;
    public final void rule__UniqueClause__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1007:1: ( ( 'not' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1008:1: ( 'not' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1008:1: ( 'not' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1009:1: 'not'
            {
             before(grammarAccess.getUniqueClauseAccess().getNotKeyword_0_1()); 
            match(input,26,FOLLOW_26_in_rule__UniqueClause__Group_0__1__Impl2011); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1022:1: rule__UniqueClause__Group_0__2 : rule__UniqueClause__Group_0__2__Impl ;
    public final void rule__UniqueClause__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1026:1: ( rule__UniqueClause__Group_0__2__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1027:2: rule__UniqueClause__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_0__2__Impl_in_rule__UniqueClause__Group_0__22042);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1033:1: rule__UniqueClause__Group_0__2__Impl : ( 'unique' ) ;
    public final void rule__UniqueClause__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1037:1: ( ( 'unique' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1038:1: ( 'unique' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1038:1: ( 'unique' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1039:1: 'unique'
            {
             before(grammarAccess.getUniqueClauseAccess().getUniqueKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__UniqueClause__Group_0__2__Impl2070); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1058:1: rule__UniqueClause__Group_1__0 : rule__UniqueClause__Group_1__0__Impl rule__UniqueClause__Group_1__1 ;
    public final void rule__UniqueClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1062:1: ( rule__UniqueClause__Group_1__0__Impl rule__UniqueClause__Group_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1063:2: rule__UniqueClause__Group_1__0__Impl rule__UniqueClause__Group_1__1
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__0__Impl_in_rule__UniqueClause__Group_1__02107);
            rule__UniqueClause__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__1_in_rule__UniqueClause__Group_1__02110);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1070:1: rule__UniqueClause__Group_1__0__Impl : ( () ) ;
    public final void rule__UniqueClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1074:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1075:1: ( () )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1075:1: ( () )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1076:1: ()
            {
             before(grammarAccess.getUniqueClauseAccess().getUniqueDeclarationAction_1_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1077:1: ()
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1079:1: 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1089:1: rule__UniqueClause__Group_1__1 : rule__UniqueClause__Group_1__1__Impl rule__UniqueClause__Group_1__2 ;
    public final void rule__UniqueClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1093:1: ( rule__UniqueClause__Group_1__1__Impl rule__UniqueClause__Group_1__2 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1094:2: rule__UniqueClause__Group_1__1__Impl rule__UniqueClause__Group_1__2
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__1__Impl_in_rule__UniqueClause__Group_1__12168);
            rule__UniqueClause__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__2_in_rule__UniqueClause__Group_1__12171);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1101:1: rule__UniqueClause__Group_1__1__Impl : ( 'unique' ) ;
    public final void rule__UniqueClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1105:1: ( ( 'unique' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1106:1: ( 'unique' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1106:1: ( 'unique' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1107:1: 'unique'
            {
             before(grammarAccess.getUniqueClauseAccess().getUniqueKeyword_1_1()); 
            match(input,27,FOLLOW_27_in_rule__UniqueClause__Group_1__1__Impl2199); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1120:1: rule__UniqueClause__Group_1__2 : rule__UniqueClause__Group_1__2__Impl rule__UniqueClause__Group_1__3 ;
    public final void rule__UniqueClause__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1124:1: ( rule__UniqueClause__Group_1__2__Impl rule__UniqueClause__Group_1__3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1125:2: rule__UniqueClause__Group_1__2__Impl rule__UniqueClause__Group_1__3
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__2__Impl_in_rule__UniqueClause__Group_1__22230);
            rule__UniqueClause__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__3_in_rule__UniqueClause__Group_1__22233);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1132:1: rule__UniqueClause__Group_1__2__Impl : ( '(' ) ;
    public final void rule__UniqueClause__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1136:1: ( ( '(' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1137:1: ( '(' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1137:1: ( '(' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1138:1: '('
            {
             before(grammarAccess.getUniqueClauseAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__UniqueClause__Group_1__2__Impl2261); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1151:1: rule__UniqueClause__Group_1__3 : rule__UniqueClause__Group_1__3__Impl rule__UniqueClause__Group_1__4 ;
    public final void rule__UniqueClause__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1155:1: ( rule__UniqueClause__Group_1__3__Impl rule__UniqueClause__Group_1__4 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1156:2: rule__UniqueClause__Group_1__3__Impl rule__UniqueClause__Group_1__4
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__3__Impl_in_rule__UniqueClause__Group_1__32292);
            rule__UniqueClause__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__4_in_rule__UniqueClause__Group_1__32295);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1163:1: rule__UniqueClause__Group_1__3__Impl : ( ( rule__UniqueClause__ArgsAssignment_1_3 ) ) ;
    public final void rule__UniqueClause__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1167:1: ( ( ( rule__UniqueClause__ArgsAssignment_1_3 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1168:1: ( ( rule__UniqueClause__ArgsAssignment_1_3 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1168:1: ( ( rule__UniqueClause__ArgsAssignment_1_3 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1169:1: ( rule__UniqueClause__ArgsAssignment_1_3 )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsAssignment_1_3()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1170:1: ( rule__UniqueClause__ArgsAssignment_1_3 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1170:2: rule__UniqueClause__ArgsAssignment_1_3
            {
            pushFollow(FOLLOW_rule__UniqueClause__ArgsAssignment_1_3_in_rule__UniqueClause__Group_1__3__Impl2322);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1180:1: rule__UniqueClause__Group_1__4 : rule__UniqueClause__Group_1__4__Impl rule__UniqueClause__Group_1__5 ;
    public final void rule__UniqueClause__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1184:1: ( rule__UniqueClause__Group_1__4__Impl rule__UniqueClause__Group_1__5 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1185:2: rule__UniqueClause__Group_1__4__Impl rule__UniqueClause__Group_1__5
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__4__Impl_in_rule__UniqueClause__Group_1__42352);
            rule__UniqueClause__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1__5_in_rule__UniqueClause__Group_1__42355);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1192:1: rule__UniqueClause__Group_1__4__Impl : ( ( rule__UniqueClause__Group_1_4__0 )* ) ;
    public final void rule__UniqueClause__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1196:1: ( ( ( rule__UniqueClause__Group_1_4__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1197:1: ( ( rule__UniqueClause__Group_1_4__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1197:1: ( ( rule__UniqueClause__Group_1_4__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1198:1: ( rule__UniqueClause__Group_1_4__0 )*
            {
             before(grammarAccess.getUniqueClauseAccess().getGroup_1_4()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1199:1: ( rule__UniqueClause__Group_1_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1199:2: rule__UniqueClause__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__0_in_rule__UniqueClause__Group_1__4__Impl2382);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1209:1: rule__UniqueClause__Group_1__5 : rule__UniqueClause__Group_1__5__Impl ;
    public final void rule__UniqueClause__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1213:1: ( rule__UniqueClause__Group_1__5__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1214:2: rule__UniqueClause__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1__5__Impl_in_rule__UniqueClause__Group_1__52413);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1220:1: rule__UniqueClause__Group_1__5__Impl : ( ')' ) ;
    public final void rule__UniqueClause__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1224:1: ( ( ')' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1225:1: ( ')' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1225:1: ( ')' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1226:1: ')'
            {
             before(grammarAccess.getUniqueClauseAccess().getRightParenthesisKeyword_1_5()); 
            match(input,24,FOLLOW_24_in_rule__UniqueClause__Group_1__5__Impl2441); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1251:1: rule__UniqueClause__Group_1_4__0 : rule__UniqueClause__Group_1_4__0__Impl rule__UniqueClause__Group_1_4__1 ;
    public final void rule__UniqueClause__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1255:1: ( rule__UniqueClause__Group_1_4__0__Impl rule__UniqueClause__Group_1_4__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1256:2: rule__UniqueClause__Group_1_4__0__Impl rule__UniqueClause__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__0__Impl_in_rule__UniqueClause__Group_1_4__02484);
            rule__UniqueClause__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__1_in_rule__UniqueClause__Group_1_4__02487);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1263:1: rule__UniqueClause__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__UniqueClause__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1267:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1268:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1268:1: ( ',' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1269:1: ','
            {
             before(grammarAccess.getUniqueClauseAccess().getCommaKeyword_1_4_0()); 
            match(input,25,FOLLOW_25_in_rule__UniqueClause__Group_1_4__0__Impl2515); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1282:1: rule__UniqueClause__Group_1_4__1 : rule__UniqueClause__Group_1_4__1__Impl ;
    public final void rule__UniqueClause__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1286:1: ( rule__UniqueClause__Group_1_4__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1287:2: rule__UniqueClause__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UniqueClause__Group_1_4__1__Impl_in_rule__UniqueClause__Group_1_4__12546);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1293:1: rule__UniqueClause__Group_1_4__1__Impl : ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) ) ;
    public final void rule__UniqueClause__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1297:1: ( ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1298:1: ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1298:1: ( ( rule__UniqueClause__ArgsAssignment_1_4_1 ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1299:1: ( rule__UniqueClause__ArgsAssignment_1_4_1 )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsAssignment_1_4_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1300:1: ( rule__UniqueClause__ArgsAssignment_1_4_1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1300:2: rule__UniqueClause__ArgsAssignment_1_4_1
            {
            pushFollow(FOLLOW_rule__UniqueClause__ArgsAssignment_1_4_1_in_rule__UniqueClause__Group_1_4__1__Impl2573);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1314:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1318:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1319:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02607);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02610);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1326:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1330:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1331:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1331:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1332:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2637); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1343:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1347:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1348:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12666);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1354:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1358:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1359:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1359:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1360:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1361:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1361:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2693);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1375:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1379:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1380:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02728);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02731);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1387:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1391:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1392:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1392:1: ( '.' )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1393:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl2759); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1406:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1410:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1411:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12790);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1417:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1421:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1422:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1422:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1423:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2817); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1439:1: rule__Model__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1443:1: ( ( ruleQualifiedName ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1444:1: ( ruleQualifiedName )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1444:1: ( ruleQualifiedName )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1445:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_12855);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1454:1: rule__Model__ServiceAssignment_2 : ( ruleServiceBlock ) ;
    public final void rule__Model__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1458:1: ( ( ruleServiceBlock ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1459:1: ( ruleServiceBlock )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1459:1: ( ruleServiceBlock )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1460:1: ruleServiceBlock
            {
             before(grammarAccess.getModelAccess().getServiceServiceBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_rule__Model__ServiceAssignment_22886);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1469:1: rule__ServiceBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1473:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1474:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1474:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1475:1: RULE_ID
            {
             before(grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_12917); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1484:1: rule__ServiceBlock__OpsAssignment_3 : ( ruleOperation ) ;
    public final void rule__ServiceBlock__OpsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1488:1: ( ( ruleOperation ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1489:1: ( ruleOperation )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1489:1: ( ruleOperation )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1490:1: ruleOperation
            {
             before(grammarAccess.getServiceBlockAccess().getOpsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__ServiceBlock__OpsAssignment_32948);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1499:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1503:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1504:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1504:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1505:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12979); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1514:1: rule__Operation__ArgsAssignment_3_0 : ( ruleOperationArg ) ;
    public final void rule__Operation__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1518:1: ( ( ruleOperationArg ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1519:1: ( ruleOperationArg )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1519:1: ( ruleOperationArg )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1520:1: ruleOperationArg
            {
             before(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_03010);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1529:1: rule__Operation__ArgsAssignment_3_1_1 : ( ruleOperationArg ) ;
    public final void rule__Operation__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1533:1: ( ( ruleOperationArg ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1534:1: ( ruleOperationArg )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1534:1: ( ruleOperationArg )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1535:1: ruleOperationArg
            {
             before(grammarAccess.getOperationAccess().getArgsOperationArgParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_1_13041);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1544:1: rule__Operation__UniqueClauseAssignment_5 : ( ruleUniqueClause ) ;
    public final void rule__Operation__UniqueClauseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1548:1: ( ( ruleUniqueClause ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1549:1: ( ruleUniqueClause )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1549:1: ( ruleUniqueClause )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1550:1: ruleUniqueClause
            {
             before(grammarAccess.getOperationAccess().getUniqueClauseUniqueClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleUniqueClause_in_rule__Operation__UniqueClauseAssignment_53072);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1559:1: rule__OperationArg__TypeAssignment_0 : ( ruleOpArgType ) ;
    public final void rule__OperationArg__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1563:1: ( ( ruleOpArgType ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1564:1: ( ruleOpArgType )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1564:1: ( ruleOpArgType )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1565:1: ruleOpArgType
            {
             before(grammarAccess.getOperationArgAccess().getTypeOpArgTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOpArgType_in_rule__OperationArg__TypeAssignment_03103);
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1574:1: rule__OperationArg__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OperationArg__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1578:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1579:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1579:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1580:1: RULE_ID
            {
             before(grammarAccess.getOperationArgAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OperationArg__NameAssignment_13134); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1589:1: rule__UniqueClause__ArgsAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueClause__ArgsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1593:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1594:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1594:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1595:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_3_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1596:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1597:1: RULE_ID
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_33169); 
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
    // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1608:1: rule__UniqueClause__ArgsAssignment_1_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__UniqueClause__ArgsAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1612:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1613:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1613:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1614:1: ( RULE_ID )
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgCrossReference_1_4_1_0()); 
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1615:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.ops.ui/src-gen/com/robotoworks/mechanoid/ops/ui/contentassist/antlr/internal/InternalOpServiceModel.g:1616:1: RULE_ID
            {
             before(grammarAccess.getUniqueClauseAccess().getArgsOperationArgIDTerminalRuleCall_1_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_4_13208); 
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
    public static final BitSet FOLLOW_17_in_rule__OpArgType__Alternatives644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1739 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ServiceAssignment_2_in_rule__Model__Group__2__Impl826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__0862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__0865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ServiceBlock__Group__0__Impl893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__1924 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__2984 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ServiceBlock__Group__2__Impl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__31046 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__31049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__OpsAssignment_3_in_rule__ServiceBlock__Group__3__Impl1076 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__41107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ServiceBlock__Group__4__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operation__Group__0__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__11238 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__21298 = new BitSet(new long[]{0x000000000103F800L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__21301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operation__Group__2__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__31360 = new BitSet(new long[]{0x000000000103F800L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__31363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__41421 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__41424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operation__Group__4__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__51483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__UniqueClauseAssignment_5_in_rule__Operation__Group__5__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__01553 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__01556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgsAssignment_3_0_in_rule__Operation__Group_3__0__Impl1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__11613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0_in_rule__Operation__Group_3__1__Impl1640 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__0__Impl_in_rule__Operation__Group_3_1__01675 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1_in_rule__Operation__Group_3_1__01678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_3_1__0__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3_1__1__Impl_in_rule__Operation__Group_3_1__11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ArgsAssignment_3_1_1_in_rule__Operation__Group_3_1__1__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__0__Impl_in_rule__OperationArg__Group__01798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__1_in_rule__OperationArg__Group__01801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__TypeAssignment_0_in_rule__OperationArg__Group__0__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__Group__1__Impl_in_rule__OperationArg__Group__11858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperationArg__NameAssignment_1_in_rule__OperationArg__Group__1__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__0__Impl_in_rule__UniqueClause__Group_0__01919 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__1_in_rule__UniqueClause__Group_0__01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__1__Impl_in_rule__UniqueClause__Group_0__11980 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__2_in_rule__UniqueClause__Group_0__11983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UniqueClause__Group_0__1__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_0__2__Impl_in_rule__UniqueClause__Group_0__22042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UniqueClause__Group_0__2__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__0__Impl_in_rule__UniqueClause__Group_1__02107 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__1_in_rule__UniqueClause__Group_1__02110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__1__Impl_in_rule__UniqueClause__Group_1__12168 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__2_in_rule__UniqueClause__Group_1__12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UniqueClause__Group_1__1__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__2__Impl_in_rule__UniqueClause__Group_1__22230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__3_in_rule__UniqueClause__Group_1__22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UniqueClause__Group_1__2__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__3__Impl_in_rule__UniqueClause__Group_1__32292 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__4_in_rule__UniqueClause__Group_1__32295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__ArgsAssignment_1_3_in_rule__UniqueClause__Group_1__3__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__4__Impl_in_rule__UniqueClause__Group_1__42352 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__5_in_rule__UniqueClause__Group_1__42355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__0_in_rule__UniqueClause__Group_1__4__Impl2382 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1__5__Impl_in_rule__UniqueClause__Group_1__52413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UniqueClause__Group_1__5__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__0__Impl_in_rule__UniqueClause__Group_1_4__02484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__1_in_rule__UniqueClause__Group_1_4__02487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UniqueClause__Group_1_4__0__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__Group_1_4__1__Impl_in_rule__UniqueClause__Group_1_4__12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UniqueClause__ArgsAssignment_1_4_1_in_rule__UniqueClause__Group_1_4__1__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02607 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2693 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_12855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_rule__Model__ServiceAssignment_22886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_12917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__ServiceBlock__OpsAssignment_32948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_12979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_03010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationArg_in_rule__Operation__ArgsAssignment_3_1_13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueClause_in_rule__Operation__UniqueClauseAssignment_53072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpArgType_in_rule__OperationArg__TypeAssignment_03103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OperationArg__NameAssignment_13134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_33169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UniqueClause__ArgsAssignment_1_4_13208 = new BitSet(new long[]{0x0000000000000002L});

}