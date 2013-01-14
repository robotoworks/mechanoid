package com.robotoworks.mechanoid.net.ui.contentassist.antlr.internal; 

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
import com.robotoworks.mechanoid.net.services.NetModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNetModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'get'", "'put'", "'post'", "'delete'", "'true'", "'false'", "'package'", "'client'", "'{'", "'}'", "'headers'", "','", "':'", "'params'", "'='", "'body'", "'response'", "'extends'", "'.'", "'-'", "'[]'", "'entity'", "'generate'", "'enum'", "'String'", "'boolean'", "'int'", "'long'", "'double'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalNetModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNetModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNetModelParser.tokenNames; }
    public String getGrammarFileName() { return "../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g"; }


     
     	private NetModelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(NetModelGrammarAccess grammarAccess) {
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:61:1: ( ruleModel EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:62:1: ruleModel EOF
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:76:1: ( rule__Model__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:76:2: rule__Model__Group__0
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


    // $ANTLR start "entryRuleDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:88:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:89:1: ( ruleDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:90:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration121);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration128); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:97:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:101:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:102:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:102:1: ( ( rule__Declaration__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:103:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:104:1: ( rule__Declaration__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:104:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration154);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleClient"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:116:1: entryRuleClient : ruleClient EOF ;
    public final void entryRuleClient() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:117:1: ( ruleClient EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:118:1: ruleClient EOF
            {
             before(grammarAccess.getClientRule()); 
            pushFollow(FOLLOW_ruleClient_in_entryRuleClient181);
            ruleClient();

            state._fsp--;

             after(grammarAccess.getClientRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClient188); 

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
    // $ANTLR end "entryRuleClient"


    // $ANTLR start "ruleClient"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:125:1: ruleClient : ( ( rule__Client__Group__0 ) ) ;
    public final void ruleClient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:129:2: ( ( ( rule__Client__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:130:1: ( ( rule__Client__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:130:1: ( ( rule__Client__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:131:1: ( rule__Client__Group__0 )
            {
             before(grammarAccess.getClientAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:132:1: ( rule__Client__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:132:2: rule__Client__Group__0
            {
            pushFollow(FOLLOW_rule__Client__Group__0_in_ruleClient214);
            rule__Client__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClientAccess().getGroup()); 

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
    // $ANTLR end "ruleClient"


    // $ANTLR start "entryRuleClientBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:144:1: entryRuleClientBlock : ruleClientBlock EOF ;
    public final void entryRuleClientBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:145:1: ( ruleClientBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:146:1: ruleClientBlock EOF
            {
             before(grammarAccess.getClientBlockRule()); 
            pushFollow(FOLLOW_ruleClientBlock_in_entryRuleClientBlock241);
            ruleClientBlock();

            state._fsp--;

             after(grammarAccess.getClientBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClientBlock248); 

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
    // $ANTLR end "entryRuleClientBlock"


    // $ANTLR start "ruleClientBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:153:1: ruleClientBlock : ( ( rule__ClientBlock__Alternatives ) ) ;
    public final void ruleClientBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:157:2: ( ( ( rule__ClientBlock__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:158:1: ( ( rule__ClientBlock__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:158:1: ( ( rule__ClientBlock__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:159:1: ( rule__ClientBlock__Alternatives )
            {
             before(grammarAccess.getClientBlockAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:160:1: ( rule__ClientBlock__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:160:2: rule__ClientBlock__Alternatives
            {
            pushFollow(FOLLOW_rule__ClientBlock__Alternatives_in_ruleClientBlock274);
            rule__ClientBlock__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClientBlockAccess().getAlternatives()); 

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
    // $ANTLR end "ruleClientBlock"


    // $ANTLR start "entryRuleHeaderBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:172:1: entryRuleHeaderBlock : ruleHeaderBlock EOF ;
    public final void entryRuleHeaderBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:173:1: ( ruleHeaderBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:174:1: ruleHeaderBlock EOF
            {
             before(grammarAccess.getHeaderBlockRule()); 
            pushFollow(FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock301);
            ruleHeaderBlock();

            state._fsp--;

             after(grammarAccess.getHeaderBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderBlock308); 

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
    // $ANTLR end "entryRuleHeaderBlock"


    // $ANTLR start "ruleHeaderBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:181:1: ruleHeaderBlock : ( ( rule__HeaderBlock__Group__0 ) ) ;
    public final void ruleHeaderBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:185:2: ( ( ( rule__HeaderBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:186:1: ( ( rule__HeaderBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:186:1: ( ( rule__HeaderBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:187:1: ( rule__HeaderBlock__Group__0 )
            {
             before(grammarAccess.getHeaderBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:188:1: ( rule__HeaderBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:188:2: rule__HeaderBlock__Group__0
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__0_in_ruleHeaderBlock334);
            rule__HeaderBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleHeaderBlock"


    // $ANTLR start "entryRuleHeader"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:200:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:201:1: ( ruleHeader EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:202:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader361);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader368); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:209:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:213:2: ( ( ( rule__Header__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:214:1: ( ( rule__Header__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:214:1: ( ( rule__Header__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:215:1: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:216:1: ( rule__Header__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:216:2: rule__Header__Group__0
            {
            pushFollow(FOLLOW_rule__Header__Group__0_in_ruleHeader394);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleHttpMethod"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:228:1: entryRuleHttpMethod : ruleHttpMethod EOF ;
    public final void entryRuleHttpMethod() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:229:1: ( ruleHttpMethod EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:230:1: ruleHttpMethod EOF
            {
             before(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod421);
            ruleHttpMethod();

            state._fsp--;

             after(grammarAccess.getHttpMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod428); 

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
    // $ANTLR end "entryRuleHttpMethod"


    // $ANTLR start "ruleHttpMethod"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:237:1: ruleHttpMethod : ( ( rule__HttpMethod__Group__0 ) ) ;
    public final void ruleHttpMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:241:2: ( ( ( rule__HttpMethod__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:242:1: ( ( rule__HttpMethod__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:242:1: ( ( rule__HttpMethod__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:243:1: ( rule__HttpMethod__Group__0 )
            {
             before(grammarAccess.getHttpMethodAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:244:1: ( rule__HttpMethod__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:244:2: rule__HttpMethod__Group__0
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod454);
            rule__HttpMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleHttpMethod"


    // $ANTLR start "entryRuleHttpMethodBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:256:1: entryRuleHttpMethodBlock : ruleHttpMethodBlock EOF ;
    public final void entryRuleHttpMethodBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:257:1: ( ruleHttpMethodBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:258:1: ruleHttpMethodBlock EOF
            {
             before(grammarAccess.getHttpMethodBlockRule()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock481);
            ruleHttpMethodBlock();

            state._fsp--;

             after(grammarAccess.getHttpMethodBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethodBlock488); 

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
    // $ANTLR end "entryRuleHttpMethodBlock"


    // $ANTLR start "ruleHttpMethodBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:265:1: ruleHttpMethodBlock : ( ( rule__HttpMethodBlock__Alternatives ) ) ;
    public final void ruleHttpMethodBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:269:2: ( ( ( rule__HttpMethodBlock__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:270:1: ( ( rule__HttpMethodBlock__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:270:1: ( ( rule__HttpMethodBlock__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:271:1: ( rule__HttpMethodBlock__Alternatives )
            {
             before(grammarAccess.getHttpMethodBlockAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:272:1: ( rule__HttpMethodBlock__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:272:2: rule__HttpMethodBlock__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodBlock__Alternatives_in_ruleHttpMethodBlock514);
            rule__HttpMethodBlock__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodBlockAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHttpMethodBlock"


    // $ANTLR start "entryRuleParamsBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:284:1: entryRuleParamsBlock : ruleParamsBlock EOF ;
    public final void entryRuleParamsBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:285:1: ( ruleParamsBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:286:1: ruleParamsBlock EOF
            {
             before(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock541);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getParamsBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock548); 

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
    // $ANTLR end "entryRuleParamsBlock"


    // $ANTLR start "ruleParamsBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:293:1: ruleParamsBlock : ( ( rule__ParamsBlock__Group__0 ) ) ;
    public final void ruleParamsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:297:2: ( ( ( rule__ParamsBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:298:1: ( ( rule__ParamsBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:298:1: ( ( rule__ParamsBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:299:1: ( rule__ParamsBlock__Group__0 )
            {
             before(grammarAccess.getParamsBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:300:1: ( rule__ParamsBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:300:2: rule__ParamsBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock574);
            rule__ParamsBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamsBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleParamsBlock"


    // $ANTLR start "entryRuleSimpleMemberAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:312:1: entryRuleSimpleMemberAssignment : ruleSimpleMemberAssignment EOF ;
    public final void entryRuleSimpleMemberAssignment() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:313:1: ( ruleSimpleMemberAssignment EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:314:1: ruleSimpleMemberAssignment EOF
            {
             before(grammarAccess.getSimpleMemberAssignmentRule()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment601);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMemberAssignment608); 

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
    // $ANTLR end "entryRuleSimpleMemberAssignment"


    // $ANTLR start "ruleSimpleMemberAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:321:1: ruleSimpleMemberAssignment : ( ( rule__SimpleMemberAssignment__Group__0 ) ) ;
    public final void ruleSimpleMemberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:325:2: ( ( ( rule__SimpleMemberAssignment__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:326:1: ( ( rule__SimpleMemberAssignment__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:326:1: ( ( rule__SimpleMemberAssignment__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:327:1: ( rule__SimpleMemberAssignment__Group__0 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:328:1: ( rule__SimpleMemberAssignment__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:328:2: rule__SimpleMemberAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__0_in_ruleSimpleMemberAssignment634);
            rule__SimpleMemberAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleMemberAssignment"


    // $ANTLR start "entryRuleLiteral"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:340:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:341:1: ( ruleLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:342:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral661);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral668); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:349:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:353:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:354:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:354:1: ( ( rule__Literal__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:355:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:356:1: ( rule__Literal__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:356:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral694);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleBodyBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:368:1: entryRuleBodyBlock : ruleBodyBlock EOF ;
    public final void entryRuleBodyBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:369:1: ( ruleBodyBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:370:1: ruleBodyBlock EOF
            {
             before(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock721);
            ruleBodyBlock();

            state._fsp--;

             after(grammarAccess.getBodyBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock728); 

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
    // $ANTLR end "entryRuleBodyBlock"


    // $ANTLR start "ruleBodyBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:377:1: ruleBodyBlock : ( ( rule__BodyBlock__Group__0 ) ) ;
    public final void ruleBodyBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:381:2: ( ( ( rule__BodyBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:382:1: ( ( rule__BodyBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:382:1: ( ( rule__BodyBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:383:1: ( rule__BodyBlock__Group__0 )
            {
             before(grammarAccess.getBodyBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:384:1: ( rule__BodyBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:384:2: rule__BodyBlock__Group__0
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock754);
            rule__BodyBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBodyBlock"


    // $ANTLR start "entryRuleResponseBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:396:1: entryRuleResponseBlock : ruleResponseBlock EOF ;
    public final void entryRuleResponseBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:397:1: ( ruleResponseBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:398:1: ruleResponseBlock EOF
            {
             before(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock781);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getResponseBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock788); 

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
    // $ANTLR end "entryRuleResponseBlock"


    // $ANTLR start "ruleResponseBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:405:1: ruleResponseBlock : ( ( rule__ResponseBlock__Group__0 ) ) ;
    public final void ruleResponseBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:409:2: ( ( ( rule__ResponseBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:410:1: ( ( rule__ResponseBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:410:1: ( ( rule__ResponseBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:411:1: ( rule__ResponseBlock__Group__0 )
            {
             before(grammarAccess.getResponseBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:412:1: ( rule__ResponseBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:412:2: rule__ResponseBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock814);
            rule__ResponseBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleResponseBlock"


    // $ANTLR start "entryRuleBlockType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:424:1: entryRuleBlockType : ruleBlockType EOF ;
    public final void entryRuleBlockType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:425:1: ( ruleBlockType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:426:1: ruleBlockType EOF
            {
             before(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType841);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getBlockTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType848); 

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
    // $ANTLR end "entryRuleBlockType"


    // $ANTLR start "ruleBlockType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:433:1: ruleBlockType : ( ( rule__BlockType__Alternatives ) ) ;
    public final void ruleBlockType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:437:2: ( ( ( rule__BlockType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__BlockType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__BlockType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:439:1: ( rule__BlockType__Alternatives )
            {
             before(grammarAccess.getBlockTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:1: ( rule__BlockType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:2: rule__BlockType__Alternatives
            {
            pushFollow(FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType874);
            rule__BlockType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlockTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBlockType"


    // $ANTLR start "entryRuleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:452:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:453:1: ( ruleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:454:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember901);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember908); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:461:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:465:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__Member__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__Member__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:467:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:1: ( rule__Member__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember934);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleTypedMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:480:1: entryRuleTypedMember : ruleTypedMember EOF ;
    public final void entryRuleTypedMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:481:1: ( ruleTypedMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:482:1: ruleTypedMember EOF
            {
             before(grammarAccess.getTypedMemberRule()); 
            pushFollow(FOLLOW_ruleTypedMember_in_entryRuleTypedMember961);
            ruleTypedMember();

            state._fsp--;

             after(grammarAccess.getTypedMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedMember968); 

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
    // $ANTLR end "entryRuleTypedMember"


    // $ANTLR start "ruleTypedMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:489:1: ruleTypedMember : ( ( rule__TypedMember__Group__0 ) ) ;
    public final void ruleTypedMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:493:2: ( ( ( rule__TypedMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__TypedMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__TypedMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:495:1: ( rule__TypedMember__Group__0 )
            {
             before(grammarAccess.getTypedMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:1: ( rule__TypedMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:2: rule__TypedMember__Group__0
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__0_in_ruleTypedMember994);
            rule__TypedMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleTypedMember"


    // $ANTLR start "entryRuleSkipMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:508:1: entryRuleSkipMember : ruleSkipMember EOF ;
    public final void entryRuleSkipMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:509:1: ( ruleSkipMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:510:1: ruleSkipMember EOF
            {
             before(grammarAccess.getSkipMemberRule()); 
            pushFollow(FOLLOW_ruleSkipMember_in_entryRuleSkipMember1021);
            ruleSkipMember();

            state._fsp--;

             after(grammarAccess.getSkipMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkipMember1028); 

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
    // $ANTLR end "entryRuleSkipMember"


    // $ANTLR start "ruleSkipMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:517:1: ruleSkipMember : ( ( rule__SkipMember__Group__0 ) ) ;
    public final void ruleSkipMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:521:2: ( ( ( rule__SkipMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:522:1: ( ( rule__SkipMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:522:1: ( ( rule__SkipMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:523:1: ( rule__SkipMember__Group__0 )
            {
             before(grammarAccess.getSkipMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:524:1: ( rule__SkipMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:524:2: rule__SkipMember__Group__0
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0_in_ruleSkipMember1054);
            rule__SkipMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkipMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleSkipMember"


    // $ANTLR start "entryRuleSimpleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:536:1: entryRuleSimpleMember : ruleSimpleMember EOF ;
    public final void entryRuleSimpleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:537:1: ( ruleSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:538:1: ruleSimpleMember EOF
            {
             before(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember1081);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getSimpleMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember1088); 

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
    // $ANTLR end "entryRuleSimpleMember"


    // $ANTLR start "ruleSimpleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:545:1: ruleSimpleMember : ( ( rule__SimpleMember__Group__0 ) ) ;
    public final void ruleSimpleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:549:2: ( ( ( rule__SimpleMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__SimpleMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__SimpleMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:551:1: ( rule__SimpleMember__Group__0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:1: ( rule__SimpleMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:2: rule__SimpleMember__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember1114);
            rule__SimpleMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleMember"


    // $ANTLR start "entryRuleType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:564:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:565:1: ( ruleType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:566:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1141);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1148); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:573:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:577:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__Type__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:579:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:1: ( rule__Type__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1174);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleGenericListType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:592:1: entryRuleGenericListType : ruleGenericListType EOF ;
    public final void entryRuleGenericListType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:593:1: ( ruleGenericListType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:594:1: ruleGenericListType EOF
            {
             before(grammarAccess.getGenericListTypeRule()); 
            pushFollow(FOLLOW_ruleGenericListType_in_entryRuleGenericListType1201);
            ruleGenericListType();

            state._fsp--;

             after(grammarAccess.getGenericListTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListType1208); 

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
    // $ANTLR end "entryRuleGenericListType"


    // $ANTLR start "ruleGenericListType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:601:1: ruleGenericListType : ( ( rule__GenericListType__Group__0 ) ) ;
    public final void ruleGenericListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:605:2: ( ( ( rule__GenericListType__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__GenericListType__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__GenericListType__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:607:1: ( rule__GenericListType__Group__0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:1: ( rule__GenericListType__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:2: rule__GenericListType__Group__0
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0_in_ruleGenericListType1234);
            rule__GenericListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericListTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleGenericListType"


    // $ANTLR start "entryRuleUserType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:620:1: entryRuleUserType : ruleUserType EOF ;
    public final void entryRuleUserType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:621:1: ( ruleUserType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:622:1: ruleUserType EOF
            {
             before(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType1261);
            ruleUserType();

            state._fsp--;

             after(grammarAccess.getUserTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType1268); 

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
    // $ANTLR end "entryRuleUserType"


    // $ANTLR start "ruleUserType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:629:1: ruleUserType : ( ( rule__UserType__DeclarationAssignment ) ) ;
    public final void ruleUserType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:633:2: ( ( ( rule__UserType__DeclarationAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:634:1: ( ( rule__UserType__DeclarationAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:634:1: ( ( rule__UserType__DeclarationAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:635:1: ( rule__UserType__DeclarationAssignment )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:636:1: ( rule__UserType__DeclarationAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:636:2: rule__UserType__DeclarationAssignment
            {
            pushFollow(FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1294);
            rule__UserType__DeclarationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeAccess().getDeclarationAssignment()); 

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
    // $ANTLR end "ruleUserType"


    // $ANTLR start "entryRuleUserTypeDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:648:1: entryRuleUserTypeDeclaration : ruleUserTypeDeclaration EOF ;
    public final void entryRuleUserTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:649:1: ( ruleUserTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:650:1: ruleUserTypeDeclaration EOF
            {
             before(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1321);
            ruleUserTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration1328); 

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
    // $ANTLR end "entryRuleUserTypeDeclaration"


    // $ANTLR start "ruleUserTypeDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:657:1: ruleUserTypeDeclaration : ( ( rule__UserTypeDeclaration__Alternatives ) ) ;
    public final void ruleUserTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:661:2: ( ( ( rule__UserTypeDeclaration__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:662:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:662:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:663:1: ( rule__UserTypeDeclaration__Alternatives )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:664:1: ( rule__UserTypeDeclaration__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:664:2: rule__UserTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1354);
            rule__UserTypeDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUserTypeDeclaration"


    // $ANTLR start "entryRuleComplexTypeDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:676:1: entryRuleComplexTypeDeclaration : ruleComplexTypeDeclaration EOF ;
    public final void entryRuleComplexTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:677:1: ( ruleComplexTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:678:1: ruleComplexTypeDeclaration EOF
            {
             before(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1381);
            ruleComplexTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1388); 

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
    // $ANTLR end "entryRuleComplexTypeDeclaration"


    // $ANTLR start "ruleComplexTypeDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:685:1: ruleComplexTypeDeclaration : ( ( rule__ComplexTypeDeclaration__Group__0 ) ) ;
    public final void ruleComplexTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:689:2: ( ( ( rule__ComplexTypeDeclaration__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:690:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:690:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:691:1: ( rule__ComplexTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:692:1: ( rule__ComplexTypeDeclaration__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:692:2: rule__ComplexTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1414);
            rule__ComplexTypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleComplexTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:704:1: entryRuleEnumTypeDeclaration : ruleEnumTypeDeclaration EOF ;
    public final void entryRuleEnumTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:705:1: ( ruleEnumTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:706:1: ruleEnumTypeDeclaration EOF
            {
             before(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1441);
            ruleEnumTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1448); 

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
    // $ANTLR end "entryRuleEnumTypeDeclaration"


    // $ANTLR start "ruleEnumTypeDeclaration"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:713:1: ruleEnumTypeDeclaration : ( ( rule__EnumTypeDeclaration__Group__0 ) ) ;
    public final void ruleEnumTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:717:2: ( ( ( rule__EnumTypeDeclaration__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:718:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:718:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:719:1: ( rule__EnumTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:720:1: ( rule__EnumTypeDeclaration__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:720:2: rule__EnumTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1474);
            rule__EnumTypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeLiteral"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:732:1: entryRuleEnumTypeLiteral : ruleEnumTypeLiteral EOF ;
    public final void entryRuleEnumTypeLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:733:1: ( ruleEnumTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:734:1: ruleEnumTypeLiteral EOF
            {
             before(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1501);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral1508); 

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
    // $ANTLR end "entryRuleEnumTypeLiteral"


    // $ANTLR start "ruleEnumTypeLiteral"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:741:1: ruleEnumTypeLiteral : ( ( rule__EnumTypeLiteral__Group__0 ) ) ;
    public final void ruleEnumTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:745:2: ( ( ( rule__EnumTypeLiteral__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:746:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:746:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:747:1: ( rule__EnumTypeLiteral__Group__0 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:748:1: ( rule__EnumTypeLiteral__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:748:2: rule__EnumTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1534);
            rule__EnumTypeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumTypeLiteral"


    // $ANTLR start "entryRuleEnumMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:760:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:761:1: ( ruleEnumMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:762:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember1561);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember1568); 

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
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:769:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:773:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:774:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:774:1: ( ( rule__EnumMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:775:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:776:1: ( rule__EnumMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:776:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1594);
            rule__EnumMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleComplexTypeLiteral"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:788:1: entryRuleComplexTypeLiteral : ruleComplexTypeLiteral EOF ;
    public final void entryRuleComplexTypeLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:789:1: ( ruleComplexTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:790:1: ruleComplexTypeLiteral EOF
            {
             before(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1621);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral1628); 

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
    // $ANTLR end "entryRuleComplexTypeLiteral"


    // $ANTLR start "ruleComplexTypeLiteral"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:797:1: ruleComplexTypeLiteral : ( ( rule__ComplexTypeLiteral__Group__0 ) ) ;
    public final void ruleComplexTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:801:2: ( ( ( rule__ComplexTypeLiteral__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:802:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:802:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:803:1: ( rule__ComplexTypeLiteral__Group__0 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:804:1: ( rule__ComplexTypeLiteral__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:804:2: rule__ComplexTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1654);
            rule__ComplexTypeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleComplexTypeLiteral"


    // $ANTLR start "entryRuleIntrinsicType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:816:1: entryRuleIntrinsicType : ruleIntrinsicType EOF ;
    public final void entryRuleIntrinsicType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:817:1: ( ruleIntrinsicType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:818:1: ruleIntrinsicType EOF
            {
             before(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1681);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getIntrinsicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType1688); 

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
    // $ANTLR end "entryRuleIntrinsicType"


    // $ANTLR start "ruleIntrinsicType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:825:1: ruleIntrinsicType : ( ( rule__IntrinsicType__Alternatives ) ) ;
    public final void ruleIntrinsicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:829:2: ( ( ( rule__IntrinsicType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:830:1: ( ( rule__IntrinsicType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:830:1: ( ( rule__IntrinsicType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:831:1: ( rule__IntrinsicType__Alternatives )
            {
             before(grammarAccess.getIntrinsicTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:832:1: ( rule__IntrinsicType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:832:2: rule__IntrinsicType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1714);
            rule__IntrinsicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntrinsicTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIntrinsicType"


    // $ANTLR start "entryRuleStringType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:844:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:845:1: ( ruleStringType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:846:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1741);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1748); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:853:1: ruleStringType : ( ( rule__StringType__IdAssignment ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:857:2: ( ( ( rule__StringType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:858:1: ( ( rule__StringType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:858:1: ( ( rule__StringType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:859:1: ( rule__StringType__IdAssignment )
            {
             before(grammarAccess.getStringTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:860:1: ( rule__StringType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:860:2: rule__StringType__IdAssignment
            {
            pushFollow(FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1774);
            rule__StringType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:872:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:873:1: ( ruleBooleanType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:874:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1801);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1808); 

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:881:1: ruleBooleanType : ( ( rule__BooleanType__IdAssignment ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:885:2: ( ( ( rule__BooleanType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:886:1: ( ( rule__BooleanType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:886:1: ( ( rule__BooleanType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:887:1: ( rule__BooleanType__IdAssignment )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:888:1: ( rule__BooleanType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:888:2: rule__BooleanType__IdAssignment
            {
            pushFollow(FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1834);
            rule__BooleanType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleNumericType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:900:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:901:1: ( ruleNumericType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:902:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType1861);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType1868); 

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
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:909:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:913:2: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:914:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:914:1: ( ( rule__NumericType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:915:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:916:1: ( rule__NumericType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:916:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1894);
            rule__NumericType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleIntegerType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:928:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:929:1: ( ruleIntegerType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:930:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType1921);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType1928); 

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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:937:1: ruleIntegerType : ( ( rule__IntegerType__IdAssignment ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:941:2: ( ( ( rule__IntegerType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:942:1: ( ( rule__IntegerType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:942:1: ( ( rule__IntegerType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:943:1: ( rule__IntegerType__IdAssignment )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:944:1: ( rule__IntegerType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:944:2: rule__IntegerType__IdAssignment
            {
            pushFollow(FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1954);
            rule__IntegerType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleLongType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:956:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:957:1: ( ruleLongType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:958:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType1981);
            ruleLongType();

            state._fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType1988); 

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
    // $ANTLR end "entryRuleLongType"


    // $ANTLR start "ruleLongType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:965:1: ruleLongType : ( ( rule__LongType__IdAssignment ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:969:2: ( ( ( rule__LongType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:970:1: ( ( rule__LongType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:970:1: ( ( rule__LongType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:971:1: ( rule__LongType__IdAssignment )
            {
             before(grammarAccess.getLongTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:972:1: ( rule__LongType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:972:2: rule__LongType__IdAssignment
            {
            pushFollow(FOLLOW_rule__LongType__IdAssignment_in_ruleLongType2014);
            rule__LongType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLongTypeAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleLongType"


    // $ANTLR start "entryRuleDoubleType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:984:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:985:1: ( ruleDoubleType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:986:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType2041);
            ruleDoubleType();

            state._fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType2048); 

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
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:993:1: ruleDoubleType : ( ( rule__DoubleType__IdAssignment ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:997:2: ( ( ( rule__DoubleType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:998:1: ( ( rule__DoubleType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:998:1: ( ( rule__DoubleType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:999:1: ( rule__DoubleType__IdAssignment )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1000:1: ( rule__DoubleType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1000:2: rule__DoubleType__IdAssignment
            {
            pushFollow(FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType2074);
            rule__DoubleType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoubleTypeAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleFQN"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1012:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1013:1: ( ruleFQN EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1014:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2101);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2108); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1021:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1025:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1026:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1026:1: ( ( rule__FQN__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1027:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1028:1: ( rule__FQN__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1028:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN2134);
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


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1040:1: entryRuleSignedNumber : ruleSignedNumber EOF ;
    public final void entryRuleSignedNumber() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1041:1: ( ruleSignedNumber EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1042:1: ruleSignedNumber EOF
            {
             before(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber2161);
            ruleSignedNumber();

            state._fsp--;

             after(grammarAccess.getSignedNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber2168); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1049:1: ruleSignedNumber : ( ( rule__SignedNumber__Group__0 ) ) ;
    public final void ruleSignedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1053:2: ( ( ( rule__SignedNumber__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1054:1: ( ( rule__SignedNumber__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1054:1: ( ( rule__SignedNumber__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1055:1: ( rule__SignedNumber__Group__0 )
            {
             before(grammarAccess.getSignedNumberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1056:1: ( rule__SignedNumber__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1056:2: rule__SignedNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2194);
            rule__SignedNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedNumberAccess().getGroup()); 

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


    // $ANTLR start "ruleHttpMethodType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1069:1: ruleHttpMethodType : ( ( rule__HttpMethodType__Alternatives ) ) ;
    public final void ruleHttpMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1073:1: ( ( ( rule__HttpMethodType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1074:1: ( ( rule__HttpMethodType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1074:1: ( ( rule__HttpMethodType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1075:1: ( rule__HttpMethodType__Alternatives )
            {
             before(grammarAccess.getHttpMethodTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1076:1: ( rule__HttpMethodType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1076:2: rule__HttpMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2231);
            rule__HttpMethodType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHttpMethodType"


    // $ANTLR start "ruleBooleanValue"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1088:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1092:1: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1093:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1093:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1094:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1095:1: ( rule__BooleanValue__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1095:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2267);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1106:1: rule__Declaration__Alternatives : ( ( ruleUserTypeDeclaration ) | ( ruleClient ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1110:1: ( ( ruleUserTypeDeclaration ) | ( ruleClient ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33||LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1111:1: ( ruleUserTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1111:1: ( ruleUserTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1112:1: ruleUserTypeDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2302);
                    ruleUserTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1117:6: ( ruleClient )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1117:6: ( ruleClient )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1118:1: ruleClient
                    {
                     before(grammarAccess.getDeclarationAccess().getClientParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClient_in_rule__Declaration__Alternatives2319);
                    ruleClient();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getClientParserRuleCall_1()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__ClientBlock__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1128:1: rule__ClientBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) );
    public final void rule__ClientBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1132:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1133:1: ( ruleHeaderBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1133:1: ( ruleHeaderBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1134:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getClientBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__ClientBlock__Alternatives2351);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getClientBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1139:6: ( ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1139:6: ( ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1140:1: ruleParamsBlock
                    {
                     before(grammarAccess.getClientBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__ClientBlock__Alternatives2368);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getClientBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1145:6: ( ruleHttpMethod )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1145:6: ( ruleHttpMethod )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1146:1: ruleHttpMethod
                    {
                     before(grammarAccess.getClientBlockAccess().getHttpMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHttpMethod_in_rule__ClientBlock__Alternatives2385);
                    ruleHttpMethod();

                    state._fsp--;

                     after(grammarAccess.getClientBlockAccess().getHttpMethodParserRuleCall_2()); 

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
    // $ANTLR end "rule__ClientBlock__Alternatives"


    // $ANTLR start "rule__HttpMethodBlock__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1156:1: rule__HttpMethodBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) );
    public final void rule__HttpMethodBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1160:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1161:1: ( ruleHeaderBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1161:1: ( ruleHeaderBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1162:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2417);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1167:6: ( ruleParamsBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1167:6: ( ruleParamsBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1168:1: ruleParamsBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2434);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1173:6: ( ruleBodyBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1173:6: ( ruleBodyBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1174:1: ruleBodyBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2451);
                    ruleBodyBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1179:6: ( ruleResponseBlock )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1179:6: ( ruleResponseBlock )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1180:1: ruleResponseBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2468);
                    ruleResponseBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 

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
    // $ANTLR end "rule__HttpMethodBlock__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1190:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1194:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_NUMBER:
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1195:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1195:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1196:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1197:1: ( rule__Literal__Group_0__0 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1197:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2500);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1201:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1201:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1202:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1203:1: ( rule__Literal__Group_1__0 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1203:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2518);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1207:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1207:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1208:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1209:1: ( rule__Literal__Group_2__0 )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1209:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2536);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

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


    // $ANTLR start "rule__BlockType__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1218:1: rule__BlockType__Alternatives : ( ( ruleType ) | ( ruleComplexTypeLiteral ) );
    public final void rule__BlockType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1222:1: ( ( ruleType ) | ( ruleComplexTypeLiteral ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=36 && LA5_0<=40)) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1223:1: ( ruleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1223:1: ( ruleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1224:1: ruleType
                    {
                     before(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__BlockType__Alternatives2569);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1229:6: ( ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1229:6: ( ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1230:1: ruleComplexTypeLiteral
                    {
                     before(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2586);
                    ruleComplexTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__BlockType__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1240:1: rule__Member__Alternatives : ( ( ruleTypedMember ) | ( ruleSkipMember ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1244:1: ( ( ruleTypedMember ) | ( ruleSkipMember ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20) ) {
                    alt6=2;
                }
                else if ( (LA6_1==24) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==24) ) {
                    alt6=1;
                }
                else if ( (LA6_2==20) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1245:1: ( ruleTypedMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1245:1: ( ruleTypedMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1246:1: ruleTypedMember
                    {
                     before(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2618);
                    ruleTypedMember();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1251:6: ( ruleSkipMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1251:6: ( ruleSkipMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1252:1: ruleSkipMember
                    {
                     before(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2635);
                    ruleSkipMember();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 

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
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__TypedMember__NameAlternatives_0_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1262:1: rule__TypedMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TypedMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1266:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1267:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1267:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1268:1: RULE_ID
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02667); 
                     after(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1273:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1273:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1274:1: RULE_STRING
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02684); 
                     after(grammarAccess.getTypedMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__TypedMember__NameAlternatives_0_0"


    // $ANTLR start "rule__SkipMember__NameAlternatives_0_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1284:1: rule__SkipMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SkipMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1288:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1289:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1289:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1290:1: RULE_ID
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02716); 
                     after(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1295:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1295:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1296:1: RULE_STRING
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02733); 
                     after(grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__SkipMember__NameAlternatives_0_0"


    // $ANTLR start "rule__SimpleMember__NameAlternatives_0_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1306:1: rule__SimpleMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SimpleMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1310:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1311:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1311:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1312:1: RULE_ID
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02765); 
                     after(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1317:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1317:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1318:1: RULE_STRING
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02782); 
                     after(grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__SimpleMember__NameAlternatives_0_0"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1328:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1332:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1333:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1333:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1334:1: ruleUserType
                    {
                     before(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__Type__Alternatives2814);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1339:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1339:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1340:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2831);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:6: ( ruleGenericListType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:6: ( ruleGenericListType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1346:1: ruleGenericListType
                    {
                     before(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2848);
                    ruleGenericListType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__GenericListType__ElementTypeAlternatives_0_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1356:1: rule__GenericListType__ElementTypeAlternatives_0_0 : ( ( ruleUserType ) | ( ruleIntrinsicType ) );
    public final void rule__GenericListType__ElementTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1360:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=36 && LA11_0<=40)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1361:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1361:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1362:1: ruleUserType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02880);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1367:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1367:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1368:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02897);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__GenericListType__ElementTypeAlternatives_0_0"


    // $ANTLR start "rule__UserTypeDeclaration__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1378:1: rule__UserTypeDeclaration__Alternatives : ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1382:1: ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1383:1: ( ruleComplexTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1383:1: ( ruleComplexTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1384:1: ruleComplexTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2929);
                    ruleComplexTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1389:6: ( ruleEnumTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1389:6: ( ruleEnumTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1390:1: ruleEnumTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2946);
                    ruleEnumTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 

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
    // $ANTLR end "rule__UserTypeDeclaration__Alternatives"


    // $ANTLR start "rule__IntrinsicType__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1400:1: rule__IntrinsicType__Alternatives : ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) );
    public final void rule__IntrinsicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1404:1: ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1405:1: ( ruleStringType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1405:1: ( ruleStringType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1406:1: ruleStringType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2978);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1411:6: ( ruleBooleanType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1411:6: ( ruleBooleanType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1412:1: ruleBooleanType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2995);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1417:6: ( ruleNumericType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1417:6: ( ruleNumericType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1418:1: ruleNumericType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives3012);
                    ruleNumericType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__IntrinsicType__Alternatives"


    // $ANTLR start "rule__NumericType__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1428:1: rule__NumericType__Alternatives : ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1432:1: ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt14=1;
                }
                break;
            case 39:
                {
                alt14=2;
                }
                break;
            case 40:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1433:1: ( ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1433:1: ( ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1434:1: ruleIntegerType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives3044);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1439:6: ( ruleLongType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1439:6: ( ruleLongType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1440:1: ruleLongType
                    {
                     before(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__NumericType__Alternatives3061);
                    ruleLongType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1445:6: ( ruleDoubleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1445:6: ( ruleDoubleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1446:1: ruleDoubleType
                    {
                     before(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives3078);
                    ruleDoubleType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__NumericType__Alternatives"


    // $ANTLR start "rule__HttpMethodType__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1456:1: rule__HttpMethodType__Alternatives : ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) );
    public final void rule__HttpMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1460:1: ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt15=1;
                }
                break;
            case 13:
                {
                alt15=2;
                }
                break;
            case 14:
                {
                alt15=3;
                }
                break;
            case 15:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1461:1: ( ( 'get' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1461:1: ( ( 'get' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1462:1: ( 'get' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1463:1: ( 'get' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1463:3: 'get'
                    {
                    match(input,12,FOLLOW_12_in_rule__HttpMethodType__Alternatives3111); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1468:6: ( ( 'put' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1468:6: ( ( 'put' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1469:1: ( 'put' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1470:1: ( 'put' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1470:3: 'put'
                    {
                    match(input,13,FOLLOW_13_in_rule__HttpMethodType__Alternatives3132); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1475:6: ( ( 'post' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1475:6: ( ( 'post' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1476:1: ( 'post' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1477:1: ( 'post' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1477:3: 'post'
                    {
                    match(input,14,FOLLOW_14_in_rule__HttpMethodType__Alternatives3153); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1482:6: ( ( 'delete' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1482:6: ( ( 'delete' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1483:1: ( 'delete' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1484:1: ( 'delete' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1484:3: 'delete'
                    {
                    match(input,15,FOLLOW_15_in_rule__HttpMethodType__Alternatives3174); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__HttpMethodType__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1494:1: rule__BooleanValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1498:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1499:1: ( ( 'true' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1499:1: ( ( 'true' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1500:1: ( 'true' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1501:1: ( 'true' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1501:3: 'true'
                    {
                    match(input,16,FOLLOW_16_in_rule__BooleanValue__Alternatives3210); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1506:6: ( ( 'false' ) )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1506:6: ( ( 'false' ) )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1507:1: ( 'false' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1508:1: ( 'false' )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1508:3: 'false'
                    {
                    match(input,17,FOLLOW_17_in_rule__BooleanValue__Alternatives3231); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1520:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1524:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1525:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03264);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03267);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1532:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1536:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1537:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1537:1: ( 'package' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1538:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__0__Impl3295); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1551:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1555:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1556:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13326);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13329);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1563:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1567:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1568:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1568:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1569:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1570:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1570:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3356);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1580:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1584:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1585:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23386);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1591:1: rule__Model__Group__2__Impl : ( ( rule__Model__DeclarationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1595:1: ( ( ( rule__Model__DeclarationsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1596:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1596:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1597:1: ( rule__Model__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1598:1: ( rule__Model__DeclarationsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19||LA17_0==33||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1598:2: rule__Model__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3413);
            	    rule__Model__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 

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


    // $ANTLR start "rule__Client__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1614:1: rule__Client__Group__0 : rule__Client__Group__0__Impl rule__Client__Group__1 ;
    public final void rule__Client__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1618:1: ( rule__Client__Group__0__Impl rule__Client__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1619:2: rule__Client__Group__0__Impl rule__Client__Group__1
            {
            pushFollow(FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03450);
            rule__Client__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03453);
            rule__Client__Group__1();

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
    // $ANTLR end "rule__Client__Group__0"


    // $ANTLR start "rule__Client__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1626:1: rule__Client__Group__0__Impl : ( 'client' ) ;
    public final void rule__Client__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1630:1: ( ( 'client' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1631:1: ( 'client' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1631:1: ( 'client' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1632:1: 'client'
            {
             before(grammarAccess.getClientAccess().getClientKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Client__Group__0__Impl3481); 
             after(grammarAccess.getClientAccess().getClientKeyword_0()); 

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
    // $ANTLR end "rule__Client__Group__0__Impl"


    // $ANTLR start "rule__Client__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1645:1: rule__Client__Group__1 : rule__Client__Group__1__Impl rule__Client__Group__2 ;
    public final void rule__Client__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1649:1: ( rule__Client__Group__1__Impl rule__Client__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1650:2: rule__Client__Group__1__Impl rule__Client__Group__2
            {
            pushFollow(FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13512);
            rule__Client__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13515);
            rule__Client__Group__2();

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
    // $ANTLR end "rule__Client__Group__1"


    // $ANTLR start "rule__Client__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1657:1: rule__Client__Group__1__Impl : ( ( rule__Client__NameAssignment_1 ) ) ;
    public final void rule__Client__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1661:1: ( ( ( rule__Client__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1662:1: ( ( rule__Client__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1662:1: ( ( rule__Client__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1663:1: ( rule__Client__NameAssignment_1 )
            {
             before(grammarAccess.getClientAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1664:1: ( rule__Client__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1664:2: rule__Client__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3542);
            rule__Client__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Client__Group__1__Impl"


    // $ANTLR start "rule__Client__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1674:1: rule__Client__Group__2 : rule__Client__Group__2__Impl rule__Client__Group__3 ;
    public final void rule__Client__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1678:1: ( rule__Client__Group__2__Impl rule__Client__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1679:2: rule__Client__Group__2__Impl rule__Client__Group__3
            {
            pushFollow(FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23572);
            rule__Client__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23575);
            rule__Client__Group__3();

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
    // $ANTLR end "rule__Client__Group__2"


    // $ANTLR start "rule__Client__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1686:1: rule__Client__Group__2__Impl : ( ( rule__Client__BaseUrlAssignment_2 )? ) ;
    public final void rule__Client__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1690:1: ( ( ( rule__Client__BaseUrlAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1691:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1691:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1692:1: ( rule__Client__BaseUrlAssignment_2 )?
            {
             before(grammarAccess.getClientAccess().getBaseUrlAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1693:1: ( rule__Client__BaseUrlAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1693:2: rule__Client__BaseUrlAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3602);
                    rule__Client__BaseUrlAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClientAccess().getBaseUrlAssignment_2()); 

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
    // $ANTLR end "rule__Client__Group__2__Impl"


    // $ANTLR start "rule__Client__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1703:1: rule__Client__Group__3 : rule__Client__Group__3__Impl rule__Client__Group__4 ;
    public final void rule__Client__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1707:1: ( rule__Client__Group__3__Impl rule__Client__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1708:2: rule__Client__Group__3__Impl rule__Client__Group__4
            {
            pushFollow(FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33633);
            rule__Client__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33636);
            rule__Client__Group__4();

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
    // $ANTLR end "rule__Client__Group__3"


    // $ANTLR start "rule__Client__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1715:1: rule__Client__Group__3__Impl : ( '{' ) ;
    public final void rule__Client__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1719:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1720:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1720:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1721:1: '{'
            {
             before(grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Client__Group__3__Impl3664); 
             after(grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Client__Group__3__Impl"


    // $ANTLR start "rule__Client__Group__4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1734:1: rule__Client__Group__4 : rule__Client__Group__4__Impl rule__Client__Group__5 ;
    public final void rule__Client__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1738:1: ( rule__Client__Group__4__Impl rule__Client__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1739:2: rule__Client__Group__4__Impl rule__Client__Group__5
            {
            pushFollow(FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43695);
            rule__Client__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43698);
            rule__Client__Group__5();

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
    // $ANTLR end "rule__Client__Group__4"


    // $ANTLR start "rule__Client__Group__4__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1746:1: rule__Client__Group__4__Impl : ( ( rule__Client__BlocksAssignment_4 )* ) ;
    public final void rule__Client__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1750:1: ( ( ( rule__Client__BlocksAssignment_4 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1751:1: ( ( rule__Client__BlocksAssignment_4 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1751:1: ( ( rule__Client__BlocksAssignment_4 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1752:1: ( rule__Client__BlocksAssignment_4 )*
            {
             before(grammarAccess.getClientAccess().getBlocksAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1753:1: ( rule__Client__BlocksAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=12 && LA19_0<=15)||LA19_0==22||LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1753:2: rule__Client__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Client__BlocksAssignment_4_in_rule__Client__Group__4__Impl3725);
            	    rule__Client__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClientAccess().getBlocksAssignment_4()); 

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
    // $ANTLR end "rule__Client__Group__4__Impl"


    // $ANTLR start "rule__Client__Group__5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1763:1: rule__Client__Group__5 : rule__Client__Group__5__Impl ;
    public final void rule__Client__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1767:1: ( rule__Client__Group__5__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1768:2: rule__Client__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53756);
            rule__Client__Group__5__Impl();

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
    // $ANTLR end "rule__Client__Group__5"


    // $ANTLR start "rule__Client__Group__5__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1774:1: rule__Client__Group__5__Impl : ( '}' ) ;
    public final void rule__Client__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1778:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1779:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1779:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1780:1: '}'
            {
             before(grammarAccess.getClientAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Client__Group__5__Impl3784); 
             after(grammarAccess.getClientAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Client__Group__5__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1805:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1809:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1810:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03827);
            rule__HeaderBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03830);
            rule__HeaderBlock__Group__1();

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
    // $ANTLR end "rule__HeaderBlock__Group__0"


    // $ANTLR start "rule__HeaderBlock__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1817:1: rule__HeaderBlock__Group__0__Impl : ( 'headers' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1821:1: ( ( 'headers' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1822:1: ( 'headers' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1822:1: ( 'headers' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1823:1: 'headers'
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__HeaderBlock__Group__0__Impl3858); 
             after(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0()); 

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
    // $ANTLR end "rule__HeaderBlock__Group__0__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1836:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1840:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1841:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13889);
            rule__HeaderBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13892);
            rule__HeaderBlock__Group__2();

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
    // $ANTLR end "rule__HeaderBlock__Group__1"


    // $ANTLR start "rule__HeaderBlock__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1848:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1852:1: ( ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1854:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1855:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1855:2: rule__HeaderBlock__HeadersAssignment_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl3919);
            rule__HeaderBlock__HeadersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_1()); 

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
    // $ANTLR end "rule__HeaderBlock__Group__1__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1865:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1869:1: ( rule__HeaderBlock__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1870:2: rule__HeaderBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23949);
            rule__HeaderBlock__Group__2__Impl();

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
    // $ANTLR end "rule__HeaderBlock__Group__2"


    // $ANTLR start "rule__HeaderBlock__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1876:1: rule__HeaderBlock__Group__2__Impl : ( ( rule__HeaderBlock__Group_2__0 )* ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1880:1: ( ( ( rule__HeaderBlock__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1881:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1881:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1882:1: ( rule__HeaderBlock__Group_2__0 )*
            {
             before(grammarAccess.getHeaderBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1883:1: ( rule__HeaderBlock__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1883:2: rule__HeaderBlock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl3976);
            	    rule__HeaderBlock__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getHeaderBlockAccess().getGroup_2()); 

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
    // $ANTLR end "rule__HeaderBlock__Group__2__Impl"


    // $ANTLR start "rule__HeaderBlock__Group_2__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1899:1: rule__HeaderBlock__Group_2__0 : rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 ;
    public final void rule__HeaderBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1903:1: ( rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1904:2: rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__04013);
            rule__HeaderBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__04016);
            rule__HeaderBlock__Group_2__1();

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
    // $ANTLR end "rule__HeaderBlock__Group_2__0"


    // $ANTLR start "rule__HeaderBlock__Group_2__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1911:1: rule__HeaderBlock__Group_2__0__Impl : ( ',' ) ;
    public final void rule__HeaderBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1915:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1916:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1916:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1917:1: ','
            {
             before(grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__HeaderBlock__Group_2__0__Impl4044); 
             after(grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__HeaderBlock__Group_2__0__Impl"


    // $ANTLR start "rule__HeaderBlock__Group_2__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1930:1: rule__HeaderBlock__Group_2__1 : rule__HeaderBlock__Group_2__1__Impl ;
    public final void rule__HeaderBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1934:1: ( rule__HeaderBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1935:2: rule__HeaderBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__14075);
            rule__HeaderBlock__Group_2__1__Impl();

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
    // $ANTLR end "rule__HeaderBlock__Group_2__1"


    // $ANTLR start "rule__HeaderBlock__Group_2__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1941:1: rule__HeaderBlock__Group_2__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) ;
    public final void rule__HeaderBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1945:1: ( ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1946:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1946:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1947:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1948:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1948:2: rule__HeaderBlock__HeadersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl4102);
            rule__HeaderBlock__HeadersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2_1()); 

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
    // $ANTLR end "rule__HeaderBlock__Group_2__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1962:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1966:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1967:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__04136);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__04139);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1974:1: rule__Header__Group__0__Impl : ( ( rule__Header__NameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1978:1: ( ( ( rule__Header__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1979:1: ( ( rule__Header__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1979:1: ( ( rule__Header__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1980:1: ( rule__Header__NameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1981:1: ( rule__Header__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1981:2: rule__Header__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl4166);
            rule__Header__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1991:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1995:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1996:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__14196);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__14199);
            rule__Header__Group__2();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2003:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2007:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2008:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2008:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2009:1: ':'
            {
             before(grammarAccess.getHeaderAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Header__Group__1__Impl4227); 
             after(grammarAccess.getHeaderAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2022:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2026:1: ( rule__Header__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2027:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__24258);
            rule__Header__Group__2__Impl();

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
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2033:1: rule__Header__Group__2__Impl : ( ( rule__Header__ValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2037:1: ( ( ( rule__Header__ValueAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2038:1: ( ( rule__Header__ValueAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2038:1: ( ( rule__Header__ValueAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2039:1: ( rule__Header__ValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getValueAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2040:1: ( rule__Header__ValueAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2040:2: rule__Header__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl4285);
            rule__Header__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__HttpMethod__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2056:1: rule__HttpMethod__Group__0 : rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 ;
    public final void rule__HttpMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2060:1: ( rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2061:2: rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__04321);
            rule__HttpMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__04324);
            rule__HttpMethod__Group__1();

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
    // $ANTLR end "rule__HttpMethod__Group__0"


    // $ANTLR start "rule__HttpMethod__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2068:1: rule__HttpMethod__Group__0__Impl : ( ( rule__HttpMethod__TypeAssignment_0 ) ) ;
    public final void rule__HttpMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2072:1: ( ( ( rule__HttpMethod__TypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2073:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2073:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2074:1: ( rule__HttpMethod__TypeAssignment_0 )
            {
             before(grammarAccess.getHttpMethodAccess().getTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2075:1: ( rule__HttpMethod__TypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2075:2: rule__HttpMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4351);
            rule__HttpMethod__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__HttpMethod__Group__0__Impl"


    // $ANTLR start "rule__HttpMethod__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2085:1: rule__HttpMethod__Group__1 : rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 ;
    public final void rule__HttpMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2089:1: ( rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2090:2: rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14381);
            rule__HttpMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14384);
            rule__HttpMethod__Group__2();

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
    // $ANTLR end "rule__HttpMethod__Group__1"


    // $ANTLR start "rule__HttpMethod__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2097:1: rule__HttpMethod__Group__1__Impl : ( ( rule__HttpMethod__NameAssignment_1 ) ) ;
    public final void rule__HttpMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2101:1: ( ( ( rule__HttpMethod__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2102:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2102:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2103:1: ( rule__HttpMethod__NameAssignment_1 )
            {
             before(grammarAccess.getHttpMethodAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2104:1: ( rule__HttpMethod__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2104:2: rule__HttpMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4411);
            rule__HttpMethod__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__HttpMethod__Group__1__Impl"


    // $ANTLR start "rule__HttpMethod__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2114:1: rule__HttpMethod__Group__2 : rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 ;
    public final void rule__HttpMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2118:1: ( rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2119:2: rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24441);
            rule__HttpMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24444);
            rule__HttpMethod__Group__3();

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
    // $ANTLR end "rule__HttpMethod__Group__2"


    // $ANTLR start "rule__HttpMethod__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2126:1: rule__HttpMethod__Group__2__Impl : ( ( rule__HttpMethod__PathAssignment_2 )? ) ;
    public final void rule__HttpMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2130:1: ( ( ( rule__HttpMethod__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2131:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2131:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2132:1: ( rule__HttpMethod__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpMethodAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2133:1: ( rule__HttpMethod__PathAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2133:2: rule__HttpMethod__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4471);
                    rule__HttpMethod__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpMethodAccess().getPathAssignment_2()); 

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
    // $ANTLR end "rule__HttpMethod__Group__2__Impl"


    // $ANTLR start "rule__HttpMethod__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2143:1: rule__HttpMethod__Group__3 : rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 ;
    public final void rule__HttpMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2147:1: ( rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2148:2: rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34502);
            rule__HttpMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34505);
            rule__HttpMethod__Group__4();

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
    // $ANTLR end "rule__HttpMethod__Group__3"


    // $ANTLR start "rule__HttpMethod__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2155:1: rule__HttpMethod__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2159:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2160:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2160:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2161:1: '{'
            {
             before(grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__HttpMethod__Group__3__Impl4533); 
             after(grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__HttpMethod__Group__3__Impl"


    // $ANTLR start "rule__HttpMethod__Group__4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2174:1: rule__HttpMethod__Group__4 : rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 ;
    public final void rule__HttpMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2178:1: ( rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2179:2: rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44564);
            rule__HttpMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44567);
            rule__HttpMethod__Group__5();

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
    // $ANTLR end "rule__HttpMethod__Group__4"


    // $ANTLR start "rule__HttpMethod__Group__4__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2186:1: rule__HttpMethod__Group__4__Impl : ( ( rule__HttpMethod__BlocksAssignment_4 )* ) ;
    public final void rule__HttpMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2190:1: ( ( ( rule__HttpMethod__BlocksAssignment_4 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2191:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2191:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2192:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2193:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22||LA22_0==25||(LA22_0>=27 && LA22_0<=28)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2193:2: rule__HttpMethod__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4594);
            	    rule__HttpMethod__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4()); 

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
    // $ANTLR end "rule__HttpMethod__Group__4__Impl"


    // $ANTLR start "rule__HttpMethod__Group__5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2203:1: rule__HttpMethod__Group__5 : rule__HttpMethod__Group__5__Impl ;
    public final void rule__HttpMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2207:1: ( rule__HttpMethod__Group__5__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2208:2: rule__HttpMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54625);
            rule__HttpMethod__Group__5__Impl();

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
    // $ANTLR end "rule__HttpMethod__Group__5"


    // $ANTLR start "rule__HttpMethod__Group__5__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2214:1: rule__HttpMethod__Group__5__Impl : ( '}' ) ;
    public final void rule__HttpMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2218:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2219:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2219:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2220:1: '}'
            {
             before(grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__HttpMethod__Group__5__Impl4653); 
             after(grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__HttpMethod__Group__5__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2245:1: rule__ParamsBlock__Group__0 : rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 ;
    public final void rule__ParamsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2249:1: ( rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2250:2: rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__04696);
            rule__ParamsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__04699);
            rule__ParamsBlock__Group__1();

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
    // $ANTLR end "rule__ParamsBlock__Group__0"


    // $ANTLR start "rule__ParamsBlock__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2257:1: rule__ParamsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ParamsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2261:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2262:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2262:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2263:1: ()
            {
             before(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2264:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2266:1: 
            {
            }

             after(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__0__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2276:1: rule__ParamsBlock__Group__1 : rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 ;
    public final void rule__ParamsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2280:1: ( rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2281:2: rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__14757);
            rule__ParamsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__14760);
            rule__ParamsBlock__Group__2();

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
    // $ANTLR end "rule__ParamsBlock__Group__1"


    // $ANTLR start "rule__ParamsBlock__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2288:1: rule__ParamsBlock__Group__1__Impl : ( 'params' ) ;
    public final void rule__ParamsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2292:1: ( ( 'params' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2293:1: ( 'params' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2293:1: ( 'params' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2294:1: 'params'
            {
             before(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ParamsBlock__Group__1__Impl4788); 
             after(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 

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
    // $ANTLR end "rule__ParamsBlock__Group__1__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2307:1: rule__ParamsBlock__Group__2 : rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 ;
    public final void rule__ParamsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2311:1: ( rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2312:2: rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__24819);
            rule__ParamsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__24822);
            rule__ParamsBlock__Group__3();

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
    // $ANTLR end "rule__ParamsBlock__Group__2"


    // $ANTLR start "rule__ParamsBlock__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2319:1: rule__ParamsBlock__Group__2__Impl : ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) ;
    public final void rule__ParamsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2323:1: ( ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2324:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2324:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2325:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2326:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2326:2: rule__ParamsBlock__ParamsAssignment_2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl4849);
            rule__ParamsBlock__ParamsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 

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
    // $ANTLR end "rule__ParamsBlock__Group__2__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2336:1: rule__ParamsBlock__Group__3 : rule__ParamsBlock__Group__3__Impl ;
    public final void rule__ParamsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2340:1: ( rule__ParamsBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2341:2: rule__ParamsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__34879);
            rule__ParamsBlock__Group__3__Impl();

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
    // $ANTLR end "rule__ParamsBlock__Group__3"


    // $ANTLR start "rule__ParamsBlock__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2347:1: rule__ParamsBlock__Group__3__Impl : ( ( rule__ParamsBlock__Group_3__0 )* ) ;
    public final void rule__ParamsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2351:1: ( ( ( rule__ParamsBlock__Group_3__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2352:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2352:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2353:1: ( rule__ParamsBlock__Group_3__0 )*
            {
             before(grammarAccess.getParamsBlockAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2354:1: ( rule__ParamsBlock__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2354:2: rule__ParamsBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl4906);
            	    rule__ParamsBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getParamsBlockAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ParamsBlock__Group__3__Impl"


    // $ANTLR start "rule__ParamsBlock__Group_3__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2372:1: rule__ParamsBlock__Group_3__0 : rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 ;
    public final void rule__ParamsBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2376:1: ( rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2377:2: rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__04945);
            rule__ParamsBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__04948);
            rule__ParamsBlock__Group_3__1();

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
    // $ANTLR end "rule__ParamsBlock__Group_3__0"


    // $ANTLR start "rule__ParamsBlock__Group_3__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2384:1: rule__ParamsBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParamsBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2388:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2389:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2389:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2390:1: ','
            {
             before(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__ParamsBlock__Group_3__0__Impl4976); 
             after(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ParamsBlock__Group_3__0__Impl"


    // $ANTLR start "rule__ParamsBlock__Group_3__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2403:1: rule__ParamsBlock__Group_3__1 : rule__ParamsBlock__Group_3__1__Impl ;
    public final void rule__ParamsBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2407:1: ( rule__ParamsBlock__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2408:2: rule__ParamsBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15007);
            rule__ParamsBlock__Group_3__1__Impl();

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
    // $ANTLR end "rule__ParamsBlock__Group_3__1"


    // $ANTLR start "rule__ParamsBlock__Group_3__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2414:1: rule__ParamsBlock__Group_3__1__Impl : ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) ;
    public final void rule__ParamsBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2418:1: ( ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2419:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2419:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2420:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2421:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2421:2: rule__ParamsBlock__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5034);
            rule__ParamsBlock__ParamsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 

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
    // $ANTLR end "rule__ParamsBlock__Group_3__1__Impl"


    // $ANTLR start "rule__SimpleMemberAssignment__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2435:1: rule__SimpleMemberAssignment__Group__0 : rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1 ;
    public final void rule__SimpleMemberAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2439:1: ( rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2440:2: rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__0__Impl_in_rule__SimpleMemberAssignment__Group__05068);
            rule__SimpleMemberAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__1_in_rule__SimpleMemberAssignment__Group__05071);
            rule__SimpleMemberAssignment__Group__1();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__0"


    // $ANTLR start "rule__SimpleMemberAssignment__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2447:1: rule__SimpleMemberAssignment__Group__0__Impl : ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) ) ;
    public final void rule__SimpleMemberAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2451:1: ( ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2452:1: ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2452:1: ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2453:1: ( rule__SimpleMemberAssignment__MemberAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getMemberAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2454:1: ( rule__SimpleMemberAssignment__MemberAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2454:2: rule__SimpleMemberAssignment__MemberAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__MemberAssignment_0_in_rule__SimpleMemberAssignment__Group__0__Impl5098);
            rule__SimpleMemberAssignment__MemberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getMemberAssignment_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__0__Impl"


    // $ANTLR start "rule__SimpleMemberAssignment__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2464:1: rule__SimpleMemberAssignment__Group__1 : rule__SimpleMemberAssignment__Group__1__Impl ;
    public final void rule__SimpleMemberAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2468:1: ( rule__SimpleMemberAssignment__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2469:2: rule__SimpleMemberAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__1__Impl_in_rule__SimpleMemberAssignment__Group__15128);
            rule__SimpleMemberAssignment__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__1"


    // $ANTLR start "rule__SimpleMemberAssignment__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2475:1: rule__SimpleMemberAssignment__Group__1__Impl : ( ( rule__SimpleMemberAssignment__Group_1__0 )? ) ;
    public final void rule__SimpleMemberAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2479:1: ( ( ( rule__SimpleMemberAssignment__Group_1__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2480:1: ( ( rule__SimpleMemberAssignment__Group_1__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2480:1: ( ( rule__SimpleMemberAssignment__Group_1__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2481:1: ( rule__SimpleMemberAssignment__Group_1__0 )?
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2482:1: ( rule__SimpleMemberAssignment__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2482:2: rule__SimpleMemberAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__0_in_rule__SimpleMemberAssignment__Group__1__Impl5155);
                    rule__SimpleMemberAssignment__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__1__Impl"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2496:1: rule__SimpleMemberAssignment__Group_1__0 : rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1 ;
    public final void rule__SimpleMemberAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2500:1: ( rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2501:2: rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__0__Impl_in_rule__SimpleMemberAssignment__Group_1__05190);
            rule__SimpleMemberAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__1_in_rule__SimpleMemberAssignment__Group_1__05193);
            rule__SimpleMemberAssignment__Group_1__1();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__0"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2508:1: rule__SimpleMemberAssignment__Group_1__0__Impl : ( '=' ) ;
    public final void rule__SimpleMemberAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2512:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2513:1: ( '=' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2513:1: ( '=' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2514:1: '='
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getEqualsSignKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__SimpleMemberAssignment__Group_1__0__Impl5221); 
             after(grammarAccess.getSimpleMemberAssignmentAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2527:1: rule__SimpleMemberAssignment__Group_1__1 : rule__SimpleMemberAssignment__Group_1__1__Impl ;
    public final void rule__SimpleMemberAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2531:1: ( rule__SimpleMemberAssignment__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2532:2: rule__SimpleMemberAssignment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__1__Impl_in_rule__SimpleMemberAssignment__Group_1__15252);
            rule__SimpleMemberAssignment__Group_1__1__Impl();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__1"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2538:1: rule__SimpleMemberAssignment__Group_1__1__Impl : ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__SimpleMemberAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2542:1: ( ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2543:1: ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2543:1: ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2544:1: ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2545:1: ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2545:2: rule__SimpleMemberAssignment__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__DefaultValueAssignment_1_1_in_rule__SimpleMemberAssignment__Group_1__1__Impl5279);
            rule__SimpleMemberAssignment__DefaultValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueAssignment_1_1()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2559:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2563:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2564:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05313);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05316);
            rule__Literal__Group_0__1();

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
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2571:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2575:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2576:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2576:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2577:1: ()
            {
             before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2578:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2580:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2590:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2594:1: ( rule__Literal__Group_0__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2595:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15374);
            rule__Literal__Group_0__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2601:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__LiteralAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2605:1: ( ( ( rule__Literal__LiteralAssignment_0_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2606:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2606:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2607:1: ( rule__Literal__LiteralAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2608:1: ( rule__Literal__LiteralAssignment_0_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2608:2: rule__Literal__LiteralAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl5401);
            rule__Literal__LiteralAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2622:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2626:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2627:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__05435);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__05438);
            rule__Literal__Group_1__1();

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
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2634:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2638:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2639:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2639:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2640:1: ()
            {
             before(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2641:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2643:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2653:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2657:1: ( rule__Literal__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2658:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__15496);
            rule__Literal__Group_1__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2664:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__LiteralAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2668:1: ( ( ( rule__Literal__LiteralAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2669:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2669:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2670:1: ( rule__Literal__LiteralAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2671:1: ( rule__Literal__LiteralAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2671:2: rule__Literal__LiteralAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl5523);
            rule__Literal__LiteralAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2685:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2689:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2690:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__05557);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__05560);
            rule__Literal__Group_2__1();

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
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2697:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2701:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2702:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2702:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2703:1: ()
            {
             before(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2704:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2706:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2716:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2720:1: ( rule__Literal__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2721:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__15618);
            rule__Literal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2727:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__LiteralAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2731:1: ( ( ( rule__Literal__LiteralAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2732:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2732:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2733:1: ( rule__Literal__LiteralAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2734:1: ( rule__Literal__LiteralAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2734:2: rule__Literal__LiteralAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl5645);
            rule__Literal__LiteralAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 

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


    // $ANTLR start "rule__BodyBlock__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2748:1: rule__BodyBlock__Group__0 : rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 ;
    public final void rule__BodyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2752:1: ( rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2753:2: rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05679);
            rule__BodyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05682);
            rule__BodyBlock__Group__1();

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
    // $ANTLR end "rule__BodyBlock__Group__0"


    // $ANTLR start "rule__BodyBlock__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2760:1: rule__BodyBlock__Group__0__Impl : ( 'body' ) ;
    public final void rule__BodyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2764:1: ( ( 'body' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2765:1: ( 'body' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2765:1: ( 'body' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2766:1: 'body'
            {
             before(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__BodyBlock__Group__0__Impl5710); 
             after(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 

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
    // $ANTLR end "rule__BodyBlock__Group__0__Impl"


    // $ANTLR start "rule__BodyBlock__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2779:1: rule__BodyBlock__Group__1 : rule__BodyBlock__Group__1__Impl ;
    public final void rule__BodyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2783:1: ( rule__BodyBlock__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2784:2: rule__BodyBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15741);
            rule__BodyBlock__Group__1__Impl();

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
    // $ANTLR end "rule__BodyBlock__Group__1"


    // $ANTLR start "rule__BodyBlock__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2790:1: rule__BodyBlock__Group__1__Impl : ( ( rule__BodyBlock__TypeAssignment_1 ) ) ;
    public final void rule__BodyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2794:1: ( ( ( rule__BodyBlock__TypeAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2795:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2795:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2796:1: ( rule__BodyBlock__TypeAssignment_1 )
            {
             before(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2797:1: ( rule__BodyBlock__TypeAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2797:2: rule__BodyBlock__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5768);
            rule__BodyBlock__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__BodyBlock__Group__1__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2811:1: rule__ResponseBlock__Group__0 : rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 ;
    public final void rule__ResponseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2815:1: ( rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2816:2: rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05802);
            rule__ResponseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05805);
            rule__ResponseBlock__Group__1();

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
    // $ANTLR end "rule__ResponseBlock__Group__0"


    // $ANTLR start "rule__ResponseBlock__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2823:1: rule__ResponseBlock__Group__0__Impl : ( () ) ;
    public final void rule__ResponseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2827:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2828:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2828:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2829:1: ()
            {
             before(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2830:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2832:1: 
            {
            }

             after(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__0__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2842:1: rule__ResponseBlock__Group__1 : rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 ;
    public final void rule__ResponseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2846:1: ( rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2847:2: rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15863);
            rule__ResponseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15866);
            rule__ResponseBlock__Group__2();

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
    // $ANTLR end "rule__ResponseBlock__Group__1"


    // $ANTLR start "rule__ResponseBlock__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2854:1: rule__ResponseBlock__Group__1__Impl : ( 'response' ) ;
    public final void rule__ResponseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2858:1: ( ( 'response' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2859:1: ( 'response' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2859:1: ( 'response' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2860:1: 'response'
            {
             before(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ResponseBlock__Group__1__Impl5894); 
             after(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 

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
    // $ANTLR end "rule__ResponseBlock__Group__1__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2873:1: rule__ResponseBlock__Group__2 : rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 ;
    public final void rule__ResponseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2877:1: ( rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2878:2: rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__25925);
            rule__ResponseBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__25928);
            rule__ResponseBlock__Group__3();

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
    // $ANTLR end "rule__ResponseBlock__Group__2"


    // $ANTLR start "rule__ResponseBlock__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2885:1: rule__ResponseBlock__Group__2__Impl : ( ( rule__ResponseBlock__Group_2__0 )? ) ;
    public final void rule__ResponseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2889:1: ( ( ( rule__ResponseBlock__Group_2__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2890:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2890:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2891:1: ( rule__ResponseBlock__Group_2__0 )?
            {
             before(grammarAccess.getResponseBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2892:1: ( rule__ResponseBlock__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2892:2: rule__ResponseBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl5955);
                    rule__ResponseBlock__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ResponseBlock__Group__2__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2902:1: rule__ResponseBlock__Group__3 : rule__ResponseBlock__Group__3__Impl ;
    public final void rule__ResponseBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2906:1: ( rule__ResponseBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2907:2: rule__ResponseBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__35986);
            rule__ResponseBlock__Group__3__Impl();

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
    // $ANTLR end "rule__ResponseBlock__Group__3"


    // $ANTLR start "rule__ResponseBlock__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2913:1: rule__ResponseBlock__Group__3__Impl : ( ( rule__ResponseBlock__TypeAssignment_3 )? ) ;
    public final void rule__ResponseBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2917:1: ( ( ( rule__ResponseBlock__TypeAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2918:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2918:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2919:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            {
             before(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2920:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==20||(LA26_0>=36 && LA26_0<=40)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2920:2: rule__ResponseBlock__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6013);
                    rule__ResponseBlock__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__ResponseBlock__Group__3__Impl"


    // $ANTLR start "rule__ResponseBlock__Group_2__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2938:1: rule__ResponseBlock__Group_2__0 : rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 ;
    public final void rule__ResponseBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2942:1: ( rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2943:2: rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06052);
            rule__ResponseBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06055);
            rule__ResponseBlock__Group_2__1();

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
    // $ANTLR end "rule__ResponseBlock__Group_2__0"


    // $ANTLR start "rule__ResponseBlock__Group_2__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2950:1: rule__ResponseBlock__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ResponseBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2954:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2955:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2955:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2956:1: 'extends'
            {
             before(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__ResponseBlock__Group_2__0__Impl6083); 
             after(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__ResponseBlock__Group_2__0__Impl"


    // $ANTLR start "rule__ResponseBlock__Group_2__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2969:1: rule__ResponseBlock__Group_2__1 : rule__ResponseBlock__Group_2__1__Impl ;
    public final void rule__ResponseBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2973:1: ( rule__ResponseBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2974:2: rule__ResponseBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16114);
            rule__ResponseBlock__Group_2__1__Impl();

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
    // $ANTLR end "rule__ResponseBlock__Group_2__1"


    // $ANTLR start "rule__ResponseBlock__Group_2__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2980:1: rule__ResponseBlock__Group_2__1__Impl : ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__ResponseBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2984:1: ( ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2985:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2985:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2986:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2987:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2987:2: rule__ResponseBlock__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6141);
            rule__ResponseBlock__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__ResponseBlock__Group_2__1__Impl"


    // $ANTLR start "rule__TypedMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3001:1: rule__TypedMember__Group__0 : rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 ;
    public final void rule__TypedMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3005:1: ( rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3006:2: rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__06175);
            rule__TypedMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__06178);
            rule__TypedMember__Group__1();

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
    // $ANTLR end "rule__TypedMember__Group__0"


    // $ANTLR start "rule__TypedMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3013:1: rule__TypedMember__Group__0__Impl : ( ( rule__TypedMember__NameAssignment_0 ) ) ;
    public final void rule__TypedMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3017:1: ( ( ( rule__TypedMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3018:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3018:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3019:1: ( rule__TypedMember__NameAssignment_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3020:1: ( rule__TypedMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3020:2: rule__TypedMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl6205);
            rule__TypedMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedMemberAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__TypedMember__Group__0__Impl"


    // $ANTLR start "rule__TypedMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3030:1: rule__TypedMember__Group__1 : rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 ;
    public final void rule__TypedMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3034:1: ( rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3035:2: rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__16235);
            rule__TypedMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__16238);
            rule__TypedMember__Group__2();

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
    // $ANTLR end "rule__TypedMember__Group__1"


    // $ANTLR start "rule__TypedMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3042:1: rule__TypedMember__Group__1__Impl : ( ':' ) ;
    public final void rule__TypedMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3046:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3047:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3047:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3048:1: ':'
            {
             before(grammarAccess.getTypedMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__TypedMember__Group__1__Impl6266); 
             after(grammarAccess.getTypedMemberAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__TypedMember__Group__1__Impl"


    // $ANTLR start "rule__TypedMember__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3061:1: rule__TypedMember__Group__2 : rule__TypedMember__Group__2__Impl ;
    public final void rule__TypedMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3065:1: ( rule__TypedMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3066:2: rule__TypedMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__26297);
            rule__TypedMember__Group__2__Impl();

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
    // $ANTLR end "rule__TypedMember__Group__2"


    // $ANTLR start "rule__TypedMember__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3072:1: rule__TypedMember__Group__2__Impl : ( ( rule__TypedMember__TypeAssignment_2 ) ) ;
    public final void rule__TypedMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3076:1: ( ( ( rule__TypedMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3077:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3077:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3078:1: ( rule__TypedMember__TypeAssignment_2 )
            {
             before(grammarAccess.getTypedMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3079:1: ( rule__TypedMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3079:2: rule__TypedMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl6324);
            rule__TypedMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypedMemberAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__TypedMember__Group__2__Impl"


    // $ANTLR start "rule__SkipMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3095:1: rule__SkipMember__Group__0 : rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 ;
    public final void rule__SkipMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3099:1: ( rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3100:2: rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__06360);
            rule__SkipMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__06363);
            rule__SkipMember__Group__1();

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
    // $ANTLR end "rule__SkipMember__Group__0"


    // $ANTLR start "rule__SkipMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3107:1: rule__SkipMember__Group__0__Impl : ( ( rule__SkipMember__NameAssignment_0 ) ) ;
    public final void rule__SkipMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3111:1: ( ( ( rule__SkipMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3112:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3112:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3113:1: ( rule__SkipMember__NameAssignment_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3114:1: ( rule__SkipMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3114:2: rule__SkipMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl6390);
            rule__SkipMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSkipMemberAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SkipMember__Group__0__Impl"


    // $ANTLR start "rule__SkipMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3124:1: rule__SkipMember__Group__1 : rule__SkipMember__Group__1__Impl ;
    public final void rule__SkipMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3128:1: ( rule__SkipMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3129:2: rule__SkipMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__16420);
            rule__SkipMember__Group__1__Impl();

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
    // $ANTLR end "rule__SkipMember__Group__1"


    // $ANTLR start "rule__SkipMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3135:1: rule__SkipMember__Group__1__Impl : ( ( rule__SkipMember__LiteralAssignment_1 ) ) ;
    public final void rule__SkipMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3139:1: ( ( ( rule__SkipMember__LiteralAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3140:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3140:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3141:1: ( rule__SkipMember__LiteralAssignment_1 )
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3142:1: ( rule__SkipMember__LiteralAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3142:2: rule__SkipMember__LiteralAssignment_1
            {
            pushFollow(FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl6447);
            rule__SkipMember__LiteralAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkipMemberAccess().getLiteralAssignment_1()); 

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
    // $ANTLR end "rule__SkipMember__Group__1__Impl"


    // $ANTLR start "rule__SimpleMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3156:1: rule__SimpleMember__Group__0 : rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 ;
    public final void rule__SimpleMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3160:1: ( rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3161:2: rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__06481);
            rule__SimpleMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__06484);
            rule__SimpleMember__Group__1();

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
    // $ANTLR end "rule__SimpleMember__Group__0"


    // $ANTLR start "rule__SimpleMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3168:1: rule__SimpleMember__Group__0__Impl : ( ( rule__SimpleMember__NameAssignment_0 ) ) ;
    public final void rule__SimpleMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3172:1: ( ( ( rule__SimpleMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3173:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3173:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3174:1: ( rule__SimpleMember__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3175:1: ( rule__SimpleMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3175:2: rule__SimpleMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl6511);
            rule__SimpleMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SimpleMember__Group__0__Impl"


    // $ANTLR start "rule__SimpleMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3185:1: rule__SimpleMember__Group__1 : rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 ;
    public final void rule__SimpleMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3189:1: ( rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3190:2: rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__16541);
            rule__SimpleMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__16544);
            rule__SimpleMember__Group__2();

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
    // $ANTLR end "rule__SimpleMember__Group__1"


    // $ANTLR start "rule__SimpleMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3197:1: rule__SimpleMember__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3201:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3202:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3202:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3203:1: ':'
            {
             before(grammarAccess.getSimpleMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__SimpleMember__Group__1__Impl6572); 
             after(grammarAccess.getSimpleMemberAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__SimpleMember__Group__1__Impl"


    // $ANTLR start "rule__SimpleMember__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3216:1: rule__SimpleMember__Group__2 : rule__SimpleMember__Group__2__Impl ;
    public final void rule__SimpleMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3220:1: ( rule__SimpleMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3221:2: rule__SimpleMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__26603);
            rule__SimpleMember__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleMember__Group__2"


    // $ANTLR start "rule__SimpleMember__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3227:1: rule__SimpleMember__Group__2__Impl : ( ( rule__SimpleMember__TypeAssignment_2 ) ) ;
    public final void rule__SimpleMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3231:1: ( ( ( rule__SimpleMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3232:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3232:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3233:1: ( rule__SimpleMember__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3234:1: ( rule__SimpleMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3234:2: rule__SimpleMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl6630);
            rule__SimpleMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__SimpleMember__Group__2__Impl"


    // $ANTLR start "rule__GenericListType__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3250:1: rule__GenericListType__Group__0 : rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 ;
    public final void rule__GenericListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3254:1: ( rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3255:2: rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__06666);
            rule__GenericListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__06669);
            rule__GenericListType__Group__1();

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
    // $ANTLR end "rule__GenericListType__Group__0"


    // $ANTLR start "rule__GenericListType__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3262:1: rule__GenericListType__Group__0__Impl : ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) ;
    public final void rule__GenericListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3266:1: ( ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3267:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3267:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3268:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3269:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3269:2: rule__GenericListType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl6696);
            rule__GenericListType__ElementTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGenericListTypeAccess().getElementTypeAssignment_0()); 

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
    // $ANTLR end "rule__GenericListType__Group__0__Impl"


    // $ANTLR start "rule__GenericListType__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3279:1: rule__GenericListType__Group__1 : rule__GenericListType__Group__1__Impl ;
    public final void rule__GenericListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3283:1: ( rule__GenericListType__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3284:2: rule__GenericListType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__16726);
            rule__GenericListType__Group__1__Impl();

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
    // $ANTLR end "rule__GenericListType__Group__1"


    // $ANTLR start "rule__GenericListType__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3290:1: rule__GenericListType__Group__1__Impl : ( ( rule__GenericListType__IdAssignment_1 ) ) ;
    public final void rule__GenericListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3294:1: ( ( ( rule__GenericListType__IdAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3295:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3295:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3296:1: ( rule__GenericListType__IdAssignment_1 )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3297:1: ( rule__GenericListType__IdAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3297:2: rule__GenericListType__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl6753);
            rule__GenericListType__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGenericListTypeAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__GenericListType__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3311:1: rule__ComplexTypeDeclaration__Group__0 : rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 ;
    public final void rule__ComplexTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3315:1: ( rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3316:2: rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__06787);
            rule__ComplexTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__06790);
            rule__ComplexTypeDeclaration__Group__1();

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__0"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3323:1: rule__ComplexTypeDeclaration__Group__0__Impl : ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3327:1: ( ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3328:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3328:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3329:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3330:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3330:2: rule__ComplexTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl6817);
            rule__ComplexTypeDeclaration__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3340:1: rule__ComplexTypeDeclaration__Group__1 : rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 ;
    public final void rule__ComplexTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3344:1: ( rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3345:2: rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__16847);
            rule__ComplexTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__16850);
            rule__ComplexTypeDeclaration__Group__2();

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__1"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3352:1: rule__ComplexTypeDeclaration__Group__1__Impl : ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3356:1: ( ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3357:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3357:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3358:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3359:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3359:2: rule__ComplexTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl6877);
                    rule__ComplexTypeDeclaration__GenAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getGenAssignment_1()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3369:1: rule__ComplexTypeDeclaration__Group__2 : rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 ;
    public final void rule__ComplexTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3373:1: ( rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3374:2: rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__26908);
            rule__ComplexTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__26911);
            rule__ComplexTypeDeclaration__Group__3();

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__2"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3381:1: rule__ComplexTypeDeclaration__Group__2__Impl : ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3385:1: ( ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3386:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3386:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3387:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3388:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3388:2: rule__ComplexTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl6938);
            rule__ComplexTypeDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3398:1: rule__ComplexTypeDeclaration__Group__3 : rule__ComplexTypeDeclaration__Group__3__Impl ;
    public final void rule__ComplexTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3402:1: ( rule__ComplexTypeDeclaration__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3403:2: rule__ComplexTypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__36968);
            rule__ComplexTypeDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__3"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3409:1: rule__ComplexTypeDeclaration__Group__3__Impl : ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3413:1: ( ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3414:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3414:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3415:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3416:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3416:2: rule__ComplexTypeDeclaration__LiteralAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl6995);
                    rule__ComplexTypeDeclaration__LiteralAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3434:1: rule__EnumTypeDeclaration__Group__0 : rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 ;
    public final void rule__EnumTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3438:1: ( rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3439:2: rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07034);
            rule__EnumTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07037);
            rule__EnumTypeDeclaration__Group__1();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__0"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3446:1: rule__EnumTypeDeclaration__Group__0__Impl : ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3450:1: ( ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3451:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3451:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3452:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3453:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3453:2: rule__EnumTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7064);
            rule__EnumTypeDeclaration__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3463:1: rule__EnumTypeDeclaration__Group__1 : rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 ;
    public final void rule__EnumTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3467:1: ( rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3468:2: rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17094);
            rule__EnumTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17097);
            rule__EnumTypeDeclaration__Group__2();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__1"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3475:1: rule__EnumTypeDeclaration__Group__1__Impl : ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3479:1: ( ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3480:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3480:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3481:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3482:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3482:2: rule__EnumTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7124);
                    rule__EnumTypeDeclaration__GenAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getGenAssignment_1()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3492:1: rule__EnumTypeDeclaration__Group__2 : rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 ;
    public final void rule__EnumTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3496:1: ( rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3497:2: rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27155);
            rule__EnumTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27158);
            rule__EnumTypeDeclaration__Group__3();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__2"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3504:1: rule__EnumTypeDeclaration__Group__2__Impl : ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3508:1: ( ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3509:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3509:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3510:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3511:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3511:2: rule__EnumTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7185);
            rule__EnumTypeDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3521:1: rule__EnumTypeDeclaration__Group__3 : rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 ;
    public final void rule__EnumTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3525:1: ( rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3526:2: rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37215);
            rule__EnumTypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37218);
            rule__EnumTypeDeclaration__Group__4();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__3"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3533:1: rule__EnumTypeDeclaration__Group__3__Impl : ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3537:1: ( ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3538:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3538:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3539:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3540:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3540:2: rule__EnumTypeDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7245);
                    rule__EnumTypeDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3550:1: rule__EnumTypeDeclaration__Group__4 : rule__EnumTypeDeclaration__Group__4__Impl ;
    public final void rule__EnumTypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3554:1: ( rule__EnumTypeDeclaration__Group__4__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3555:2: rule__EnumTypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47276);
            rule__EnumTypeDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__4"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__4__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3561:1: rule__EnumTypeDeclaration__Group__4__Impl : ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3565:1: ( ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3566:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3566:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3567:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3568:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3568:2: rule__EnumTypeDeclaration__LiteralAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7303);
                    rule__EnumTypeDeclaration__LiteralAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3588:1: rule__EnumTypeDeclaration__Group_3__0 : rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 ;
    public final void rule__EnumTypeDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3592:1: ( rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3593:2: rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07344);
            rule__EnumTypeDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07347);
            rule__EnumTypeDeclaration__Group_3__1();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__0"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3600:1: rule__EnumTypeDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EnumTypeDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3604:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3605:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3605:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3606:1: 'extends'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumTypeDeclaration__Group_3__0__Impl7375); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3619:1: rule__EnumTypeDeclaration__Group_3__1 : rule__EnumTypeDeclaration__Group_3__1__Impl ;
    public final void rule__EnumTypeDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3623:1: ( rule__EnumTypeDeclaration__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3624:2: rule__EnumTypeDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17406);
            rule__EnumTypeDeclaration__Group_3__1__Impl();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__1"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3630:1: rule__EnumTypeDeclaration__Group_3__1__Impl : ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3634:1: ( ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3635:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3635:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3636:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3637:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3637:2: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7433);
            rule__EnumTypeDeclaration__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3651:1: rule__EnumTypeLiteral__Group__0 : rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 ;
    public final void rule__EnumTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3655:1: ( rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3656:2: rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07467);
            rule__EnumTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07470);
            rule__EnumTypeLiteral__Group__1();

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__0"


    // $ANTLR start "rule__EnumTypeLiteral__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3663:1: rule__EnumTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3667:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3668:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3668:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3669:1: '{'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__EnumTypeLiteral__Group__0__Impl7498); 
             after(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3682:1: rule__EnumTypeLiteral__Group__1 : rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 ;
    public final void rule__EnumTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3686:1: ( rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3687:2: rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__17529);
            rule__EnumTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__17532);
            rule__EnumTypeLiteral__Group__2();

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__1"


    // $ANTLR start "rule__EnumTypeLiteral__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3694:1: rule__EnumTypeLiteral__Group__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3698:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3699:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3699:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3700:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3701:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3701:2: rule__EnumTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl7559);
            rule__EnumTypeLiteral__MembersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3711:1: rule__EnumTypeLiteral__Group__2 : rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 ;
    public final void rule__EnumTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3715:1: ( rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3716:2: rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__27589);
            rule__EnumTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__27592);
            rule__EnumTypeLiteral__Group__3();

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__2"


    // $ANTLR start "rule__EnumTypeLiteral__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3723:1: rule__EnumTypeLiteral__Group__2__Impl : ( ( rule__EnumTypeLiteral__Group_2__0 )* ) ;
    public final void rule__EnumTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3727:1: ( ( ( rule__EnumTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3728:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3728:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3729:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3730:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==23) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3730:2: rule__EnumTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl7619);
            	    rule__EnumTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__2__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3740:1: rule__EnumTypeLiteral__Group__3 : rule__EnumTypeLiteral__Group__3__Impl ;
    public final void rule__EnumTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3744:1: ( rule__EnumTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3745:2: rule__EnumTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__37650);
            rule__EnumTypeLiteral__Group__3__Impl();

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__3"


    // $ANTLR start "rule__EnumTypeLiteral__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3751:1: rule__EnumTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3755:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3756:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3756:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3757:1: '}'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__EnumTypeLiteral__Group__3__Impl7678); 
             after(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3778:1: rule__EnumTypeLiteral__Group_2__0 : rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 ;
    public final void rule__EnumTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3782:1: ( rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3783:2: rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__07717);
            rule__EnumTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__07720);
            rule__EnumTypeLiteral__Group_2__1();

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
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__0"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3790:1: rule__EnumTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3794:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3795:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3795:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3796:1: ','
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumTypeLiteral__Group_2__0__Impl7748); 
             after(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3809:1: rule__EnumTypeLiteral__Group_2__1 : rule__EnumTypeLiteral__Group_2__1__Impl ;
    public final void rule__EnumTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3813:1: ( rule__EnumTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3814:2: rule__EnumTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__17779);
            rule__EnumTypeLiteral__Group_2__1__Impl();

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
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__1"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3820:1: rule__EnumTypeLiteral__Group_2__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3824:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3825:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3825:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3826:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3827:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3827:2: rule__EnumTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl7806);
            rule__EnumTypeLiteral__MembersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__EnumMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3841:1: rule__EnumMember__Group__0 : rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3845:1: ( rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3846:2: rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__07840);
            rule__EnumMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__07843);
            rule__EnumMember__Group__1();

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
    // $ANTLR end "rule__EnumMember__Group__0"


    // $ANTLR start "rule__EnumMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3853:1: rule__EnumMember__Group__0__Impl : ( ( rule__EnumMember__NameAssignment_0 ) ) ;
    public final void rule__EnumMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3857:1: ( ( ( rule__EnumMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3858:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3858:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3859:1: ( rule__EnumMember__NameAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3860:1: ( rule__EnumMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3860:2: rule__EnumMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl7870);
            rule__EnumMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__EnumMember__Group__0__Impl"


    // $ANTLR start "rule__EnumMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3870:1: rule__EnumMember__Group__1 : rule__EnumMember__Group__1__Impl ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3874:1: ( rule__EnumMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3875:2: rule__EnumMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__17900);
            rule__EnumMember__Group__1__Impl();

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
    // $ANTLR end "rule__EnumMember__Group__1"


    // $ANTLR start "rule__EnumMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3881:1: rule__EnumMember__Group__1__Impl : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3885:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3886:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3886:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3887:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3888:1: ( rule__EnumMember__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3888:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl7927);
                    rule__EnumMember__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumMemberAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EnumMember__Group__1__Impl"


    // $ANTLR start "rule__EnumMember__Group_1__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3902:1: rule__EnumMember__Group_1__0 : rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3906:1: ( rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3907:2: rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07962);
            rule__EnumMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07965);
            rule__EnumMember__Group_1__1();

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
    // $ANTLR end "rule__EnumMember__Group_1__0"


    // $ANTLR start "rule__EnumMember__Group_1__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3914:1: rule__EnumMember__Group_1__0__Impl : ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) ;
    public final void rule__EnumMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3918:1: ( ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3919:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3919:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3920:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3921:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3921:2: rule__EnumMember__AssignmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7992);
            rule__EnumMember__AssignmentAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 

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
    // $ANTLR end "rule__EnumMember__Group_1__0__Impl"


    // $ANTLR start "rule__EnumMember__Group_1__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3931:1: rule__EnumMember__Group_1__1 : rule__EnumMember__Group_1__1__Impl ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3935:1: ( rule__EnumMember__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3936:2: rule__EnumMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18022);
            rule__EnumMember__Group_1__1__Impl();

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
    // $ANTLR end "rule__EnumMember__Group_1__1"


    // $ANTLR start "rule__EnumMember__Group_1__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3942:1: rule__EnumMember__Group_1__1__Impl : ( ( rule__EnumMember__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3946:1: ( ( ( rule__EnumMember__ValueAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3947:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3947:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3948:1: ( rule__EnumMember__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3949:1: ( rule__EnumMember__ValueAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3949:2: rule__EnumMember__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8049);
            rule__EnumMember__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__EnumMember__Group_1__1__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3963:1: rule__ComplexTypeLiteral__Group__0 : rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 ;
    public final void rule__ComplexTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3967:1: ( rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3968:2: rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08083);
            rule__ComplexTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08086);
            rule__ComplexTypeLiteral__Group__1();

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__0"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3975:1: rule__ComplexTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3979:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3980:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3980:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3981:1: '{'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ComplexTypeLiteral__Group__0__Impl8114); 
             after(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__0__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3994:1: rule__ComplexTypeLiteral__Group__1 : rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 ;
    public final void rule__ComplexTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3998:1: ( rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3999:2: rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18145);
            rule__ComplexTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18148);
            rule__ComplexTypeLiteral__Group__2();

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__1"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4006:1: rule__ComplexTypeLiteral__Group__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4010:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4011:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4011:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4012:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4013:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4013:2: rule__ComplexTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8175);
            rule__ComplexTypeLiteral__MembersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4023:1: rule__ComplexTypeLiteral__Group__2 : rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 ;
    public final void rule__ComplexTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4027:1: ( rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4028:2: rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28205);
            rule__ComplexTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28208);
            rule__ComplexTypeLiteral__Group__3();

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__2"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4035:1: rule__ComplexTypeLiteral__Group__2__Impl : ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) ;
    public final void rule__ComplexTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4039:1: ( ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4040:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4040:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4041:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4042:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==23) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4042:2: rule__ComplexTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8235);
            	    rule__ComplexTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__2__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4052:1: rule__ComplexTypeLiteral__Group__3 : rule__ComplexTypeLiteral__Group__3__Impl ;
    public final void rule__ComplexTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4056:1: ( rule__ComplexTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4057:2: rule__ComplexTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38266);
            rule__ComplexTypeLiteral__Group__3__Impl();

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__3"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4063:1: rule__ComplexTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ComplexTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4067:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4068:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4068:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4069:1: '}'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ComplexTypeLiteral__Group__3__Impl8294); 
             after(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group__3__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4090:1: rule__ComplexTypeLiteral__Group_2__0 : rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 ;
    public final void rule__ComplexTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4094:1: ( rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4095:2: rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08333);
            rule__ComplexTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08336);
            rule__ComplexTypeLiteral__Group_2__1();

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__0"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4102:1: rule__ComplexTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4106:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4107:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4107:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4108:1: ','
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ComplexTypeLiteral__Group_2__0__Impl8364); 
             after(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4121:1: rule__ComplexTypeLiteral__Group_2__1 : rule__ComplexTypeLiteral__Group_2__1__Impl ;
    public final void rule__ComplexTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4125:1: ( rule__ComplexTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4126:2: rule__ComplexTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18395);
            rule__ComplexTypeLiteral__Group_2__1__Impl();

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__1"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4132:1: rule__ComplexTypeLiteral__Group_2__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4136:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4137:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4137:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4138:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4139:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4139:2: rule__ComplexTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8422);
            rule__ComplexTypeLiteral__MembersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4153:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4157:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4158:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08456);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08459);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4165:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4169:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4170:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4170:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4171:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8486); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4182:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4186:1: ( rule__FQN__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4187:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18515);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4193:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4197:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4198:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4198:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4199:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4200:1: ( rule__FQN__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4200:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8542);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4214:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4218:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4219:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08577);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08580);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4226:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4230:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4231:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4231:1: ( '.' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4232:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__FQN__Group_1__0__Impl8608); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4245:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4249:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4250:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18639);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4256:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4260:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4261:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4261:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4262:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8666); 
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


    // $ANTLR start "rule__SignedNumber__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4277:1: rule__SignedNumber__Group__0 : rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 ;
    public final void rule__SignedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4281:1: ( rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4282:2: rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__08699);
            rule__SignedNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__08702);
            rule__SignedNumber__Group__1();

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
    // $ANTLR end "rule__SignedNumber__Group__0"


    // $ANTLR start "rule__SignedNumber__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4289:1: rule__SignedNumber__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4293:1: ( ( ( '-' )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4294:1: ( ( '-' )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4294:1: ( ( '-' )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4295:1: ( '-' )?
            {
             before(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4296:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4297:2: '-'
                    {
                    match(input,31,FOLLOW_31_in_rule__SignedNumber__Group__0__Impl8731); 

                    }
                    break;

            }

             after(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4308:1: rule__SignedNumber__Group__1 : rule__SignedNumber__Group__1__Impl ;
    public final void rule__SignedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4312:1: ( rule__SignedNumber__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4313:2: rule__SignedNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__18764);
            rule__SignedNumber__Group__1__Impl();

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
    // $ANTLR end "rule__SignedNumber__Group__1"


    // $ANTLR start "rule__SignedNumber__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4319:1: rule__SignedNumber__Group__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__SignedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4323:1: ( ( RULE_NUMBER ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4324:1: ( RULE_NUMBER )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4324:1: ( RULE_NUMBER )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4325:1: RULE_NUMBER
            {
             before(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl8791); 
             after(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Model__PackageNameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4341:1: rule__Model__PackageNameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4345:1: ( ( ruleFQN ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4346:1: ( ruleFQN )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4346:1: ( ruleFQN )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4347:1: ruleFQN
            {
             before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_18829);
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


    // $ANTLR start "rule__Model__DeclarationsAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4356:1: rule__Model__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4360:1: ( ( ruleDeclaration ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4361:1: ( ruleDeclaration )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4361:1: ( ruleDeclaration )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4362:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_28860);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__DeclarationsAssignment_2"


    // $ANTLR start "rule__Client__NameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4371:1: rule__Client__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Client__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4375:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4376:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4376:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4377:1: RULE_ID
            {
             before(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Client__NameAssignment_18891); 
             after(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Client__NameAssignment_1"


    // $ANTLR start "rule__Client__BaseUrlAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4386:1: rule__Client__BaseUrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Client__BaseUrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4390:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4391:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4391:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4392:1: RULE_STRING
            {
             before(grammarAccess.getClientAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_28922); 
             after(grammarAccess.getClientAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Client__BaseUrlAssignment_2"


    // $ANTLR start "rule__Client__BlocksAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4401:1: rule__Client__BlocksAssignment_4 : ( ruleClientBlock ) ;
    public final void rule__Client__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4405:1: ( ( ruleClientBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4406:1: ( ruleClientBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4406:1: ( ruleClientBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4407:1: ruleClientBlock
            {
             before(grammarAccess.getClientAccess().getBlocksClientBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleClientBlock_in_rule__Client__BlocksAssignment_48953);
            ruleClientBlock();

            state._fsp--;

             after(grammarAccess.getClientAccess().getBlocksClientBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Client__BlocksAssignment_4"


    // $ANTLR start "rule__HeaderBlock__HeadersAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4416:1: rule__HeaderBlock__HeadersAssignment_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4420:1: ( ( ruleHeader ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4421:1: ( ruleHeader )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4421:1: ( ruleHeader )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4422:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_18984);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HeaderBlock__HeadersAssignment_1"


    // $ANTLR start "rule__HeaderBlock__HeadersAssignment_2_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4431:1: rule__HeaderBlock__HeadersAssignment_2_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4435:1: ( ( ruleHeader ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4436:1: ( ruleHeader )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4436:1: ( ruleHeader )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4437:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_19015);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__HeaderBlock__HeadersAssignment_2_1"


    // $ANTLR start "rule__Header__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4446:1: rule__Header__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4450:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4451:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4451:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4452:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_09046); 
             after(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Header__NameAssignment_0"


    // $ANTLR start "rule__Header__ValueAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4461:1: rule__Header__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4465:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4466:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4466:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4467:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_29077); 
             after(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Header__ValueAssignment_2"


    // $ANTLR start "rule__HttpMethod__TypeAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4476:1: rule__HttpMethod__TypeAssignment_0 : ( ruleHttpMethodType ) ;
    public final void rule__HttpMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4480:1: ( ( ruleHttpMethodType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4481:1: ( ruleHttpMethodType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4481:1: ( ruleHttpMethodType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4482:1: ruleHttpMethodType
            {
             before(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_09108);
            ruleHttpMethodType();

            state._fsp--;

             after(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__HttpMethod__TypeAssignment_0"


    // $ANTLR start "rule__HttpMethod__NameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4491:1: rule__HttpMethod__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4495:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4496:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4496:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4497:1: RULE_ID
            {
             before(grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_19139); 
             after(grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__HttpMethod__NameAssignment_1"


    // $ANTLR start "rule__HttpMethod__PathAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4506:1: rule__HttpMethod__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpMethod__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4510:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4511:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4511:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4512:1: RULE_STRING
            {
             before(grammarAccess.getHttpMethodAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpMethod__PathAssignment_29170); 
             after(grammarAccess.getHttpMethodAccess().getPathSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__HttpMethod__PathAssignment_2"


    // $ANTLR start "rule__HttpMethod__BlocksAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4521:1: rule__HttpMethod__BlocksAssignment_4 : ( ruleHttpMethodBlock ) ;
    public final void rule__HttpMethod__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4525:1: ( ( ruleHttpMethodBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4526:1: ( ruleHttpMethodBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4526:1: ( ruleHttpMethodBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4527:1: ruleHttpMethodBlock
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_49201);
            ruleHttpMethodBlock();

            state._fsp--;

             after(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__HttpMethod__BlocksAssignment_4"


    // $ANTLR start "rule__ParamsBlock__ParamsAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4536:1: rule__ParamsBlock__ParamsAssignment_2 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__ParamsBlock__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4540:1: ( ( ruleSimpleMemberAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4541:1: ( ruleSimpleMemberAssignment )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4541:1: ( ruleSimpleMemberAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4542:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_29232);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ParamsBlock__ParamsAssignment_2"


    // $ANTLR start "rule__ParamsBlock__ParamsAssignment_3_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4551:1: rule__ParamsBlock__ParamsAssignment_3_1 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__ParamsBlock__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4555:1: ( ( ruleSimpleMemberAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4556:1: ( ruleSimpleMemberAssignment )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4556:1: ( ruleSimpleMemberAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4557:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_3_19263);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ParamsBlock__ParamsAssignment_3_1"


    // $ANTLR start "rule__SimpleMemberAssignment__MemberAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4566:1: rule__SimpleMemberAssignment__MemberAssignment_0 : ( ruleSimpleMember ) ;
    public final void rule__SimpleMemberAssignment__MemberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4570:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4571:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4571:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4572:1: ruleSimpleMember
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getMemberSimpleMemberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__SimpleMemberAssignment__MemberAssignment_09294);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAssignmentAccess().getMemberSimpleMemberParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__MemberAssignment_0"


    // $ANTLR start "rule__SimpleMemberAssignment__DefaultValueAssignment_1_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4581:1: rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__SimpleMemberAssignment__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4585:1: ( ( ruleLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4586:1: ( ruleLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4586:1: ( ruleLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4587:1: ruleLiteral
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__SimpleMemberAssignment__DefaultValueAssignment_1_19325);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueLiteralParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__DefaultValueAssignment_1_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_0_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4596:1: rule__Literal__LiteralAssignment_0_1 : ( ruleBooleanValue ) ;
    public final void rule__Literal__LiteralAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4600:1: ( ( ruleBooleanValue ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4601:1: ( ruleBooleanValue )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4601:1: ( ruleBooleanValue )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4602:1: ruleBooleanValue
            {
             before(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_19356);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4611:1: rule__Literal__LiteralAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Literal__LiteralAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4615:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4616:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4616:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4617:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_19387); 
             after(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4626:1: rule__Literal__LiteralAssignment_2_1 : ( ruleSignedNumber ) ;
    public final void rule__Literal__LiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4630:1: ( ( ruleSignedNumber ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4631:1: ( ruleSignedNumber )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4631:1: ( ruleSignedNumber )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4632:1: ruleSignedNumber
            {
             before(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_19418);
            ruleSignedNumber();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 

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


    // $ANTLR start "rule__BodyBlock__TypeAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4641:1: rule__BodyBlock__TypeAssignment_1 : ( ruleBlockType ) ;
    public final void rule__BodyBlock__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4645:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4646:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4646:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4647:1: ruleBlockType
            {
             before(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_19449);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BodyBlock__TypeAssignment_1"


    // $ANTLR start "rule__ResponseBlock__SuperTypeAssignment_2_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4656:1: rule__ResponseBlock__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResponseBlock__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4660:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4661:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4661:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4662:1: ( RULE_ID )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4663:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4664:1: RULE_ID
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_19484); 
             after(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__ResponseBlock__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__ResponseBlock__TypeAssignment_3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4675:1: rule__ResponseBlock__TypeAssignment_3 : ( ruleBlockType ) ;
    public final void rule__ResponseBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4679:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4680:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4680:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4681:1: ruleBlockType
            {
             before(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_39519);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ResponseBlock__TypeAssignment_3"


    // $ANTLR start "rule__TypedMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4690:1: rule__TypedMember__NameAssignment_0 : ( ( rule__TypedMember__NameAlternatives_0_0 ) ) ;
    public final void rule__TypedMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4694:1: ( ( ( rule__TypedMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4695:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4695:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4696:1: ( rule__TypedMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4697:1: ( rule__TypedMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4697:2: rule__TypedMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_09550);
            rule__TypedMember__NameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedMemberAccess().getNameAlternatives_0_0()); 

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
    // $ANTLR end "rule__TypedMember__NameAssignment_0"


    // $ANTLR start "rule__TypedMember__TypeAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4706:1: rule__TypedMember__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__TypedMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4710:1: ( ( ruleType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4711:1: ( ruleType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4711:1: ( ruleType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4712:1: ruleType
            {
             before(grammarAccess.getTypedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_29583);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypedMemberAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TypedMember__TypeAssignment_2"


    // $ANTLR start "rule__SkipMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4721:1: rule__SkipMember__NameAssignment_0 : ( ( rule__SkipMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SkipMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4725:1: ( ( ( rule__SkipMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4726:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4726:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4727:1: ( rule__SkipMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4728:1: ( rule__SkipMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4728:2: rule__SkipMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_09614);
            rule__SkipMember__NameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSkipMemberAccess().getNameAlternatives_0_0()); 

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
    // $ANTLR end "rule__SkipMember__NameAssignment_0"


    // $ANTLR start "rule__SkipMember__LiteralAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4737:1: rule__SkipMember__LiteralAssignment_1 : ( ruleComplexTypeLiteral ) ;
    public final void rule__SkipMember__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4741:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4742:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4742:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4743:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_19647);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SkipMember__LiteralAssignment_1"


    // $ANTLR start "rule__SimpleMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4752:1: rule__SimpleMember__NameAssignment_0 : ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SimpleMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4756:1: ( ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4757:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4757:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4758:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4759:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4759:2: rule__SimpleMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_09678);
            rule__SimpleMember__NameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0()); 

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
    // $ANTLR end "rule__SimpleMember__NameAssignment_0"


    // $ANTLR start "rule__SimpleMember__TypeAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4768:1: rule__SimpleMember__TypeAssignment_2 : ( ruleIntrinsicType ) ;
    public final void rule__SimpleMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4772:1: ( ( ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4773:1: ( ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4773:1: ( ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4774:1: ruleIntrinsicType
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_29711);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleMember__TypeAssignment_2"


    // $ANTLR start "rule__GenericListType__ElementTypeAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4783:1: rule__GenericListType__ElementTypeAssignment_0 : ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) ;
    public final void rule__GenericListType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4787:1: ( ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4788:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4788:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4789:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4790:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4790:2: rule__GenericListType__ElementTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_09742);
            rule__GenericListType__ElementTypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGenericListTypeAccess().getElementTypeAlternatives_0_0()); 

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
    // $ANTLR end "rule__GenericListType__ElementTypeAssignment_0"


    // $ANTLR start "rule__GenericListType__IdAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4799:1: rule__GenericListType__IdAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__GenericListType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4803:1: ( ( ( '[]' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4804:1: ( ( '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4804:1: ( ( '[]' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4805:1: ( '[]' )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4806:1: ( '[]' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4807:1: '[]'
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__GenericListType__IdAssignment_19780); 
             after(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__GenericListType__IdAssignment_1"


    // $ANTLR start "rule__UserType__DeclarationAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4822:1: rule__UserType__DeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UserType__DeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4826:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4827:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4827:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4828:1: ( RULE_ID )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4829:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4830:1: RULE_ID
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment9823); 
             after(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 

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
    // $ANTLR end "rule__UserType__DeclarationAssignment"


    // $ANTLR start "rule__ComplexTypeDeclaration__KeywordAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4841:1: rule__ComplexTypeDeclaration__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__ComplexTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4845:1: ( ( ( 'entity' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4846:1: ( ( 'entity' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4846:1: ( ( 'entity' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4847:1: ( 'entity' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4848:1: ( 'entity' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4849:1: 'entity'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__ComplexTypeDeclaration__KeywordAssignment_09863); 
             after(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__KeywordAssignment_0"


    // $ANTLR start "rule__ComplexTypeDeclaration__GenAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4864:1: rule__ComplexTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__ComplexTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4868:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4869:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4869:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4870:1: ( 'generate' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4871:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4872:1: 'generate'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__ComplexTypeDeclaration__GenAssignment_19907); 
             after(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__GenAssignment_1"


    // $ANTLR start "rule__ComplexTypeDeclaration__NameAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4887:1: rule__ComplexTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4891:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4892:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4892:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4893:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_29946); 
             after(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ComplexTypeDeclaration__LiteralAssignment_3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4902:1: rule__ComplexTypeDeclaration__LiteralAssignment_3 : ( ruleComplexTypeLiteral ) ;
    public final void rule__ComplexTypeDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4906:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4907:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4907:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4908:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_39977);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__LiteralAssignment_3"


    // $ANTLR start "rule__EnumTypeDeclaration__KeywordAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4917:1: rule__EnumTypeDeclaration__KeywordAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__EnumTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4921:1: ( ( ( 'enum' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4922:1: ( ( 'enum' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4922:1: ( ( 'enum' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4923:1: ( 'enum' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4924:1: ( 'enum' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4925:1: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__EnumTypeDeclaration__KeywordAssignment_010013); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__KeywordAssignment_0"


    // $ANTLR start "rule__EnumTypeDeclaration__GenAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4940:1: rule__EnumTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__EnumTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4944:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4945:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4945:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4946:1: ( 'generate' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4947:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4948:1: 'generate'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__EnumTypeDeclaration__GenAssignment_110057); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__GenAssignment_1"


    // $ANTLR start "rule__EnumTypeDeclaration__NameAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4963:1: rule__EnumTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4967:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4968:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4968:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4969:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210096); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__NameAssignment_2"


    // $ANTLR start "rule__EnumTypeDeclaration__SuperTypeAssignment_3_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4978:1: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 : ( ruleIntegerType ) ;
    public final void rule__EnumTypeDeclaration__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4982:1: ( ( ruleIntegerType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4983:1: ( ruleIntegerType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4983:1: ( ruleIntegerType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4984:1: ruleIntegerType
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110127);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__EnumTypeDeclaration__LiteralAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4993:1: rule__EnumTypeDeclaration__LiteralAssignment_4 : ( ruleEnumTypeLiteral ) ;
    public final void rule__EnumTypeDeclaration__LiteralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4997:1: ( ( ruleEnumTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4998:1: ( ruleEnumTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4998:1: ( ruleEnumTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4999:1: ruleEnumTypeLiteral
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410158);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__LiteralAssignment_4"


    // $ANTLR start "rule__EnumTypeLiteral__MembersAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5008:1: rule__EnumTypeLiteral__MembersAssignment_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5012:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5013:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5013:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5014:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110189);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__MembersAssignment_1"


    // $ANTLR start "rule__EnumTypeLiteral__MembersAssignment_2_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5023:1: rule__EnumTypeLiteral__MembersAssignment_2_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5027:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5028:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5028:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5029:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110220);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__EnumTypeLiteral__MembersAssignment_2_1"


    // $ANTLR start "rule__EnumMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5038:1: rule__EnumMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5042:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5043:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5043:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5044:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010251); 
             after(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__EnumMember__NameAssignment_0"


    // $ANTLR start "rule__EnumMember__AssignmentAssignment_1_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5053:1: rule__EnumMember__AssignmentAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__EnumMember__AssignmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5057:1: ( ( ( '=' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5058:1: ( ( '=' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5058:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5059:1: ( '=' )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5060:1: ( '=' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5061:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            match(input,26,FOLLOW_26_in_rule__EnumMember__AssignmentAssignment_1_010287); 
             after(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 

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
    // $ANTLR end "rule__EnumMember__AssignmentAssignment_1_0"


    // $ANTLR start "rule__EnumMember__ValueAssignment_1_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5076:1: rule__EnumMember__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumMember__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5080:1: ( ( RULE_INT ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5081:1: ( RULE_INT )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5081:1: ( RULE_INT )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5082:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_110326); 
             after(grammarAccess.getEnumMemberAccess().getValueINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EnumMember__ValueAssignment_1_1"


    // $ANTLR start "rule__ComplexTypeLiteral__MembersAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5091:1: rule__ComplexTypeLiteral__MembersAssignment_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5095:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5096:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5096:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5097:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110357);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__MembersAssignment_1"


    // $ANTLR start "rule__ComplexTypeLiteral__MembersAssignment_2_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5106:1: rule__ComplexTypeLiteral__MembersAssignment_2_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5110:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5111:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5111:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5112:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110388);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ComplexTypeLiteral__MembersAssignment_2_1"


    // $ANTLR start "rule__StringType__IdAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5121:1: rule__StringType__IdAssignment : ( ( 'String' ) ) ;
    public final void rule__StringType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5125:1: ( ( ( 'String' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5126:1: ( ( 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5126:1: ( ( 'String' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5127:1: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5128:1: ( 'String' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5129:1: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__StringType__IdAssignment10424); 
             after(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 

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
    // $ANTLR end "rule__StringType__IdAssignment"


    // $ANTLR start "rule__BooleanType__IdAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5144:1: rule__BooleanType__IdAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5148:1: ( ( ( 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5149:1: ( ( 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5149:1: ( ( 'boolean' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5150:1: ( 'boolean' )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5151:1: ( 'boolean' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5152:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__BooleanType__IdAssignment10468); 
             after(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 

            }

             after(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 

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
    // $ANTLR end "rule__BooleanType__IdAssignment"


    // $ANTLR start "rule__IntegerType__IdAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5167:1: rule__IntegerType__IdAssignment : ( ( 'int' ) ) ;
    public final void rule__IntegerType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5171:1: ( ( ( 'int' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5172:1: ( ( 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5172:1: ( ( 'int' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5173:1: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5174:1: ( 'int' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5175:1: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__IntegerType__IdAssignment10512); 
             after(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 

            }

             after(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 

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
    // $ANTLR end "rule__IntegerType__IdAssignment"


    // $ANTLR start "rule__LongType__IdAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5190:1: rule__LongType__IdAssignment : ( ( 'long' ) ) ;
    public final void rule__LongType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5194:1: ( ( ( 'long' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5195:1: ( ( 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5195:1: ( ( 'long' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5196:1: ( 'long' )
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5197:1: ( 'long' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5198:1: 'long'
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__LongType__IdAssignment10556); 
             after(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 

            }

             after(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 

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
    // $ANTLR end "rule__LongType__IdAssignment"


    // $ANTLR start "rule__DoubleType__IdAssignment"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5213:1: rule__DoubleType__IdAssignment : ( ( 'double' ) ) ;
    public final void rule__DoubleType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5217:1: ( ( ( 'double' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5218:1: ( ( 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5218:1: ( ( 'double' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5219:1: ( 'double' )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5220:1: ( 'double' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5221:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__DoubleType__IdAssignment10600); 
             after(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 

            }

             after(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 

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
    // $ANTLR end "rule__DoubleType__IdAssignment"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\1\uffff\1\10\5\11\3\uffff";
    static final String DFA10_minS =
        "\1\4\6\25\3\uffff";
    static final String DFA10_maxS =
        "\1\50\6\40\3\uffff";
    static final String DFA10_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\37\uffff\1\2\1\3\1\4\1\5\1\6",
            "\3\10\1\uffff\1\10\1\uffff\2\10\3\uffff\1\7",
            "\3\11\1\uffff\1\11\1\uffff\2\11\3\uffff\1\7",
            "\3\11\1\uffff\1\11\1\uffff\2\11\3\uffff\1\7",
            "\3\11\1\uffff\1\11\1\uffff\2\11\3\uffff\1\7",
            "\3\11\1\uffff\1\11\1\uffff\2\11\3\uffff\1\7",
            "\3\11\1\uffff\1\11\1\uffff\2\11\3\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1328:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_entryRuleClient181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClient188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__0_in_ruleClient214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientBlock_in_entryRuleClientBlock241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClientBlock248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClientBlock__Alternatives_in_ruleClientBlock274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderBlock308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__0_in_ruleHeaderBlock334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0_in_ruleHeader394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethodBlock488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethodBlock__Alternatives_in_ruleHttpMethodBlock514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMemberAssignment608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__0_in_ruleSimpleMemberAssignment634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_entryRuleTypedMember961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedMember968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__0_in_ruleTypedMember994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_entryRuleSkipMember1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkipMember1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0_in_ruleSkipMember1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_entryRuleGenericListType1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListType1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0_in_ruleGenericListType1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__IdAssignment_in_ruleLongType2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_rule__Declaration__Alternatives2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__ClientBlock__Alternatives2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__ClientBlock__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__ClientBlock__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BlockType__Alternatives2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__Type__Alternatives2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__NumericType__Alternatives3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HttpMethodType__Alternatives3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpMethodType__Alternatives3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpMethodType__Alternatives3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__HttpMethodType__Alternatives3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanValue__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanValue__Alternatives3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__0__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13326 = new BitSet(new long[]{0x0000000A00080000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3413 = new BitSet(new long[]{0x0000000A00080002L});
    public static final BitSet FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Client__Group__0__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13512 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23572 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33633 = new BitSet(new long[]{0x000000000260F000L});
    public static final BitSet FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Client__Group__3__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43695 = new BitSet(new long[]{0x000000000260F000L});
    public static final BitSet FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BlocksAssignment_4_in_rule__Client__Group__4__Impl3725 = new BitSet(new long[]{0x000000000240F002L});
    public static final BitSet FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Client__Group__5__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HeaderBlock__Group__0__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13889 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl3976 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__04013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__04016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HeaderBlock__Group_2__0__Impl4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__04136 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__04139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__14196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__14199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Header__Group__1__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__24258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__04321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__04324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14381 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24441 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34502 = new BitSet(new long[]{0x000000001A600000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HttpMethod__Group__3__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44564 = new BitSet(new long[]{0x000000001A600000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4594 = new BitSet(new long[]{0x000000001A400002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HttpMethod__Group__5__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__04696 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__04699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__14757 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__14760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ParamsBlock__Group__1__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__24819 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__24822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__34879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl4906 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__04945 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__04948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ParamsBlock__Group_3__0__Impl4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__0__Impl_in_rule__SimpleMemberAssignment__Group__05068 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__1_in_rule__SimpleMemberAssignment__Group__05071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__MemberAssignment_0_in_rule__SimpleMemberAssignment__Group__0__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__1__Impl_in_rule__SimpleMemberAssignment__Group__15128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__0_in_rule__SimpleMemberAssignment__Group__1__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__0__Impl_in_rule__SimpleMemberAssignment__Group_1__05190 = new BitSet(new long[]{0x0000000080030060L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__1_in_rule__SimpleMemberAssignment__Group_1__05193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SimpleMemberAssignment__Group_1__0__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__1__Impl_in_rule__SimpleMemberAssignment__Group_1__15252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__DefaultValueAssignment_1_1_in_rule__SimpleMemberAssignment__Group_1__1__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05313 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__05435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__05438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__05557 = new BitSet(new long[]{0x0000000080030060L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__05560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__15618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05679 = new BitSet(new long[]{0x000001F000100010L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BodyBlock__Group__0__Impl5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05802 = new BitSet(new long[]{0x000000001A400000L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15863 = new BitSet(new long[]{0x000001F020100010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ResponseBlock__Group__1__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__25925 = new BitSet(new long[]{0x000001F020100010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__25928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__35986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ResponseBlock__Group_2__0__Impl6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__06175 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__06178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__16235 = new BitSet(new long[]{0x000001F000000010L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__16238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypedMember__Group__1__Impl6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__26297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__06360 = new BitSet(new long[]{0x000001F000100010L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__06363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__16420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__06481 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__06484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__16541 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__16544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SimpleMember__Group__1__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__26603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__06666 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__06669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__16726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__06787 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__06790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__16847 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__16850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__26908 = new BitSet(new long[]{0x000001F000100010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__26911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__36968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07034 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17094 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27155 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37215 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07344 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumTypeDeclaration__Group_3__0__Impl7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumTypeLiteral__Group__0__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__17529 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__17532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__27589 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__27592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl7619 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__37650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumTypeLiteral__Group__3__Impl7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__07717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__07720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumTypeLiteral__Group_2__0__Impl7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__17779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__07840 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__07843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__17900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07962 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08083 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexTypeLiteral__Group__0__Impl8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18145 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28205 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8235 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComplexTypeLiteral__Group__3__Impl8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08333 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ComplexTypeLiteral__Group_2__0__Impl8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08456 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8542 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FQN__Group_1__0__Impl8608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__08699 = new BitSet(new long[]{0x0000000080030060L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__08702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SignedNumber__Group__0__Impl8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__18764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_18829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_28860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Client__NameAssignment_18891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_28922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientBlock_in_rule__Client__BlocksAssignment_48953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_18984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_19015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_09046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_29077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_09108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_19139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpMethod__PathAssignment_29170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_49201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_29232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_3_19263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__SimpleMemberAssignment__MemberAssignment_09294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__SimpleMemberAssignment__DefaultValueAssignment_1_19325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_19356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_19387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_19418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_19449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_19484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_39519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_09550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_29583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_09614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_19647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_09678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_29711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_09742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__GenericListType__IdAssignment_19780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment9823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ComplexTypeDeclaration__KeywordAssignment_09863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ComplexTypeDeclaration__GenAssignment_19907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_29946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_39977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumTypeDeclaration__KeywordAssignment_010013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumTypeDeclaration__GenAssignment_110057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumMember__AssignmentAssignment_1_010287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_110326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__StringType__IdAssignment10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BooleanType__IdAssignment10468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IntegerType__IdAssignment10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LongType__IdAssignment10556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DoubleType__IdAssignment10600 = new BitSet(new long[]{0x0000000000000002L});

}