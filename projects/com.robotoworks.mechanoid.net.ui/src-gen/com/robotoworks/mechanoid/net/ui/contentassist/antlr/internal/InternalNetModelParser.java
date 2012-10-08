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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'client'", "'{'", "'}'", "'post'", "'put'", "'get'", "'delete'", "'params'", "','", "'body'", "'response'", "'extends'", "':'", "'.'", "'[]'", "'entity'", "'generate'", "'enum'", "'='", "'String'", "'boolean'", "'int'", "'long'", "'double'"
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
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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


    // $ANTLR start "entryRuleHttpMethod"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:144:1: entryRuleHttpMethod : ruleHttpMethod EOF ;
    public final void entryRuleHttpMethod() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:145:1: ( ruleHttpMethod EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:146:1: ruleHttpMethod EOF
            {
             before(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod241);
            ruleHttpMethod();

            state._fsp--;

             after(grammarAccess.getHttpMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod248); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:153:1: ruleHttpMethod : ( ( rule__HttpMethod__Alternatives ) ) ;
    public final void ruleHttpMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:157:2: ( ( ( rule__HttpMethod__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:158:1: ( ( rule__HttpMethod__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:158:1: ( ( rule__HttpMethod__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:159:1: ( rule__HttpMethod__Alternatives )
            {
             before(grammarAccess.getHttpMethodAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:160:1: ( rule__HttpMethod__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:160:2: rule__HttpMethod__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethod__Alternatives_in_ruleHttpMethod274);
            rule__HttpMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleHttpPost"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:172:1: entryRuleHttpPost : ruleHttpPost EOF ;
    public final void entryRuleHttpPost() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:173:1: ( ruleHttpPost EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:174:1: ruleHttpPost EOF
            {
             before(grammarAccess.getHttpPostRule()); 
            pushFollow(FOLLOW_ruleHttpPost_in_entryRuleHttpPost301);
            ruleHttpPost();

            state._fsp--;

             after(grammarAccess.getHttpPostRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpPost308); 

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
    // $ANTLR end "entryRuleHttpPost"


    // $ANTLR start "ruleHttpPost"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:181:1: ruleHttpPost : ( ( rule__HttpPost__Group__0 ) ) ;
    public final void ruleHttpPost() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:185:2: ( ( ( rule__HttpPost__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:186:1: ( ( rule__HttpPost__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:186:1: ( ( rule__HttpPost__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:187:1: ( rule__HttpPost__Group__0 )
            {
             before(grammarAccess.getHttpPostAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:188:1: ( rule__HttpPost__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:188:2: rule__HttpPost__Group__0
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__0_in_ruleHttpPost334);
            rule__HttpPost__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpPostAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpPost"


    // $ANTLR start "entryRuleHttpPut"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:200:1: entryRuleHttpPut : ruleHttpPut EOF ;
    public final void entryRuleHttpPut() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:201:1: ( ruleHttpPut EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:202:1: ruleHttpPut EOF
            {
             before(grammarAccess.getHttpPutRule()); 
            pushFollow(FOLLOW_ruleHttpPut_in_entryRuleHttpPut361);
            ruleHttpPut();

            state._fsp--;

             after(grammarAccess.getHttpPutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpPut368); 

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
    // $ANTLR end "entryRuleHttpPut"


    // $ANTLR start "ruleHttpPut"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:209:1: ruleHttpPut : ( ( rule__HttpPut__Group__0 ) ) ;
    public final void ruleHttpPut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:213:2: ( ( ( rule__HttpPut__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:214:1: ( ( rule__HttpPut__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:214:1: ( ( rule__HttpPut__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:215:1: ( rule__HttpPut__Group__0 )
            {
             before(grammarAccess.getHttpPutAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:216:1: ( rule__HttpPut__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:216:2: rule__HttpPut__Group__0
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__0_in_ruleHttpPut394);
            rule__HttpPut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpPutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpPut"


    // $ANTLR start "entryRuleHttpGet"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:228:1: entryRuleHttpGet : ruleHttpGet EOF ;
    public final void entryRuleHttpGet() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:229:1: ( ruleHttpGet EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:230:1: ruleHttpGet EOF
            {
             before(grammarAccess.getHttpGetRule()); 
            pushFollow(FOLLOW_ruleHttpGet_in_entryRuleHttpGet421);
            ruleHttpGet();

            state._fsp--;

             after(grammarAccess.getHttpGetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpGet428); 

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
    // $ANTLR end "entryRuleHttpGet"


    // $ANTLR start "ruleHttpGet"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:237:1: ruleHttpGet : ( ( rule__HttpGet__Group__0 ) ) ;
    public final void ruleHttpGet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:241:2: ( ( ( rule__HttpGet__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:242:1: ( ( rule__HttpGet__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:242:1: ( ( rule__HttpGet__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:243:1: ( rule__HttpGet__Group__0 )
            {
             before(grammarAccess.getHttpGetAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:244:1: ( rule__HttpGet__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:244:2: rule__HttpGet__Group__0
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__0_in_ruleHttpGet454);
            rule__HttpGet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpGetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpGet"


    // $ANTLR start "entryRuleHttpDelete"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:256:1: entryRuleHttpDelete : ruleHttpDelete EOF ;
    public final void entryRuleHttpDelete() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:257:1: ( ruleHttpDelete EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:258:1: ruleHttpDelete EOF
            {
             before(grammarAccess.getHttpDeleteRule()); 
            pushFollow(FOLLOW_ruleHttpDelete_in_entryRuleHttpDelete481);
            ruleHttpDelete();

            state._fsp--;

             after(grammarAccess.getHttpDeleteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpDelete488); 

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
    // $ANTLR end "entryRuleHttpDelete"


    // $ANTLR start "ruleHttpDelete"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:265:1: ruleHttpDelete : ( ( rule__HttpDelete__Group__0 ) ) ;
    public final void ruleHttpDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:269:2: ( ( ( rule__HttpDelete__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:270:1: ( ( rule__HttpDelete__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:270:1: ( ( rule__HttpDelete__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:271:1: ( rule__HttpDelete__Group__0 )
            {
             before(grammarAccess.getHttpDeleteAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:272:1: ( rule__HttpDelete__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:272:2: rule__HttpDelete__Group__0
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__0_in_ruleHttpDelete514);
            rule__HttpDelete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpDelete"


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


    // $ANTLR start "entryRuleBodyBlock"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:312:1: entryRuleBodyBlock : ruleBodyBlock EOF ;
    public final void entryRuleBodyBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:313:1: ( ruleBodyBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:314:1: ruleBodyBlock EOF
            {
             before(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock601);
            ruleBodyBlock();

            state._fsp--;

             after(grammarAccess.getBodyBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock608); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:321:1: ruleBodyBlock : ( ( rule__BodyBlock__Group__0 ) ) ;
    public final void ruleBodyBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:325:2: ( ( ( rule__BodyBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:326:1: ( ( rule__BodyBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:326:1: ( ( rule__BodyBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:327:1: ( rule__BodyBlock__Group__0 )
            {
             before(grammarAccess.getBodyBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:328:1: ( rule__BodyBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:328:2: rule__BodyBlock__Group__0
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock634);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:340:1: entryRuleResponseBlock : ruleResponseBlock EOF ;
    public final void entryRuleResponseBlock() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:341:1: ( ruleResponseBlock EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:342:1: ruleResponseBlock EOF
            {
             before(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock661);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getResponseBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock668); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:349:1: ruleResponseBlock : ( ( rule__ResponseBlock__Group__0 ) ) ;
    public final void ruleResponseBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:353:2: ( ( ( rule__ResponseBlock__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:354:1: ( ( rule__ResponseBlock__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:354:1: ( ( rule__ResponseBlock__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:355:1: ( rule__ResponseBlock__Group__0 )
            {
             before(grammarAccess.getResponseBlockAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:356:1: ( rule__ResponseBlock__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:356:2: rule__ResponseBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock694);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:368:1: entryRuleBlockType : ruleBlockType EOF ;
    public final void entryRuleBlockType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:369:1: ( ruleBlockType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:370:1: ruleBlockType EOF
            {
             before(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType721);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getBlockTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType728); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:377:1: ruleBlockType : ( ( rule__BlockType__Alternatives ) ) ;
    public final void ruleBlockType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:381:2: ( ( ( rule__BlockType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:382:1: ( ( rule__BlockType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:382:1: ( ( rule__BlockType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:383:1: ( rule__BlockType__Alternatives )
            {
             before(grammarAccess.getBlockTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:384:1: ( rule__BlockType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:384:2: rule__BlockType__Alternatives
            {
            pushFollow(FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType754);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:396:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:397:1: ( ruleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:398:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember781);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember788); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:405:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:409:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:410:1: ( ( rule__Member__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:410:1: ( ( rule__Member__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:411:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:412:1: ( rule__Member__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:412:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember814);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:424:1: entryRuleTypedMember : ruleTypedMember EOF ;
    public final void entryRuleTypedMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:425:1: ( ruleTypedMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:426:1: ruleTypedMember EOF
            {
             before(grammarAccess.getTypedMemberRule()); 
            pushFollow(FOLLOW_ruleTypedMember_in_entryRuleTypedMember841);
            ruleTypedMember();

            state._fsp--;

             after(grammarAccess.getTypedMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedMember848); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:433:1: ruleTypedMember : ( ( rule__TypedMember__Group__0 ) ) ;
    public final void ruleTypedMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:437:2: ( ( ( rule__TypedMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__TypedMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__TypedMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:439:1: ( rule__TypedMember__Group__0 )
            {
             before(grammarAccess.getTypedMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:1: ( rule__TypedMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:2: rule__TypedMember__Group__0
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__0_in_ruleTypedMember874);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:452:1: entryRuleSkipMember : ruleSkipMember EOF ;
    public final void entryRuleSkipMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:453:1: ( ruleSkipMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:454:1: ruleSkipMember EOF
            {
             before(grammarAccess.getSkipMemberRule()); 
            pushFollow(FOLLOW_ruleSkipMember_in_entryRuleSkipMember901);
            ruleSkipMember();

            state._fsp--;

             after(grammarAccess.getSkipMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkipMember908); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:461:1: ruleSkipMember : ( ( rule__SkipMember__Group__0 ) ) ;
    public final void ruleSkipMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:465:2: ( ( ( rule__SkipMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__SkipMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__SkipMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:467:1: ( rule__SkipMember__Group__0 )
            {
             before(grammarAccess.getSkipMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:1: ( rule__SkipMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:2: rule__SkipMember__Group__0
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0_in_ruleSkipMember934);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:480:1: entryRuleSimpleMember : ruleSimpleMember EOF ;
    public final void entryRuleSimpleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:481:1: ( ruleSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:482:1: ruleSimpleMember EOF
            {
             before(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember961);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getSimpleMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember968); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:489:1: ruleSimpleMember : ( ( rule__SimpleMember__Group__0 ) ) ;
    public final void ruleSimpleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:493:2: ( ( ( rule__SimpleMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__SimpleMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__SimpleMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:495:1: ( rule__SimpleMember__Group__0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:1: ( rule__SimpleMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:2: rule__SimpleMember__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember994);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:508:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:509:1: ( ruleType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:510:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1021);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1028); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:517:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:521:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:522:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:522:1: ( ( rule__Type__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:523:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:524:1: ( rule__Type__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:524:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1054);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:536:1: entryRuleGenericListType : ruleGenericListType EOF ;
    public final void entryRuleGenericListType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:537:1: ( ruleGenericListType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:538:1: ruleGenericListType EOF
            {
             before(grammarAccess.getGenericListTypeRule()); 
            pushFollow(FOLLOW_ruleGenericListType_in_entryRuleGenericListType1081);
            ruleGenericListType();

            state._fsp--;

             after(grammarAccess.getGenericListTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListType1088); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:545:1: ruleGenericListType : ( ( rule__GenericListType__Group__0 ) ) ;
    public final void ruleGenericListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:549:2: ( ( ( rule__GenericListType__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__GenericListType__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__GenericListType__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:551:1: ( rule__GenericListType__Group__0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:1: ( rule__GenericListType__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:2: rule__GenericListType__Group__0
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0_in_ruleGenericListType1114);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:564:1: entryRuleUserType : ruleUserType EOF ;
    public final void entryRuleUserType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:565:1: ( ruleUserType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:566:1: ruleUserType EOF
            {
             before(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType1141);
            ruleUserType();

            state._fsp--;

             after(grammarAccess.getUserTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType1148); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:573:1: ruleUserType : ( ( rule__UserType__DeclarationAssignment ) ) ;
    public final void ruleUserType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:577:2: ( ( ( rule__UserType__DeclarationAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__UserType__DeclarationAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__UserType__DeclarationAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:579:1: ( rule__UserType__DeclarationAssignment )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:1: ( rule__UserType__DeclarationAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:2: rule__UserType__DeclarationAssignment
            {
            pushFollow(FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1174);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:592:1: entryRuleUserTypeDeclaration : ruleUserTypeDeclaration EOF ;
    public final void entryRuleUserTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:593:1: ( ruleUserTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:594:1: ruleUserTypeDeclaration EOF
            {
             before(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1201);
            ruleUserTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration1208); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:601:1: ruleUserTypeDeclaration : ( ( rule__UserTypeDeclaration__Alternatives ) ) ;
    public final void ruleUserTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:605:2: ( ( ( rule__UserTypeDeclaration__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:607:1: ( rule__UserTypeDeclaration__Alternatives )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:1: ( rule__UserTypeDeclaration__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:2: rule__UserTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1234);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:620:1: entryRuleComplexTypeDeclaration : ruleComplexTypeDeclaration EOF ;
    public final void entryRuleComplexTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:621:1: ( ruleComplexTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:622:1: ruleComplexTypeDeclaration EOF
            {
             before(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1261);
            ruleComplexTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1268); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:629:1: ruleComplexTypeDeclaration : ( ( rule__ComplexTypeDeclaration__Group__0 ) ) ;
    public final void ruleComplexTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:633:2: ( ( ( rule__ComplexTypeDeclaration__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:634:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:634:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:635:1: ( rule__ComplexTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:636:1: ( rule__ComplexTypeDeclaration__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:636:2: rule__ComplexTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1294);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:648:1: entryRuleEnumTypeDeclaration : ruleEnumTypeDeclaration EOF ;
    public final void entryRuleEnumTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:649:1: ( ruleEnumTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:650:1: ruleEnumTypeDeclaration EOF
            {
             before(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1321);
            ruleEnumTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1328); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:657:1: ruleEnumTypeDeclaration : ( ( rule__EnumTypeDeclaration__Group__0 ) ) ;
    public final void ruleEnumTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:661:2: ( ( ( rule__EnumTypeDeclaration__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:662:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:662:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:663:1: ( rule__EnumTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:664:1: ( rule__EnumTypeDeclaration__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:664:2: rule__EnumTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1354);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:676:1: entryRuleEnumTypeLiteral : ruleEnumTypeLiteral EOF ;
    public final void entryRuleEnumTypeLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:677:1: ( ruleEnumTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:678:1: ruleEnumTypeLiteral EOF
            {
             before(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1381);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral1388); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:685:1: ruleEnumTypeLiteral : ( ( rule__EnumTypeLiteral__Group__0 ) ) ;
    public final void ruleEnumTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:689:2: ( ( ( rule__EnumTypeLiteral__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:690:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:690:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:691:1: ( rule__EnumTypeLiteral__Group__0 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:692:1: ( rule__EnumTypeLiteral__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:692:2: rule__EnumTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1414);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:704:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:705:1: ( ruleEnumMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:706:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember1441);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember1448); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:713:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:717:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:718:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:718:1: ( ( rule__EnumMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:719:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:720:1: ( rule__EnumMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:720:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1474);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:732:1: entryRuleComplexTypeLiteral : ruleComplexTypeLiteral EOF ;
    public final void entryRuleComplexTypeLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:733:1: ( ruleComplexTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:734:1: ruleComplexTypeLiteral EOF
            {
             before(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1501);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral1508); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:741:1: ruleComplexTypeLiteral : ( ( rule__ComplexTypeLiteral__Group__0 ) ) ;
    public final void ruleComplexTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:745:2: ( ( ( rule__ComplexTypeLiteral__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:746:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:746:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:747:1: ( rule__ComplexTypeLiteral__Group__0 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:748:1: ( rule__ComplexTypeLiteral__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:748:2: rule__ComplexTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1534);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:760:1: entryRuleIntrinsicType : ruleIntrinsicType EOF ;
    public final void entryRuleIntrinsicType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:761:1: ( ruleIntrinsicType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:762:1: ruleIntrinsicType EOF
            {
             before(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1561);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getIntrinsicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType1568); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:769:1: ruleIntrinsicType : ( ( rule__IntrinsicType__Alternatives ) ) ;
    public final void ruleIntrinsicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:773:2: ( ( ( rule__IntrinsicType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:774:1: ( ( rule__IntrinsicType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:774:1: ( ( rule__IntrinsicType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:775:1: ( rule__IntrinsicType__Alternatives )
            {
             before(grammarAccess.getIntrinsicTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:776:1: ( rule__IntrinsicType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:776:2: rule__IntrinsicType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1594);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:788:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:789:1: ( ruleStringType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:790:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1621);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1628); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:797:1: ruleStringType : ( ( rule__StringType__IdAssignment ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:801:2: ( ( ( rule__StringType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:802:1: ( ( rule__StringType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:802:1: ( ( rule__StringType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:803:1: ( rule__StringType__IdAssignment )
            {
             before(grammarAccess.getStringTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:804:1: ( rule__StringType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:804:2: rule__StringType__IdAssignment
            {
            pushFollow(FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1654);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:816:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:817:1: ( ruleBooleanType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:818:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1681);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1688); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:825:1: ruleBooleanType : ( ( rule__BooleanType__IdAssignment ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:829:2: ( ( ( rule__BooleanType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:830:1: ( ( rule__BooleanType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:830:1: ( ( rule__BooleanType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:831:1: ( rule__BooleanType__IdAssignment )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:832:1: ( rule__BooleanType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:832:2: rule__BooleanType__IdAssignment
            {
            pushFollow(FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1714);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:844:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:845:1: ( ruleNumericType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:846:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType1741);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType1748); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:853:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:857:2: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:858:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:858:1: ( ( rule__NumericType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:859:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:860:1: ( rule__NumericType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:860:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1774);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:872:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:873:1: ( ruleIntegerType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:874:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType1801);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType1808); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:881:1: ruleIntegerType : ( ( rule__IntegerType__IdAssignment ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:885:2: ( ( ( rule__IntegerType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:886:1: ( ( rule__IntegerType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:886:1: ( ( rule__IntegerType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:887:1: ( rule__IntegerType__IdAssignment )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:888:1: ( rule__IntegerType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:888:2: rule__IntegerType__IdAssignment
            {
            pushFollow(FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1834);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:900:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:901:1: ( ruleLongType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:902:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType1861);
            ruleLongType();

            state._fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType1868); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:909:1: ruleLongType : ( ( rule__LongType__IdAssignment ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:913:2: ( ( ( rule__LongType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:914:1: ( ( rule__LongType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:914:1: ( ( rule__LongType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:915:1: ( rule__LongType__IdAssignment )
            {
             before(grammarAccess.getLongTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:916:1: ( rule__LongType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:916:2: rule__LongType__IdAssignment
            {
            pushFollow(FOLLOW_rule__LongType__IdAssignment_in_ruleLongType1894);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:928:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:929:1: ( ruleDoubleType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:930:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType1921);
            ruleDoubleType();

            state._fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType1928); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:937:1: ruleDoubleType : ( ( rule__DoubleType__IdAssignment ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:941:2: ( ( ( rule__DoubleType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:942:1: ( ( rule__DoubleType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:942:1: ( ( rule__DoubleType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:943:1: ( rule__DoubleType__IdAssignment )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:944:1: ( rule__DoubleType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:944:2: rule__DoubleType__IdAssignment
            {
            pushFollow(FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType1954);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:956:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:957:1: ( ruleFQN EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:958:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1981);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1988); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:965:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:969:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:970:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:970:1: ( ( rule__FQN__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:971:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:972:1: ( rule__FQN__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:972:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN2014);
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


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:984:1: rule__Declaration__Alternatives : ( ( ruleUserTypeDeclaration ) | ( ruleClient ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:988:1: ( ( ruleUserTypeDeclaration ) | ( ruleClient ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27||LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:989:1: ( ruleUserTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:989:1: ( ruleUserTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:990:1: ruleUserTypeDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2050);
                    ruleUserTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:995:6: ( ruleClient )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:995:6: ( ruleClient )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:996:1: ruleClient
                    {
                     before(grammarAccess.getDeclarationAccess().getClientParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClient_in_rule__Declaration__Alternatives2067);
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


    // $ANTLR start "rule__HttpMethod__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1006:1: rule__HttpMethod__Alternatives : ( ( ruleHttpPost ) | ( ruleHttpGet ) | ( ruleHttpPut ) | ( ruleHttpDelete ) );
    public final void rule__HttpMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1010:1: ( ( ruleHttpPost ) | ( ruleHttpGet ) | ( ruleHttpPut ) | ( ruleHttpDelete ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1011:1: ( ruleHttpPost )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1011:1: ( ruleHttpPost )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1012:1: ruleHttpPost
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpPostParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHttpPost_in_rule__HttpMethod__Alternatives2099);
                    ruleHttpPost();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodAccess().getHttpPostParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1017:6: ( ruleHttpGet )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1017:6: ( ruleHttpGet )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1018:1: ruleHttpGet
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpGetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHttpGet_in_rule__HttpMethod__Alternatives2116);
                    ruleHttpGet();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodAccess().getHttpGetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1023:6: ( ruleHttpPut )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1023:6: ( ruleHttpPut )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1024:1: ruleHttpPut
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpPutParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHttpPut_in_rule__HttpMethod__Alternatives2133);
                    ruleHttpPut();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodAccess().getHttpPutParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1029:6: ( ruleHttpDelete )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1029:6: ( ruleHttpDelete )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1030:1: ruleHttpDelete
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHttpDelete_in_rule__HttpMethod__Alternatives2150);
                    ruleHttpDelete();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodAccess().getHttpDeleteParserRuleCall_3()); 

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
    // $ANTLR end "rule__HttpMethod__Alternatives"


    // $ANTLR start "rule__BlockType__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1040:1: rule__BlockType__Alternatives : ( ( ruleType ) | ( ruleComplexTypeLiteral ) );
    public final void rule__BlockType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1044:1: ( ( ruleType ) | ( ruleComplexTypeLiteral ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=31 && LA3_0<=35)) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1045:1: ( ruleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1045:1: ( ruleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1046:1: ruleType
                    {
                     before(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__BlockType__Alternatives2182);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1051:6: ( ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1051:6: ( ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1052:1: ruleComplexTypeLiteral
                    {
                     before(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2199);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1062:1: rule__Member__Alternatives : ( ( ruleTypedMember ) | ( ruleSkipMember ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1066:1: ( ( ruleTypedMember ) | ( ruleSkipMember ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==24) ) {
                    alt4=1;
                }
                else if ( (LA4_1==13) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==13) ) {
                    alt4=2;
                }
                else if ( (LA4_2==24) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1067:1: ( ruleTypedMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1067:1: ( ruleTypedMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1068:1: ruleTypedMember
                    {
                     before(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2231);
                    ruleTypedMember();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1073:6: ( ruleSkipMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1073:6: ( ruleSkipMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1074:1: ruleSkipMember
                    {
                     before(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2248);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1084:1: rule__TypedMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TypedMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1088:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1089:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1089:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1090:1: RULE_ID
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02280); 
                     after(grammarAccess.getTypedMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1095:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1095:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1096:1: RULE_STRING
                    {
                     before(grammarAccess.getTypedMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02297); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1106:1: rule__SkipMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SkipMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1110:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1111:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1111:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1112:1: RULE_ID
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02329); 
                     after(grammarAccess.getSkipMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1117:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1117:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1118:1: RULE_STRING
                    {
                     before(grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02346); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1128:1: rule__SimpleMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SimpleMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1132:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1133:1: ( RULE_ID )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1133:1: ( RULE_ID )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1134:1: RULE_ID
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02378); 
                     after(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1139:6: ( RULE_STRING )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1139:6: ( RULE_STRING )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1140:1: RULE_STRING
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02395); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1150:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1154:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1155:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1155:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1156:1: ruleUserType
                    {
                     before(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__Type__Alternatives2427);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1161:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1161:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1162:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2444);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1167:6: ( ruleGenericListType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1167:6: ( ruleGenericListType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1168:1: ruleGenericListType
                    {
                     before(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2461);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1178:1: rule__GenericListType__ElementTypeAlternatives_0_0 : ( ( ruleUserType ) | ( ruleIntrinsicType ) );
    public final void rule__GenericListType__ElementTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1182:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=31 && LA9_0<=35)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1183:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1183:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1184:1: ruleUserType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02493);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1189:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1189:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1190:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02510);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1200:1: rule__UserTypeDeclaration__Alternatives : ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1204:1: ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1205:1: ( ruleComplexTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1205:1: ( ruleComplexTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1206:1: ruleComplexTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2542);
                    ruleComplexTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1211:6: ( ruleEnumTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1211:6: ( ruleEnumTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1212:1: ruleEnumTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2559);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1222:1: rule__IntrinsicType__Alternatives : ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) );
    public final void rule__IntrinsicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1226:1: ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 33:
            case 34:
            case 35:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1227:1: ( ruleStringType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1227:1: ( ruleStringType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1228:1: ruleStringType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2591);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1233:6: ( ruleBooleanType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1233:6: ( ruleBooleanType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1234:1: ruleBooleanType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2608);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1239:6: ( ruleNumericType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1239:6: ( ruleNumericType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1240:1: ruleNumericType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2625);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1250:1: rule__NumericType__Alternatives : ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1254:1: ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1255:1: ( ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1255:1: ( ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1256:1: ruleIntegerType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2657);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1261:6: ( ruleLongType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1261:6: ( ruleLongType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1262:1: ruleLongType
                    {
                     before(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2674);
                    ruleLongType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1267:6: ( ruleDoubleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1267:6: ( ruleDoubleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1268:1: ruleDoubleType
                    {
                     before(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2691);
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


    // $ANTLR start "rule__Model__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1280:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1284:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1285:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02721);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02724);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1292:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1296:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1297:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1297:1: ( 'package' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1298:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl2752); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1311:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1315:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1316:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12783);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12786);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1323:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1327:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1328:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1328:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1329:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1330:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1330:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl2813);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1340:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1344:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22843);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1351:1: rule__Model__Group__2__Impl : ( ( rule__Model__DeclarationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1355:1: ( ( ( rule__Model__DeclarationsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1356:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1356:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1357:1: ( rule__Model__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1358:1: ( rule__Model__DeclarationsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12||LA13_0==27||LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1358:2: rule__Model__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl2870);
            	    rule__Model__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1374:1: rule__Client__Group__0 : rule__Client__Group__0__Impl rule__Client__Group__1 ;
    public final void rule__Client__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1378:1: ( rule__Client__Group__0__Impl rule__Client__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1379:2: rule__Client__Group__0__Impl rule__Client__Group__1
            {
            pushFollow(FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__02907);
            rule__Client__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__1_in_rule__Client__Group__02910);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1386:1: rule__Client__Group__0__Impl : ( 'client' ) ;
    public final void rule__Client__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1390:1: ( ( 'client' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1391:1: ( 'client' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1391:1: ( 'client' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1392:1: 'client'
            {
             before(grammarAccess.getClientAccess().getClientKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Client__Group__0__Impl2938); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1405:1: rule__Client__Group__1 : rule__Client__Group__1__Impl rule__Client__Group__2 ;
    public final void rule__Client__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1409:1: ( rule__Client__Group__1__Impl rule__Client__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1410:2: rule__Client__Group__1__Impl rule__Client__Group__2
            {
            pushFollow(FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__12969);
            rule__Client__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__2_in_rule__Client__Group__12972);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1417:1: rule__Client__Group__1__Impl : ( ( rule__Client__NameAssignment_1 ) ) ;
    public final void rule__Client__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1421:1: ( ( ( rule__Client__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1422:1: ( ( rule__Client__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1422:1: ( ( rule__Client__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1423:1: ( rule__Client__NameAssignment_1 )
            {
             before(grammarAccess.getClientAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1424:1: ( rule__Client__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1424:2: rule__Client__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl2999);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1434:1: rule__Client__Group__2 : rule__Client__Group__2__Impl rule__Client__Group__3 ;
    public final void rule__Client__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1438:1: ( rule__Client__Group__2__Impl rule__Client__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1439:2: rule__Client__Group__2__Impl rule__Client__Group__3
            {
            pushFollow(FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23029);
            rule__Client__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23032);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1446:1: rule__Client__Group__2__Impl : ( ( rule__Client__BaseUrlAssignment_2 )? ) ;
    public final void rule__Client__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1450:1: ( ( ( rule__Client__BaseUrlAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1451:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1451:1: ( ( rule__Client__BaseUrlAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1452:1: ( rule__Client__BaseUrlAssignment_2 )?
            {
             before(grammarAccess.getClientAccess().getBaseUrlAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1453:1: ( rule__Client__BaseUrlAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1453:2: rule__Client__BaseUrlAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3059);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1463:1: rule__Client__Group__3 : rule__Client__Group__3__Impl rule__Client__Group__4 ;
    public final void rule__Client__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1467:1: ( rule__Client__Group__3__Impl rule__Client__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1468:2: rule__Client__Group__3__Impl rule__Client__Group__4
            {
            pushFollow(FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33090);
            rule__Client__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33093);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1475:1: rule__Client__Group__3__Impl : ( '{' ) ;
    public final void rule__Client__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1479:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1480:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1480:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1481:1: '{'
            {
             before(grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Client__Group__3__Impl3121); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1494:1: rule__Client__Group__4 : rule__Client__Group__4__Impl rule__Client__Group__5 ;
    public final void rule__Client__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1498:1: ( rule__Client__Group__4__Impl rule__Client__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1499:2: rule__Client__Group__4__Impl rule__Client__Group__5
            {
            pushFollow(FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43152);
            rule__Client__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43155);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1506:1: rule__Client__Group__4__Impl : ( ( rule__Client__ParamsAssignment_4 )? ) ;
    public final void rule__Client__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1510:1: ( ( ( rule__Client__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1511:1: ( ( rule__Client__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1511:1: ( ( rule__Client__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1512:1: ( rule__Client__ParamsAssignment_4 )?
            {
             before(grammarAccess.getClientAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1513:1: ( rule__Client__ParamsAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1513:2: rule__Client__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Client__ParamsAssignment_4_in_rule__Client__Group__4__Impl3182);
                    rule__Client__ParamsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClientAccess().getParamsAssignment_4()); 

            }


            }

        }
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1523:1: rule__Client__Group__5 : rule__Client__Group__5__Impl rule__Client__Group__6 ;
    public final void rule__Client__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1527:1: ( rule__Client__Group__5__Impl rule__Client__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1528:2: rule__Client__Group__5__Impl rule__Client__Group__6
            {
            pushFollow(FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53213);
            rule__Client__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__6_in_rule__Client__Group__53216);
            rule__Client__Group__6();

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1535:1: rule__Client__Group__5__Impl : ( ( rule__Client__MethodsAssignment_5 )* ) ;
    public final void rule__Client__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1539:1: ( ( ( rule__Client__MethodsAssignment_5 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1540:1: ( ( rule__Client__MethodsAssignment_5 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1540:1: ( ( rule__Client__MethodsAssignment_5 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1541:1: ( rule__Client__MethodsAssignment_5 )*
            {
             before(grammarAccess.getClientAccess().getMethodsAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1542:1: ( rule__Client__MethodsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=15 && LA16_0<=18)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1542:2: rule__Client__MethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Client__MethodsAssignment_5_in_rule__Client__Group__5__Impl3243);
            	    rule__Client__MethodsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getClientAccess().getMethodsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Client__Group__6"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1552:1: rule__Client__Group__6 : rule__Client__Group__6__Impl ;
    public final void rule__Client__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1556:1: ( rule__Client__Group__6__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1557:2: rule__Client__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Client__Group__6__Impl_in_rule__Client__Group__63274);
            rule__Client__Group__6__Impl();

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
    // $ANTLR end "rule__Client__Group__6"


    // $ANTLR start "rule__Client__Group__6__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1563:1: rule__Client__Group__6__Impl : ( '}' ) ;
    public final void rule__Client__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1567:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1568:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1568:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1569:1: '}'
            {
             before(grammarAccess.getClientAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Client__Group__6__Impl3302); 
             after(grammarAccess.getClientAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Client__Group__6__Impl"


    // $ANTLR start "rule__HttpPost__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1596:1: rule__HttpPost__Group__0 : rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1 ;
    public final void rule__HttpPost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1600:1: ( rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1601:2: rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__0__Impl_in_rule__HttpPost__Group__03347);
            rule__HttpPost__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__1_in_rule__HttpPost__Group__03350);
            rule__HttpPost__Group__1();

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
    // $ANTLR end "rule__HttpPost__Group__0"


    // $ANTLR start "rule__HttpPost__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1608:1: rule__HttpPost__Group__0__Impl : ( 'post' ) ;
    public final void rule__HttpPost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1612:1: ( ( 'post' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1613:1: ( 'post' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1613:1: ( 'post' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1614:1: 'post'
            {
             before(grammarAccess.getHttpPostAccess().getPostKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__HttpPost__Group__0__Impl3378); 
             after(grammarAccess.getHttpPostAccess().getPostKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__0__Impl"


    // $ANTLR start "rule__HttpPost__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1627:1: rule__HttpPost__Group__1 : rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2 ;
    public final void rule__HttpPost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1631:1: ( rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1632:2: rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__1__Impl_in_rule__HttpPost__Group__13409);
            rule__HttpPost__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__2_in_rule__HttpPost__Group__13412);
            rule__HttpPost__Group__2();

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
    // $ANTLR end "rule__HttpPost__Group__1"


    // $ANTLR start "rule__HttpPost__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1639:1: rule__HttpPost__Group__1__Impl : ( ( rule__HttpPost__NameAssignment_1 ) ) ;
    public final void rule__HttpPost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1643:1: ( ( ( rule__HttpPost__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1644:1: ( ( rule__HttpPost__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1644:1: ( ( rule__HttpPost__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1645:1: ( rule__HttpPost__NameAssignment_1 )
            {
             before(grammarAccess.getHttpPostAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1646:1: ( rule__HttpPost__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1646:2: rule__HttpPost__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpPost__NameAssignment_1_in_rule__HttpPost__Group__1__Impl3439);
            rule__HttpPost__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpPostAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__1__Impl"


    // $ANTLR start "rule__HttpPost__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1656:1: rule__HttpPost__Group__2 : rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3 ;
    public final void rule__HttpPost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1660:1: ( rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1661:2: rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__2__Impl_in_rule__HttpPost__Group__23469);
            rule__HttpPost__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__3_in_rule__HttpPost__Group__23472);
            rule__HttpPost__Group__3();

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
    // $ANTLR end "rule__HttpPost__Group__2"


    // $ANTLR start "rule__HttpPost__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1668:1: rule__HttpPost__Group__2__Impl : ( ( rule__HttpPost__PathAssignment_2 )? ) ;
    public final void rule__HttpPost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1672:1: ( ( ( rule__HttpPost__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1673:1: ( ( rule__HttpPost__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1673:1: ( ( rule__HttpPost__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1674:1: ( rule__HttpPost__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpPostAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1675:1: ( rule__HttpPost__PathAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1675:2: rule__HttpPost__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpPost__PathAssignment_2_in_rule__HttpPost__Group__2__Impl3499);
                    rule__HttpPost__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPostAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__2__Impl"


    // $ANTLR start "rule__HttpPost__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1685:1: rule__HttpPost__Group__3 : rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4 ;
    public final void rule__HttpPost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1689:1: ( rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1690:2: rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__3__Impl_in_rule__HttpPost__Group__33530);
            rule__HttpPost__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__4_in_rule__HttpPost__Group__33533);
            rule__HttpPost__Group__4();

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
    // $ANTLR end "rule__HttpPost__Group__3"


    // $ANTLR start "rule__HttpPost__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1697:1: rule__HttpPost__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpPost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1701:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1702:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1702:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1703:1: '{'
            {
             before(grammarAccess.getHttpPostAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpPost__Group__3__Impl3561); 
             after(grammarAccess.getHttpPostAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__3__Impl"


    // $ANTLR start "rule__HttpPost__Group__4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1716:1: rule__HttpPost__Group__4 : rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5 ;
    public final void rule__HttpPost__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1720:1: ( rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1721:2: rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__4__Impl_in_rule__HttpPost__Group__43592);
            rule__HttpPost__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__5_in_rule__HttpPost__Group__43595);
            rule__HttpPost__Group__5();

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
    // $ANTLR end "rule__HttpPost__Group__4"


    // $ANTLR start "rule__HttpPost__Group__4__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1728:1: rule__HttpPost__Group__4__Impl : ( ( rule__HttpPost__ParamsAssignment_4 )? ) ;
    public final void rule__HttpPost__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1732:1: ( ( ( rule__HttpPost__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1733:1: ( ( rule__HttpPost__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1733:1: ( ( rule__HttpPost__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1734:1: ( rule__HttpPost__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpPostAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1735:1: ( rule__HttpPost__ParamsAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1735:2: rule__HttpPost__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpPost__ParamsAssignment_4_in_rule__HttpPost__Group__4__Impl3622);
                    rule__HttpPost__ParamsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPostAccess().getParamsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__4__Impl"


    // $ANTLR start "rule__HttpPost__Group__5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1745:1: rule__HttpPost__Group__5 : rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6 ;
    public final void rule__HttpPost__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1749:1: ( rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1750:2: rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__5__Impl_in_rule__HttpPost__Group__53653);
            rule__HttpPost__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__6_in_rule__HttpPost__Group__53656);
            rule__HttpPost__Group__6();

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
    // $ANTLR end "rule__HttpPost__Group__5"


    // $ANTLR start "rule__HttpPost__Group__5__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1757:1: rule__HttpPost__Group__5__Impl : ( ( rule__HttpPost__BodyAssignment_5 )? ) ;
    public final void rule__HttpPost__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1761:1: ( ( ( rule__HttpPost__BodyAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1762:1: ( ( rule__HttpPost__BodyAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1762:1: ( ( rule__HttpPost__BodyAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1763:1: ( rule__HttpPost__BodyAssignment_5 )?
            {
             before(grammarAccess.getHttpPostAccess().getBodyAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1764:1: ( rule__HttpPost__BodyAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1764:2: rule__HttpPost__BodyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpPost__BodyAssignment_5_in_rule__HttpPost__Group__5__Impl3683);
                    rule__HttpPost__BodyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPostAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__5__Impl"


    // $ANTLR start "rule__HttpPost__Group__6"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1774:1: rule__HttpPost__Group__6 : rule__HttpPost__Group__6__Impl rule__HttpPost__Group__7 ;
    public final void rule__HttpPost__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1778:1: ( rule__HttpPost__Group__6__Impl rule__HttpPost__Group__7 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1779:2: rule__HttpPost__Group__6__Impl rule__HttpPost__Group__7
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__6__Impl_in_rule__HttpPost__Group__63714);
            rule__HttpPost__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__7_in_rule__HttpPost__Group__63717);
            rule__HttpPost__Group__7();

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
    // $ANTLR end "rule__HttpPost__Group__6"


    // $ANTLR start "rule__HttpPost__Group__6__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1786:1: rule__HttpPost__Group__6__Impl : ( ( rule__HttpPost__ResponseAssignment_6 )? ) ;
    public final void rule__HttpPost__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1790:1: ( ( ( rule__HttpPost__ResponseAssignment_6 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1791:1: ( ( rule__HttpPost__ResponseAssignment_6 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1791:1: ( ( rule__HttpPost__ResponseAssignment_6 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1792:1: ( rule__HttpPost__ResponseAssignment_6 )?
            {
             before(grammarAccess.getHttpPostAccess().getResponseAssignment_6()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1793:1: ( rule__HttpPost__ResponseAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1793:2: rule__HttpPost__ResponseAssignment_6
                    {
                    pushFollow(FOLLOW_rule__HttpPost__ResponseAssignment_6_in_rule__HttpPost__Group__6__Impl3744);
                    rule__HttpPost__ResponseAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPostAccess().getResponseAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__6__Impl"


    // $ANTLR start "rule__HttpPost__Group__7"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1803:1: rule__HttpPost__Group__7 : rule__HttpPost__Group__7__Impl ;
    public final void rule__HttpPost__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1807:1: ( rule__HttpPost__Group__7__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1808:2: rule__HttpPost__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__7__Impl_in_rule__HttpPost__Group__73775);
            rule__HttpPost__Group__7__Impl();

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
    // $ANTLR end "rule__HttpPost__Group__7"


    // $ANTLR start "rule__HttpPost__Group__7__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1814:1: rule__HttpPost__Group__7__Impl : ( '}' ) ;
    public final void rule__HttpPost__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1818:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1819:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1819:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1820:1: '}'
            {
             before(grammarAccess.getHttpPostAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__HttpPost__Group__7__Impl3803); 
             after(grammarAccess.getHttpPostAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__Group__7__Impl"


    // $ANTLR start "rule__HttpPut__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1849:1: rule__HttpPut__Group__0 : rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1 ;
    public final void rule__HttpPut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:1: ( rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1854:2: rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__0__Impl_in_rule__HttpPut__Group__03850);
            rule__HttpPut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__1_in_rule__HttpPut__Group__03853);
            rule__HttpPut__Group__1();

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
    // $ANTLR end "rule__HttpPut__Group__0"


    // $ANTLR start "rule__HttpPut__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1861:1: rule__HttpPut__Group__0__Impl : ( 'put' ) ;
    public final void rule__HttpPut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1865:1: ( ( 'put' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1866:1: ( 'put' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1866:1: ( 'put' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1867:1: 'put'
            {
             before(grammarAccess.getHttpPutAccess().getPutKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__HttpPut__Group__0__Impl3881); 
             after(grammarAccess.getHttpPutAccess().getPutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__0__Impl"


    // $ANTLR start "rule__HttpPut__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1880:1: rule__HttpPut__Group__1 : rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2 ;
    public final void rule__HttpPut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1884:1: ( rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1885:2: rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__1__Impl_in_rule__HttpPut__Group__13912);
            rule__HttpPut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__2_in_rule__HttpPut__Group__13915);
            rule__HttpPut__Group__2();

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
    // $ANTLR end "rule__HttpPut__Group__1"


    // $ANTLR start "rule__HttpPut__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1892:1: rule__HttpPut__Group__1__Impl : ( ( rule__HttpPut__NameAssignment_1 ) ) ;
    public final void rule__HttpPut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1896:1: ( ( ( rule__HttpPut__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1897:1: ( ( rule__HttpPut__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1897:1: ( ( rule__HttpPut__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1898:1: ( rule__HttpPut__NameAssignment_1 )
            {
             before(grammarAccess.getHttpPutAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1899:1: ( rule__HttpPut__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1899:2: rule__HttpPut__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpPut__NameAssignment_1_in_rule__HttpPut__Group__1__Impl3942);
            rule__HttpPut__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpPutAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__1__Impl"


    // $ANTLR start "rule__HttpPut__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1909:1: rule__HttpPut__Group__2 : rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3 ;
    public final void rule__HttpPut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1913:1: ( rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1914:2: rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__2__Impl_in_rule__HttpPut__Group__23972);
            rule__HttpPut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__3_in_rule__HttpPut__Group__23975);
            rule__HttpPut__Group__3();

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
    // $ANTLR end "rule__HttpPut__Group__2"


    // $ANTLR start "rule__HttpPut__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1921:1: rule__HttpPut__Group__2__Impl : ( ( rule__HttpPut__PathAssignment_2 )? ) ;
    public final void rule__HttpPut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1925:1: ( ( ( rule__HttpPut__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1926:1: ( ( rule__HttpPut__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1926:1: ( ( rule__HttpPut__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1927:1: ( rule__HttpPut__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpPutAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1928:1: ( rule__HttpPut__PathAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1928:2: rule__HttpPut__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpPut__PathAssignment_2_in_rule__HttpPut__Group__2__Impl4002);
                    rule__HttpPut__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPutAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__2__Impl"


    // $ANTLR start "rule__HttpPut__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1938:1: rule__HttpPut__Group__3 : rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4 ;
    public final void rule__HttpPut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1942:1: ( rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1943:2: rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__3__Impl_in_rule__HttpPut__Group__34033);
            rule__HttpPut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__4_in_rule__HttpPut__Group__34036);
            rule__HttpPut__Group__4();

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
    // $ANTLR end "rule__HttpPut__Group__3"


    // $ANTLR start "rule__HttpPut__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1950:1: rule__HttpPut__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpPut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1954:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1955:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1955:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1956:1: '{'
            {
             before(grammarAccess.getHttpPutAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpPut__Group__3__Impl4064); 
             after(grammarAccess.getHttpPutAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__3__Impl"


    // $ANTLR start "rule__HttpPut__Group__4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1969:1: rule__HttpPut__Group__4 : rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5 ;
    public final void rule__HttpPut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1973:1: ( rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1974:2: rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__4__Impl_in_rule__HttpPut__Group__44095);
            rule__HttpPut__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__5_in_rule__HttpPut__Group__44098);
            rule__HttpPut__Group__5();

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
    // $ANTLR end "rule__HttpPut__Group__4"


    // $ANTLR start "rule__HttpPut__Group__4__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1981:1: rule__HttpPut__Group__4__Impl : ( ( rule__HttpPut__ParamsAssignment_4 )? ) ;
    public final void rule__HttpPut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1985:1: ( ( ( rule__HttpPut__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1986:1: ( ( rule__HttpPut__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1986:1: ( ( rule__HttpPut__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1987:1: ( rule__HttpPut__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpPutAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1988:1: ( rule__HttpPut__ParamsAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1988:2: rule__HttpPut__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpPut__ParamsAssignment_4_in_rule__HttpPut__Group__4__Impl4125);
                    rule__HttpPut__ParamsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPutAccess().getParamsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__4__Impl"


    // $ANTLR start "rule__HttpPut__Group__5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1998:1: rule__HttpPut__Group__5 : rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6 ;
    public final void rule__HttpPut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2002:1: ( rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2003:2: rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__5__Impl_in_rule__HttpPut__Group__54156);
            rule__HttpPut__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__6_in_rule__HttpPut__Group__54159);
            rule__HttpPut__Group__6();

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
    // $ANTLR end "rule__HttpPut__Group__5"


    // $ANTLR start "rule__HttpPut__Group__5__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2010:1: rule__HttpPut__Group__5__Impl : ( ( rule__HttpPut__BodyAssignment_5 )? ) ;
    public final void rule__HttpPut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2014:1: ( ( ( rule__HttpPut__BodyAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2015:1: ( ( rule__HttpPut__BodyAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2015:1: ( ( rule__HttpPut__BodyAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2016:1: ( rule__HttpPut__BodyAssignment_5 )?
            {
             before(grammarAccess.getHttpPutAccess().getBodyAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2017:1: ( rule__HttpPut__BodyAssignment_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2017:2: rule__HttpPut__BodyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpPut__BodyAssignment_5_in_rule__HttpPut__Group__5__Impl4186);
                    rule__HttpPut__BodyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPutAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__5__Impl"


    // $ANTLR start "rule__HttpPut__Group__6"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2027:1: rule__HttpPut__Group__6 : rule__HttpPut__Group__6__Impl rule__HttpPut__Group__7 ;
    public final void rule__HttpPut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2031:1: ( rule__HttpPut__Group__6__Impl rule__HttpPut__Group__7 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2032:2: rule__HttpPut__Group__6__Impl rule__HttpPut__Group__7
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__6__Impl_in_rule__HttpPut__Group__64217);
            rule__HttpPut__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__7_in_rule__HttpPut__Group__64220);
            rule__HttpPut__Group__7();

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
    // $ANTLR end "rule__HttpPut__Group__6"


    // $ANTLR start "rule__HttpPut__Group__6__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2039:1: rule__HttpPut__Group__6__Impl : ( ( rule__HttpPut__ResponseAssignment_6 )? ) ;
    public final void rule__HttpPut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2043:1: ( ( ( rule__HttpPut__ResponseAssignment_6 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2044:1: ( ( rule__HttpPut__ResponseAssignment_6 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2044:1: ( ( rule__HttpPut__ResponseAssignment_6 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2045:1: ( rule__HttpPut__ResponseAssignment_6 )?
            {
             before(grammarAccess.getHttpPutAccess().getResponseAssignment_6()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2046:1: ( rule__HttpPut__ResponseAssignment_6 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2046:2: rule__HttpPut__ResponseAssignment_6
                    {
                    pushFollow(FOLLOW_rule__HttpPut__ResponseAssignment_6_in_rule__HttpPut__Group__6__Impl4247);
                    rule__HttpPut__ResponseAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpPutAccess().getResponseAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__6__Impl"


    // $ANTLR start "rule__HttpPut__Group__7"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2056:1: rule__HttpPut__Group__7 : rule__HttpPut__Group__7__Impl ;
    public final void rule__HttpPut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2060:1: ( rule__HttpPut__Group__7__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2061:2: rule__HttpPut__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__7__Impl_in_rule__HttpPut__Group__74278);
            rule__HttpPut__Group__7__Impl();

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
    // $ANTLR end "rule__HttpPut__Group__7"


    // $ANTLR start "rule__HttpPut__Group__7__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2067:1: rule__HttpPut__Group__7__Impl : ( '}' ) ;
    public final void rule__HttpPut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2071:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2072:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2072:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2073:1: '}'
            {
             before(grammarAccess.getHttpPutAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__HttpPut__Group__7__Impl4306); 
             after(grammarAccess.getHttpPutAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__Group__7__Impl"


    // $ANTLR start "rule__HttpGet__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2102:1: rule__HttpGet__Group__0 : rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1 ;
    public final void rule__HttpGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2106:1: ( rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2107:2: rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__0__Impl_in_rule__HttpGet__Group__04353);
            rule__HttpGet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__1_in_rule__HttpGet__Group__04356);
            rule__HttpGet__Group__1();

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
    // $ANTLR end "rule__HttpGet__Group__0"


    // $ANTLR start "rule__HttpGet__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2114:1: rule__HttpGet__Group__0__Impl : ( 'get' ) ;
    public final void rule__HttpGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2118:1: ( ( 'get' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2119:1: ( 'get' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2119:1: ( 'get' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2120:1: 'get'
            {
             before(grammarAccess.getHttpGetAccess().getGetKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__HttpGet__Group__0__Impl4384); 
             after(grammarAccess.getHttpGetAccess().getGetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__0__Impl"


    // $ANTLR start "rule__HttpGet__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2133:1: rule__HttpGet__Group__1 : rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2 ;
    public final void rule__HttpGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2137:1: ( rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2138:2: rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__1__Impl_in_rule__HttpGet__Group__14415);
            rule__HttpGet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__2_in_rule__HttpGet__Group__14418);
            rule__HttpGet__Group__2();

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
    // $ANTLR end "rule__HttpGet__Group__1"


    // $ANTLR start "rule__HttpGet__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2145:1: rule__HttpGet__Group__1__Impl : ( ( rule__HttpGet__NameAssignment_1 ) ) ;
    public final void rule__HttpGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2149:1: ( ( ( rule__HttpGet__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2150:1: ( ( rule__HttpGet__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2150:1: ( ( rule__HttpGet__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2151:1: ( rule__HttpGet__NameAssignment_1 )
            {
             before(grammarAccess.getHttpGetAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2152:1: ( rule__HttpGet__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2152:2: rule__HttpGet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpGet__NameAssignment_1_in_rule__HttpGet__Group__1__Impl4445);
            rule__HttpGet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpGetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__1__Impl"


    // $ANTLR start "rule__HttpGet__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2162:1: rule__HttpGet__Group__2 : rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3 ;
    public final void rule__HttpGet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2166:1: ( rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2167:2: rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__2__Impl_in_rule__HttpGet__Group__24475);
            rule__HttpGet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__3_in_rule__HttpGet__Group__24478);
            rule__HttpGet__Group__3();

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
    // $ANTLR end "rule__HttpGet__Group__2"


    // $ANTLR start "rule__HttpGet__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2174:1: rule__HttpGet__Group__2__Impl : ( ( rule__HttpGet__PathAssignment_2 )? ) ;
    public final void rule__HttpGet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2178:1: ( ( ( rule__HttpGet__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2179:1: ( ( rule__HttpGet__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2179:1: ( ( rule__HttpGet__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2180:1: ( rule__HttpGet__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpGetAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2181:1: ( rule__HttpGet__PathAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2181:2: rule__HttpGet__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpGet__PathAssignment_2_in_rule__HttpGet__Group__2__Impl4505);
                    rule__HttpGet__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpGetAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__2__Impl"


    // $ANTLR start "rule__HttpGet__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2191:1: rule__HttpGet__Group__3 : rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4 ;
    public final void rule__HttpGet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2195:1: ( rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2196:2: rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__3__Impl_in_rule__HttpGet__Group__34536);
            rule__HttpGet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__4_in_rule__HttpGet__Group__34539);
            rule__HttpGet__Group__4();

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
    // $ANTLR end "rule__HttpGet__Group__3"


    // $ANTLR start "rule__HttpGet__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2203:1: rule__HttpGet__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpGet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2207:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2208:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2208:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2209:1: '{'
            {
             before(grammarAccess.getHttpGetAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpGet__Group__3__Impl4567); 
             after(grammarAccess.getHttpGetAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__3__Impl"


    // $ANTLR start "rule__HttpGet__Group__4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2222:1: rule__HttpGet__Group__4 : rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5 ;
    public final void rule__HttpGet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2226:1: ( rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2227:2: rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__4__Impl_in_rule__HttpGet__Group__44598);
            rule__HttpGet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__5_in_rule__HttpGet__Group__44601);
            rule__HttpGet__Group__5();

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
    // $ANTLR end "rule__HttpGet__Group__4"


    // $ANTLR start "rule__HttpGet__Group__4__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2234:1: rule__HttpGet__Group__4__Impl : ( ( rule__HttpGet__ParamsAssignment_4 )? ) ;
    public final void rule__HttpGet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2238:1: ( ( ( rule__HttpGet__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2239:1: ( ( rule__HttpGet__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2239:1: ( ( rule__HttpGet__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2240:1: ( rule__HttpGet__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpGetAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2241:1: ( rule__HttpGet__ParamsAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2241:2: rule__HttpGet__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpGet__ParamsAssignment_4_in_rule__HttpGet__Group__4__Impl4628);
                    rule__HttpGet__ParamsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpGetAccess().getParamsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__4__Impl"


    // $ANTLR start "rule__HttpGet__Group__5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2251:1: rule__HttpGet__Group__5 : rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6 ;
    public final void rule__HttpGet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2255:1: ( rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2256:2: rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__5__Impl_in_rule__HttpGet__Group__54659);
            rule__HttpGet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__6_in_rule__HttpGet__Group__54662);
            rule__HttpGet__Group__6();

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
    // $ANTLR end "rule__HttpGet__Group__5"


    // $ANTLR start "rule__HttpGet__Group__5__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2263:1: rule__HttpGet__Group__5__Impl : ( ( rule__HttpGet__ResponseAssignment_5 )? ) ;
    public final void rule__HttpGet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2267:1: ( ( ( rule__HttpGet__ResponseAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2268:1: ( ( rule__HttpGet__ResponseAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2268:1: ( ( rule__HttpGet__ResponseAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2269:1: ( rule__HttpGet__ResponseAssignment_5 )?
            {
             before(grammarAccess.getHttpGetAccess().getResponseAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2270:1: ( rule__HttpGet__ResponseAssignment_5 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2270:2: rule__HttpGet__ResponseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpGet__ResponseAssignment_5_in_rule__HttpGet__Group__5__Impl4689);
                    rule__HttpGet__ResponseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpGetAccess().getResponseAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__5__Impl"


    // $ANTLR start "rule__HttpGet__Group__6"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2280:1: rule__HttpGet__Group__6 : rule__HttpGet__Group__6__Impl ;
    public final void rule__HttpGet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2284:1: ( rule__HttpGet__Group__6__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2285:2: rule__HttpGet__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__6__Impl_in_rule__HttpGet__Group__64720);
            rule__HttpGet__Group__6__Impl();

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
    // $ANTLR end "rule__HttpGet__Group__6"


    // $ANTLR start "rule__HttpGet__Group__6__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2291:1: rule__HttpGet__Group__6__Impl : ( '}' ) ;
    public final void rule__HttpGet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2295:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2296:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2296:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2297:1: '}'
            {
             before(grammarAccess.getHttpGetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__HttpGet__Group__6__Impl4748); 
             after(grammarAccess.getHttpGetAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__Group__6__Impl"


    // $ANTLR start "rule__HttpDelete__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2324:1: rule__HttpDelete__Group__0 : rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1 ;
    public final void rule__HttpDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2328:1: ( rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2329:2: rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__0__Impl_in_rule__HttpDelete__Group__04793);
            rule__HttpDelete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__1_in_rule__HttpDelete__Group__04796);
            rule__HttpDelete__Group__1();

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
    // $ANTLR end "rule__HttpDelete__Group__0"


    // $ANTLR start "rule__HttpDelete__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2336:1: rule__HttpDelete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__HttpDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2340:1: ( ( 'delete' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2341:1: ( 'delete' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2341:1: ( 'delete' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2342:1: 'delete'
            {
             before(grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__HttpDelete__Group__0__Impl4824); 
             after(grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__0__Impl"


    // $ANTLR start "rule__HttpDelete__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2355:1: rule__HttpDelete__Group__1 : rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2 ;
    public final void rule__HttpDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2359:1: ( rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2360:2: rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__1__Impl_in_rule__HttpDelete__Group__14855);
            rule__HttpDelete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__2_in_rule__HttpDelete__Group__14858);
            rule__HttpDelete__Group__2();

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
    // $ANTLR end "rule__HttpDelete__Group__1"


    // $ANTLR start "rule__HttpDelete__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2367:1: rule__HttpDelete__Group__1__Impl : ( ( rule__HttpDelete__NameAssignment_1 ) ) ;
    public final void rule__HttpDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2371:1: ( ( ( rule__HttpDelete__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2372:1: ( ( rule__HttpDelete__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2372:1: ( ( rule__HttpDelete__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2373:1: ( rule__HttpDelete__NameAssignment_1 )
            {
             before(grammarAccess.getHttpDeleteAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2374:1: ( rule__HttpDelete__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2374:2: rule__HttpDelete__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpDelete__NameAssignment_1_in_rule__HttpDelete__Group__1__Impl4885);
            rule__HttpDelete__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpDeleteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__1__Impl"


    // $ANTLR start "rule__HttpDelete__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2384:1: rule__HttpDelete__Group__2 : rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3 ;
    public final void rule__HttpDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2388:1: ( rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2389:2: rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__2__Impl_in_rule__HttpDelete__Group__24915);
            rule__HttpDelete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__3_in_rule__HttpDelete__Group__24918);
            rule__HttpDelete__Group__3();

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
    // $ANTLR end "rule__HttpDelete__Group__2"


    // $ANTLR start "rule__HttpDelete__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2396:1: rule__HttpDelete__Group__2__Impl : ( ( rule__HttpDelete__PathAssignment_2 )? ) ;
    public final void rule__HttpDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2400:1: ( ( ( rule__HttpDelete__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2401:1: ( ( rule__HttpDelete__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2401:1: ( ( rule__HttpDelete__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2402:1: ( rule__HttpDelete__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpDeleteAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2403:1: ( rule__HttpDelete__PathAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2403:2: rule__HttpDelete__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpDelete__PathAssignment_2_in_rule__HttpDelete__Group__2__Impl4945);
                    rule__HttpDelete__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpDeleteAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__2__Impl"


    // $ANTLR start "rule__HttpDelete__Group__3"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2413:1: rule__HttpDelete__Group__3 : rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4 ;
    public final void rule__HttpDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2417:1: ( rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2418:2: rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__3__Impl_in_rule__HttpDelete__Group__34976);
            rule__HttpDelete__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__4_in_rule__HttpDelete__Group__34979);
            rule__HttpDelete__Group__4();

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
    // $ANTLR end "rule__HttpDelete__Group__3"


    // $ANTLR start "rule__HttpDelete__Group__3__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2425:1: rule__HttpDelete__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2429:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2430:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2430:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2431:1: '{'
            {
             before(grammarAccess.getHttpDeleteAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpDelete__Group__3__Impl5007); 
             after(grammarAccess.getHttpDeleteAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__3__Impl"


    // $ANTLR start "rule__HttpDelete__Group__4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2444:1: rule__HttpDelete__Group__4 : rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5 ;
    public final void rule__HttpDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2448:1: ( rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2449:2: rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__4__Impl_in_rule__HttpDelete__Group__45038);
            rule__HttpDelete__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__5_in_rule__HttpDelete__Group__45041);
            rule__HttpDelete__Group__5();

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
    // $ANTLR end "rule__HttpDelete__Group__4"


    // $ANTLR start "rule__HttpDelete__Group__4__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2456:1: rule__HttpDelete__Group__4__Impl : ( ( rule__HttpDelete__ParamsAssignment_4 )? ) ;
    public final void rule__HttpDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2460:1: ( ( ( rule__HttpDelete__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2461:1: ( ( rule__HttpDelete__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2461:1: ( ( rule__HttpDelete__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2462:1: ( rule__HttpDelete__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpDeleteAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2463:1: ( rule__HttpDelete__ParamsAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2463:2: rule__HttpDelete__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpDelete__ParamsAssignment_4_in_rule__HttpDelete__Group__4__Impl5068);
                    rule__HttpDelete__ParamsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpDeleteAccess().getParamsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__4__Impl"


    // $ANTLR start "rule__HttpDelete__Group__5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2473:1: rule__HttpDelete__Group__5 : rule__HttpDelete__Group__5__Impl rule__HttpDelete__Group__6 ;
    public final void rule__HttpDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2477:1: ( rule__HttpDelete__Group__5__Impl rule__HttpDelete__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2478:2: rule__HttpDelete__Group__5__Impl rule__HttpDelete__Group__6
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__5__Impl_in_rule__HttpDelete__Group__55099);
            rule__HttpDelete__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__6_in_rule__HttpDelete__Group__55102);
            rule__HttpDelete__Group__6();

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
    // $ANTLR end "rule__HttpDelete__Group__5"


    // $ANTLR start "rule__HttpDelete__Group__5__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2485:1: rule__HttpDelete__Group__5__Impl : ( ( rule__HttpDelete__ResponseAssignment_5 )? ) ;
    public final void rule__HttpDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2489:1: ( ( ( rule__HttpDelete__ResponseAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2490:1: ( ( rule__HttpDelete__ResponseAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2490:1: ( ( rule__HttpDelete__ResponseAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2491:1: ( rule__HttpDelete__ResponseAssignment_5 )?
            {
             before(grammarAccess.getHttpDeleteAccess().getResponseAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2492:1: ( rule__HttpDelete__ResponseAssignment_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2492:2: rule__HttpDelete__ResponseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpDelete__ResponseAssignment_5_in_rule__HttpDelete__Group__5__Impl5129);
                    rule__HttpDelete__ResponseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpDeleteAccess().getResponseAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__5__Impl"


    // $ANTLR start "rule__HttpDelete__Group__6"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2502:1: rule__HttpDelete__Group__6 : rule__HttpDelete__Group__6__Impl ;
    public final void rule__HttpDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2506:1: ( rule__HttpDelete__Group__6__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2507:2: rule__HttpDelete__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__6__Impl_in_rule__HttpDelete__Group__65160);
            rule__HttpDelete__Group__6__Impl();

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
    // $ANTLR end "rule__HttpDelete__Group__6"


    // $ANTLR start "rule__HttpDelete__Group__6__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2513:1: rule__HttpDelete__Group__6__Impl : ( '}' ) ;
    public final void rule__HttpDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2517:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2518:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2518:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2519:1: '}'
            {
             before(grammarAccess.getHttpDeleteAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__HttpDelete__Group__6__Impl5188); 
             after(grammarAccess.getHttpDeleteAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__Group__6__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2546:1: rule__ParamsBlock__Group__0 : rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 ;
    public final void rule__ParamsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2550:1: ( rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2551:2: rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05233);
            rule__ParamsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05236);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2558:1: rule__ParamsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ParamsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2562:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2563:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2563:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2564:1: ()
            {
             before(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2565:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2567:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2577:1: rule__ParamsBlock__Group__1 : rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 ;
    public final void rule__ParamsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2581:1: ( rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2582:2: rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15294);
            rule__ParamsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15297);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2589:1: rule__ParamsBlock__Group__1__Impl : ( 'params' ) ;
    public final void rule__ParamsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2593:1: ( ( 'params' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2594:1: ( 'params' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2594:1: ( 'params' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2595:1: 'params'
            {
             before(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ParamsBlock__Group__1__Impl5325); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2608:1: rule__ParamsBlock__Group__2 : rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 ;
    public final void rule__ParamsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2612:1: ( rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2613:2: rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25356);
            rule__ParamsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25359);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2620:1: rule__ParamsBlock__Group__2__Impl : ( ( rule__ParamsBlock__ParamsAssignment_2 )* ) ;
    public final void rule__ParamsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2624:1: ( ( ( rule__ParamsBlock__ParamsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2625:1: ( ( rule__ParamsBlock__ParamsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2625:1: ( ( rule__ParamsBlock__ParamsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2626:1: ( rule__ParamsBlock__ParamsAssignment_2 )*
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2627:1: ( rule__ParamsBlock__ParamsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2627:2: rule__ParamsBlock__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5386);
            	    rule__ParamsBlock__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2637:1: rule__ParamsBlock__Group__3 : rule__ParamsBlock__Group__3__Impl ;
    public final void rule__ParamsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2641:1: ( rule__ParamsBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2642:2: rule__ParamsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35417);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2648:1: rule__ParamsBlock__Group__3__Impl : ( ( rule__ParamsBlock__Group_3__0 )* ) ;
    public final void rule__ParamsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2652:1: ( ( ( rule__ParamsBlock__Group_3__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2653:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2653:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2654:1: ( rule__ParamsBlock__Group_3__0 )*
            {
             before(grammarAccess.getParamsBlockAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2655:1: ( rule__ParamsBlock__Group_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2655:2: rule__ParamsBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5444);
            	    rule__ParamsBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2673:1: rule__ParamsBlock__Group_3__0 : rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 ;
    public final void rule__ParamsBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2677:1: ( rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2678:2: rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05483);
            rule__ParamsBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05486);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2685:1: rule__ParamsBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParamsBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2689:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2690:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2690:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2691:1: ','
            {
             before(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__ParamsBlock__Group_3__0__Impl5514); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2704:1: rule__ParamsBlock__Group_3__1 : rule__ParamsBlock__Group_3__1__Impl ;
    public final void rule__ParamsBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2708:1: ( rule__ParamsBlock__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2709:2: rule__ParamsBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15545);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2715:1: rule__ParamsBlock__Group_3__1__Impl : ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) ;
    public final void rule__ParamsBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2719:1: ( ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2720:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2720:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2721:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2722:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2722:2: rule__ParamsBlock__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5572);
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


    // $ANTLR start "rule__BodyBlock__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2736:1: rule__BodyBlock__Group__0 : rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 ;
    public final void rule__BodyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2740:1: ( rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2741:2: rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05606);
            rule__BodyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05609);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2748:1: rule__BodyBlock__Group__0__Impl : ( 'body' ) ;
    public final void rule__BodyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2752:1: ( ( 'body' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2753:1: ( 'body' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2753:1: ( 'body' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2754:1: 'body'
            {
             before(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__BodyBlock__Group__0__Impl5637); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2767:1: rule__BodyBlock__Group__1 : rule__BodyBlock__Group__1__Impl ;
    public final void rule__BodyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2771:1: ( rule__BodyBlock__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2772:2: rule__BodyBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15668);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2778:1: rule__BodyBlock__Group__1__Impl : ( ( rule__BodyBlock__TypeAssignment_1 ) ) ;
    public final void rule__BodyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2782:1: ( ( ( rule__BodyBlock__TypeAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2783:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2783:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2784:1: ( rule__BodyBlock__TypeAssignment_1 )
            {
             before(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2785:1: ( rule__BodyBlock__TypeAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2785:2: rule__BodyBlock__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5695);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2799:1: rule__ResponseBlock__Group__0 : rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 ;
    public final void rule__ResponseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2803:1: ( rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2804:2: rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05729);
            rule__ResponseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05732);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2811:1: rule__ResponseBlock__Group__0__Impl : ( () ) ;
    public final void rule__ResponseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2815:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2816:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2816:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2817:1: ()
            {
             before(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2818:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2820:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2830:1: rule__ResponseBlock__Group__1 : rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 ;
    public final void rule__ResponseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2834:1: ( rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2835:2: rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15790);
            rule__ResponseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15793);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2842:1: rule__ResponseBlock__Group__1__Impl : ( 'response' ) ;
    public final void rule__ResponseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2846:1: ( ( 'response' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2847:1: ( 'response' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2847:1: ( 'response' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2848:1: 'response'
            {
             before(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ResponseBlock__Group__1__Impl5821); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2861:1: rule__ResponseBlock__Group__2 : rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 ;
    public final void rule__ResponseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2865:1: ( rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2866:2: rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__25852);
            rule__ResponseBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__25855);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2873:1: rule__ResponseBlock__Group__2__Impl : ( ( rule__ResponseBlock__Group_2__0 )? ) ;
    public final void rule__ResponseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2877:1: ( ( ( rule__ResponseBlock__Group_2__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2878:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2878:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2879:1: ( rule__ResponseBlock__Group_2__0 )?
            {
             before(grammarAccess.getResponseBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2880:1: ( rule__ResponseBlock__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2880:2: rule__ResponseBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl5882);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2890:1: rule__ResponseBlock__Group__3 : rule__ResponseBlock__Group__3__Impl ;
    public final void rule__ResponseBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2894:1: ( rule__ResponseBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2895:2: rule__ResponseBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__35913);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2901:1: rule__ResponseBlock__Group__3__Impl : ( ( rule__ResponseBlock__TypeAssignment_3 )? ) ;
    public final void rule__ResponseBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2905:1: ( ( ( rule__ResponseBlock__TypeAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2906:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2906:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2907:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            {
             before(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2908:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==13||(LA34_0>=31 && LA34_0<=35)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2908:2: rule__ResponseBlock__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl5940);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2926:1: rule__ResponseBlock__Group_2__0 : rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 ;
    public final void rule__ResponseBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2930:1: ( rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2931:2: rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__05979);
            rule__ResponseBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__05982);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2938:1: rule__ResponseBlock__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ResponseBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2942:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2943:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2943:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2944:1: 'extends'
            {
             before(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ResponseBlock__Group_2__0__Impl6010); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2957:1: rule__ResponseBlock__Group_2__1 : rule__ResponseBlock__Group_2__1__Impl ;
    public final void rule__ResponseBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2961:1: ( rule__ResponseBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2962:2: rule__ResponseBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16041);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2968:1: rule__ResponseBlock__Group_2__1__Impl : ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__ResponseBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2972:1: ( ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2973:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2973:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2974:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2975:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2975:2: rule__ResponseBlock__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6068);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2989:1: rule__TypedMember__Group__0 : rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 ;
    public final void rule__TypedMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2993:1: ( rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2994:2: rule__TypedMember__Group__0__Impl rule__TypedMember__Group__1
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__06102);
            rule__TypedMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__06105);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3001:1: rule__TypedMember__Group__0__Impl : ( ( rule__TypedMember__NameAssignment_0 ) ) ;
    public final void rule__TypedMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3005:1: ( ( ( rule__TypedMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3006:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3006:1: ( ( rule__TypedMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3007:1: ( rule__TypedMember__NameAssignment_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3008:1: ( rule__TypedMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3008:2: rule__TypedMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl6132);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3018:1: rule__TypedMember__Group__1 : rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 ;
    public final void rule__TypedMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3022:1: ( rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3023:2: rule__TypedMember__Group__1__Impl rule__TypedMember__Group__2
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__16162);
            rule__TypedMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__16165);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3030:1: rule__TypedMember__Group__1__Impl : ( ':' ) ;
    public final void rule__TypedMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3034:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3035:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3035:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3036:1: ':'
            {
             before(grammarAccess.getTypedMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__TypedMember__Group__1__Impl6193); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3049:1: rule__TypedMember__Group__2 : rule__TypedMember__Group__2__Impl ;
    public final void rule__TypedMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3053:1: ( rule__TypedMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3054:2: rule__TypedMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__26224);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3060:1: rule__TypedMember__Group__2__Impl : ( ( rule__TypedMember__TypeAssignment_2 ) ) ;
    public final void rule__TypedMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3064:1: ( ( ( rule__TypedMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3065:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3065:1: ( ( rule__TypedMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3066:1: ( rule__TypedMember__TypeAssignment_2 )
            {
             before(grammarAccess.getTypedMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3067:1: ( rule__TypedMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3067:2: rule__TypedMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl6251);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3083:1: rule__SkipMember__Group__0 : rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 ;
    public final void rule__SkipMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3087:1: ( rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3088:2: rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__06287);
            rule__SkipMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__06290);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3095:1: rule__SkipMember__Group__0__Impl : ( ( rule__SkipMember__NameAssignment_0 ) ) ;
    public final void rule__SkipMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3099:1: ( ( ( rule__SkipMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3100:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3100:1: ( ( rule__SkipMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3101:1: ( rule__SkipMember__NameAssignment_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3102:1: ( rule__SkipMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3102:2: rule__SkipMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl6317);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3112:1: rule__SkipMember__Group__1 : rule__SkipMember__Group__1__Impl ;
    public final void rule__SkipMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3116:1: ( rule__SkipMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3117:2: rule__SkipMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__16347);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3123:1: rule__SkipMember__Group__1__Impl : ( ( rule__SkipMember__LiteralAssignment_1 ) ) ;
    public final void rule__SkipMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3127:1: ( ( ( rule__SkipMember__LiteralAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3128:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3128:1: ( ( rule__SkipMember__LiteralAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3129:1: ( rule__SkipMember__LiteralAssignment_1 )
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3130:1: ( rule__SkipMember__LiteralAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3130:2: rule__SkipMember__LiteralAssignment_1
            {
            pushFollow(FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl6374);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3144:1: rule__SimpleMember__Group__0 : rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 ;
    public final void rule__SimpleMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3148:1: ( rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3149:2: rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__06408);
            rule__SimpleMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__06411);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3156:1: rule__SimpleMember__Group__0__Impl : ( ( rule__SimpleMember__NameAssignment_0 ) ) ;
    public final void rule__SimpleMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3160:1: ( ( ( rule__SimpleMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3161:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3161:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3162:1: ( rule__SimpleMember__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3163:1: ( rule__SimpleMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3163:2: rule__SimpleMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl6438);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3173:1: rule__SimpleMember__Group__1 : rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 ;
    public final void rule__SimpleMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3177:1: ( rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3178:2: rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__16468);
            rule__SimpleMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__16471);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3185:1: rule__SimpleMember__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3189:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3190:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3190:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3191:1: ':'
            {
             before(grammarAccess.getSimpleMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__SimpleMember__Group__1__Impl6499); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3204:1: rule__SimpleMember__Group__2 : rule__SimpleMember__Group__2__Impl ;
    public final void rule__SimpleMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3208:1: ( rule__SimpleMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3209:2: rule__SimpleMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__26530);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3215:1: rule__SimpleMember__Group__2__Impl : ( ( rule__SimpleMember__TypeAssignment_2 ) ) ;
    public final void rule__SimpleMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3219:1: ( ( ( rule__SimpleMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3220:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3220:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3221:1: ( rule__SimpleMember__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3222:1: ( rule__SimpleMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3222:2: rule__SimpleMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl6557);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3238:1: rule__GenericListType__Group__0 : rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 ;
    public final void rule__GenericListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3242:1: ( rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3243:2: rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__06593);
            rule__GenericListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__06596);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3250:1: rule__GenericListType__Group__0__Impl : ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) ;
    public final void rule__GenericListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3254:1: ( ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3255:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3255:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3256:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3257:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3257:2: rule__GenericListType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl6623);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3267:1: rule__GenericListType__Group__1 : rule__GenericListType__Group__1__Impl ;
    public final void rule__GenericListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3271:1: ( rule__GenericListType__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3272:2: rule__GenericListType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__16653);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3278:1: rule__GenericListType__Group__1__Impl : ( ( rule__GenericListType__IdAssignment_1 ) ) ;
    public final void rule__GenericListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3282:1: ( ( ( rule__GenericListType__IdAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3283:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3283:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3284:1: ( rule__GenericListType__IdAssignment_1 )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3285:1: ( rule__GenericListType__IdAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3285:2: rule__GenericListType__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl6680);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3299:1: rule__ComplexTypeDeclaration__Group__0 : rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 ;
    public final void rule__ComplexTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3303:1: ( rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3304:2: rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__06714);
            rule__ComplexTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__06717);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3311:1: rule__ComplexTypeDeclaration__Group__0__Impl : ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3315:1: ( ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3316:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3316:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3317:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3318:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3318:2: rule__ComplexTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl6744);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3328:1: rule__ComplexTypeDeclaration__Group__1 : rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 ;
    public final void rule__ComplexTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3332:1: ( rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3333:2: rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__16774);
            rule__ComplexTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__16777);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3340:1: rule__ComplexTypeDeclaration__Group__1__Impl : ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3344:1: ( ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3345:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3345:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3346:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3347:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3347:2: rule__ComplexTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl6804);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3357:1: rule__ComplexTypeDeclaration__Group__2 : rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 ;
    public final void rule__ComplexTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3361:1: ( rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3362:2: rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__26835);
            rule__ComplexTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__26838);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3369:1: rule__ComplexTypeDeclaration__Group__2__Impl : ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3373:1: ( ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3374:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3374:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3375:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3376:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3376:2: rule__ComplexTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl6865);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3386:1: rule__ComplexTypeDeclaration__Group__3 : rule__ComplexTypeDeclaration__Group__3__Impl ;
    public final void rule__ComplexTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3390:1: ( rule__ComplexTypeDeclaration__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3391:2: rule__ComplexTypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__36895);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3397:1: rule__ComplexTypeDeclaration__Group__3__Impl : ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3401:1: ( ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3402:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3402:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3403:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3404:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3404:2: rule__ComplexTypeDeclaration__LiteralAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl6922);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3422:1: rule__EnumTypeDeclaration__Group__0 : rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 ;
    public final void rule__EnumTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3426:1: ( rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3427:2: rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__06961);
            rule__EnumTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__06964);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3434:1: rule__EnumTypeDeclaration__Group__0__Impl : ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3438:1: ( ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3439:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3439:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3440:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3441:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3441:2: rule__EnumTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl6991);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3451:1: rule__EnumTypeDeclaration__Group__1 : rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 ;
    public final void rule__EnumTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3455:1: ( rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3456:2: rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17021);
            rule__EnumTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17024);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3463:1: rule__EnumTypeDeclaration__Group__1__Impl : ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3467:1: ( ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3468:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3468:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3469:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3470:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3470:2: rule__EnumTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7051);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3480:1: rule__EnumTypeDeclaration__Group__2 : rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 ;
    public final void rule__EnumTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3484:1: ( rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3485:2: rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27082);
            rule__EnumTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27085);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3492:1: rule__EnumTypeDeclaration__Group__2__Impl : ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3496:1: ( ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3497:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3497:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3498:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3499:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3499:2: rule__EnumTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7112);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3509:1: rule__EnumTypeDeclaration__Group__3 : rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 ;
    public final void rule__EnumTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3513:1: ( rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3514:2: rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37142);
            rule__EnumTypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37145);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3521:1: rule__EnumTypeDeclaration__Group__3__Impl : ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3525:1: ( ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3526:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3526:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3527:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3528:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3528:2: rule__EnumTypeDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7172);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3538:1: rule__EnumTypeDeclaration__Group__4 : rule__EnumTypeDeclaration__Group__4__Impl ;
    public final void rule__EnumTypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3542:1: ( rule__EnumTypeDeclaration__Group__4__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3543:2: rule__EnumTypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47203);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3549:1: rule__EnumTypeDeclaration__Group__4__Impl : ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3553:1: ( ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3554:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3554:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3555:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3556:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3556:2: rule__EnumTypeDeclaration__LiteralAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7230);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3576:1: rule__EnumTypeDeclaration__Group_3__0 : rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 ;
    public final void rule__EnumTypeDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3580:1: ( rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3581:2: rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07271);
            rule__EnumTypeDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07274);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3588:1: rule__EnumTypeDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EnumTypeDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3592:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3593:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3593:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3594:1: 'extends'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumTypeDeclaration__Group_3__0__Impl7302); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3607:1: rule__EnumTypeDeclaration__Group_3__1 : rule__EnumTypeDeclaration__Group_3__1__Impl ;
    public final void rule__EnumTypeDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3611:1: ( rule__EnumTypeDeclaration__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3612:2: rule__EnumTypeDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17333);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3618:1: rule__EnumTypeDeclaration__Group_3__1__Impl : ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3622:1: ( ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3623:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3623:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3624:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3625:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3625:2: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7360);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3639:1: rule__EnumTypeLiteral__Group__0 : rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 ;
    public final void rule__EnumTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3643:1: ( rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3644:2: rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07394);
            rule__EnumTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07397);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3651:1: rule__EnumTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3655:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3656:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3656:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3657:1: '{'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__EnumTypeLiteral__Group__0__Impl7425); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3670:1: rule__EnumTypeLiteral__Group__1 : rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 ;
    public final void rule__EnumTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3674:1: ( rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3675:2: rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__17456);
            rule__EnumTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__17459);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3682:1: rule__EnumTypeLiteral__Group__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3686:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3687:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3687:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3688:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3689:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3689:2: rule__EnumTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl7486);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3699:1: rule__EnumTypeLiteral__Group__2 : rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 ;
    public final void rule__EnumTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3703:1: ( rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3704:2: rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__27516);
            rule__EnumTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__27519);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3711:1: rule__EnumTypeLiteral__Group__2__Impl : ( ( rule__EnumTypeLiteral__Group_2__0 )* ) ;
    public final void rule__EnumTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3715:1: ( ( ( rule__EnumTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3716:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3716:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3717:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3718:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3718:2: rule__EnumTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl7546);
            	    rule__EnumTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3728:1: rule__EnumTypeLiteral__Group__3 : rule__EnumTypeLiteral__Group__3__Impl ;
    public final void rule__EnumTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3732:1: ( rule__EnumTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3733:2: rule__EnumTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__37577);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3739:1: rule__EnumTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3743:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3744:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3744:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3745:1: '}'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__EnumTypeLiteral__Group__3__Impl7605); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3766:1: rule__EnumTypeLiteral__Group_2__0 : rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 ;
    public final void rule__EnumTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3770:1: ( rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3771:2: rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__07644);
            rule__EnumTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__07647);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3778:1: rule__EnumTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3782:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3783:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3783:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3784:1: ','
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__EnumTypeLiteral__Group_2__0__Impl7675); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3797:1: rule__EnumTypeLiteral__Group_2__1 : rule__EnumTypeLiteral__Group_2__1__Impl ;
    public final void rule__EnumTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3801:1: ( rule__EnumTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3802:2: rule__EnumTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__17706);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3808:1: rule__EnumTypeLiteral__Group_2__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3812:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3813:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3813:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3814:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3815:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3815:2: rule__EnumTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl7733);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3829:1: rule__EnumMember__Group__0 : rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3833:1: ( rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3834:2: rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__07767);
            rule__EnumMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__07770);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3841:1: rule__EnumMember__Group__0__Impl : ( ( rule__EnumMember__NameAssignment_0 ) ) ;
    public final void rule__EnumMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3845:1: ( ( ( rule__EnumMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3846:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3846:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3847:1: ( rule__EnumMember__NameAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3848:1: ( rule__EnumMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3848:2: rule__EnumMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl7797);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3858:1: rule__EnumMember__Group__1 : rule__EnumMember__Group__1__Impl ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3862:1: ( rule__EnumMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3863:2: rule__EnumMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__17827);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3869:1: rule__EnumMember__Group__1__Impl : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3873:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3874:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3874:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3875:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3876:1: ( rule__EnumMember__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3876:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl7854);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3890:1: rule__EnumMember__Group_1__0 : rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3894:1: ( rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3895:2: rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07889);
            rule__EnumMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07892);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3902:1: rule__EnumMember__Group_1__0__Impl : ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) ;
    public final void rule__EnumMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3906:1: ( ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3907:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3907:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3908:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3909:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3909:2: rule__EnumMember__AssignmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7919);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3919:1: rule__EnumMember__Group_1__1 : rule__EnumMember__Group_1__1__Impl ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3923:1: ( rule__EnumMember__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3924:2: rule__EnumMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__17949);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3930:1: rule__EnumMember__Group_1__1__Impl : ( ( rule__EnumMember__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3934:1: ( ( ( rule__EnumMember__ValueAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3935:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3935:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3936:1: ( rule__EnumMember__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3937:1: ( rule__EnumMember__ValueAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3937:2: rule__EnumMember__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl7976);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3951:1: rule__ComplexTypeLiteral__Group__0 : rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 ;
    public final void rule__ComplexTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3955:1: ( rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3956:2: rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08010);
            rule__ComplexTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08013);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3963:1: rule__ComplexTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3967:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3968:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3968:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3969:1: '{'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ComplexTypeLiteral__Group__0__Impl8041); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3982:1: rule__ComplexTypeLiteral__Group__1 : rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 ;
    public final void rule__ComplexTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3986:1: ( rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3987:2: rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18072);
            rule__ComplexTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18075);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3994:1: rule__ComplexTypeLiteral__Group__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3998:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3999:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3999:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4000:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4001:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4001:2: rule__ComplexTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8102);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4011:1: rule__ComplexTypeLiteral__Group__2 : rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 ;
    public final void rule__ComplexTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4015:1: ( rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4016:2: rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28132);
            rule__ComplexTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28135);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4023:1: rule__ComplexTypeLiteral__Group__2__Impl : ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) ;
    public final void rule__ComplexTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4027:1: ( ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4028:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4028:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4029:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4030:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4030:2: rule__ComplexTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8162);
            	    rule__ComplexTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4040:1: rule__ComplexTypeLiteral__Group__3 : rule__ComplexTypeLiteral__Group__3__Impl ;
    public final void rule__ComplexTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4044:1: ( rule__ComplexTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4045:2: rule__ComplexTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38193);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4051:1: rule__ComplexTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ComplexTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4055:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4056:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4056:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4057:1: '}'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ComplexTypeLiteral__Group__3__Impl8221); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4078:1: rule__ComplexTypeLiteral__Group_2__0 : rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 ;
    public final void rule__ComplexTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4082:1: ( rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4083:2: rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08260);
            rule__ComplexTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08263);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4090:1: rule__ComplexTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4094:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4095:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4095:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4096:1: ','
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__ComplexTypeLiteral__Group_2__0__Impl8291); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4109:1: rule__ComplexTypeLiteral__Group_2__1 : rule__ComplexTypeLiteral__Group_2__1__Impl ;
    public final void rule__ComplexTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4113:1: ( rule__ComplexTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4114:2: rule__ComplexTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18322);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4120:1: rule__ComplexTypeLiteral__Group_2__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4124:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4125:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4125:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4126:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4127:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4127:2: rule__ComplexTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8349);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4141:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4145:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4146:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08383);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08386);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4153:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4157:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4158:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4158:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4159:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8413); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4170:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4174:1: ( rule__FQN__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4175:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18442);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4181:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4185:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4186:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4186:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4187:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4188:1: ( rule__FQN__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==25) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4188:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8469);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4202:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4206:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4207:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08504);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08507);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4214:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4218:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4219:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4219:1: ( '.' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4220:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__FQN__Group_1__0__Impl8535); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4233:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4237:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4238:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18566);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4244:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4248:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4249:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4249:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4250:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8593); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4266:1: rule__Model__PackageNameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4270:1: ( ( ruleFQN ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4271:1: ( ruleFQN )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4271:1: ( ruleFQN )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4272:1: ruleFQN
            {
             before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_18631);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4281:1: rule__Model__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4285:1: ( ( ruleDeclaration ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4286:1: ( ruleDeclaration )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4286:1: ( ruleDeclaration )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4287:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_28662);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4296:1: rule__Client__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Client__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4300:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4301:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4301:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4302:1: RULE_ID
            {
             before(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Client__NameAssignment_18693); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4311:1: rule__Client__BaseUrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Client__BaseUrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4315:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4316:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4316:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4317:1: RULE_STRING
            {
             before(grammarAccess.getClientAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_28724); 
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


    // $ANTLR start "rule__Client__ParamsAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4326:1: rule__Client__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__Client__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4330:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4331:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4331:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4332:1: ruleParamsBlock
            {
             before(grammarAccess.getClientAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__Client__ParamsAssignment_48755);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getClientAccess().getParamsParamsBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Client__ParamsAssignment_4"


    // $ANTLR start "rule__Client__MethodsAssignment_5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4341:1: rule__Client__MethodsAssignment_5 : ( ruleHttpMethod ) ;
    public final void rule__Client__MethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4345:1: ( ( ruleHttpMethod ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4346:1: ( ruleHttpMethod )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4346:1: ( ruleHttpMethod )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4347:1: ruleHttpMethod
            {
             before(grammarAccess.getClientAccess().getMethodsHttpMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_rule__Client__MethodsAssignment_58786);
            ruleHttpMethod();

            state._fsp--;

             after(grammarAccess.getClientAccess().getMethodsHttpMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Client__MethodsAssignment_5"


    // $ANTLR start "rule__HttpPost__NameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4356:1: rule__HttpPost__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpPost__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4360:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4361:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4361:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4362:1: RULE_ID
            {
             before(grammarAccess.getHttpPostAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpPost__NameAssignment_18817); 
             after(grammarAccess.getHttpPostAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__NameAssignment_1"


    // $ANTLR start "rule__HttpPost__PathAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4371:1: rule__HttpPost__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpPost__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4375:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4376:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4376:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4377:1: RULE_STRING
            {
             before(grammarAccess.getHttpPostAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpPost__PathAssignment_28848); 
             after(grammarAccess.getHttpPostAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__PathAssignment_2"


    // $ANTLR start "rule__HttpPost__ParamsAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4386:1: rule__HttpPost__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpPost__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4390:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4391:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4391:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4392:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpPostAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpPost__ParamsAssignment_48879);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getHttpPostAccess().getParamsParamsBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__ParamsAssignment_4"


    // $ANTLR start "rule__HttpPost__BodyAssignment_5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4401:1: rule__HttpPost__BodyAssignment_5 : ( ruleBodyBlock ) ;
    public final void rule__HttpPost__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4405:1: ( ( ruleBodyBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4406:1: ( ruleBodyBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4406:1: ( ruleBodyBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4407:1: ruleBodyBlock
            {
             before(grammarAccess.getHttpPostAccess().getBodyBodyBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpPost__BodyAssignment_58910);
            ruleBodyBlock();

            state._fsp--;

             after(grammarAccess.getHttpPostAccess().getBodyBodyBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__BodyAssignment_5"


    // $ANTLR start "rule__HttpPost__ResponseAssignment_6"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4416:1: rule__HttpPost__ResponseAssignment_6 : ( ruleResponseBlock ) ;
    public final void rule__HttpPost__ResponseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4420:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4421:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4421:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4422:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpPostAccess().getResponseResponseBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpPost__ResponseAssignment_68941);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getHttpPostAccess().getResponseResponseBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPost__ResponseAssignment_6"


    // $ANTLR start "rule__HttpPut__NameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4431:1: rule__HttpPut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpPut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4435:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4436:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4436:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4437:1: RULE_ID
            {
             before(grammarAccess.getHttpPutAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpPut__NameAssignment_18972); 
             after(grammarAccess.getHttpPutAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__NameAssignment_1"


    // $ANTLR start "rule__HttpPut__PathAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4446:1: rule__HttpPut__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpPut__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4450:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4451:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4451:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4452:1: RULE_STRING
            {
             before(grammarAccess.getHttpPutAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpPut__PathAssignment_29003); 
             after(grammarAccess.getHttpPutAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__PathAssignment_2"


    // $ANTLR start "rule__HttpPut__ParamsAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4461:1: rule__HttpPut__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpPut__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4465:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4466:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4466:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4467:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpPutAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpPut__ParamsAssignment_49034);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getHttpPutAccess().getParamsParamsBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__ParamsAssignment_4"


    // $ANTLR start "rule__HttpPut__BodyAssignment_5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4476:1: rule__HttpPut__BodyAssignment_5 : ( ruleBodyBlock ) ;
    public final void rule__HttpPut__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4480:1: ( ( ruleBodyBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4481:1: ( ruleBodyBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4481:1: ( ruleBodyBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4482:1: ruleBodyBlock
            {
             before(grammarAccess.getHttpPutAccess().getBodyBodyBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpPut__BodyAssignment_59065);
            ruleBodyBlock();

            state._fsp--;

             after(grammarAccess.getHttpPutAccess().getBodyBodyBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__BodyAssignment_5"


    // $ANTLR start "rule__HttpPut__ResponseAssignment_6"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4491:1: rule__HttpPut__ResponseAssignment_6 : ( ruleResponseBlock ) ;
    public final void rule__HttpPut__ResponseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4495:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4496:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4496:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4497:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpPutAccess().getResponseResponseBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpPut__ResponseAssignment_69096);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getHttpPutAccess().getResponseResponseBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpPut__ResponseAssignment_6"


    // $ANTLR start "rule__HttpGet__NameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4506:1: rule__HttpGet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpGet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4510:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4511:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4511:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4512:1: RULE_ID
            {
             before(grammarAccess.getHttpGetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpGet__NameAssignment_19127); 
             after(grammarAccess.getHttpGetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__NameAssignment_1"


    // $ANTLR start "rule__HttpGet__PathAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4521:1: rule__HttpGet__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpGet__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4525:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4526:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4526:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4527:1: RULE_STRING
            {
             before(grammarAccess.getHttpGetAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpGet__PathAssignment_29158); 
             after(grammarAccess.getHttpGetAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__PathAssignment_2"


    // $ANTLR start "rule__HttpGet__ParamsAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4536:1: rule__HttpGet__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpGet__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4540:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4541:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4541:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4542:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpGetAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpGet__ParamsAssignment_49189);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getHttpGetAccess().getParamsParamsBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__ParamsAssignment_4"


    // $ANTLR start "rule__HttpGet__ResponseAssignment_5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4551:1: rule__HttpGet__ResponseAssignment_5 : ( ruleResponseBlock ) ;
    public final void rule__HttpGet__ResponseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4555:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4556:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4556:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4557:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpGetAccess().getResponseResponseBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpGet__ResponseAssignment_59220);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getHttpGetAccess().getResponseResponseBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpGet__ResponseAssignment_5"


    // $ANTLR start "rule__HttpDelete__NameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4566:1: rule__HttpDelete__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpDelete__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4570:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4571:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4571:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4572:1: RULE_ID
            {
             before(grammarAccess.getHttpDeleteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpDelete__NameAssignment_19251); 
             after(grammarAccess.getHttpDeleteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__NameAssignment_1"


    // $ANTLR start "rule__HttpDelete__PathAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4581:1: rule__HttpDelete__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpDelete__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4585:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4586:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4586:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4587:1: RULE_STRING
            {
             before(grammarAccess.getHttpDeleteAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpDelete__PathAssignment_29282); 
             after(grammarAccess.getHttpDeleteAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__PathAssignment_2"


    // $ANTLR start "rule__HttpDelete__ParamsAssignment_4"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4596:1: rule__HttpDelete__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpDelete__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4600:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4601:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4601:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4602:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpDeleteAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpDelete__ParamsAssignment_49313);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getHttpDeleteAccess().getParamsParamsBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__ParamsAssignment_4"


    // $ANTLR start "rule__HttpDelete__ResponseAssignment_5"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4611:1: rule__HttpDelete__ResponseAssignment_5 : ( ruleResponseBlock ) ;
    public final void rule__HttpDelete__ResponseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4615:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4616:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4616:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4617:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpDeleteAccess().getResponseResponseBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpDelete__ResponseAssignment_59344);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getHttpDeleteAccess().getResponseResponseBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpDelete__ResponseAssignment_5"


    // $ANTLR start "rule__ParamsBlock__ParamsAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4626:1: rule__ParamsBlock__ParamsAssignment_2 : ( ruleSimpleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4630:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4631:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4631:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4632:1: ruleSimpleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_29375);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4641:1: rule__ParamsBlock__ParamsAssignment_3_1 : ( ruleSimpleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4645:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4646:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4646:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4647:1: ruleSimpleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_3_19406);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BodyBlock__TypeAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4656:1: rule__BodyBlock__TypeAssignment_1 : ( ruleBlockType ) ;
    public final void rule__BodyBlock__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4660:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4661:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4661:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4662:1: ruleBlockType
            {
             before(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_19437);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4671:1: rule__ResponseBlock__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResponseBlock__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4675:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4676:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4676:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4677:1: ( RULE_ID )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4678:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4679:1: RULE_ID
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_19472); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4690:1: rule__ResponseBlock__TypeAssignment_3 : ( ruleBlockType ) ;
    public final void rule__ResponseBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4694:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4695:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4695:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4696:1: ruleBlockType
            {
             before(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_39507);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4705:1: rule__TypedMember__NameAssignment_0 : ( ( rule__TypedMember__NameAlternatives_0_0 ) ) ;
    public final void rule__TypedMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4709:1: ( ( ( rule__TypedMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4710:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4710:1: ( ( rule__TypedMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4711:1: ( rule__TypedMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getTypedMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4712:1: ( rule__TypedMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4712:2: rule__TypedMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_09538);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4721:1: rule__TypedMember__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__TypedMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4725:1: ( ( ruleType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4726:1: ( ruleType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4726:1: ( ruleType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4727:1: ruleType
            {
             before(grammarAccess.getTypedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_29571);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4736:1: rule__SkipMember__NameAssignment_0 : ( ( rule__SkipMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SkipMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4740:1: ( ( ( rule__SkipMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4741:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4741:1: ( ( rule__SkipMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4742:1: ( rule__SkipMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4743:1: ( rule__SkipMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4743:2: rule__SkipMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_09602);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4752:1: rule__SkipMember__LiteralAssignment_1 : ( ruleComplexTypeLiteral ) ;
    public final void rule__SkipMember__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4756:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4757:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4757:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4758:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_19635);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4767:1: rule__SimpleMember__NameAssignment_0 : ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SimpleMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4771:1: ( ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4772:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4772:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4773:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4774:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4774:2: rule__SimpleMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_09666);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4783:1: rule__SimpleMember__TypeAssignment_2 : ( ruleIntrinsicType ) ;
    public final void rule__SimpleMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4787:1: ( ( ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4788:1: ( ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4788:1: ( ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4789:1: ruleIntrinsicType
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_29699);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4798:1: rule__GenericListType__ElementTypeAssignment_0 : ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) ;
    public final void rule__GenericListType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4802:1: ( ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4803:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4803:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4804:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4805:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4805:2: rule__GenericListType__ElementTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_09730);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4814:1: rule__GenericListType__IdAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__GenericListType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4818:1: ( ( ( '[]' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4819:1: ( ( '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4819:1: ( ( '[]' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4820:1: ( '[]' )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4821:1: ( '[]' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4822:1: '[]'
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__GenericListType__IdAssignment_19768); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4837:1: rule__UserType__DeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UserType__DeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4841:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4842:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4842:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4843:1: ( RULE_ID )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4844:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4845:1: RULE_ID
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment9811); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4856:1: rule__ComplexTypeDeclaration__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__ComplexTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4860:1: ( ( ( 'entity' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4861:1: ( ( 'entity' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4861:1: ( ( 'entity' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4862:1: ( 'entity' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4863:1: ( 'entity' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4864:1: 'entity'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__ComplexTypeDeclaration__KeywordAssignment_09851); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4879:1: rule__ComplexTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__ComplexTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4883:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4884:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4884:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4885:1: ( 'generate' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4886:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4887:1: 'generate'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__ComplexTypeDeclaration__GenAssignment_19895); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4902:1: rule__ComplexTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4906:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4907:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4907:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4908:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_29934); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4917:1: rule__ComplexTypeDeclaration__LiteralAssignment_3 : ( ruleComplexTypeLiteral ) ;
    public final void rule__ComplexTypeDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4921:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4922:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4922:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4923:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_39965);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4932:1: rule__EnumTypeDeclaration__KeywordAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__EnumTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4936:1: ( ( ( 'enum' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4937:1: ( ( 'enum' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4937:1: ( ( 'enum' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4938:1: ( 'enum' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4939:1: ( 'enum' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4940:1: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumTypeDeclaration__KeywordAssignment_010001); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4955:1: rule__EnumTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__EnumTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4959:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4960:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4960:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4961:1: ( 'generate' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4962:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4963:1: 'generate'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__EnumTypeDeclaration__GenAssignment_110045); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4978:1: rule__EnumTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4982:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4983:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4983:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4984:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210084); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4993:1: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 : ( ruleIntegerType ) ;
    public final void rule__EnumTypeDeclaration__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4997:1: ( ( ruleIntegerType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4998:1: ( ruleIntegerType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4998:1: ( ruleIntegerType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4999:1: ruleIntegerType
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110115);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5008:1: rule__EnumTypeDeclaration__LiteralAssignment_4 : ( ruleEnumTypeLiteral ) ;
    public final void rule__EnumTypeDeclaration__LiteralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5012:1: ( ( ruleEnumTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5013:1: ( ruleEnumTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5013:1: ( ruleEnumTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5014:1: ruleEnumTypeLiteral
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410146);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5023:1: rule__EnumTypeLiteral__MembersAssignment_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5027:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5028:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5028:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5029:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110177);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5038:1: rule__EnumTypeLiteral__MembersAssignment_2_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5042:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5043:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5043:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5044:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110208);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5053:1: rule__EnumMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5057:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5058:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5058:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5059:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010239); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5068:1: rule__EnumMember__AssignmentAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__EnumMember__AssignmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5072:1: ( ( ( '=' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5073:1: ( ( '=' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5073:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5074:1: ( '=' )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5075:1: ( '=' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5076:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            match(input,30,FOLLOW_30_in_rule__EnumMember__AssignmentAssignment_1_010275); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5091:1: rule__EnumMember__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumMember__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5095:1: ( ( RULE_INT ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5096:1: ( RULE_INT )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5096:1: ( RULE_INT )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5097:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_110314); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5106:1: rule__ComplexTypeLiteral__MembersAssignment_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5110:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5111:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5111:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5112:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110345);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5121:1: rule__ComplexTypeLiteral__MembersAssignment_2_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5125:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5126:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5126:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5127:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110376);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5136:1: rule__StringType__IdAssignment : ( ( 'String' ) ) ;
    public final void rule__StringType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5140:1: ( ( ( 'String' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5141:1: ( ( 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5141:1: ( ( 'String' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5142:1: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5143:1: ( 'String' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5144:1: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__StringType__IdAssignment10412); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5159:1: rule__BooleanType__IdAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5163:1: ( ( ( 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5164:1: ( ( 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5164:1: ( ( 'boolean' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5165:1: ( 'boolean' )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5166:1: ( 'boolean' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5167:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__BooleanType__IdAssignment10456); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5182:1: rule__IntegerType__IdAssignment : ( ( 'int' ) ) ;
    public final void rule__IntegerType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5186:1: ( ( ( 'int' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5187:1: ( ( 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5187:1: ( ( 'int' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5188:1: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5189:1: ( 'int' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5190:1: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__IntegerType__IdAssignment10500); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5205:1: rule__LongType__IdAssignment : ( ( 'long' ) ) ;
    public final void rule__LongType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5209:1: ( ( ( 'long' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5210:1: ( ( 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5210:1: ( ( 'long' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5211:1: ( 'long' )
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5212:1: ( 'long' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5213:1: 'long'
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__LongType__IdAssignment10544); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5228:1: rule__DoubleType__IdAssignment : ( ( 'double' ) ) ;
    public final void rule__DoubleType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5232:1: ( ( ( 'double' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5233:1: ( ( 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5233:1: ( ( 'double' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5234:1: ( 'double' )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5235:1: ( 'double' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5236:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__DoubleType__IdAssignment10588); 
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\1\uffff\1\10\5\11\3\uffff";
    static final String DFA8_minS =
        "\1\4\6\16\3\uffff";
    static final String DFA8_maxS =
        "\1\43\6\32\3\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\32\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\10\5\uffff\1\10\1\uffff\1\10\3\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\3\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\3\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\3\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\3\uffff\1\7",
            "\1\11\5\uffff\1\11\1\uffff\1\11\3\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1150:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );";
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
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Alternatives_in_ruleHttpMethod274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPost_in_entryRuleHttpPost301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpPost308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__0_in_ruleHttpPost334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPut_in_entryRuleHttpPut361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpPut368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__0_in_ruleHttpPut394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpGet_in_entryRuleHttpGet421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpGet428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__0_in_ruleHttpGet454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpDelete_in_entryRuleHttpDelete481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpDelete488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__0_in_ruleHttpDelete514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_entryRuleTypedMember841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedMember848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__0_in_ruleTypedMember874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_entryRuleSkipMember901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkipMember908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0_in_ruleSkipMember934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_entryRuleGenericListType1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0_in_ruleGenericListType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__IdAssignment_in_ruleLongType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_rule__Declaration__Alternatives2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPost_in_rule__HttpMethod__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpGet_in_rule__HttpMethod__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPut_in_rule__HttpMethod__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpDelete_in_rule__HttpMethod__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BlockType__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypedMember__NameAlternatives_0_02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypedMember__NameAlternatives_0_02297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SkipMember__NameAlternatives_0_02329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SkipMember__NameAlternatives_0_02346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__Type__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12783 = new BitSet(new long[]{0x0000000028001000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl2870 = new BitSet(new long[]{0x0000000028001002L});
    public static final BitSet FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__02907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Client__Group__1_in_rule__Client__Group__02910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Client__Group__0__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__12969 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Client__Group__2_in_rule__Client__Group__12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23029 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33090 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Client__Group__3__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43152 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__ParamsAssignment_4_in_rule__Client__Group__4__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53213 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__Client__Group__6_in_rule__Client__Group__53216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__MethodsAssignment_5_in_rule__Client__Group__5__Impl3243 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_rule__Client__Group__6__Impl_in_rule__Client__Group__63274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Client__Group__6__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__0__Impl_in_rule__HttpPost__Group__03347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__1_in_rule__HttpPost__Group__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__HttpPost__Group__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__1__Impl_in_rule__HttpPost__Group__13409 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__2_in_rule__HttpPost__Group__13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__NameAssignment_1_in_rule__HttpPost__Group__1__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__2__Impl_in_rule__HttpPost__Group__23469 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__3_in_rule__HttpPost__Group__23472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__PathAssignment_2_in_rule__HttpPost__Group__2__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__3__Impl_in_rule__HttpPost__Group__33530 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__4_in_rule__HttpPost__Group__33533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpPost__Group__3__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__4__Impl_in_rule__HttpPost__Group__43592 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__5_in_rule__HttpPost__Group__43595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__ParamsAssignment_4_in_rule__HttpPost__Group__4__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__5__Impl_in_rule__HttpPost__Group__53653 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__6_in_rule__HttpPost__Group__53656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__BodyAssignment_5_in_rule__HttpPost__Group__5__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__6__Impl_in_rule__HttpPost__Group__63714 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__7_in_rule__HttpPost__Group__63717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__ResponseAssignment_6_in_rule__HttpPost__Group__6__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__7__Impl_in_rule__HttpPost__Group__73775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpPost__Group__7__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__0__Impl_in_rule__HttpPut__Group__03850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__1_in_rule__HttpPut__Group__03853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__HttpPut__Group__0__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__1__Impl_in_rule__HttpPut__Group__13912 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__2_in_rule__HttpPut__Group__13915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__NameAssignment_1_in_rule__HttpPut__Group__1__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__2__Impl_in_rule__HttpPut__Group__23972 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__3_in_rule__HttpPut__Group__23975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__PathAssignment_2_in_rule__HttpPut__Group__2__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__3__Impl_in_rule__HttpPut__Group__34033 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__4_in_rule__HttpPut__Group__34036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpPut__Group__3__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__4__Impl_in_rule__HttpPut__Group__44095 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__5_in_rule__HttpPut__Group__44098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__ParamsAssignment_4_in_rule__HttpPut__Group__4__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__5__Impl_in_rule__HttpPut__Group__54156 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__6_in_rule__HttpPut__Group__54159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__BodyAssignment_5_in_rule__HttpPut__Group__5__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__6__Impl_in_rule__HttpPut__Group__64217 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__7_in_rule__HttpPut__Group__64220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__ResponseAssignment_6_in_rule__HttpPut__Group__6__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__7__Impl_in_rule__HttpPut__Group__74278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpPut__Group__7__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__0__Impl_in_rule__HttpGet__Group__04353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__1_in_rule__HttpGet__Group__04356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HttpGet__Group__0__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__1__Impl_in_rule__HttpGet__Group__14415 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__2_in_rule__HttpGet__Group__14418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__NameAssignment_1_in_rule__HttpGet__Group__1__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__2__Impl_in_rule__HttpGet__Group__24475 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__3_in_rule__HttpGet__Group__24478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__PathAssignment_2_in_rule__HttpGet__Group__2__Impl4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__3__Impl_in_rule__HttpGet__Group__34536 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__4_in_rule__HttpGet__Group__34539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpGet__Group__3__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__4__Impl_in_rule__HttpGet__Group__44598 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__5_in_rule__HttpGet__Group__44601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__ParamsAssignment_4_in_rule__HttpGet__Group__4__Impl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__5__Impl_in_rule__HttpGet__Group__54659 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__6_in_rule__HttpGet__Group__54662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__ResponseAssignment_5_in_rule__HttpGet__Group__5__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__6__Impl_in_rule__HttpGet__Group__64720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpGet__Group__6__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__0__Impl_in_rule__HttpDelete__Group__04793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__1_in_rule__HttpDelete__Group__04796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__HttpDelete__Group__0__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__1__Impl_in_rule__HttpDelete__Group__14855 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__2_in_rule__HttpDelete__Group__14858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__NameAssignment_1_in_rule__HttpDelete__Group__1__Impl4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__2__Impl_in_rule__HttpDelete__Group__24915 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__3_in_rule__HttpDelete__Group__24918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__PathAssignment_2_in_rule__HttpDelete__Group__2__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__3__Impl_in_rule__HttpDelete__Group__34976 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__4_in_rule__HttpDelete__Group__34979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpDelete__Group__3__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__4__Impl_in_rule__HttpDelete__Group__45038 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__5_in_rule__HttpDelete__Group__45041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__ParamsAssignment_4_in_rule__HttpDelete__Group__4__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__5__Impl_in_rule__HttpDelete__Group__55099 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__6_in_rule__HttpDelete__Group__55102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__ResponseAssignment_5_in_rule__HttpDelete__Group__5__Impl5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__6__Impl_in_rule__HttpDelete__Group__65160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpDelete__Group__6__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05233 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15294 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ParamsBlock__Group__1__Impl5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25356 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5386 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5444 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05483 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ParamsBlock__Group_3__0__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05606 = new BitSet(new long[]{0x0000000F80002010L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BodyBlock__Group__0__Impl5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05729 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15790 = new BitSet(new long[]{0x0000000F80802010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ResponseBlock__Group__1__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__25852 = new BitSet(new long[]{0x0000000F80802010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__25855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__35913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__05979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__05982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ResponseBlock__Group_2__0__Impl6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__0__Impl_in_rule__TypedMember__Group__06102 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1_in_rule__TypedMember__Group__06105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAssignment_0_in_rule__TypedMember__Group__0__Impl6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__1__Impl_in_rule__TypedMember__Group__16162 = new BitSet(new long[]{0x0000000F80000010L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2_in_rule__TypedMember__Group__16165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypedMember__Group__1__Impl6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__Group__2__Impl_in_rule__TypedMember__Group__26224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__TypeAssignment_2_in_rule__TypedMember__Group__2__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__06287 = new BitSet(new long[]{0x0000000F80002010L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__06290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAssignment_0_in_rule__SkipMember__Group__0__Impl6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__16347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__LiteralAssignment_1_in_rule__SkipMember__Group__1__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__06408 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__06411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__16468 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__16471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SimpleMember__Group__1__Impl6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__26530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__06593 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__06596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__16653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__06714 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__06717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__16774 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__16777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__26835 = new BitSet(new long[]{0x0000000F80002010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__26838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__36895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__06961 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__06964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17021 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27082 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37142 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07271 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumTypeDeclaration__Group_3__0__Impl7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EnumTypeLiteral__Group__0__Impl7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__17456 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__17459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__27516 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__27519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl7546 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__37577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumTypeLiteral__Group__3__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__07644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__07647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumTypeLiteral__Group_2__0__Impl7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__17706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__07767 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__07770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__17827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07889 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__17949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08010 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComplexTypeLiteral__Group__0__Impl8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18072 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28132 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8162 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComplexTypeLiteral__Group__3__Impl8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08260 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexTypeLiteral__Group_2__0__Impl8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08383 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8469 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FQN__Group_1__0__Impl8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_18631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_28662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Client__NameAssignment_18693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_28724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__Client__ParamsAssignment_48755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__Client__MethodsAssignment_58786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpPost__NameAssignment_18817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpPost__PathAssignment_28848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpPost__ParamsAssignment_48879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpPost__BodyAssignment_58910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpPost__ResponseAssignment_68941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpPut__NameAssignment_18972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpPut__PathAssignment_29003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpPut__ParamsAssignment_49034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpPut__BodyAssignment_59065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpPut__ResponseAssignment_69096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpGet__NameAssignment_19127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpGet__PathAssignment_29158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpGet__ParamsAssignment_49189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpGet__ResponseAssignment_59220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpDelete__NameAssignment_19251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpDelete__PathAssignment_29282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpDelete__ParamsAssignment_49313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpDelete__ResponseAssignment_59344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_29375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_3_19406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_19437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_19472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_39507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedMember__NameAlternatives_0_0_in_rule__TypedMember__NameAssignment_09538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__TypedMember__TypeAssignment_29571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAlternatives_0_0_in_rule__SkipMember__NameAssignment_09602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_19635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_09666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_29699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_09730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GenericListType__IdAssignment_19768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment9811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ComplexTypeDeclaration__KeywordAssignment_09851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ComplexTypeDeclaration__GenAssignment_19895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_29934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_39965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumTypeDeclaration__KeywordAssignment_010001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EnumTypeDeclaration__GenAssignment_110045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumMember__AssignmentAssignment_1_010275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_110314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StringType__IdAssignment10412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BooleanType__IdAssignment10456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntegerType__IdAssignment10500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__LongType__IdAssignment10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DoubleType__IdAssignment10588 = new BitSet(new long[]{0x0000000000000002L});

}