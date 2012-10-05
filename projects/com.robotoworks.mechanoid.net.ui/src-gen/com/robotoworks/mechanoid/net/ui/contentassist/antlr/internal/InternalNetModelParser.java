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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'client'", "'{'", "'}'", "'post'", "'put'", "'get'", "'delete'", "'params'", "','", "'body'", "'response'", "'extends'", "':'", "'skip'", "'.'", "'[]'", "'entity'", "'generate'", "'enum'", "'='", "'String'", "'boolean'", "'int'", "'long'", "'double'"
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
    public static final int T__36=36;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:433:1: ruleTypedMember : ( ( rule__TypedMember__Alternatives ) ) ;
    public final void ruleTypedMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:437:2: ( ( ( rule__TypedMember__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__TypedMember__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:438:1: ( ( rule__TypedMember__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:439:1: ( rule__TypedMember__Alternatives )
            {
             before(grammarAccess.getTypedMemberAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:1: ( rule__TypedMember__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:440:2: rule__TypedMember__Alternatives
            {
            pushFollow(FOLLOW_rule__TypedMember__Alternatives_in_ruleTypedMember874);
            rule__TypedMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypedMemberAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleIDNamedMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:452:1: entryRuleIDNamedMember : ruleIDNamedMember EOF ;
    public final void entryRuleIDNamedMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:453:1: ( ruleIDNamedMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:454:1: ruleIDNamedMember EOF
            {
             before(grammarAccess.getIDNamedMemberRule()); 
            pushFollow(FOLLOW_ruleIDNamedMember_in_entryRuleIDNamedMember901);
            ruleIDNamedMember();

            state._fsp--;

             after(grammarAccess.getIDNamedMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDNamedMember908); 

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
    // $ANTLR end "entryRuleIDNamedMember"


    // $ANTLR start "ruleIDNamedMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:461:1: ruleIDNamedMember : ( ( rule__IDNamedMember__Group__0 ) ) ;
    public final void ruleIDNamedMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:465:2: ( ( ( rule__IDNamedMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__IDNamedMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:466:1: ( ( rule__IDNamedMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:467:1: ( rule__IDNamedMember__Group__0 )
            {
             before(grammarAccess.getIDNamedMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:1: ( rule__IDNamedMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:468:2: rule__IDNamedMember__Group__0
            {
            pushFollow(FOLLOW_rule__IDNamedMember__Group__0_in_ruleIDNamedMember934);
            rule__IDNamedMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIDNamedMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDNamedMember"


    // $ANTLR start "entryRuleStringNamedMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:480:1: entryRuleStringNamedMember : ruleStringNamedMember EOF ;
    public final void entryRuleStringNamedMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:481:1: ( ruleStringNamedMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:482:1: ruleStringNamedMember EOF
            {
             before(grammarAccess.getStringNamedMemberRule()); 
            pushFollow(FOLLOW_ruleStringNamedMember_in_entryRuleStringNamedMember961);
            ruleStringNamedMember();

            state._fsp--;

             after(grammarAccess.getStringNamedMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringNamedMember968); 

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
    // $ANTLR end "entryRuleStringNamedMember"


    // $ANTLR start "ruleStringNamedMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:489:1: ruleStringNamedMember : ( ( rule__StringNamedMember__Group__0 ) ) ;
    public final void ruleStringNamedMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:493:2: ( ( ( rule__StringNamedMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__StringNamedMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:494:1: ( ( rule__StringNamedMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:495:1: ( rule__StringNamedMember__Group__0 )
            {
             before(grammarAccess.getStringNamedMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:1: ( rule__StringNamedMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:496:2: rule__StringNamedMember__Group__0
            {
            pushFollow(FOLLOW_rule__StringNamedMember__Group__0_in_ruleStringNamedMember994);
            rule__StringNamedMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringNamedMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringNamedMember"


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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:545:1: ruleSimpleMember : ( ( rule__SimpleMember__Alternatives ) ) ;
    public final void ruleSimpleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:549:2: ( ( ( rule__SimpleMember__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__SimpleMember__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:550:1: ( ( rule__SimpleMember__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:551:1: ( rule__SimpleMember__Alternatives )
            {
             before(grammarAccess.getSimpleMemberAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:1: ( rule__SimpleMember__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:552:2: rule__SimpleMember__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleMember__Alternatives_in_ruleSimpleMember1114);
            rule__SimpleMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleIDNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:564:1: entryRuleIDNamedSimpleMember : ruleIDNamedSimpleMember EOF ;
    public final void entryRuleIDNamedSimpleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:565:1: ( ruleIDNamedSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:566:1: ruleIDNamedSimpleMember EOF
            {
             before(grammarAccess.getIDNamedSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleIDNamedSimpleMember_in_entryRuleIDNamedSimpleMember1141);
            ruleIDNamedSimpleMember();

            state._fsp--;

             after(grammarAccess.getIDNamedSimpleMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDNamedSimpleMember1148); 

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
    // $ANTLR end "entryRuleIDNamedSimpleMember"


    // $ANTLR start "ruleIDNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:573:1: ruleIDNamedSimpleMember : ( ( rule__IDNamedSimpleMember__Group__0 ) ) ;
    public final void ruleIDNamedSimpleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:577:2: ( ( ( rule__IDNamedSimpleMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__IDNamedSimpleMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:578:1: ( ( rule__IDNamedSimpleMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:579:1: ( rule__IDNamedSimpleMember__Group__0 )
            {
             before(grammarAccess.getIDNamedSimpleMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:1: ( rule__IDNamedSimpleMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:580:2: rule__IDNamedSimpleMember__Group__0
            {
            pushFollow(FOLLOW_rule__IDNamedSimpleMember__Group__0_in_ruleIDNamedSimpleMember1174);
            rule__IDNamedSimpleMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIDNamedSimpleMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDNamedSimpleMember"


    // $ANTLR start "entryRuleStringNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:592:1: entryRuleStringNamedSimpleMember : ruleStringNamedSimpleMember EOF ;
    public final void entryRuleStringNamedSimpleMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:593:1: ( ruleStringNamedSimpleMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:594:1: ruleStringNamedSimpleMember EOF
            {
             before(grammarAccess.getStringNamedSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleStringNamedSimpleMember_in_entryRuleStringNamedSimpleMember1201);
            ruleStringNamedSimpleMember();

            state._fsp--;

             after(grammarAccess.getStringNamedSimpleMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringNamedSimpleMember1208); 

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
    // $ANTLR end "entryRuleStringNamedSimpleMember"


    // $ANTLR start "ruleStringNamedSimpleMember"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:601:1: ruleStringNamedSimpleMember : ( ( rule__StringNamedSimpleMember__Group__0 ) ) ;
    public final void ruleStringNamedSimpleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:605:2: ( ( ( rule__StringNamedSimpleMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__StringNamedSimpleMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:606:1: ( ( rule__StringNamedSimpleMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:607:1: ( rule__StringNamedSimpleMember__Group__0 )
            {
             before(grammarAccess.getStringNamedSimpleMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:1: ( rule__StringNamedSimpleMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:608:2: rule__StringNamedSimpleMember__Group__0
            {
            pushFollow(FOLLOW_rule__StringNamedSimpleMember__Group__0_in_ruleStringNamedSimpleMember1234);
            rule__StringNamedSimpleMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringNamedSimpleMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringNamedSimpleMember"


    // $ANTLR start "entryRuleType"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:620:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:621:1: ( ruleType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:622:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1261);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1268); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:629:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:633:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:634:1: ( ( rule__Type__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:634:1: ( ( rule__Type__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:635:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:636:1: ( rule__Type__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:636:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1294);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:648:1: entryRuleGenericListType : ruleGenericListType EOF ;
    public final void entryRuleGenericListType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:649:1: ( ruleGenericListType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:650:1: ruleGenericListType EOF
            {
             before(grammarAccess.getGenericListTypeRule()); 
            pushFollow(FOLLOW_ruleGenericListType_in_entryRuleGenericListType1321);
            ruleGenericListType();

            state._fsp--;

             after(grammarAccess.getGenericListTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListType1328); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:657:1: ruleGenericListType : ( ( rule__GenericListType__Group__0 ) ) ;
    public final void ruleGenericListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:661:2: ( ( ( rule__GenericListType__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:662:1: ( ( rule__GenericListType__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:662:1: ( ( rule__GenericListType__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:663:1: ( rule__GenericListType__Group__0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:664:1: ( rule__GenericListType__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:664:2: rule__GenericListType__Group__0
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0_in_ruleGenericListType1354);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:676:1: entryRuleUserType : ruleUserType EOF ;
    public final void entryRuleUserType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:677:1: ( ruleUserType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:678:1: ruleUserType EOF
            {
             before(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType1381);
            ruleUserType();

            state._fsp--;

             after(grammarAccess.getUserTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType1388); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:685:1: ruleUserType : ( ( rule__UserType__DeclarationAssignment ) ) ;
    public final void ruleUserType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:689:2: ( ( ( rule__UserType__DeclarationAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:690:1: ( ( rule__UserType__DeclarationAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:690:1: ( ( rule__UserType__DeclarationAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:691:1: ( rule__UserType__DeclarationAssignment )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:692:1: ( rule__UserType__DeclarationAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:692:2: rule__UserType__DeclarationAssignment
            {
            pushFollow(FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1414);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:704:1: entryRuleUserTypeDeclaration : ruleUserTypeDeclaration EOF ;
    public final void entryRuleUserTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:705:1: ( ruleUserTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:706:1: ruleUserTypeDeclaration EOF
            {
             before(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1441);
            ruleUserTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration1448); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:713:1: ruleUserTypeDeclaration : ( ( rule__UserTypeDeclaration__Alternatives ) ) ;
    public final void ruleUserTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:717:2: ( ( ( rule__UserTypeDeclaration__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:718:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:718:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:719:1: ( rule__UserTypeDeclaration__Alternatives )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:720:1: ( rule__UserTypeDeclaration__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:720:2: rule__UserTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1474);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:732:1: entryRuleComplexTypeDeclaration : ruleComplexTypeDeclaration EOF ;
    public final void entryRuleComplexTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:733:1: ( ruleComplexTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:734:1: ruleComplexTypeDeclaration EOF
            {
             before(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1501);
            ruleComplexTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1508); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:741:1: ruleComplexTypeDeclaration : ( ( rule__ComplexTypeDeclaration__Group__0 ) ) ;
    public final void ruleComplexTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:745:2: ( ( ( rule__ComplexTypeDeclaration__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:746:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:746:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:747:1: ( rule__ComplexTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:748:1: ( rule__ComplexTypeDeclaration__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:748:2: rule__ComplexTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1534);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:760:1: entryRuleEnumTypeDeclaration : ruleEnumTypeDeclaration EOF ;
    public final void entryRuleEnumTypeDeclaration() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:761:1: ( ruleEnumTypeDeclaration EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:762:1: ruleEnumTypeDeclaration EOF
            {
             before(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1561);
            ruleEnumTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1568); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:769:1: ruleEnumTypeDeclaration : ( ( rule__EnumTypeDeclaration__Group__0 ) ) ;
    public final void ruleEnumTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:773:2: ( ( ( rule__EnumTypeDeclaration__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:774:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:774:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:775:1: ( rule__EnumTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:776:1: ( rule__EnumTypeDeclaration__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:776:2: rule__EnumTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1594);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:788:1: entryRuleEnumTypeLiteral : ruleEnumTypeLiteral EOF ;
    public final void entryRuleEnumTypeLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:789:1: ( ruleEnumTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:790:1: ruleEnumTypeLiteral EOF
            {
             before(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1621);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral1628); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:797:1: ruleEnumTypeLiteral : ( ( rule__EnumTypeLiteral__Group__0 ) ) ;
    public final void ruleEnumTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:801:2: ( ( ( rule__EnumTypeLiteral__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:802:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:802:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:803:1: ( rule__EnumTypeLiteral__Group__0 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:804:1: ( rule__EnumTypeLiteral__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:804:2: rule__EnumTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1654);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:816:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:817:1: ( ruleEnumMember EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:818:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember1681);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember1688); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:825:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:829:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:830:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:830:1: ( ( rule__EnumMember__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:831:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:832:1: ( rule__EnumMember__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:832:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1714);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:844:1: entryRuleComplexTypeLiteral : ruleComplexTypeLiteral EOF ;
    public final void entryRuleComplexTypeLiteral() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:845:1: ( ruleComplexTypeLiteral EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:846:1: ruleComplexTypeLiteral EOF
            {
             before(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1741);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral1748); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:853:1: ruleComplexTypeLiteral : ( ( rule__ComplexTypeLiteral__Group__0 ) ) ;
    public final void ruleComplexTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:857:2: ( ( ( rule__ComplexTypeLiteral__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:858:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:858:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:859:1: ( rule__ComplexTypeLiteral__Group__0 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:860:1: ( rule__ComplexTypeLiteral__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:860:2: rule__ComplexTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1774);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:872:1: entryRuleIntrinsicType : ruleIntrinsicType EOF ;
    public final void entryRuleIntrinsicType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:873:1: ( ruleIntrinsicType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:874:1: ruleIntrinsicType EOF
            {
             before(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1801);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getIntrinsicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType1808); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:881:1: ruleIntrinsicType : ( ( rule__IntrinsicType__Alternatives ) ) ;
    public final void ruleIntrinsicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:885:2: ( ( ( rule__IntrinsicType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:886:1: ( ( rule__IntrinsicType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:886:1: ( ( rule__IntrinsicType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:887:1: ( rule__IntrinsicType__Alternatives )
            {
             before(grammarAccess.getIntrinsicTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:888:1: ( rule__IntrinsicType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:888:2: rule__IntrinsicType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1834);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:900:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:901:1: ( ruleStringType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:902:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1861);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1868); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:909:1: ruleStringType : ( ( rule__StringType__IdAssignment ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:913:2: ( ( ( rule__StringType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:914:1: ( ( rule__StringType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:914:1: ( ( rule__StringType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:915:1: ( rule__StringType__IdAssignment )
            {
             before(grammarAccess.getStringTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:916:1: ( rule__StringType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:916:2: rule__StringType__IdAssignment
            {
            pushFollow(FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1894);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:928:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:929:1: ( ruleBooleanType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:930:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1921);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1928); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:937:1: ruleBooleanType : ( ( rule__BooleanType__IdAssignment ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:941:2: ( ( ( rule__BooleanType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:942:1: ( ( rule__BooleanType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:942:1: ( ( rule__BooleanType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:943:1: ( rule__BooleanType__IdAssignment )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:944:1: ( rule__BooleanType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:944:2: rule__BooleanType__IdAssignment
            {
            pushFollow(FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1954);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:956:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:957:1: ( ruleNumericType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:958:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType1981);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType1988); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:965:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:969:2: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:970:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:970:1: ( ( rule__NumericType__Alternatives ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:971:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:972:1: ( rule__NumericType__Alternatives )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:972:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType2014);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:984:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:985:1: ( ruleIntegerType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:986:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType2041);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType2048); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:993:1: ruleIntegerType : ( ( rule__IntegerType__IdAssignment ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:997:2: ( ( ( rule__IntegerType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:998:1: ( ( rule__IntegerType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:998:1: ( ( rule__IntegerType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:999:1: ( rule__IntegerType__IdAssignment )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1000:1: ( rule__IntegerType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1000:2: rule__IntegerType__IdAssignment
            {
            pushFollow(FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType2074);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1012:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1013:1: ( ruleLongType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1014:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType2101);
            ruleLongType();

            state._fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType2108); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1021:1: ruleLongType : ( ( rule__LongType__IdAssignment ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1025:2: ( ( ( rule__LongType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1026:1: ( ( rule__LongType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1026:1: ( ( rule__LongType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1027:1: ( rule__LongType__IdAssignment )
            {
             before(grammarAccess.getLongTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1028:1: ( rule__LongType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1028:2: rule__LongType__IdAssignment
            {
            pushFollow(FOLLOW_rule__LongType__IdAssignment_in_ruleLongType2134);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1040:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1041:1: ( ruleDoubleType EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1042:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType2161);
            ruleDoubleType();

            state._fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType2168); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1049:1: ruleDoubleType : ( ( rule__DoubleType__IdAssignment ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1053:2: ( ( ( rule__DoubleType__IdAssignment ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1054:1: ( ( rule__DoubleType__IdAssignment ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1054:1: ( ( rule__DoubleType__IdAssignment ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1055:1: ( rule__DoubleType__IdAssignment )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdAssignment()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1056:1: ( rule__DoubleType__IdAssignment )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1056:2: rule__DoubleType__IdAssignment
            {
            pushFollow(FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType2194);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1068:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1069:1: ( ruleFQN EOF )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1070:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2221);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2228); 

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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1077:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1081:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1082:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1082:1: ( ( rule__FQN__Group__0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1083:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1084:1: ( rule__FQN__Group__0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1084:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN2254);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1096:1: rule__Declaration__Alternatives : ( ( ruleUserTypeDeclaration ) | ( ruleClient ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1100:1: ( ( ruleUserTypeDeclaration ) | ( ruleClient ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28||LA1_0==30) ) {
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1101:1: ( ruleUserTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1101:1: ( ruleUserTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1102:1: ruleUserTypeDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2290);
                    ruleUserTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1107:6: ( ruleClient )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1107:6: ( ruleClient )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1108:1: ruleClient
                    {
                     before(grammarAccess.getDeclarationAccess().getClientParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClient_in_rule__Declaration__Alternatives2307);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1118:1: rule__HttpMethod__Alternatives : ( ( ruleHttpPost ) | ( ruleHttpGet ) | ( ruleHttpPut ) | ( ruleHttpDelete ) );
    public final void rule__HttpMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1122:1: ( ( ruleHttpPost ) | ( ruleHttpGet ) | ( ruleHttpPut ) | ( ruleHttpDelete ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1123:1: ( ruleHttpPost )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1123:1: ( ruleHttpPost )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1124:1: ruleHttpPost
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpPostParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHttpPost_in_rule__HttpMethod__Alternatives2339);
                    ruleHttpPost();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodAccess().getHttpPostParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1129:6: ( ruleHttpGet )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1129:6: ( ruleHttpGet )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1130:1: ruleHttpGet
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpGetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHttpGet_in_rule__HttpMethod__Alternatives2356);
                    ruleHttpGet();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodAccess().getHttpGetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1135:6: ( ruleHttpPut )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1135:6: ( ruleHttpPut )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1136:1: ruleHttpPut
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpPutParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHttpPut_in_rule__HttpMethod__Alternatives2373);
                    ruleHttpPut();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodAccess().getHttpPutParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1141:6: ( ruleHttpDelete )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1141:6: ( ruleHttpDelete )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1142:1: ruleHttpDelete
                    {
                     before(grammarAccess.getHttpMethodAccess().getHttpDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHttpDelete_in_rule__HttpMethod__Alternatives2390);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1152:1: rule__BlockType__Alternatives : ( ( ruleType ) | ( ruleComplexTypeLiteral ) );
    public final void rule__BlockType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1156:1: ( ( ruleType ) | ( ruleComplexTypeLiteral ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=32 && LA3_0<=36)) ) {
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1157:1: ( ruleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1157:1: ( ruleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1158:1: ruleType
                    {
                     before(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__BlockType__Alternatives2422);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1163:6: ( ruleComplexTypeLiteral )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1163:6: ( ruleComplexTypeLiteral )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1164:1: ruleComplexTypeLiteral
                    {
                     before(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2439);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1174:1: rule__Member__Alternatives : ( ( ruleTypedMember ) | ( ruleSkipMember ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1178:1: ( ( ruleTypedMember ) | ( ruleSkipMember ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1179:1: ( ruleTypedMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1179:1: ( ruleTypedMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1180:1: ruleTypedMember
                    {
                     before(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2471);
                    ruleTypedMember();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypedMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1185:6: ( ruleSkipMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1185:6: ( ruleSkipMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1186:1: ruleSkipMember
                    {
                     before(grammarAccess.getMemberAccess().getSkipMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2488);
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


    // $ANTLR start "rule__TypedMember__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1196:1: rule__TypedMember__Alternatives : ( ( ruleIDNamedMember ) | ( ruleStringNamedMember ) );
    public final void rule__TypedMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1200:1: ( ( ruleIDNamedMember ) | ( ruleStringNamedMember ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1201:1: ( ruleIDNamedMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1201:1: ( ruleIDNamedMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1202:1: ruleIDNamedMember
                    {
                     before(grammarAccess.getTypedMemberAccess().getIDNamedMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIDNamedMember_in_rule__TypedMember__Alternatives2520);
                    ruleIDNamedMember();

                    state._fsp--;

                     after(grammarAccess.getTypedMemberAccess().getIDNamedMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1207:6: ( ruleStringNamedMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1207:6: ( ruleStringNamedMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1208:1: ruleStringNamedMember
                    {
                     before(grammarAccess.getTypedMemberAccess().getStringNamedMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringNamedMember_in_rule__TypedMember__Alternatives2537);
                    ruleStringNamedMember();

                    state._fsp--;

                     after(grammarAccess.getTypedMemberAccess().getStringNamedMemberParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypedMember__Alternatives"


    // $ANTLR start "rule__SimpleMember__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1218:1: rule__SimpleMember__Alternatives : ( ( ruleIDNamedSimpleMember ) | ( ruleStringNamedSimpleMember ) );
    public final void rule__SimpleMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1222:1: ( ( ruleIDNamedSimpleMember ) | ( ruleStringNamedSimpleMember ) )
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1223:1: ( ruleIDNamedSimpleMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1223:1: ( ruleIDNamedSimpleMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1224:1: ruleIDNamedSimpleMember
                    {
                     before(grammarAccess.getSimpleMemberAccess().getIDNamedSimpleMemberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIDNamedSimpleMember_in_rule__SimpleMember__Alternatives2569);
                    ruleIDNamedSimpleMember();

                    state._fsp--;

                     after(grammarAccess.getSimpleMemberAccess().getIDNamedSimpleMemberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1229:6: ( ruleStringNamedSimpleMember )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1229:6: ( ruleStringNamedSimpleMember )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1230:1: ruleStringNamedSimpleMember
                    {
                     before(grammarAccess.getSimpleMemberAccess().getStringNamedSimpleMemberParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringNamedSimpleMember_in_rule__SimpleMember__Alternatives2586);
                    ruleStringNamedSimpleMember();

                    state._fsp--;

                     after(grammarAccess.getSimpleMemberAccess().getStringNamedSimpleMemberParserRuleCall_1()); 

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
    // $ANTLR end "rule__SimpleMember__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1240:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1244:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1245:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1245:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1246:1: ruleUserType
                    {
                     before(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__Type__Alternatives2618);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1251:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1251:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1252:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2635);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1257:6: ( ruleGenericListType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1257:6: ( ruleGenericListType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1258:1: ruleGenericListType
                    {
                     before(grammarAccess.getTypeAccess().getGenericListTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2652);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1268:1: rule__GenericListType__ElementTypeAlternatives_0_0 : ( ( ruleUserType ) | ( ruleIntrinsicType ) );
    public final void rule__GenericListType__ElementTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1272:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=32 && LA8_0<=36)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1273:1: ( ruleUserType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1273:1: ( ruleUserType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1274:1: ruleUserType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02684);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getGenericListTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1279:6: ( ruleIntrinsicType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1279:6: ( ruleIntrinsicType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1280:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getGenericListTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02701);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1290:1: rule__UserTypeDeclaration__Alternatives : ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1294:1: ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1295:1: ( ruleComplexTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1295:1: ( ruleComplexTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1296:1: ruleComplexTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2733);
                    ruleComplexTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1301:6: ( ruleEnumTypeDeclaration )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1301:6: ( ruleEnumTypeDeclaration )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1302:1: ruleEnumTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2750);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1312:1: rule__IntrinsicType__Alternatives : ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) );
    public final void rule__IntrinsicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1316:1: ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
            case 35:
            case 36:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1317:1: ( ruleStringType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1317:1: ( ruleStringType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1318:1: ruleStringType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2782);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1323:6: ( ruleBooleanType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1323:6: ( ruleBooleanType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1324:1: ruleBooleanType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2799);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1329:6: ( ruleNumericType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1329:6: ( ruleNumericType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1330:1: ruleNumericType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2816);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1340:1: rule__NumericType__Alternatives : ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1344:1: ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 36:
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
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:1: ( ruleIntegerType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1345:1: ( ruleIntegerType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1346:1: ruleIntegerType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2848);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1351:6: ( ruleLongType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1351:6: ( ruleLongType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1352:1: ruleLongType
                    {
                     before(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2865);
                    ruleLongType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1357:6: ( ruleDoubleType )
                    {
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1357:6: ( ruleDoubleType )
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1358:1: ruleDoubleType
                    {
                     before(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2882);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1370:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1374:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1375:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02912);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02915);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1382:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1386:1: ( ( 'package' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1387:1: ( 'package' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1387:1: ( 'package' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1388:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl2943); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1401:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1405:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1406:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12974);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12977);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1413:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1417:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1418:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1418:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1419:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1420:1: ( rule__Model__PackageNameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1420:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3004);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1430:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1434:1: ( rule__Model__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1435:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23034);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1441:1: rule__Model__Group__2__Impl : ( ( rule__Model__DeclarationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1445:1: ( ( ( rule__Model__DeclarationsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1446:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1446:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1447:1: ( rule__Model__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1448:1: ( rule__Model__DeclarationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12||LA12_0==28||LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1448:2: rule__Model__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3061);
            	    rule__Model__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1464:1: rule__Client__Group__0 : rule__Client__Group__0__Impl rule__Client__Group__1 ;
    public final void rule__Client__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1468:1: ( rule__Client__Group__0__Impl rule__Client__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1469:2: rule__Client__Group__0__Impl rule__Client__Group__1
            {
            pushFollow(FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03098);
            rule__Client__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03101);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1476:1: rule__Client__Group__0__Impl : ( 'client' ) ;
    public final void rule__Client__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1480:1: ( ( 'client' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1481:1: ( 'client' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1481:1: ( 'client' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1482:1: 'client'
            {
             before(grammarAccess.getClientAccess().getClientKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Client__Group__0__Impl3129); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1495:1: rule__Client__Group__1 : rule__Client__Group__1__Impl rule__Client__Group__2 ;
    public final void rule__Client__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1499:1: ( rule__Client__Group__1__Impl rule__Client__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1500:2: rule__Client__Group__1__Impl rule__Client__Group__2
            {
            pushFollow(FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13160);
            rule__Client__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13163);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1507:1: rule__Client__Group__1__Impl : ( ( rule__Client__NameAssignment_1 ) ) ;
    public final void rule__Client__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1511:1: ( ( ( rule__Client__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1512:1: ( ( rule__Client__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1512:1: ( ( rule__Client__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1513:1: ( rule__Client__NameAssignment_1 )
            {
             before(grammarAccess.getClientAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1514:1: ( rule__Client__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1514:2: rule__Client__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3190);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1524:1: rule__Client__Group__2 : rule__Client__Group__2__Impl rule__Client__Group__3 ;
    public final void rule__Client__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1528:1: ( rule__Client__Group__2__Impl rule__Client__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1529:2: rule__Client__Group__2__Impl rule__Client__Group__3
            {
            pushFollow(FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23220);
            rule__Client__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23223);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1536:1: rule__Client__Group__2__Impl : ( ( rule__Client__BaseUrlAssignment_2 ) ) ;
    public final void rule__Client__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1540:1: ( ( ( rule__Client__BaseUrlAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1541:1: ( ( rule__Client__BaseUrlAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1541:1: ( ( rule__Client__BaseUrlAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1542:1: ( rule__Client__BaseUrlAssignment_2 )
            {
             before(grammarAccess.getClientAccess().getBaseUrlAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1543:1: ( rule__Client__BaseUrlAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1543:2: rule__Client__BaseUrlAssignment_2
            {
            pushFollow(FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3250);
            rule__Client__BaseUrlAssignment_2();

            state._fsp--;


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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1553:1: rule__Client__Group__3 : rule__Client__Group__3__Impl rule__Client__Group__4 ;
    public final void rule__Client__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1557:1: ( rule__Client__Group__3__Impl rule__Client__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1558:2: rule__Client__Group__3__Impl rule__Client__Group__4
            {
            pushFollow(FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33280);
            rule__Client__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33283);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1565:1: rule__Client__Group__3__Impl : ( '{' ) ;
    public final void rule__Client__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1569:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1570:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1570:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1571:1: '{'
            {
             before(grammarAccess.getClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Client__Group__3__Impl3311); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1584:1: rule__Client__Group__4 : rule__Client__Group__4__Impl rule__Client__Group__5 ;
    public final void rule__Client__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1588:1: ( rule__Client__Group__4__Impl rule__Client__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1589:2: rule__Client__Group__4__Impl rule__Client__Group__5
            {
            pushFollow(FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43342);
            rule__Client__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43345);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1596:1: rule__Client__Group__4__Impl : ( ( rule__Client__ParamsAssignment_4 )? ) ;
    public final void rule__Client__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1600:1: ( ( ( rule__Client__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1601:1: ( ( rule__Client__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1601:1: ( ( rule__Client__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1602:1: ( rule__Client__ParamsAssignment_4 )?
            {
             before(grammarAccess.getClientAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1603:1: ( rule__Client__ParamsAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1603:2: rule__Client__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Client__ParamsAssignment_4_in_rule__Client__Group__4__Impl3372);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1613:1: rule__Client__Group__5 : rule__Client__Group__5__Impl rule__Client__Group__6 ;
    public final void rule__Client__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1617:1: ( rule__Client__Group__5__Impl rule__Client__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1618:2: rule__Client__Group__5__Impl rule__Client__Group__6
            {
            pushFollow(FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53403);
            rule__Client__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Client__Group__6_in_rule__Client__Group__53406);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1625:1: rule__Client__Group__5__Impl : ( ( rule__Client__MethodsAssignment_5 )* ) ;
    public final void rule__Client__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1629:1: ( ( ( rule__Client__MethodsAssignment_5 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1630:1: ( ( rule__Client__MethodsAssignment_5 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1630:1: ( ( rule__Client__MethodsAssignment_5 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1631:1: ( rule__Client__MethodsAssignment_5 )*
            {
             before(grammarAccess.getClientAccess().getMethodsAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1632:1: ( rule__Client__MethodsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=15 && LA14_0<=18)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1632:2: rule__Client__MethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Client__MethodsAssignment_5_in_rule__Client__Group__5__Impl3433);
            	    rule__Client__MethodsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1642:1: rule__Client__Group__6 : rule__Client__Group__6__Impl ;
    public final void rule__Client__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1646:1: ( rule__Client__Group__6__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1647:2: rule__Client__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Client__Group__6__Impl_in_rule__Client__Group__63464);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1653:1: rule__Client__Group__6__Impl : ( '}' ) ;
    public final void rule__Client__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1657:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1658:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1658:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1659:1: '}'
            {
             before(grammarAccess.getClientAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Client__Group__6__Impl3492); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1686:1: rule__HttpPost__Group__0 : rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1 ;
    public final void rule__HttpPost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1690:1: ( rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1691:2: rule__HttpPost__Group__0__Impl rule__HttpPost__Group__1
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__0__Impl_in_rule__HttpPost__Group__03537);
            rule__HttpPost__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__1_in_rule__HttpPost__Group__03540);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1698:1: rule__HttpPost__Group__0__Impl : ( 'post' ) ;
    public final void rule__HttpPost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1702:1: ( ( 'post' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1703:1: ( 'post' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1703:1: ( 'post' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1704:1: 'post'
            {
             before(grammarAccess.getHttpPostAccess().getPostKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__HttpPost__Group__0__Impl3568); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1717:1: rule__HttpPost__Group__1 : rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2 ;
    public final void rule__HttpPost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1721:1: ( rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1722:2: rule__HttpPost__Group__1__Impl rule__HttpPost__Group__2
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__1__Impl_in_rule__HttpPost__Group__13599);
            rule__HttpPost__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__2_in_rule__HttpPost__Group__13602);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1729:1: rule__HttpPost__Group__1__Impl : ( ( rule__HttpPost__NameAssignment_1 ) ) ;
    public final void rule__HttpPost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1733:1: ( ( ( rule__HttpPost__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1734:1: ( ( rule__HttpPost__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1734:1: ( ( rule__HttpPost__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1735:1: ( rule__HttpPost__NameAssignment_1 )
            {
             before(grammarAccess.getHttpPostAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1736:1: ( rule__HttpPost__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1736:2: rule__HttpPost__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpPost__NameAssignment_1_in_rule__HttpPost__Group__1__Impl3629);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1746:1: rule__HttpPost__Group__2 : rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3 ;
    public final void rule__HttpPost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1750:1: ( rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1751:2: rule__HttpPost__Group__2__Impl rule__HttpPost__Group__3
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__2__Impl_in_rule__HttpPost__Group__23659);
            rule__HttpPost__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__3_in_rule__HttpPost__Group__23662);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1758:1: rule__HttpPost__Group__2__Impl : ( ( rule__HttpPost__PathAssignment_2 )? ) ;
    public final void rule__HttpPost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1762:1: ( ( ( rule__HttpPost__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1763:1: ( ( rule__HttpPost__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1763:1: ( ( rule__HttpPost__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1764:1: ( rule__HttpPost__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpPostAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1765:1: ( rule__HttpPost__PathAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1765:2: rule__HttpPost__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpPost__PathAssignment_2_in_rule__HttpPost__Group__2__Impl3689);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1775:1: rule__HttpPost__Group__3 : rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4 ;
    public final void rule__HttpPost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1779:1: ( rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1780:2: rule__HttpPost__Group__3__Impl rule__HttpPost__Group__4
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__3__Impl_in_rule__HttpPost__Group__33720);
            rule__HttpPost__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__4_in_rule__HttpPost__Group__33723);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1787:1: rule__HttpPost__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpPost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1791:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1792:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1792:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1793:1: '{'
            {
             before(grammarAccess.getHttpPostAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpPost__Group__3__Impl3751); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1806:1: rule__HttpPost__Group__4 : rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5 ;
    public final void rule__HttpPost__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1810:1: ( rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1811:2: rule__HttpPost__Group__4__Impl rule__HttpPost__Group__5
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__4__Impl_in_rule__HttpPost__Group__43782);
            rule__HttpPost__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__5_in_rule__HttpPost__Group__43785);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1818:1: rule__HttpPost__Group__4__Impl : ( ( rule__HttpPost__ParamsAssignment_4 )? ) ;
    public final void rule__HttpPost__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1822:1: ( ( ( rule__HttpPost__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1823:1: ( ( rule__HttpPost__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1823:1: ( ( rule__HttpPost__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1824:1: ( rule__HttpPost__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpPostAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1825:1: ( rule__HttpPost__ParamsAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1825:2: rule__HttpPost__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpPost__ParamsAssignment_4_in_rule__HttpPost__Group__4__Impl3812);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1835:1: rule__HttpPost__Group__5 : rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6 ;
    public final void rule__HttpPost__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1839:1: ( rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1840:2: rule__HttpPost__Group__5__Impl rule__HttpPost__Group__6
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__5__Impl_in_rule__HttpPost__Group__53843);
            rule__HttpPost__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__6_in_rule__HttpPost__Group__53846);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1847:1: rule__HttpPost__Group__5__Impl : ( ( rule__HttpPost__BodyAssignment_5 )? ) ;
    public final void rule__HttpPost__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1851:1: ( ( ( rule__HttpPost__BodyAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1852:1: ( ( rule__HttpPost__BodyAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1852:1: ( ( rule__HttpPost__BodyAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1853:1: ( rule__HttpPost__BodyAssignment_5 )?
            {
             before(grammarAccess.getHttpPostAccess().getBodyAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1854:1: ( rule__HttpPost__BodyAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1854:2: rule__HttpPost__BodyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpPost__BodyAssignment_5_in_rule__HttpPost__Group__5__Impl3873);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1864:1: rule__HttpPost__Group__6 : rule__HttpPost__Group__6__Impl rule__HttpPost__Group__7 ;
    public final void rule__HttpPost__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1868:1: ( rule__HttpPost__Group__6__Impl rule__HttpPost__Group__7 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1869:2: rule__HttpPost__Group__6__Impl rule__HttpPost__Group__7
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__6__Impl_in_rule__HttpPost__Group__63904);
            rule__HttpPost__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPost__Group__7_in_rule__HttpPost__Group__63907);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1876:1: rule__HttpPost__Group__6__Impl : ( ( rule__HttpPost__ResponseAssignment_6 )? ) ;
    public final void rule__HttpPost__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1880:1: ( ( ( rule__HttpPost__ResponseAssignment_6 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1881:1: ( ( rule__HttpPost__ResponseAssignment_6 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1881:1: ( ( rule__HttpPost__ResponseAssignment_6 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1882:1: ( rule__HttpPost__ResponseAssignment_6 )?
            {
             before(grammarAccess.getHttpPostAccess().getResponseAssignment_6()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1883:1: ( rule__HttpPost__ResponseAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1883:2: rule__HttpPost__ResponseAssignment_6
                    {
                    pushFollow(FOLLOW_rule__HttpPost__ResponseAssignment_6_in_rule__HttpPost__Group__6__Impl3934);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1893:1: rule__HttpPost__Group__7 : rule__HttpPost__Group__7__Impl ;
    public final void rule__HttpPost__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1897:1: ( rule__HttpPost__Group__7__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1898:2: rule__HttpPost__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__HttpPost__Group__7__Impl_in_rule__HttpPost__Group__73965);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1904:1: rule__HttpPost__Group__7__Impl : ( '}' ) ;
    public final void rule__HttpPost__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1908:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1909:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1909:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1910:1: '}'
            {
             before(grammarAccess.getHttpPostAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__HttpPost__Group__7__Impl3993); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1939:1: rule__HttpPut__Group__0 : rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1 ;
    public final void rule__HttpPut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1943:1: ( rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1944:2: rule__HttpPut__Group__0__Impl rule__HttpPut__Group__1
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__0__Impl_in_rule__HttpPut__Group__04040);
            rule__HttpPut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__1_in_rule__HttpPut__Group__04043);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1951:1: rule__HttpPut__Group__0__Impl : ( 'put' ) ;
    public final void rule__HttpPut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1955:1: ( ( 'put' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1956:1: ( 'put' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1956:1: ( 'put' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1957:1: 'put'
            {
             before(grammarAccess.getHttpPutAccess().getPutKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__HttpPut__Group__0__Impl4071); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1970:1: rule__HttpPut__Group__1 : rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2 ;
    public final void rule__HttpPut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1974:1: ( rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1975:2: rule__HttpPut__Group__1__Impl rule__HttpPut__Group__2
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__1__Impl_in_rule__HttpPut__Group__14102);
            rule__HttpPut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__2_in_rule__HttpPut__Group__14105);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1982:1: rule__HttpPut__Group__1__Impl : ( ( rule__HttpPut__NameAssignment_1 ) ) ;
    public final void rule__HttpPut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1986:1: ( ( ( rule__HttpPut__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1987:1: ( ( rule__HttpPut__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1987:1: ( ( rule__HttpPut__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1988:1: ( rule__HttpPut__NameAssignment_1 )
            {
             before(grammarAccess.getHttpPutAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1989:1: ( rule__HttpPut__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1989:2: rule__HttpPut__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpPut__NameAssignment_1_in_rule__HttpPut__Group__1__Impl4132);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:1999:1: rule__HttpPut__Group__2 : rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3 ;
    public final void rule__HttpPut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2003:1: ( rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2004:2: rule__HttpPut__Group__2__Impl rule__HttpPut__Group__3
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__2__Impl_in_rule__HttpPut__Group__24162);
            rule__HttpPut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__3_in_rule__HttpPut__Group__24165);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2011:1: rule__HttpPut__Group__2__Impl : ( ( rule__HttpPut__PathAssignment_2 )? ) ;
    public final void rule__HttpPut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2015:1: ( ( ( rule__HttpPut__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2016:1: ( ( rule__HttpPut__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2016:1: ( ( rule__HttpPut__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2017:1: ( rule__HttpPut__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpPutAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2018:1: ( rule__HttpPut__PathAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2018:2: rule__HttpPut__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpPut__PathAssignment_2_in_rule__HttpPut__Group__2__Impl4192);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2028:1: rule__HttpPut__Group__3 : rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4 ;
    public final void rule__HttpPut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2032:1: ( rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2033:2: rule__HttpPut__Group__3__Impl rule__HttpPut__Group__4
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__3__Impl_in_rule__HttpPut__Group__34223);
            rule__HttpPut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__4_in_rule__HttpPut__Group__34226);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2040:1: rule__HttpPut__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpPut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2044:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2045:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2045:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2046:1: '{'
            {
             before(grammarAccess.getHttpPutAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpPut__Group__3__Impl4254); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2059:1: rule__HttpPut__Group__4 : rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5 ;
    public final void rule__HttpPut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2063:1: ( rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2064:2: rule__HttpPut__Group__4__Impl rule__HttpPut__Group__5
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__4__Impl_in_rule__HttpPut__Group__44285);
            rule__HttpPut__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__5_in_rule__HttpPut__Group__44288);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2071:1: rule__HttpPut__Group__4__Impl : ( ( rule__HttpPut__ParamsAssignment_4 )? ) ;
    public final void rule__HttpPut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2075:1: ( ( ( rule__HttpPut__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2076:1: ( ( rule__HttpPut__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2076:1: ( ( rule__HttpPut__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2077:1: ( rule__HttpPut__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpPutAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2078:1: ( rule__HttpPut__ParamsAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2078:2: rule__HttpPut__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpPut__ParamsAssignment_4_in_rule__HttpPut__Group__4__Impl4315);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2088:1: rule__HttpPut__Group__5 : rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6 ;
    public final void rule__HttpPut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2092:1: ( rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2093:2: rule__HttpPut__Group__5__Impl rule__HttpPut__Group__6
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__5__Impl_in_rule__HttpPut__Group__54346);
            rule__HttpPut__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__6_in_rule__HttpPut__Group__54349);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2100:1: rule__HttpPut__Group__5__Impl : ( ( rule__HttpPut__BodyAssignment_5 )? ) ;
    public final void rule__HttpPut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2104:1: ( ( ( rule__HttpPut__BodyAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2105:1: ( ( rule__HttpPut__BodyAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2105:1: ( ( rule__HttpPut__BodyAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2106:1: ( rule__HttpPut__BodyAssignment_5 )?
            {
             before(grammarAccess.getHttpPutAccess().getBodyAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2107:1: ( rule__HttpPut__BodyAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2107:2: rule__HttpPut__BodyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpPut__BodyAssignment_5_in_rule__HttpPut__Group__5__Impl4376);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2117:1: rule__HttpPut__Group__6 : rule__HttpPut__Group__6__Impl rule__HttpPut__Group__7 ;
    public final void rule__HttpPut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2121:1: ( rule__HttpPut__Group__6__Impl rule__HttpPut__Group__7 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2122:2: rule__HttpPut__Group__6__Impl rule__HttpPut__Group__7
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__6__Impl_in_rule__HttpPut__Group__64407);
            rule__HttpPut__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpPut__Group__7_in_rule__HttpPut__Group__64410);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2129:1: rule__HttpPut__Group__6__Impl : ( ( rule__HttpPut__ResponseAssignment_6 )? ) ;
    public final void rule__HttpPut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2133:1: ( ( ( rule__HttpPut__ResponseAssignment_6 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2134:1: ( ( rule__HttpPut__ResponseAssignment_6 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2134:1: ( ( rule__HttpPut__ResponseAssignment_6 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2135:1: ( rule__HttpPut__ResponseAssignment_6 )?
            {
             before(grammarAccess.getHttpPutAccess().getResponseAssignment_6()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2136:1: ( rule__HttpPut__ResponseAssignment_6 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2136:2: rule__HttpPut__ResponseAssignment_6
                    {
                    pushFollow(FOLLOW_rule__HttpPut__ResponseAssignment_6_in_rule__HttpPut__Group__6__Impl4437);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2146:1: rule__HttpPut__Group__7 : rule__HttpPut__Group__7__Impl ;
    public final void rule__HttpPut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2150:1: ( rule__HttpPut__Group__7__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2151:2: rule__HttpPut__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__HttpPut__Group__7__Impl_in_rule__HttpPut__Group__74468);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2157:1: rule__HttpPut__Group__7__Impl : ( '}' ) ;
    public final void rule__HttpPut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2161:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2162:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2162:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2163:1: '}'
            {
             before(grammarAccess.getHttpPutAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__HttpPut__Group__7__Impl4496); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2192:1: rule__HttpGet__Group__0 : rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1 ;
    public final void rule__HttpGet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2196:1: ( rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2197:2: rule__HttpGet__Group__0__Impl rule__HttpGet__Group__1
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__0__Impl_in_rule__HttpGet__Group__04543);
            rule__HttpGet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__1_in_rule__HttpGet__Group__04546);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2204:1: rule__HttpGet__Group__0__Impl : ( 'get' ) ;
    public final void rule__HttpGet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2208:1: ( ( 'get' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2209:1: ( 'get' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2209:1: ( 'get' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2210:1: 'get'
            {
             before(grammarAccess.getHttpGetAccess().getGetKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__HttpGet__Group__0__Impl4574); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2223:1: rule__HttpGet__Group__1 : rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2 ;
    public final void rule__HttpGet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2227:1: ( rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2228:2: rule__HttpGet__Group__1__Impl rule__HttpGet__Group__2
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__1__Impl_in_rule__HttpGet__Group__14605);
            rule__HttpGet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__2_in_rule__HttpGet__Group__14608);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2235:1: rule__HttpGet__Group__1__Impl : ( ( rule__HttpGet__NameAssignment_1 ) ) ;
    public final void rule__HttpGet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2239:1: ( ( ( rule__HttpGet__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2240:1: ( ( rule__HttpGet__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2240:1: ( ( rule__HttpGet__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2241:1: ( rule__HttpGet__NameAssignment_1 )
            {
             before(grammarAccess.getHttpGetAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2242:1: ( rule__HttpGet__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2242:2: rule__HttpGet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpGet__NameAssignment_1_in_rule__HttpGet__Group__1__Impl4635);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2252:1: rule__HttpGet__Group__2 : rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3 ;
    public final void rule__HttpGet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2256:1: ( rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2257:2: rule__HttpGet__Group__2__Impl rule__HttpGet__Group__3
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__2__Impl_in_rule__HttpGet__Group__24665);
            rule__HttpGet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__3_in_rule__HttpGet__Group__24668);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2264:1: rule__HttpGet__Group__2__Impl : ( ( rule__HttpGet__PathAssignment_2 )? ) ;
    public final void rule__HttpGet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2268:1: ( ( ( rule__HttpGet__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2269:1: ( ( rule__HttpGet__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2269:1: ( ( rule__HttpGet__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2270:1: ( rule__HttpGet__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpGetAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2271:1: ( rule__HttpGet__PathAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2271:2: rule__HttpGet__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpGet__PathAssignment_2_in_rule__HttpGet__Group__2__Impl4695);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2281:1: rule__HttpGet__Group__3 : rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4 ;
    public final void rule__HttpGet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2285:1: ( rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2286:2: rule__HttpGet__Group__3__Impl rule__HttpGet__Group__4
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__3__Impl_in_rule__HttpGet__Group__34726);
            rule__HttpGet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__4_in_rule__HttpGet__Group__34729);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2293:1: rule__HttpGet__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpGet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2297:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2298:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2298:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2299:1: '{'
            {
             before(grammarAccess.getHttpGetAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpGet__Group__3__Impl4757); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2312:1: rule__HttpGet__Group__4 : rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5 ;
    public final void rule__HttpGet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2316:1: ( rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2317:2: rule__HttpGet__Group__4__Impl rule__HttpGet__Group__5
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__4__Impl_in_rule__HttpGet__Group__44788);
            rule__HttpGet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__5_in_rule__HttpGet__Group__44791);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2324:1: rule__HttpGet__Group__4__Impl : ( ( rule__HttpGet__ParamsAssignment_4 )? ) ;
    public final void rule__HttpGet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2328:1: ( ( ( rule__HttpGet__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2329:1: ( ( rule__HttpGet__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2329:1: ( ( rule__HttpGet__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2330:1: ( rule__HttpGet__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpGetAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2331:1: ( rule__HttpGet__ParamsAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2331:2: rule__HttpGet__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpGet__ParamsAssignment_4_in_rule__HttpGet__Group__4__Impl4818);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2341:1: rule__HttpGet__Group__5 : rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6 ;
    public final void rule__HttpGet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2345:1: ( rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2346:2: rule__HttpGet__Group__5__Impl rule__HttpGet__Group__6
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__5__Impl_in_rule__HttpGet__Group__54849);
            rule__HttpGet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpGet__Group__6_in_rule__HttpGet__Group__54852);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2353:1: rule__HttpGet__Group__5__Impl : ( ( rule__HttpGet__ResponseAssignment_5 )? ) ;
    public final void rule__HttpGet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2357:1: ( ( ( rule__HttpGet__ResponseAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2358:1: ( ( rule__HttpGet__ResponseAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2358:1: ( ( rule__HttpGet__ResponseAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2359:1: ( rule__HttpGet__ResponseAssignment_5 )?
            {
             before(grammarAccess.getHttpGetAccess().getResponseAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2360:1: ( rule__HttpGet__ResponseAssignment_5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2360:2: rule__HttpGet__ResponseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpGet__ResponseAssignment_5_in_rule__HttpGet__Group__5__Impl4879);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2370:1: rule__HttpGet__Group__6 : rule__HttpGet__Group__6__Impl ;
    public final void rule__HttpGet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2374:1: ( rule__HttpGet__Group__6__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2375:2: rule__HttpGet__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__HttpGet__Group__6__Impl_in_rule__HttpGet__Group__64910);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2381:1: rule__HttpGet__Group__6__Impl : ( '}' ) ;
    public final void rule__HttpGet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2385:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2386:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2386:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2387:1: '}'
            {
             before(grammarAccess.getHttpGetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__HttpGet__Group__6__Impl4938); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2414:1: rule__HttpDelete__Group__0 : rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1 ;
    public final void rule__HttpDelete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2418:1: ( rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2419:2: rule__HttpDelete__Group__0__Impl rule__HttpDelete__Group__1
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__0__Impl_in_rule__HttpDelete__Group__04983);
            rule__HttpDelete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__1_in_rule__HttpDelete__Group__04986);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2426:1: rule__HttpDelete__Group__0__Impl : ( 'delete' ) ;
    public final void rule__HttpDelete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2430:1: ( ( 'delete' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2431:1: ( 'delete' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2431:1: ( 'delete' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2432:1: 'delete'
            {
             before(grammarAccess.getHttpDeleteAccess().getDeleteKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__HttpDelete__Group__0__Impl5014); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2445:1: rule__HttpDelete__Group__1 : rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2 ;
    public final void rule__HttpDelete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2449:1: ( rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2450:2: rule__HttpDelete__Group__1__Impl rule__HttpDelete__Group__2
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__1__Impl_in_rule__HttpDelete__Group__15045);
            rule__HttpDelete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__2_in_rule__HttpDelete__Group__15048);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2457:1: rule__HttpDelete__Group__1__Impl : ( ( rule__HttpDelete__NameAssignment_1 ) ) ;
    public final void rule__HttpDelete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2461:1: ( ( ( rule__HttpDelete__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2462:1: ( ( rule__HttpDelete__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2462:1: ( ( rule__HttpDelete__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2463:1: ( rule__HttpDelete__NameAssignment_1 )
            {
             before(grammarAccess.getHttpDeleteAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2464:1: ( rule__HttpDelete__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2464:2: rule__HttpDelete__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpDelete__NameAssignment_1_in_rule__HttpDelete__Group__1__Impl5075);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2474:1: rule__HttpDelete__Group__2 : rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3 ;
    public final void rule__HttpDelete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2478:1: ( rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2479:2: rule__HttpDelete__Group__2__Impl rule__HttpDelete__Group__3
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__2__Impl_in_rule__HttpDelete__Group__25105);
            rule__HttpDelete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__3_in_rule__HttpDelete__Group__25108);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2486:1: rule__HttpDelete__Group__2__Impl : ( ( rule__HttpDelete__PathAssignment_2 )? ) ;
    public final void rule__HttpDelete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2490:1: ( ( ( rule__HttpDelete__PathAssignment_2 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2491:1: ( ( rule__HttpDelete__PathAssignment_2 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2491:1: ( ( rule__HttpDelete__PathAssignment_2 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2492:1: ( rule__HttpDelete__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpDeleteAccess().getPathAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2493:1: ( rule__HttpDelete__PathAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2493:2: rule__HttpDelete__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpDelete__PathAssignment_2_in_rule__HttpDelete__Group__2__Impl5135);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2503:1: rule__HttpDelete__Group__3 : rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4 ;
    public final void rule__HttpDelete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2507:1: ( rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2508:2: rule__HttpDelete__Group__3__Impl rule__HttpDelete__Group__4
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__3__Impl_in_rule__HttpDelete__Group__35166);
            rule__HttpDelete__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__4_in_rule__HttpDelete__Group__35169);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2515:1: rule__HttpDelete__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpDelete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2519:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2520:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2520:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2521:1: '{'
            {
             before(grammarAccess.getHttpDeleteAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__HttpDelete__Group__3__Impl5197); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2534:1: rule__HttpDelete__Group__4 : rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5 ;
    public final void rule__HttpDelete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2538:1: ( rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2539:2: rule__HttpDelete__Group__4__Impl rule__HttpDelete__Group__5
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__4__Impl_in_rule__HttpDelete__Group__45228);
            rule__HttpDelete__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__5_in_rule__HttpDelete__Group__45231);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2546:1: rule__HttpDelete__Group__4__Impl : ( ( rule__HttpDelete__ParamsAssignment_4 )? ) ;
    public final void rule__HttpDelete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2550:1: ( ( ( rule__HttpDelete__ParamsAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2551:1: ( ( rule__HttpDelete__ParamsAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2551:1: ( ( rule__HttpDelete__ParamsAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2552:1: ( rule__HttpDelete__ParamsAssignment_4 )?
            {
             before(grammarAccess.getHttpDeleteAccess().getParamsAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2553:1: ( rule__HttpDelete__ParamsAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2553:2: rule__HttpDelete__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__HttpDelete__ParamsAssignment_4_in_rule__HttpDelete__Group__4__Impl5258);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2563:1: rule__HttpDelete__Group__5 : rule__HttpDelete__Group__5__Impl rule__HttpDelete__Group__6 ;
    public final void rule__HttpDelete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2567:1: ( rule__HttpDelete__Group__5__Impl rule__HttpDelete__Group__6 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2568:2: rule__HttpDelete__Group__5__Impl rule__HttpDelete__Group__6
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__5__Impl_in_rule__HttpDelete__Group__55289);
            rule__HttpDelete__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpDelete__Group__6_in_rule__HttpDelete__Group__55292);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2575:1: rule__HttpDelete__Group__5__Impl : ( ( rule__HttpDelete__ResponseAssignment_5 )? ) ;
    public final void rule__HttpDelete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2579:1: ( ( ( rule__HttpDelete__ResponseAssignment_5 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2580:1: ( ( rule__HttpDelete__ResponseAssignment_5 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2580:1: ( ( rule__HttpDelete__ResponseAssignment_5 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2581:1: ( rule__HttpDelete__ResponseAssignment_5 )?
            {
             before(grammarAccess.getHttpDeleteAccess().getResponseAssignment_5()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2582:1: ( rule__HttpDelete__ResponseAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2582:2: rule__HttpDelete__ResponseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__HttpDelete__ResponseAssignment_5_in_rule__HttpDelete__Group__5__Impl5319);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2592:1: rule__HttpDelete__Group__6 : rule__HttpDelete__Group__6__Impl ;
    public final void rule__HttpDelete__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2596:1: ( rule__HttpDelete__Group__6__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2597:2: rule__HttpDelete__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__HttpDelete__Group__6__Impl_in_rule__HttpDelete__Group__65350);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2603:1: rule__HttpDelete__Group__6__Impl : ( '}' ) ;
    public final void rule__HttpDelete__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2607:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2608:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2608:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2609:1: '}'
            {
             before(grammarAccess.getHttpDeleteAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__HttpDelete__Group__6__Impl5378); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2636:1: rule__ParamsBlock__Group__0 : rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 ;
    public final void rule__ParamsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2640:1: ( rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2641:2: rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05423);
            rule__ParamsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05426);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2648:1: rule__ParamsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ParamsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2652:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2653:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2653:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2654:1: ()
            {
             before(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2655:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2657:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2667:1: rule__ParamsBlock__Group__1 : rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 ;
    public final void rule__ParamsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2671:1: ( rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2672:2: rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15484);
            rule__ParamsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15487);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2679:1: rule__ParamsBlock__Group__1__Impl : ( 'params' ) ;
    public final void rule__ParamsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2683:1: ( ( 'params' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2684:1: ( 'params' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2684:1: ( 'params' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2685:1: 'params'
            {
             before(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ParamsBlock__Group__1__Impl5515); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2698:1: rule__ParamsBlock__Group__2 : rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 ;
    public final void rule__ParamsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2702:1: ( rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2703:2: rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25546);
            rule__ParamsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25549);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2710:1: rule__ParamsBlock__Group__2__Impl : ( ( rule__ParamsBlock__ParamsAssignment_2 )* ) ;
    public final void rule__ParamsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2714:1: ( ( ( rule__ParamsBlock__ParamsAssignment_2 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2715:1: ( ( rule__ParamsBlock__ParamsAssignment_2 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2715:1: ( ( rule__ParamsBlock__ParamsAssignment_2 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2716:1: ( rule__ParamsBlock__ParamsAssignment_2 )*
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2717:1: ( rule__ParamsBlock__ParamsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2717:2: rule__ParamsBlock__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5576);
            	    rule__ParamsBlock__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2727:1: rule__ParamsBlock__Group__3 : rule__ParamsBlock__Group__3__Impl ;
    public final void rule__ParamsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2731:1: ( rule__ParamsBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2732:2: rule__ParamsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35607);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2738:1: rule__ParamsBlock__Group__3__Impl : ( ( rule__ParamsBlock__Group_3__0 )* ) ;
    public final void rule__ParamsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2742:1: ( ( ( rule__ParamsBlock__Group_3__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2743:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2743:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2744:1: ( rule__ParamsBlock__Group_3__0 )*
            {
             before(grammarAccess.getParamsBlockAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2745:1: ( rule__ParamsBlock__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2745:2: rule__ParamsBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5634);
            	    rule__ParamsBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2763:1: rule__ParamsBlock__Group_3__0 : rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 ;
    public final void rule__ParamsBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2767:1: ( rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2768:2: rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05673);
            rule__ParamsBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05676);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2775:1: rule__ParamsBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParamsBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2779:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2780:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2780:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2781:1: ','
            {
             before(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__ParamsBlock__Group_3__0__Impl5704); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2794:1: rule__ParamsBlock__Group_3__1 : rule__ParamsBlock__Group_3__1__Impl ;
    public final void rule__ParamsBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2798:1: ( rule__ParamsBlock__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2799:2: rule__ParamsBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15735);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2805:1: rule__ParamsBlock__Group_3__1__Impl : ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) ;
    public final void rule__ParamsBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2809:1: ( ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2810:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2810:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2811:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2812:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2812:2: rule__ParamsBlock__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5762);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2826:1: rule__BodyBlock__Group__0 : rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 ;
    public final void rule__BodyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2830:1: ( rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2831:2: rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05796);
            rule__BodyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05799);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2838:1: rule__BodyBlock__Group__0__Impl : ( 'body' ) ;
    public final void rule__BodyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2842:1: ( ( 'body' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2843:1: ( 'body' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2843:1: ( 'body' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2844:1: 'body'
            {
             before(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__BodyBlock__Group__0__Impl5827); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2857:1: rule__BodyBlock__Group__1 : rule__BodyBlock__Group__1__Impl ;
    public final void rule__BodyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2861:1: ( rule__BodyBlock__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2862:2: rule__BodyBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15858);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2868:1: rule__BodyBlock__Group__1__Impl : ( ( rule__BodyBlock__TypeAssignment_1 ) ) ;
    public final void rule__BodyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2872:1: ( ( ( rule__BodyBlock__TypeAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2873:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2873:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2874:1: ( rule__BodyBlock__TypeAssignment_1 )
            {
             before(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2875:1: ( rule__BodyBlock__TypeAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2875:2: rule__BodyBlock__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5885);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2889:1: rule__ResponseBlock__Group__0 : rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 ;
    public final void rule__ResponseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2893:1: ( rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2894:2: rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05919);
            rule__ResponseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05922);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2901:1: rule__ResponseBlock__Group__0__Impl : ( () ) ;
    public final void rule__ResponseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2905:1: ( ( () ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2906:1: ( () )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2906:1: ( () )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2907:1: ()
            {
             before(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2908:1: ()
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2910:1: 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2920:1: rule__ResponseBlock__Group__1 : rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 ;
    public final void rule__ResponseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2924:1: ( rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2925:2: rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15980);
            rule__ResponseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15983);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2932:1: rule__ResponseBlock__Group__1__Impl : ( 'response' ) ;
    public final void rule__ResponseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2936:1: ( ( 'response' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2937:1: ( 'response' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2937:1: ( 'response' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2938:1: 'response'
            {
             before(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ResponseBlock__Group__1__Impl6011); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2951:1: rule__ResponseBlock__Group__2 : rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 ;
    public final void rule__ResponseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2955:1: ( rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2956:2: rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__26042);
            rule__ResponseBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__26045);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2963:1: rule__ResponseBlock__Group__2__Impl : ( ( rule__ResponseBlock__Group_2__0 )? ) ;
    public final void rule__ResponseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2967:1: ( ( ( rule__ResponseBlock__Group_2__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2968:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2968:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2969:1: ( rule__ResponseBlock__Group_2__0 )?
            {
             before(grammarAccess.getResponseBlockAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2970:1: ( rule__ResponseBlock__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2970:2: rule__ResponseBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl6072);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2980:1: rule__ResponseBlock__Group__3 : rule__ResponseBlock__Group__3__Impl ;
    public final void rule__ResponseBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2984:1: ( rule__ResponseBlock__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2985:2: rule__ResponseBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36103);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2991:1: rule__ResponseBlock__Group__3__Impl : ( ( rule__ResponseBlock__TypeAssignment_3 )? ) ;
    public final void rule__ResponseBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2995:1: ( ( ( rule__ResponseBlock__TypeAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2996:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2996:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2997:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            {
             before(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2998:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==13||(LA32_0>=32 && LA32_0<=36)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:2998:2: rule__ResponseBlock__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6130);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3016:1: rule__ResponseBlock__Group_2__0 : rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 ;
    public final void rule__ResponseBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3020:1: ( rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3021:2: rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06169);
            rule__ResponseBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06172);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3028:1: rule__ResponseBlock__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ResponseBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3032:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3033:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3033:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3034:1: 'extends'
            {
             before(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__ResponseBlock__Group_2__0__Impl6200); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3047:1: rule__ResponseBlock__Group_2__1 : rule__ResponseBlock__Group_2__1__Impl ;
    public final void rule__ResponseBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3051:1: ( rule__ResponseBlock__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3052:2: rule__ResponseBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16231);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3058:1: rule__ResponseBlock__Group_2__1__Impl : ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__ResponseBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3062:1: ( ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3063:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3063:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3064:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3065:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3065:2: rule__ResponseBlock__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6258);
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


    // $ANTLR start "rule__IDNamedMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3079:1: rule__IDNamedMember__Group__0 : rule__IDNamedMember__Group__0__Impl rule__IDNamedMember__Group__1 ;
    public final void rule__IDNamedMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3083:1: ( rule__IDNamedMember__Group__0__Impl rule__IDNamedMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3084:2: rule__IDNamedMember__Group__0__Impl rule__IDNamedMember__Group__1
            {
            pushFollow(FOLLOW_rule__IDNamedMember__Group__0__Impl_in_rule__IDNamedMember__Group__06292);
            rule__IDNamedMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IDNamedMember__Group__1_in_rule__IDNamedMember__Group__06295);
            rule__IDNamedMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__Group__0"


    // $ANTLR start "rule__IDNamedMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3091:1: rule__IDNamedMember__Group__0__Impl : ( ( rule__IDNamedMember__NameAssignment_0 ) ) ;
    public final void rule__IDNamedMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3095:1: ( ( ( rule__IDNamedMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3096:1: ( ( rule__IDNamedMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3096:1: ( ( rule__IDNamedMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3097:1: ( rule__IDNamedMember__NameAssignment_0 )
            {
             before(grammarAccess.getIDNamedMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3098:1: ( rule__IDNamedMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3098:2: rule__IDNamedMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IDNamedMember__NameAssignment_0_in_rule__IDNamedMember__Group__0__Impl6322);
            rule__IDNamedMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIDNamedMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__Group__0__Impl"


    // $ANTLR start "rule__IDNamedMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3108:1: rule__IDNamedMember__Group__1 : rule__IDNamedMember__Group__1__Impl rule__IDNamedMember__Group__2 ;
    public final void rule__IDNamedMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3112:1: ( rule__IDNamedMember__Group__1__Impl rule__IDNamedMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3113:2: rule__IDNamedMember__Group__1__Impl rule__IDNamedMember__Group__2
            {
            pushFollow(FOLLOW_rule__IDNamedMember__Group__1__Impl_in_rule__IDNamedMember__Group__16352);
            rule__IDNamedMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IDNamedMember__Group__2_in_rule__IDNamedMember__Group__16355);
            rule__IDNamedMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__Group__1"


    // $ANTLR start "rule__IDNamedMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3120:1: rule__IDNamedMember__Group__1__Impl : ( ':' ) ;
    public final void rule__IDNamedMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3124:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3125:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3125:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3126:1: ':'
            {
             before(grammarAccess.getIDNamedMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__IDNamedMember__Group__1__Impl6383); 
             after(grammarAccess.getIDNamedMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__Group__1__Impl"


    // $ANTLR start "rule__IDNamedMember__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3139:1: rule__IDNamedMember__Group__2 : rule__IDNamedMember__Group__2__Impl ;
    public final void rule__IDNamedMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3143:1: ( rule__IDNamedMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3144:2: rule__IDNamedMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IDNamedMember__Group__2__Impl_in_rule__IDNamedMember__Group__26414);
            rule__IDNamedMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__Group__2"


    // $ANTLR start "rule__IDNamedMember__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3150:1: rule__IDNamedMember__Group__2__Impl : ( ( rule__IDNamedMember__TypeAssignment_2 ) ) ;
    public final void rule__IDNamedMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3154:1: ( ( ( rule__IDNamedMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3155:1: ( ( rule__IDNamedMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3155:1: ( ( rule__IDNamedMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3156:1: ( rule__IDNamedMember__TypeAssignment_2 )
            {
             before(grammarAccess.getIDNamedMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3157:1: ( rule__IDNamedMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3157:2: rule__IDNamedMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__IDNamedMember__TypeAssignment_2_in_rule__IDNamedMember__Group__2__Impl6441);
            rule__IDNamedMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIDNamedMemberAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__Group__2__Impl"


    // $ANTLR start "rule__StringNamedMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3173:1: rule__StringNamedMember__Group__0 : rule__StringNamedMember__Group__0__Impl rule__StringNamedMember__Group__1 ;
    public final void rule__StringNamedMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3177:1: ( rule__StringNamedMember__Group__0__Impl rule__StringNamedMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3178:2: rule__StringNamedMember__Group__0__Impl rule__StringNamedMember__Group__1
            {
            pushFollow(FOLLOW_rule__StringNamedMember__Group__0__Impl_in_rule__StringNamedMember__Group__06477);
            rule__StringNamedMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringNamedMember__Group__1_in_rule__StringNamedMember__Group__06480);
            rule__StringNamedMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__Group__0"


    // $ANTLR start "rule__StringNamedMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3185:1: rule__StringNamedMember__Group__0__Impl : ( ( rule__StringNamedMember__NameAssignment_0 ) ) ;
    public final void rule__StringNamedMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3189:1: ( ( ( rule__StringNamedMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3190:1: ( ( rule__StringNamedMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3190:1: ( ( rule__StringNamedMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3191:1: ( rule__StringNamedMember__NameAssignment_0 )
            {
             before(grammarAccess.getStringNamedMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3192:1: ( rule__StringNamedMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3192:2: rule__StringNamedMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StringNamedMember__NameAssignment_0_in_rule__StringNamedMember__Group__0__Impl6507);
            rule__StringNamedMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringNamedMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__Group__0__Impl"


    // $ANTLR start "rule__StringNamedMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3202:1: rule__StringNamedMember__Group__1 : rule__StringNamedMember__Group__1__Impl rule__StringNamedMember__Group__2 ;
    public final void rule__StringNamedMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3206:1: ( rule__StringNamedMember__Group__1__Impl rule__StringNamedMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3207:2: rule__StringNamedMember__Group__1__Impl rule__StringNamedMember__Group__2
            {
            pushFollow(FOLLOW_rule__StringNamedMember__Group__1__Impl_in_rule__StringNamedMember__Group__16537);
            rule__StringNamedMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringNamedMember__Group__2_in_rule__StringNamedMember__Group__16540);
            rule__StringNamedMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__Group__1"


    // $ANTLR start "rule__StringNamedMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3214:1: rule__StringNamedMember__Group__1__Impl : ( ':' ) ;
    public final void rule__StringNamedMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3218:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3219:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3219:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3220:1: ':'
            {
             before(grammarAccess.getStringNamedMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__StringNamedMember__Group__1__Impl6568); 
             after(grammarAccess.getStringNamedMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__Group__1__Impl"


    // $ANTLR start "rule__StringNamedMember__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3233:1: rule__StringNamedMember__Group__2 : rule__StringNamedMember__Group__2__Impl ;
    public final void rule__StringNamedMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3237:1: ( rule__StringNamedMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3238:2: rule__StringNamedMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringNamedMember__Group__2__Impl_in_rule__StringNamedMember__Group__26599);
            rule__StringNamedMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__Group__2"


    // $ANTLR start "rule__StringNamedMember__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3244:1: rule__StringNamedMember__Group__2__Impl : ( ( rule__StringNamedMember__TypeAssignment_2 ) ) ;
    public final void rule__StringNamedMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3248:1: ( ( ( rule__StringNamedMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3249:1: ( ( rule__StringNamedMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3249:1: ( ( rule__StringNamedMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3250:1: ( rule__StringNamedMember__TypeAssignment_2 )
            {
             before(grammarAccess.getStringNamedMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3251:1: ( rule__StringNamedMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3251:2: rule__StringNamedMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__StringNamedMember__TypeAssignment_2_in_rule__StringNamedMember__Group__2__Impl6626);
            rule__StringNamedMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringNamedMemberAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__Group__2__Impl"


    // $ANTLR start "rule__SkipMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3267:1: rule__SkipMember__Group__0 : rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 ;
    public final void rule__SkipMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3271:1: ( rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3272:2: rule__SkipMember__Group__0__Impl rule__SkipMember__Group__1
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__06662);
            rule__SkipMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__06665);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3279:1: rule__SkipMember__Group__0__Impl : ( 'skip' ) ;
    public final void rule__SkipMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3283:1: ( ( 'skip' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3284:1: ( 'skip' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3284:1: ( 'skip' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3285:1: 'skip'
            {
             before(grammarAccess.getSkipMemberAccess().getSkipKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__SkipMember__Group__0__Impl6693); 
             after(grammarAccess.getSkipMemberAccess().getSkipKeyword_0()); 

            }


            }

        }
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3298:1: rule__SkipMember__Group__1 : rule__SkipMember__Group__1__Impl rule__SkipMember__Group__2 ;
    public final void rule__SkipMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3302:1: ( rule__SkipMember__Group__1__Impl rule__SkipMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3303:2: rule__SkipMember__Group__1__Impl rule__SkipMember__Group__2
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__16724);
            rule__SkipMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SkipMember__Group__2_in_rule__SkipMember__Group__16727);
            rule__SkipMember__Group__2();

            state._fsp--;


            }

        }
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3310:1: rule__SkipMember__Group__1__Impl : ( ( rule__SkipMember__NameAssignment_1 ) ) ;
    public final void rule__SkipMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3314:1: ( ( ( rule__SkipMember__NameAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3315:1: ( ( rule__SkipMember__NameAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3315:1: ( ( rule__SkipMember__NameAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3316:1: ( rule__SkipMember__NameAssignment_1 )
            {
             before(grammarAccess.getSkipMemberAccess().getNameAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3317:1: ( rule__SkipMember__NameAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3317:2: rule__SkipMember__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SkipMember__NameAssignment_1_in_rule__SkipMember__Group__1__Impl6754);
            rule__SkipMember__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkipMemberAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SkipMember__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3327:1: rule__SkipMember__Group__2 : rule__SkipMember__Group__2__Impl ;
    public final void rule__SkipMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3331:1: ( rule__SkipMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3332:2: rule__SkipMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SkipMember__Group__2__Impl_in_rule__SkipMember__Group__26784);
            rule__SkipMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipMember__Group__2"


    // $ANTLR start "rule__SkipMember__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3338:1: rule__SkipMember__Group__2__Impl : ( ( rule__SkipMember__LiteralAssignment_2 ) ) ;
    public final void rule__SkipMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3342:1: ( ( ( rule__SkipMember__LiteralAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3343:1: ( ( rule__SkipMember__LiteralAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3343:1: ( ( rule__SkipMember__LiteralAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3344:1: ( rule__SkipMember__LiteralAssignment_2 )
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3345:1: ( rule__SkipMember__LiteralAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3345:2: rule__SkipMember__LiteralAssignment_2
            {
            pushFollow(FOLLOW_rule__SkipMember__LiteralAssignment_2_in_rule__SkipMember__Group__2__Impl6811);
            rule__SkipMember__LiteralAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSkipMemberAccess().getLiteralAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipMember__Group__2__Impl"


    // $ANTLR start "rule__IDNamedSimpleMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3361:1: rule__IDNamedSimpleMember__Group__0 : rule__IDNamedSimpleMember__Group__0__Impl rule__IDNamedSimpleMember__Group__1 ;
    public final void rule__IDNamedSimpleMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3365:1: ( rule__IDNamedSimpleMember__Group__0__Impl rule__IDNamedSimpleMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3366:2: rule__IDNamedSimpleMember__Group__0__Impl rule__IDNamedSimpleMember__Group__1
            {
            pushFollow(FOLLOW_rule__IDNamedSimpleMember__Group__0__Impl_in_rule__IDNamedSimpleMember__Group__06847);
            rule__IDNamedSimpleMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IDNamedSimpleMember__Group__1_in_rule__IDNamedSimpleMember__Group__06850);
            rule__IDNamedSimpleMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__Group__0"


    // $ANTLR start "rule__IDNamedSimpleMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3373:1: rule__IDNamedSimpleMember__Group__0__Impl : ( ( rule__IDNamedSimpleMember__NameAssignment_0 ) ) ;
    public final void rule__IDNamedSimpleMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3377:1: ( ( ( rule__IDNamedSimpleMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3378:1: ( ( rule__IDNamedSimpleMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3378:1: ( ( rule__IDNamedSimpleMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3379:1: ( rule__IDNamedSimpleMember__NameAssignment_0 )
            {
             before(grammarAccess.getIDNamedSimpleMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3380:1: ( rule__IDNamedSimpleMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3380:2: rule__IDNamedSimpleMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IDNamedSimpleMember__NameAssignment_0_in_rule__IDNamedSimpleMember__Group__0__Impl6877);
            rule__IDNamedSimpleMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIDNamedSimpleMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__Group__0__Impl"


    // $ANTLR start "rule__IDNamedSimpleMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3390:1: rule__IDNamedSimpleMember__Group__1 : rule__IDNamedSimpleMember__Group__1__Impl rule__IDNamedSimpleMember__Group__2 ;
    public final void rule__IDNamedSimpleMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3394:1: ( rule__IDNamedSimpleMember__Group__1__Impl rule__IDNamedSimpleMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3395:2: rule__IDNamedSimpleMember__Group__1__Impl rule__IDNamedSimpleMember__Group__2
            {
            pushFollow(FOLLOW_rule__IDNamedSimpleMember__Group__1__Impl_in_rule__IDNamedSimpleMember__Group__16907);
            rule__IDNamedSimpleMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IDNamedSimpleMember__Group__2_in_rule__IDNamedSimpleMember__Group__16910);
            rule__IDNamedSimpleMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__Group__1"


    // $ANTLR start "rule__IDNamedSimpleMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3402:1: rule__IDNamedSimpleMember__Group__1__Impl : ( ':' ) ;
    public final void rule__IDNamedSimpleMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3406:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3407:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3407:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3408:1: ':'
            {
             before(grammarAccess.getIDNamedSimpleMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__IDNamedSimpleMember__Group__1__Impl6938); 
             after(grammarAccess.getIDNamedSimpleMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__Group__1__Impl"


    // $ANTLR start "rule__IDNamedSimpleMember__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3421:1: rule__IDNamedSimpleMember__Group__2 : rule__IDNamedSimpleMember__Group__2__Impl ;
    public final void rule__IDNamedSimpleMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3425:1: ( rule__IDNamedSimpleMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3426:2: rule__IDNamedSimpleMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IDNamedSimpleMember__Group__2__Impl_in_rule__IDNamedSimpleMember__Group__26969);
            rule__IDNamedSimpleMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__Group__2"


    // $ANTLR start "rule__IDNamedSimpleMember__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3432:1: rule__IDNamedSimpleMember__Group__2__Impl : ( ( rule__IDNamedSimpleMember__TypeAssignment_2 ) ) ;
    public final void rule__IDNamedSimpleMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3436:1: ( ( ( rule__IDNamedSimpleMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3437:1: ( ( rule__IDNamedSimpleMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3437:1: ( ( rule__IDNamedSimpleMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3438:1: ( rule__IDNamedSimpleMember__TypeAssignment_2 )
            {
             before(grammarAccess.getIDNamedSimpleMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3439:1: ( rule__IDNamedSimpleMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3439:2: rule__IDNamedSimpleMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__IDNamedSimpleMember__TypeAssignment_2_in_rule__IDNamedSimpleMember__Group__2__Impl6996);
            rule__IDNamedSimpleMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIDNamedSimpleMemberAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__Group__2__Impl"


    // $ANTLR start "rule__StringNamedSimpleMember__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3455:1: rule__StringNamedSimpleMember__Group__0 : rule__StringNamedSimpleMember__Group__0__Impl rule__StringNamedSimpleMember__Group__1 ;
    public final void rule__StringNamedSimpleMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3459:1: ( rule__StringNamedSimpleMember__Group__0__Impl rule__StringNamedSimpleMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3460:2: rule__StringNamedSimpleMember__Group__0__Impl rule__StringNamedSimpleMember__Group__1
            {
            pushFollow(FOLLOW_rule__StringNamedSimpleMember__Group__0__Impl_in_rule__StringNamedSimpleMember__Group__07032);
            rule__StringNamedSimpleMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringNamedSimpleMember__Group__1_in_rule__StringNamedSimpleMember__Group__07035);
            rule__StringNamedSimpleMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__Group__0"


    // $ANTLR start "rule__StringNamedSimpleMember__Group__0__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3467:1: rule__StringNamedSimpleMember__Group__0__Impl : ( ( rule__StringNamedSimpleMember__NameAssignment_0 ) ) ;
    public final void rule__StringNamedSimpleMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3471:1: ( ( ( rule__StringNamedSimpleMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3472:1: ( ( rule__StringNamedSimpleMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3472:1: ( ( rule__StringNamedSimpleMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3473:1: ( rule__StringNamedSimpleMember__NameAssignment_0 )
            {
             before(grammarAccess.getStringNamedSimpleMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3474:1: ( rule__StringNamedSimpleMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3474:2: rule__StringNamedSimpleMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StringNamedSimpleMember__NameAssignment_0_in_rule__StringNamedSimpleMember__Group__0__Impl7062);
            rule__StringNamedSimpleMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringNamedSimpleMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__Group__0__Impl"


    // $ANTLR start "rule__StringNamedSimpleMember__Group__1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3484:1: rule__StringNamedSimpleMember__Group__1 : rule__StringNamedSimpleMember__Group__1__Impl rule__StringNamedSimpleMember__Group__2 ;
    public final void rule__StringNamedSimpleMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3488:1: ( rule__StringNamedSimpleMember__Group__1__Impl rule__StringNamedSimpleMember__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3489:2: rule__StringNamedSimpleMember__Group__1__Impl rule__StringNamedSimpleMember__Group__2
            {
            pushFollow(FOLLOW_rule__StringNamedSimpleMember__Group__1__Impl_in_rule__StringNamedSimpleMember__Group__17092);
            rule__StringNamedSimpleMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringNamedSimpleMember__Group__2_in_rule__StringNamedSimpleMember__Group__17095);
            rule__StringNamedSimpleMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__Group__1"


    // $ANTLR start "rule__StringNamedSimpleMember__Group__1__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3496:1: rule__StringNamedSimpleMember__Group__1__Impl : ( ':' ) ;
    public final void rule__StringNamedSimpleMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3500:1: ( ( ':' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3501:1: ( ':' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3501:1: ( ':' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3502:1: ':'
            {
             before(grammarAccess.getStringNamedSimpleMemberAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__StringNamedSimpleMember__Group__1__Impl7123); 
             after(grammarAccess.getStringNamedSimpleMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__Group__1__Impl"


    // $ANTLR start "rule__StringNamedSimpleMember__Group__2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3515:1: rule__StringNamedSimpleMember__Group__2 : rule__StringNamedSimpleMember__Group__2__Impl ;
    public final void rule__StringNamedSimpleMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3519:1: ( rule__StringNamedSimpleMember__Group__2__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3520:2: rule__StringNamedSimpleMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringNamedSimpleMember__Group__2__Impl_in_rule__StringNamedSimpleMember__Group__27154);
            rule__StringNamedSimpleMember__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__Group__2"


    // $ANTLR start "rule__StringNamedSimpleMember__Group__2__Impl"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3526:1: rule__StringNamedSimpleMember__Group__2__Impl : ( ( rule__StringNamedSimpleMember__TypeAssignment_2 ) ) ;
    public final void rule__StringNamedSimpleMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3530:1: ( ( ( rule__StringNamedSimpleMember__TypeAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3531:1: ( ( rule__StringNamedSimpleMember__TypeAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3531:1: ( ( rule__StringNamedSimpleMember__TypeAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3532:1: ( rule__StringNamedSimpleMember__TypeAssignment_2 )
            {
             before(grammarAccess.getStringNamedSimpleMemberAccess().getTypeAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3533:1: ( rule__StringNamedSimpleMember__TypeAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3533:2: rule__StringNamedSimpleMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__StringNamedSimpleMember__TypeAssignment_2_in_rule__StringNamedSimpleMember__Group__2__Impl7181);
            rule__StringNamedSimpleMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringNamedSimpleMemberAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__Group__2__Impl"


    // $ANTLR start "rule__GenericListType__Group__0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3549:1: rule__GenericListType__Group__0 : rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 ;
    public final void rule__GenericListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3553:1: ( rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3554:2: rule__GenericListType__Group__0__Impl rule__GenericListType__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__07217);
            rule__GenericListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__07220);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3561:1: rule__GenericListType__Group__0__Impl : ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) ;
    public final void rule__GenericListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3565:1: ( ( ( rule__GenericListType__ElementTypeAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3566:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3566:1: ( ( rule__GenericListType__ElementTypeAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3567:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3568:1: ( rule__GenericListType__ElementTypeAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3568:2: rule__GenericListType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl7247);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3578:1: rule__GenericListType__Group__1 : rule__GenericListType__Group__1__Impl ;
    public final void rule__GenericListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3582:1: ( rule__GenericListType__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3583:2: rule__GenericListType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__17277);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3589:1: rule__GenericListType__Group__1__Impl : ( ( rule__GenericListType__IdAssignment_1 ) ) ;
    public final void rule__GenericListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3593:1: ( ( ( rule__GenericListType__IdAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3594:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3594:1: ( ( rule__GenericListType__IdAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3595:1: ( rule__GenericListType__IdAssignment_1 )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3596:1: ( rule__GenericListType__IdAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3596:2: rule__GenericListType__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl7304);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3610:1: rule__ComplexTypeDeclaration__Group__0 : rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 ;
    public final void rule__ComplexTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3614:1: ( rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3615:2: rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__07338);
            rule__ComplexTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__07341);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3622:1: rule__ComplexTypeDeclaration__Group__0__Impl : ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3626:1: ( ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3627:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3627:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3628:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3629:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3629:2: rule__ComplexTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl7368);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3639:1: rule__ComplexTypeDeclaration__Group__1 : rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 ;
    public final void rule__ComplexTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3643:1: ( rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3644:2: rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__17398);
            rule__ComplexTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__17401);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3651:1: rule__ComplexTypeDeclaration__Group__1__Impl : ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3655:1: ( ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3656:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3656:1: ( ( rule__ComplexTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3657:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3658:1: ( rule__ComplexTypeDeclaration__GenAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3658:2: rule__ComplexTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl7428);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3668:1: rule__ComplexTypeDeclaration__Group__2 : rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 ;
    public final void rule__ComplexTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3672:1: ( rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3673:2: rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__27459);
            rule__ComplexTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__27462);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3680:1: rule__ComplexTypeDeclaration__Group__2__Impl : ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3684:1: ( ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3685:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3685:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3686:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3687:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3687:2: rule__ComplexTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl7489);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3697:1: rule__ComplexTypeDeclaration__Group__3 : rule__ComplexTypeDeclaration__Group__3__Impl ;
    public final void rule__ComplexTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3701:1: ( rule__ComplexTypeDeclaration__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3702:2: rule__ComplexTypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__37519);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3708:1: rule__ComplexTypeDeclaration__Group__3__Impl : ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3712:1: ( ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3713:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3713:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3714:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3715:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==13) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3715:2: rule__ComplexTypeDeclaration__LiteralAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl7546);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3733:1: rule__EnumTypeDeclaration__Group__0 : rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 ;
    public final void rule__EnumTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3737:1: ( rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3738:2: rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07585);
            rule__EnumTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07588);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3745:1: rule__EnumTypeDeclaration__Group__0__Impl : ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3749:1: ( ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3750:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3750:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3751:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3752:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3752:2: rule__EnumTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7615);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3762:1: rule__EnumTypeDeclaration__Group__1 : rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 ;
    public final void rule__EnumTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3766:1: ( rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3767:2: rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17645);
            rule__EnumTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17648);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3774:1: rule__EnumTypeDeclaration__Group__1__Impl : ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3778:1: ( ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3779:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3779:1: ( ( rule__EnumTypeDeclaration__GenAssignment_1 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3780:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3781:1: ( rule__EnumTypeDeclaration__GenAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3781:2: rule__EnumTypeDeclaration__GenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7675);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3791:1: rule__EnumTypeDeclaration__Group__2 : rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 ;
    public final void rule__EnumTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3795:1: ( rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3796:2: rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27706);
            rule__EnumTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27709);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3803:1: rule__EnumTypeDeclaration__Group__2__Impl : ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3807:1: ( ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3808:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3808:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3809:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3810:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3810:2: rule__EnumTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7736);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3820:1: rule__EnumTypeDeclaration__Group__3 : rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 ;
    public final void rule__EnumTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3824:1: ( rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3825:2: rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37766);
            rule__EnumTypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37769);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3832:1: rule__EnumTypeDeclaration__Group__3__Impl : ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3836:1: ( ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3837:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3837:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3838:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3839:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3839:2: rule__EnumTypeDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7796);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3849:1: rule__EnumTypeDeclaration__Group__4 : rule__EnumTypeDeclaration__Group__4__Impl ;
    public final void rule__EnumTypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3853:1: ( rule__EnumTypeDeclaration__Group__4__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3854:2: rule__EnumTypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47827);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3860:1: rule__EnumTypeDeclaration__Group__4__Impl : ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3864:1: ( ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3865:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3865:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3866:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3867:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3867:2: rule__EnumTypeDeclaration__LiteralAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7854);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3887:1: rule__EnumTypeDeclaration__Group_3__0 : rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 ;
    public final void rule__EnumTypeDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3891:1: ( rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3892:2: rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07895);
            rule__EnumTypeDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07898);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3899:1: rule__EnumTypeDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EnumTypeDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3903:1: ( ( 'extends' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3904:1: ( 'extends' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3904:1: ( 'extends' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3905:1: 'extends'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__EnumTypeDeclaration__Group_3__0__Impl7926); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3918:1: rule__EnumTypeDeclaration__Group_3__1 : rule__EnumTypeDeclaration__Group_3__1__Impl ;
    public final void rule__EnumTypeDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3922:1: ( rule__EnumTypeDeclaration__Group_3__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3923:2: rule__EnumTypeDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17957);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3929:1: rule__EnumTypeDeclaration__Group_3__1__Impl : ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3933:1: ( ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3934:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3934:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3935:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3936:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3936:2: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7984);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3950:1: rule__EnumTypeLiteral__Group__0 : rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 ;
    public final void rule__EnumTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3954:1: ( rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3955:2: rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__08018);
            rule__EnumTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__08021);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3962:1: rule__EnumTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3966:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3967:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3967:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3968:1: '{'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__EnumTypeLiteral__Group__0__Impl8049); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3981:1: rule__EnumTypeLiteral__Group__1 : rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 ;
    public final void rule__EnumTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3985:1: ( rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3986:2: rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__18080);
            rule__EnumTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__18083);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3993:1: rule__EnumTypeLiteral__Group__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3997:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3998:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3998:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:3999:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4000:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4000:2: rule__EnumTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl8110);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4010:1: rule__EnumTypeLiteral__Group__2 : rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 ;
    public final void rule__EnumTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4014:1: ( rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4015:2: rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__28140);
            rule__EnumTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__28143);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4022:1: rule__EnumTypeLiteral__Group__2__Impl : ( ( rule__EnumTypeLiteral__Group_2__0 )* ) ;
    public final void rule__EnumTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4026:1: ( ( ( rule__EnumTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4027:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4027:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4028:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4029:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4029:2: rule__EnumTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl8170);
            	    rule__EnumTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4039:1: rule__EnumTypeLiteral__Group__3 : rule__EnumTypeLiteral__Group__3__Impl ;
    public final void rule__EnumTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4043:1: ( rule__EnumTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4044:2: rule__EnumTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__38201);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4050:1: rule__EnumTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4054:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4055:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4055:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4056:1: '}'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__EnumTypeLiteral__Group__3__Impl8229); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4077:1: rule__EnumTypeLiteral__Group_2__0 : rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 ;
    public final void rule__EnumTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4081:1: ( rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4082:2: rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__08268);
            rule__EnumTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__08271);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4089:1: rule__EnumTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4093:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4094:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4094:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4095:1: ','
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__EnumTypeLiteral__Group_2__0__Impl8299); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4108:1: rule__EnumTypeLiteral__Group_2__1 : rule__EnumTypeLiteral__Group_2__1__Impl ;
    public final void rule__EnumTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4112:1: ( rule__EnumTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4113:2: rule__EnumTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__18330);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4119:1: rule__EnumTypeLiteral__Group_2__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4123:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4124:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4124:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4125:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4126:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4126:2: rule__EnumTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl8357);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4140:1: rule__EnumMember__Group__0 : rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4144:1: ( rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4145:2: rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__08391);
            rule__EnumMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__08394);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4152:1: rule__EnumMember__Group__0__Impl : ( ( rule__EnumMember__NameAssignment_0 ) ) ;
    public final void rule__EnumMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4156:1: ( ( ( rule__EnumMember__NameAssignment_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4157:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4157:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4158:1: ( rule__EnumMember__NameAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4159:1: ( rule__EnumMember__NameAssignment_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4159:2: rule__EnumMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl8421);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4169:1: rule__EnumMember__Group__1 : rule__EnumMember__Group__1__Impl ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4173:1: ( rule__EnumMember__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4174:2: rule__EnumMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__18451);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4180:1: rule__EnumMember__Group__1__Impl : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4184:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4185:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4185:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4186:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4187:1: ( rule__EnumMember__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4187:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl8478);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4201:1: rule__EnumMember__Group_1__0 : rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4205:1: ( rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4206:2: rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__08513);
            rule__EnumMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__08516);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4213:1: rule__EnumMember__Group_1__0__Impl : ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) ;
    public final void rule__EnumMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4217:1: ( ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4218:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4218:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4219:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4220:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4220:2: rule__EnumMember__AssignmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl8543);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4230:1: rule__EnumMember__Group_1__1 : rule__EnumMember__Group_1__1__Impl ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4234:1: ( rule__EnumMember__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4235:2: rule__EnumMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18573);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4241:1: rule__EnumMember__Group_1__1__Impl : ( ( rule__EnumMember__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4245:1: ( ( ( rule__EnumMember__ValueAssignment_1_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4246:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4246:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4247:1: ( rule__EnumMember__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4248:1: ( rule__EnumMember__ValueAssignment_1_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4248:2: rule__EnumMember__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8600);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4262:1: rule__ComplexTypeLiteral__Group__0 : rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 ;
    public final void rule__ComplexTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4266:1: ( rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4267:2: rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08634);
            rule__ComplexTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08637);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4274:1: rule__ComplexTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4278:1: ( ( '{' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4279:1: ( '{' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4279:1: ( '{' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4280:1: '{'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ComplexTypeLiteral__Group__0__Impl8665); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4293:1: rule__ComplexTypeLiteral__Group__1 : rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 ;
    public final void rule__ComplexTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4297:1: ( rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4298:2: rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18696);
            rule__ComplexTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18699);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4305:1: rule__ComplexTypeLiteral__Group__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4309:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4310:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4310:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4311:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4312:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4312:2: rule__ComplexTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8726);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4322:1: rule__ComplexTypeLiteral__Group__2 : rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 ;
    public final void rule__ComplexTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4326:1: ( rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4327:2: rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28756);
            rule__ComplexTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28759);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4334:1: rule__ComplexTypeLiteral__Group__2__Impl : ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) ;
    public final void rule__ComplexTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4338:1: ( ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4339:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4339:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4340:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4341:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4341:2: rule__ComplexTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8786);
            	    rule__ComplexTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4351:1: rule__ComplexTypeLiteral__Group__3 : rule__ComplexTypeLiteral__Group__3__Impl ;
    public final void rule__ComplexTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4355:1: ( rule__ComplexTypeLiteral__Group__3__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4356:2: rule__ComplexTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38817);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4362:1: rule__ComplexTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ComplexTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4366:1: ( ( '}' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4367:1: ( '}' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4367:1: ( '}' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4368:1: '}'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ComplexTypeLiteral__Group__3__Impl8845); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4389:1: rule__ComplexTypeLiteral__Group_2__0 : rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 ;
    public final void rule__ComplexTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4393:1: ( rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4394:2: rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08884);
            rule__ComplexTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08887);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4401:1: rule__ComplexTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4405:1: ( ( ',' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4406:1: ( ',' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4406:1: ( ',' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4407:1: ','
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__ComplexTypeLiteral__Group_2__0__Impl8915); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4420:1: rule__ComplexTypeLiteral__Group_2__1 : rule__ComplexTypeLiteral__Group_2__1__Impl ;
    public final void rule__ComplexTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4424:1: ( rule__ComplexTypeLiteral__Group_2__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4425:2: rule__ComplexTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18946);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4431:1: rule__ComplexTypeLiteral__Group_2__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4435:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4436:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4436:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4437:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4438:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4438:2: rule__ComplexTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8973);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4452:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4456:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4457:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09007);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09010);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4464:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4468:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4469:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4469:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4470:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9037); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4481:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4485:1: ( rule__FQN__Group__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4486:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19066);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4492:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4496:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4497:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4497:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4498:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4499:1: ( rule__FQN__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==26) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4499:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9093);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4513:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4517:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4518:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09128);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09131);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4525:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4529:1: ( ( '.' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4530:1: ( '.' )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4530:1: ( '.' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4531:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__FQN__Group_1__0__Impl9159); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4544:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4548:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4549:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19190);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4555:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4559:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4560:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4560:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4561:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9217); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4577:1: rule__Model__PackageNameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4581:1: ( ( ruleFQN ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4582:1: ( ruleFQN )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4582:1: ( ruleFQN )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4583:1: ruleFQN
            {
             before(grammarAccess.getModelAccess().getPackageNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_19255);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4592:1: rule__Model__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4596:1: ( ( ruleDeclaration ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4597:1: ( ruleDeclaration )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4597:1: ( ruleDeclaration )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4598:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_29286);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4607:1: rule__Client__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Client__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4611:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4612:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4612:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4613:1: RULE_ID
            {
             before(grammarAccess.getClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Client__NameAssignment_19317); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4622:1: rule__Client__BaseUrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Client__BaseUrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4626:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4627:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4627:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4628:1: RULE_STRING
            {
             before(grammarAccess.getClientAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_29348); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4637:1: rule__Client__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__Client__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4641:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4642:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4642:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4643:1: ruleParamsBlock
            {
             before(grammarAccess.getClientAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__Client__ParamsAssignment_49379);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4652:1: rule__Client__MethodsAssignment_5 : ( ruleHttpMethod ) ;
    public final void rule__Client__MethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4656:1: ( ( ruleHttpMethod ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4657:1: ( ruleHttpMethod )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4657:1: ( ruleHttpMethod )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4658:1: ruleHttpMethod
            {
             before(grammarAccess.getClientAccess().getMethodsHttpMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_rule__Client__MethodsAssignment_59410);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4667:1: rule__HttpPost__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpPost__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4671:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4672:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4672:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4673:1: RULE_ID
            {
             before(grammarAccess.getHttpPostAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpPost__NameAssignment_19441); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4682:1: rule__HttpPost__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpPost__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4686:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4687:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4687:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4688:1: RULE_STRING
            {
             before(grammarAccess.getHttpPostAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpPost__PathAssignment_29472); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4697:1: rule__HttpPost__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpPost__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4701:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4702:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4702:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4703:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpPostAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpPost__ParamsAssignment_49503);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4712:1: rule__HttpPost__BodyAssignment_5 : ( ruleBodyBlock ) ;
    public final void rule__HttpPost__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4716:1: ( ( ruleBodyBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4717:1: ( ruleBodyBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4717:1: ( ruleBodyBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4718:1: ruleBodyBlock
            {
             before(grammarAccess.getHttpPostAccess().getBodyBodyBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpPost__BodyAssignment_59534);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4727:1: rule__HttpPost__ResponseAssignment_6 : ( ruleResponseBlock ) ;
    public final void rule__HttpPost__ResponseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4731:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4732:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4732:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4733:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpPostAccess().getResponseResponseBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpPost__ResponseAssignment_69565);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4742:1: rule__HttpPut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpPut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4746:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4747:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4747:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4748:1: RULE_ID
            {
             before(grammarAccess.getHttpPutAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpPut__NameAssignment_19596); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4757:1: rule__HttpPut__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpPut__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4761:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4762:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4762:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4763:1: RULE_STRING
            {
             before(grammarAccess.getHttpPutAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpPut__PathAssignment_29627); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4772:1: rule__HttpPut__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpPut__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4776:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4777:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4777:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4778:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpPutAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpPut__ParamsAssignment_49658);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4787:1: rule__HttpPut__BodyAssignment_5 : ( ruleBodyBlock ) ;
    public final void rule__HttpPut__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4791:1: ( ( ruleBodyBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4792:1: ( ruleBodyBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4792:1: ( ruleBodyBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4793:1: ruleBodyBlock
            {
             before(grammarAccess.getHttpPutAccess().getBodyBodyBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpPut__BodyAssignment_59689);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4802:1: rule__HttpPut__ResponseAssignment_6 : ( ruleResponseBlock ) ;
    public final void rule__HttpPut__ResponseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4806:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4807:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4807:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4808:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpPutAccess().getResponseResponseBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpPut__ResponseAssignment_69720);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4817:1: rule__HttpGet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpGet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4821:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4822:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4822:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4823:1: RULE_ID
            {
             before(grammarAccess.getHttpGetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpGet__NameAssignment_19751); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4832:1: rule__HttpGet__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpGet__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4836:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4837:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4837:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4838:1: RULE_STRING
            {
             before(grammarAccess.getHttpGetAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpGet__PathAssignment_29782); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4847:1: rule__HttpGet__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpGet__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4851:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4852:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4852:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4853:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpGetAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpGet__ParamsAssignment_49813);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4862:1: rule__HttpGet__ResponseAssignment_5 : ( ruleResponseBlock ) ;
    public final void rule__HttpGet__ResponseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4866:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4867:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4867:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4868:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpGetAccess().getResponseResponseBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpGet__ResponseAssignment_59844);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4877:1: rule__HttpDelete__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpDelete__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4881:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4882:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4882:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4883:1: RULE_ID
            {
             before(grammarAccess.getHttpDeleteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpDelete__NameAssignment_19875); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4892:1: rule__HttpDelete__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpDelete__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4896:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4897:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4897:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4898:1: RULE_STRING
            {
             before(grammarAccess.getHttpDeleteAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpDelete__PathAssignment_29906); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4907:1: rule__HttpDelete__ParamsAssignment_4 : ( ruleParamsBlock ) ;
    public final void rule__HttpDelete__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4911:1: ( ( ruleParamsBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4912:1: ( ruleParamsBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4912:1: ( ruleParamsBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4913:1: ruleParamsBlock
            {
             before(grammarAccess.getHttpDeleteAccess().getParamsParamsBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpDelete__ParamsAssignment_49937);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4922:1: rule__HttpDelete__ResponseAssignment_5 : ( ruleResponseBlock ) ;
    public final void rule__HttpDelete__ResponseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4926:1: ( ( ruleResponseBlock ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4927:1: ( ruleResponseBlock )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4927:1: ( ruleResponseBlock )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4928:1: ruleResponseBlock
            {
             before(grammarAccess.getHttpDeleteAccess().getResponseResponseBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpDelete__ResponseAssignment_59968);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4937:1: rule__ParamsBlock__ParamsAssignment_2 : ( ruleSimpleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4941:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4942:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4942:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4943:1: ruleSimpleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_29999);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4952:1: rule__ParamsBlock__ParamsAssignment_3_1 : ( ruleSimpleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4956:1: ( ( ruleSimpleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4957:1: ( ruleSimpleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4957:1: ( ruleSimpleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4958:1: ruleSimpleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_3_110030);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4967:1: rule__BodyBlock__TypeAssignment_1 : ( ruleBlockType ) ;
    public final void rule__BodyBlock__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4971:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4972:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4972:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4973:1: ruleBlockType
            {
             before(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_110061);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4982:1: rule__ResponseBlock__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResponseBlock__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4986:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4987:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4987:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4988:1: ( RULE_ID )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4989:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:4990:1: RULE_ID
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_110096); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5001:1: rule__ResponseBlock__TypeAssignment_3 : ( ruleBlockType ) ;
    public final void rule__ResponseBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5005:1: ( ( ruleBlockType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5006:1: ( ruleBlockType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5006:1: ( ruleBlockType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5007:1: ruleBlockType
            {
             before(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_310131);
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


    // $ANTLR start "rule__IDNamedMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5016:1: rule__IDNamedMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IDNamedMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5020:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5021:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5021:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5022:1: RULE_ID
            {
             before(grammarAccess.getIDNamedMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IDNamedMember__NameAssignment_010162); 
             after(grammarAccess.getIDNamedMemberAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__NameAssignment_0"


    // $ANTLR start "rule__IDNamedMember__TypeAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5031:1: rule__IDNamedMember__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__IDNamedMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5035:1: ( ( ruleType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5036:1: ( ruleType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5036:1: ( ruleType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5037:1: ruleType
            {
             before(grammarAccess.getIDNamedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__IDNamedMember__TypeAssignment_210193);
            ruleType();

            state._fsp--;

             after(grammarAccess.getIDNamedMemberAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedMember__TypeAssignment_2"


    // $ANTLR start "rule__StringNamedMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5046:1: rule__StringNamedMember__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringNamedMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5050:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5051:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5051:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5052:1: RULE_STRING
            {
             before(grammarAccess.getStringNamedMemberAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringNamedMember__NameAssignment_010224); 
             after(grammarAccess.getStringNamedMemberAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__NameAssignment_0"


    // $ANTLR start "rule__StringNamedMember__TypeAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5061:1: rule__StringNamedMember__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__StringNamedMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5065:1: ( ( ruleType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5066:1: ( ruleType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5066:1: ( ruleType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5067:1: ruleType
            {
             before(grammarAccess.getStringNamedMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__StringNamedMember__TypeAssignment_210255);
            ruleType();

            state._fsp--;

             after(grammarAccess.getStringNamedMemberAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedMember__TypeAssignment_2"


    // $ANTLR start "rule__SkipMember__NameAssignment_1"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5076:1: rule__SkipMember__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SkipMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5080:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5081:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5081:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5082:1: RULE_STRING
            {
             before(grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SkipMember__NameAssignment_110286); 
             after(grammarAccess.getSkipMemberAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipMember__NameAssignment_1"


    // $ANTLR start "rule__SkipMember__LiteralAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5091:1: rule__SkipMember__LiteralAssignment_2 : ( ruleComplexTypeLiteral ) ;
    public final void rule__SkipMember__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5095:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5096:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5096:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5097:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_210317);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getSkipMemberAccess().getLiteralComplexTypeLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkipMember__LiteralAssignment_2"


    // $ANTLR start "rule__IDNamedSimpleMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5106:1: rule__IDNamedSimpleMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IDNamedSimpleMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5110:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5111:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5111:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5112:1: RULE_ID
            {
             before(grammarAccess.getIDNamedSimpleMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IDNamedSimpleMember__NameAssignment_010348); 
             after(grammarAccess.getIDNamedSimpleMemberAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__NameAssignment_0"


    // $ANTLR start "rule__IDNamedSimpleMember__TypeAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5121:1: rule__IDNamedSimpleMember__TypeAssignment_2 : ( ruleIntrinsicType ) ;
    public final void rule__IDNamedSimpleMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5125:1: ( ( ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5126:1: ( ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5126:1: ( ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5127:1: ruleIntrinsicType
            {
             before(grammarAccess.getIDNamedSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_rule__IDNamedSimpleMember__TypeAssignment_210379);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getIDNamedSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDNamedSimpleMember__TypeAssignment_2"


    // $ANTLR start "rule__StringNamedSimpleMember__NameAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5136:1: rule__StringNamedSimpleMember__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringNamedSimpleMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5140:1: ( ( RULE_STRING ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5141:1: ( RULE_STRING )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5141:1: ( RULE_STRING )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5142:1: RULE_STRING
            {
             before(grammarAccess.getStringNamedSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringNamedSimpleMember__NameAssignment_010410); 
             after(grammarAccess.getStringNamedSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__NameAssignment_0"


    // $ANTLR start "rule__StringNamedSimpleMember__TypeAssignment_2"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5151:1: rule__StringNamedSimpleMember__TypeAssignment_2 : ( ruleIntrinsicType ) ;
    public final void rule__StringNamedSimpleMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5155:1: ( ( ruleIntrinsicType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5156:1: ( ruleIntrinsicType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5156:1: ( ruleIntrinsicType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5157:1: ruleIntrinsicType
            {
             before(grammarAccess.getStringNamedSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_rule__StringNamedSimpleMember__TypeAssignment_210441);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getStringNamedSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringNamedSimpleMember__TypeAssignment_2"


    // $ANTLR start "rule__GenericListType__ElementTypeAssignment_0"
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5166:1: rule__GenericListType__ElementTypeAssignment_0 : ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) ;
    public final void rule__GenericListType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5170:1: ( ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5171:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5171:1: ( ( rule__GenericListType__ElementTypeAlternatives_0_0 ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5172:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            {
             before(grammarAccess.getGenericListTypeAccess().getElementTypeAlternatives_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5173:1: ( rule__GenericListType__ElementTypeAlternatives_0_0 )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5173:2: rule__GenericListType__ElementTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_010472);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5182:1: rule__GenericListType__IdAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__GenericListType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5186:1: ( ( ( '[]' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5187:1: ( ( '[]' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5187:1: ( ( '[]' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5188:1: ( '[]' )
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5189:1: ( '[]' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5190:1: '[]'
            {
             before(grammarAccess.getGenericListTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__GenericListType__IdAssignment_110510); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5205:1: rule__UserType__DeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UserType__DeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5209:1: ( ( ( RULE_ID ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5210:1: ( ( RULE_ID ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5210:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5211:1: ( RULE_ID )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5212:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5213:1: RULE_ID
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment10553); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5224:1: rule__ComplexTypeDeclaration__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__ComplexTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5228:1: ( ( ( 'entity' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5229:1: ( ( 'entity' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5229:1: ( ( 'entity' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5230:1: ( 'entity' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5231:1: ( 'entity' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5232:1: 'entity'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__ComplexTypeDeclaration__KeywordAssignment_010593); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5247:1: rule__ComplexTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__ComplexTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5251:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5252:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5252:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5253:1: ( 'generate' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5254:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5255:1: 'generate'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__ComplexTypeDeclaration__GenAssignment_110637); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5270:1: rule__ComplexTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5274:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5275:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5275:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5276:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_210676); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5285:1: rule__ComplexTypeDeclaration__LiteralAssignment_3 : ( ruleComplexTypeLiteral ) ;
    public final void rule__ComplexTypeDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5289:1: ( ( ruleComplexTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5290:1: ( ruleComplexTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5290:1: ( ruleComplexTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5291:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_310707);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5300:1: rule__EnumTypeDeclaration__KeywordAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__EnumTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5304:1: ( ( ( 'enum' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5305:1: ( ( 'enum' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5305:1: ( ( 'enum' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5306:1: ( 'enum' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5307:1: ( 'enum' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5308:1: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__EnumTypeDeclaration__KeywordAssignment_010743); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5323:1: rule__EnumTypeDeclaration__GenAssignment_1 : ( ( 'generate' ) ) ;
    public final void rule__EnumTypeDeclaration__GenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5327:1: ( ( ( 'generate' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5328:1: ( ( 'generate' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5328:1: ( ( 'generate' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5329:1: ( 'generate' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5330:1: ( 'generate' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5331:1: 'generate'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGenGenerateKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__EnumTypeDeclaration__GenAssignment_110787); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5346:1: rule__EnumTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5350:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5351:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5351:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5352:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210826); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5361:1: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 : ( ruleIntegerType ) ;
    public final void rule__EnumTypeDeclaration__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5365:1: ( ( ruleIntegerType ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5366:1: ( ruleIntegerType )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5366:1: ( ruleIntegerType )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5367:1: ruleIntegerType
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110857);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5376:1: rule__EnumTypeDeclaration__LiteralAssignment_4 : ( ruleEnumTypeLiteral ) ;
    public final void rule__EnumTypeDeclaration__LiteralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5380:1: ( ( ruleEnumTypeLiteral ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5381:1: ( ruleEnumTypeLiteral )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5381:1: ( ruleEnumTypeLiteral )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5382:1: ruleEnumTypeLiteral
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410888);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5391:1: rule__EnumTypeLiteral__MembersAssignment_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5395:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5396:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5396:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5397:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110919);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5406:1: rule__EnumTypeLiteral__MembersAssignment_2_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5410:1: ( ( ruleEnumMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5411:1: ( ruleEnumMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5411:1: ( ruleEnumMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5412:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110950);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5421:1: rule__EnumMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5425:1: ( ( RULE_ID ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5426:1: ( RULE_ID )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5426:1: ( RULE_ID )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5427:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010981); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5436:1: rule__EnumMember__AssignmentAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__EnumMember__AssignmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5440:1: ( ( ( '=' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5441:1: ( ( '=' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5441:1: ( ( '=' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5442:1: ( '=' )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5443:1: ( '=' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5444:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            match(input,31,FOLLOW_31_in_rule__EnumMember__AssignmentAssignment_1_011017); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5459:1: rule__EnumMember__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumMember__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5463:1: ( ( RULE_INT ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5464:1: ( RULE_INT )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5464:1: ( RULE_INT )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5465:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_111056); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5474:1: rule__ComplexTypeLiteral__MembersAssignment_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5478:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5479:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5479:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5480:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_111087);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5489:1: rule__ComplexTypeLiteral__MembersAssignment_2_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5493:1: ( ( ruleMember ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5494:1: ( ruleMember )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5494:1: ( ruleMember )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5495:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_111118);
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5504:1: rule__StringType__IdAssignment : ( ( 'String' ) ) ;
    public final void rule__StringType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5508:1: ( ( ( 'String' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5509:1: ( ( 'String' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5509:1: ( ( 'String' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5510:1: ( 'String' )
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5511:1: ( 'String' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5512:1: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__StringType__IdAssignment11154); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5527:1: rule__BooleanType__IdAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5531:1: ( ( ( 'boolean' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5532:1: ( ( 'boolean' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5532:1: ( ( 'boolean' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5533:1: ( 'boolean' )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5534:1: ( 'boolean' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5535:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__BooleanType__IdAssignment11198); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5550:1: rule__IntegerType__IdAssignment : ( ( 'int' ) ) ;
    public final void rule__IntegerType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5554:1: ( ( ( 'int' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5555:1: ( ( 'int' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5555:1: ( ( 'int' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5556:1: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5557:1: ( 'int' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5558:1: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__IntegerType__IdAssignment11242); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5573:1: rule__LongType__IdAssignment : ( ( 'long' ) ) ;
    public final void rule__LongType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5577:1: ( ( ( 'long' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5578:1: ( ( 'long' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5578:1: ( ( 'long' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5579:1: ( 'long' )
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5580:1: ( 'long' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5581:1: 'long'
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__LongType__IdAssignment11286); 
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
    // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5596:1: rule__DoubleType__IdAssignment : ( ( 'double' ) ) ;
    public final void rule__DoubleType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5600:1: ( ( ( 'double' ) ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5601:1: ( ( 'double' ) )
            {
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5601:1: ( ( 'double' ) )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5602:1: ( 'double' )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5603:1: ( 'double' )
            // ../com.robotoworks.mechanoid.net.ui/src-gen/com/robotoworks/mechanoid/net/ui/contentassist/antlr/internal/InternalNetModel.g:5604:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__DoubleType__IdAssignment11330); 
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


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\7\5\11\3\uffff";
    static final String DFA7_minS =
        "\1\4\6\16\3\uffff";
    static final String DFA7_maxS =
        "\1\44\6\33\3\uffff";
    static final String DFA7_acceptS =
        "\7\uffff\1\1\1\3\1\2";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\33\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\7\5\uffff\1\7\1\uffff\1\7\4\uffff\1\10",
            "\1\11\5\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "\1\11\5\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "\1\11\5\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "\1\11\5\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "\1\11\5\uffff\1\11\1\uffff\1\11\4\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1240:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleGenericListType ) );";
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
    public static final BitSet FOLLOW_rule__TypedMember__Alternatives_in_ruleTypedMember874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedMember_in_entryRuleIDNamedMember901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDNamedMember908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedMember__Group__0_in_ruleIDNamedMember934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedMember_in_entryRuleStringNamedMember961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringNamedMember968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedMember__Group__0_in_ruleStringNamedMember994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_entryRuleSkipMember1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkipMember1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0_in_ruleSkipMember1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Alternatives_in_ruleSimpleMember1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedSimpleMember_in_entryRuleIDNamedSimpleMember1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDNamedSimpleMember1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__Group__0_in_ruleIDNamedSimpleMember1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedSimpleMember_in_entryRuleStringNamedSimpleMember1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringNamedSimpleMember1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__Group__0_in_ruleStringNamedSimpleMember1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_entryRuleGenericListType1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListType1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0_in_ruleGenericListType1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__IdAssignment_in_ruleLongType2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClient_in_rule__Declaration__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPost_in_rule__HttpMethod__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpGet_in_rule__HttpMethod__Alternatives2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpPut_in_rule__HttpMethod__Alternatives2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpDelete_in_rule__HttpMethod__Alternatives2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BlockType__Alternatives2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedMember_in_rule__Member__Alternatives2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkipMember_in_rule__Member__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedMember_in_rule__TypedMember__Alternatives2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedMember_in_rule__TypedMember__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDNamedSimpleMember_in_rule__SimpleMember__Alternatives2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringNamedSimpleMember_in_rule__SimpleMember__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__Type__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListType_in_rule__Type__Alternatives2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__GenericListType__ElementTypeAlternatives_0_02684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__GenericListType__ElementTypeAlternatives_0_02701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12974 = new BitSet(new long[]{0x0000000050001000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3061 = new BitSet(new long[]{0x0000000050001002L});
    public static final BitSet FOLLOW_rule__Client__Group__0__Impl_in_rule__Client__Group__03098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Client__Group__1_in_rule__Client__Group__03101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Client__Group__0__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__1__Impl_in_rule__Client__Group__13160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Client__Group__2_in_rule__Client__Group__13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__NameAssignment_1_in_rule__Client__Group__1__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__2__Impl_in_rule__Client__Group__23220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Client__Group__3_in_rule__Client__Group__23223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__BaseUrlAssignment_2_in_rule__Client__Group__2__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__3__Impl_in_rule__Client__Group__33280 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__Client__Group__4_in_rule__Client__Group__33283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Client__Group__3__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__4__Impl_in_rule__Client__Group__43342 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__Client__Group__5_in_rule__Client__Group__43345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__ParamsAssignment_4_in_rule__Client__Group__4__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__Group__5__Impl_in_rule__Client__Group__53403 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_rule__Client__Group__6_in_rule__Client__Group__53406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Client__MethodsAssignment_5_in_rule__Client__Group__5__Impl3433 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_rule__Client__Group__6__Impl_in_rule__Client__Group__63464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Client__Group__6__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__0__Impl_in_rule__HttpPost__Group__03537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__1_in_rule__HttpPost__Group__03540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__HttpPost__Group__0__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__1__Impl_in_rule__HttpPost__Group__13599 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__2_in_rule__HttpPost__Group__13602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__NameAssignment_1_in_rule__HttpPost__Group__1__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__2__Impl_in_rule__HttpPost__Group__23659 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__3_in_rule__HttpPost__Group__23662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__PathAssignment_2_in_rule__HttpPost__Group__2__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__3__Impl_in_rule__HttpPost__Group__33720 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__4_in_rule__HttpPost__Group__33723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpPost__Group__3__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__4__Impl_in_rule__HttpPost__Group__43782 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__5_in_rule__HttpPost__Group__43785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__ParamsAssignment_4_in_rule__HttpPost__Group__4__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__5__Impl_in_rule__HttpPost__Group__53843 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__6_in_rule__HttpPost__Group__53846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__BodyAssignment_5_in_rule__HttpPost__Group__5__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__6__Impl_in_rule__HttpPost__Group__63904 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__7_in_rule__HttpPost__Group__63907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__ResponseAssignment_6_in_rule__HttpPost__Group__6__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPost__Group__7__Impl_in_rule__HttpPost__Group__73965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpPost__Group__7__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__0__Impl_in_rule__HttpPut__Group__04040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__1_in_rule__HttpPut__Group__04043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__HttpPut__Group__0__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__1__Impl_in_rule__HttpPut__Group__14102 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__2_in_rule__HttpPut__Group__14105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__NameAssignment_1_in_rule__HttpPut__Group__1__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__2__Impl_in_rule__HttpPut__Group__24162 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__3_in_rule__HttpPut__Group__24165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__PathAssignment_2_in_rule__HttpPut__Group__2__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__3__Impl_in_rule__HttpPut__Group__34223 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__4_in_rule__HttpPut__Group__34226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpPut__Group__3__Impl4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__4__Impl_in_rule__HttpPut__Group__44285 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__5_in_rule__HttpPut__Group__44288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__ParamsAssignment_4_in_rule__HttpPut__Group__4__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__5__Impl_in_rule__HttpPut__Group__54346 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__6_in_rule__HttpPut__Group__54349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__BodyAssignment_5_in_rule__HttpPut__Group__5__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__6__Impl_in_rule__HttpPut__Group__64407 = new BitSet(new long[]{0x0000000000684000L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__7_in_rule__HttpPut__Group__64410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__ResponseAssignment_6_in_rule__HttpPut__Group__6__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpPut__Group__7__Impl_in_rule__HttpPut__Group__74468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpPut__Group__7__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__0__Impl_in_rule__HttpGet__Group__04543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__1_in_rule__HttpGet__Group__04546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HttpGet__Group__0__Impl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__1__Impl_in_rule__HttpGet__Group__14605 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__2_in_rule__HttpGet__Group__14608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__NameAssignment_1_in_rule__HttpGet__Group__1__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__2__Impl_in_rule__HttpGet__Group__24665 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__3_in_rule__HttpGet__Group__24668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__PathAssignment_2_in_rule__HttpGet__Group__2__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__3__Impl_in_rule__HttpGet__Group__34726 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__4_in_rule__HttpGet__Group__34729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpGet__Group__3__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__4__Impl_in_rule__HttpGet__Group__44788 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__5_in_rule__HttpGet__Group__44791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__ParamsAssignment_4_in_rule__HttpGet__Group__4__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__5__Impl_in_rule__HttpGet__Group__54849 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__6_in_rule__HttpGet__Group__54852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__ResponseAssignment_5_in_rule__HttpGet__Group__5__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpGet__Group__6__Impl_in_rule__HttpGet__Group__64910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpGet__Group__6__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__0__Impl_in_rule__HttpDelete__Group__04983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__1_in_rule__HttpDelete__Group__04986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__HttpDelete__Group__0__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__1__Impl_in_rule__HttpDelete__Group__15045 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__2_in_rule__HttpDelete__Group__15048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__NameAssignment_1_in_rule__HttpDelete__Group__1__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__2__Impl_in_rule__HttpDelete__Group__25105 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__3_in_rule__HttpDelete__Group__25108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__PathAssignment_2_in_rule__HttpDelete__Group__2__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__3__Impl_in_rule__HttpDelete__Group__35166 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__4_in_rule__HttpDelete__Group__35169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpDelete__Group__3__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__4__Impl_in_rule__HttpDelete__Group__45228 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__5_in_rule__HttpDelete__Group__45231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__ParamsAssignment_4_in_rule__HttpDelete__Group__4__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__5__Impl_in_rule__HttpDelete__Group__55289 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__6_in_rule__HttpDelete__Group__55292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__ResponseAssignment_5_in_rule__HttpDelete__Group__5__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpDelete__Group__6__Impl_in_rule__HttpDelete__Group__65350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpDelete__Group__6__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05423 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15484 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ParamsBlock__Group__1__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25546 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5576 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5634 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05673 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ParamsBlock__Group_3__0__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05796 = new BitSet(new long[]{0x0000001F00002010L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BodyBlock__Group__0__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05919 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15980 = new BitSet(new long[]{0x0000001F00802010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ResponseBlock__Group__1__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__26042 = new BitSet(new long[]{0x0000001F00802010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__26045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ResponseBlock__Group_2__0__Impl6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedMember__Group__0__Impl_in_rule__IDNamedMember__Group__06292 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IDNamedMember__Group__1_in_rule__IDNamedMember__Group__06295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedMember__NameAssignment_0_in_rule__IDNamedMember__Group__0__Impl6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedMember__Group__1__Impl_in_rule__IDNamedMember__Group__16352 = new BitSet(new long[]{0x0000001F00000010L});
    public static final BitSet FOLLOW_rule__IDNamedMember__Group__2_in_rule__IDNamedMember__Group__16355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IDNamedMember__Group__1__Impl6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedMember__Group__2__Impl_in_rule__IDNamedMember__Group__26414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedMember__TypeAssignment_2_in_rule__IDNamedMember__Group__2__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedMember__Group__0__Impl_in_rule__StringNamedMember__Group__06477 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StringNamedMember__Group__1_in_rule__StringNamedMember__Group__06480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedMember__NameAssignment_0_in_rule__StringNamedMember__Group__0__Impl6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedMember__Group__1__Impl_in_rule__StringNamedMember__Group__16537 = new BitSet(new long[]{0x0000001F00000010L});
    public static final BitSet FOLLOW_rule__StringNamedMember__Group__2_in_rule__StringNamedMember__Group__16540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StringNamedMember__Group__1__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedMember__Group__2__Impl_in_rule__StringNamedMember__Group__26599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedMember__TypeAssignment_2_in_rule__StringNamedMember__Group__2__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__0__Impl_in_rule__SkipMember__Group__06662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1_in_rule__SkipMember__Group__06665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SkipMember__Group__0__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__1__Impl_in_rule__SkipMember__Group__16724 = new BitSet(new long[]{0x0000001F00002010L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__2_in_rule__SkipMember__Group__16727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__NameAssignment_1_in_rule__SkipMember__Group__1__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__Group__2__Impl_in_rule__SkipMember__Group__26784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SkipMember__LiteralAssignment_2_in_rule__SkipMember__Group__2__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__Group__0__Impl_in_rule__IDNamedSimpleMember__Group__06847 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__Group__1_in_rule__IDNamedSimpleMember__Group__06850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__NameAssignment_0_in_rule__IDNamedSimpleMember__Group__0__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__Group__1__Impl_in_rule__IDNamedSimpleMember__Group__16907 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__Group__2_in_rule__IDNamedSimpleMember__Group__16910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IDNamedSimpleMember__Group__1__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__Group__2__Impl_in_rule__IDNamedSimpleMember__Group__26969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDNamedSimpleMember__TypeAssignment_2_in_rule__IDNamedSimpleMember__Group__2__Impl6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__Group__0__Impl_in_rule__StringNamedSimpleMember__Group__07032 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__Group__1_in_rule__StringNamedSimpleMember__Group__07035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__NameAssignment_0_in_rule__StringNamedSimpleMember__Group__0__Impl7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__Group__1__Impl_in_rule__StringNamedSimpleMember__Group__17092 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__Group__2_in_rule__StringNamedSimpleMember__Group__17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StringNamedSimpleMember__Group__1__Impl7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__Group__2__Impl_in_rule__StringNamedSimpleMember__Group__27154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringNamedSimpleMember__TypeAssignment_2_in_rule__StringNamedSimpleMember__Group__2__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__0__Impl_in_rule__GenericListType__Group__07217 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1_in_rule__GenericListType__Group__07220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAssignment_0_in_rule__GenericListType__Group__0__Impl7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__Group__1__Impl_in_rule__GenericListType__Group__17277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__IdAssignment_1_in_rule__GenericListType__Group__1__Impl7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__07338 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__07341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__17398 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__17401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__GenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__27459 = new BitSet(new long[]{0x0000001F00002010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__27462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__37519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07585 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17645 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__GenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27706 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37766 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07895 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumTypeDeclaration__Group_3__0__Impl7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__08018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__08021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EnumTypeLiteral__Group__0__Impl8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__18080 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__18083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__28140 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__28143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl8170 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__38201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumTypeLiteral__Group__3__Impl8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__08268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__08271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumTypeLiteral__Group_2__0__Impl8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__18330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl8357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__08391 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__08394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__18451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__08513 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__08516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl8543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08634 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComplexTypeLiteral__Group__0__Impl8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18696 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28756 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8786 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComplexTypeLiteral__Group__3__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08884 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexTypeLiteral__Group_2__0__Impl8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09007 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9093 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FQN__Group_1__0__Impl9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageNameAssignment_19255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_29286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Client__NameAssignment_19317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Client__BaseUrlAssignment_29348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__Client__ParamsAssignment_49379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__Client__MethodsAssignment_59410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpPost__NameAssignment_19441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpPost__PathAssignment_29472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpPost__ParamsAssignment_49503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpPost__BodyAssignment_59534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpPost__ResponseAssignment_69565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpPut__NameAssignment_19596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpPut__PathAssignment_29627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpPut__ParamsAssignment_49658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpPut__BodyAssignment_59689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpPut__ResponseAssignment_69720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpGet__NameAssignment_19751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpGet__PathAssignment_29782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpGet__ParamsAssignment_49813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpGet__ResponseAssignment_59844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpDelete__NameAssignment_19875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpDelete__PathAssignment_29906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpDelete__ParamsAssignment_49937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpDelete__ResponseAssignment_59968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_29999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__ParamsBlock__ParamsAssignment_3_110030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_110061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_110096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_310131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IDNamedMember__NameAssignment_010162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__IDNamedMember__TypeAssignment_210193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringNamedMember__NameAssignment_010224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__StringNamedMember__TypeAssignment_210255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SkipMember__NameAssignment_110286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__SkipMember__LiteralAssignment_210317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IDNamedSimpleMember__NameAssignment_010348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__IDNamedSimpleMember__TypeAssignment_210379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringNamedSimpleMember__NameAssignment_010410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__StringNamedSimpleMember__TypeAssignment_210441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListType__ElementTypeAlternatives_0_0_in_rule__GenericListType__ElementTypeAssignment_010472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GenericListType__IdAssignment_110510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ComplexTypeDeclaration__KeywordAssignment_010593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ComplexTypeDeclaration__GenAssignment_110637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_210676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_310707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumTypeDeclaration__KeywordAssignment_010743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnumTypeDeclaration__GenAssignment_110787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumMember__AssignmentAssignment_1_011017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__ValueAssignment_1_111056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_111087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_111118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringType__IdAssignment11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BooleanType__IdAssignment11198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerType__IdAssignment11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LongType__IdAssignment11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DoubleType__IdAssignment11330 = new BitSet(new long[]{0x0000000000000002L});

}